package defpackage;

/* renamed from: qi  reason: default package */
public final class qi extends t {
    public byte[] P;

    public qi(byte[] bArr) {
        this.P = j7.c(bArr);
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        return j7.h(this.P);
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (tVar instanceof qi) {
            return j7.a(this.P, ((qi) tVar).P);
        }
        return false;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        rVar.d(this.P, 20);
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