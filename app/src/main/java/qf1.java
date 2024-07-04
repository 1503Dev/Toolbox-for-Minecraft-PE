package defpackage;

import android.widget.FrameLayout;

/* renamed from: qf1  reason: default package */
public final class qf1 implements zc1 {
    public final /* synthetic */ yf1 a;

    public qf1(yf1 yf1Var) {
        this.a = yf1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        if (this.a.b(rc1Var)) {
            yf1 yf1Var = this.a;
            yf1Var.getClass();
            ic1 ic1Var = rc1Var.b;
            yf1Var.Q = ic1Var.l("x");
            yf1Var.R = ic1Var.l("y");
            yf1Var.S = ic1Var.l("width");
            yf1Var.T = ic1Var.l("height");
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yf1Var.getLayoutParams();
            layoutParams.setMargins(yf1Var.Q, yf1Var.R, 0, 0);
            layoutParams.width = yf1Var.S;
            layoutParams.height = yf1Var.T;
            yf1Var.setLayoutParams(layoutParams);
        }
    }
}