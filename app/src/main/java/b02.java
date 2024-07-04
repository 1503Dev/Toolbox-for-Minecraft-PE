package defpackage;

/* renamed from: b02  reason: default package */
public final /* synthetic */ class b02 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ b02(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                y02 y02Var = (y02) this.Q;
                y02Var.g = 4;
                y02Var.b();
                return;
            case 1:
                x92.a(((l02) this.Q).a);
                return;
            case 2:
                ((ul3) this.Q).m();
                return;
            case 3:
                ((ar3) this.Q).a();
                return;
            default:
                ((zv3) this.Q).a();
                return;
        }
    }
}