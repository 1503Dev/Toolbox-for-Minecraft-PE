package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: ao0  reason: default package */
public final class ao0 extends hn.b {
    public static final BigInteger j = new BigInteger(1, qu.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));
    public co0 i;

    public ao0() {
        super(j);
        this.i = new co0(this, null, null, false);
        this.b = new bo0(gn.a);
        this.c = new bo0(BigInteger.valueOf(3L));
        this.d = new BigInteger(1, qu.a("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new ao0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new co0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new co0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new bo0(bigInteger);
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