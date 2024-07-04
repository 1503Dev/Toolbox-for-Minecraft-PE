package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: sp0  reason: default package */
public final class sp0 extends hn.a {
    public tp0 j;

    public sp0() {
        super(193, 15, 0, 0);
        this.j = new tp0(this, null, null, false);
        this.b = new pp0(new BigInteger(1, qu.a("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.c = new pp0(new BigInteger(1, qu.a("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.d = new BigInteger(1, qu.a("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new sp0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new tp0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new tp0(this, jnVar, jnVar2, jnVarArr, z);
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