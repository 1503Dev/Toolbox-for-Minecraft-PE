package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import defpackage.dd;

public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ dd a;

    public c(dd ddVar) {
        this.a = ddVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dd.d revealInfo = this.a.getRevealInfo();
        revealInfo.c = Float.MAX_VALUE;
        this.a.setRevealInfo(revealInfo);
    }
}