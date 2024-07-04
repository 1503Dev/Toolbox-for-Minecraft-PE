package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: km  reason: default package */
public final class km {
    public static Method a;
    public static boolean b;
    public static Method c;
    public static boolean d;

    public static void a(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable b2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 || i < 21) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            b2 = ((InsetDrawable) drawable).getDrawable();
        } else if (!(drawable instanceof y71)) {
            if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
                return;
            }
            int childCount = drawableContainerState.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Drawable child = drawableContainerState.getChild(i2);
                if (child != null) {
                    a(child);
                }
            }
            return;
        } else {
            b2 = ((y71) drawable).b();
        }
        a(b2);
    }

    public static int b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return im.a(drawable);
        }
        if (!d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            d = true;
        }
        Method method = c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                c = null;
            }
        }
        return 0;
    }

    public static void c(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    public static boolean d(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return tm.a(drawable, i);
        }
        if (!b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                a = null;
            }
        }
        return false;
    }

    public static void e(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof dx0) {
            ((dx0) drawable).setTint(i);
        }
    }

    public static void f(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof dx0) {
            ((dx0) drawable).setTintList(colorStateList);
        }
    }

    public static void g(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof dx0) {
            ((dx0) drawable).setTintMode(mode);
        }
    }

    public static Drawable h(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? drawable : i >= 21 ? !(drawable instanceof dx0) ? new a81(drawable) : drawable : !(drawable instanceof dx0) ? new z71(drawable) : drawable;
    }
}