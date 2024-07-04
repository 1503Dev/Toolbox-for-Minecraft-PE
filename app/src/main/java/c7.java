package defpackage;

import android.animation.TypeEvaluator;

/* renamed from: c7  reason: default package */
public final class c7 implements TypeEvaluator<Integer> {
    public static final c7 a = new c7();

    @Override // android.animation.TypeEvaluator
    public final Integer evaluate(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = ((((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d)) - pow3) * f) + pow3;
        return Integer.valueOf((Math.round(((float) Math.pow(((pow4 - pow) * f) + pow, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((((((intValue2 >> 24) & 255) / 255.0f) - f2) * f) + f2) * 255.0f) << 24) | (Math.round(((float) Math.pow(((((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f) + pow2, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow5, 0.45454545454545453d)) * 255.0f));
    }
}