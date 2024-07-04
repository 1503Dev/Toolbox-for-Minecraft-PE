package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: zc  reason: default package */
public final class zc extends AnimatorListenerAdapter {
    public final /* synthetic */ dd a;

    public zc(dd ddVar) {
        this.a = ddVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.b();
    }
}