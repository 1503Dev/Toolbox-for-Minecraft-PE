package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

public final class b extends AnimatorListenerAdapter {
    public final /* synthetic */ dd a;
    public final /* synthetic */ Drawable b;

    public b(dd ddVar, Drawable drawable) {
        this.a = ddVar;
        this.b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setCircularRevealOverlayDrawable(this.b);
    }
}