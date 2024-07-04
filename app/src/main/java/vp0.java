package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: vp0  reason: default package */
public final class vp0 extends hn.a {
    public wp0 j;

    public vp0() {
        super(233, 74, 0, 0);
        this.j = new wp0(this, null, null, false);
        this.b = new up0(BigInteger.valueOf(0L));
        this.c = new up0(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, qu.a("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new vp0();
    }

    @Override // defpackage.hn
    public final z61 b() {
        return new x51();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new wp0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new wp0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new up0(bigInteger);
    }

    @Override // defpackage.hn
    public final int j() {
        return 233;
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