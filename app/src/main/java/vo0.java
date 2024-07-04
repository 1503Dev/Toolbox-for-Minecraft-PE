package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: vo0  reason: default package */
public final class vo0 extends hn.b {
    public static final BigInteger j = new BigInteger(1, qu.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));
    public xo0 i;

    public vo0() {
        super(j);
        this.i = new xo0(this, null, null, false);
        this.b = new wo0(new BigInteger(1, qu.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = new wo0(new BigInteger(1, qu.a("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.d = new BigInteger(1, qu.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new vo0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new xo0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new xo0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new wo0(bigInteger);
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