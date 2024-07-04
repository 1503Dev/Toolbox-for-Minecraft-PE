package defpackage;

import android.view.MenuItem;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: i0 */
public final /* synthetic */ class i0 {
    public static /* bridge */ /* synthetic */ void b(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static /* bridge */ /* synthetic */ void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setHintText(charSequence);
    }
}