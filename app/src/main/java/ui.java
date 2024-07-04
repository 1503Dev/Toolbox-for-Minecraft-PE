package defpackage;

/* renamed from: ui  reason: default package */
public final class ui extends t {
    public final byte[] P;

    public ui(byte[] bArr) {
        this.P = j7.c(bArr);
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        return j7.h(this.P);
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (tVar instanceof ui) {
            return j7.a(this.P, ((ui) tVar).P);
        }
        return false;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        rVar.d(this.P, 21);
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