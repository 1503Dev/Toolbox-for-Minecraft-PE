package defpackage;

import android.transition.Transition;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: u0 */
public final /* synthetic */ class u0 {
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo a(int i, int i2, int i3, int i4) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, false);
    }

    public static /* bridge */ /* synthetic */ void b(Transition transition, vr vrVar) {
        transition.setEpicenterCallback(vrVar);
    }
}