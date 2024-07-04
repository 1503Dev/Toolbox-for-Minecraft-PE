package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: un0  reason: default package */
public final class un0 extends hn.b {
    public static final BigInteger j = new BigInteger(1, qu.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));
    public wn0 i;

    public un0() {
        super(j);
        this.i = new wn0(this, null, null, false);
        this.b = new vn0(new BigInteger(1, qu.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.c = new vn0(new BigInteger(1, qu.a("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.d = new BigInteger(1, qu.a("0100000000000000000001F4C8F927AED3CA752257"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new un0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new wn0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new wn0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new vn0(bigInteger);
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