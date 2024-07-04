package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.b;

/* renamed from: an  reason: default package */
public final class an extends AnimatorListenerAdapter {
    public final /* synthetic */ b a;

    public an(b bVar) {
        this.a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b bVar = this.a;
        bVar.c.setChecked(bVar.h);
        this.a.n.start();
    }
}