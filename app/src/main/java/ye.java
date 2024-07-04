package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: ye  reason: default package */
public final class ye {
    public static Field a;
    public static boolean b;

    public static Drawable a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return xe.a(compoundButton);
        }
        if (!b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                a = null;
            }
        }
        return null;
    }

    public static void b(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            n0.d(compoundButton, colorStateList);
        } else if (compoundButton instanceof jx0) {
            ((jx0) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }
}