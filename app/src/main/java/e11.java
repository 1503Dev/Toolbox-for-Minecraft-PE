package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Type;

/* renamed from: e11  reason: default package */
public final class e11<T> extends l11<T> {
    public final d00<T> a;
    public final vz<T> b;
    public final xt c;
    public final u11<T> d;
    public final m11 e;
    public final e11<T>.a f = new a();
    public l11<T> g;

    /* renamed from: e11$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class a {
        public a() {
        }
    }

    /* renamed from: e11$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b implements m11 {
        public final u11<?> P;
        public final boolean Q;
        public final Class<?> R;
        public final d00<?> S;
        public final vz<?> T;

        public b(Object obj, u11<?> u11Var, boolean z, Class<?> cls) {
            d00<?> d00Var = obj instanceof d00 ? (d00) obj : null;
            this.S = d00Var;
            vz<?> vzVar = obj instanceof vz ? (vz) obj : null;
            this.T = vzVar;
            n42.b((d00Var == null && vzVar == null) ? false : true);
            this.P = u11Var;
            this.Q = z;
            this.R = cls;
        }

        @Override // defpackage.m11
        public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
            boolean isAssignableFrom;
            u11<?> u11Var2 = this.P;
            if (u11Var2 != null) {
                if (!u11Var2.equals(u11Var) && (!this.Q || this.P.b != u11Var.a)) {
                    isAssignableFrom = false;
                } else {
                    isAssignableFrom = true;
                }
            } else {
                isAssignableFrom = this.R.isAssignableFrom(u11Var.a);
            }
            if (isAssignableFrom) {
                return new e11(this.S, this.T, xtVar, u11Var, this);
            }
            return null;
        }
    }

    public e11(d00<T> d00Var, vz<T> vzVar, xt xtVar, u11<T> u11Var, m11 m11Var) {
        this.a = d00Var;
        this.b = vzVar;
        this.c = xtVar;
        this.d = u11Var;
        this.e = m11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    @Override // defpackage.l11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T a(c00 c00Var) {
        boolean z;
        wz wzVar;
        if (this.b == null) {
            l11<T> l11Var = this.g;
            if (l11Var == null) {
                l11Var = this.c.g(this.e, this.d);
                this.g = l11Var;
            }
            return l11Var.a(c00Var);
        }
        try {
            try {
                c00Var.U();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                wzVar = (wz) o11.A.a(c00Var);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    wzVar = yz.P;
                    wzVar.getClass();
                    if (!(wzVar instanceof yz)) {
                    }
                } else {
                    throw new e00(e);
                }
            }
            wzVar.getClass();
            if (!(wzVar instanceof yz)) {
                return null;
            }
            vz<T> vzVar = this.b;
            Type type = this.d.b;
            return (T) vzVar.a(wzVar, this.f);
        } catch (NumberFormatException e3) {
            throw new e00(e3);
        } catch (v30 e4) {
            throw new e00(e4);
        } catch (IOException e5) {
            throw new xz(e5);
        }
    }

    @Override // defpackage.l11
    public final void b(i00 i00Var, T t) {
        d00<T> d00Var = this.a;
        if (d00Var == null) {
            l11<T> l11Var = this.g;
            if (l11Var == null) {
                l11Var = this.c.g(this.e, this.d);
                this.g = l11Var;
            }
            l11Var.b(i00Var, t);
        } else if (t == null) {
            i00Var.H();
        } else {
            Type type = this.d.b;
            o11.A.b(i00Var, d00Var.a());
        }
    }
}