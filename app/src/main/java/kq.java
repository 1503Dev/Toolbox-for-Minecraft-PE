package defpackage;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* renamed from: kq  reason: default package */
public final class kq implements TypeEvaluator<Float> {
    public FloatEvaluator a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f, Float f2, Float f3) {
        float floatValue = this.a.evaluate(f, (Number) f2, (Number) f3).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}