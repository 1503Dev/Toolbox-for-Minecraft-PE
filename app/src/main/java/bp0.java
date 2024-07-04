package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: bp0  reason: default package */
public final class bp0 extends hn.a {
    public cp0 j;

    public bp0() {
        super(113, 9, 0, 0);
        this.j = new cp0(this, null, null, false);
        this.b = new yo0(new BigInteger(1, qu.a("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.c = new yo0(new BigInteger(1, qu.a("0095E9A9EC9B297BD4BF36E059184F")));
        this.d = new BigInteger(1, qu.a("010000000000000108789B2496AF93"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new bp0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new cp0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new cp0(this, jnVar, jnVar2, jnVarArr, z);
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