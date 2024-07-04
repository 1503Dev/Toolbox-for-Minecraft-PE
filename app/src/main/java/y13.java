package defpackage;

import java.util.Locale;

/* renamed from: y13  reason: default package */
public final class y13 {
    public static final y13 d = new y13(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public y13(float f, float f2) {
        tv2.G(f > 0.0f);
        tv2.G(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y13.class == obj.getClass()) {
            y13 y13Var = (y13) obj;
            if (this.a == y13Var.a && this.b == y13Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.a) + 527) * 31) + Float.floatToRawIntBits(this.b);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.a), Float.valueOf(this.b));
    }
}