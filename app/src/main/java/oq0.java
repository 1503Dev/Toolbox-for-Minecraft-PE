package defpackage;

import defpackage.wn;

/* renamed from: oq0  reason: default package */
public final class oq0 extends wn.a {
    public oq0(hn hnVar, jn jnVar, jn jnVar2, boolean z) {
        super(hnVar, jnVar, jnVar2);
        if ((jnVar == null) != (jnVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public oq0(hn hnVar, jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
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
            mq0Var2 = (mq0) d.o().a(d).a(mq0Var10);
            if (mq0Var2.i()) {
                return new oq0(hnVar, mq0Var2, hnVar.c, this.e);
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
                return new oq0(hnVar, mq0Var11, hnVar.c, this.e);
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
        return new oq0(hnVar, mq0Var2, mq0Var, new jn[]{mq0Var3}, this.e);
    }

    @Override // defpackage.wn
    public final wn c() {
        b();
        return new oq0(null, this.b, e(), false);
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
        return new oq0(this.a, jnVar, jnVar2.a(jnVar3), new jn[]{jnVar3}, this.e);
    }

    @Override // defpackage.wn
    public final wn w() {
        jn o;
        jn j;
        jn j2;
        if (j()) {
            return this;
        }
        hn hnVar = this.a;
        jn jnVar = this.b;
        if (jnVar.i()) {
            return hnVar.k();
        }
        jn jnVar2 = this.c;
        jn jnVar3 = this.d[0];
        boolean h = jnVar3.h();
        if (h) {
            o = jnVar3;
        } else {
            o = jnVar3.o();
        }
        if (h) {
            j = jnVar2.o().a(jnVar2);
        } else {
            j = jnVar2.a(jnVar3).j(jnVar2);
        }
        if (j.i()) {
            return new oq0(hnVar, j, hnVar.c, this.e);
        }
        jn o2 = j.o();
        if (h) {
            j2 = j;
        } else {
            j2 = j.j(o);
        }
        jn o3 = jnVar2.a(jnVar).o();
        if (!h) {
            jnVar3 = o.o();
        }
        return new oq0(hnVar, o2, o3.a(j).a(o).j(o3).a(jnVar3).a(o2).a(j2), new jn[]{j2}, this.e);
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
        jn jnVar = this.b;
        if (jnVar.i()) {
            return wnVar;
        }
        jn jnVar2 = wnVar.b;
        jn i = wnVar.i();
        if (!jnVar2.i() && i.h()) {
            jn jnVar3 = this.c;
            jn jnVar4 = this.d[0];
            jn jnVar5 = wnVar.c;
            jn o = jnVar.o();
            jn o2 = jnVar3.o();
            jn o3 = jnVar4.o();
            jn a = o2.a(jnVar3.j(jnVar4));
            jn b = jnVar5.b();
            jn l = b.j(o3).a(o2).l(a, o, o3);
            jn j = jnVar2.j(o3);
            jn o4 = j.a(a).o();
            if (o4.i()) {
                if (l.i()) {
                    return wnVar.w();
                }
                return hnVar.k();
            } else if (l.i()) {
                return new oq0(hnVar, l, hnVar.c, this.e);
            } else {
                jn j2 = l.o().j(j);
                jn j3 = l.j(o4).j(o3);
                return new oq0(hnVar, j2, l.a(o4).o().l(a, b, j3), new jn[]{j3}, this.e);
            }
        }
        return w().a(wnVar);
    }
}