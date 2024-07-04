package defpackage;

/* renamed from: cd5  reason: default package */
public final class cd5 extends ed5 {
    public final int S;
    public final int T;

    public cd5(byte[] bArr, int i, int i2) {
        super(bArr);
        gd5.D(i, i + i2, bArr.length);
        this.S = i;
        this.T = i2;
    }

    @Override // defpackage.ed5
    public final int J() {
        return this.S;
    }

    @Override // defpackage.ed5, defpackage.gd5
    public final byte h(int i) {
        gd5.H(i, this.T);
        return this.R[this.S + i];
    }

    @Override // defpackage.ed5, defpackage.gd5
    public final byte m(int i) {
        return this.R[this.S + i];
    }

    @Override // defpackage.ed5, defpackage.gd5
    public final int o() {
        return this.T;
    }

    @Override // defpackage.ed5, defpackage.gd5
    public final void p(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.R, this.S + i, bArr, i2, i3);
    }
}