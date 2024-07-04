package defpackage;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: vl1  reason: default package */
public final class vl1 implements lk1 {
    public static final int[] k = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] l;
    public static final byte[] m;
    public static final byte[] n;
    public static final int o;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public boolean f;
    public nk1 h;
    public pl1 i;
    public boolean j;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        l = iArr;
        int i = zn4.a;
        Charset charset = zs4.c;
        m = "#!AMR\n".getBytes(charset);
        n = "#!AMR-WB\n".getBytes(charset);
        o = iArr[8];
    }

    @Override // defpackage.lk1
    public final boolean a(p16 p16Var) {
        return b(p16Var);
    }

    public final boolean b(p16 p16Var) {
        int length;
        byte[] bArr = m;
        p16Var.f = 0;
        int length2 = bArr.length;
        byte[] bArr2 = new byte[length2];
        p16Var.B(bArr2, 0, length2, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.b = false;
            length = bArr.length;
        } else {
            byte[] bArr3 = n;
            p16Var.f = 0;
            int length3 = bArr3.length;
            byte[] bArr4 = new byte[length3];
            p16Var.B(bArr4, 0, length3, false);
            if (!Arrays.equals(bArr4, bArr3)) {
                return false;
            }
            this.b = true;
            length = bArr3.length;
        }
        p16Var.k(length);
        return true;
    }

    @Override // defpackage.lk1
    public final void d(nk1 nk1Var) {
        this.h = nk1Var;
        this.i = nk1Var.q(0, 1);
        nk1Var.j();
    }

    @Override // defpackage.lk1
    public final void e(long j, long j2) {
        this.c = 0L;
        this.d = 0;
        this.e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008b A[Catch: EOFException -> 0x00ff, TryCatch #0 {EOFException -> 0x00ff, blocks: (B:22:0x0058, B:24:0x006d, B:38:0x008b, B:40:0x0094, B:39:0x0090, B:55:0x00cb, B:56:0x00e8, B:57:0x00e9, B:58:0x00fe), top: B:65:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090 A[Catch: EOFException -> 0x00ff, TryCatch #0 {EOFException -> 0x00ff, blocks: (B:22:0x0058, B:24:0x006d, B:38:0x008b, B:40:0x0094, B:39:0x0090, B:55:0x00cb, B:56:0x00e8, B:57:0x00e9, B:58:0x00fe), top: B:65:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(mk1 mk1Var, jl1 jl1Var) {
        String str;
        int i;
        tv2.B(this.i);
        int i2 = zn4.a;
        p16 p16Var = (p16) mk1Var;
        if (p16Var.d == 0 && !b(p16Var)) {
            throw jy2.a("Could not find AMR header.", null);
        }
        if (!this.j) {
            this.j = true;
            boolean z = this.b;
            if (true != z) {
                str = "audio/3gpp";
            } else {
                str = "audio/amr-wb";
            }
            if (true != z) {
                i = 8000;
            } else {
                i = 16000;
            }
            pl1 pl1Var = this.i;
            bs1 bs1Var = new bs1();
            bs1Var.j = str;
            bs1Var.k = o;
            bs1Var.w = 1;
            bs1Var.x = i;
            pl1Var.e(new cu1(bs1Var));
        }
        int i3 = this.e;
        int i4 = -1;
        if (i3 == 0) {
            try {
                ((p16) mk1Var).f = 0;
                ((p16) mk1Var).B(this.a, 0, 1, false);
                byte b = this.a[0];
                if ((b & 131) <= 0) {
                    boolean z2 = this.b;
                    int i5 = (b >> 3) & 15;
                    if (z2) {
                        if (i5 >= 10) {
                            if (i5 > 13) {
                            }
                        }
                        if (!z2) {
                            i3 = l[i5];
                        } else {
                            i3 = k[i5];
                        }
                        this.d = i3;
                        this.e = i3;
                        if (this.g == -1) {
                            this.g = i3;
                        }
                    }
                    if (!z2) {
                        if (i5 >= 12 && i5 <= 14) {
                        }
                        if (!z2) {
                        }
                        this.d = i3;
                        this.e = i3;
                        if (this.g == -1) {
                        }
                    }
                    String str2 = "WB";
                    if (true != z2) {
                        str2 = "NB";
                    }
                    throw jy2.a("Illegal AMR " + str2 + " frame type " + i5, null);
                }
                throw jy2.a("Invalid padding bits for frame header " + ((int) b), null);
            } catch (EOFException unused) {
            }
        }
        int f = this.i.f(mk1Var, i3, true);
        if (f != -1) {
            int i6 = this.e - f;
            this.e = i6;
            if (i6 <= 0) {
                this.i.b(this.c, 1, this.d, 0, null);
                this.c += 20000;
            }
            i4 = 0;
        }
        if (this.f) {
            return i4;
        }
        this.h.n(new ll1(-9223372036854775807L, 0L));
        this.f = true;
        return i4;
    }
}