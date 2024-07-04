package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: lp0  reason: default package */
public final class lp0 extends hn.a {
    public mp0 j;

    public lp0() {
        super(163, 3, 6, 7);
        this.j = new mp0(this, null, null, false);
        this.b = new ip0(new BigInteger(1, qu.a("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.c = new ip0(new BigInteger(1, qu.a("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.d = new BigInteger(1, qu.a("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new lp0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new mp0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new mp0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new ip0(bigInteger);
    }

    @Override // defpackage.hn
    public final int j() {
        return 163;
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