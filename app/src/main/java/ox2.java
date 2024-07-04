package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.ft2;
import defpackage.ox2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ox2  reason: default package */
public abstract class ox2<MessageType extends ox2<MessageType, BuilderType>, BuilderType extends ft2<MessageType, BuilderType>> extends du1<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    public u54 zzc = u54.f;

    public static ox2 b(Class cls) {
        Map map = zzb;
        ox2 ox2Var = (ox2) map.get(cls);
        if (ox2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ox2Var = (ox2) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (ox2Var == null) {
            ox2Var = (ox2) ((ox2) hc4.i(cls)).m(6);
            if (ox2Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, ox2Var);
        }
        return ox2Var;
    }

    public static Object d(Object obj, Method method, Object... objArr) {
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

    public static void g(Class cls, ox2 ox2Var) {
        ox2Var.f();
        zzb.put(cls, ox2Var);
    }

    @Override // defpackage.du1
    public final int a(lr3 lr3Var) {
        if (l()) {
            int n = n(lr3Var);
            if (n >= 0) {
                return n;
            }
            throw new IllegalStateException(k6.a("serialized size must be non-negative, was ", n));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int n2 = n(lr3Var);
        if (n2 >= 0) {
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | n2;
            return n2;
        }
        throw new IllegalStateException(k6.a("serialized size must be non-negative, was ", n2));
    }

    @Override // defpackage.xk3
    public final /* synthetic */ ox2 e() {
        return (ox2) m(6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return lq3.c.a(getClass()).d(this, (ox2) obj);
    }

    public final void f() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void h() {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (!l()) {
            int i = this.zza;
            if (i == 0) {
                int f = lq3.c.a(getClass()).f(this);
                this.zza = f;
                return f;
            }
            return i;
        }
        return lq3.c.a(getClass()).f(this);
    }

    @Override // defpackage.fk3
    public final int i() {
        int i;
        if (l()) {
            i = n(null);
            if (i < 0) {
                throw new IllegalStateException(k6.a("serialized size must be non-negative, was ", i));
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = n(null);
                if (i >= 0) {
                    this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | i;
                } else {
                    throw new IllegalStateException(k6.a("serialized size must be non-negative, was ", i));
                }
            }
        }
        return i;
    }

    @Override // defpackage.fk3
    public final /* synthetic */ ft2 j() {
        return (ft2) m(5);
    }

    public final boolean k() {
        byte byteValue = ((Byte) m(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean g = lq3.c.a(getClass()).g(this);
        m(2);
        return g;
    }

    public final boolean l() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    public abstract Object m(int i);

    public final int n(lr3 lr3Var) {
        if (lr3Var == null) {
            return lq3.c.a(getClass()).e(this);
        }
        return lr3Var.e(this);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = ql3.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        ql3.c(this, sb, 0);
        return sb.toString();
    }
}