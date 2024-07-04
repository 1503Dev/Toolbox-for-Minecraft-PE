package defpackage;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: vg5  reason: default package */
public final class vg5 implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() {
        Field[] declaredFields;
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}