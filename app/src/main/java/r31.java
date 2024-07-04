package defpackage;

import io.mrarm.mctoolbox.ui.view.PopupCrashWorkaroundLinearLayout;

/* renamed from: r31  reason: default package */
public final class r31 {
    public static void a(PopupCrashWorkaroundLinearLayout popupCrashWorkaroundLinearLayout, float f) {
        int i = (int) (0.5f + f);
        if (i == 0) {
            i = f == 0.0f ? 0 : f > 0.0f ? 1 : -1;
        }
        popupCrashWorkaroundLinearLayout.setPaddingRelative(i, popupCrashWorkaroundLinearLayout.getPaddingTop(), popupCrashWorkaroundLinearLayout.getPaddingEnd(), popupCrashWorkaroundLinearLayout.getPaddingBottom());
    }
}