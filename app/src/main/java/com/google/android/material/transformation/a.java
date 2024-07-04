package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;

    public a(View view) {
        this.a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.invalidate();
    }
}