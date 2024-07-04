package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: h3  reason: default package */
public final class h3 {
    public static final h3 h = new h3(320, 50, "320x50_mb");
    public static final h3 i;
    public static final h3 j;
    public final int a;
    public final int b;
    public final String c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;

    static {
        new h3(468, 60, "468x60_as");
        new h3(320, 100, "320x100_as");
        new h3(728, 90, "728x90_as");
        new h3(300, 250, "300x250_as");
        new h3(160, 600, "160x600_as");
        new h3(-1, -2, "smart_banner");
        i = new h3(-3, -4, "fluid");
        j = new h3(0, 0, "invalid");
        new h3(50, 50, "50x50_mb");
        new h3(-3, 0, "search_v2");
    }

    public h3(int i2, int i3) {
        this(i2, i3, ho.b(i2 == -1 ? "FULL" : String.valueOf(i2), "x", i3 == -2 ? "AUTO" : String.valueOf(i3), "_as"));
    }

    public final int a(Context context) {
        int i2;
        int i3 = this.b;
        if (i3 != -4 && i3 != -3) {
            if (i3 != -2) {
                mv2 mv2Var = n62.f.a;
                return mv2.k(context, i3);
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float f = displayMetrics.density;
            int i4 = (int) (displayMetrics.heightPixels / f);
            if (i4 <= 400) {
                i2 = 32;
            } else if (i4 <= 720) {
                i2 = 50;
            } else {
                i2 = 90;
            }
            return (int) (i2 * f);
        }
        return -1;
    }

    public final int b(Context context) {
        int i2 = this.a;
        if (i2 == -3) {
            return -1;
        }
        if (i2 != -1) {
            mv2 mv2Var = n62.f.a;
            return mv2.k(context, i2);
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof h3) {
            h3 h3Var = (h3) obj;
            return this.a == h3Var.a && this.b == h3Var.b && this.c.equals(h3Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }

    public h3(int i2, int i3, String str) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            throw new IllegalArgumentException(k6.a("Invalid width for AdSize: ", i2));
        }
        if (i3 < 0 && i3 != -2 && i3 != -4) {
            throw new IllegalArgumentException(k6.a("Invalid height for AdSize: ", i3));
        }
        this.a = i2;
        this.b = i3;
        this.c = str;
    }
}