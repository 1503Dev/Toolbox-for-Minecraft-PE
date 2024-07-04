package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final r60 c;
    public final r60 d;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ View b;

        public a(boolean z, View view) {
            this.a = z;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            this.b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.c = new r60(75L);
        this.d = new r60(0L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new r60(75L);
        this.d = new r60(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean b(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet u(View view, View view2, boolean z, boolean z2) {
        r60 r60Var;
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        if (z) {
            r60Var = this.c;
        } else {
            r60Var = this.d;
        }
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 0.0f);
        }
        r60Var.a(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        eb1.r(animatorSet, arrayList);
        animatorSet.addListener(new a(z, view2));
        return animatorSet;
    }
}