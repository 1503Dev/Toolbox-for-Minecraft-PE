package defpackage;

import android.view.View;

/* renamed from: j43  reason: default package */
public final class j43 implements ti4 {
    public Object P;
    public Object Q;
    public Object R;
    public Object S;
    public Object T;

    public /* synthetic */ j43(x54 x54Var, bx2 bx2Var, hi4 hi4Var, yh4 yh4Var, wk1 wk1Var) {
        this.T = x54Var;
        this.P = bx2Var;
        this.Q = hi4Var;
        this.R = yh4Var;
        this.S = wk1Var;
    }

    @Override // defpackage.ti4
    public final void c() {
    }

    @Override // defpackage.ti4
    public final void d() {
    }

    @Override // defpackage.ti4
    public final void g(View view) {
        bx2 bx2Var = (bx2) this.P;
        c64 c64Var = ((x54) this.T).d;
        wk1 wk1Var = (wk1) this.S;
        c64Var.getClass();
        o43 c = c64Var.a.c(new ts1((hi4) this.Q, (yh4) this.R, null), new b64());
        wr1 wr1Var = new wr1(c);
        synchronized (wk1Var) {
            wk1Var.P = wr1Var;
        }
        bx2Var.a(c.p());
    }
}