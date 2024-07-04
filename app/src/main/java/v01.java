package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: v01  reason: default package */
public final class v01 extends AnimatorListenerAdapter {
    public final /* synthetic */ e7 a;
    public final /* synthetic */ u01 b;

    public v01(u01 u01Var, e7 e7Var) {
        this.b = u01Var;
        this.a = e7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.b0.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.b0.add(animator);
    }
}