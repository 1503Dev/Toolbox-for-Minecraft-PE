package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: sp  reason: default package */
public final class sp extends q51 {

    /* renamed from: sp$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends AnimatorListenerAdapter {
        public final View a;
        public boolean b = false;

        public a(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            a51.a.r(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.a;
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (view.hasOverlappingRendering() && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public sp(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.m0 = i;
    }

    public final ObjectAnimator M(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        a51.a.r(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, a51.b, f2);
        ofFloat.addListener(new a(view));
        a(new rp(view));
        return ofFloat;
    }

    @Override // defpackage.u01
    public final void h(c11 c11Var) {
        K(c11Var);
        c11Var.a.put("android:fade:transitionAlpha", Float.valueOf(a51.a.q(c11Var.b)));
    }
}