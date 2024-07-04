package defpackage;

import java.util.Arrays;

/* renamed from: dk3  reason: default package */
public final class dk3 {
    public final qe3 a;
    public final int[] b;
    public final boolean[] c;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public dk3(qe3 qe3Var, int[] iArr, boolean[] zArr) {
        this.a = qe3Var;
        this.b = (int[]) iArr.clone();
        this.c = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dk3.class == obj.getClass()) {
            dk3 dk3Var = (dk3) obj;
            if (this.a.equals(dk3Var.a) && Arrays.equals(this.b, dk3Var.b) && Arrays.equals(this.c, dk3Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 961) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }
}