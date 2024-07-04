package defpackage;

import defpackage.hn;
import java.math.BigInteger;

/* renamed from: ep0  reason: default package */
public final class ep0 extends hn.a {
    public fp0 j;

    public ep0() {
        super(131, 2, 3, 8);
        this.j = new fp0(this, null, null, false);
        this.b = new dp0(new BigInteger(1, qu.a("07A11B09A76B562144418FF3FF8C2570B8")));
        this.c = new dp0(new BigInteger(1, qu.a("0217C05610884B63B9C6C7291678F9D341")));
        this.d = new BigInteger(1, qu.a("0400000000000000023123953A9464B54D"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.hn
    public final hn a() {
        return new ep0();
    }

    @Override // defpackage.hn
    public final wn d(jn jnVar, jn jnVar2, boolean z) {
        return new fp0(this, jnVar, jnVar2, z);
    }

    @Override // defpackage.hn
    public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
        return new fp0(this, jnVar, jnVar2, jnVarArr, z);
    }

    @Override // defpackage.hn
    public final jn i(BigInteger bigInteger) {
        return new dp0(bigInteger);
    }

    @Override // defpackage.hn
    public final int j() {
        return 131;
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