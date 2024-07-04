package defpackage;

/* renamed from: nh1  reason: default package */
public final /* synthetic */ class nh1 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ nh1(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 1:
                String str = (String) this.R;
                rx2 rx2Var = ((wy2) this.Q).U;
                if (rx2Var != null) {
                    ((vx2) rx2Var).c("error", "what", "ExoPlayerAdapter error", "extra", str);
                    return;
                }
                return;
            case 2:
                mn5 mn5Var = (mn5) this.R;
                try {
                    synchronized (mn5Var) {
                    }
                    mn5Var.a.c(mn5Var.c, mn5Var.d);
                    mn5Var.c(true);
                    return;
                } catch (tk5 e) {
                    lb4.b("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            default:
                synchronized (((sl5) this.R).Q) {
                    yb0<TResult> yb0Var = ((sl5) this.R).R;
                    if (yb0Var != 0) {
                        yb0Var.c((yv0) this.Q);
                    }
                }
                return;
        }
    }

    public nh1(sl5 sl5Var, yv0 yv0Var) {
        this.P = 3;
        this.R = sl5Var;
        this.Q = yv0Var;
    }
}