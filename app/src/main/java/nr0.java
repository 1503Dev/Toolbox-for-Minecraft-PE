package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;

/* renamed from: nr0  reason: default package */
public final class nr0 {
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    /* renamed from: nr0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends f {
        public final c b;

        public a(c cVar) {
            this.b = cVar;
        }

        @Override // defpackage.nr0.f
        public final void a(Matrix matrix, ir0 ir0Var, int i, Canvas canvas) {
            boolean z;
            c cVar = this.b;
            float f = cVar.f;
            float f2 = cVar.g;
            c cVar2 = this.b;
            RectF rectF = new RectF(cVar2.b, cVar2.c, cVar2.d, cVar2.e);
            if (f2 < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            Path path = ir0Var.g;
            if (z) {
                int[] iArr = ir0.j;
                iArr[0] = 0;
                iArr[1] = ir0Var.f;
                iArr[2] = ir0Var.e;
                iArr[3] = ir0Var.d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = -i;
                rectF.inset(f3, f3);
                int[] iArr2 = ir0.j;
                iArr2[0] = 0;
                iArr2[1] = ir0Var.d;
                iArr2[2] = ir0Var.e;
                iArr2[3] = ir0Var.f;
            }
            float width = 1.0f - (i / (rectF.width() / 2.0f));
            float[] fArr = ir0.k;
            fArr[1] = width;
            fArr[2] = ((1.0f - width) / 2.0f) + width;
            ir0Var.b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, ir0.j, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            canvas.drawArc(rectF, f, f2, true, ir0Var.b);
            canvas.restore();
        }
    }

    /* renamed from: nr0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends f {
        public final d b;
        public final float c;
        public final float d;

        public b(d dVar, float f, float f2) {
            this.b = dVar;
            this.c = f;
            this.d = f2;
        }

        @Override // defpackage.nr0.f
        public final void a(Matrix matrix, ir0 ir0Var, int i, Canvas canvas) {
            d dVar = this.b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(dVar.c - this.d, dVar.b - this.c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.c, this.d);
            matrix2.preRotate(b());
            ir0Var.getClass();
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int[] iArr = ir0.h;
            iArr[0] = ir0Var.f;
            iArr[1] = ir0Var.e;
            iArr[2] = ir0Var.d;
            Paint paint = ir0Var.c;
            float f = rectF.left;
            paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, ir0.i, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, ir0Var.c);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.b;
            return (float) Math.toDegrees(Math.atan((dVar.c - this.d) / (dVar.b - this.c)));
        }
    }

    /* renamed from: nr0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends e {
        public static final RectF h = new RectF();
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;

        public c(float f, float f2, float f3, float f4) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }

        @Override // defpackage.nr0.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = h;
            rectF.set(this.b, this.c, this.d, this.e);
            path.arcTo(rectF, this.f, this.g, false);
            path.transform(matrix);
        }
    }

    /* renamed from: nr0$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d extends e {
        public float b;
        public float c;

        @Override // defpackage.nr0.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* renamed from: nr0$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class e {
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* renamed from: nr0$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class f {
        public static final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, ir0 ir0Var, int i, Canvas canvas);
    }

    public nr0() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        boolean z;
        float f8;
        c cVar = new c(f2, f3, f4, f5);
        cVar.f = f6;
        cVar.g = f7;
        this.g.add(cVar);
        a aVar = new a(cVar);
        float f9 = f6 + f7;
        if (f7 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        if (z) {
            f8 = (180.0f + f9) % 360.0f;
        } else {
            f8 = f9;
        }
        b(f6);
        this.h.add(aVar);
        this.e = f8;
        double d2 = f9;
        this.c = (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f2 + f4) * 0.5f);
        this.d = (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f3 + f5) * 0.5f);
    }

    public final void b(float f2) {
        float f3 = this.e;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.c;
        float f6 = this.d;
        c cVar = new c(f5, f6, f5, f6);
        cVar.f = this.e;
        cVar.g = f4;
        this.h.add(new a(cVar));
        this.e = f2;
    }

    public final void c(float f2, float f3) {
        d dVar = new d();
        dVar.b = f2;
        dVar.c = f3;
        this.g.add(dVar);
        b bVar = new b(dVar, this.c, this.d);
        b(bVar.b() + 270.0f);
        this.h.add(bVar);
        this.e = bVar.b() + 270.0f;
        this.c = f2;
        this.d = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.a = 0.0f;
        this.b = f2;
        this.c = 0.0f;
        this.d = f2;
        this.e = f3;
        this.f = (f3 + f4) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}