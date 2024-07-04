package com.google.android.material.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public int a;
    public int b;
    public int c;
    public ViewPropertyAnimator d;

    public HideBottomViewOnScrollBehavior() {
        this.a = 0;
        this.b = 2;
        this.c = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 2;
        this.c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void k(View view, int i) {
        if (i > 0) {
            if (this.b != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.b = 1;
                t(view, this.a + this.c, 175L, i4.c);
            }
        } else if (i < 0 && this.b != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.d;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.b = 2;
            t(view, 0, 225L, i4.d);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(int i) {
        return i == 2;
    }

    public final void t(View view, int i, long j, f30 f30Var) {
        this.d = view.animate().translationY(i).setInterpolator(f30Var).setDuration(j).setListener(new ru(this));
    }
}