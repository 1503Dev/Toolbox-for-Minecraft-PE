package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewParent;

/* renamed from: dc */
public final /* synthetic */ class dc {
    public static /* bridge */ /* synthetic */ int a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return canvas.saveLayerAlpha(f, f2, f3, f4, i);
    }

    public static /* bridge */ /* synthetic */ void b(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}