package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: wu5  reason: default package */
public final class wu5 implements fv4 {
    public final fv4 a;
    public final int b;
    public final iw5 c;
    public final byte[] d;
    public int e;

    public wu5(fe5 fe5Var, int i, iw5 iw5Var) {
        tv2.G(i > 0);
        this.a = fe5Var;
        this.b = i;
        this.c = iw5Var;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.fv4
    public final long a(kz4 kz4Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fv4
    public final Map b() {
        return this.a.b();
    }

    @Override // defpackage.fv4
    public final void c(bf5 bf5Var) {
        bf5Var.getClass();
        this.a.c(bf5Var);
    }

    @Override // defpackage.fv4
    public final Uri d() {
        return this.a.d();
    }

    @Override // defpackage.fv4
    public final void i() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.gv5
    public final int x(byte[] bArr, int i, int i2) {
        long max;
        int i3 = this.e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.a.x(this.d, 0, 1) != -1) {
                int i5 = (this.d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int x = this.a.x(bArr2, i4, i6);
                        if (x != -1) {
                            i4 += x;
                            i6 -= x;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        iw5 iw5Var = this.c;
                        kh4 kh4Var = new kh4(bArr2, i5);
                        if (!iw5Var.l) {
                            max = iw5Var.i;
                        } else {
                            mw5 mw5Var = iw5Var.m;
                            Map map = mw5.y0;
                            max = Math.max(mw5Var.s(true), iw5Var.i);
                        }
                        int i8 = kh4Var.c - kh4Var.b;
                        vw5 vw5Var = iw5Var.k;
                        vw5Var.getClass();
                        vw5Var.c(kh4Var, i8);
                        vw5Var.b(max, 1, i8, 0, null);
                        iw5Var.l = true;
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int x2 = this.a.x(bArr, i, Math.min(i3, i2));
        if (x2 != -1) {
            this.e -= x2;
        }
        return x2;
    }
}