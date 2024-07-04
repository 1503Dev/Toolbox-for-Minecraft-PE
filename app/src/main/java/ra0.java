package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;

/* renamed from: ra0 */
public final /* synthetic */ class ra0 {
    public static /* bridge */ /* synthetic */ void b(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    public static /* bridge */ /* synthetic */ boolean d(WindowInsets windowInsets) {
        return windowInsets.isConsumed();
    }
}