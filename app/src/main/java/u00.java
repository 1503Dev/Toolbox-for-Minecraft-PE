package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: u00  reason: default package */
public final class u00 {
    public static Field a;
    public static boolean b;

    public static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                StringBuilder b2 = e5.b("forceSetFactory2 Could not find field 'mFactory2' on class ");
                b2.append(LayoutInflater.class.getName());
                b2.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", b2.toString(), e);
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }
}