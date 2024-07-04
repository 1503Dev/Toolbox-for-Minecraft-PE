package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: kq0  reason: default package */
public final class kq0 extends hn.a {
    public lq0 j;

    public kq0() {
        super(409, 87, 0, 0);
        this.j = new lq0(this, null, null, false);
        this.b = new hq0(BigInteger.valueOf(1L));
        this.c = new hq0(new BigInteger(1, qu.a("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.d = new BigInteger(1, qu.a("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new kq0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new lq0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new lq0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new hq0(bigInteger);
    }

    @Override // defpackage.hn
    public final int j() {
        return 409;
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