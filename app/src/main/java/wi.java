package defpackage;

/* renamed from: wi  reason: default package */
public final class wi extends e {
    public wi(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        byte[] bArr = this.P;
        int length = bArr.length + 1;
        byte[] bArr2 = new byte[length];
        bArr2[0] = (byte) this.Q;
        System.arraycopy(bArr, 0, bArr2, 1, length - 1);
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