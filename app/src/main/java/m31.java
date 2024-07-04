package defpackage;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: m31  reason: default package */
public abstract class m31 {
    public final e7<String, Method> a;
    public final e7<String, Method> b;
    public final e7<String, Class> c;

    public m31(e7<String, Method> e7Var, e7<String, Method> e7Var2, e7<String, Class> e7Var3) {
        this.a = e7Var;
        this.b = e7Var2;
        this.c = e7Var3;
    }

    public abstract n31 a();

    public final Class b(Class<? extends o31> cls) {
        Class orDefault = this.c.getOrDefault(cls.getName(), null);
        if (orDefault == null) {
            Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.c.put(cls.getName(), cls2);
            return cls2;
        }
        return orDefault;
    }

    public final Method c(String str) {
        Method orDefault = this.a.getOrDefault(str, null);
        if (orDefault == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, m31.class.getClassLoader()).getDeclaredMethod("read", m31.class);
            this.a.put(str, declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public final Method d(Class cls) {
        Method orDefault = this.b.getOrDefault(cls.getName(), null);
        if (orDefault == null) {
            Class b = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b.getDeclaredMethod("write", cls, m31.class);
            this.b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public abstract boolean e();

    public final boolean f(int i, boolean z) {
        return !i(i) ? z : e();
    }

    public abstract byte[] g();

    public abstract CharSequence h();

    public abstract boolean i(int i);

    public abstract int j();

    public abstract <T extends Parcelable> T k();

    public abstract String l();

    public final <T extends o31> T m() {
        String l = l();
        if (l == null) {
            return null;
        }
        try {
            return (T) c(l).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void n(int i);

    public abstract void o(boolean z);

    public abstract void p(byte[] bArr);

    public abstract void q(CharSequence charSequence);

    public abstract void r(int i);

    public abstract void s(Parcelable parcelable);

    public abstract void t(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(o31 o31Var) {
        if (o31Var == null) {
            t(null);
            return;
        }
        try {
            t(b(o31Var.getClass()).getName());
            n31 a = a();
            try {
                d(o31Var.getClass()).invoke(null, o31Var, a);
                a.v();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(o31Var.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }
}