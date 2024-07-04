package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: zv5  reason: default package */
public final class zv5 extends tu5 {
    public static final el2 q;
    public final qv5[] k;
    public final kd3[] l;
    public final ArrayList m;
    public int n;
    public long[][] o;
    public yv5 p;

    static {
        sw4 sw4Var = sw4.V;
        lv4 lv4Var = nv4.Q;
        nw4 nw4Var = nw4.T;
        Collections.emptyList();
        q = new el2("MergingMediaSource", new o52(0), null, new oc2(), nq2.y, si2.a);
    }

    public zv5(qv5... qv5VarArr) {
        new q05();
        this.k = qv5VarArr;
        this.m = new ArrayList(Arrays.asList(qv5VarArr));
        this.n = -1;
        this.l = new kd3[qv5VarArr.length];
        this.o = new long[0];
        new HashMap();
        new iw4(new xu4(), new hw4());
    }

    @Override // defpackage.qv5
    public final void Y() {
        yv5 yv5Var = this.p;
        if (yv5Var == null) {
            for (su5 su5Var : this.h.values()) {
                su5Var.a.Y();
            }
            return;
        }
        throw yv5Var;
    }

    @Override // defpackage.qv5
    public final nv5 g(ov5 ov5Var, jz5 jz5Var, long j) {
        int length = this.k.length;
        nv5[] nv5VarArr = new nv5[length];
        int a = this.l[0].a(ov5Var.a);
        for (int i = 0; i < length; i++) {
            nv5VarArr[i] = this.k[i].g(ov5Var.b(this.l[i].f(a)), jz5Var, j - this.o[a][i]);
        }
        return new xv5(this.o[a], nv5VarArr);
    }

    @Override // defpackage.qv5
    public final void h(nv5 nv5Var) {
        xv5 xv5Var = (xv5) nv5Var;
        int i = 0;
        while (true) {
            qv5[] qv5VarArr = this.k;
            if (i < qv5VarArr.length) {
                qv5 qv5Var = qv5VarArr[i];
                nv5 nv5Var2 = xv5Var.P[i];
                if (nv5Var2 instanceof vv5) {
                    nv5Var2 = ((vv5) nv5Var2).P;
                }
                qv5Var.h(nv5Var2);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.nu5
    public final void m(bf5 bf5Var) {
        this.j = bf5Var;
        this.i = zn4.u();
        for (int i = 0; i < this.k.length; i++) {
            p(Integer.valueOf(i), this.k[i]);
        }
    }

    @Override // defpackage.tu5, defpackage.nu5
    public final void o() {
        super.o();
        Arrays.fill(this.l, (Object) null);
        this.n = -1;
        this.p = null;
        this.m.clear();
        Collections.addAll(this.m, this.k);
    }

    @Override // defpackage.qv5
    public final el2 r() {
        qv5[] qv5VarArr = this.k;
        return qv5VarArr.length > 0 ? qv5VarArr[0].r() : q;
    }

    @Override // defpackage.tu5
    public final /* bridge */ /* synthetic */ ov5 t(Object obj, ov5 ov5Var) {
        if (((Integer) obj).intValue() == 0) {
            return ov5Var;
        }
        return null;
    }

    @Override // defpackage.tu5
    public final /* bridge */ /* synthetic */ void v(Object obj, qv5 qv5Var, kd3 kd3Var) {
        int i;
        if (this.p != null) {
            return;
        }
        if (this.n == -1) {
            i = kd3Var.b();
            this.n = i;
        } else {
            int b = kd3Var.b();
            int i2 = this.n;
            if (b != i2) {
                this.p = new yv5();
                return;
            }
            i = i2;
        }
        if (this.o.length == 0) {
            this.o = (long[][]) Array.newInstance(Long.TYPE, i, this.l.length);
        }
        this.m.remove(qv5Var);
        this.l[((Integer) obj).intValue()] = kd3Var;
        if (this.m.isEmpty()) {
            n(this.l[0]);
        }
    }
}