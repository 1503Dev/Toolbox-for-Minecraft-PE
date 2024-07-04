package defpackage;

import defpackage.wn;

/* renamed from: eh  reason: default package */
public final class eh extends wn.b {
    public eh(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public eh(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        super(hnVar, jnVar, jnVar2, jnVarArr);
        this.e = z;
    }

    @Override // defpackage.wn
    public final wn a(wn wnVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        hn hnVar;
        int[] iArr6;
        char c;
        if (j()) {
            return wnVar;
        }
        if (wnVar.j()) {
            return this;
        }
        if (this == wnVar) {
            return w();
        }
        hn hnVar2 = this.a;
        dh dhVar = (dh) this.b;
        dh dhVar2 = (dh) this.c;
        dh dhVar3 = (dh) this.d[0];
        dh dhVar4 = (dh) wnVar.b;
        dh dhVar5 = (dh) wnVar.h();
        dh dhVar6 = (dh) wnVar.i();
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[8];
        int[] iArr9 = new int[8];
        int[] iArr10 = new int[8];
        boolean h = dhVar3.h();
        if (h) {
            iArr = dhVar4.g;
            iArr2 = dhVar5.g;
        } else {
            vx.p(dhVar3.g, iArr9);
            vx.k(iArr9, dhVar4.g, iArr8);
            vx.k(iArr9, dhVar3.g, iArr9);
            vx.k(iArr9, dhVar5.g, iArr9);
            iArr = iArr8;
            iArr2 = iArr9;
        }
        boolean h2 = dhVar6.h();
        if (h2) {
            iArr3 = dhVar.g;
            iArr4 = dhVar2.g;
        } else {
            vx.p(dhVar6.g, iArr10);
            vx.k(iArr10, dhVar.g, iArr7);
            vx.k(iArr10, dhVar6.g, iArr10);
            vx.k(iArr10, dhVar2.g, iArr10);
            iArr3 = iArr7;
            iArr4 = iArr10;
        }
        int[] iArr11 = new int[8];
        vx.t(iArr3, iArr, iArr11);
        vx.t(iArr4, iArr2, iArr8);
        if (z61.r0(iArr11)) {
            if (z61.r0(iArr8)) {
                return w();
            }
            return hnVar2.k();
        }
        int[] iArr12 = new int[8];
        vx.p(iArr11, iArr12);
        int[] iArr13 = new int[8];
        vx.k(iArr12, iArr11, iArr13);
        vx.k(iArr12, iArr3, iArr9);
        if (z61.r0(iArr13)) {
            z61.C1(iArr13);
        } else {
            z61.o1(vx.c, iArr13, iArr13);
        }
        z61.D0(iArr4, iArr13, iArr7);
        vx.o(iArr13, z61.l(iArr9, iArr9, iArr13));
        dh dhVar7 = new dh(iArr10);
        vx.p(iArr8, iArr10);
        int[] iArr14 = dhVar7.g;
        vx.t(iArr14, iArr13, iArr14);
        dh dhVar8 = new dh(iArr13);
        vx.t(iArr9, dhVar7.g, iArr13);
        z61.I0(dhVar8.g, iArr8, iArr7);
        if (z61.T(16, iArr7, vx.d)) {
            iArr6 = iArr11;
            long j = (iArr7[0] & 4294967295L) - (iArr5[0] & 4294967295L);
            iArr7[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                c = '\b';
                j2 = z61.z(8, 1, iArr7);
            } else {
                c = '\b';
            }
            long j3 = (iArr7[c] & 4294967295L) + 19 + j2;
            iArr7[c] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                j4 = z61.b0(15, 9, iArr7);
            }
            hnVar = hnVar2;
            iArr7[15] = (int) (((iArr7[15] & 4294967295L) - (4294967295L & (iArr5[15] + 1))) + j4);
        } else {
            hnVar = hnVar2;
            iArr6 = iArr11;
        }
        vx.m(iArr7, dhVar8.g);
        int[] iArr15 = iArr6;
        dh dhVar9 = new dh(iArr15);
        if (!h) {
            vx.k(iArr15, dhVar3.g, iArr15);
        }
        if (!h2) {
            int[] iArr16 = dhVar9.g;
            vx.k(iArr16, dhVar6.g, iArr16);
        }
        return new eh(hnVar, dhVar7, dhVar8, new jn[]{dhVar9, y(dhVar9, (h && h2) ? null : null)}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new eh(null, this.b, e(), false);
    }

    @Override // defpackage.wn
    public final jn i() {
        return super.i();
    }

    @Override // defpackage.wn
    public final wn m() {
        if (j()) {
            return this;
        }
        return new eh(this.a, this.b, this.c.m(), this.d, this.e);
    }

    @Override // defpackage.wn
    public final wn u() {
        return (j() || this.c.i()) ? this : z(false).a(this);
    }

    @Override // defpackage.wn
    public final wn w() {
        if (j()) {
            return this;
        }
        hn hnVar = this.a;
        if (this.c.i()) {
            return hnVar.k();
        }
        return z(true);
    }

    @Override // defpackage.wn
    public final wn x(wn wnVar) {
        return this == wnVar ? u() : j() ? wnVar : wnVar.j() ? w() : this.c.i() ? wnVar : z(false).a(wnVar);
    }

    public final dh y(dh dhVar, int[] iArr) {
        dh dhVar2 = (dh) this.a.b;
        if (dhVar.h()) {
            return dhVar2;
        }
        dh dhVar3 = new dh();
        if (iArr == null) {
            iArr = dhVar3.g;
            vx.p(dhVar.g, iArr);
        }
        vx.p(iArr, dhVar3.g);
        int[] iArr2 = dhVar3.g;
        vx.k(iArr2, dhVar2.g, iArr2);
        return dhVar3;
    }

    public final eh z(boolean z) {
        dh dhVar;
        dh dhVar2 = (dh) this.b;
        dh dhVar3 = (dh) this.c;
        jn[] jnVarArr = this.d;
        jn jnVar = jnVarArr[0];
        dh dhVar4 = (dh) jnVar;
        dh dhVar5 = (dh) jnVarArr[1];
        if (dhVar5 == null) {
            dhVar5 = y((dh) jnVar, null);
            jnVarArr[1] = dhVar5;
        }
        vx.p(dhVar2.g, r5);
        int l = z61.l(r5, r5, r5);
        int[] iArr = dhVar5.g;
        dh dhVar6 = dhVar5;
        long j = (iArr[0] & 4294967295L) + (r5[0] & 4294967295L) + 0;
        long j2 = (iArr[1] & 4294967295L) + (r5[1] & 4294967295L) + (j >>> 32);
        long j3 = (iArr[2] & 4294967295L) + (r5[2] & 4294967295L) + (j2 >>> 32);
        long j4 = (iArr[3] & 4294967295L) + (r5[3] & 4294967295L) + (j3 >>> 32);
        long j5 = (iArr[4] & 4294967295L) + (r5[4] & 4294967295L) + (j4 >>> 32);
        long j6 = (iArr[5] & 4294967295L) + (r5[5] & 4294967295L) + (j5 >>> 32);
        long j7 = (iArr[6] & 4294967295L) + (r5[6] & 4294967295L) + (j6 >>> 32);
        long j8 = (iArr[7] & 4294967295L) + (r5[7] & 4294967295L) + (j7 >>> 32);
        int[] iArr2 = {(int) j, (int) j2, (int) j3, (int) j4, (int) j5, (int) j6, (int) j7, (int) j8};
        vx.o(iArr2, l + ((int) (j8 >>> 32)));
        int[] iArr3 = new int[8];
        vx.u(dhVar3.g, iArr3);
        int[] iArr4 = new int[8];
        vx.k(iArr3, dhVar3.g, iArr4);
        int[] iArr5 = new int[8];
        vx.k(iArr4, dhVar2.g, iArr5);
        vx.u(iArr5, iArr5);
        int[] iArr6 = new int[8];
        vx.p(iArr4, iArr6);
        vx.u(iArr6, iArr6);
        dh dhVar7 = new dh(iArr4);
        vx.p(iArr2, iArr4);
        int[] iArr7 = dhVar7.g;
        vx.t(iArr7, iArr5, iArr7);
        int[] iArr8 = dhVar7.g;
        vx.t(iArr8, iArr5, iArr8);
        dh dhVar8 = new dh(iArr5);
        vx.t(iArr5, dhVar7.g, iArr5);
        int[] iArr9 = dhVar8.g;
        vx.k(iArr9, iArr2, iArr9);
        int[] iArr10 = dhVar8.g;
        vx.t(iArr10, iArr6, iArr10);
        dh dhVar9 = new dh(iArr3);
        if (!z61.k0(dhVar4.g)) {
            int[] iArr11 = dhVar9.g;
            vx.k(iArr11, dhVar4.g, iArr11);
        }
        if (z) {
            dhVar = new dh(iArr6);
            vx.k(iArr6, dhVar6.g, iArr6);
            int[] iArr12 = dhVar.g;
            vx.u(iArr12, iArr12);
        } else {
            dhVar = null;
        }
        return new eh(this.a, dhVar7, dhVar8, new jn[]{dhVar9, dhVar}, this.e);
    }
}