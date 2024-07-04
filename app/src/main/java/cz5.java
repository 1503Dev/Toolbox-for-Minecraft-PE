package defpackage;

/* renamed from: cz5  reason: default package */
public final class cz5 {
    public final int a;
    public final int b;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public cz5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cz5) {
            cz5 cz5Var = (cz5) obj;
            cz5Var.getClass();
            return this.a == cz5Var.a && this.b == cz5Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a + 16337) * 31) + this.b;
    }
}