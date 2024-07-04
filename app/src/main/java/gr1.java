package defpackage;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: gr1  reason: default package */
public final class gr1 extends nr1 {
    public tk1 n;
    public fr1 o;

    @Override // defpackage.nr1
    public final long a(kh4 kh4Var) {
        boolean z;
        byte[] bArr = kh4Var.a;
        if (bArr[0] == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = (bArr[2] & 255) >> 4;
            if (i != 6) {
                if (i == 7) {
                    i = 7;
                }
                int l = eg4.l(i, kh4Var);
                kh4Var.e(0);
                return l;
            }
            kh4Var.f(4);
            kh4Var.w();
            int l2 = eg4.l(i, kh4Var);
            kh4Var.e(0);
            return l2;
        }
        return -1L;
    }

    @Override // defpackage.nr1
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    @Override // defpackage.nr1
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(kh4 kh4Var, long j, mr1 mr1Var) {
        boolean z;
        byte[] bArr = kh4Var.a;
        tk1 tk1Var = this.n;
        if (tk1Var == null) {
            tk1 tk1Var2 = new tk1(bArr, 17);
            this.n = tk1Var2;
            mr1Var.P = tk1Var2.b(Arrays.copyOfRange(bArr, 9, kh4Var.c), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            sk1 i = gv4.i(kh4Var);
            tk1 tk1Var3 = new tk1(tk1Var.a, tk1Var.b, tk1Var.c, tk1Var.d, tk1Var.e, tk1Var.g, tk1Var.h, tk1Var.j, i, tk1Var.l);
            this.n = tk1Var3;
            this.o = new fr1(tk1Var3, i);
            return true;
        }
        if (b == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        fr1 fr1Var = this.o;
        if (fr1Var != null) {
            fr1Var.R = j;
            mr1Var.Q = fr1Var;
        }
        ((cu1) mr1Var.P).getClass();
        return false;
    }
}