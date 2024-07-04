package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: do0  reason: default package */
public final class do0 extends hn.b {
    public static final BigInteger j = new BigInteger(1, qu.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));
    public fo0 i;

    public do0() {
        super(j);
        this.i = new fo0(this, null, null, false);
        this.b = new eo0(new BigInteger(1, qu.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.c = new eo0(new BigInteger(1, qu.a("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.d = new BigInteger(1, qu.a("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new do0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new fo0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new fo0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new eo0(bigInteger);
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