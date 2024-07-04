package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;

@SuppressLint({"RestrictedAPI"})
/* renamed from: um  reason: default package */
public final class um {
    public static final int[] a = {16842912};
    public static final int[] b = new int[0];
    public static final Rect c = new Rect();
    public static Class<?> d;

    static {
        try {
            d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static boolean a(Drawable drawable) {
        Drawable drawable2;
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                for (Drawable drawable3 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!a(drawable3)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        if (drawable instanceof y71) {
            drawable2 = ((y71) drawable).b();
        } else if (drawable instanceof vm) {
            return a(((vm) drawable).P);
        } else {
            if (drawable instanceof ScaleDrawable) {
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            } else {
                return true;
            }
        }
        return a(drawable2);
    }

    public static void b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(a);
            } else {
                drawable.setState(b);
            }
            drawable.setState(state);
        }
    }

    public static Rect c(Drawable drawable) {
        Field[] fields;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (d != null) {
            try {
                if (drawable instanceof y71) {
                    drawable = ((y71) drawable).b();
                }
                Object invoke = drawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawable, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : d.getFields()) {
                        String name = field.getName();
                        char c2 = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                        }
                        if (c2 != 0) {
                            if (c2 != 1) {
                                if (c2 != 2) {
                                    if (c2 == 3) {
                                        rect2.bottom = field.getInt(invoke);
                                    }
                                } else {
                                    rect2.right = field.getInt(invoke);
                                }
                            } else {
                                rect2.top = field.getInt(invoke);
                            }
                        } else {
                            rect2.left = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return c;
    }

    public static PorterDuff.Mode d(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}