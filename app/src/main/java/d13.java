package defpackage;

import android.view.View;

/* renamed from: d13  reason: default package */
public final class d13 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ys2 P;
    public final /* synthetic */ g13 Q;

    public d13(g13 g13Var, ys2 ys2Var) {
        this.Q = g13Var;
        this.P = ys2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.Q.e(view, this.P, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}