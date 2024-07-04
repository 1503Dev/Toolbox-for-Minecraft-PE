package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: gp0  reason: default package */
public final class gp0 extends hn.a {
    public hp0 j;

    public gp0() {
        super(131, 2, 3, 8);
        this.j = new hp0(this, null, null, false);
        this.b = new dp0(new BigInteger(1, qu.a("03E5A88919D7CAFCBF415F07C2176573B2")));
        this.c = new dp0(new BigInteger(1, qu.a("04B8266A46C55657AC734CE38F018F2192")));
        this.d = new BigInteger(1, qu.a("0400000000000000016954A233049BA98F"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new gp0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new hp0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new hp0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new dp0(bigInteger);
    }

    @Override // defpackage.hn
    public final int j() {
        return 131;
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