package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: zg5  reason: default package */
public final class zg5 {
    public static final Unsafe a;
    public static final Class b;
    public static final yg5 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013d  */
    static {
        yg5 yg5Var;
        boolean z;
        yg5 yg5Var2;
        boolean z2;
        Field c2;
        long j;
        yg5 yg5Var3;
        Unsafe n = n();
        a = n;
        int i = xc5.a;
        b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean y = y(cls);
        boolean y2 = y(Integer.TYPE);
        if (n != null) {
            if (y) {
                yg5Var = new xg5(n);
            } else if (y2) {
                yg5Var = new wg5(n);
            }
            c = yg5Var;
            if (yg5Var != null) {
                try {
                    Class<?> cls2 = ((Unsafe) yg5Var.P).getClass();
                    cls2.getMethod("objectFieldOffset", Field.class);
                    cls2.getMethod("getLong", Object.class, cls);
                } catch (Throwable th) {
                    o(th);
                }
                if (c() != null) {
                    z = true;
                    d = z;
                    yg5Var2 = c;
                    if (yg5Var2 != null) {
                        try {
                            Class<?> cls3 = ((Unsafe) yg5Var2.P).getClass();
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
                            o(th2);
                        }
                        e = z2;
                        f = a(byte[].class);
                        a(boolean[].class);
                        b(boolean[].class);
                        a(int[].class);
                        b(int[].class);
                        a(long[].class);
                        b(long[].class);
                        a(float[].class);
                        b(float[].class);
                        a(double[].class);
                        b(double[].class);
                        a(Object[].class);
                        b(Object[].class);
                        c2 = c();
                        j = -1;
                        if (c2 != null && (yg5Var3 = c) != null) {
                            j = ((Unsafe) yg5Var3.P).objectFieldOffset(c2);
                        }
                        g = j;
                        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                    }
                    z2 = false;
                    e = z2;
                    f = a(byte[].class);
                    a(boolean[].class);
                    b(boolean[].class);
                    a(int[].class);
                    b(int[].class);
                    a(long[].class);
                    b(long[].class);
                    a(float[].class);
                    b(float[].class);
                    a(double[].class);
                    b(double[].class);
                    a(Object[].class);
                    b(Object[].class);
                    c2 = c();
                    j = -1;
                    if (c2 != null) {
                        j = ((Unsafe) yg5Var3.P).objectFieldOffset(c2);
                    }
                    g = j;
                    h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
            }
            z = false;
            d = z;
            yg5Var2 = c;
            if (yg5Var2 != null) {
            }
            z2 = false;
            e = z2;
            f = a(byte[].class);
            a(boolean[].class);
            b(boolean[].class);
            a(int[].class);
            b(int[].class);
            a(long[].class);
            b(long[].class);
            a(float[].class);
            b(float[].class);
            a(double[].class);
            b(double[].class);
            a(Object[].class);
            b(Object[].class);
            c2 = c();
            j = -1;
            if (c2 != null) {
            }
            g = j;
            h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        yg5Var = null;
        c = yg5Var;
        if (yg5Var != null) {
        }
        z = false;
        d = z;
        yg5Var2 = c;
        if (yg5Var2 != null) {
        }
        z2 = false;
        e = z2;
        f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        c2 = c();
        j = -1;
        if (c2 != null) {
        }
        g = j;
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (e) {
            return ((Unsafe) c.P).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (e) {
            ((Unsafe) c.P).arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field field;
        Field field2;
        int i = xc5.a;
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

    public static void d(Object obj, long j, byte b2) {
        yg5 yg5Var = c;
        long j2 = (-4) & j;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        ((Unsafe) yg5Var.P).putInt(obj, j2, ((255 & b2) << i) | (((Unsafe) yg5Var.P).getInt(obj, j2) & ((255 << i) ^ (-1))));
    }

    public static void e(Object obj, long j, byte b2) {
        yg5 yg5Var = c;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        ((Unsafe) yg5Var.P).putInt(obj, j2, ((255 & b2) << i) | (((Unsafe) yg5Var.P).getInt(obj, j2) & ((255 << i) ^ (-1))));
    }

    public static byte f(long j) {
        return c.a(j);
    }

    public static double g(long j, Object obj) {
        return c.c(j, obj);
    }

    public static float h(long j, Object obj) {
        return c.e(j, obj);
    }

    public static int i(long j, Object obj) {
        return ((Unsafe) c.P).getInt(obj, j);
    }

    public static long j(ByteBuffer byteBuffer) {
        yg5 yg5Var = c;
        return ((Unsafe) yg5Var.P).getLong(byteBuffer, g);
    }

    public static long k(long j, Object obj) {
        return ((Unsafe) c.P).getLong(obj, j);
    }

    public static Object l(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object m(long j, Object obj) {
        return ((Unsafe) c.P).getObject(obj, j);
    }

    public static Unsafe n() {
        try {
            return (Unsafe) AccessController.doPrivileged(new vg5());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void o(Throwable th) {
        Logger.getLogger(zg5.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void p(Object obj, long j, boolean z) {
        c.h(obj, j, z);
    }

    public static void q(byte[] bArr, long j, byte b2) {
        c.i(bArr, f + j, b2);
    }

    public static void r(Object obj, long j, double d2) {
        c.k(obj, j, d2);
    }

    public static void s(Object obj, long j, float f2) {
        c.l(obj, j, f2);
    }

    public static void t(int i, long j, Object obj) {
        ((Unsafe) c.P).putInt(obj, j, i);
    }

    public static void u(Object obj, long j, long j2) {
        ((Unsafe) c.P).putLong(obj, j, j2);
    }

    public static void v(long j, Object obj, Object obj2) {
        ((Unsafe) c.P).putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean w(long j, Object obj) {
        return ((byte) ((((Unsafe) c.P).getInt(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean x(long j, Object obj) {
        return ((byte) ((((Unsafe) c.P).getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean y(Class cls) {
        int i = xc5.a;
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

    public static boolean z(long j, Object obj) {
        return c.m(j, obj);
    }
}