package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ar5  reason: default package */
public final class ar5 extends AnimatorListenerAdapter {
    public final /* synthetic */ zs5 a;

    public ar5(zs5 zs5Var) {
        this.a = zs5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.setEnabled(true);
        this.a.P.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnabled(true);
        this.a.P.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setEnabled(false);
        this.a.P.setEnabled(false);
    }
}