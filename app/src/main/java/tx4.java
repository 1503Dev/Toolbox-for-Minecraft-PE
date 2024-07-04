package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* renamed from: tx4  reason: default package */
public final class tx4 extends kx4 {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    /* renamed from: tx4$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new a());
        }
        try {
            c = unsafe.objectFieldOffset(vx4.class.getDeclaredField("R"));
            b = unsafe.objectFieldOffset(vx4.class.getDeclaredField("Q"));
            d = unsafe.objectFieldOffset(vx4.class.getDeclaredField("P"));
            e = unsafe.objectFieldOffset(ux4.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(ux4.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException(e3);
        } catch (RuntimeException e4) {
            throw e4;
        }
    }

    @Override // defpackage.kx4
    public final nx4 a(vx4 vx4Var, nx4 nx4Var) {
        nx4 nx4Var2;
        do {
            nx4Var2 = vx4Var.Q;
            if (nx4Var == nx4Var2) {
                return nx4Var2;
            }
        } while (!e(vx4Var, nx4Var2, nx4Var));
        return nx4Var2;
    }

    @Override // defpackage.kx4
    public final ux4 b(vx4 vx4Var) {
        ux4 ux4Var;
        ux4 ux4Var2 = ux4.c;
        do {
            ux4Var = vx4Var.R;
            if (ux4Var2 == ux4Var) {
                return ux4Var;
            }
        } while (!g(vx4Var, ux4Var, ux4Var2));
        return ux4Var;
    }

    @Override // defpackage.kx4
    public final void c(ux4 ux4Var, @CheckForNull ux4 ux4Var2) {
        a.putObject(ux4Var, f, ux4Var2);
    }

    @Override // defpackage.kx4
    public final void d(ux4 ux4Var, Thread thread) {
        a.putObject(ux4Var, e, thread);
    }

    @Override // defpackage.kx4
    public final boolean e(vx4 vx4Var, @CheckForNull nx4 nx4Var, nx4 nx4Var2) {
        return xx4.a(a, vx4Var, b, nx4Var, nx4Var2);
    }

    @Override // defpackage.kx4
    public final boolean f(vx4 vx4Var, @CheckForNull Object obj, Object obj2) {
        return xx4.a(a, vx4Var, d, obj, obj2);
    }

    @Override // defpackage.kx4
    public final boolean g(vx4 vx4Var, @CheckForNull ux4 ux4Var, @CheckForNull ux4 ux4Var2) {
        return xx4.a(a, vx4Var, c, ux4Var, ux4Var2);
    }
}