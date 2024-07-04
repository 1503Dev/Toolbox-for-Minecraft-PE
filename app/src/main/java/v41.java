package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import defpackage.k61;

/* renamed from: v41  reason: default package */
public final class v41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ z41 a;
    public final /* synthetic */ View b;

    public v41(k61.c cVar, View view) {
        this.a = cVar;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) k61.this.d.getParent()).invalidate();
    }
}