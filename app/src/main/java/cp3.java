package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: cp3  reason: default package */
public final class cp3 extends te2 {
    public final String P;
    public final jl3 Q;
    public final nl3 R;

    public cp3(String str, jl3 jl3Var, nl3 nl3Var) {
        this.P = str;
        this.Q = jl3Var;
        this.R = nl3Var;
    }

    @Override // defpackage.ue2
    public final String G() {
        String a;
        nl3 nl3Var = this.R;
        synchronized (nl3Var) {
            a = nl3Var.a("store");
        }
        return a;
    }

    @Override // defpackage.ue2
    public final double b() {
        double d;
        nl3 nl3Var = this.R;
        synchronized (nl3Var) {
            d = nl3Var.q;
        }
        return d;
    }

    @Override // defpackage.ue2
    public final cs3 f() {
        return this.R.g();
    }

    @Override // defpackage.ue2
    public final uc2 g() {
        uc2 uc2Var;
        nl3 nl3Var = this.R;
        synchronized (nl3Var) {
            uc2Var = nl3Var.c;
        }
        return uc2Var;
    }

    @Override // defpackage.ue2
    public final mq3 h() {
        if (!((Boolean) w82.d.c.a(x92.J5)).booleanValue()) {
            return null;
        }
        return this.Q.f;
    }

    @Override // defpackage.ue2
    public final String k() {
        String a;
        nl3 nl3Var = this.R;
        synchronized (nl3Var) {
            a = nl3Var.a("advertiser");
        }
        return a;
    }

    @Override // defpackage.ue2
    public final ad2 l() {
        ad2 ad2Var;
        nl3 nl3Var = this.R;
        synchronized (nl3Var) {
            ad2Var = nl3Var.r;
        }
        return ad2Var;
    }

    @Override // defpackage.ue2
    public final String m() {
        String a;
        nl3 nl3Var = this.R;
        synchronized (nl3Var) {
            a = nl3Var.a("call_to_action");
        }
        return a;
    }

    @Override // defpackage.ue2
    public final hw n() {
        hw hwVar;
        nl3 nl3Var = this.R;
        synchronized (nl3Var) {
            hwVar = nl3Var.p;
        }
        return hwVar;
    }

    @Override // defpackage.ue2
    public final hw o() {
        return new va0(this.Q);
    }

    @Override // defpackage.ue2
    public final String q() {
        String a;
        nl3 nl3Var = this.R;
        synchronized (nl3Var) {
            a = nl3Var.a("headline");
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026  */
    @Override // defpackage.ue2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List r() {
        List list;
        boolean z;
        List list2;
        n84 n84Var;
        nl3 nl3Var = this.R;
        synchronized (nl3Var) {
            list = nl3Var.f;
        }
        if (!list.isEmpty()) {
            nl3 nl3Var2 = this.R;
            synchronized (nl3Var2) {
                n84Var = nl3Var2.g;
            }
            if (n84Var != null) {
                z = true;
                if (!z) {
                    nl3 nl3Var3 = this.R;
                    synchronized (nl3Var3) {
                        list2 = nl3Var3.f;
                    }
                    return list2;
                }
                return Collections.emptyList();
            }
        }
        z = false;
        if (!z) {
        }
    }

    @Override // defpackage.ue2
    public final String s() {
        String a;
        nl3 nl3Var = this.R;
        synchronized (nl3Var) {
            a = nl3Var.a("price");
        }
        return a;
    }

    @Override // defpackage.ue2
    public final String t() {
        String a;
        nl3 nl3Var = this.R;
        synchronized (nl3Var) {
            a = nl3Var.a("body");
        }
        return a;
    }

    public final void t4(yk3 yk3Var) {
        jl3 jl3Var = this.Q;
        synchronized (jl3Var) {
            jl3Var.C.P.set(yk3Var);
        }
    }

    @Override // defpackage.ue2
    public final List u() {
        List list;
        nl3 nl3Var = this.R;
        synchronized (nl3Var) {
            list = nl3Var.e;
        }
        return list;
    }

    public final void u4(re2 re2Var) {
        jl3 jl3Var = this.Q;
        synchronized (jl3Var) {
            jl3Var.k.j(re2Var);
        }
    }

    public final boolean v4() {
        boolean J;
        jl3 jl3Var = this.Q;
        synchronized (jl3Var) {
            J = jl3Var.k.J();
        }
        return J;
    }
}