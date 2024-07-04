package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;

/* renamed from: th */
public final /* synthetic */ class th {
    public static /* bridge */ /* synthetic */ int a(Canvas canvas, float f, float f2) {
        return canvas.saveLayer(0.0f, 0.0f, f, f2, null);
    }

    public static /* bridge */ /* synthetic */ ColorStateList b(View view) {
        return view.getBackgroundTintList();
    }

    public static /* bridge */ /* synthetic */ Transition c(TransitionSet transitionSet, int i) {
        return transitionSet.getTransitionAt(i);
    }
}