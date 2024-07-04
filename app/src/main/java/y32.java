package defpackage;

import android.util.Base64OutputStream;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: y32  reason: default package */
public final class y32 {
    public final w32 a;
    public final int b;
    public final int c;

    public y32(int i, int i2, int i3) {
        this.b = i;
        i2 = (i2 > 64 || i2 < 0) ? 64 : 64;
        if (i3 <= 0) {
            this.c = 1;
        } else {
            this.c = i3;
        }
        this.a = new w32(i2);
    }

    public final String a(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        Collections.sort(arrayList2, new x32());
        HashSet hashSet = new HashSet();
        loop0: for (int i = 0; i < arrayList2.size(); i++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((k32) arrayList2.get(i)).e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str2 : split) {
                    if (str2.contains("'")) {
                        StringBuilder sb = new StringBuilder(str2);
                        int i2 = 1;
                        boolean z = false;
                        while (true) {
                            int i3 = i2 + 2;
                            if (i3 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i2) == '\'') {
                                if (sb.charAt(i2 - 1) != ' ') {
                                    int i4 = i2 + 1;
                                    if ((sb.charAt(i4) == 's' || sb.charAt(i4) == 'S') && (i3 == sb.length() || sb.charAt(i3) == ' ')) {
                                        sb.insert(i2, ' ');
                                        i2 = i3;
                                        z = true;
                                    }
                                }
                                sb.setCharAt(i2, ' ');
                                z = true;
                            }
                            i2++;
                        }
                        if (z) {
                            str = sb.toString();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            str2 = str;
                        }
                    }
                    String[] b = o32.b(str2, true);
                    if (b.length >= this.c) {
                        for (int i5 = 0; i5 < b.length; i5++) {
                            String str3 = "";
                            for (int i6 = 0; i6 < this.c; i6++) {
                                int i7 = i5 + i6;
                                if (i7 >= b.length) {
                                    break;
                                }
                                if (i6 > 0) {
                                    str3 = str3.concat(" ");
                                }
                                str3 = str3.concat(String.valueOf(b[i7]));
                            }
                            hashSet.add(str3);
                            if (hashSet.size() >= this.b) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.b) {
                            break loop0;
                        }
                    }
                }
                continue;
            }
        }
        m32 m32Var = new m32();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                ((Base64OutputStream) m32Var.R).write(this.a.b((String) it.next()));
            } catch (IOException e) {
                sv2.e("Error while writing hash to byteStream", e);
            }
        }
        return m32Var.toString();
    }
}