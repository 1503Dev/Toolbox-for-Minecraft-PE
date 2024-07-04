package defpackage;

import javax.annotation.CheckForNull;

/* renamed from: gt4  reason: default package */
public final class gt4 {
    public static void a(int i, int i2) {
        String a;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException(k6.a("negative size: ", i2));
            }
            a = pt4.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            a = pt4.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(a);
    }

    public static void b(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(h(i, i2, "index"));
        }
    }

    public static void c(@CheckForNull Object obj, @CheckForNull String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void d(@CheckForNull dz4 dz4Var, String str, @CheckForNull Object obj) {
        if (dz4Var == null) {
            throw new NullPointerException(pt4.a(str, obj));
        }
    }

    public static void e(@CheckForNull String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void f(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? h(i, i3, "start index") : (i2 < 0 || i2 > i3) ? h(i2, i3, "end index") : pt4.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void g(@CheckForNull String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static String h(int i, int i2, String str) {
        if (i < 0) {
            return pt4.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return pt4.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(k6.a("negative size: ", i2));
    }
}