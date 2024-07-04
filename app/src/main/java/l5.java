package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.transition.TransitionSet;
import android.view.View;

/* renamed from: l5 */
public final /* synthetic */ class l5 {
    public static /* bridge */ /* synthetic */ int a(TransitionSet transitionSet) {
        return transitionSet.getTransitionCount();
    }

    public static /* bridge */ /* synthetic */ void b(ShapeDrawable shapeDrawable) {
        shapeDrawable.setTint(-1);
    }

    public static /* bridge */ /* synthetic */ void d(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }
}