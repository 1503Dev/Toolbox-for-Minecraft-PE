package defpackage;

import android.os.Handler;

/* renamed from: fn1  reason: default package */
public final /* synthetic */ class fn1 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ fn1(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                da daVar = qa2.j;
                fu5 fu5Var = ew5.Q;
                ((tg0) this.Q).c(daVar, fk1.T);
                return;
            case 1:
                Handler handler = q02.b0;
                ((q02) this.Q).d();
                return;
            case 2:
                rx2 rx2Var = ((wy2) this.Q).U;
                if (rx2Var != null) {
                    vx2 vx2Var = (vx2) rx2Var;
                    vx2Var.c("pause", new String[0]);
                    vx2Var.b();
                    vx2Var.W = false;
                    return;
                }
                return;
            case 3:
                ((y03) this.Q).destroy();
                return;
            default:
                yr3 yr3Var = (yr3) this.Q;
                yr3Var.b.a.a(yr3Var.a, false);
                return;
        }
    }
}