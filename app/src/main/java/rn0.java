package defpackage;

import defpackage.wn;

/* renamed from: rn0  reason: default package */
public final class rn0 extends wn.b {
    public rn0(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public rn0(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        super(hnVar, jnVar, jnVar2, jnVarArr);
        this.e = z;
    }

    @Override // defpackage.wn
    public final wn a(wn wnVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int i;
        int i2;
        int i3;
        int i4;
        if (j()) {
            return wnVar;
        }
        if (wnVar.j()) {
            return this;
        }
        if (this == wnVar) {
            return w();
        }
        hn hnVar = this.a;
        qn0 qn0Var = (qn0) this.b;
        qn0 qn0Var2 = (qn0) this.c;
        qn0 qn0Var3 = (qn0) wnVar.b;
        qn0 qn0Var4 = (qn0) wnVar.h();
        qn0 qn0Var5 = (qn0) this.d[0];
        qn0 qn0Var6 = (qn0) wnVar.i();
        int[] iArr5 = new int[8];
        int[] iArr6 = new int[4];
        int[] iArr7 = new int[4];
        int[] iArr8 = new int[4];
        boolean h = qn0Var5.h();
        if (h) {
            iArr = qn0Var3.g;
            iArr2 = qn0Var4.g;
        } else {
            gw.o(qn0Var5.g, iArr7);
            gw.l(iArr7, qn0Var3.g, iArr6);
            gw.l(iArr7, qn0Var5.g, iArr7);
            gw.l(iArr7, qn0Var4.g, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean h2 = qn0Var6.h();
        if (h2) {
            iArr3 = qn0Var.g;
            iArr4 = qn0Var2.g;
        } else {
            gw.o(qn0Var6.g, iArr8);
            gw.l(iArr8, qn0Var.g, iArr5);
            gw.l(iArr8, qn0Var6.g, iArr8);
            gw.l(iArr8, qn0Var2.g, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[4];
        gw.q(iArr3, iArr, iArr9);
        gw.q(iArr4, iArr2, iArr6);
        if (z61.m0(iArr9)) {
            if (z61.m0(iArr6)) {
                return w();
            }
            return hnVar.k();
        }
        gw.o(iArr9, iArr7);
        int[] iArr10 = new int[4];
        gw.l(iArr7, iArr9, iArr10);
        gw.l(iArr7, iArr3, iArr7);
        if (z61.m0(iArr10)) {
            iArr10[0] = 0;
            iArr10[1] = 0;
            iArr10[2] = 0;
            iArr10[3] = 0;
        } else {
            z61.i1(gw.S, iArr10, iArr10);
        }
        z61.z0(iArr4, iArr10, iArr5);
        gw.n(iArr10, z61.h(iArr7, iArr7, iArr10));
        qn0 qn0Var7 = new qn0(iArr8);
        gw.o(iArr6, iArr8);
        int[] iArr11 = qn0Var7.g;
        gw.q(iArr11, iArr10, iArr11);
        qn0 qn0Var8 = new qn0(iArr10);
        gw.q(iArr7, qn0Var7.g, iArr10);
        int[] iArr12 = qn0Var8.g;
        long j = iArr6[0] & 4294967295L;
        long j2 = iArr6[1] & 4294967295L;
        long j3 = iArr6[2] & 4294967295L;
        long j4 = iArr6[3] & 4294967295L;
        long j5 = 0;
        int i5 = 0;
        for (int i6 = 4; i5 < i6; i6 = 4) {
            qn0 qn0Var9 = qn0Var8;
            long j6 = iArr12[i5] & 4294967295L;
            int[] iArr13 = iArr12;
            long j7 = j;
            long j8 = (j6 * j) + (iArr5[i] & 4294967295L) + 0;
            iArr5[i5 + 0] = (int) j8;
            int i7 = i5 + 1;
            long j9 = j2;
            long j10 = (j6 * j2) + (iArr5[i7] & 4294967295L) + (j8 >>> 32);
            iArr5[i7] = (int) j10;
            long j11 = (j6 * j3) + (iArr5[i2] & 4294967295L) + (j10 >>> 32);
            iArr5[i5 + 2] = (int) j11;
            long j12 = (j6 * j4) + (iArr5[i3] & 4294967295L) + (j11 >>> 32);
            iArr5[i5 + 3] = (int) j12;
            long j13 = j5 + (iArr5[i4] & 4294967295L) + (j12 >>> 32);
            iArr5[i5 + 4] = (int) j13;
            j5 = j13 >>> 32;
            i5 = i7;
            h = h;
            qn0Var8 = qn0Var9;
            iArr12 = iArr13;
            j = j7;
            j2 = j9;
            j3 = j3;
        }
        qn0 qn0Var10 = qn0Var8;
        boolean z = h;
        if (((int) j5) != 0 || ((iArr5[7] >>> 1) >= 2147483646 && z61.Y(iArr5, gw.T))) {
            z61.n(8, gw.U, iArr5);
        }
        gw.m(iArr5, qn0Var10.g);
        qn0 qn0Var11 = new qn0(iArr9);
        if (!z) {
            gw.l(iArr9, qn0Var5.g, iArr9);
        }
        if (!h2) {
            int[] iArr14 = qn0Var11.g;
            gw.l(iArr14, qn0Var6.g, iArr14);
        }
        return new rn0(hnVar, qn0Var7, qn0Var10, new jn[]{qn0Var11}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new rn0(null, this.b, e(), false);
    }

    @Override // defpackage.wn
    public final wn m() {
        return j() ? this : new rn0(this.a, this.b, this.c.m(), this.d, this.e);
    }

    @Override // defpackage.wn
    public final wn u() {
        return (j() || this.c.i()) ? this : w().a(this);
    }

    @Override // defpackage.wn
    public final wn w() {
        if (j()) {
            return this;
        }
        hn hnVar = this.a;
        qn0 qn0Var = (qn0) this.c;
        if (qn0Var.i()) {
            return hnVar.k();
        }
        qn0 qn0Var2 = (qn0) this.b;
        qn0 qn0Var3 = (qn0) this.d[0];
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        gw.o(qn0Var.g, iArr3);
        int[] iArr4 = new int[4];
        gw.o(iArr3, iArr4);
        boolean h = qn0Var3.h();
        int[] iArr5 = qn0Var3.g;
        if (!h) {
            gw.o(iArr5, iArr2);
            iArr5 = iArr2;
        }
        gw.q(qn0Var2.g, iArr5, iArr);
        gw.e(qn0Var2.g, iArr5, iArr2);
        gw.l(iArr2, iArr, iArr2);
        gw.n(iArr2, z61.h(iArr2, iArr2, iArr2));
        gw.l(iArr3, qn0Var2.g, iArr3);
        gw.n(iArr3, z61.Z0(4, iArr3));
        gw.n(iArr, z61.a1(4, iArr4, iArr));
        qn0 qn0Var4 = new qn0(iArr4);
        gw.o(iArr2, iArr4);
        int[] iArr6 = qn0Var4.g;
        gw.q(iArr6, iArr3, iArr6);
        int[] iArr7 = qn0Var4.g;
        gw.q(iArr7, iArr3, iArr7);
        qn0 qn0Var5 = new qn0(iArr3);
        gw.q(iArr3, qn0Var4.g, iArr3);
        int[] iArr8 = qn0Var5.g;
        gw.l(iArr8, iArr2, iArr8);
        int[] iArr9 = qn0Var5.g;
        gw.q(iArr9, iArr, iArr9);
        qn0 qn0Var6 = new qn0(iArr2);
        if (z61.Y0(4, 0, qn0Var.g, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && z61.U(iArr2, gw.S))) {
            gw.g(iArr2);
        }
        if (!h) {
            int[] iArr10 = qn0Var6.g;
            gw.l(iArr10, qn0Var3.g, iArr10);
        }
        return new rn0(hnVar, qn0Var4, qn0Var5, new jn[]{qn0Var6}, this.e);
    }

    @Override // defpackage.wn
    public final wn x(wn wnVar) {
        return this == wnVar ? u() : j() ? wnVar : wnVar.j() ? w() : this.c.i() ? wnVar : w().a(wnVar);
    }
}