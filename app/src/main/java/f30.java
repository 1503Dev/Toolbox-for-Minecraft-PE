package defpackage;

import android.view.animation.Interpolator;

/* renamed from: f30  reason: default package */
public abstract class f30 implements Interpolator {
    public final float[] a;
    public final float b;

    public f30(float[] fArr) {
        this.a = fArr;
        this.b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.a;
        float f4 = fArr2[min];
        return ((fArr2[min + 1] - f4) * f3) + f4;
    }
}