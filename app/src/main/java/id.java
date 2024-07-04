package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.a;

/* renamed from: id  reason: default package */
public final class id implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ a a;

    public id(a aVar) {
        this.a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.c.setScaleX(floatValue);
        this.a.c.setScaleY(floatValue);
    }
}