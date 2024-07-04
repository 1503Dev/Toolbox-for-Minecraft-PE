package defpackage;

/* renamed from: v71  reason: default package */
public final class v71 implements Runnable {
    public final /* synthetic */ i20 P;
    public final /* synthetic */ yq0 Q;
    public final /* synthetic */ x71 R;

    public v71(x71 x71Var, yq0 yq0Var, yq0 yq0Var2) {
        this.R = x71Var;
        this.P = yq0Var;
        this.Q = yq0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ((e0) this.P).get();
            y20.c().a(x71.i0, String.format("Starting work for %s", this.R.T.c), new Throwable[0]);
            x71 x71Var = this.R;
            x71Var.g0 = x71Var.U.startWork();
            this.Q.l(this.R.g0);
        } catch (Throwable th) {
            this.Q.k(th);
        }
    }
}