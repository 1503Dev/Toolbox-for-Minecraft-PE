package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: po0  reason: default package */
public final class po0 extends hn.b {
    public static final BigInteger j = new BigInteger(1, qu.a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));
    public ro0 i;

    public po0() {
        super(j);
        this.i = new ro0(this, null, null, false);
        this.b = new qo0(new BigInteger(1, qu.a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = new qo0(new BigInteger(1, qu.a("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.d = new BigInteger(1, qu.a("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new po0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new ro0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new ro0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new qo0(bigInteger);
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