package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements d {
    public static int b;
    public static Field c;
    public static Field d;
    public static Field e;
    public Activity a;

    public ImmLeaksCleaner(Activity activity) {
        this.a = activity;
    }

    @Override // androidx.lifecycle.d
    public final void d(b10 b10Var, c.b bVar) {
        if (bVar != c.b.ON_DESTROY) {
            return;
        }
        if (b == 0) {
            try {
                b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                c = declaredField3;
                declaredField3.setAccessible(true);
                b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
            try {
                Object obj = c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}