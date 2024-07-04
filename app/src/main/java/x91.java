package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import defpackage.v91;

/* renamed from: x91  reason: default package */
public final class x91 implements Runnable {
    public final /* synthetic */ Context P;
    public final /* synthetic */ v91 Q;

    public x91(v91 v91Var, Context context) {
        this.Q = v91Var;
        this.P = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Q.A0 = new v91.b(this.P);
        float f = this.Q.P;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (f * 4.0f), (int) (f * 4.0f));
        v91 v91Var = this.Q;
        layoutParams.setMargins(0, v91Var.x0.a0 - ((int) (v91Var.P * 4.0f)), 0, 0);
        layoutParams.gravity = 0;
        v91 v91Var2 = this.Q;
        v91Var2.x0.addView(v91Var2.A0, layoutParams);
    }
}