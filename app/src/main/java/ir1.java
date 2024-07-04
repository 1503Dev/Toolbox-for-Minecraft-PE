package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: ir1  reason: default package */
public final class ir1 {
    public final jr1 a = new jr1();
    public final kh4 b = new kh4(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(p16 p16Var) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        if (this.e) {
            this.e = false;
            this.b.b(0);
        }
        while (true) {
            boolean z3 = true;
            if (this.e) {
                return true;
            }
            int i3 = this.c;
            if (i3 < 0) {
                if (!this.a.b(p16Var, -1L) || !this.a.a(p16Var, true)) {
                    break;
                }
                jr1 jr1Var = this.a;
                int i4 = jr1Var.d;
                if ((jr1Var.a & 1) == 1 && this.b.c == 0) {
                    this.d = 0;
                    int i5 = 0;
                    do {
                        int i6 = this.d;
                        int i7 = 0 + i6;
                        jr1 jr1Var2 = this.a;
                        if (i7 >= jr1Var2.c) {
                            break;
                        }
                        int[] iArr = jr1Var2.f;
                        this.d = i6 + 1;
                        i2 = iArr[i7];
                        i5 += i2;
                    } while (i2 == 255);
                    i4 += i5;
                    i3 = this.d;
                } else {
                    i3 = 0;
                }
                try {
                    p16Var.k(i4);
                    z2 = true;
                } catch (EOFException unused) {
                    z2 = false;
                }
                if (!z2) {
                    return false;
                }
                this.c = i3;
            }
            this.d = 0;
            int i8 = 0;
            do {
                int i9 = this.d;
                int i10 = i3 + i9;
                jr1 jr1Var3 = this.a;
                if (i10 >= jr1Var3.c) {
                    break;
                }
                int[] iArr2 = jr1Var3.f;
                this.d = i9 + 1;
                i = iArr2[i10];
                i8 += i;
            } while (i == 255);
            int i11 = this.c + this.d;
            if (i8 > 0) {
                kh4 kh4Var = this.b;
                int i12 = kh4Var.c + i8;
                byte[] bArr = kh4Var.a;
                if (i12 > bArr.length) {
                    kh4Var.a = Arrays.copyOf(bArr, i12);
                }
                kh4 kh4Var2 = this.b;
                try {
                    p16Var.A(kh4Var2.a, kh4Var2.c, i8, false);
                    z = true;
                } catch (EOFException unused2) {
                    z = false;
                }
                if (!z) {
                    return false;
                }
                kh4 kh4Var3 = this.b;
                kh4Var3.d(kh4Var3.c + i8);
                if (this.a.f[i11 - 1] == 255) {
                    z3 = false;
                }
                this.e = z3;
            }
            if (i11 == this.a.c) {
                i11 = -1;
            }
            this.c = i11;
        }
    }
}