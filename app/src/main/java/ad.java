package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import defpackage.dd;

/* renamed from: ad  reason: default package */
public final class ad {
    public static Animator a(dd ddVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(ddVar, dd.b.a, dd.a.b, new dd.d(f, f2, f3));
        if (Build.VERSION.SDK_INT >= 21) {
            dd.d revealInfo = ddVar.getRevealInfo();
            if (revealInfo != null) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) ddVar, (int) f, (int) f2, revealInfo.c, f3);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofObject, createCircularReveal);
                return animatorSet;
            }
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        return ofObject;
    }
}