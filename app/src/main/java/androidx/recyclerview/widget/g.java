package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.d0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ k d;

    public g(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, RecyclerView.d0 d0Var) {
        this.d = kVar;
        this.a = d0Var;
        this.b = view;
        this.c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        this.d.c(this.a);
        this.d.o.remove(this.a);
        this.d.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}