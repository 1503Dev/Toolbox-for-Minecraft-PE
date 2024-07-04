package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import defpackage.l6;

/* renamed from: hx0  reason: default package */
public final class hx0 {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public hx0(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static hx0 m(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new hx0(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public final ColorStateList b(int i) {
        int resourceId;
        ColorStateList a;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0 || (a = z5.a(this.a, resourceId)) == null) ? this.b.getColorStateList(i) : a;
    }

    public final int c(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public final int d(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public final Drawable e(int i) {
        int resourceId;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) ? this.b.getDrawable(i) : z5.b(this.a, resourceId);
    }

    public final Drawable f(int i) {
        int resourceId;
        Drawable g;
        if (this.b.hasValue(i) && (resourceId = this.b.getResourceId(i, 0)) != 0) {
            n5 a = n5.a();
            Context context = this.a;
            synchronized (a) {
                g = a.a.g(context, resourceId, true);
            }
            return g;
        }
        return null;
    }

    public final Typeface g(int i, int i2, l6.a aVar) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        Context context = this.a;
        TypedValue typedValue = this.c;
        ThreadLocal<TypedValue> threadLocal = il0.a;
        if (context.isRestricted()) {
            return null;
        }
        return il0.a(context, resourceId, typedValue, i2, aVar, true);
    }

    public final int h(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public final int i(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public final String j(int i) {
        return this.b.getString(i);
    }

    public final CharSequence k(int i) {
        return this.b.getText(i);
    }

    public final boolean l(int i) {
        return this.b.hasValue(i);
    }

    public final void n() {
        this.b.recycle();
    }
}