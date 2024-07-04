package defpackage;

/* renamed from: f  reason: default package */
public final class f extends t {
    public static final byte[] Q = {-1};
    public static final byte[] R = {0};
    public static final f S = new f(false);
    public static final f T = new f(true);
    public final byte[] P;

    public f(boolean z) {
        this.P = z ? Q : R;
    }

    public f(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        byte b = bArr[0];
        if (b == 0) {
            this.P = R;
        } else if ((b & 255) == 255) {
            this.P = Q;
        } else {
            this.P = j7.c(bArr);
        }
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        return this.P[0];
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        return (tVar instanceof f) && this.P[0] == ((f) tVar).P[0];
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        rVar.d(this.P, 1);
    }

    @Override // defpackage.t
    public final int r() {
        return 3;
    }

    @Override // defpackage.t
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return this.P[0] != 0 ? "TRUE" : "FALSE";
    }
}