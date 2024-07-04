package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: fq0  reason: default package */
public final class fq0 extends hn.a {
    public gq0 j;

    public fq0() {
        super(283, 5, 7, 12);
        this.j = new gq0(this, null, null, false);
        this.b = new cq0(BigInteger.valueOf(1L));
        this.c = new cq0(new BigInteger(1, qu.a("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5")));
        this.d = new BigInteger(1, qu.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new fq0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new gq0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new gq0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new cq0(bigInteger);
    }

    @Override // defpackage.hn
    public final int j() {
        return 283;
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