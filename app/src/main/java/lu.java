package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.annotation.Nullable;

/* renamed from: lu  reason: default package */
public final class lu {
    public final String[] a;

    /* renamed from: lu$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public final ArrayList a = new ArrayList(20);

        public final void a(String str, String str2) {
            lu.a(str);
            lu.b(str2, str);
            b(str, str2);
        }

        public final void b(String str, String str2) {
            this.a.add(str);
            this.a.add(str2.trim());
        }

        public final void c(String str) {
            int i = 0;
            while (i < this.a.size()) {
                if (str.equalsIgnoreCase((String) this.a.get(i))) {
                    this.a.remove(i);
                    this.a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }

        public final void d(String str, String str2) {
            lu.a(str);
            lu.b(str2, str);
            c(str);
            b(str, str2);
        }
    }

    public lu(a aVar) {
        ArrayList arrayList = aVar.a;
        this.a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public lu(String[] strArr) {
        this.a = strArr;
    }

    public static void a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= ' ' || charAt >= 127) {
                throw new IllegalArgumentException(c31.j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
            }
        }
    }

    public static void b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    throw new IllegalArgumentException(c31.j("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException(ij.c("value for name ", str2, " == null"));
    }

    public static lu f(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            for (int i = 0; i < strArr2.length; i++) {
                String str = strArr2[i];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i] = str.trim();
            }
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                a(str2);
                b(str3, str2);
            }
            return new lu(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    @Nullable
    public final String c(String str) {
        String[] strArr = this.a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public final String d(int i) {
        return this.a[i * 2];
    }

    public final a e() {
        a aVar = new a();
        Collections.addAll(aVar.a, this.a);
        return aVar;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof lu) && Arrays.equals(((lu) obj).a, this.a);
    }

    public final String g(int i) {
        return this.a[(i * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.a.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(d(i));
            sb.append(": ");
            sb.append(g(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}