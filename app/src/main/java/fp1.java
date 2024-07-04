package defpackage;

/* renamed from: fp1  reason: default package */
public final /* synthetic */ class fp1 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ fp1(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                y02 y02Var = (y02) this.Q;
                y02Var.c(y02Var.a);
                return;
            case 1:
                ((sx2) this.Q).y();
                return;
            case 2:
                ((y03) this.Q).destroy();
                return;
            default:
                ((uq3) this.Q).b();
                return;
        }
    }
}