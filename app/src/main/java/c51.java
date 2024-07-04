package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: c51  reason: default package */
public final class c51 {
    public static Method a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        WeakHashMap<View, String> weakHashMap = a41.a;
        return view.getLayoutDirection() == 1;
    }
}