package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import defpackage.kr0;
import defpackage.nr0;
import java.util.Objects;

/* renamed from: o40  reason: default package */
public class o40 extends Drawable implements dx0, or0 {
    public static final Paint k0 = new Paint(1);
    public b P;
    public final nr0.f[] Q;
    public final nr0.f[] R;
    public boolean S;
    public final Matrix T;
    public final Path U;
    public final Path V;
    public final RectF W;
    public final RectF X;
    public final Region Y;
    public final Region Z;
    public kr0 a0;
    public final Paint b0;
    public final Paint c0;
    public final ir0 d0;
    public final a e0;
    public final lr0 f0;
    public PorterDuffColorFilter g0;
    public PorterDuffColorFilter h0;
    public Rect i0;
    public final RectF j0;

    /* renamed from: o40$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a {
        public a() {
        }
    }

    /* renamed from: o40$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b extends Drawable.ConstantState {
        public kr0 a;
        public go b;
        public ColorStateList c;
        public ColorStateList d;
        public ColorStateList e;
        public ColorStateList f;
        public PorterDuff.Mode g;
        public Rect h;
        public float i;
        public float j;
        public float k;
        public int l;
        public float m;
        public float n;
        public float o;
        public int p;
        public int q;
        public int r;
        public int s;
        public boolean t;
        public Paint.Style u;

        public b(kr0 kr0Var) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = PorterDuff.Mode.SRC_IN;
            this.h = null;
            this.i = 1.0f;
            this.j = 1.0f;
            this.l = 255;
            this.m = 0.0f;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = false;
            this.u = Paint.Style.FILL_AND_STROKE;
            this.a = kr0Var;
            this.b = null;
        }

        public b(b bVar) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = PorterDuff.Mode.SRC_IN;
            this.h = null;
            this.i = 1.0f;
            this.j = 1.0f;
            this.l = 255;
            this.m = 0.0f;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = false;
            this.u = Paint.Style.FILL_AND_STROKE;
            this.a = bVar.a;
            this.b = bVar.b;
            this.k = bVar.k;
            this.c = bVar.c;
            this.d = bVar.d;
            this.g = bVar.g;
            this.f = bVar.f;
            this.l = bVar.l;
            this.i = bVar.i;
            this.r = bVar.r;
            this.p = bVar.p;
            this.t = bVar.t;
            this.j = bVar.j;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.q = bVar.q;
            this.s = bVar.s;
            this.e = bVar.e;
            this.u = bVar.u;
            if (bVar.h != null) {
                this.h = new Rect(bVar.h);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            o40 o40Var = new o40(this);
            o40Var.S = true;
            return o40Var;
        }
    }

    public o40() {
        this(new kr0());
    }

    public o40(kr0 kr0Var) {
        this(new b(kr0Var));
    }

    public o40(b bVar) {
        this.Q = new nr0.f[4];
        this.R = new nr0.f[4];
        this.T = new Matrix();
        this.U = new Path();
        this.V = new Path();
        this.W = new RectF();
        this.X = new RectF();
        this.Y = new Region();
        this.Z = new Region();
        Paint paint = new Paint(1);
        this.b0 = paint;
        Paint paint2 = new Paint(1);
        this.c0 = paint2;
        this.d0 = new ir0();
        this.f0 = new lr0();
        this.j0 = new RectF();
        this.P = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = k0;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        k();
        j(getState());
        this.e0 = new a();
    }

    public static void e(Canvas canvas, Paint paint, Path path, kr0 kr0Var, RectF rectF) {
        if (kr0Var.d(rectF)) {
            float a2 = kr0Var.f.a(rectF);
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void b(RectF rectF, Path path) {
        lr0 lr0Var = this.f0;
        b bVar = this.P;
        lr0Var.a(bVar.a, bVar.j, rectF, this.e0, path);
        if (this.P.i != 1.0f) {
            this.T.reset();
            Matrix matrix = this.T;
            float f = this.P.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.T);
        }
        path.computeBounds(this.j0, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = d(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z && (d = d((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    public final int d(int i) {
        boolean z;
        b bVar = this.P;
        float f = bVar.n + bVar.o + bVar.m;
        go goVar = bVar.b;
        if (goVar != null && goVar.a) {
            if (be.c(i, 255) == goVar.c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                float f2 = goVar.d;
                float f3 = 0.0f;
                if (f2 > 0.0f && f > 0.0f) {
                    f3 = Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                }
                return be.c(nu2.c(f3, be.c(i, 255), goVar.b), Color.alpha(i));
            }
            return i;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0143, code lost:
        if (r4 != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c1  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        boolean z;
        Paint.Style style;
        boolean z2;
        Paint.Style style2;
        boolean z3;
        boolean z4;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        int i;
        boolean z5;
        boolean z6;
        float f;
        boolean z7;
        float f2;
        this.b0.setColorFilter(this.g0);
        int alpha = this.b0.getAlpha();
        Paint paint = this.b0;
        int i2 = this.P.l;
        paint.setAlpha(((i2 + (i2 >>> 7)) * alpha) >>> 8);
        this.c0.setColorFilter(this.h0);
        this.c0.setStrokeWidth(this.P.k);
        int alpha2 = this.c0.getAlpha();
        Paint paint2 = this.c0;
        int i3 = this.P.l;
        paint2.setAlpha(((i3 + (i3 >>> 7)) * alpha2) >>> 8);
        float f3 = 0.0f;
        if (this.S) {
            Paint.Style style3 = this.P.u;
            if ((style3 == Paint.Style.FILL_AND_STROKE || style3 == Paint.Style.STROKE) && this.c0.getStrokeWidth() > 0.0f) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                f = this.c0.getStrokeWidth() / 2.0f;
            } else {
                f = 0.0f;
            }
            float f4 = -f;
            kr0 kr0Var = this.P.a;
            kr0Var.getClass();
            kr0.a aVar = new kr0.a(kr0Var);
            tg tgVar = kr0Var.e;
            if (!(tgVar instanceof lk0)) {
                tgVar = new n3(f4, tgVar);
            }
            aVar.e = tgVar;
            tg tgVar2 = kr0Var.f;
            if (!(tgVar2 instanceof lk0)) {
                tgVar2 = new n3(f4, tgVar2);
            }
            aVar.f = tgVar2;
            tg tgVar3 = kr0Var.h;
            if (!(tgVar3 instanceof lk0)) {
                tgVar3 = new n3(f4, tgVar3);
            }
            aVar.h = tgVar3;
            tg tgVar4 = kr0Var.g;
            if (!(tgVar4 instanceof lk0)) {
                tgVar4 = new n3(f4, tgVar4);
            }
            aVar.g = tgVar4;
            kr0 kr0Var2 = new kr0(aVar);
            this.a0 = kr0Var2;
            lr0 lr0Var = this.f0;
            float f5 = this.P.j;
            RectF f6 = f();
            Paint.Style style4 = this.P.u;
            if ((style4 == Paint.Style.FILL_AND_STROKE || style4 == Paint.Style.STROKE) && this.c0.getStrokeWidth() > 0.0f) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                f2 = this.c0.getStrokeWidth() / 2.0f;
            } else {
                f2 = 0.0f;
            }
            this.X.set(f6.left + f2, f6.top + f2, f6.right - f2, f6.bottom - f2);
            lr0Var.a(kr0Var2, f5, this.X, null, this.V);
            b(f(), this.U);
            this.S = false;
        }
        b bVar5 = this.P;
        int i4 = bVar5.p;
        if (i4 != 1 && bVar5.q > 0) {
            if (i4 != 2) {
                if (Build.VERSION.SDK_INT >= 21 && (bVar5.a.d(f()) || fm.c(this.U))) {
                    z5 = false;
                } else {
                    z5 = true;
                }
            }
            z = true;
            if (z) {
                canvas.save();
                double d = this.P.r;
                double sin = Math.sin(Math.toRadians(bVar.s));
                Double.isNaN(d);
                Double.isNaN(d);
                int i5 = (int) (sin * d);
                double d2 = this.P.r;
                double cos = Math.cos(Math.toRadians(bVar2.s));
                Double.isNaN(d2);
                Double.isNaN(d2);
                int i6 = (int) (cos * d2);
                if (Build.VERSION.SDK_INT < 21) {
                    Rect clipBounds = canvas.getClipBounds();
                    int i7 = -this.P.q;
                    clipBounds.inset(i7, i7);
                    clipBounds.offset(i5, i6);
                    canvas.clipRect(clipBounds, Region.Op.REPLACE);
                }
                canvas.translate(i5, i6);
                int width = (int) (this.j0.width() - getBounds().width());
                int height = (int) (this.j0.height() - getBounds().height());
                Bitmap createBitmap = Bitmap.createBitmap((this.P.q * 2) + ((int) this.j0.width()) + width, (this.P.q * 2) + ((int) this.j0.height()) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f7 = (getBounds().left - this.P.q) - width;
                float f8 = (getBounds().top - this.P.q) - height;
                canvas2.translate(-f7, -f8);
                if (this.P.r != 0) {
                    canvas2.drawPath(this.U, this.d0.a);
                }
                for (int i8 = 0; i8 < 4; i8++) {
                    nr0.f fVar = this.Q[i8];
                    ir0 ir0Var = this.d0;
                    int i9 = this.P.q;
                    Matrix matrix = nr0.f.a;
                    fVar.a(matrix, ir0Var, i9, canvas2);
                    this.R[i8].a(matrix, this.d0, this.P.q, canvas2);
                }
                double d3 = this.P.r;
                double sin2 = Math.sin(Math.toRadians(bVar3.s));
                Double.isNaN(d3);
                Double.isNaN(d3);
                int i10 = (int) (sin2 * d3);
                double d4 = this.P.r;
                double cos2 = Math.cos(Math.toRadians(bVar4.s));
                Double.isNaN(d4);
                Double.isNaN(d4);
                canvas2.translate(-i10, -i);
                canvas2.drawPath(this.U, k0);
                canvas2.translate(i10, (int) (cos2 * d4));
                canvas.drawBitmap(createBitmap, f7, f8, (Paint) null);
                createBitmap.recycle();
                canvas.restore();
            }
            b bVar6 = this.P;
            style = bVar6.u;
            if (style == Paint.Style.FILL_AND_STROKE && style != Paint.Style.FILL) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                e(canvas, this.b0, this.U, bVar6.a, f());
            }
            style2 = this.P.u;
            if ((style2 != Paint.Style.FILL_AND_STROKE || style2 == Paint.Style.STROKE) && this.c0.getStrokeWidth() > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                Paint paint3 = this.c0;
                Path path = this.V;
                kr0 kr0Var3 = this.a0;
                RectF f9 = f();
                Paint.Style style5 = this.P.u;
                if ((style5 == Paint.Style.FILL_AND_STROKE || style5 == Paint.Style.STROKE) && this.c0.getStrokeWidth() > 0.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    f3 = this.c0.getStrokeWidth() / 2.0f;
                }
                this.X.set(f9.left + f3, f9.top + f3, f9.right - f3, f9.bottom - f3);
                e(canvas, paint3, path, kr0Var3, this.X);
            }
            this.b0.setAlpha(alpha);
            this.c0.setAlpha(alpha2);
        }
        z = false;
        if (z) {
        }
        b bVar62 = this.P;
        style = bVar62.u;
        if (style == Paint.Style.FILL_AND_STROKE) {
        }
        z2 = true;
        if (z2) {
        }
        style2 = this.P.u;
        if (style2 != Paint.Style.FILL_AND_STROKE) {
        }
        z3 = true;
        if (z3) {
        }
        this.b0.setAlpha(alpha);
        this.c0.setAlpha(alpha2);
    }

    public final RectF f() {
        Rect bounds = getBounds();
        this.W.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        return this.W;
    }

    public final void g(Context context) {
        this.P.b = new go(context);
        l();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.P;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        b bVar = this.P;
        if (bVar.p == 2) {
            return;
        }
        if (bVar.a.d(f())) {
            outline.setRoundRect(getBounds(), this.P.a.e.a(f()));
            return;
        }
        b(f(), this.U);
        if (this.U.isConvex()) {
            outline.setConvexPath(this.U);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.i0;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.Y.set(getBounds());
        b(f(), this.U);
        this.Z.setPath(this.U, this.Y);
        this.Y.op(this.Z, Region.Op.DIFFERENCE);
        return this.Y;
    }

    public final void h(float f) {
        b bVar = this.P;
        if (bVar.n != f) {
            bVar.n = f;
            l();
        }
    }

    public final void i(ColorStateList colorStateList) {
        b bVar = this.P;
        if (bVar.c != colorStateList) {
            bVar.c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.S = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.P.f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.P.e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.P.d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.P.c) != null && colorStateList4.isStateful())));
    }

    public final boolean j(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.P.c == null || color2 == (colorForState2 = this.P.c.getColorForState(iArr, (color2 = this.b0.getColor())))) {
            z = false;
        } else {
            this.b0.setColor(colorForState2);
            z = true;
        }
        if (this.P.d == null || color == (colorForState = this.P.d.getColorForState(iArr, (color = this.c0.getColor())))) {
            return z;
        }
        this.c0.setColor(colorForState);
        return true;
    }

    public final boolean k() {
        PorterDuffColorFilter porterDuffColorFilter = this.g0;
        PorterDuffColorFilter porterDuffColorFilter2 = this.h0;
        b bVar = this.P;
        this.g0 = c(bVar.f, bVar.g, this.b0, true);
        b bVar2 = this.P;
        this.h0 = c(bVar2.e, bVar2.g, this.c0, false);
        b bVar3 = this.P;
        if (bVar3.t) {
            ir0 ir0Var = this.d0;
            int colorForState = bVar3.f.getColorForState(getState(), 0);
            ir0Var.getClass();
            ir0Var.d = be.c(colorForState, 68);
            ir0Var.e = be.c(colorForState, 20);
            ir0Var.f = be.c(colorForState, 0);
        }
        if (!Objects.equals(porterDuffColorFilter, this.g0) || !Objects.equals(porterDuffColorFilter2, this.h0)) {
            return true;
        }
        return false;
    }

    public final void l() {
        b bVar = this.P;
        float f = bVar.n + bVar.o;
        bVar.q = (int) Math.ceil(0.75f * f);
        this.P.r = (int) Math.ceil(f * 0.25f);
        k();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.P = new b(this.P);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.S = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.mw0.b
    public boolean onStateChange(int[] iArr) {
        boolean z = j(iArr) || k();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        b bVar = this.P;
        if (bVar.l != i) {
            bVar.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.P.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.or0
    public final void setShapeAppearanceModel(kr0 kr0Var) {
        this.P.a = kr0Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dx0
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dx0
    public void setTintList(ColorStateList colorStateList) {
        this.P.f = colorStateList;
        k();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dx0
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.P;
        if (bVar.g != mode) {
            bVar.g = mode;
            k();
            super.invalidateSelf();
        }
    }
}