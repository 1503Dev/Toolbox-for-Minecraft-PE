package defpackage;

/* renamed from: y  reason: default package */
public final class y extends t {
    public byte[] P;

    public y(byte[] bArr) {
        this.P = bArr;
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        return j7.h(this.P);
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (tVar instanceof y) {
            return j7.a(this.P, ((y) tVar).P);
        }
        return false;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        rVar.c(23);
        int length = this.P.length;
        rVar.f(length);
        for (int i = 0; i != length; i++) {
            rVar.c(this.P[i]);
        }
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

    public final String toString() {
        return hu0.a(this.P);
    }
}