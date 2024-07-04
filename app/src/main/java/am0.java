package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: am0  reason: default package */
public final class am0 {
    public static final boolean a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;
    public static final String l;

    static {
        a = Build.VERSION.SDK_INT >= 21;
        b = new int[]{16842919};
        c = new int[]{16843623, 16842908};
        d = new int[]{16842908};
        e = new int[]{16843623};
        f = new int[]{16842913, 16842919};
        g = new int[]{16842913, 16843623, 16842908};
        h = new int[]{16842913, 16842908};
        i = new int[]{16842913, 16843623};
        j = new int[]{16842913};
        k = new int[]{16842910, 16842919};
        l = am0.class.getSimpleName();
    }

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return a ? be.c(colorForState, Math.min(Color.alpha(colorForState) * 2, 255)) : colorForState;
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 22 && i2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(k, 0)) != 0) {
                Log.w(l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean c(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}