package defpackage;

import android.graphics.Color;

/* renamed from: be  reason: default package */
public final class be {
    public static final /* synthetic */ int a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i3, b(Color.red(i), alpha2, Color.red(i2), alpha, i3), b(Color.green(i), alpha2, Color.green(i2), alpha, i3), b(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int b(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    public static int c(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}