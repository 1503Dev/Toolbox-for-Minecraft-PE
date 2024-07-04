package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.b;

/* renamed from: bn  reason: default package */
public final class bn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ b a;

    public bn(b bVar) {
        this.a = bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}