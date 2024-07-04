package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: zo0  reason: default package */
public final class zo0 extends hn.a {
    public ap0 j;

    public zo0() {
        super(113, 9, 0, 0);
        this.j = new ap0(this, null, null, false);
        this.b = new yo0(new BigInteger(1, qu.a("003088250CA6E7C7FE649CE85820F7")));
        this.c = new yo0(new BigInteger(1, qu.a("00E8BEE4D3E2260744188BE0E9C723")));
        this.d = new BigInteger(1, qu.a("0100000000000000D9CCEC8A39E56F"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new zo0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new ap0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new ap0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new yo0(bigInteger);
    }

    @Override // defpackage.hn
    public final int j() {
        return 113;
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