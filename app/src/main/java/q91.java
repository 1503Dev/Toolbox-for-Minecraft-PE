package defpackage;

import android.widget.FrameLayout;

/* renamed from: q91  reason: default package */
public final class q91 implements zc1 {
    public final /* synthetic */ v91 a;

    public q91(v91 v91Var) {
        this.a = v91Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        if (v91.a(this.a, rc1Var)) {
            v91 v91Var = this.a;
            v91Var.getClass();
            ic1 ic1Var = rc1Var.b;
            v91Var.a0 = ic1Var.l("x");
            v91Var.b0 = ic1Var.l("y");
            v91Var.c0 = ic1Var.l("width");
            v91Var.d0 = ic1Var.l("height");
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v91Var.getLayoutParams();
            layoutParams.setMargins(v91Var.a0, v91Var.b0, 0, 0);
            layoutParams.width = v91Var.c0;
            layoutParams.height = v91Var.d0;
            v91Var.setLayoutParams(layoutParams);
            if (v91Var.r0 && v91Var.A0 != null) {
                int i = (int) (v91Var.P * 4.0f);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
                layoutParams2.setMargins(0, v91Var.x0.a0 - ((int) (v91Var.P * 4.0f)), 0, 0);
                layoutParams2.gravity = 0;
                v91Var.A0.setLayoutParams(layoutParams2);
            }
        }
    }
}