package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: xp0  reason: default package */
public final class xp0 extends hn.a {
    public yp0 j;

    public xp0() {
        super(233, 74, 0, 0);
        this.j = new yp0(this, null, null, false);
        this.b = new up0(BigInteger.valueOf(1L));
        this.c = new up0(new BigInteger(1, qu.a("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD")));
        this.d = new BigInteger(1, qu.a("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new xp0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new yp0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new yp0(this, jnVar, jnVar2, jnVarArr, z);
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
        return false;
    }
}