package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: jp0  reason: default package */
public final class jp0 extends hn.a {
    public kp0 j;

    public jp0() {
        super(163, 3, 6, 7);
        this.j = new kp0(this, null, null, false);
        ip0 ip0Var = new ip0(BigInteger.valueOf(1L));
        this.b = ip0Var;
        this.c = ip0Var;
        this.d = new BigInteger(1, qu.a("04000000000000000000020108A2E0CC0D99F8A5EF"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new jp0();
    }

    @Override // defpackage.hn
    public final z61 b() {
        return new x51();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new kp0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new kp0(this, jnVar, jnVar2, jnVarArr, z);
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
        return true;
    }
}