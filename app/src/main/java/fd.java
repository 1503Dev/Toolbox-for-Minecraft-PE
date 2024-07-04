package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.a;

/* renamed from: fd  reason: default package */
public final class fd extends AnimatorListenerAdapter {
    public final /* synthetic */ a a;

    public fd(a aVar) {
        this.a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.setEndIconVisible(true);
    }
}