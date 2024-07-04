package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: er1  reason: default package */
public final class er1 implements kr1 {
    public final jr1 P;
    public final long Q;
    public final long R;
    public final nr1 S;
    public int T;
    public long U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public long Z;
    public long a0;

    public er1(nr1 nr1Var, long j, long j2, long j3, long j4, boolean z) {
        tv2.G(j >= 0 && j2 > j);
        this.S = nr1Var;
        this.Q = j;
        this.R = j2;
        if (j3 == j2 - j || z) {
            this.U = j4;
            this.T = 4;
        } else {
            this.T = 0;
        }
        this.P = new jr1();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    @Override // defpackage.kr1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(p16 p16Var) {
        long j;
        boolean z;
        long j2;
        long j3;
        int i = this.T;
        long j4 = -1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return -1L;
                    }
                    j2 = -1;
                } else {
                    long j5 = this.X;
                    long j6 = this.Y;
                    if (j5 != j6) {
                        long j7 = p16Var.d;
                        if (!this.P.b(p16Var, j6)) {
                            long j8 = this.X;
                            if (j8 != j7) {
                                j2 = -1;
                                j4 = j8;
                            } else {
                                throw new IOException("No ogg page can be found.");
                            }
                        } else {
                            this.P.a(p16Var, false);
                            p16Var.f = 0;
                            long j9 = this.W;
                            jr1 jr1Var = this.P;
                            long j10 = jr1Var.b;
                            long j11 = j9 - j10;
                            int i2 = jr1Var.d + jr1Var.e;
                            if (j11 < 0 || j11 >= 72000) {
                                if (j11 < 0) {
                                    this.Y = j7;
                                    this.a0 = j10;
                                } else {
                                    this.X = p16Var.d + i2;
                                    this.Z = j10;
                                }
                                long j12 = this.Y;
                                j4 = this.X;
                                long j13 = j12 - j4;
                                if (j13 < 100000) {
                                    this.Y = j4;
                                    j2 = -1;
                                } else {
                                    long j14 = i2;
                                    if (j11 <= 0) {
                                        j3 = 2;
                                    } else {
                                        j3 = 1;
                                    }
                                    long j15 = p16Var.d;
                                    Long.signum(j14);
                                    long j16 = ((j11 * j13) / (this.a0 - this.Z)) + (j15 - (j14 * j3));
                                    j2 = -1;
                                    j4 = Math.max(j4, Math.min(j16, j12 - 1));
                                }
                            }
                        }
                        if (j4 == j2) {
                            return j4;
                        }
                        this.T = 3;
                    }
                    j2 = -1;
                    if (j4 == j2) {
                    }
                }
                while (true) {
                    this.P.b(p16Var, j2);
                    this.P.a(p16Var, false);
                    jr1 jr1Var2 = this.P;
                    if (jr1Var2.b > this.W) {
                        p16Var.f = 0;
                        this.T = 4;
                        return -(this.Z + 2);
                    }
                    p16Var.k(jr1Var2.d + jr1Var2.e);
                    this.X = p16Var.d;
                    this.Z = this.P.b;
                    j2 = -1;
                }
            }
        } else {
            long j17 = p16Var.d;
            this.V = j17;
            this.T = 1;
            long j18 = this.R - 65307;
            if (j18 > j17) {
                return j18;
            }
        }
        jr1 jr1Var3 = this.P;
        jr1Var3.a = 0;
        jr1Var3.b = 0L;
        jr1Var3.c = 0;
        jr1Var3.d = 0;
        jr1Var3.e = 0;
        if (jr1Var3.b(p16Var, -1L)) {
            this.P.a(p16Var, false);
            jr1 jr1Var4 = this.P;
            p16Var.k(jr1Var4.d + jr1Var4.e);
            do {
                jr1 jr1Var5 = this.P;
                j = jr1Var5.b;
                if ((jr1Var5.a & 4) == 4 || !jr1Var5.b(p16Var, -1L) || p16Var.d >= this.R || !this.P.a(p16Var, true)) {
                    break;
                }
                jr1 jr1Var6 = this.P;
                try {
                    p16Var.k(jr1Var6.d + jr1Var6.e);
                    z = true;
                    continue;
                } catch (EOFException unused) {
                    z = false;
                    continue;
                }
            } while (z);
            this.U = j;
            this.T = 4;
            return this.V;
        }
        throw new EOFException();
    }

    @Override // defpackage.kr1
    public final /* bridge */ /* synthetic */ ml1 b() {
        if (this.U != 0) {
            return new br1(this);
        }
        return null;
    }

    @Override // defpackage.kr1
    public final void g(long j) {
        this.W = Math.max(0L, Math.min(j, this.U - 1));
        this.T = 2;
        this.X = this.Q;
        this.Y = this.R;
        this.Z = 0L;
        this.a0 = this.U;
    }
}