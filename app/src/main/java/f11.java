package defpackage;

/* renamed from: f11  reason: default package */
public final class f11 implements Runnable {
    public final /* synthetic */ g11 P;

    public f11(g11 g11Var) {
        this.P = g11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ta1 ta1Var = this.P.f;
        nb1 nb1Var = ta1Var.b;
        bc1 bc1Var = new bc1(ta1Var);
        nb1Var.getClass();
        bc1Var.a = nb1Var;
        nb1Var.b.add(bc1Var);
        if (nb1Var.c == null) {
            nb1Var.a();
        }
    }
}