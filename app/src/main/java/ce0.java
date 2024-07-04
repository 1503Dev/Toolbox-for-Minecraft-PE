package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;

/* renamed from: ce0  reason: default package */
public final class ce0 implements Interpolator {
    public float[] a;
    public float[] b;

    public ce0(Context context, AttributeSet attributeSet, XmlResourceParser xmlResourceParser) {
        TypedArray f = v11.f(context.getResources(), context.getTheme(), attributeSet, c4.l);
        if (v11.e(xmlResourceParser, "pathData")) {
            String d = v11.d(f, xmlResourceParser, "pathData", 4);
            Path d2 = de0.d(d);
            if (d2 != null) {
                a(d2);
            } else {
                throw new InflateException(k6.b("The path is null, which is created from ", d));
            }
        } else if (v11.e(xmlResourceParser, "controlX1")) {
            if (v11.e(xmlResourceParser, "controlY1")) {
                float b = v11.b(f, xmlResourceParser, "controlX1", 0, 0.0f);
                float b2 = v11.b(f, xmlResourceParser, "controlY1", 1, 0.0f);
                boolean e = v11.e(xmlResourceParser, "controlX2");
                if (e == v11.e(xmlResourceParser, "controlY2")) {
                    if (!e) {
                        Path path = new Path();
                        path.moveTo(0.0f, 0.0f);
                        path.quadTo(b, b2, 1.0f, 1.0f);
                        a(path);
                    } else {
                        float b3 = v11.b(f, xmlResourceParser, "controlX2", 2, 0.0f);
                        float b4 = v11.b(f, xmlResourceParser, "controlY2", 3, 0.0f);
                        Path path2 = new Path();
                        path2.moveTo(0.0f, 0.0f);
                        path2.cubicTo(b, b2, b3, b4, 1.0f, 1.0f);
                        a(path2);
                    }
                } else {
                    throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
                }
            } else {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        f.recycle();
    }

    public final void a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.a = new float[min];
            this.b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
                this.a[i2] = fArr[0];
                this.b[i2] = fArr[1];
            }
            if (Math.abs(this.a[0]) <= 1.0E-5d && Math.abs(this.b[0]) <= 1.0E-5d) {
                int i3 = min - 1;
                if (Math.abs(this.a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.b[i3] - 1.0f) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (!pathMeasure.nextContour()) {
                        return;
                    }
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
            }
            StringBuilder b = e5.b("The Path must start at (0,0) and end at (1,1) start: ");
            b.append(this.a[0]);
            b.append(",");
            b.append(this.b[0]);
            b.append(" end:");
            int i6 = min - 1;
            b.append(this.a[i6]);
            b.append(",");
            b.append(this.b[i6]);
            throw new IllegalArgumentException(b.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.a;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.b[i];
        }
        float[] fArr2 = this.b;
        float f5 = fArr2[i];
        return ((fArr2[length] - f5) * ((f - f3) / f4)) + f5;
    }
}