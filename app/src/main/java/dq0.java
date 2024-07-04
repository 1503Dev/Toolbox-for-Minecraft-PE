package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: dq0  reason: default package */
public final class dq0 extends hn.a {
    public eq0 j;

    public dq0() {
        super(283, 5, 7, 12);
        this.j = new eq0(this, null, null, false);
        this.b = new cq0(BigInteger.valueOf(0L));
        this.c = new cq0(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, qu.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new dq0();
    }

    @Override // defpackage.hn
    public final z61 b() {
        return new x51();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new eq0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new eq0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new cq0(bigInteger);
    }

    @Override // defpackage.hn
    public final int j() {
        return 283;
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
        return true;
    }
}