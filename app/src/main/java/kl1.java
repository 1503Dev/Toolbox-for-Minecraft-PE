package defpackage;

/* renamed from: kl1  reason: default package */
public final class kl1 {
    public final nl1 a;
    public final nl1 b;

    public kl1(nl1 nl1Var, nl1 nl1Var2) {
        this.a = nl1Var;
        this.b = nl1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kl1.class == obj.getClass()) {
            kl1 kl1Var = (kl1) obj;
            if (this.a.equals(kl1Var.a) && this.b.equals(kl1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String concat;
        String nl1Var = this.a.toString();
        if (this.a.equals(this.b)) {
            concat = "";
        } else {
            concat = ", ".concat(this.b.toString());
        }
        return ho.b("[", nl1Var, concat, "]");
    }
}