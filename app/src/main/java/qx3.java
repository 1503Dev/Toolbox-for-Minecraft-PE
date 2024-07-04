package defpackage;

/* renamed from: qx3  reason: default package */
public final /* synthetic */ class qx3 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ qx3(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                tv2.x(((fy4) ((z63) this.Q).Q).g(), "persistFlags");
                return;
            default:
                ((dh4) this.Q).T.e.k();
                return;
        }
    }
}