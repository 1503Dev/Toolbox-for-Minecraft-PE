package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: sn0  reason: default package */
public final class sn0 extends hn.b {
    public static final BigInteger j = xn0.j;
    public tn0 i;

    public sn0() {
        super(j);
        this.i = new tn0(this, null, null, false);
        this.b = new yn0(gn.a);
        this.c = new yn0(BigInteger.valueOf(7L));
        this.d = new BigInteger(1, qu.a("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new sn0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new tn0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new tn0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new yn0(bigInteger);
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