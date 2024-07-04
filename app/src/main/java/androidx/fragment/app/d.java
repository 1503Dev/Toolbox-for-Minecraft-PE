package androidx.fragment.app;

import androidx.fragment.app.c;
import java.lang.reflect.InvocationTargetException;

public class d {
    public static final os0<String, Class<?>> a = new os0<>();

    /* JADX WARN: Multi-variable type inference failed */
    public static Class<? extends c> b(ClassLoader classLoader, String str) {
        try {
            os0<String, Class<?>> os0Var = a;
            Class<? extends c> cls = (Class) os0Var.getOrDefault(str, null);
            if (cls == null) {
                Class cls2 = Class.forName(str, false, classLoader);
                os0Var.put(str, cls2);
                return cls2;
            }
            return cls;
        } catch (ClassCastException e) {
            throw new c.b(ij.c("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new c.b(ij.c("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public c a(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new c.b(ij.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new c.b(ij.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new c.b(ij.c("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new c.b(ij.c("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}