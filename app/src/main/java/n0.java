package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import androidx.cardview.widget.CardView;

/* renamed from: n0 */
public final /* synthetic */ class n0 {
    public static /* bridge */ /* synthetic */ void a(View view) {
        view.stopNestedScroll();
    }

    public static /* bridge */ /* synthetic */ void b(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    public static /* bridge */ /* synthetic */ void c(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction) {
        accessibilityNodeInfo.addAction(accessibilityNodeInfo$AccessibilityAction);
    }

    public static /* bridge */ /* synthetic */ void d(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static /* bridge */ /* synthetic */ void e(EdgeEffect edgeEffect, float f, float f2) {
        edgeEffect.onPull(f, f2);
    }

    public static /* bridge */ /* synthetic */ void f(CardView cardView, float f) {
        cardView.setElevation(f);
    }
}