package defpackage;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: kv5  reason: default package */
public final class kv5 extends tu5 {
    public final qv5 k;
    public final boolean l;
    public final lc3 m;
    public final ya3 n;
    public zu5 o;
    public yu5 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public kv5(qv5 qv5Var, boolean z) {
        boolean z2;
        this.k = qv5Var;
        if (z) {
            qv5Var.u();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new lc3();
        this.n = new ya3();
        qv5Var.N();
        this.o = new zu5(new av5(qv5Var.r()), lc3.n, zu5.e);
    }

    @Override // defpackage.nu5, defpackage.qv5
    public final void N() {
        this.k.N();
    }

    @Override // defpackage.qv5
    public final void Y() {
    }

    @Override // defpackage.qv5
    public final void h(nv5 nv5Var) {
        yu5 yu5Var = (yu5) nv5Var;
        nv5 nv5Var2 = yu5Var.S;
        if (nv5Var2 != null) {
            qv5 qv5Var = yu5Var.R;
            qv5Var.getClass();
            qv5Var.h(nv5Var2);
        }
        if (nv5Var == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.nu5
    public final void m(bf5 bf5Var) {
        this.j = bf5Var;
        this.i = zn4.u();
        if (!this.l) {
            this.q = true;
            p(null, this.k);
        }
    }

    @Override // defpackage.tu5, defpackage.nu5
    public final void o() {
        this.r = false;
        this.q = false;
        super.o();
    }

    @Override // defpackage.tu5
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        Void r1 = (Void) obj;
    }

    @Override // defpackage.qv5
    public final el2 r() {
        return this.k.r();
    }

    @Override // defpackage.tu5
    public final /* synthetic */ void s(long j, Object obj) {
        Void r3 = (Void) obj;
    }

    @Override // defpackage.tu5
    public final ov5 t(Object obj, ov5 ov5Var) {
        Void r2 = (Void) obj;
        Object obj2 = ov5Var.a;
        Object obj3 = this.o.d;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = zu5.e;
        }
        return ov5Var.b(obj2);
    }

    @Override // defpackage.nu5, defpackage.qv5
    public final void u() {
        this.k.u();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.tu5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(Object obj, qv5 qv5Var, kd3 kd3Var) {
        long j;
        zu5 zu5Var;
        yu5 yu5Var;
        ov5 b;
        zu5 zu5Var2;
        Void r12 = (Void) obj;
        if (this.r) {
            zu5 zu5Var3 = this.o;
            this.o = new zu5(kd3Var, zu5Var3.c, zu5Var3.d);
            yu5 yu5Var2 = this.p;
            if (yu5Var2 != null) {
                x(yu5Var2.U);
            }
        } else if (kd3Var.o()) {
            if (this.s) {
                zu5 zu5Var4 = this.o;
                zu5Var2 = new zu5(kd3Var, zu5Var4.c, zu5Var4.d);
            } else {
                zu5Var2 = new zu5(kd3Var, lc3.n, zu5.e);
            }
            this.o = zu5Var2;
        } else {
            kd3Var.e(0, this.m, 0L);
            Object obj2 = this.m.a;
            yu5 yu5Var3 = this.p;
            if (yu5Var3 != null) {
                long j2 = yu5Var3.Q;
                this.o.n(yu5Var3.P.a, this.n);
                this.o.e(0, this.m, 0L);
                if (j2 != 0) {
                    j = j2;
                    Pair l = kd3Var.l(this.m, this.n, 0, j);
                    Object obj3 = l.first;
                    long longValue = ((Long) l.second).longValue();
                    if (!this.s) {
                        zu5 zu5Var5 = this.o;
                        zu5Var = new zu5(kd3Var, zu5Var5.c, zu5Var5.d);
                    } else {
                        zu5Var = new zu5(kd3Var, obj2, obj3);
                    }
                    this.o = zu5Var;
                    yu5Var = this.p;
                    if (yu5Var != null) {
                        x(longValue);
                        ov5 ov5Var = yu5Var.P;
                        Object obj4 = ov5Var.a;
                        if (this.o.d != null && obj4.equals(zu5.e)) {
                            obj4 = this.o.d;
                        }
                        b = ov5Var.b(obj4);
                        this.s = true;
                        this.r = true;
                        n(this.o);
                        if (b == null) {
                            yu5 yu5Var4 = this.p;
                            yu5Var4.getClass();
                            yu5Var4.j(b);
                            return;
                        }
                        return;
                    }
                }
            }
            j = 0;
            Pair l2 = kd3Var.l(this.m, this.n, 0, j);
            Object obj32 = l2.first;
            long longValue2 = ((Long) l2.second).longValue();
            if (!this.s) {
            }
            this.o = zu5Var;
            yu5Var = this.p;
            if (yu5Var != null) {
            }
        }
        b = null;
        this.s = true;
        this.r = true;
        n(this.o);
        if (b == null) {
        }
    }

    @Override // defpackage.qv5
    /* renamed from: w */
    public final yu5 g(ov5 ov5Var, jz5 jz5Var, long j) {
        boolean z;
        yu5 yu5Var = new yu5(ov5Var, jz5Var, j);
        qv5 qv5Var = this.k;
        if (yu5Var.R == null) {
            z = true;
        } else {
            z = false;
        }
        tv2.I(z);
        yu5Var.R = qv5Var;
        if (this.r) {
            Object obj = ov5Var.a;
            if (this.o.d != null && obj.equals(zu5.e)) {
                obj = this.o.d;
            }
            yu5Var.j(ov5Var.b(obj));
        } else {
            this.p = yu5Var;
            if (!this.q) {
                this.q = true;
                p(null, this.k);
            }
        }
        return yu5Var;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final void x(long j) {
        yu5 yu5Var = this.p;
        int a = this.o.a(yu5Var.P.a);
        if (a == -1) {
            return;
        }
        zu5 zu5Var = this.o;
        ya3 ya3Var = this.n;
        zu5Var.d(a, ya3Var, false);
        long j2 = ya3Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        yu5Var.U = j;
    }
}