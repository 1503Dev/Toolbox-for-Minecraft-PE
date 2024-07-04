package defpackage;

/* renamed from: zh  reason: default package */
public final class zh extends e {
    public zh(n nVar) {
        super(nVar.h().o("DER"), 0);
    }

    public zh(byte[] bArr) {
        super(bArr, 0);
    }

    public zh(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        byte[] bArr = this.P;
        int i = this.Q;
        byte[] c = j7.c(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            c[length] = (byte) ((255 << i) & c[length]);
        }
        int length2 = c.length + 1;
        byte[] bArr2 = new byte[length2];
        bArr2[0] = (byte) this.Q;
        System.arraycopy(c, 0, bArr2, 1, length2 - 1);
        rVar.d(bArr2, 3);
    }

    @Override // defpackage.t
    public final int r() {
        return eu0.a(this.P.length + 1) + 1 + this.P.length + 1;
    }

    @Override // defpackage.t
    public final boolean t() {
        return false;
    }
}