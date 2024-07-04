package defpackage;

import java.util.Arrays;

/* renamed from: hy  reason: default package */
public final class hy {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(String str, Object obj) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(k6.b(str, " must not be null"));
        h(illegalStateException);
        throw illegalStateException;
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        h(nullPointerException);
        throw nullPointerException;
    }

    public static void d(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(k6.b(str, " must not be null"));
        h(nullPointerException);
        throw nullPointerException;
    }

    public static void e(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(g(str));
        h(nullPointerException);
        throw nullPointerException;
    }

    public static void f(String str, Object obj) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(g(str));
        h(illegalArgumentException);
        throw illegalArgumentException;
    }

    public static String g(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        StringBuilder b = sd1.b("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        b.append(str);
        return b.toString();
    }

    public static void h(RuntimeException runtimeException) {
        String name = hy.class.getName();
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (name.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }
}