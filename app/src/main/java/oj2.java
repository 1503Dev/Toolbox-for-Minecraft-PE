package defpackage;

/* renamed from: oj2  reason: default package */
public final /* synthetic */ class oj2 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ oj2(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                ui2 ui2Var = (ui2) this.R;
                ui2Var.n("/result", lg2.j);
                ui2Var.d();
                return;
            default:
                ((wv2) this.Q).m((String) this.R);
                return;
        }
    }
}