package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* renamed from: qa  reason: default package */
public final class qa extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ ActionMenuView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ BottomAppBar e;

    public qa(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.e = bottomAppBar;
        this.b = actionMenuView;
        this.c = i;
        this.d = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            BottomAppBar bottomAppBar = this.e;
            ActionMenuView actionMenuView = this.b;
            actionMenuView.setTranslationX(bottomAppBar.r(actionMenuView, this.c, this.d));
        }
    }
}