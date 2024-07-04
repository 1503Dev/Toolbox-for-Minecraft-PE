package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: pq0  reason: default package */
public final class pq0 extends hn.a {
    public static final mq0 k;
    public static final mq0 l;
    public qq0 j;

    static {
        mq0 mq0Var = new mq0(new BigInteger(1, qu.a("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        k = mq0Var;
        l = (mq0) mq0Var.n();
    }

    public pq0() {
        super(571, 2, 5, 10);
        this.j = new qq0(this, null, null, false);
        this.b = new mq0(BigInteger.valueOf(1L));
        this.c = k;
        this.d = new BigInteger(1, qu.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new pq0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new qq0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new qq0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new mq0(bigInteger);
    }

    @Override // defpackage.hn
    public final int j() {
        return 571;
    }

    @Override // defpackage.hn
    public final wn k() {
        return this.j;
    }

    @Override // defpackage.hn
    public final boolean q(int i) {
        return i == 6;
    }

    @Override // defpackage.hn.a
    public final boolean r() {
        return false;
    }
}