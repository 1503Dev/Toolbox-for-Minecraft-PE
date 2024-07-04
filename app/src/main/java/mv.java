package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: mv  reason: default package */
public final class mv {
    static {
        fb.h("\"\\");
        fb.h("\t ,=");
    }

    public static long a(nl0 nl0Var) {
        String c = nl0Var.U.c("Content-Length");
        if (c != null) {
            try {
                return Long.parseLong(c);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    public static boolean b(nl0 nl0Var) {
        if (nl0Var.P.b.equals("HEAD")) {
            return false;
        }
        int i = nl0Var.R;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && a(nl0Var) == -1 && !"chunked".equalsIgnoreCase(nl0Var.d("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public static int c(int i, String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ea, code lost:
        if (r9 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x021d, code lost:
        if (r11 != false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x022c, code lost:
        if (r11 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x022e, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x033c, code lost:
        if (r0 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010d, code lost:
        if (r19 <= 0) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0391 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(rg rgVar, pv pvVar, lu luVar) {
        List emptyList;
        List emptyList2;
        pv pvVar2;
        long j;
        boolean z;
        List list;
        String str;
        String str2;
        qg qgVar;
        int i;
        String str3;
        String str4;
        String str5;
        String[] strArr;
        String[] strArr2;
        int i2;
        String sb;
        String str6;
        if (rgVar == rg.a) {
            return;
        }
        Pattern pattern = qg.j;
        int length = luVar.a.length / 2;
        int i3 = 0;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < length; i4++) {
            if ("Set-Cookie".equalsIgnoreCase(luVar.d(i4))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(luVar.g(i4));
            }
        }
        if (arrayList != null) {
            emptyList = Collections.unmodifiableList(arrayList);
        } else {
            emptyList = Collections.emptyList();
        }
        List list2 = emptyList;
        int size = list2.size();
        int i5 = 0;
        ArrayList arrayList2 = null;
        while (i5 < size) {
            String str7 = (String) list2.get(i5);
            long currentTimeMillis = System.currentTimeMillis();
            int length2 = str7.length();
            int h = c31.h(str7, i3, length2, ';');
            int h2 = c31.h(str7, i3, h, '=');
            if (h2 != h) {
                String v = c31.v(i3, h2, str7);
                if (!v.isEmpty()) {
                    int length3 = v.length();
                    while (true) {
                        if (i3 < length3) {
                            char charAt = v.charAt(i3);
                            if (charAt <= 31 || charAt >= 127) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 == -1) {
                        String v2 = c31.v(h2 + 1, h, str7);
                        int length4 = v2.length();
                        int i6 = 0;
                        while (true) {
                            if (i6 < length4) {
                                char charAt2 = v2.charAt(i6);
                                if (charAt2 <= 31 || charAt2 >= 127) {
                                    break;
                                }
                                i6++;
                            } else {
                                i6 = -1;
                                break;
                            }
                        }
                        if (i6 == -1) {
                            int i7 = h + 1;
                            long j2 = 253402300799999L;
                            String str8 = null;
                            long j3 = -1;
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = true;
                            boolean z5 = false;
                            String str9 = null;
                            while (true) {
                                long j4 = RecyclerView.FOREVER_NS;
                                if (i7 < length2) {
                                    int h3 = c31.h(str7, i7, length2, ';');
                                    int h4 = c31.h(str7, i7, h3, '=');
                                    String v3 = c31.v(i7, h4, str7);
                                    if (h4 < h3) {
                                        str6 = c31.v(h4 + 1, h3, str7);
                                    } else {
                                        str6 = "";
                                    }
                                    if (v3.equalsIgnoreCase("expires")) {
                                        try {
                                            j2 = qg.b(str6.length(), str6);
                                            z5 = true;
                                        } catch (NumberFormatException | IllegalArgumentException unused) {
                                        }
                                        i7 = h3 + 1;
                                    } else if (v3.equalsIgnoreCase("max-age")) {
                                        try {
                                            j3 = Long.parseLong(str6);
                                        } catch (NumberFormatException e) {
                                            if (str6.matches("-?\\d+")) {
                                                if (!str6.startsWith("-")) {
                                                    j3 = Long.MAX_VALUE;
                                                }
                                                j3 = Long.MIN_VALUE;
                                            } else {
                                                throw e;
                                            }
                                        }
                                    } else {
                                        if (v3.equalsIgnoreCase("domain")) {
                                            if (!str6.endsWith(".")) {
                                                if (str6.startsWith(".")) {
                                                    str6 = str6.substring(1);
                                                }
                                                String b = c31.b(str6);
                                                if (b != null) {
                                                    str8 = b;
                                                    z4 = false;
                                                } else {
                                                    throw new IllegalArgumentException();
                                                }
                                            } else {
                                                throw new IllegalArgumentException();
                                            }
                                        } else if (v3.equalsIgnoreCase("path")) {
                                            str9 = str6;
                                        } else if (v3.equalsIgnoreCase("secure")) {
                                            z2 = true;
                                        } else if (v3.equalsIgnoreCase("httponly")) {
                                            z3 = true;
                                        }
                                        i7 = h3 + 1;
                                    }
                                } else {
                                    if (j3 == Long.MIN_VALUE) {
                                        pvVar2 = pvVar;
                                        j = Long.MIN_VALUE;
                                    } else if (j3 != -1) {
                                        if (j3 <= 9223372036854775L) {
                                            j4 = j3 * 1000;
                                        }
                                        long j5 = currentTimeMillis + j4;
                                        if (j5 >= currentTimeMillis && j5 <= 253402300799999L) {
                                            pvVar2 = pvVar;
                                            j = j5;
                                        } else {
                                            pvVar2 = pvVar;
                                            j = 253402300799999L;
                                        }
                                    } else {
                                        pvVar2 = pvVar;
                                        j = j2;
                                    }
                                    String str10 = pvVar2.d;
                                    if (str8 == null) {
                                        str8 = str10;
                                    } else if (str10.equals(str8) || (str10.endsWith(str8) && str10.charAt((str10.length() - str8.length()) - 1) == '.' && !c31.k.matcher(str10).matches())) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (str10.length() != str8.length()) {
                                        PublicSuffixDatabase publicSuffixDatabase = PublicSuffixDatabase.h;
                                        publicSuffixDatabase.getClass();
                                        String[] split = IDN.toUnicode(str8).split("\\.");
                                        if (!publicSuffixDatabase.a.get() && publicSuffixDatabase.a.compareAndSet(false, true)) {
                                            boolean z6 = false;
                                            while (true) {
                                                try {
                                                    try {
                                                        try {
                                                            publicSuffixDatabase.b();
                                                            break;
                                                        } catch (Throwable th) {
                                                            if (z6) {
                                                                Thread.currentThread().interrupt();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (InterruptedIOException unused2) {
                                                        Thread.interrupted();
                                                        z6 = true;
                                                    }
                                                } catch (IOException e2) {
                                                    ne0.a.m(5, "Failed to read public suffix list", e2);
                                                }
                                            }
                                        } else {
                                            try {
                                                publicSuffixDatabase.b.await();
                                            } catch (InterruptedException unused3) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                        synchronized (publicSuffixDatabase) {
                                            if (publicSuffixDatabase.c == null) {
                                                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
                                            }
                                        }
                                        int length5 = split.length;
                                        byte[][] bArr = new byte[length5];
                                        for (int i8 = 0; i8 < split.length; i8++) {
                                            bArr[i8] = split[i8].getBytes(StandardCharsets.UTF_8);
                                        }
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 < length5) {
                                                str3 = PublicSuffixDatabase.a(publicSuffixDatabase.c, bArr, i9);
                                                if (str3 != null) {
                                                    i = 1;
                                                    break;
                                                }
                                                i9++;
                                            } else {
                                                i = 1;
                                                str3 = null;
                                                break;
                                            }
                                        }
                                        if (length5 > i) {
                                            byte[][] bArr2 = (byte[][]) bArr.clone();
                                            list = list2;
                                            int i10 = 0;
                                            while (i10 < bArr2.length - i) {
                                                bArr2[i10] = PublicSuffixDatabase.e;
                                                str4 = PublicSuffixDatabase.a(publicSuffixDatabase.c, bArr2, i10);
                                                if (str4 != null) {
                                                    break;
                                                }
                                                i10++;
                                                i = 1;
                                            }
                                        } else {
                                            list = list2;
                                        }
                                        str4 = null;
                                        if (str4 != null) {
                                            for (int i11 = 0; i11 < length5 - 1; i11++) {
                                                str5 = PublicSuffixDatabase.a(publicSuffixDatabase.d, bArr, i11);
                                                if (str5 != null) {
                                                    break;
                                                }
                                            }
                                        }
                                        str5 = null;
                                        if (str5 != null) {
                                            strArr = ("!" + str5).split("\\.");
                                        } else if (str3 == null && str4 == null) {
                                            strArr = PublicSuffixDatabase.g;
                                        } else {
                                            if (str3 != null) {
                                                strArr = str3.split("\\.");
                                            } else {
                                                strArr = PublicSuffixDatabase.f;
                                            }
                                            if (str4 != null) {
                                                strArr2 = str4.split("\\.");
                                            } else {
                                                strArr2 = PublicSuffixDatabase.f;
                                            }
                                            if (strArr.length <= strArr2.length) {
                                                strArr = strArr2;
                                            }
                                        }
                                        if (split.length == strArr.length) {
                                            i2 = 0;
                                            if (strArr[0].charAt(0) != '!') {
                                                sb = null;
                                            }
                                        } else {
                                            i2 = 0;
                                        }
                                        char charAt3 = strArr[i2].charAt(i2);
                                        int length6 = split.length;
                                        int length7 = strArr.length;
                                        if (charAt3 != '!') {
                                            length7++;
                                        }
                                        StringBuilder sb2 = new StringBuilder();
                                        String[] split2 = str8.split("\\.");
                                        for (int i12 = length6 - length7; i12 < split2.length; i12++) {
                                            sb2.append(split2[i12]);
                                            sb2.append('.');
                                        }
                                        sb2.deleteCharAt(sb2.length() - 1);
                                        sb = sb2.toString();
                                    } else {
                                        list = list2;
                                    }
                                    String str11 = str9;
                                    if (str11 != null && str11.startsWith("/")) {
                                        str2 = str11;
                                    } else {
                                        String f = pvVar.f();
                                        int lastIndexOf = f.lastIndexOf(47);
                                        if (lastIndexOf != 0) {
                                            str = f.substring(0, lastIndexOf);
                                        } else {
                                            str = "/";
                                        }
                                        str2 = str;
                                    }
                                    qgVar = new qg(v, v2, j, str8, str2, z2, z3, z4, z5);
                                }
                            }
                            if (qgVar != null) {
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(qgVar);
                            }
                            i5++;
                            i3 = 0;
                            list2 = list;
                        }
                    }
                }
            }
            list = list2;
            qgVar = null;
            if (qgVar != null) {
            }
            i5++;
            i3 = 0;
            list2 = list;
        }
        if (arrayList2 != null) {
            emptyList2 = Collections.unmodifiableList(arrayList2);
        } else {
            emptyList2 = Collections.emptyList();
        }
        if (emptyList2.isEmpty()) {
            return;
        }
        rgVar.getClass();
    }

    public static int e(String str, String str2, int i) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }
}