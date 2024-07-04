package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet b;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void t(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet u = u(view, view2, z, z3);
        this.b = u;
        u.addListener(new np(this));
        this.b.start();
        if (z2) {
            return;
        }
        this.b.end();
    }

    public abstract AnimatorSet u(View view, View view2, boolean z, boolean z2);
}