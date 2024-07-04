package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* renamed from: x05  reason: default package */
public final class x05 {
    public static final AtomicReference a;
    public static final ConcurrentHashMap b;
    public static final ConcurrentHashMap c;
    public static final ConcurrentHashMap d;
    public static final ConcurrentHashMap e;

    static {
        Logger.getLogger(x05.class.getName());
        a = new AtomicReference(new f05());
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
        d = new ConcurrentHashMap();
        e = new ConcurrentHashMap();
    }

    public static synchronized ta5 a(va5 va5Var) {
        ta5 a2;
        synchronized (x05.class) {
            zz4 c2 = ((f05) a.get()).d(va5Var.B()).c();
            if (((Boolean) c.get(va5Var.B())).booleanValue()) {
                a2 = ((a05) c2).a(va5Var.A());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(va5Var.B())));
            }
        }
        return a2;
    }

    public static synchronized nf5 b(va5 va5Var) {
        nf5 a2;
        synchronized (x05.class) {
            zz4 c2 = ((f05) a.get()).d(va5Var.B()).c();
            if (((Boolean) c.get(va5Var.B())).booleanValue()) {
                gd5 A = va5Var.A();
                a05 a05Var = (a05) c2;
                a05Var.getClass();
                try {
                    t55 a3 = a05Var.a.a();
                    nf5 b2 = a3.b(A);
                    a3.d(b2);
                    a2 = a3.a(b2);
                } catch (te5 e2) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(a05Var.a.a().a.getName()), e2);
                }
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(va5Var.B())));
            }
        }
        return a2;
    }

    public static Object c(String str, gd5 gd5Var, Class cls) {
        a05 a05Var = (a05) ((f05) a.get()).a(cls, str);
        a05Var.getClass();
        try {
            return a05Var.b(a05Var.a.c(gd5Var));
        } catch (te5 e2) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(a05Var.a.a.getName()), e2);
        }
    }

    public static Object d(String str, ie5 ie5Var, Class cls) {
        a05 a05Var = (a05) ((f05) a.get()).a(cls, str);
        String name = a05Var.a.a.getName();
        if (a05Var.a.a.isInstance(ie5Var)) {
            return a05Var.b(ie5Var);
        }
        throw new GeneralSecurityException("Expected proto of type ".concat(name));
    }

    public static synchronized void e(o65 o65Var, u55 u55Var) {
        synchronized (x05.class) {
            AtomicReference atomicReference = a;
            f05 f05Var = new f05((f05) atomicReference.get());
            f05Var.b(o65Var, u55Var);
            Map c2 = o65Var.a().c();
            String d2 = o65Var.d();
            h(d2, c2, true);
            String d3 = u55Var.d();
            h(d3, Collections.emptyMap(), false);
            if (!((f05) atomicReference.get()).a.containsKey(d2)) {
                b.put(d2, new jz1(6, o65Var));
                i(o65Var.d(), o65Var.a().c());
            }
            ConcurrentHashMap concurrentHashMap = c;
            concurrentHashMap.put(d2, Boolean.TRUE);
            concurrentHashMap.put(d3, Boolean.FALSE);
            atomicReference.set(f05Var);
        }
    }

    public static synchronized void f(u55 u55Var) {
        synchronized (x05.class) {
            AtomicReference atomicReference = a;
            f05 f05Var = new f05((f05) atomicReference.get());
            f05Var.c(u55Var);
            Map c2 = u55Var.a().c();
            String d2 = u55Var.d();
            h(d2, c2, true);
            if (!((f05) atomicReference.get()).a.containsKey(d2)) {
                b.put(d2, new jz1(6, u55Var));
                i(d2, u55Var.a().c());
            }
            c.put(d2, Boolean.TRUE);
            atomicReference.set(f05Var);
        }
    }

    public static synchronized void g(v05 v05Var) {
        synchronized (x05.class) {
            a65 a65Var = a65.b;
            synchronized (a65Var) {
                l65 l65Var = new l65((n65) a65Var.a.get());
                l65Var.b(v05Var);
                a65Var.a.set(new n65(l65Var));
            }
        }
    }

    public static synchronized void h(String str, Map map, boolean z) {
        synchronized (x05.class) {
            if (z) {
                ConcurrentHashMap concurrentHashMap = c;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
                if (((f05) a.get()).a.containsKey(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!e.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (e.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, nf5] */
    public static void i(String str, Map map) {
        int i;
        for (Map.Entry entry : map.entrySet()) {
            ConcurrentHashMap concurrentHashMap = e;
            String str2 = (String) entry.getKey();
            byte[] D = ((s55) entry.getValue()).a.D();
            int i2 = ((s55) entry.getValue()).b;
            ua5 w = va5.w();
            w.j();
            va5.C((va5) w.Q, str);
            ed5 ed5Var = gd5.Q;
            ed5 G = gd5.G(D, 0, D.length);
            w.j();
            va5.E((va5) w.Q, G);
            int i3 = i2 - 1;
            if (i3 != 0) {
                if (i3 != 1) {
                    i = 4;
                } else {
                    i = 3;
                }
            } else {
                i = 2;
            }
            w.j();
            va5.F((va5) w.Q, i);
            concurrentHashMap.put(str2, new h05((va5) w.h()));
        }
    }
}