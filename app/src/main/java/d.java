package defpackage;

/* renamed from: d  reason: default package */
public abstract class d extends t {
    public final boolean P;
    public final int Q;
    public final byte[] R;

    public d(int i, boolean z, byte[] bArr) {
        this.P = z;
        this.Q = i;
        this.R = j7.c(bArr);
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        boolean z = this.P;
        return ((z ? 1 : 0) ^ this.Q) ^ j7.h(this.R);
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (tVar instanceof d) {
            d dVar = (d) tVar;
            return this.P == dVar.P && this.Q == dVar.Q && j7.a(this.R, dVar.R);
        }
        return false;
    }

    @Override // defpackage.t
    public void q(r rVar) {
        int i;
        if (this.P) {
            i = 96;
        } else {
            i = 64;
        }
        int i2 = this.Q;
        byte[] bArr = this.R;
        rVar.h(i, i2);
        rVar.f(bArr.length);
        rVar.a.write(bArr);
    }

    @Override // defpackage.t
    public final int r() {
        return eu0.a(this.R.length) + eu0.b(this.Q) + this.R.length;
    }

    @Override // defpackage.t
    public final boolean t() {
        return this.P;
    }
}