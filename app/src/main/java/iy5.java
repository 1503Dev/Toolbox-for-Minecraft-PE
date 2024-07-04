package defpackage;

import java.util.Comparator;

/* renamed from: iy5  reason: default package */
public final class iy5 extends ky5 implements Comparable {
    public final int T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public final int X;
    public final int Y;
    public final int Z;
    public final int a0;

    public iy5(int i, qe3 qe3Var, int i2, dy5 dy5Var, int i3, String str) {
        super(i, qe3Var, i2);
        int i4;
        int i5 = 0;
        this.U = oy5.h(i3, false);
        int i6 = this.S.d;
        dy5Var.getClass();
        this.V = 1 == (i6 & 1);
        this.W = (i6 & 2) != 0;
        nv4 v = dy5Var.g.isEmpty() ? nv4.v("") : dy5Var.g;
        int i7 = 0;
        while (true) {
            if (i7 >= v.size()) {
                i7 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = oy5.f(this.S, (String) v.get(i7), false);
            if (i4 > 0) {
                break;
            }
            i7++;
        }
        this.X = i7;
        this.Y = i4;
        this.S.getClass();
        int bitCount = Integer.bitCount(0);
        this.Z = bitCount;
        this.S.getClass();
        int f = oy5.f(this.S, str, oy5.g(str) == null);
        this.a0 = f;
        boolean z = i4 > 0 || (dy5Var.g.isEmpty() && bitCount > 0) || this.V || (this.W && f > 0);
        if (oy5.h(i3, dy5Var.o) && z) {
            i5 = 1;
        }
        this.T = i5;
    }

    @Override // defpackage.ky5
    public final int b() {
        return this.T;
    }

    @Override // defpackage.ky5
    public final /* bridge */ /* synthetic */ boolean e(ky5 ky5Var) {
        iy5 iy5Var = (iy5) ky5Var;
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public final int compareTo(iy5 iy5Var) {
        cv4 d = cv4.a.d(this.U, iy5Var.U);
        Integer valueOf = Integer.valueOf(this.X);
        Integer valueOf2 = Integer.valueOf(iy5Var.X);
        Comparator comparator = kw4.P;
        comparator.getClass();
        uw4 uw4Var = uw4.P;
        cv4 d2 = d.c(valueOf, valueOf2, uw4Var).b(this.Y, iy5Var.Y).b(this.Z, iy5Var.Z).d(this.V, iy5Var.V);
        Boolean valueOf3 = Boolean.valueOf(this.W);
        Boolean valueOf4 = Boolean.valueOf(iy5Var.W);
        if (this.Y != 0) {
            comparator = uw4Var;
        }
        cv4 b = d2.c(valueOf3, valueOf4, comparator).b(this.a0, iy5Var.a0);
        if (this.Z == 0) {
            b = b.e();
        }
        return b.a();
    }
}