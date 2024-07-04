package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* renamed from: na  reason: default package */
public final class na extends AnimatorListenerAdapter {
    public final /* synthetic */ BottomAppBar a;

    public na(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.getClass();
    }
}