package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.ImageView;

/* renamed from: h4 */
public final /* synthetic */ class h4 {
    public static /* bridge */ /* synthetic */ int a(WindowInsets windowInsets) {
        return windowInsets.getStableInsetBottom();
    }

    public static /* bridge */ /* synthetic */ void c(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static /* bridge */ /* synthetic */ void d(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static /* bridge */ /* synthetic */ boolean f(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return viewParent.onNestedFling(view, f, f2, z);
    }
}