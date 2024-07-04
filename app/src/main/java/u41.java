package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: u41  reason: default package */
public final class u41 extends AnimatorListenerAdapter {
    public final /* synthetic */ y41 a;
    public final /* synthetic */ View b;

    public u41(y41 y41Var, View view) {
        this.a = y41Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.b(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.c();
    }
}