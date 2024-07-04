package defpackage;

/* renamed from: s12  reason: default package */
public final class s12 extends c22 {
    public final boolean h;

    public s12(l02 l02Var, gx1 gx1Var, int i) {
        super(l02Var, "Bh5pClYU50tw4hiHvABH1pMF0C7RYCQSvKvFr+ZMSOJwQxEU/7HcV4ByjdhbUI8z", "nFFCV0RNg4jne34kh3cuJ7Rctyd77rnT1UYT4k6WJUQ=", gx1Var, i, 61);
        this.h = l02Var.q.a;
    }

    @Override // defpackage.c22
    public final void b() {
        long longValue = ((Long) this.e.invoke(null, this.a.a, Boolean.valueOf(this.h))).longValue();
        synchronized (this.d) {
            gx1 gx1Var = this.d;
            gx1Var.j();
            ey1.T((ey1) gx1Var.Q, longValue);
        }
    }
}