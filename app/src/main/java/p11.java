package defpackage;

/* renamed from: p11  reason: default package */
public final class p11 implements m11 {
    public final /* synthetic */ u11 P;
    public final /* synthetic */ l11 Q;

    public p11(u11 u11Var, l11 l11Var) {
        this.P = u11Var;
        this.Q = l11Var;
    }

    @Override // defpackage.m11
    public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
        if (u11Var.equals(this.P)) {
            return this.Q;
        }
        return null;
    }
}