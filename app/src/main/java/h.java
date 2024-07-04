package defpackage;

/* renamed from: h  reason: default package */
public final class h extends t {
    public static h[] Q = new h[12];
    public final byte[] P;

    public h(byte[] bArr) {
        byte b;
        if (!hg0.a("org.spongycastle.asn1.allow_unsafe_integer")) {
            boolean z = false;
            if (bArr.length > 1 && (((b = bArr[0]) == 0 && (bArr[1] & 128) == 0) || (b == -1 && (bArr[1] & 128) != 0))) {
                z = true;
            }
            if (z) {
                throw new IllegalArgumentException("malformed enumerated");
            }
        }
        this.P = j7.c(bArr);
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        return j7.h(this.P);
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (tVar instanceof h) {
            return j7.a(this.P, ((h) tVar).P);
        }
        return false;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        rVar.d(this.P, 10);
    }

    @Override // defpackage.t
    public final int r() {
        return eu0.a(this.P.length) + 1 + this.P.length;
    }

    @Override // defpackage.t
    public final boolean t() {
        return false;
    }
}