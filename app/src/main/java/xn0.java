package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: xn0  reason: default package */
public final class xn0 extends hn.b {
    public static final BigInteger j = new BigInteger(1, qu.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));
    public zn0 i;

    public xn0() {
        super(j);
        this.i = new zn0(this, null, null, false);
        this.b = new yn0(new BigInteger(1, qu.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.c = new yn0(new BigInteger(1, qu.a("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.d = new BigInteger(1, qu.a("0100000000000000000000351EE786A818F3A1A16B"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new xn0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new zn0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new zn0(this, jnVar, jnVar2, jnVarArr, z);
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