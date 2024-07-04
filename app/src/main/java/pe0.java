package defpackage;

/* renamed from: pe0  reason: default package */
public final class pe0 {
    public static final oe0 a;

    /* JADX WARN: Removed duplicated region for block: B:54:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        int i;
        oe0 oe0Var;
        String property = System.getProperty("java.specification.version");
        if (property != null) {
            int F = lu0.F(property, 0, 6);
            try {
                if (F < 0) {
                    i = Integer.parseInt(property) * 65536;
                } else {
                    int i2 = F + 1;
                    int F2 = lu0.F(property, i2, 4);
                    if (F2 < 0) {
                        F2 = property.length();
                    }
                    String substring = property.substring(0, F);
                    hy.d("(this as java.lang.Strin…ing(startIndex, endIndex)", substring);
                    String substring2 = property.substring(i2, F2);
                    hy.d("(this as java.lang.Strin…ing(startIndex, endIndex)", substring2);
                    i = Integer.parseInt(substring2) + (Integer.parseInt(substring) * 65536);
                }
            } catch (NumberFormatException unused) {
            }
            if (i >= 65544) {
                try {
                    Object newInstance = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                    hy.d("Class.forName(\"kotlin.in…entations\").newInstance()", newInstance);
                    try {
                        try {
                            oe0Var = (oe0) newInstance;
                        } catch (ClassCastException e) {
                            ClassLoader classLoader = newInstance.getClass().getClassLoader();
                            ClassLoader classLoader2 = oe0.class.getClassLoader();
                            Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + classLoader2).initCause(e);
                            hy.d("ClassCastException(\"Inst…baseTypeCL\").initCause(e)", initCause);
                            throw initCause;
                        }
                    } catch (ClassNotFoundException unused2) {
                    }
                } catch (ClassNotFoundException unused3) {
                    Object newInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    hy.d("Class.forName(\"kotlin.in…entations\").newInstance()", newInstance2);
                    try {
                        oe0Var = (oe0) newInstance2;
                    } catch (ClassCastException e2) {
                        ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader4 = oe0.class.getClassLoader();
                        Throwable initCause2 = new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + classLoader4).initCause(e2);
                        hy.d("ClassCastException(\"Inst…baseTypeCL\").initCause(e)", initCause2);
                        throw initCause2;
                    }
                }
                a = oe0Var;
            }
            if (i >= 65543) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
                    hy.d("Class.forName(\"kotlin.in…entations\").newInstance()", newInstance3);
                    try {
                        try {
                            oe0Var = (oe0) newInstance3;
                        } catch (ClassCastException e3) {
                            ClassLoader classLoader5 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader6 = oe0.class.getClassLoader();
                            Throwable initCause3 = new ClassCastException("Instance classloader: " + classLoader5 + ", base type classloader: " + classLoader6).initCause(e3);
                            hy.d("ClassCastException(\"Inst…baseTypeCL\").initCause(e)", initCause3);
                            throw initCause3;
                        }
                    } catch (ClassNotFoundException unused4) {
                    }
                } catch (ClassNotFoundException unused5) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    hy.d("Class.forName(\"kotlin.in…entations\").newInstance()", newInstance4);
                    try {
                        oe0Var = (oe0) newInstance4;
                    } catch (ClassCastException e4) {
                        ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader8 = oe0.class.getClassLoader();
                        Throwable initCause4 = new ClassCastException("Instance classloader: " + classLoader7 + ", base type classloader: " + classLoader8).initCause(e4);
                        hy.d("ClassCastException(\"Inst…baseTypeCL\").initCause(e)", initCause4);
                        throw initCause4;
                    }
                }
                a = oe0Var;
            }
            oe0Var = new oe0();
            a = oe0Var;
        }
        i = 65542;
        if (i >= 65544) {
        }
        if (i >= 65543) {
        }
        oe0Var = new oe0();
        a = oe0Var;
    }
}