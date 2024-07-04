package defpackage;

import android.widget.FrameLayout;

/* renamed from: m91  reason: default package */
public final class m91 implements zc1 {
    public final /* synthetic */ o91 a;

    public m91(o91 o91Var) {
        this.a = o91Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        if (o91.a(this.a, rc1Var)) {
            o91 o91Var = this.a;
            o91Var.getClass();
            ic1 ic1Var = rc1Var.b;
            o91Var.Q = ic1Var.l("x");
            o91Var.R = ic1Var.l("y");
            o91Var.S = ic1Var.l("width");
            o91Var.T = ic1Var.l("height");
            if (o91Var.U) {
                ga1.h().l().getClass();
                float f = (o91Var.T * he1.f()) / o91Var.getDrawable().getIntrinsicHeight();
                o91Var.T = (int) (o91Var.getDrawable().getIntrinsicHeight() * f);
                int intrinsicWidth = (int) (o91Var.getDrawable().getIntrinsicWidth() * f);
                o91Var.S = intrinsicWidth;
                o91Var.Q -= intrinsicWidth;
                o91Var.R -= o91Var.T;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o91Var.getLayoutParams();
            layoutParams.setMargins(o91Var.Q, o91Var.R, 0, 0);
            layoutParams.width = o91Var.S;
            layoutParams.height = o91Var.T;
            o91Var.setLayoutParams(layoutParams);
        }
    }
}