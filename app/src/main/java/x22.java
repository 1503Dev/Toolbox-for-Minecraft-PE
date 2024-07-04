package defpackage;

/* renamed from: x22  reason: default package */
public final class x22 extends p52 {
    public final int S;

    public x22(byte[] bArr, int i) {
        super(bArr);
        y82.s(0, i, bArr.length);
        this.S = i;
    }

    @Override // defpackage.p52, defpackage.y82
    public final byte g(int i) {
        int i2 = this.S;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(k6.a("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(dp.b("Index > length: ", i, ", ", i2));
        }
        return this.R[i];
    }

    @Override // defpackage.p52, defpackage.y82
    public final byte h(int i) {
        return this.R[i];
    }

    @Override // defpackage.p52, defpackage.y82
    public final int m() {
        return this.S;
    }

    @Override // defpackage.p52
    public final void u() {
    }
}