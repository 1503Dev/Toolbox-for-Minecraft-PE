package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: np0  reason: default package */
public final class np0 extends hn.a {
    public op0 j;

    public np0() {
        super(163, 3, 6, 7);
        this.j = new op0(this, null, null, false);
        this.b = new ip0(BigInteger.valueOf(1L));
        this.c = new ip0(new BigInteger(1, qu.a("020A601907B8C953CA1481EB10512F78744A3205FD")));
        this.d = new BigInteger(1, qu.a("040000000000000000000292FE77E70C12A4234C33"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new np0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new op0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new op0(this, jnVar, jnVar2, jnVarArr, z);
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
        return false;
    }
}