package defpackage;

/* renamed from: ym0  reason: default package */
public final class ym0 extends b30 {
    public int e0 = 20;
    public long f0;
    public long g0;
    public long h0;
    public long i0;
    public long j0;
    public long k0;
    public long l0;
    public long m0;

    public ym0() {
        this.T = -3482333909917012819L;
        this.U = 2216346199247487646L;
        this.V = -7364697282686394994L;
        this.W = 65953792586715988L;
        this.X = -816286391624063116L;
        this.Y = 4512832404995164602L;
        this.Z = -5033199132376557362L;
        this.a0 = -124578254951840548L;
        f((byte) 83);
        f((byte) 72);
        f((byte) 65);
        f((byte) 45);
        f((byte) 53);
        f((byte) 49);
        f((byte) 50);
        f((byte) 47);
        f((byte) 49);
        f((byte) 54);
        f((byte) 48);
        j();
        this.f0 = this.T;
        this.g0 = this.U;
        this.h0 = this.V;
        this.i0 = this.W;
        this.j0 = this.X;
        this.k0 = this.Y;
        this.l0 = this.Z;
        this.m0 = this.a0;
        reset();
    }

    public static void m(long j, byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        int i3 = (int) (j >>> 32);
        int min = Math.min(4, i2);
        while (true) {
            min--;
            if (min < 0) {
                break;
            }
            bArr[i + min] = (byte) (i3 >>> ((3 - min) * 8));
        }
        if (i2 <= 4) {
            return;
        }
        int i4 = (int) (j & 4294967295L);
        int i5 = i + 4;
        int min2 = Math.min(4, i2 - 4);
        while (true) {
            min2--;
            if (min2 < 0) {
                return;
            }
            bArr[i5 + min2] = (byte) (i4 >>> ((3 - min2) * 8));
        }
    }

    @Override // defpackage.tl
    public final String b() {
        StringBuilder b = e5.b("SHA-512/");
        b.append(Integer.toString(this.e0 * 8));
        return b.toString();
    }

    @Override // defpackage.tl
    public final int c() {
        return this.e0;
    }

    @Override // defpackage.tl
    public final int d(byte[] bArr) {
        j();
        m(this.T, bArr, 0, this.e0);
        m(this.U, bArr, 8, this.e0 - 8);
        m(this.V, bArr, 16, this.e0 - 16);
        m(this.W, bArr, 24, this.e0 - 24);
        m(this.X, bArr, 32, this.e0 - 32);
        m(this.Y, bArr, 40, this.e0 - 40);
        m(this.Z, bArr, 48, this.e0 - 48);
        m(this.a0, bArr, 56, this.e0 - 56);
        reset();
        return this.e0;
    }

    @Override // defpackage.b30, defpackage.tl
    public final void reset() {
        super.reset();
        this.T = this.f0;
        this.U = this.g0;
        this.V = this.h0;
        this.W = this.i0;
        this.X = this.j0;
        this.Y = this.k0;
        this.Z = this.l0;
        this.a0 = this.m0;
    }
}