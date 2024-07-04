package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: an0  reason: default package */
public final class an0 extends hn.b {
    public static final BigInteger j = new BigInteger(1, qu.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));
    public cn0 i;

    public an0() {
        super(j);
        this.i = new cn0(this, null, null, false);
        this.b = new bn0(new BigInteger(1, qu.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        this.c = new bn0(new BigInteger(1, qu.a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        this.d = new BigInteger(1, qu.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new an0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new cn0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new cn0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new bn0(bigInteger);
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