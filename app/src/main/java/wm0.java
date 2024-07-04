package defpackage;

/* renamed from: wm0  reason: default package */
public final class wm0 extends b30 {
    @Override // defpackage.tl
    public final String b() {
        return "SHA-384";
    }

    @Override // defpackage.tl
    public final int c() {
        return 48;
    }

    @Override // defpackage.tl
    public final int d(byte[] bArr) {
        j();
        z61.x0(0, this.T, bArr);
        z61.x0(8, this.U, bArr);
        z61.x0(16, this.V, bArr);
        z61.x0(24, this.W, bArr);
        z61.x0(32, this.X, bArr);
        z61.x0(40, this.Y, bArr);
        reset();
        return 48;
    }

    @Override // defpackage.b30, defpackage.tl
    public final void reset() {
        super.reset();
        this.T = -3766243637369397544L;
        this.U = 7105036623409894663L;
        this.V = -7973340178411365097L;
        this.W = 1526699215303891257L;
        this.X = 7436329637833083697L;
        this.Y = -8163818279084223215L;
        this.Z = -2662702644619276377L;
        this.a0 = 5167115440072839076L;
    }
}