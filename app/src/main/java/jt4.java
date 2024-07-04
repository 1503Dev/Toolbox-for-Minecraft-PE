package defpackage;

import javax.annotation.CheckForNull;

/* renamed from: jt4  reason: default package */
public final class jt4 extends et4 {
    public final Object P;

    public jt4(Object obj) {
        this.P = obj;
    }

    @Override // defpackage.et4
    public final et4 a(at4 at4Var) {
        Object apply = at4Var.apply(this.P);
        gt4.c(apply, "the Function passed to Optional.transform() must not return null.");
        return new jt4(apply);
    }

    @Override // defpackage.et4
    public final Object b() {
        return this.P;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof jt4) {
            return this.P.equals(((jt4) obj).P);
        }
        return false;
    }

    public final int hashCode() {
        return this.P.hashCode() + 1502476572;
    }

    public final String toString() {
        return ij.c("Optional.of(", this.P.toString(), ")");
    }
}