package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import defpackage.de0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: g31  reason: default package */
public final class g31 extends f31 {
    public static final PorterDuff.Mode Y = PorterDuff.Mode.SRC_IN;
    public g Q;
    public PorterDuffColorFilter R;
    public ColorFilter S;
    public boolean T;
    public boolean U;
    public final float[] V;
    public final Matrix W;
    public final Rect X;

    /* renamed from: g31$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    /* renamed from: g31$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends e {
        public ue e;
        public float f;
        public ue g;
        public float h;
        public float i;
        public float j;
        public float k;
        public float l;
        public Paint.Cap m;
        public Paint.Join n;
        public float o;

        public b() {
            this.f = 0.0f;
            this.h = 1.0f;
            this.i = 1.0f;
            this.j = 0.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = Paint.Cap.BUTT;
            this.n = Paint.Join.MITER;
            this.o = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.f = 0.0f;
            this.h = 1.0f;
            this.i = 1.0f;
            this.j = 0.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = Paint.Cap.BUTT;
            this.n = Paint.Join.MITER;
            this.o = 4.0f;
            this.e = bVar.e;
            this.f = bVar.f;
            this.h = bVar.h;
            this.g = bVar.g;
            this.c = bVar.c;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
        }

        @Override // defpackage.g31.d
        public final boolean a() {
            return this.g.b() || this.e.b();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        @Override // defpackage.g31.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean b(int[] iArr) {
            boolean z;
            ue ueVar;
            ue ueVar2 = this.g;
            boolean z2 = true;
            if (ueVar2.b()) {
                ColorStateList colorStateList = ueVar2.b;
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (colorForState != ueVar2.c) {
                    ueVar2.c = colorForState;
                    z = true;
                    ueVar = this.e;
                    if (ueVar.b()) {
                        ColorStateList colorStateList2 = ueVar.b;
                        int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                        if (colorForState2 != ueVar.c) {
                            ueVar.c = colorForState2;
                            return z2 | z;
                        }
                    }
                    z2 = false;
                    return z2 | z;
                }
            }
            z = false;
            ueVar = this.e;
            if (ueVar.b()) {
            }
            z2 = false;
            return z2 | z;
        }

        public float getFillAlpha() {
            return this.i;
        }

        public int getFillColor() {
            return this.g.c;
        }

        public float getStrokeAlpha() {
            return this.h;
        }

        public int getStrokeColor() {
            return this.e.c;
        }

        public float getStrokeWidth() {
            return this.f;
        }

        public float getTrimPathEnd() {
            return this.k;
        }

        public float getTrimPathOffset() {
            return this.l;
        }

        public float getTrimPathStart() {
            return this.j;
        }

        public void setFillAlpha(float f) {
            this.i = f;
        }

        public void setFillColor(int i) {
            this.g.c = i;
        }

        public void setStrokeAlpha(float f) {
            this.h = f;
        }

        public void setStrokeColor(int i) {
            this.e.c = i;
        }

        public void setStrokeWidth(float f) {
            this.f = f;
        }

        public void setTrimPathEnd(float f) {
            this.k = f;
        }

        public void setTrimPathOffset(float f) {
            this.l = f;
        }

        public void setTrimPathStart(float f) {
            this.j = f;
        }
    }

    /* renamed from: g31$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: g31$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class f {
        public static final Matrix p = new Matrix();
        public final Path a;
        public final Path b;
        public final Matrix c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public final c g;
        public float h;
        public float i;
        public float j;
        public float k;
        public int l;
        public String m;
        public Boolean n;
        public final e7<String, Object> o;

        public f() {
            this.c = new Matrix();
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 255;
            this.m = null;
            this.n = null;
            this.o = new e7<>();
            this.g = new c();
            this.a = new Path();
            this.b = new Path();
        }

        public f(f fVar) {
            this.c = new Matrix();
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 255;
            this.m = null;
            this.n = null;
            e7<String, Object> e7Var = new e7<>();
            this.o = e7Var;
            this.g = new c(fVar.g, e7Var);
            this.a = new Path(fVar.a);
            this.b = new Path(fVar.b);
            this.h = fVar.h;
            this.i = fVar.i;
            this.j = fVar.j;
            this.k = fVar.k;
            this.l = fVar.l;
            this.m = fVar.m;
            String str = fVar.m;
            if (str != null) {
                e7Var.put(str, this);
            }
            this.n = fVar.n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r9v19 */
        public final void a(c cVar, Matrix matrix, Canvas canvas, int i, int i2) {
            float f;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            Path.FillType fillType;
            Path.FillType fillType2;
            cVar.a.set(matrix);
            cVar.a.preConcat(cVar.j);
            canvas.save();
            ?? r9 = 0;
            f fVar = this;
            int i3 = 0;
            while (i3 < cVar.b.size()) {
                d dVar = cVar.b.get(i3);
                if (dVar instanceof c) {
                    a((c) dVar, cVar.a, canvas, i, i2);
                } else if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    float f2 = i / fVar.j;
                    float f3 = i2 / fVar.k;
                    float min = Math.min(f2, f3);
                    Matrix matrix2 = cVar.a;
                    fVar.c.set(matrix2);
                    fVar.c.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f4 = (fArr[r9] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot(fArr[r9], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                    if (max > 0.0f) {
                        f = Math.abs(f4) / max;
                    } else {
                        f = 0.0f;
                    }
                    if (f != 0.0f) {
                        Path path = this.a;
                        eVar.getClass();
                        path.reset();
                        de0.a[] aVarArr = eVar.a;
                        if (aVarArr != null) {
                            de0.a.b(aVarArr, path);
                        }
                        Path path2 = this.a;
                        this.b.reset();
                        if (eVar instanceof a) {
                            Path path3 = this.b;
                            if (eVar.c == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path3.setFillType(fillType2);
                            this.b.addPath(path2, this.c);
                            canvas.clipPath(this.b);
                        } else {
                            b bVar = (b) eVar;
                            float f5 = bVar.j;
                            if (f5 != 0.0f || bVar.k != 1.0f) {
                                float f6 = bVar.l;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (bVar.k + f6) % 1.0f;
                                if (this.f == null) {
                                    this.f = new PathMeasure();
                                }
                                this.f.setPath(this.a, r9);
                                float length = this.f.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path2.reset();
                                if (f9 > f10) {
                                    this.f.getSegment(f9, length, path2, true);
                                    this.f.getSegment(0.0f, f10, path2, true);
                                } else {
                                    this.f.getSegment(f9, f10, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            this.b.addPath(path2, this.c);
                            ue ueVar = bVar.g;
                            if (ueVar.a != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z && ueVar.c == 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                if (this.e == null) {
                                    Paint paint = new Paint(1);
                                    this.e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.e;
                                Shader shader = ueVar.a;
                                if (shader != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    shader.setLocalMatrix(this.c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(bVar.i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i4 = ueVar.c;
                                    float f11 = bVar.i;
                                    PorterDuff.Mode mode = g31.Y;
                                    paint2.setColor((i4 & 16777215) | (((int) (Color.alpha(i4) * f11)) << 24));
                                }
                                paint2.setColorFilter(null);
                                Path path4 = this.b;
                                if (bVar.c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path4.setFillType(fillType);
                                canvas.drawPath(this.b, paint2);
                            }
                            ue ueVar2 = bVar.e;
                            if (ueVar2.a != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3 && ueVar2.c == 0) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                if (this.d == null) {
                                    z5 = true;
                                    Paint paint3 = new Paint(1);
                                    this.d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                } else {
                                    z5 = true;
                                }
                                Paint paint4 = this.d;
                                Paint.Join join = bVar.n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.o);
                                Shader shader2 = ueVar2.a;
                                if (shader2 == null) {
                                    z5 = false;
                                }
                                if (z5) {
                                    shader2.setLocalMatrix(this.c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(bVar.h * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i5 = ueVar2.c;
                                    float f12 = bVar.h;
                                    PorterDuff.Mode mode2 = g31.Y;
                                    paint4.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f12)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(bVar.f * f * min);
                                canvas.drawPath(this.b, paint4);
                            }
                        }
                    }
                    fVar = this;
                    i3++;
                    r9 = 0;
                }
                i3++;
                r9 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.l = i;
        }
    }

    /* renamed from: g31$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class g extends Drawable.ConstantState {
        public int a;
        public f b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;

        public g() {
            this.c = null;
            this.d = g31.Y;
            this.b = new f();
        }

        public g(g gVar) {
            this.c = null;
            this.d = g31.Y;
            if (gVar != null) {
                this.a = gVar.a;
                f fVar = new f(gVar.b);
                this.b = fVar;
                if (gVar.b.e != null) {
                    fVar.e = new Paint(gVar.b.e);
                }
                if (gVar.b.d != null) {
                    this.b.d = new Paint(gVar.b.d);
                }
                this.c = gVar.c;
                this.d = gVar.d;
                this.e = gVar.e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new g31(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new g31(this);
        }
    }

    /* renamed from: g31$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class h extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public h(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return sm.a(this.a);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            g31 g31Var = new g31();
            g31Var.P = (VectorDrawable) this.a.newDrawable();
            return g31Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            g31 g31Var = new g31();
            g31Var.P = (VectorDrawable) this.a.newDrawable(resources);
            return g31Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            Drawable newDrawable;
            g31 g31Var = new g31();
            newDrawable = this.a.newDrawable(resources, theme);
            g31Var.P = (VectorDrawable) newDrawable;
            return g31Var;
        }
    }

    public g31() {
        this.U = true;
        this.V = new float[9];
        this.W = new Matrix();
        this.X = new Rect();
        this.Q = new g();
    }

    public g31(g gVar) {
        this.U = true;
        this.V = new float[9];
        this.W = new Matrix();
        this.X = new Rect();
        this.Q = gVar;
        this.R = a(gVar.c, gVar.d);
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.P;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        pm.b(drawable);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
        if (r8 == false) goto L66;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        Paint paint;
        boolean z3;
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.X);
        if (this.X.width() > 0 && this.X.height() > 0) {
            ColorFilter colorFilter = this.S;
            if (colorFilter == null) {
                colorFilter = this.R;
            }
            canvas.getMatrix(this.W);
            this.W.getValues(this.V);
            boolean z4 = false;
            float abs = Math.abs(this.V[0]);
            float abs2 = Math.abs(this.V[4]);
            float abs3 = Math.abs(this.V[1]);
            float abs4 = Math.abs(this.V[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (this.X.width() * abs));
            int min2 = Math.min(2048, (int) (this.X.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.X;
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && km.b(this) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    canvas.translate(this.X.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.X.offsetTo(0, 0);
                g gVar = this.Q;
                Bitmap bitmap = gVar.f;
                if (bitmap != null) {
                    if (min == bitmap.getWidth() && min2 == gVar.f.getHeight()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                gVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                gVar.k = true;
                if (!this.U) {
                    g gVar2 = this.Q;
                    gVar2.f.eraseColor(0);
                    Canvas canvas2 = new Canvas(gVar2.f);
                    f fVar = gVar2.b;
                    fVar.a(fVar.g, f.p, canvas2, min, min2);
                } else {
                    g gVar3 = this.Q;
                    if (!gVar3.k && gVar3.g == gVar3.c && gVar3.h == gVar3.d && gVar3.j == gVar3.e && gVar3.i == gVar3.b.getRootAlpha()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        g gVar4 = this.Q;
                        gVar4.f.eraseColor(0);
                        Canvas canvas3 = new Canvas(gVar4.f);
                        f fVar2 = gVar4.b;
                        fVar2.a(fVar2.g, f.p, canvas3, min, min2);
                        g gVar5 = this.Q;
                        gVar5.g = gVar5.c;
                        gVar5.h = gVar5.d;
                        gVar5.i = gVar5.b.getRootAlpha();
                        gVar5.j = gVar5.e;
                        gVar5.k = false;
                    }
                }
                g gVar6 = this.Q;
                Rect rect2 = this.X;
                if (gVar6.b.getRootAlpha() < 255) {
                    z4 = true;
                }
                if (!z4 && colorFilter == null) {
                    paint = null;
                } else {
                    if (gVar6.l == null) {
                        Paint paint2 = new Paint();
                        gVar6.l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    gVar6.l.setAlpha(gVar6.b.getRootAlpha());
                    gVar6.l.setColorFilter(colorFilter);
                    paint = gVar6.l;
                }
                canvas.drawBitmap(gVar6.f, (Rect) null, rect2, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.P;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.Q.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.P;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.Q.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.P;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                return fm.a(drawable);
            }
            return null;
        }
        return this.S;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.P == null || Build.VERSION.SDK_INT < 24) {
            this.Q.a = getChangingConfigurations();
            return this.Q;
        }
        return new h(this.P.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.P;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.Q.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.P;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.Q.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.P;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        ColorStateList colorStateList;
        int i;
        Drawable drawable = this.P;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.inflate(resources, xmlPullParser, attributeSet, theme);
                return;
            } else {
                drawable.inflate(resources, xmlPullParser, attributeSet);
                return;
            }
        }
        g gVar = this.Q;
        gVar.b = new f();
        TypedArray f2 = v11.f(resources, theme, attributeSet, c4.a);
        g gVar2 = this.Q;
        f fVar = gVar2.b;
        int c2 = v11.c(f2, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (c2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (c2 != 5) {
            if (c2 != 9) {
                switch (c2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        gVar2.d = mode;
        int i2 = 1;
        if (v11.e(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            f2.getValue(1, typedValue);
            int i3 = typedValue.type;
            if (i3 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i3 >= 28 && i3 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f2.getResources();
                int resourceId = f2.getResourceId(1, 0);
                ThreadLocal<TypedValue> threadLocal = ae.a;
                try {
                    colorStateList = ae.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
            if (colorStateList != null) {
                gVar2.c = colorStateList;
            }
            boolean z = gVar2.e;
            if (v11.e(xmlPullParser, "autoMirrored")) {
                z = f2.getBoolean(5, z);
            }
            gVar2.e = z;
            fVar.j = v11.b(f2, xmlPullParser, "viewportWidth", 7, fVar.j);
            float b2 = v11.b(f2, xmlPullParser, "viewportHeight", 8, fVar.k);
            fVar.k = b2;
            if (fVar.j > 0.0f) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
            } else if (b2 <= 0.0f) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
            } else {
                fVar.h = f2.getDimension(3, fVar.h);
                float dimension = f2.getDimension(2, fVar.i);
                fVar.i = dimension;
                if (fVar.h <= 0.0f) {
                    throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
                } else if (dimension > 0.0f) {
                    fVar.setAlpha(v11.b(f2, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                    String string = f2.getString(0);
                    if (string != null) {
                        fVar.m = string;
                        fVar.o.put(string, fVar);
                    }
                    f2.recycle();
                    gVar.a = getChangingConfigurations();
                    gVar.k = true;
                    g gVar3 = this.Q;
                    f fVar2 = gVar3.b;
                    ArrayDeque arrayDeque = new ArrayDeque();
                    arrayDeque.push(fVar2.g);
                    int eventType = xmlPullParser.getEventType();
                    int depth = xmlPullParser.getDepth() + 1;
                    boolean z2 = true;
                    for (int i4 = 3; eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != i4); i4 = 3) {
                        if (eventType == 2) {
                            String name = xmlPullParser.getName();
                            c cVar = (c) arrayDeque.peek();
                            if ("path".equals(name)) {
                                b bVar = new b();
                                TypedArray f3 = v11.f(resources, theme, attributeSet, c4.c);
                                if (v11.e(xmlPullParser, "pathData")) {
                                    String string2 = f3.getString(0);
                                    if (string2 != null) {
                                        bVar.b = string2;
                                    }
                                    String string3 = f3.getString(2);
                                    if (string3 != null) {
                                        bVar.a = de0.c(string3);
                                    }
                                    bVar.g = v11.a(f3, xmlPullParser, theme, "fillColor", 1);
                                    i = depth;
                                    bVar.i = v11.b(f3, xmlPullParser, "fillAlpha", 12, bVar.i);
                                    int c3 = v11.c(f3, xmlPullParser, "strokeLineCap", 8, -1);
                                    Paint.Cap cap = bVar.m;
                                    if (c3 == 0) {
                                        cap = Paint.Cap.BUTT;
                                    } else if (c3 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (c3 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                    bVar.m = cap;
                                    int c4 = v11.c(f3, xmlPullParser, "strokeLineJoin", 9, -1);
                                    Paint.Join join = bVar.n;
                                    if (c4 == 0) {
                                        join = Paint.Join.MITER;
                                    } else if (c4 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (c4 == 2) {
                                        join = Paint.Join.BEVEL;
                                    }
                                    bVar.n = join;
                                    bVar.o = v11.b(f3, xmlPullParser, "strokeMiterLimit", 10, bVar.o);
                                    bVar.e = v11.a(f3, xmlPullParser, theme, "strokeColor", 3);
                                    bVar.h = v11.b(f3, xmlPullParser, "strokeAlpha", 11, bVar.h);
                                    bVar.f = v11.b(f3, xmlPullParser, "strokeWidth", 4, bVar.f);
                                    bVar.k = v11.b(f3, xmlPullParser, "trimPathEnd", 6, bVar.k);
                                    bVar.l = v11.b(f3, xmlPullParser, "trimPathOffset", 7, bVar.l);
                                    bVar.j = v11.b(f3, xmlPullParser, "trimPathStart", 5, bVar.j);
                                    bVar.c = v11.c(f3, xmlPullParser, "fillType", 13, bVar.c);
                                } else {
                                    i = depth;
                                }
                                f3.recycle();
                                cVar.b.add(bVar);
                                if (bVar.getPathName() != null) {
                                    fVar2.o.put(bVar.getPathName(), bVar);
                                }
                                gVar3.a = bVar.d | gVar3.a;
                                z2 = false;
                            } else {
                                i = depth;
                                if ("clip-path".equals(name)) {
                                    a aVar = new a();
                                    if (v11.e(xmlPullParser, "pathData")) {
                                        TypedArray f4 = v11.f(resources, theme, attributeSet, c4.d);
                                        String string4 = f4.getString(0);
                                        if (string4 != null) {
                                            aVar.b = string4;
                                        }
                                        String string5 = f4.getString(1);
                                        if (string5 != null) {
                                            aVar.a = de0.c(string5);
                                        }
                                        aVar.c = v11.c(f4, xmlPullParser, "fillType", 2, 0);
                                        f4.recycle();
                                    }
                                    cVar.b.add(aVar);
                                    if (aVar.getPathName() != null) {
                                        fVar2.o.put(aVar.getPathName(), aVar);
                                    }
                                    gVar3.a = aVar.d | gVar3.a;
                                } else if ("group".equals(name)) {
                                    c cVar2 = new c();
                                    TypedArray f5 = v11.f(resources, theme, attributeSet, c4.b);
                                    cVar2.c = v11.b(f5, xmlPullParser, "rotation", 5, cVar2.c);
                                    cVar2.d = f5.getFloat(1, cVar2.d);
                                    cVar2.e = f5.getFloat(2, cVar2.e);
                                    cVar2.f = v11.b(f5, xmlPullParser, "scaleX", 3, cVar2.f);
                                    cVar2.g = v11.b(f5, xmlPullParser, "scaleY", 4, cVar2.g);
                                    cVar2.h = v11.b(f5, xmlPullParser, "translateX", 6, cVar2.h);
                                    cVar2.i = v11.b(f5, xmlPullParser, "translateY", 7, cVar2.i);
                                    String string6 = f5.getString(0);
                                    if (string6 != null) {
                                        cVar2.l = string6;
                                    }
                                    cVar2.c();
                                    f5.recycle();
                                    cVar.b.add(cVar2);
                                    arrayDeque.push(cVar2);
                                    if (cVar2.getGroupName() != null) {
                                        fVar2.o.put(cVar2.getGroupName(), cVar2);
                                    }
                                    gVar3.a = cVar2.k | gVar3.a;
                                }
                            }
                        } else {
                            i = depth;
                            if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                arrayDeque.pop();
                            }
                        }
                        eventType = xmlPullParser.next();
                        depth = i;
                        i2 = 1;
                    }
                    if (!z2) {
                        this.R = a(gVar.c, gVar.d);
                        return;
                    }
                    throw new XmlPullParserException("no path defined");
                } else {
                    throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
                }
            }
        }
        colorStateList = null;
        if (colorStateList != null) {
        }
        boolean z3 = gVar2.e;
        if (v11.e(xmlPullParser, "autoMirrored")) {
        }
        gVar2.e = z3;
        fVar.j = v11.b(f2, xmlPullParser, "viewportWidth", 7, fVar.j);
        float b22 = v11.b(f2, xmlPullParser, "viewportHeight", 8, fVar.k);
        fVar.k = b22;
        if (fVar.j > 0.0f) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.P;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.Q.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.P;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            g gVar = this.Q;
            if (gVar != null) {
                f fVar = gVar.b;
                if (fVar.n == null) {
                    fVar.n = Boolean.valueOf(fVar.g.a());
                }
                if (fVar.n.booleanValue() || ((colorStateList = this.Q.c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.T && super.mutate() == this) {
            this.Q = new g(this.Q);
            this.T = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.P;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        g gVar = this.Q;
        ColorStateList colorStateList = gVar.c;
        if (colorStateList != null && (mode = gVar.d) != null) {
            this.R = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        f fVar = gVar.b;
        if (fVar.n == null) {
            fVar.n = Boolean.valueOf(fVar.g.a());
        }
        if (fVar.n.booleanValue()) {
            boolean b2 = gVar.b.g.b(iArr);
            gVar.k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.Q.b.getRootAlpha() != i) {
            this.Q.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.Q.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.S = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dx0
    public final void setTint(int i) {
        Drawable drawable = this.P;
        if (drawable != null) {
            km.e(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dx0
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.P;
        if (drawable != null) {
            km.f(drawable, colorStateList);
            return;
        }
        g gVar = this.Q;
        if (gVar.c != colorStateList) {
            gVar.c = colorStateList;
            this.R = a(colorStateList, gVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dx0
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.P;
        if (drawable != null) {
            km.g(drawable, mode);
            return;
        }
        g gVar = this.Q;
        if (gVar.d != mode) {
            gVar.d = mode;
            this.R = a(gVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.P;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: g31$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends d {
        public final Matrix a;
        public final ArrayList<d> b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;
        public int k;
        public String l;

        public c() {
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.l = null;
        }

        @Override // defpackage.g31.d
        public final boolean a() {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.g31.d
        public final boolean b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.b.size(); i++) {
                z |= this.b.get(i).b(iArr);
            }
            return z;
        }

        public final void c() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        public String getGroupName() {
            return this.l;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                c();
            }
        }

        public void setRotation(float f) {
            if (f != this.c) {
                this.c = f;
                c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                c();
            }
        }

        public c(c cVar, e7<String, Object> e7Var) {
            e aVar;
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.l = null;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.i = cVar.i;
            String str = cVar.l;
            this.l = str;
            this.k = cVar.k;
            if (str != null) {
                e7Var.put(str, this);
            }
            matrix.set(cVar.j);
            ArrayList<d> arrayList = cVar.b;
            for (int i = 0; i < arrayList.size(); i++) {
                d dVar = arrayList.get(i);
                if (dVar instanceof c) {
                    this.b.add(new c((c) dVar, e7Var));
                } else {
                    if (dVar instanceof b) {
                        aVar = new b((b) dVar);
                    } else if (!(dVar instanceof a)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        aVar = new a((a) dVar);
                    }
                    this.b.add(aVar);
                    String str2 = aVar.b;
                    if (str2 != null) {
                        e7Var.put(str2, aVar);
                    }
                }
            }
        }
    }

    /* renamed from: g31$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class e extends d {
        public de0.a[] a;
        public String b;
        public int c;
        public int d;

        public e() {
            this.a = null;
            this.c = 0;
        }

        public de0.a[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(de0.a[] aVarArr) {
            if (!de0.a(this.a, aVarArr)) {
                this.a = de0.e(aVarArr);
                return;
            }
            de0.a[] aVarArr2 = this.a;
            for (int i = 0; i < aVarArr.length; i++) {
                aVarArr2[i].a = aVarArr[i].a;
                int i2 = 0;
                while (true) {
                    float[] fArr = aVarArr[i].b;
                    if (i2 < fArr.length) {
                        aVarArr2[i].b[i2] = fArr[i2];
                        i2++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.a = null;
            this.c = 0;
            this.b = eVar.b;
            this.d = eVar.d;
            this.a = de0.e(eVar.a);
        }
    }
}