package defpackage;

import java.util.ArrayDeque;

/* renamed from: hj1  reason: default package */
public final /* synthetic */ class hj1 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object S;
    public final /* synthetic */ Object T;

    public /* synthetic */ hj1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
        this.S = obj3;
        this.T = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                cw2 cw2Var = (cw2) this.Q;
                xr3 xr3Var = (xr3) this.R;
                cw2Var.c(xr3Var, (ArrayDeque) this.S, "to");
                cw2Var.c(xr3Var, (ArrayDeque) this.T, "of");
                return;
            default:
                ((tv5) this.R).p(0, ((sv5) this.Q).a, (xu5) this.S, (lv5) this.T);
                return;
        }
    }
}