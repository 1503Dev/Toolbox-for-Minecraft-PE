package defpackage;

/* renamed from: lw4  reason: default package */
public final class lw4 {
    public static void a(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(k6.a("at index ", i2));
            }
        }
    }
}