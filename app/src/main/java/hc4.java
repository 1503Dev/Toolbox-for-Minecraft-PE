package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: hc4  reason: default package */
public final class hc4 {
    public static final Unsafe a;
    public static final Class b;
    public static final mb4 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0131  */
    static {
        mb4 mb4Var;
        boolean z;
        mb4 mb4Var2;
        boolean z2;
        Field b2;
        mb4 mb4Var3;
        Unsafe k = k();
        a = k;
        int i = fw1.a;
        b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean u = u(cls);
        boolean u2 = u(Integer.TYPE);
        if (k != null) {
            if (u) {
                mb4Var = new ua4(k);
            } else if (u2) {
                mb4Var = new ca4(k);
            }
            c = mb4Var;
            if (mb4Var != null) {
                try {
                    Class<?> cls2 = mb4Var.a.getClass();
                    cls2.getMethod("objectFieldOffset", Field.class);
                    cls2.getMethod("getLong", Object.class, cls);
                } catch (Throwable th) {
                    l(th);
                }
                if (b() != null) {
                    z = true;
                    d = z;
                    mb4Var2 = c;
                    if (mb4Var2 != null) {
                        try {
                            Class<?> cls3 = mb4Var2.a.getClass();
                            cls3.getMethod("objectFieldOffset", Field.class);
                            cls3.getMethod("arrayBaseOffset", Class.class);
                            cls3.getMethod("arrayIndexScale", Class.class);
                            Class<?> cls4 = Long.TYPE;
                            cls3.getMethod("getInt", Object.class, cls4);
                            cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                            cls3.getMethod("getLong", Object.class, cls4);
                            cls3.getMethod("putLong", Object.class, cls4, cls4);
                            cls3.getMethod("getObject", Object.class, cls4);
                            cls3.getMethod("putObject", Object.class, cls4, Object.class);
                            z2 = true;
                        } catch (Throwable th2) {
                            l(th2);
                        }
                        e = z2;
                        f = w(byte[].class);
                        w(boolean[].class);
                        a(boolean[].class);
                        w(int[].class);
                        a(int[].class);
                        w(long[].class);
                        a(long[].class);
                        w(float[].class);
                        a(float[].class);
                        w(double[].class);
                        a(double[].class);
                        w(Object[].class);
                        a(Object[].class);
                        b2 = b();
                        if (b2 != null && (mb4Var3 = c) != null) {
                            mb4Var3.a.objectFieldOffset(b2);
                        }
                        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                    }
                    z2 = false;
                    e = z2;
                    f = w(byte[].class);
                    w(boolean[].class);
                    a(boolean[].class);
                    w(int[].class);
                    a(int[].class);
                    w(long[].class);
                    a(long[].class);
                    w(float[].class);
                    a(float[].class);
                    w(double[].class);
                    a(double[].class);
                    w(Object[].class);
                    a(Object[].class);
                    b2 = b();
                    if (b2 != null) {
                        mb4Var3.a.objectFieldOffset(b2);
                    }
                    g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
            }
            z = false;
            d = z;
            mb4Var2 = c;
            if (mb4Var2 != null) {
            }
            z2 = false;
            e = z2;
            f = w(byte[].class);
            w(boolean[].class);
            a(boolean[].class);
            w(int[].class);
            a(int[].class);
            w(long[].class);
            a(long[].class);
            w(float[].class);
            a(float[].class);
            w(double[].class);
            a(double[].class);
            w(Object[].class);
            a(Object[].class);
            b2 = b();
            if (b2 != null) {
            }
            g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        mb4Var = null;
        c = mb4Var;
        if (mb4Var != null) {
        }
        z = false;
        d = z;
        mb4Var2 = c;
        if (mb4Var2 != null) {
        }
        z2 = false;
        e = z2;
        f = w(byte[].class);
        w(boolean[].class);
        a(boolean[].class);
        w(int[].class);
        a(int[].class);
        w(long[].class);
        a(long[].class);
        w(float[].class);
        a(float[].class);
        w(double[].class);
        a(double[].class);
        w(Object[].class);
        a(Object[].class);
        b2 = b();
        if (b2 != null) {
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i = fw1.a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field == null) {
            try {
                field2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused2) {
                field2 = null;
            }
            if (field2 == null || field2.getType() != Long.TYPE) {
                return null;
            }
            return field2;
        }
        return field;
    }

    public static void c(Object obj, long j, byte b2) {
        mb4 mb4Var = c;
        long j2 = (-4) & j;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        mb4Var.a.putInt(obj, j2, ((255 & b2) << i) | (mb4Var.a.getInt(obj, j2) & ((255 << i) ^ (-1))));
    }

    public static void d(Object obj, long j, byte b2) {
        mb4 mb4Var = c;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        mb4Var.a.putInt(obj, j2, ((255 & b2) << i) | (mb4Var.a.getInt(obj, j2) & ((255 << i) ^ (-1))));
    }

    public static double e(long j, Object obj) {
        return c.a(j, obj);
    }

    public static float f(long j, Object obj) {
        return c.b(j, obj);
    }

    public static int g(long j, Object obj) {
        return c.a.getInt(obj, j);
    }

    public static long h(long j, Object obj) {
        return c.a.getLong(obj, j);
    }

    public static Object i(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object j(long j, Object obj) {
        return c.a.getObject(obj, j);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j94());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void l(Throwable th) {
        Logger.getLogger(hc4.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void m(Object obj, long j, boolean z) {
        c.c(obj, j, z);
    }

    public static void n(Object obj, long j, double d2) {
        c.e(obj, j, d2);
    }

    public static void o(Object obj, long j, float f2) {
        c.f(obj, j, f2);
    }

    public static void p(int i, long j, Object obj) {
        c.a.putInt(obj, j, i);
    }

    public static void q(Object obj, long j, long j2) {
        c.a.putLong(obj, j, j2);
    }

    public static void r(long j, Object obj, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean s(long j, Object obj) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean t(long j, Object obj) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean u(Class cls) {
        int i = fw1.a;
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean v(long j, Object obj) {
        return c.g(j, obj);
    }

    public static int w(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }
}