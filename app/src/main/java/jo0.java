package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: jo0  reason: default package */
public final class jo0 extends hn.b {
    public static final BigInteger j = new BigInteger(1, qu.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));
    public lo0 i;

    public jo0() {
        super(j);
        this.i = new lo0(this, null, null, false);
        this.b = new ko0(new BigInteger(1, qu.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.c = new ko0(new BigInteger(1, qu.a("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.d = new BigInteger(1, qu.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new jo0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new lo0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new lo0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new ko0(bigInteger);
    }

    @Override // defpackage.hn
    public final int j() {
        return j.bitLength();
    }

    @Override // defpackage.hn
    public final wn k() {
        return this.i;
    }

    @Override // defpackage.hn
    public final boolean q(int i) {
        return i == 2;
    }
}