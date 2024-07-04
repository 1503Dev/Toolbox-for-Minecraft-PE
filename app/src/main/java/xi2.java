package defpackage;

/* renamed from: xi2  reason: default package */
public final /* synthetic */ class xi2 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ xi2(int i, Object obj, String str) {
        this.P = i;
        this.R = obj;
        this.Q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                ((zi2) this.R).P.P.loadUrl(this.Q);
                return;
            default:
                ((gs3) this.R).c.m(this.Q);
                return;
        }
    }
}