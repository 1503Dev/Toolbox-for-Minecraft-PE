package defpackage;

import android.os.IBinder;
import defpackage.hw;
import java.lang.reflect.Field;

/* renamed from: va0  reason: default package */
public final class va0<T> extends hw.a {
    public final T P;

    public va0(T t) {
        this.P = t;
    }

    public static <T> T c0(hw hwVar) {
        if (hwVar instanceof va0) {
            return ((va0) hwVar).P;
        }
        IBinder asBinder = hwVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        uf0.f(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}