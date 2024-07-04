package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.a;

/* renamed from: gd  reason: default package */
public final class gd extends AnimatorListenerAdapter {
    public final /* synthetic */ a a;

    public gd(a aVar) {
        this.a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.setEndIconVisible(false);
    }
}