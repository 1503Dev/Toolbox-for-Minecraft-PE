package defpackage;

import defpackage.c30;
import defpackage.zp;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: xt  reason: default package */
public final class xt {
    public final ThreadLocal<Map<u11<?>, a<?>>> a;
    public final ConcurrentHashMap b;
    public final vf c;
    public final pz d;
    public final List<m11> e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final List<m11> k;
    public final List<m11> l;

    /* renamed from: xt$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a<T> extends l11<T> {
        public l11<T> a;

        @Override // defpackage.l11
        public final T a(c00 c00Var) {
            l11<T> l11Var = this.a;
            if (l11Var != null) {
                return l11Var.a(c00Var);
            }
            throw new IllegalStateException();
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, T t) {
            l11<T> l11Var = this.a;
            if (l11Var == null) {
                throw new IllegalStateException();
            }
            l11Var.b(i00Var, t);
        }
    }

    static {
        new u11(Object.class);
    }

    public xt() {
        this(kp.U, zp.P, Collections.emptyMap(), true, c30.P, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public xt(kp kpVar, zp.a aVar, Map map, boolean z, c30.a aVar2, List list, List list2, List list3) {
        this.a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        vf vfVar = new vf(map);
        this.c = vfVar;
        this.f = false;
        this.g = false;
        this.h = z;
        this.i = false;
        this.j = false;
        this.k = list;
        this.l = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(o11.B);
        arrayList.add(ua0.b);
        arrayList.add(kpVar);
        arrayList.addAll(list3);
        arrayList.add(o11.p);
        arrayList.add(o11.g);
        arrayList.add(o11.d);
        arrayList.add(o11.e);
        arrayList.add(o11.f);
        l11 utVar = aVar2 == c30.P ? o11.k : new ut();
        arrayList.add(new r11(Long.TYPE, Long.class, utVar));
        arrayList.add(new r11(Double.TYPE, Double.class, new st()));
        arrayList.add(new r11(Float.TYPE, Float.class, new tt()));
        arrayList.add(o11.l);
        arrayList.add(o11.h);
        arrayList.add(o11.i);
        arrayList.add(new q11(AtomicLong.class, new k11(new vt(utVar))));
        arrayList.add(new q11(AtomicLongArray.class, new k11(new wt(utVar))));
        arrayList.add(o11.j);
        arrayList.add(o11.m);
        arrayList.add(o11.q);
        arrayList.add(o11.r);
        arrayList.add(new q11(BigDecimal.class, o11.n));
        arrayList.add(new q11(BigInteger.class, o11.o));
        arrayList.add(o11.s);
        arrayList.add(o11.t);
        arrayList.add(o11.v);
        arrayList.add(o11.w);
        arrayList.add(o11.z);
        arrayList.add(o11.u);
        arrayList.add(o11.b);
        arrayList.add(sj.b);
        arrayList.add(o11.y);
        arrayList.add(bx0.b);
        arrayList.add(pt0.b);
        arrayList.add(o11.x);
        arrayList.add(i7.c);
        arrayList.add(o11.a);
        arrayList.add(new od(vfVar));
        arrayList.add(new x30(vfVar));
        pz pzVar = new pz(vfVar);
        this.d = pzVar;
        arrayList.add(pzVar);
        arrayList.add(o11.C);
        arrayList.add(new kk0(vfVar, aVar, kpVar, pzVar));
        this.e = Collections.unmodifiableList(arrayList);
    }

    public static void a(c00 c00Var, Object obj) {
        if (obj != null) {
            try {
                if (c00Var.U() == 10) {
                    return;
                }
                throw new xz("JSON document was not fully consumed.");
            } catch (v30 e) {
                throw new e00(e);
            } catch (IOException e2) {
                throw new xz(e2);
            }
        }
    }

    public static void b(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final <T> T c(c00 c00Var, Type type) {
        boolean z = c00Var.Q;
        boolean z2 = true;
        c00Var.Q = true;
        try {
            try {
                try {
                    c00Var.U();
                    z2 = false;
                    T a2 = f(new u11<>(type)).a(c00Var);
                    c00Var.Q = z;
                    return a2;
                } catch (IOException e) {
                    throw new e00(e);
                } catch (IllegalStateException e2) {
                    throw new e00(e2);
                }
            } catch (EOFException e3) {
                if (z2) {
                    c00Var.Q = z;
                    return null;
                }
                throw new e00(e3);
            } catch (AssertionError e4) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e4.getMessage());
                assertionError.initCause(e4);
                throw assertionError;
            }
        } catch (Throwable th) {
            c00Var.Q = z;
            throw th;
        }
    }

    public final Object d(InputStreamReader inputStreamReader, Class cls) {
        c00 c00Var = new c00(inputStreamReader);
        c00Var.Q = this.j;
        Object c = c(c00Var, cls);
        a(c00Var, c);
        return ar.n(cls).cast(c);
    }

    public final Object e(Class cls, String str) {
        Object obj;
        if (str == null) {
            obj = null;
        } else {
            c00 c00Var = new c00(new StringReader(str));
            c00Var.Q = this.j;
            Object c = c(c00Var, cls);
            a(c00Var, c);
            obj = c;
        }
        return ar.n(cls).cast(obj);
    }

    public final <T> l11<T> f(u11<T> u11Var) {
        l11<T> l11Var = (l11) this.b.get(u11Var);
        if (l11Var != null) {
            return l11Var;
        }
        Map<u11<?>, a<?>> map = this.a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.a.set(map);
            z = true;
        }
        a<?> aVar = map.get(u11Var);
        if (aVar != null) {
            return aVar;
        }
        try {
            a<?> aVar2 = new a<>();
            map.put(u11Var, aVar2);
            for (m11 m11Var : this.e) {
                l11<T> a2 = m11Var.a(this, u11Var);
                if (a2 != null) {
                    if (aVar2.a == null) {
                        aVar2.a = a2;
                        this.b.put(u11Var, a2);
                        return a2;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + u11Var);
        } finally {
            map.remove(u11Var);
            if (z) {
                this.a.remove();
            }
        }
    }

    public final <T> l11<T> g(m11 m11Var, u11<T> u11Var) {
        if (!this.e.contains(m11Var)) {
            m11Var = this.d;
        }
        boolean z = false;
        for (m11 m11Var2 : this.e) {
            if (z) {
                l11<T> a2 = m11Var2.a(this, u11Var);
                if (a2 != null) {
                    return a2;
                }
            } else if (m11Var2 == m11Var) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + u11Var);
    }

    public final i00 h(Writer writer) {
        if (this.g) {
            writer.write(")]}'\n");
        }
        i00 i00Var = new i00(writer);
        if (this.i) {
            i00Var.S = "  ";
            i00Var.T = ": ";
        }
        i00Var.X = this.f;
        return i00Var;
    }

    public final String i(Object obj) {
        if (obj == null) {
            yz yzVar = yz.P;
            StringWriter stringWriter = new StringWriter();
            try {
                j(yzVar, h(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new xz(e);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            k(obj, cls, h(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new xz(e2);
        }
    }

    public final void j(yz yzVar, i00 i00Var) {
        boolean z = i00Var.U;
        i00Var.U = true;
        boolean z2 = i00Var.V;
        i00Var.V = this.h;
        boolean z3 = i00Var.X;
        i00Var.X = this.f;
        try {
            try {
                o11.A.b(i00Var, yzVar);
            } catch (IOException e) {
                throw new xz(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            i00Var.U = z;
            i00Var.V = z2;
            i00Var.X = z3;
        }
    }

    public final void k(Object obj, Class cls, i00 i00Var) {
        l11 f = f(new u11(cls));
        boolean z = i00Var.U;
        i00Var.U = true;
        boolean z2 = i00Var.V;
        i00Var.V = this.h;
        boolean z3 = i00Var.X;
        i00Var.X = this.f;
        try {
            try {
                f.b(i00Var, obj);
            } catch (IOException e) {
                throw new xz(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            i00Var.U = z;
            i00Var.V = z2;
            i00Var.X = z3;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f + ",factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}