package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

public final class b extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d.f c;
    public final /* synthetic */ d d;

    public b(d dVar, boolean z, a aVar) {
        this.d = dVar;
        this.b = z;
        this.c = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        d dVar = this.d;
        dVar.o = 0;
        dVar.j = null;
        if (!this.a) {
            FloatingActionButton floatingActionButton = dVar.s;
            boolean z = this.b;
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            floatingActionButton.b(i, z);
            d.f fVar = this.c;
            if (fVar != null) {
                a aVar = (a) fVar;
                aVar.a.a(aVar.b);
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.s.b(0, this.b);
        d dVar = this.d;
        dVar.o = 1;
        dVar.j = animator;
        this.a = false;
    }
}