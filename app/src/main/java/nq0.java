package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: nq0  reason: default package */
public final class nq0 extends hn.a {
    public oq0 j;

    public nq0() {
        super(571, 2, 5, 10);
        this.j = new oq0(this, null, null, false);
        this.b = new mq0(BigInteger.valueOf(0L));
        this.c = new mq0(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, qu.a("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new nq0();
    }

    @Override // defpackage.hn
    public final z61 b() {
        return new x51();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new oq0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new oq0(this, jnVar, jnVar2, jnVarArr, z);
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
        return true;
    }
}