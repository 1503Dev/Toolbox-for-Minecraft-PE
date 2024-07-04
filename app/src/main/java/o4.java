package defpackage;

import android.animation.ValueAnimator;

/* renamed from: o4  reason: default package */
public final class o4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ o40 a;

    public o4(o40 o40Var) {
        this.a = o40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.h(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}