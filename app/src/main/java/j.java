package defpackage;

/* renamed from: j  reason: default package */
public final class j extends t {
    public byte[] P;

    public j(byte[] bArr) {
        this.P = bArr;
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        return j7.h(this.P);
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (tVar instanceof j) {
            return j7.a(this.P, ((j) tVar).P);
        }
        return false;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        rVar.d(this.P, 24);
    }

    @Override // defpackage.t
    public final int r() {
        int length = this.P.length;
        return eu0.a(length) + 1 + length;
    }

    @Override // defpackage.t
    public final boolean t() {
        return false;
    }
}