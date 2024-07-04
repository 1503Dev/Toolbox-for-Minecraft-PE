package defpackage;

/* renamed from: zw1  reason: default package */
public final /* synthetic */ class zw1 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ zw1(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                y02 y02Var = (y02) this.Q;
                y02Var.getClass();
                jv5.A.m.a(y02Var.a);
                return;
            case 1:
                u42.b((u42) this.Q);
                return;
            default:
                ((j74) this.Q).d.c.p(oj4.d(4, null, null));
                return;
        }
    }
}