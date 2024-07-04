package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import defpackage.o40;
import java.util.WeakHashMap;

/* renamed from: mb  reason: default package */
public final class mb {
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final kr0 f;

    public mb(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, kr0 kr0Var, Rect rect) {
        ja.a(rect.left);
        ja.a(rect.top);
        ja.a(rect.right);
        ja.a(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = kr0Var;
    }

    public static mb a(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ij0.MaterialCalendarItem);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(ij0.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(ij0.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(ij0.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(ij0.MaterialCalendarItem_android_insetBottom, 0));
            ColorStateList b = n40.b(context, obtainStyledAttributes, ij0.MaterialCalendarItem_itemFillColor);
            ColorStateList b2 = n40.b(context, obtainStyledAttributes, ij0.MaterialCalendarItem_itemTextColor);
            ColorStateList b3 = n40.b(context, obtainStyledAttributes, ij0.MaterialCalendarItem_itemStrokeColor);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(ij0.MaterialCalendarItem_itemStrokeWidth, 0);
            kr0 kr0Var = new kr0(kr0.a(context, obtainStyledAttributes.getResourceId(ij0.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(ij0.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), new d0(0)));
            obtainStyledAttributes.recycle();
            return new mb(b, b2, b3, dimensionPixelSize, kr0Var, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    public final void b(TextView textView) {
        Drawable drawable;
        o40 o40Var = new o40();
        o40 o40Var2 = new o40();
        o40Var.setShapeAppearanceModel(this.f);
        o40Var2.setShapeAppearanceModel(this.f);
        o40Var.i(this.c);
        ColorStateList colorStateList = this.d;
        o40Var.P.k = this.e;
        o40Var.invalidateSelf();
        o40.b bVar = o40Var.P;
        if (bVar.d != colorStateList) {
            bVar.d = colorStateList;
            o40Var.onStateChange(o40Var.getState());
        }
        textView.setTextColor(this.b);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable = new RippleDrawable(this.b.withAlpha(30), o40Var, o40Var2);
        } else {
            drawable = o40Var;
        }
        Rect rect = this.a;
        InsetDrawable insetDrawable = new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, String> weakHashMap = a41.a;
        textView.setBackground(insetDrawable);
    }
}