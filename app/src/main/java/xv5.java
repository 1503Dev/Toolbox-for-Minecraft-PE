package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: xv5  reason: default package */
public final class xv5 implements nv5, mv5 {
    public final nv5[] P;
    public mv5 T;
    public hx5 U;
    public final ArrayList R = new ArrayList();
    public final HashMap S = new HashMap();
    public d22 W = new d22(7, new xw5[0]);
    public final IdentityHashMap Q = new IdentityHashMap();
    public nv5[] V = new nv5[0];

    public xv5(long[] jArr, nv5... nv5VarArr) {
        this.P = nv5VarArr;
        for (int i = 0; i < nv5VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.P[i] = new vv5(nv5VarArr[i], j);
            }
        }
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final long M() {
        return this.W.M();
    }

    @Override // defpackage.mv5
    public final void a(nv5 nv5Var) {
        this.R.remove(nv5Var);
        if (!this.R.isEmpty()) {
            return;
        }
        int i = 0;
        for (nv5 nv5Var2 : this.P) {
            i += nv5Var2.f().a;
        }
        qe3[] qe3VarArr = new qe3[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            nv5[] nv5VarArr = this.P;
            if (i2 < nv5VarArr.length) {
                hx5 f = nv5VarArr[i2].f();
                int i4 = f.a;
                int i5 = 0;
                while (i5 < i4) {
                    qe3 a = f.a(i5);
                    qe3 qe3Var = new qe3(i2 + ":" + a.a, a.c);
                    this.S.put(qe3Var, a);
                    qe3VarArr[i3] = qe3Var;
                    i5++;
                    i3++;
                }
                i2++;
            } else {
                this.U = new hx5(qe3VarArr);
                mv5 mv5Var = this.T;
                mv5Var.getClass();
                mv5Var.a(this);
                return;
            }
        }
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final void b(long j) {
        this.W.b(j);
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final boolean c(long j) {
        if (this.R.isEmpty()) {
            return this.W.c(j);
        }
        int size = this.R.size();
        for (int i = 0; i < size; i++) {
            ((nv5) this.R.get(i)).c(j);
        }
        return false;
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final long d() {
        return this.W.d();
    }

    @Override // defpackage.mv5
    public final /* bridge */ /* synthetic */ void e(xw5 xw5Var) {
        nv5 nv5Var = (nv5) xw5Var;
        mv5 mv5Var = this.T;
        mv5Var.getClass();
        mv5Var.e(this);
    }

    @Override // defpackage.nv5
    public final hx5 f() {
        hx5 hx5Var = this.U;
        hx5Var.getClass();
        return hx5Var;
    }

    @Override // defpackage.nv5
    public final long g(long j) {
        long g = this.V[0].g(j);
        int i = 1;
        while (true) {
            nv5[] nv5VarArr = this.V;
            if (i >= nv5VarArr.length) {
                return g;
            }
            if (nv5VarArr[i].g(g) != g) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // defpackage.nv5
    public final void h(long j) {
        for (nv5 nv5Var : this.V) {
            nv5Var.h(j);
        }
    }

    @Override // defpackage.nv5
    public final long i() {
        nv5[] nv5VarArr;
        nv5[] nv5VarArr2;
        long j = -9223372036854775807L;
        for (nv5 nv5Var : this.V) {
            long i = nv5Var.i();
            if (i != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (nv5 nv5Var2 : this.V) {
                        if (nv5Var2 == nv5Var) {
                            break;
                        } else if (nv5Var2.g(i) != i) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = i;
                } else if (i != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && nv5Var.g(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // defpackage.nv5
    public final long k(long j, ao5 ao5Var) {
        nv5[] nv5VarArr = this.V;
        return (nv5VarArr.length > 0 ? nv5VarArr[0] : this.P[0]).k(j, ao5Var);
    }

    @Override // defpackage.nv5
    public final void l() {
        for (nv5 nv5Var : this.P) {
            nv5Var.l();
        }
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final boolean m() {
        return this.W.m();
    }

    @Override // defpackage.nv5
    public final void o(mv5 mv5Var, long j) {
        this.T = mv5Var;
        Collections.addAll(this.R, this.P);
        for (nv5 nv5Var : this.P) {
            nv5Var.o(this, j);
        }
    }

    @Override // defpackage.nv5
    public final long p(qy5[] qy5VarArr, boolean[] zArr, ww5[] ww5VarArr, boolean[] zArr2, long j) {
        int length;
        qy5 qy5Var;
        int length2 = qy5VarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = qy5VarArr.length;
            qy5Var = null;
            if (i >= length) {
                break;
            }
            ww5 ww5Var = ww5VarArr[i];
            Integer num = ww5Var != null ? (Integer) this.Q.get(ww5Var) : null;
            iArr[i] = num == null ? -1 : num.intValue();
            qy5 qy5Var2 = qy5VarArr[i];
            if (qy5Var2 != null) {
                String str = qy5Var2.b().a;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        this.Q.clear();
        ww5[] ww5VarArr2 = new ww5[length];
        ww5[] ww5VarArr3 = new ww5[length];
        qy5[] qy5VarArr2 = new qy5[length];
        ArrayList arrayList = new ArrayList(this.P.length);
        long j2 = j;
        int i2 = 0;
        while (i2 < this.P.length) {
            for (int i3 = 0; i3 < qy5VarArr.length; i3++) {
                ww5VarArr3[i3] = iArr[i3] == i2 ? ww5VarArr[i3] : qy5Var;
                if (iArr2[i3] == i2) {
                    qy5 qy5Var3 = qy5VarArr[i3];
                    qy5Var3.getClass();
                    qe3 qe3Var = (qe3) this.S.get(qy5Var3.b());
                    qe3Var.getClass();
                    qy5VarArr2[i3] = new uv5(qy5Var3, qe3Var);
                } else {
                    qy5VarArr2[i3] = qy5Var;
                }
            }
            int i4 = i2;
            ArrayList arrayList2 = arrayList;
            ww5[] ww5VarArr4 = ww5VarArr3;
            qy5[] qy5VarArr3 = qy5VarArr2;
            long p = this.P[i2].p(qy5VarArr2, zArr, ww5VarArr3, zArr2, j2);
            if (i4 == 0) {
                j2 = p;
            } else if (p != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < qy5VarArr.length; i5++) {
                if (iArr2[i5] == i4) {
                    ww5 ww5Var2 = ww5VarArr4[i5];
                    ww5Var2.getClass();
                    ww5VarArr2[i5] = ww5Var2;
                    this.Q.put(ww5Var2, Integer.valueOf(i4));
                    z = true;
                } else if (iArr[i5] == i4) {
                    tv2.I(ww5VarArr4[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(this.P[i4]);
            }
            i2 = i4 + 1;
            arrayList = arrayList2;
            ww5VarArr3 = ww5VarArr4;
            qy5VarArr2 = qy5VarArr3;
            qy5Var = null;
        }
        System.arraycopy(ww5VarArr2, 0, ww5VarArr, 0, length);
        nv5[] nv5VarArr = (nv5[]) arrayList.toArray(new nv5[0]);
        this.V = nv5VarArr;
        this.W = new d22(7, nv5VarArr);
        return j2;
    }
}