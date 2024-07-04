package defpackage;

/* renamed from: fv0  reason: default package */
public final class fv0 {
    public final String a;
    public final int b;

    public fv0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fv0) {
            fv0 fv0Var = (fv0) obj;
            if (this.b != fv0Var.b) {
                return false;
            }
            return this.a.equals(fv0Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}