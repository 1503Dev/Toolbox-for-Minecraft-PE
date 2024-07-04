package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: iq0  reason: default package */
public final class iq0 extends hn.a {
    public jq0 j;

    public iq0() {
        super(409, 87, 0, 0);
        this.j = new jq0(this, null, null, false);
        this.b = new hq0(BigInteger.valueOf(0L));
        this.c = new hq0(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, qu.a("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new iq0();
    }

    @Override // defpackage.hn
    public final z61 b() {
        return new x51();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new jq0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new jq0(this, jnVar, jnVar2, jnVarArr, z);
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
        return true;
    }
}