package defpackage;

/* renamed from: mk  reason: default package */
public final class mk implements Runnable {
    public final /* synthetic */ l71 P;
    public final /* synthetic */ nk Q;

    public mk(nk nkVar, l71 l71Var) {
        this.Q = nkVar;
        this.P = l71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y20.c().a(nk.d, String.format("Scheduling work %s", this.P.a), new Throwable[0]);
        this.Q.a.d(this.P);
    }
}