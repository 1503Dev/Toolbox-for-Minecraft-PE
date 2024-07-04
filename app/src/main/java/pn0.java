package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: pn0  reason: default package */
public final class pn0 extends hn.b {
    public static final BigInteger j = new BigInteger(1, qu.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));
    public rn0 i;

    public pn0() {
        super(j);
        this.i = new rn0(this, null, null, false);
        this.b = new qn0(new BigInteger(1, qu.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = new qn0(new BigInteger(1, qu.a("E87579C11079F43DD824993C2CEE5ED3")));
        this.d = new BigInteger(1, qu.a("FFFFFFFE0000000075A30D1B9038A115"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new pn0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new rn0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new rn0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new qn0(bigInteger);
    }

    @Override // defpackage.hn
    public final int j() {
        return j.bitLength();
    }

    @Override // defpackage.hn
    public final wn k() {
        return this.i;
    }

    @Override // defpackage.hn
    public final boolean q(int i) {
        return i == 2;
    }
}