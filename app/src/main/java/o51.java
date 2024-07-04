package defpackage;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

/* renamed from: o51  reason: default package */
public final class o51 {
    public static void a(View view, float f) {
        int integer = view.getResources().getInteger(ii0.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{16842766, gh0.state_liftable, -gh0.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}