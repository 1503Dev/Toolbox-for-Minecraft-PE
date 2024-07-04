package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d.f b;
    public final /* synthetic */ d c;

    public c(d dVar, boolean z, a aVar) {
        this.c = dVar;
        this.a = z;
        this.b = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.c;
        dVar.o = 0;
        dVar.j = null;
        d.f fVar = this.b;
        if (fVar != null) {
            ((a) fVar).a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.c.s.b(0, this.a);
        d dVar = this.c;
        dVar.o = 2;
        dVar.j = animator;
    }
}