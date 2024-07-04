package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: qp0  reason: default package */
public final class qp0 extends hn.a {
    public rp0 j;

    public qp0() {
        super(193, 15, 0, 0);
        this.j = new rp0(this, null, null, false);
        this.b = new pp0(new BigInteger(1, qu.a("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.c = new pp0(new BigInteger(1, qu.a("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.d = new BigInteger(1, qu.a("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new qp0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new rp0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new rp0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new pp0(bigInteger);
    }

    @Override // defpackage.hn
    public final int j() {
        return 193;
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