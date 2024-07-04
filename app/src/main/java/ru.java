package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* renamed from: ru  reason: default package */
public final class ru extends AnimatorListenerAdapter {
    public final /* synthetic */ HideBottomViewOnScrollBehavior a;

    public ru(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.a = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.d = null;
    }
}