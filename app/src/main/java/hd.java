package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.a;

/* renamed from: hd  reason: default package */
public final class hd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ a a;

    public hd(a aVar) {
        this.a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}