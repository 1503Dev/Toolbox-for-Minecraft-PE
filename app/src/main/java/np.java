package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* renamed from: np  reason: default package */
public final class np extends AnimatorListenerAdapter {
    public final /* synthetic */ ExpandableTransformationBehavior a;

    public np(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.a = expandableTransformationBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b = null;
    }
}