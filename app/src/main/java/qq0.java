package defpackage;

import defpackage.wn;

/* renamed from: qq0  reason: default package */
public final class qq0 extends wn.a {
    public qq0(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public qq0(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        super(hnVar, jnVar, jnVar2, jnVarArr);
        this.e = z;
    }

    @Override // defpackage.wn
    public final wn a(wn wnVar) {
        long[] p;
        long[] jArr;
        long[] jArr2;
        long[] p2;
        long[] jArr3;
        mq0 mq0Var;
        mq0 mq0Var2;
        mq0 mq0Var3;
        if (j()) {
            return wnVar;
        }
        if (wnVar.j()) {
            return this;
        }
        hn hnVar = this.a;
        mq0 mq0Var4 = (mq0) this.b;
        mq0 mq0Var5 = (mq0) wnVar.b;
        if (mq0Var4.i()) {
            if (mq0Var5.i()) {
                return hnVar.k();
            }
            return wnVar.a(this);
        }
        mq0 mq0Var6 = (mq0) this.c;
        mq0 mq0Var7 = (mq0) this.d[0];
        mq0 mq0Var8 = (mq0) wnVar.c;
        mq0 mq0Var9 = (mq0) wnVar.i();
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        long[] jArr6 = new long[9];
        long[] jArr7 = new long[9];
        if (mq0Var7.h()) {
            p = null;
        } else {
            p = mh.p(mq0Var7.g);
        }
        if (p == null) {
            jArr2 = mq0Var5.g;
            jArr = mq0Var8.g;
        } else {
            mh.o(mq0Var5.g, p, jArr5);
            mh.o(mq0Var8.g, p, jArr7);
            jArr = jArr7;
            jArr2 = jArr5;
        }
        if (mq0Var9.h()) {
            p2 = null;
        } else {
            p2 = mh.p(mq0Var9.g);
        }
        long[] jArr8 = mq0Var4.g;
        if (p2 == null) {
            jArr3 = mq0Var6.g;
        } else {
            mh.o(jArr8, p2, jArr4);
            mh.o(mq0Var6.g, p2, jArr6);
            jArr8 = jArr4;
            jArr3 = jArr6;
        }
        mh.a(jArr3, jArr, jArr6);
        mh.a(jArr8, jArr2, jArr7);
        if (z61.u0(jArr7)) {
            if (z61.u0(jArr6)) {
                return w();
            }
            return hnVar.k();
        }
        if (mq0Var5.i()) {
            wn n = n();
            mq0 mq0Var10 = (mq0) n.b;
            jn h = n.h();
            jn d = h.a(mq0Var8).d(mq0Var10);
            mq0Var2 = (mq0) d.o().a(d).a(mq0Var10).b();
            if (mq0Var2.i()) {
                return new qq0(hnVar, mq0Var2, pq0.l, this.e);
            }
            mq0Var3 = (mq0) hnVar.i(gn.b);
            mq0Var = (mq0) d.j(mq0Var10.a(mq0Var2)).a(mq0Var2).a(h).d(mq0Var2).a(mq0Var2);
        } else {
            mh.u(jArr7, jArr7);
            long[] p3 = mh.p(jArr6);
            mh.o(jArr8, p3, jArr4);
            mh.o(jArr2, p3, jArr5);
            mq0 mq0Var11 = new mq0(jArr4);
            mh.l(jArr4, jArr5, jArr4);
            if (mq0Var11.i()) {
                return new qq0(hnVar, mq0Var11, pq0.l, this.e);
            }
            mq0 mq0Var12 = new mq0(jArr6);
            mh.o(jArr7, p3, jArr6);
            if (p2 != null) {
                long[] jArr9 = mq0Var12.g;
                mh.o(jArr9, p2, jArr9);
            }
            long[] jArr10 = new long[18];
            mh.a(jArr5, jArr7, jArr7);
            long[] jArr11 = new long[18];
            mh.j(jArr7, jArr11);
            for (int i = 0; i < 18; i++) {
                jArr10[i] = jArr10[i] ^ jArr11[i];
            }
            mh.a(mq0Var6.g, mq0Var7.g, jArr7);
            mh.n(jArr7, mq0Var12.g, jArr10);
            mq0 mq0Var13 = new mq0(jArr7);
            mh.q(jArr10, jArr7);
            if (p != null) {
                long[] jArr12 = mq0Var12.g;
                mh.o(jArr12, p, jArr12);
            }
            mq0Var = mq0Var13;
            mq0Var2 = mq0Var11;
            mq0Var3 = mq0Var12;
        }
        return new qq0(hnVar, mq0Var2, mq0Var, new jn[]{mq0Var3}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new qq0(null, this.b, e(), false);
    }

    @Override // defpackage.wn
    public final jn h() {
        jn jnVar = this.b;
        jn jnVar2 = this.c;
        if (j() || jnVar.i()) {
            return jnVar2;
        }
        jn j = jnVar2.a(jnVar).j(jnVar);
        jn jnVar3 = this.d[0];
        return !jnVar3.h() ? j.d(jnVar3) : j;
    }

    @Override // defpackage.wn
    public final wn m() {
        if (j()) {
            return this;
        }
        jn jnVar = this.b;
        if (jnVar.i()) {
            return this;
        }
        jn jnVar2 = this.c;
        jn jnVar3 = this.d[0];
        return new qq0(this.a, jnVar, jnVar2.a(jnVar3), new jn[]{jnVar3}, this.e);
    }

    @Override // defpackage.wn
    public final wn w() {
        long[] p;
        long[] jArr;
        if (j()) {
            return this;
        }
        hn hnVar = this.a;
        mq0 mq0Var = (mq0) this.b;
        if (mq0Var.i()) {
            return hnVar.k();
        }
        mq0 mq0Var2 = (mq0) this.c;
        mq0 mq0Var3 = (mq0) this.d[0];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        if (mq0Var3.h()) {
            p = null;
        } else {
            p = mh.p(mq0Var3.g);
        }
        long[] jArr4 = mq0Var2.g;
        if (p == null) {
            jArr = mq0Var3.g;
        } else {
            mh.o(jArr4, p, jArr2);
            mh.u(mq0Var3.g, jArr3);
            jArr4 = jArr2;
            jArr = jArr3;
        }
        long[] jArr5 = new long[9];
        mh.u(mq0Var2.g, jArr5);
        mh.b(jArr4, jArr, jArr5);
        if (z61.u0(jArr5)) {
            return new qq0(hnVar, new mq0(jArr5), pq0.l, this.e);
        }
        long[] jArr6 = new long[18];
        mh.n(jArr5, jArr4, jArr6);
        mq0 mq0Var4 = new mq0(jArr2);
        mh.u(jArr5, jArr2);
        mq0 mq0Var5 = new mq0(jArr5);
        if (p != null) {
            mh.l(jArr5, jArr, jArr5);
        }
        long[] jArr7 = mq0Var.g;
        if (p != null) {
            mh.o(jArr7, p, jArr3);
            jArr7 = jArr3;
        }
        long[] jArr8 = new long[18];
        mh.j(jArr7, jArr8);
        for (int i = 0; i < 18; i++) {
            jArr6[i] = jArr6[i] ^ jArr8[i];
        }
        mh.q(jArr6, jArr3);
        mh.b(mq0Var4.g, mq0Var5.g, jArr3);
        return new qq0(hnVar, mq0Var4, new mq0(jArr3), new jn[]{mq0Var5}, this.e);
    }

    @Override // defpackage.wn
    public final wn x(wn wnVar) {
        if (j()) {
            return wnVar;
        }
        if (wnVar.j()) {
            return w();
        }
        hn hnVar = this.a;
        mq0 mq0Var = (mq0) this.b;
        if (mq0Var.i()) {
            return wnVar;
        }
        mq0 mq0Var2 = (mq0) wnVar.b;
        mq0 mq0Var3 = (mq0) wnVar.i();
        if (!mq0Var2.i() && mq0Var3.h()) {
            mq0 mq0Var4 = (mq0) this.c;
            mq0 mq0Var5 = (mq0) this.d[0];
            mq0 mq0Var6 = (mq0) wnVar.c;
            long[] jArr = new long[9];
            long[] jArr2 = new long[9];
            long[] jArr3 = new long[9];
            long[] jArr4 = new long[9];
            mh.u(mq0Var.g, jArr);
            mh.u(mq0Var4.g, jArr2);
            mh.u(mq0Var5.g, jArr3);
            mh.l(mq0Var4.g, mq0Var5.g, jArr4);
            mh.b(jArr3, jArr2, jArr4);
            long[] p = mh.p(jArr3);
            mh.o(mq0Var6.g, p, jArr3);
            mh.a(jArr3, jArr2, jArr3);
            long[] jArr5 = new long[18];
            mh.n(jArr3, jArr4, jArr5);
            long[] jArr6 = new long[18];
            mh.h(jArr, p, jArr6);
            for (int i = 0; i < 18; i++) {
                jArr5[i] = jArr5[i] ^ jArr6[i];
            }
            mh.q(jArr5, jArr3);
            mh.o(mq0Var2.g, p, jArr);
            mh.a(jArr, jArr4, jArr2);
            mh.u(jArr2, jArr2);
            if (z61.u0(jArr2)) {
                if (z61.u0(jArr3)) {
                    return wnVar.w();
                }
                return hnVar.k();
            } else if (z61.u0(jArr3)) {
                return new qq0(hnVar, new mq0(jArr3), pq0.l, this.e);
            } else {
                mq0 mq0Var7 = new mq0();
                mh.u(jArr3, mq0Var7.g);
                long[] jArr7 = mq0Var7.g;
                mh.l(jArr7, jArr, jArr7);
                mq0 mq0Var8 = new mq0(jArr);
                mh.l(jArr3, jArr2, jArr);
                long[] jArr8 = mq0Var8.g;
                mh.o(jArr8, p, jArr8);
                mq0 mq0Var9 = new mq0(jArr2);
                mh.a(jArr3, jArr2, jArr2);
                long[] jArr9 = mq0Var9.g;
                mh.u(jArr9, jArr9);
                for (int i2 = 0; i2 < 18; i2++) {
                    jArr5[i2] = 0;
                }
                mh.n(mq0Var9.g, jArr4, jArr5);
                long[] jArr10 = mq0Var6.g;
                jArr4[0] = jArr10[0] ^ 1;
                for (int i3 = 1; i3 < 9; i3++) {
                    jArr4[i3] = jArr10[i3];
                }
                mh.n(jArr4, mq0Var8.g, jArr5);
                mh.q(jArr5, mq0Var9.g);
                return new qq0(hnVar, mq0Var7, mq0Var9, new jn[]{mq0Var8}, this.e);
            }
        }
        return w().a(wnVar);
    }
}