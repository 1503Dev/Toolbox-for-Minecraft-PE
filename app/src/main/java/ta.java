package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.o40;

/* renamed from: ta  reason: default package */
public final class ta implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior a;

    public ta(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        o40 o40Var = this.a.h;
        if (o40Var != null) {
            o40.b bVar = o40Var.P;
            if (bVar.j != floatValue) {
                bVar.j = floatValue;
                o40Var.S = true;
                o40Var.invalidateSelf();
            }
        }
    }
}