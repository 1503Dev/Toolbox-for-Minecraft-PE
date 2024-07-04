package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;

public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ c c;
    public final /* synthetic */ f d;

    public h(f fVar, ViewGroup viewGroup, View view, c cVar) {
        this.d = fVar;
        this.a = viewGroup;
        this.b = view;
        this.c = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        this.a.endViewTransition(this.b);
        Animator h = this.c.h();
        this.c.e().b = null;
        if (h != null && this.a.indexOfChild(this.b) < 0) {
            f fVar = this.d;
            c cVar = this.c;
            c.a aVar = cVar.w0;
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.c;
            }
            fVar.V(cVar, i, 0, 0, false);
        }
    }
}