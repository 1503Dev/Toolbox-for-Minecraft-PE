package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;

/* renamed from: pr  reason: default package */
public final class pr extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ c c;

    public pr(ViewGroup viewGroup, View view, c cVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        animator.removeListener(this);
        c cVar = this.c;
        View view = cVar.s0;
        if (view == null || !cVar.m0) {
            return;
        }
        view.setVisibility(8);
    }
}