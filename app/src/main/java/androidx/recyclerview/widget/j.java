package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

public final class j extends AnimatorListenerAdapter {
    public final /* synthetic */ k.a a;
    public final /* synthetic */ ViewPropertyAnimator b;
    public final /* synthetic */ View c;
    public final /* synthetic */ k d;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = kVar;
        this.a = aVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.c(this.a.b);
        this.d.r.remove(this.a.b);
        this.d.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        k kVar = this.d;
        RecyclerView.d0 d0Var = this.a.b;
        kVar.getClass();
    }
}