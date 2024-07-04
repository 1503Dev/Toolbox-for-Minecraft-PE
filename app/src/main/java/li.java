package defpackage;

/* renamed from: li  reason: default package */
public final class li extends t {
    public final byte[] P;

    public li(byte[] bArr) {
        this.P = bArr;
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        return j7.h(this.P);
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (tVar instanceof li) {
            return j7.a(this.P, ((li) tVar).P);
        }
        return false;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        rVar.d(this.P, 19);
    }

    @Override // defpackage.t
    public final int r() {
        return eu0.a(this.P.length) + 1 + this.P.length;
    }

    @Override // defpackage.t
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return hu0.a(this.P);
    }
}