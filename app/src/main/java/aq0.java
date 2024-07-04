package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: aq0  reason: default package */
public final class aq0 extends hn.a {
    public bq0 j;

    public aq0() {
        super(239, 158, 0, 0);
        this.j = new bq0(this, null, null, false);
        this.b = new zp0(BigInteger.valueOf(0L));
        this.c = new zp0(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, qu.a("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new aq0();
    }

    @Override // defpackage.hn
    public final z61 b() {
        return new x51();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new bq0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new bq0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new zp0(bigInteger);
    }

    @Override // defpackage.hn
    public final int j() {
        return 239;
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