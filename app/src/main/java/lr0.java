package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import defpackage.nr0;
import defpackage.o40;
import java.util.ArrayList;

/* renamed from: lr0  reason: default package */
public final class lr0 {
    public final nr0[] a = new nr0[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final nr0 e = new nr0();
    public final float[] f = new float[2];
    public final float[] g = new float[2];

    public lr0() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new nr0();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public final void a(kr0 kr0Var, float f, RectF rectF, o40.a aVar, Path path) {
        int i;
        float[] fArr;
        float centerX;
        float f2;
        fo foVar;
        tg tgVar;
        ga1 ga1Var;
        float f3;
        float f4;
        path.rewind();
        char c = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        tgVar = kr0Var.f;
                    } else {
                        tgVar = kr0Var.e;
                    }
                } else {
                    tgVar = kr0Var.h;
                }
            } else {
                tgVar = kr0Var.g;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        ga1Var = kr0Var.b;
                    } else {
                        ga1Var = kr0Var.a;
                    }
                } else {
                    ga1Var = kr0Var.d;
                }
            } else {
                ga1Var = kr0Var.c;
            }
            nr0 nr0Var = this.a[i2];
            ga1Var.getClass();
            ga1Var.l(f, tgVar.a(rectF), nr0Var);
            int i3 = i2 + 1;
            float f5 = i3 * 90;
            this.b[i2].reset();
            PointF pointF = this.d;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        f3 = rectF.right;
                    } else {
                        f3 = rectF.left;
                    }
                    f4 = rectF.top;
                    pointF.set(f3, f4);
                    Matrix matrix = this.b[i2];
                    PointF pointF2 = this.d;
                    matrix.setTranslate(pointF2.x, pointF2.y);
                    this.b[i2].preRotate(f5);
                    float[] fArr2 = this.f;
                    nr0 nr0Var2 = this.a[i2];
                    fArr2[0] = nr0Var2.c;
                    fArr2[1] = nr0Var2.d;
                    this.b[i2].mapPoints(fArr2);
                    this.c[i2].reset();
                    Matrix matrix2 = this.c[i2];
                    float[] fArr3 = this.f;
                    matrix2.setTranslate(fArr3[0], fArr3[1]);
                    this.c[i2].preRotate(f5);
                    i2 = i3;
                } else {
                    f3 = rectF.left;
                }
            } else {
                f3 = rectF.right;
            }
            f4 = rectF.bottom;
            pointF.set(f3, f4);
            Matrix matrix3 = this.b[i2];
            PointF pointF22 = this.d;
            matrix3.setTranslate(pointF22.x, pointF22.y);
            this.b[i2].preRotate(f5);
            float[] fArr22 = this.f;
            nr0 nr0Var22 = this.a[i2];
            fArr22[0] = nr0Var22.c;
            fArr22[1] = nr0Var22.d;
            this.b[i2].mapPoints(fArr22);
            this.c[i2].reset();
            Matrix matrix22 = this.c[i2];
            float[] fArr32 = this.f;
            matrix22.setTranslate(fArr32[0], fArr32[1]);
            this.c[i2].preRotate(f5);
            i2 = i3;
        }
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            float[] fArr4 = this.f;
            nr0 nr0Var3 = this.a[i4];
            fArr4[c] = nr0Var3.a;
            fArr4[1] = nr0Var3.b;
            this.b[i4].mapPoints(fArr4);
            float[] fArr5 = this.f;
            if (i4 == 0) {
                path.moveTo(fArr5[c], fArr5[1]);
            } else {
                path.lineTo(fArr5[c], fArr5[1]);
            }
            nr0 nr0Var4 = this.a[i4];
            Matrix matrix4 = this.b[i4];
            int size = nr0Var4.g.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((nr0.e) nr0Var4.g.get(i5)).a(matrix4, path);
            }
            if (aVar != null) {
                nr0 nr0Var5 = this.a[i4];
                Matrix matrix5 = this.b[i4];
                nr0.f[] fVarArr = o40.this.Q;
                nr0Var5.b(nr0Var5.f);
                fVarArr[i4] = new mr0(new ArrayList(nr0Var5.h), matrix5);
            }
            int i6 = i4 + 1;
            int i7 = i6 % 4;
            float[] fArr6 = this.f;
            nr0 nr0Var6 = this.a[i4];
            fArr6[c] = nr0Var6.c;
            fArr6[1] = nr0Var6.d;
            this.b[i4].mapPoints(fArr6);
            float[] fArr7 = this.g;
            nr0 nr0Var7 = this.a[i7];
            fArr7[c] = nr0Var7.a;
            fArr7[1] = nr0Var7.b;
            this.b[i7].mapPoints(fArr7);
            float f6 = this.f[c];
            float[] fArr8 = this.g;
            float max = Math.max(((float) Math.hypot(f6 - fArr8[c], fArr[1] - fArr8[1])) - 0.001f, 0.0f);
            float[] fArr9 = this.f;
            nr0 nr0Var8 = this.a[i4];
            fArr9[c] = nr0Var8.c;
            fArr9[1] = nr0Var8.d;
            this.b[i4].mapPoints(fArr9);
            if (i4 != 1 && i4 != 3) {
                centerX = rectF.centerY();
                f2 = this.f[1];
            } else {
                centerX = rectF.centerX();
                f2 = this.f[c];
            }
            float abs = Math.abs(centerX - f2);
            this.e.d(0.0f, 270.0f, 0.0f);
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        foVar = kr0Var.j;
                    } else {
                        foVar = kr0Var.i;
                    }
                } else {
                    foVar = kr0Var.l;
                }
            } else {
                foVar = kr0Var.k;
            }
            foVar.a(max, abs, f, this.e);
            nr0 nr0Var9 = this.e;
            Matrix matrix6 = this.c[i4];
            int size2 = nr0Var9.g.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ((nr0.e) nr0Var9.g.get(i8)).a(matrix6, path);
            }
            if (aVar != null) {
                nr0 nr0Var10 = this.e;
                Matrix matrix7 = this.c[i4];
                nr0.f[] fVarArr2 = o40.this.R;
                nr0Var10.b(nr0Var10.f);
                fVarArr2[i4] = new mr0(new ArrayList(nr0Var10.h), matrix7);
            }
            i4 = i6;
            c = 0;
        }
        path.close();
    }
}