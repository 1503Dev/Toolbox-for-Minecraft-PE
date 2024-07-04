package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* renamed from: n40  reason: default package */
public final class n40 {
    public static ColorStateList a(Context context, hx0 hx0Var, int i) {
        int i2;
        ColorStateList a;
        return (!hx0Var.l(i) || (i2 = hx0Var.i(i, 0)) == 0 || (a = z5.a(context, i2)) == null) ? hx0Var.b(i) : a;
    }

    public static ColorStateList b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = z5.a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : a;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = z5.b(context, resourceId)) == null) ? typedArray.getDrawable(i) : b;
    }
}