package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: vf5  reason: default package */
public final class vf5 {
    public static final vf5 c = new vf5();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final gf5 a = new gf5();

    public final dg5 a(Class cls) {
        cf5 cf5Var;
        og5 og5Var;
        rf5 rf5Var;
        Class cls2;
        Charset charset = re5.a;
        if (cls != null) {
            dg5 dg5Var = (dg5) this.b.get(cls);
            if (dg5Var == null) {
                gf5 gf5Var = this.a;
                gf5Var.getClass();
                Class cls3 = eg5.a;
                if (!ie5.class.isAssignableFrom(cls) && (cls2 = eg5.a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
                lf5 a = gf5Var.a.a(cls);
                boolean c2 = a.c();
                boolean isAssignableFrom = ie5.class.isAssignableFrom(cls);
                if (c2) {
                    if (isAssignableFrom) {
                        rf5Var = new rf5(eg5.d, xd5.a, a.a());
                    } else {
                        og5 og5Var2 = eg5.b;
                        vd5 vd5Var = xd5.b;
                        if (vd5Var != null) {
                            rf5Var = new rf5(og5Var2, vd5Var, a.a());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    dg5Var = rf5Var;
                } else {
                    boolean z = false;
                    vd5 vd5Var2 = null;
                    if (isAssignableFrom) {
                        if (a.d() == 1) {
                            z = true;
                        }
                        if (z) {
                            int i = tf5.a;
                            cf5Var = cf5.b;
                            og5Var = eg5.d;
                            vd5Var2 = xd5.a;
                        } else {
                            int i2 = tf5.a;
                            cf5Var = cf5.b;
                            og5Var = eg5.d;
                        }
                        int i3 = kf5.a;
                    } else {
                        if (a.d() == 1) {
                            z = true;
                        }
                        if (z) {
                            int i4 = tf5.a;
                            cf5Var = cf5.a;
                            og5Var = eg5.b;
                            vd5Var2 = xd5.b;
                            if (vd5Var2 == null) {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            int i5 = tf5.a;
                            cf5Var = cf5.a;
                            og5Var = eg5.c;
                        }
                        int i6 = kf5.a;
                    }
                    dg5Var = qf5.H(a, cf5Var, og5Var, vd5Var2);
                }
                dg5 dg5Var2 = (dg5) this.b.putIfAbsent(cls, dg5Var);
                if (dg5Var2 != null) {
                    return dg5Var2;
                }
            }
            return dg5Var;
        }
        throw new NullPointerException("messageType");
    }
}