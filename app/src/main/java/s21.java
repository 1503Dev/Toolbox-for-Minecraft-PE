package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: s21  reason: default package */
public final class s21 extends gk0 {
    public static Class d;
    public final Object b;
    public final Field c;

    public s21() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.c = field;
    }

    @Override // defpackage.gk0
    public final void a(AccessibleObject accessibleObject) {
        boolean z = false;
        if (this.b != null && this.c != null) {
            try {
                d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.b, accessibleObject, Long.valueOf(((Long) d.getMethod("objectFieldOffset", Field.class).invoke(this.b, this.c)).longValue()), Boolean.TRUE);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new xz("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }
}