package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: kc0  reason: default package */
public final class kc0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View P;
    public ViewTreeObserver Q;
    public final Runnable R;

    public kc0(ViewGroup viewGroup, Runnable runnable) {
        this.P = viewGroup;
        this.Q = viewGroup.getViewTreeObserver();
        this.R = runnable;
    }

    public static void a(ViewGroup viewGroup, Runnable runnable) {
        if (viewGroup == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        kc0 kc0Var = new kc0(viewGroup, runnable);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(kc0Var);
        viewGroup.addOnAttachStateChangeListener(kc0Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        if (this.Q.isAlive()) {
            viewTreeObserver = this.Q;
        } else {
            viewTreeObserver = this.P.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        this.P.removeOnAttachStateChangeListener(this);
        this.R.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.Q = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        (this.Q.isAlive() ? this.Q : this.P.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.P.removeOnAttachStateChangeListener(this);
    }
}