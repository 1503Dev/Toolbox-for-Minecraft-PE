package defpackage;

/* renamed from: xm0  reason: default package */
public final class xm0 extends b30 {
    @Override // defpackage.tl
    public final String b() {
        return "SHA-512";
    }

    @Override // defpackage.tl
    public final int c() {
        return 64;
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
        z61.x0(48, this.Z, bArr);
        z61.x0(56, this.a0, bArr);
        reset();
        return 64;
    }

    @Override // defpackage.b30, defpackage.tl
    public final void reset() {
        super.reset();
        this.T = 7640891576956012808L;
        this.U = -4942790177534073029L;
        this.V = 4354685564936845355L;
        this.W = -6534734903238641935L;
        this.X = 5840696475078001361L;
        this.Y = -7276294671716946913L;
        this.Z = 2270897969802886507L;
        this.a0 = 6620516959819538809L;
    }
}