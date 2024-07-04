package defpackage;

import android.widget.FrameLayout;

/* renamed from: ve1  reason: default package */
public final class ve1 implements zc1 {
    public final /* synthetic */ gf1 a;

    public ve1(gf1 gf1Var) {
        this.a = gf1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        if (this.a.b(rc1Var)) {
            gf1 gf1Var = this.a;
            gf1Var.getClass();
            ic1 ic1Var = rc1Var.b;
            gf1Var.Q = ic1Var.l("x");
            gf1Var.R = ic1Var.l("y");
            gf1Var.S = ic1Var.l("width");
            gf1Var.T = ic1Var.l("height");
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gf1Var.getLayoutParams();
            layoutParams.setMargins(gf1Var.Q, gf1Var.R, 0, 0);
            layoutParams.width = gf1Var.S;
            layoutParams.height = gf1Var.T;
            gf1Var.setLayoutParams(layoutParams);
        }
    }
}