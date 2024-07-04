package defpackage;

/* renamed from: fv1  reason: default package */
public final class fv1 implements Runnable {
    public final /* synthetic */ String P;
    public final /* synthetic */ long Q;
    public final /* synthetic */ gv1 R;

    public fv1(gv1 gv1Var, String str, long j) {
        this.R = gv1Var;
        this.P = str;
        this.Q = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.R.P.a(this.P, this.Q);
        gv1 gv1Var = this.R;
        gv1Var.P.b(gv1Var.toString());
    }
}