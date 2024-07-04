package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.ee5;
import defpackage.ie5;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ie5  reason: default package */
public abstract class ie5<MessageType extends ie5<MessageType, BuilderType>, BuilderType extends ee5<MessageType, BuilderType>> extends vc5<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    public pg5 zzc = pg5.f;

    public static ie5 h(Class cls) {
        Map map = zzb;
        ie5 ie5Var = (ie5) map.get(cls);
        if (ie5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ie5Var = (ie5) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (ie5Var == null) {
            ie5Var = (ie5) ((ie5) zg5.l(cls)).t(6, null);
            if (ie5Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, ie5Var);
        }
        return ie5Var;
    }

    public static ie5 j(ie5 ie5Var, gd5 gd5Var, ud5 ud5Var) {
        ld5 v = gd5Var.v();
        ie5 i = ie5Var.i();
        try {
            dg5 a = vf5.c.a(i.getClass());
            md5 md5Var = v.b;
            if (md5Var == null) {
                md5Var = new md5(v);
            }
            a.i(i, md5Var, ud5Var);
            a.a(i);
            try {
                v.z(0);
                u(i);
                return i;
            } catch (te5 e) {
                throw e;
            }
        } catch (ng5 e2) {
            throw new te5(e2.getMessage());
        } catch (te5 e3) {
            if (e3.P) {
                throw new te5(e3);
            }
            throw e3;
        } catch (IOException e4) {
            if (e4.getCause() instanceof te5) {
                throw ((te5) e4.getCause());
            }
            throw new te5(e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof te5) {
                throw ((te5) e5.getCause());
            }
            throw e5;
        }
    }

    public static qe5 k(qe5 qe5Var) {
        int size = qe5Var.size();
        return qe5Var.e(size == 0 ? 10 : size + size);
    }

    public static Object l(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void n(Class cls, ie5 ie5Var) {
        ie5Var.m();
        zzb.put(cls, ie5Var);
    }

    public static void u(ie5 ie5Var) {
        if (ie5Var.q()) {
            return;
        }
        throw new te5(new ng5().getMessage());
    }

    public static ie5 v(ie5 ie5Var, byte[] bArr, int i, ud5 ud5Var) {
        ie5 i2 = ie5Var.i();
        try {
            dg5 a = vf5.c.a(i2.getClass());
            a.h(i2, bArr, 0, i, new yc5(ud5Var));
            a.a(i2);
            return i2;
        } catch (IOException e) {
            if (e.getCause() instanceof te5) {
                throw ((te5) e.getCause());
            }
            throw new te5(e);
        } catch (IndexOutOfBoundsException unused) {
            throw te5.f();
        } catch (ng5 e2) {
            throw new te5(e2.getMessage());
        } catch (te5 e3) {
            if (e3.P) {
                throw new te5(e3);
            }
            throw e3;
        }
    }

    @Override // defpackage.nf5
    public final /* synthetic */ ee5 a() {
        return (ee5) t(5, null);
    }

    @Override // defpackage.of5
    public final /* synthetic */ ie5 b() {
        return (ie5) t(6, null);
    }

    @Override // defpackage.nf5
    public final int d() {
        int i;
        if (r()) {
            i = f(null);
            if (i < 0) {
                throw new IllegalStateException(k6.a("serialized size must be non-negative, was ", i));
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = f(null);
                if (i >= 0) {
                    this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | i;
                } else {
                    throw new IllegalStateException(k6.a("serialized size must be non-negative, was ", i));
                }
            }
        }
        return i;
    }

    @Override // defpackage.vc5
    public final int e(dg5 dg5Var) {
        if (r()) {
            int f = f(dg5Var);
            if (f >= 0) {
                return f;
            }
            throw new IllegalStateException(k6.a("serialized size must be non-negative, was ", f));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int f2 = f(dg5Var);
        if (f2 >= 0) {
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | f2;
            return f2;
        }
        throw new IllegalStateException(k6.a("serialized size must be non-negative, was ", f2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return vf5.c.a(getClass()).d(this, (ie5) obj);
    }

    public final int f(dg5 dg5Var) {
        if (dg5Var == null) {
            return vf5.c.a(getClass()).e(this);
        }
        return dg5Var.e(this);
    }

    public final ee5 g() {
        ee5 ee5Var = (ee5) t(5, null);
        ee5Var.e(this);
        return ee5Var;
    }

    public final int hashCode() {
        if (!r()) {
            int i = this.zza;
            if (i == 0) {
                int f = vf5.c.a(getClass()).f(this);
                this.zza = f;
                return f;
            }
            return i;
        }
        return vf5.c.a(getClass()).f(this);
    }

    public final ie5 i() {
        return (ie5) t(4, null);
    }

    public final void m() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void o() {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | Integer.MAX_VALUE;
    }

    public final void p(qd5 qd5Var) {
        dg5 a = vf5.c.a(getClass());
        rd5 rd5Var = qd5Var.Q;
        if (rd5Var == null) {
            rd5Var = new rd5(qd5Var);
        }
        a.j(this, rd5Var);
    }

    public final boolean q() {
        ie5<MessageType, BuilderType> ie5Var = null;
        byte byteValue = ((Byte) t(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean g = vf5.c.a(getClass()).g(this);
        if (true == g) {
            ie5Var = this;
        }
        t(2, ie5Var);
        return g;
    }

    public final boolean r() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    public final ee5 s() {
        return (ee5) t(5, null);
    }

    public abstract Object t(int i, ie5 ie5Var);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = pf5.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        pf5.c(this, sb, 0);
        return sb.toString();
    }
}