package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: lq3  reason: default package */
public final class lq3 {
    public static final lq3 c = new lq3();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final se3 a = new se3();

    public final lr3 a(Class cls) {
        wb3 wb3Var;
        z44 z44Var;
        fn3 fn3Var;
        Class cls2;
        Charset charset = z13.a;
        if (cls != null) {
            lr3 lr3Var = (lr3) this.b.get(cls);
            if (lr3Var == null) {
                se3 se3Var = this.a;
                se3Var.getClass();
                Class cls3 = ss3.a;
                if (!ox2.class.isAssignableFrom(cls) && (cls2 = ss3.a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
                zh3 a = se3Var.a.a(cls);
                boolean c2 = a.c();
                boolean isAssignableFrom = ox2.class.isAssignableFrom(cls);
                if (c2) {
                    if (isAssignableFrom) {
                        fn3Var = new fn3(ss3.d, in2.a, a.a());
                    } else {
                        z44 z44Var2 = ss3.b;
                        gl2 gl2Var = in2.b;
                        if (gl2Var != null) {
                            fn3Var = new fn3(z44Var2, gl2Var, a.a());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    lr3Var = fn3Var;
                } else {
                    boolean z = false;
                    gl2 gl2Var2 = null;
                    if (isAssignableFrom) {
                        if (a.d() == 1) {
                            z = true;
                        }
                        if (z) {
                            int i = xo3.a;
                            wb3Var = wb3.b;
                            z44Var = ss3.d;
                            gl2Var2 = in2.a;
                        } else {
                            int i2 = xo3.a;
                            wb3Var = wb3.b;
                            z44Var = ss3.d;
                        }
                        int i3 = gh3.a;
                    } else {
                        if (a.d() == 1) {
                            z = true;
                        }
                        if (z) {
                            int i4 = xo3.a;
                            wb3Var = wb3.a;
                            z44Var = ss3.b;
                            gl2Var2 = in2.b;
                            if (gl2Var2 == null) {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            int i5 = xo3.a;
                            wb3Var = wb3.a;
                            z44Var = ss3.c;
                        }
                        int i6 = gh3.a;
                    }
                    lr3Var = hm3.C(a, wb3Var, z44Var, gl2Var2);
                }
                lr3 lr3Var2 = (lr3) this.b.putIfAbsent(cls, lr3Var);
                if (lr3Var2 != null) {
                    return lr3Var2;
                }
            }
            return lr3Var;
        }
        throw new NullPointerException("messageType");
    }
}