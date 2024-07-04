package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: ow2  reason: default package */
public final /* synthetic */ class ow2 implements Runnable {
    public final /* synthetic */ int P;
    public final Object Q;
    public final Object R;

    public /* synthetic */ ow2(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wy4 wy4Var;
        Throwable e;
        switch (this.P) {
            case 0:
                h9 h9Var = (h9) this.Q;
                try {
                    h9Var.P.b(((d3) this.R).a);
                    return;
                } catch (IllegalStateException e2) {
                    ip2.a(h9Var.getContext()).d("BaseAdView.loadAd", e2);
                    return;
                }
            case 1:
                jt3 jt3Var = (jt3) this.Q;
                jt3Var.i.execute(new qh1(jt3Var, (bx2) this.R, 5));
                return;
            case 2:
                ((sf4) this.Q).T.d.p((tz3) this.R);
                return;
            default:
                Future future = (Future) this.Q;
                if (!(future instanceof tz4) || (e = ((tz4) future).c()) == null) {
                    try {
                        ((wy4) this.R).f(zw4.H((Future) this.Q));
                        return;
                    } catch (Error e3) {
                        e = e3;
                    } catch (RuntimeException e4) {
                        e = e4;
                    } catch (ExecutionException e5) {
                        wy4Var = (wy4) this.R;
                        e = e5.getCause();
                    }
                }
                wy4Var = (wy4) this.R;
                wy4Var.h(e);
                return;
        }
    }

    public final String toString() {
        switch (this.P) {
            case 3:
                ct4 ct4Var = new ct4(ow2.class.getSimpleName());
                bt4 bt4Var = new bt4();
                ct4Var.c.b = bt4Var;
                ct4Var.c = bt4Var;
                bt4Var.a = (wy4) this.R;
                return ct4Var.toString();
            default:
                return super.toString();
        }
    }
}