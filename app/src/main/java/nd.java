package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import defpackage.lw0;
import java.util.WeakHashMap;

/* renamed from: nd  reason: default package */
public final class nd {
    public float A;
    public float B;
    public int[] C;
    public boolean D;
    public final TextPaint E;
    public final TextPaint F;
    public TimeInterpolator G;
    public TimeInterpolator H;
    public float I;
    public float J;
    public float K;
    public ColorStateList L;
    public final View a;
    public boolean b;
    public float c;
    public final Rect d;
    public final Rect e;
    public final RectF f;
    public int g = 16;
    public int h = 16;
    public float i = 15.0f;
    public float j = 15.0f;
    public ColorStateList k;
    public ColorStateList l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public bc v;
    public CharSequence w;
    public CharSequence x;
    public boolean y;
    public Bitmap z;

    public nd(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.E = textPaint;
        this.F = new TextPaint(textPaint);
        this.e = new Rect();
        this.d = new Rect();
        this.f = new RectF();
    }

    public static int a(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float f(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        LinearInterpolator linearInterpolator = i4.a;
        return ((f2 - f) * f3) + f;
    }

    public final boolean b(CharSequence charSequence) {
        lw0.d dVar;
        View view = this.a;
        WeakHashMap<View, String> weakHashMap = a41.a;
        boolean z = true;
        if (view.getLayoutDirection() != 1) {
            z = false;
        }
        if (z) {
            dVar = lw0.d;
        } else {
            dVar = lw0.c;
        }
        return dVar.b(charSequence, charSequence.length());
    }

    public final void c(float f) {
        boolean z;
        boolean z2;
        boolean z3;
        float f2;
        if (this.w == null) {
            return;
        }
        float width = this.e.width();
        float width2 = this.d.width();
        boolean z4 = true;
        if (Math.abs(f - this.j) < 0.001f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f2 = this.j;
            this.A = 1.0f;
            Typeface typeface = this.u;
            Typeface typeface2 = this.s;
            if (typeface != typeface2) {
                this.u = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f3 = this.i;
            Typeface typeface3 = this.u;
            Typeface typeface4 = this.t;
            if (typeface3 != typeface4) {
                this.u = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (Math.abs(f - f3) < 0.001f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                this.A = 1.0f;
            } else {
                this.A = f / this.i;
            }
            float f4 = this.j / this.i;
            if (width2 * f4 > width) {
                width = Math.min(width / f4, width2);
            } else {
                width = width2;
            }
            f2 = f3;
        }
        if (width > 0.0f) {
            if (this.B == f2 && !this.D && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.B = f2;
            this.D = false;
        }
        if (this.x == null || z2) {
            this.E.setTextSize(this.B);
            this.E.setTypeface(this.u);
            TextPaint textPaint = this.E;
            if (this.A == 1.0f) {
                z4 = false;
            }
            textPaint.setLinearText(z4);
            CharSequence ellipsize = TextUtils.ellipsize(this.w, this.E, width, TextUtils.TruncateAt.END);
            if (!TextUtils.equals(ellipsize, this.x)) {
                this.x = ellipsize;
                this.y = b(ellipsize);
            }
        }
    }

    public final float d() {
        TextPaint textPaint = this.F;
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
        return -this.F.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.C;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g() {
        this.b = this.e.width() > 0 && this.e.height() > 0 && this.d.width() > 0 && this.d.height() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        float f;
        float ascent;
        int i;
        float centerX;
        CharSequence charSequence;
        float f2;
        int i2;
        float ascent2;
        int i3;
        float centerX2;
        float f3;
        Bitmap bitmap;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        int e;
        TextPaint textPaint;
        if (this.a.getHeight() > 0 && this.a.getWidth() > 0) {
            float f4 = this.B;
            c(this.j);
            CharSequence charSequence2 = this.x;
            if (charSequence2 != null) {
                f = this.E.measureText(charSequence2, 0, charSequence2.length());
            } else {
                f = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.h, this.y ? 1 : 0);
            int i4 = absoluteGravity & 112;
            if (i4 != 48) {
                if (i4 != 80) {
                    this.n = this.e.centerY() + (((this.E.descent() - this.E.ascent()) / 2.0f) - this.E.descent());
                    i = absoluteGravity & 8388615;
                    if (i == 1) {
                        if (i != 5) {
                            this.p = this.e.left;
                            c(this.i);
                            charSequence = this.x;
                            if (charSequence != null) {
                                f2 = this.E.measureText(charSequence, 0, charSequence.length());
                            } else {
                                f2 = 0.0f;
                            }
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.g, this.y ? 1 : 0);
                            i2 = absoluteGravity2 & 112;
                            if (i2 != 48) {
                                if (i2 != 80) {
                                    this.m = this.d.centerY() + (((this.E.descent() - this.E.ascent()) / 2.0f) - this.E.descent());
                                    i3 = absoluteGravity2 & 8388615;
                                    if (i3 == 1) {
                                        if (i3 != 5) {
                                            f3 = this.d.left;
                                            this.o = f3;
                                            bitmap = this.z;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                this.z = null;
                                            }
                                            k(f4);
                                            float f5 = this.c;
                                            this.f.left = f(this.d.left, this.e.left, f5, this.G);
                                            this.f.top = f(this.m, this.n, f5, this.G);
                                            this.f.right = f(this.d.right, this.e.right, f5, this.G);
                                            this.f.bottom = f(this.d.bottom, this.e.bottom, f5, this.G);
                                            this.q = f(this.o, this.p, f5, this.G);
                                            this.r = f(this.m, this.n, f5, this.G);
                                            k(f(this.i, this.j, f5, this.H));
                                            colorStateList = this.l;
                                            colorStateList2 = this.k;
                                            if (colorStateList != colorStateList2) {
                                                textPaint = this.E;
                                                e = a(f5, e(colorStateList2), e(this.l));
                                            } else {
                                                TextPaint textPaint2 = this.E;
                                                e = e(colorStateList);
                                                textPaint = textPaint2;
                                            }
                                            textPaint.setColor(e);
                                            this.E.setShadowLayer(f(0.0f, this.I, f5, null), f(0.0f, this.J, f5, null), f(0.0f, this.K, f5, null), a(f5, e(null), e(this.L)));
                                            View view = this.a;
                                            WeakHashMap<View, String> weakHashMap = a41.a;
                                            view.postInvalidateOnAnimation();
                                        }
                                        centerX2 = this.d.right;
                                    } else {
                                        centerX2 = this.d.centerX();
                                        f2 /= 2.0f;
                                    }
                                    f3 = centerX2 - f2;
                                    this.o = f3;
                                    bitmap = this.z;
                                    if (bitmap != null) {
                                    }
                                    k(f4);
                                    float f52 = this.c;
                                    this.f.left = f(this.d.left, this.e.left, f52, this.G);
                                    this.f.top = f(this.m, this.n, f52, this.G);
                                    this.f.right = f(this.d.right, this.e.right, f52, this.G);
                                    this.f.bottom = f(this.d.bottom, this.e.bottom, f52, this.G);
                                    this.q = f(this.o, this.p, f52, this.G);
                                    this.r = f(this.m, this.n, f52, this.G);
                                    k(f(this.i, this.j, f52, this.H));
                                    colorStateList = this.l;
                                    colorStateList2 = this.k;
                                    if (colorStateList != colorStateList2) {
                                    }
                                    textPaint.setColor(e);
                                    this.E.setShadowLayer(f(0.0f, this.I, f52, null), f(0.0f, this.J, f52, null), f(0.0f, this.K, f52, null), a(f52, e(null), e(this.L)));
                                    View view2 = this.a;
                                    WeakHashMap<View, String> weakHashMap2 = a41.a;
                                    view2.postInvalidateOnAnimation();
                                }
                                ascent2 = this.d.bottom;
                            } else {
                                ascent2 = this.d.top - this.E.ascent();
                            }
                            this.m = ascent2;
                            i3 = absoluteGravity2 & 8388615;
                            if (i3 == 1) {
                            }
                            f3 = centerX2 - f2;
                            this.o = f3;
                            bitmap = this.z;
                            if (bitmap != null) {
                            }
                            k(f4);
                            float f522 = this.c;
                            this.f.left = f(this.d.left, this.e.left, f522, this.G);
                            this.f.top = f(this.m, this.n, f522, this.G);
                            this.f.right = f(this.d.right, this.e.right, f522, this.G);
                            this.f.bottom = f(this.d.bottom, this.e.bottom, f522, this.G);
                            this.q = f(this.o, this.p, f522, this.G);
                            this.r = f(this.m, this.n, f522, this.G);
                            k(f(this.i, this.j, f522, this.H));
                            colorStateList = this.l;
                            colorStateList2 = this.k;
                            if (colorStateList != colorStateList2) {
                            }
                            textPaint.setColor(e);
                            this.E.setShadowLayer(f(0.0f, this.I, f522, null), f(0.0f, this.J, f522, null), f(0.0f, this.K, f522, null), a(f522, e(null), e(this.L)));
                            View view22 = this.a;
                            WeakHashMap<View, String> weakHashMap22 = a41.a;
                            view22.postInvalidateOnAnimation();
                        }
                        centerX = this.e.right;
                    } else {
                        centerX = this.e.centerX();
                        f /= 2.0f;
                    }
                    this.p = centerX - f;
                    c(this.i);
                    charSequence = this.x;
                    if (charSequence != null) {
                    }
                    int absoluteGravity22 = Gravity.getAbsoluteGravity(this.g, this.y ? 1 : 0);
                    i2 = absoluteGravity22 & 112;
                    if (i2 != 48) {
                    }
                    this.m = ascent2;
                    i3 = absoluteGravity22 & 8388615;
                    if (i3 == 1) {
                    }
                    f3 = centerX2 - f2;
                    this.o = f3;
                    bitmap = this.z;
                    if (bitmap != null) {
                    }
                    k(f4);
                    float f5222 = this.c;
                    this.f.left = f(this.d.left, this.e.left, f5222, this.G);
                    this.f.top = f(this.m, this.n, f5222, this.G);
                    this.f.right = f(this.d.right, this.e.right, f5222, this.G);
                    this.f.bottom = f(this.d.bottom, this.e.bottom, f5222, this.G);
                    this.q = f(this.o, this.p, f5222, this.G);
                    this.r = f(this.m, this.n, f5222, this.G);
                    k(f(this.i, this.j, f5222, this.H));
                    colorStateList = this.l;
                    colorStateList2 = this.k;
                    if (colorStateList != colorStateList2) {
                    }
                    textPaint.setColor(e);
                    this.E.setShadowLayer(f(0.0f, this.I, f5222, null), f(0.0f, this.J, f5222, null), f(0.0f, this.K, f5222, null), a(f5222, e(null), e(this.L)));
                    View view222 = this.a;
                    WeakHashMap<View, String> weakHashMap222 = a41.a;
                    view222.postInvalidateOnAnimation();
                }
                ascent = this.e.bottom;
            } else {
                ascent = this.e.top - this.E.ascent();
            }
            this.n = ascent;
            i = absoluteGravity & 8388615;
            if (i == 1) {
            }
            this.p = centerX - f;
            c(this.i);
            charSequence = this.x;
            if (charSequence != null) {
            }
            int absoluteGravity222 = Gravity.getAbsoluteGravity(this.g, this.y ? 1 : 0);
            i2 = absoluteGravity222 & 112;
            if (i2 != 48) {
            }
            this.m = ascent2;
            i3 = absoluteGravity222 & 8388615;
            if (i3 == 1) {
            }
            f3 = centerX2 - f2;
            this.o = f3;
            bitmap = this.z;
            if (bitmap != null) {
            }
            k(f4);
            float f52222 = this.c;
            this.f.left = f(this.d.left, this.e.left, f52222, this.G);
            this.f.top = f(this.m, this.n, f52222, this.G);
            this.f.right = f(this.d.right, this.e.right, f52222, this.G);
            this.f.bottom = f(this.d.bottom, this.e.bottom, f52222, this.G);
            this.q = f(this.o, this.p, f52222, this.G);
            this.r = f(this.m, this.n, f52222, this.G);
            k(f(this.i, this.j, f52222, this.H));
            colorStateList = this.l;
            colorStateList2 = this.k;
            if (colorStateList != colorStateList2) {
            }
            textPaint.setColor(e);
            this.E.setShadowLayer(f(0.0f, this.I, f52222, null), f(0.0f, this.J, f52222, null), f(0.0f, this.K, f52222, null), a(f52222, e(null), e(this.L)));
            View view2222 = this.a;
            WeakHashMap<View, String> weakHashMap2222 = a41.a;
            view2222.postInvalidateOnAnimation();
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            h();
        }
    }

    public final void j(float f) {
        int e;
        TextPaint textPaint;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.c) {
            this.c = f;
            this.f.left = f(this.d.left, this.e.left, f, this.G);
            this.f.top = f(this.m, this.n, f, this.G);
            this.f.right = f(this.d.right, this.e.right, f, this.G);
            this.f.bottom = f(this.d.bottom, this.e.bottom, f, this.G);
            this.q = f(this.o, this.p, f, this.G);
            this.r = f(this.m, this.n, f, this.G);
            k(f(this.i, this.j, f, this.H));
            ColorStateList colorStateList = this.l;
            ColorStateList colorStateList2 = this.k;
            if (colorStateList != colorStateList2) {
                textPaint = this.E;
                e = a(f, e(colorStateList2), e(this.l));
            } else {
                TextPaint textPaint2 = this.E;
                e = e(colorStateList);
                textPaint = textPaint2;
            }
            textPaint.setColor(e);
            this.E.setShadowLayer(f(0.0f, this.I, f, null), f(0.0f, this.J, f, null), f(0.0f, this.K, f, null), a(f, e(null), e(this.L)));
            View view = this.a;
            WeakHashMap<View, String> weakHashMap = a41.a;
            view.postInvalidateOnAnimation();
        }
    }

    public final void k(float f) {
        c(f);
        View view = this.a;
        WeakHashMap<View, String> weakHashMap = a41.a;
        view.postInvalidateOnAnimation();
    }
}