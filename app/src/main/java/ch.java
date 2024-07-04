package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: ch  reason: default package */
public final class ch extends hn.b {
    public static final BigInteger j = z61.z1(vx.c);
    public eh i;

    public ch() {
        super(j);
        this.i = new eh(this, null, null, false);
        this.b = new dh(new BigInteger(1, qu.a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.c = new dh(new BigInteger(1, qu.a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.d = new BigInteger(1, qu.a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.e = BigInteger.valueOf(8L);
        this.f = 4;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new ch();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new eh(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new eh(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new dh(bigInteger);
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
        return i == 4;
    }
}