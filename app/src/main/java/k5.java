package defpackage;

import android.view.View;

/* renamed from: k5  reason: default package */
public final class k5 extends vx {
    public final /* synthetic */ f5 h;

    public k5(f5 f5Var) {
        this.h = f5Var;
    }

    @Override // defpackage.y41
    public final void a() {
        this.h.d0.setAlpha(1.0f);
        this.h.g0.d(null);
        this.h.g0 = null;
    }

    @Override // defpackage.vx, defpackage.y41
    public final void c() {
        this.h.d0.setVisibility(0);
        this.h.d0.sendAccessibilityEvent(32);
        if (this.h.d0.getParent() instanceof View) {
            a41.m((View) this.h.d0.getParent());
        }
    }
}