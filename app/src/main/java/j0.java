package defpackage;

import android.view.MenuItem;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: j0 */
public final /* synthetic */ class j0 {
    public static /* bridge */ /* synthetic */ void b(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static /* bridge */ /* synthetic */ boolean c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isShowingHintText();
    }
}