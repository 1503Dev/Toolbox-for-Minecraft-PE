package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d22  reason: default package */
public final class d22 implements wg3, i52, aa3, kg4, qt4, xw5 {
    public final /* synthetic */ int P;
    public final Object Q;

    public d22() {
        this.P = 0;
        this.Q = new HashMap();
    }

    @Override // defpackage.xw5
    public final long M() {
        long j = Long.MAX_VALUE;
        for (xw5 xw5Var : (xw5[]) this.Q) {
            long M = xw5Var.M();
            if (M != Long.MIN_VALUE) {
                j = Math.min(j, M);
            }
        }
        if (j == RecyclerView.FOREVER_NS) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.aa3, defpackage.qt4
    public final cs3 a() {
        return ((y03) this.Q).q();
    }

    @Override // defpackage.qt4
    public final Object a() {
        return (wy5) this.Q;
    }

    @Override // defpackage.xw5
    public final void b(long j) {
        for (xw5 xw5Var : (xw5[]) this.Q) {
            xw5Var.b(j);
        }
    }

    @Override // defpackage.xw5
    public final boolean c(long j) {
        xw5[] xw5VarArr;
        boolean z;
        boolean z2 = false;
        do {
            long M = M();
            if (M == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (xw5 xw5Var : (xw5[]) this.Q) {
                long M2 = xw5Var.M();
                boolean z3 = M2 != Long.MIN_VALUE && M2 <= j;
                if (M2 == M || z3) {
                    z |= xw5Var.c(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // defpackage.xw5
    public final long d() {
        long j = Long.MAX_VALUE;
        for (xw5 xw5Var : (xw5[]) this.Q) {
            long d = xw5Var.d();
            if (d != Long.MIN_VALUE) {
                j = Math.min(j, d);
            }
        }
        if (j == RecyclerView.FOREVER_NS) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        switch (this.P) {
            case 1:
                ((ug3) obj).v0((d62) this.Q);
                return;
            case 2:
                ((vh3) obj).m((String) this.Q);
                return;
            default:
                ((ds2) obj).p((tz3) this.Q);
                return;
        }
    }

    @Override // defpackage.i52
    public final void j(t62 t62Var) {
        t62Var.j();
        u62.H((u62) t62Var.Q, (n72) this.Q);
    }

    @Override // defpackage.xw5
    public final boolean m() {
        for (xw5 xw5Var : (xw5[]) this.Q) {
            if (xw5Var.m()) {
                return true;
            }
        }
        return false;
    }

    public final AtomicReference n(String str) {
        synchronized (this) {
            if (!((Map) this.Q).containsKey(str)) {
                ((Map) this.Q).put(str, new AtomicReference());
            }
        }
        return (AtomicReference) ((Map) this.Q).get(str);
    }

    public /* synthetic */ d22(int i) {
        this.P = 2;
        this.Q = "MalformedJson";
    }

    public /* synthetic */ d22(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }
}