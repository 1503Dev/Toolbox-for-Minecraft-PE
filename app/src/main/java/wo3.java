package defpackage;

/* renamed from: wo3  reason: default package */
public final class wo3 {
    public static final wo3 e = new wo3(1.0f, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public wo3(float f, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wo3) {
            wo3 wo3Var = (wo3) obj;
            if (this.a == wo3Var.a && this.b == wo3Var.b && this.c == wo3Var.c && this.d == wo3Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a + 217) * 31) + this.b) * 31) + this.c) * 31) + Float.floatToRawIntBits(this.d);
    }
}