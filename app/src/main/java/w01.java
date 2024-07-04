package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: w01  reason: default package */
public final class w01 extends AnimatorListenerAdapter {
    public final /* synthetic */ u01 a;

    public w01(u01 u01Var) {
        this.a = u01Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.n();
        animator.removeListener(this);
    }
}