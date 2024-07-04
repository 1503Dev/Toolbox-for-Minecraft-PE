package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.mw0;
import defpackage.o40;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public final class a extends o40 implements Drawable.Callback, mw0.b {
    public static final int[] t1 = {16842910};
    public static final ShapeDrawable u1 = new ShapeDrawable(new OvalShape());
    public Drawable A0;
    public ColorStateList B0;
    public float C0;
    public SpannableStringBuilder D0;
    public boolean E0;
    public boolean F0;
    public Drawable G0;
    public q60 H0;
    public q60 I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public float Q0;
    public final Context R0;
    public final Paint S0;
    public final Paint.FontMetrics T0;
    public final RectF U0;
    public final PointF V0;
    public final Path W0;
    public final mw0 X0;
    public int Y0;
    public int Z0;
    public int a1;
    public int b1;
    public int c1;
    public int d1;
    public boolean e1;
    public int f1;
    public int g1;
    public ColorFilter h1;
    public PorterDuffColorFilter i1;
    public ColorStateList j1;
    public PorterDuff.Mode k1;
    public ColorStateList l0;
    public int[] l1;
    public ColorStateList m0;
    public boolean m1;
    public float n0;
    public ColorStateList n1;
    public float o0;
    public WeakReference<InterfaceC0024a> o1;
    public ColorStateList p0;
    public TextUtils.TruncateAt p1;
    public float q0;
    public boolean q1;
    public ColorStateList r0;
    public int r1;
    public CharSequence s0;
    public boolean s1;
    public boolean t0;
    public Drawable u0;
    public ColorStateList v0;
    public float w0;
    public boolean x0;
    public boolean y0;
    public Drawable z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface InterfaceC0024a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(new kr0(kr0.b(context, attributeSet, i, i2)));
        this.S0 = new Paint(1);
        this.T0 = new Paint.FontMetrics();
        this.U0 = new RectF();
        this.V0 = new PointF();
        this.W0 = new Path();
        this.g1 = 255;
        this.k1 = PorterDuff.Mode.SRC_IN;
        this.o1 = new WeakReference<>(null);
        g(context);
        this.R0 = context;
        mw0 mw0Var = new mw0(this);
        this.X0 = mw0Var;
        this.s0 = "";
        mw0Var.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = t1;
        setState(iArr);
        if (!Arrays.equals(this.l1, iArr)) {
            this.l1 = iArr;
            if (Q()) {
                u(getState(), iArr);
            }
        }
        this.q1 = true;
        if (am0.a) {
            l5.b(u1);
        }
    }

    public static void R(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean r(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean s(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(float f) {
        if (this.w0 != f) {
            float o = o();
            this.w0 = f;
            float o2 = o();
            invalidateSelf();
            if (o != o2) {
                t();
            }
        }
    }

    public final void B(ColorStateList colorStateList) {
        this.x0 = true;
        if (this.v0 != colorStateList) {
            this.v0 = colorStateList;
            if (P()) {
                km.f(this.u0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void C(boolean z) {
        if (this.t0 != z) {
            boolean P = P();
            this.t0 = z;
            boolean P2 = P();
            if (P != P2) {
                if (P2) {
                    m(this.u0);
                } else {
                    R(this.u0);
                }
                invalidateSelf();
                t();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        if (this.p0 != colorStateList) {
            this.p0 = colorStateList;
            if (this.s1) {
                o40.b bVar = this.P;
                if (bVar.d != colorStateList) {
                    bVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void E(float f) {
        if (this.q0 != f) {
            this.q0 = f;
            this.S0.setStrokeWidth(f);
            if (this.s1) {
                this.P.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void F(Drawable drawable) {
        Drawable drawable2 = this.z0;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof y71) {
                drawable2 = ((y71) drawable2).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p = p();
            if (drawable != null) {
                drawable3 = km.h(drawable).mutate();
            }
            this.z0 = drawable3;
            if (am0.a) {
                this.A0 = new RippleDrawable(am0.b(this.r0), this.z0, u1);
            }
            float p2 = p();
            R(drawable2);
            if (Q()) {
                m(this.z0);
            }
            invalidateSelf();
            if (p != p2) {
                t();
            }
        }
    }

    public final void G(float f) {
        if (this.P0 != f) {
            this.P0 = f;
            invalidateSelf();
            if (Q()) {
                t();
            }
        }
    }

    public final void H(float f) {
        if (this.C0 != f) {
            this.C0 = f;
            invalidateSelf();
            if (Q()) {
                t();
            }
        }
    }

    public final void I(float f) {
        if (this.O0 != f) {
            this.O0 = f;
            invalidateSelf();
            if (Q()) {
                t();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            this.B0 = colorStateList;
            if (Q()) {
                km.f(this.z0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z) {
        if (this.y0 != z) {
            boolean Q = Q();
            this.y0 = z;
            boolean Q2 = Q();
            if (Q != Q2) {
                if (Q2) {
                    m(this.z0);
                } else {
                    R(this.z0);
                }
                invalidateSelf();
                t();
            }
        }
    }

    public final void L(float f) {
        if (this.L0 != f) {
            float o = o();
            this.L0 = f;
            float o2 = o();
            invalidateSelf();
            if (o != o2) {
                t();
            }
        }
    }

    public final void M(float f) {
        if (this.K0 != f) {
            float o = o();
            this.K0 = f;
            float o2 = o();
            invalidateSelf();
            if (o != o2) {
                t();
            }
        }
    }

    public final void N(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.r0 != colorStateList) {
            this.r0 = colorStateList;
            if (this.m1) {
                colorStateList2 = am0.b(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.n1 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final boolean O() {
        return this.F0 && this.G0 != null && this.e1;
    }

    public final boolean P() {
        return this.t0 && this.u0 != null;
    }

    public final boolean Q() {
        return this.y0 && this.z0 != null;
    }

    @Override // defpackage.mw0.b
    public final void a() {
        t();
        invalidateSelf();
    }

    @Override // defpackage.o40, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        Drawable drawable;
        boolean z;
        int i3;
        float f;
        int saveLayerAlpha;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.g1) != 0) {
            if (i < 255) {
                float f2 = bounds.left;
                float f3 = bounds.top;
                float f4 = bounds.right;
                float f5 = bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    saveLayerAlpha = dc.a(canvas, f2, f3, f4, f5, i);
                } else {
                    saveLayerAlpha = canvas.saveLayerAlpha(f2, f3, f4, f5, i, 31);
                }
                i2 = saveLayerAlpha;
            } else {
                i2 = 0;
            }
            if (!this.s1) {
                this.S0.setColor(this.Y0);
                this.S0.setStyle(Paint.Style.FILL);
                this.U0.set(bounds);
                canvas.drawRoundRect(this.U0, q(), q(), this.S0);
            }
            if (!this.s1) {
                this.S0.setColor(this.Z0);
                this.S0.setStyle(Paint.Style.FILL);
                Paint paint = this.S0;
                ColorFilter colorFilter = this.h1;
                if (colorFilter == null) {
                    colorFilter = this.i1;
                }
                paint.setColorFilter(colorFilter);
                this.U0.set(bounds);
                canvas.drawRoundRect(this.U0, q(), q(), this.S0);
            }
            if (this.s1) {
                super.draw(canvas);
            }
            if (this.q0 > 0.0f && !this.s1) {
                this.S0.setColor(this.b1);
                this.S0.setStyle(Paint.Style.STROKE);
                if (!this.s1) {
                    Paint paint2 = this.S0;
                    ColorFilter colorFilter2 = this.h1;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.i1;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.U0;
                float f6 = this.q0 / 2.0f;
                rectF.set(bounds.left + f6, bounds.top + f6, bounds.right - f6, bounds.bottom - f6);
                float f7 = this.o0 - (this.q0 / 2.0f);
                canvas.drawRoundRect(this.U0, f7, f7, this.S0);
            }
            this.S0.setColor(this.c1);
            this.S0.setStyle(Paint.Style.FILL);
            this.U0.set(bounds);
            if (!this.s1) {
                canvas.drawRoundRect(this.U0, q(), q(), this.S0);
            } else {
                RectF rectF2 = new RectF(bounds);
                Path path = this.W0;
                lr0 lr0Var = this.f0;
                o40.b bVar = this.P;
                lr0Var.a(bVar.a, bVar.j, rectF2, this.e0, path);
                o40.e(canvas, this.S0, this.W0, this.P.a, f());
            }
            if (P()) {
                n(bounds, this.U0);
                RectF rectF3 = this.U0;
                float f8 = rectF3.left;
                float f9 = rectF3.top;
                canvas.translate(f8, f9);
                this.u0.setBounds(0, 0, (int) this.U0.width(), (int) this.U0.height());
                this.u0.draw(canvas);
                canvas.translate(-f8, -f9);
            }
            if (O()) {
                n(bounds, this.U0);
                RectF rectF4 = this.U0;
                float f10 = rectF4.left;
                float f11 = rectF4.top;
                canvas.translate(f10, f11);
                this.G0.setBounds(0, 0, (int) this.U0.width(), (int) this.U0.height());
                this.G0.draw(canvas);
                canvas.translate(-f10, -f11);
            }
            if (this.q1 && this.s0 != null) {
                PointF pointF = this.V0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.s0 != null) {
                    float o = o() + this.J0 + this.M0;
                    if (km.b(this) == 0) {
                        pointF.x = bounds.left + o;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - o;
                        align = Paint.Align.RIGHT;
                    }
                    this.X0.a.getFontMetrics(this.T0);
                    Paint.FontMetrics fontMetrics = this.T0;
                    pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF5 = this.U0;
                rectF5.setEmpty();
                if (this.s0 != null) {
                    float o2 = o() + this.J0 + this.M0;
                    float p = p() + this.Q0 + this.N0;
                    if (km.b(this) == 0) {
                        rectF5.left = bounds.left + o2;
                        f = bounds.right - p;
                    } else {
                        rectF5.left = bounds.left + p;
                        f = bounds.right - o2;
                    }
                    rectF5.right = f;
                    rectF5.top = bounds.top;
                    rectF5.bottom = bounds.bottom;
                }
                mw0 mw0Var = this.X0;
                if (mw0Var.f != null) {
                    mw0Var.a.drawableState = getState();
                    mw0 mw0Var2 = this.X0;
                    mw0Var2.f.c(this.R0, mw0Var2.a, mw0Var2.b);
                }
                this.X0.a.setTextAlign(align);
                if (Math.round(this.X0.a(this.s0.toString())) > Math.round(this.U0.width())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int save = canvas.save();
                    canvas.clipRect(this.U0);
                    i3 = save;
                } else {
                    i3 = 0;
                }
                CharSequence charSequence = this.s0;
                if (z && this.p1 != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.X0.a, this.U0.width(), this.p1);
                }
                CharSequence charSequence2 = charSequence;
                int length = charSequence2.length();
                PointF pointF2 = this.V0;
                canvas.drawText(charSequence2, 0, length, pointF2.x, pointF2.y, this.X0.a);
                if (z) {
                    canvas.restoreToCount(i3);
                }
            }
            if (Q()) {
                RectF rectF6 = this.U0;
                rectF6.setEmpty();
                if (Q()) {
                    float f12 = this.Q0 + this.P0;
                    if (km.b(this) == 0) {
                        float f13 = bounds.right - f12;
                        rectF6.right = f13;
                        rectF6.left = f13 - this.C0;
                    } else {
                        float f14 = bounds.left + f12;
                        rectF6.left = f14;
                        rectF6.right = f14 + this.C0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f15 = this.C0;
                    float f16 = exactCenterY - (f15 / 2.0f);
                    rectF6.top = f16;
                    rectF6.bottom = f16 + f15;
                }
                RectF rectF7 = this.U0;
                float f17 = rectF7.left;
                float f18 = rectF7.top;
                canvas.translate(f17, f18);
                this.z0.setBounds(0, 0, (int) this.U0.width(), (int) this.U0.height());
                if (am0.a) {
                    this.A0.setBounds(this.z0.getBounds());
                    this.A0.jumpToCurrentState();
                    drawable = this.A0;
                } else {
                    drawable = this.z0;
                }
                drawable.draw(canvas);
                canvas.translate(-f17, -f18);
            }
            if (this.g1 < 255) {
                canvas.restoreToCount(i2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.g1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.h1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.n0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(p() + this.X0.a(this.s0.toString()) + o() + this.J0 + this.M0 + this.N0 + this.Q0), this.r1);
    }

    @Override // defpackage.o40, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.o40, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.s1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.o0);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.n0, this.o0);
        }
        outline.setAlpha(this.g1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.o40, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        if (!r(this.l0) && !r(this.m0) && !r(this.p0) && (!this.m1 || !r(this.n1))) {
            iw0 iw0Var = this.X0.f;
            if (iw0Var != null && (colorStateList = iw0Var.b) != null && colorStateList.isStateful()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.F0 && this.G0 != null && this.E0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && !s(this.u0) && !s(this.G0) && !r(this.j1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void m(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        km.d(drawable, km.b(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.z0) {
            if (drawable.isStateful()) {
                drawable.setState(this.l1);
            }
            km.f(drawable, this.B0);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.u0;
        if (drawable == drawable2 && this.x0) {
            km.f(drawable2, this.v0);
        }
    }

    public final void n(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (P() || O()) {
            float f = this.J0 + this.K0;
            if (km.b(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + this.w0;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - this.w0;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.w0;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public final float o() {
        if (P() || O()) {
            return this.K0 + this.w0 + this.L0;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (P()) {
            onLayoutDirectionChanged |= km.d(this.u0, i);
        }
        if (O()) {
            onLayoutDirectionChanged |= km.d(this.G0, i);
        }
        if (Q()) {
            onLayoutDirectionChanged |= km.d(this.z0, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (P()) {
            onLevelChange |= this.u0.setLevel(i);
        }
        if (O()) {
            onLevelChange |= this.G0.setLevel(i);
        }
        if (Q()) {
            onLevelChange |= this.z0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.o40, android.graphics.drawable.Drawable, defpackage.mw0.b
    public final boolean onStateChange(int[] iArr) {
        if (this.s1) {
            super.onStateChange(iArr);
        }
        return u(iArr, this.l1);
    }

    public final float p() {
        if (Q()) {
            return this.O0 + this.C0 + this.P0;
        }
        return 0.0f;
    }

    public final float q() {
        if (this.s1) {
            return this.P.a.e.a(f());
        }
        return this.o0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.o40, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.g1 != i) {
            this.g1 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.o40, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.h1 != colorFilter) {
            this.h1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.o40, android.graphics.drawable.Drawable, defpackage.dx0
    public final void setTintList(ColorStateList colorStateList) {
        if (this.j1 != colorStateList) {
            this.j1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.o40, android.graphics.drawable.Drawable, defpackage.dx0
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.k1 != mode) {
            this.k1 = mode;
            ColorStateList colorStateList = this.j1;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.i1 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (P()) {
            visible |= this.u0.setVisible(z, z2);
        }
        if (O()) {
            visible |= this.G0.setVisible(z, z2);
        }
        if (Q()) {
            visible |= this.z0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t() {
        InterfaceC0024a interfaceC0024a = this.o1.get();
        if (interfaceC0024a != null) {
            interfaceC0024a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(int[] iArr, int[] iArr2) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        ColorStateList colorStateList;
        int i6;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList2;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList3 = this.l0;
        if (colorStateList3 != null) {
            i = colorStateList3.getColorForState(iArr, this.Y0);
        } else {
            i = 0;
        }
        boolean z6 = true;
        if (this.Y0 != i) {
            this.Y0 = i;
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.m0;
        if (colorStateList4 != null) {
            i2 = colorStateList4.getColorForState(iArr, this.Z0);
        } else {
            i2 = 0;
        }
        if (this.Z0 != i2) {
            this.Z0 = i2;
            onStateChange = true;
        }
        int a = be.a(i2, i);
        if (this.a1 != a) {
            z = true;
        } else {
            z = false;
        }
        if (this.P.c == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z | z2) {
            this.a1 = a;
            i(ColorStateList.valueOf(a));
            onStateChange = true;
        }
        ColorStateList colorStateList5 = this.p0;
        if (colorStateList5 != null) {
            i3 = colorStateList5.getColorForState(iArr, this.b1);
        } else {
            i3 = 0;
        }
        if (this.b1 != i3) {
            this.b1 = i3;
            onStateChange = true;
        }
        if (this.n1 != null && am0.c(iArr)) {
            i4 = this.n1.getColorForState(iArr, this.c1);
        } else {
            i4 = 0;
        }
        if (this.c1 != i4) {
            this.c1 = i4;
            if (this.m1) {
                onStateChange = true;
            }
        }
        iw0 iw0Var = this.X0.f;
        if (iw0Var != null && (colorStateList2 = iw0Var.b) != null) {
            i5 = colorStateList2.getColorForState(iArr, this.d1);
        } else {
            i5 = 0;
        }
        if (this.d1 != i5) {
            this.d1 = i5;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i7 : state) {
                if (i7 == 16842912) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (z3 && this.E0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.e1 != z4 && this.G0 != null) {
            float o = o();
            this.e1 = z4;
            if (o != o()) {
                onStateChange = true;
                z5 = true;
                colorStateList = this.j1;
                if (colorStateList == null) {
                    i6 = colorStateList.getColorForState(iArr, this.f1);
                } else {
                    i6 = 0;
                }
                if (this.f1 == i6) {
                    this.f1 = i6;
                    ColorStateList colorStateList6 = this.j1;
                    PorterDuff.Mode mode = this.k1;
                    if (colorStateList6 != null && mode != null) {
                        porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                    } else {
                        porterDuffColorFilter = null;
                    }
                    this.i1 = porterDuffColorFilter;
                } else {
                    z6 = onStateChange;
                }
                if (s(this.u0)) {
                    z6 |= this.u0.setState(iArr);
                }
                if (s(this.G0)) {
                    z6 |= this.G0.setState(iArr);
                }
                if (s(this.z0)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z6 |= this.z0.setState(iArr3);
                }
                if (am0.a && s(this.A0)) {
                    z6 |= this.A0.setState(iArr2);
                }
                if (z6) {
                    invalidateSelf();
                }
                if (z5) {
                    t();
                }
                return z6;
            }
            onStateChange = true;
        }
        z5 = false;
        colorStateList = this.j1;
        if (colorStateList == null) {
        }
        if (this.f1 == i6) {
        }
        if (s(this.u0)) {
        }
        if (s(this.G0)) {
        }
        if (s(this.z0)) {
        }
        if (am0.a) {
            z6 |= this.A0.setState(iArr2);
        }
        if (z6) {
        }
        if (z5) {
        }
        return z6;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v(boolean z) {
        if (this.E0 != z) {
            this.E0 = z;
            float o = o();
            if (!z && this.e1) {
                this.e1 = false;
            }
            float o2 = o();
            invalidateSelf();
            if (o != o2) {
                t();
            }
        }
    }

    public final void w(Drawable drawable) {
        if (this.G0 != drawable) {
            float o = o();
            this.G0 = drawable;
            float o2 = o();
            R(this.G0);
            m(this.G0);
            invalidateSelf();
            if (o != o2) {
                t();
            }
        }
    }

    public final void x(boolean z) {
        if (this.F0 != z) {
            boolean O = O();
            this.F0 = z;
            boolean O2 = O();
            if (O != O2) {
                if (O2) {
                    m(this.G0);
                } else {
                    R(this.G0);
                }
                invalidateSelf();
                t();
            }
        }
    }

    @Deprecated
    public final void y(float f) {
        if (this.o0 != f) {
            this.o0 = f;
            setShapeAppearanceModel(this.P.a.e(f));
        }
    }

    public final void z(Drawable drawable) {
        Drawable drawable2 = this.u0;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof y71) {
                drawable2 = ((y71) drawable2).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float o = o();
            if (drawable != null) {
                drawable3 = km.h(drawable).mutate();
            }
            this.u0 = drawable3;
            float o2 = o();
            R(drawable2);
            if (P()) {
                m(this.u0);
            }
            invalidateSelf();
            if (o != o2) {
                t();
            }
        }
    }
}