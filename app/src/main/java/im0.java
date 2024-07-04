package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: im0  reason: default package */
public final class im0 extends Drawable {
    public float a;
    public final RectF c;
    public final Rect d;
    public float e;
    public ColorStateList h;
    public PorterDuffColorFilter i;
    public ColorStateList j;
    public boolean f = false;
    public boolean g = true;
    public PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public final Paint b = new Paint(5);

    public im0(float f, ColorStateList colorStateList) {
        this.a = f;
        b(colorStateList);
        this.c = new RectF();
        this.d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.h = colorStateList;
        this.b.setColor(colorStateList.getColorForState(getState(), this.h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.d.set(rect);
        if (this.f) {
            float b = jm0.b(this.e, this.a, this.g);
            this.d.inset((int) Math.ceil(jm0.a(this.e, this.a, this.g)), (int) Math.ceil(b));
            this.c.set(this.d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.b;
        if (this.i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.i);
            z = true;
        }
        RectF rectF = this.c;
        float f = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.b.getColor();
        if (z) {
            this.b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(colorStateList, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.i = a(this.j, mode);
        invalidateSelf();
    }
}