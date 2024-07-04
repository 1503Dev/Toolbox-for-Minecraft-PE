package defpackage;

/* renamed from: ai4  reason: default package */
public final class ai4 {
    public static final ai4 c = new ai4(-1, -1);
    public final int a;
    public final int b;

    static {
        new ai4(0, 0);
    }

    public ai4(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        tv2.G(z);
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ai4) {
            ai4 ai4Var = (ai4) obj;
            if (this.a == ai4Var.a && this.b == ai4Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = this.a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        return i + "x" + i2;
    }
}