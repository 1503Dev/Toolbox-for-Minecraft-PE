package defpackage;

import android.content.Context;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: i60  reason: default package */
public final class i60 {
    public static i60 b;
    public final a a;

    /* renamed from: i60$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        @wq0("supported_versions")
        public List<b> a;
        @wq0("last_supported")
        public String b;
    }

    /* renamed from: i60$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        @wq0("version_name")
        public String a;
        @wq0("native_lib")
        public String b;
        @wq0("64_bit")
        public boolean c;
    }

    public i60(Context context) {
        xt xtVar = new xt();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getResources().openRawResource(2131689472));
            this.a = (a) xtVar.d(inputStreamReader, a.class);
            inputStreamReader.close();
        } catch (IOException e) {
            throw new RuntimeException("Cannot read support info", e);
        }
    }

    public static i60 a(Context context) {
        if (b == null) {
            b = new i60(context);
        }
        return b;
    }

    public static int[] d(String str) {
        String[] split = str.split("\\.");
        int[] iArr = new int[4];
        if (split.length == 4) {
            for (int i = 0; i < 4; i++) {
                iArr[i] = Integer.parseInt(split[i]);
            }
            return iArr;
        }
        StringBuilder b2 = e5.b("");
        b2.append(split.length);
        throw new IllegalArgumentException(b2.toString());
    }

    public final String b() {
        String[] strArr;
        StringBuilder sb = new StringBuilder();
        int size = this.a.a.size();
        String[] strArr2 = new String[size];
        HashSet hashSet = new HashSet();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (!hashSet.contains(this.a.a.get(i2).a)) {
                String str = this.a.a.get(i2).a;
                strArr2[i] = str;
                hashSet.add(str);
                i++;
            }
        }
        for (String str2 : (String[]) Arrays.copyOfRange(strArr2, 0, i)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    public final boolean c(String str, boolean z) {
        for (b bVar : this.a.a) {
            if (str.equals(bVar.a) && bVar.c == z) {
                return true;
            }
        }
        return false;
    }
}