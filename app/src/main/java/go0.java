package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: go0  reason: default package */
public final class go0 extends hn.b {
    public static final BigInteger j = new BigInteger(1, qu.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));
    public io0 i;

    public go0() {
        super(j);
        this.i = new io0(this, null, null, false);
        this.b = new ho0(gn.a);
        this.c = new ho0(BigInteger.valueOf(5L));
        this.d = new BigInteger(1, qu.a("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new go0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new io0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new io0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new ho0(bigInteger);
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