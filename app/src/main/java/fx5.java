package defpackage;

import android.net.Uri;
import java.util.Collections;

/* renamed from: fx5  reason: default package */
public final class fx5 extends kd3 {
    public static final Object g = new Object();
    public final long b;
    public final long c;
    public final boolean d;
    public final el2 e;
    public final oc2 f;

    static {
        sw4 sw4Var = sw4.V;
        lv4 lv4Var = nv4.Q;
        nw4 nw4Var = nw4.T;
        Collections.emptyList();
        nw4 nw4Var2 = nw4.T;
        si2 si2Var = si2.a;
        if (Uri.EMPTY != null) {
            kv4 kv4Var = new kv4();
            if (nw4Var2.S <= 0) {
                kv4Var.s();
            } else {
                kj2 kj2Var = (kj2) nw4Var2.get(0);
                throw null;
            }
        }
        nq2 nq2Var = nq2.y;
    }

    public fx5(long j, long j2, boolean z, el2 el2Var, oc2 oc2Var) {
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = el2Var;
        this.f = oc2Var;
    }

    @Override // defpackage.kd3
    public final int a(Object obj) {
        return g.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.kd3
    public final int b() {
        return 1;
    }

    @Override // defpackage.kd3
    public final int c() {
        return 1;
    }

    @Override // defpackage.kd3
    public final ya3 d(int i, ya3 ya3Var, boolean z) {
        tv2.w(i, 1);
        Object obj = z ? g : null;
        long j = this.b;
        jg3 jg3Var = jg3.b;
        ya3Var.getClass();
        jg3 jg3Var2 = jg3.b;
        ya3Var.a = null;
        ya3Var.b = obj;
        ya3Var.c = 0;
        ya3Var.d = j;
        ya3Var.f = jg3Var2;
        ya3Var.e = false;
        return ya3Var;
    }

    @Override // defpackage.kd3
    public final lc3 e(int i, lc3 lc3Var, long j) {
        tv2.w(i, 1);
        Object obj = lc3.n;
        lc3Var.a(this.e, this.d, false, this.f, this.c);
        return lc3Var;
    }

    @Override // defpackage.kd3
    public final Object f(int i) {
        tv2.w(i, 1);
        return g;
    }
}