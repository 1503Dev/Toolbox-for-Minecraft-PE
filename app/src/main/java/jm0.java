package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: jm0  reason: default package */
public final class jm0 extends Drawable {
    public static final double q = Math.cos(Math.toRadians(45.0d));
    public static a r;
    public final int a;
    public Paint c;
    public Paint d;
    public final RectF e;
    public float f;
    public Path g;
    public float h;
    public float i;
    public float j;
    public ColorStateList k;
    public final int m;
    public final int n;
    public boolean l = true;
    public boolean o = true;
    public boolean p = false;
    public Paint b = new Paint(5);

    /* renamed from: jm0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public jm0(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.m = resources.getColor(lh0.cardview_shadow_start_color);
        this.n = resources.getColor(lh0.cardview_shadow_end_color);
        this.a = resources.getDimensionPixelSize(ph0.cardview_compat_inset_shadow);
        c(colorStateList);
        Paint paint = new Paint(5);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f = (int) (f + 0.5f);
        this.e = new RectF();
        Paint paint2 = new Paint(this.c);
        this.d = paint2;
        paint2.setAntiAlias(false);
        d(f2, f3);
    }

    public static float a(float f, float f2, boolean z) {
        if (z) {
            double d = f;
            double d2 = f2;
            Double.isNaN(d2);
            Double.isNaN(d);
            return (float) (((1.0d - q) * d2) + d);
        }
        return f;
    }

    public static float b(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (z) {
            double d = f3;
            double d2 = f2;
            Double.isNaN(d2);
            Double.isNaN(d);
            return (float) (((1.0d - q) * d2) + d);
        }
        return f3;
    }

    public final void c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.k = colorStateList;
        this.b.setColor(colorStateList.getColorForState(getState(), this.k.getDefaultColor()));
    }

    public final void d(float f, float f2) {
        if (f >= 0.0f) {
            if (f2 >= 0.0f) {
                int i = (int) (f + 0.5f);
                if (i % 2 == 1) {
                    i--;
                }
                float f3 = i;
                int i2 = (int) (f2 + 0.5f);
                if (i2 % 2 == 1) {
                    i2--;
                }
                float f4 = i2;
                if (f3 > f4) {
                    if (!this.p) {
                        this.p = true;
                    }
                    f3 = f4;
                }
                if (this.j == f3 && this.h == f4) {
                    return;
                }
                this.j = f3;
                this.h = f4;
                this.i = (int) ((f3 * 1.5f) + this.a + 0.5f);
                this.l = true;
                invalidateSelf();
                return;
            }
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
        throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        if (this.l) {
            Rect bounds = getBounds();
            float f = this.h;
            float f2 = 1.5f * f;
            this.e.set(bounds.left + f, bounds.top + f2, bounds.right - f, bounds.bottom - f2);
            float f3 = this.f;
            float f4 = -f3;
            RectF rectF = new RectF(f4, f4, f3, f3);
            RectF rectF2 = new RectF(rectF);
            float f5 = -this.i;
            rectF2.inset(f5, f5);
            Path path = this.g;
            if (path == null) {
                this.g = new Path();
            } else {
                path.reset();
            }
            this.g.setFillType(Path.FillType.EVEN_ODD);
            this.g.moveTo(-this.f, 0.0f);
            this.g.rLineTo(-this.i, 0.0f);
            this.g.arcTo(rectF2, 180.0f, 90.0f, false);
            this.g.arcTo(rectF, 270.0f, -90.0f, false);
            this.g.close();
            float f6 = this.f;
            float f7 = f6 / (this.i + f6);
            Paint paint = this.c;
            float f8 = this.f + this.i;
            int i2 = this.m;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f8, new int[]{i2, i2, this.n}, new float[]{0.0f, f7, 1.0f}, Shader.TileMode.CLAMP));
            Paint paint2 = this.d;
            float f9 = -this.f;
            float f10 = this.i;
            float f11 = f9 + f10;
            float f12 = f9 - f10;
            int i3 = this.m;
            paint2.setShader(new LinearGradient(0.0f, f11, 0.0f, f12, new int[]{i3, i3, this.n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.d.setAntiAlias(false);
            this.l = false;
        }
        canvas.translate(0.0f, this.j / 2.0f);
        float f13 = this.f;
        float f14 = (-f13) - this.i;
        float f15 = (this.j / 2.0f) + f13 + this.a;
        float f16 = f15 * 2.0f;
        if (this.e.width() - f16 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.e.height() - f16 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        int save = canvas.save();
        RectF rectF3 = this.e;
        canvas.translate(rectF3.left + f15, rectF3.top + f15);
        canvas.drawPath(this.g, this.c);
        if (z) {
            i = save;
            canvas.drawRect(0.0f, f14, this.e.width() - f16, -this.f, this.d);
        } else {
            i = save;
        }
        canvas.restoreToCount(i);
        int save2 = canvas.save();
        RectF rectF4 = this.e;
        canvas.translate(rectF4.right - f15, rectF4.bottom - f15);
        canvas.rotate(180.0f);
        canvas.drawPath(this.g, this.c);
        if (z) {
            canvas.drawRect(0.0f, f14, this.e.width() - f16, (-this.f) + this.i, this.d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF5 = this.e;
        canvas.translate(rectF5.left + f15, rectF5.bottom - f15);
        canvas.rotate(270.0f);
        canvas.drawPath(this.g, this.c);
        if (z2) {
            canvas.drawRect(0.0f, f14, this.e.height() - f16, -this.f, this.d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF6 = this.e;
        canvas.translate(rectF6.right - f15, rectF6.top + f15);
        canvas.rotate(90.0f);
        canvas.drawPath(this.g, this.c);
        if (z2) {
            canvas.drawRect(0.0f, f14, this.e.height() - f16, -this.f, this.d);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.j) / 2.0f);
        r.a(canvas, this.e, this.f, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(b(this.h, this.f, this.o));
        int ceil2 = (int) Math.ceil(a(this.h, this.f, this.o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.b.getColor() == colorForState) {
            return false;
        }
        this.b.setColor(colorForState);
        this.l = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        this.c.setAlpha(i);
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}