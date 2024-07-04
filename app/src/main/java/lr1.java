package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: lr1  reason: default package */
public final class lr1 extends nr1 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(kh4 kh4Var, byte[] bArr) {
        int i = kh4Var.c;
        int i2 = kh4Var.b;
        if (i - i2 < 8) {
            return false;
        }
        byte[] bArr2 = new byte[8];
        kh4Var.a(bArr2, 0, 8);
        kh4Var.e(i2);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.nr1
    public final long a(kh4 kh4Var) {
        byte[] bArr = kh4Var.a;
        byte b = 0;
        byte b2 = bArr[0];
        if (bArr.length > 1) {
            b = bArr[1];
        }
        return (this.i * ea2.J(b2, b)) / 1000000;
    }

    @Override // defpackage.nr1
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = false;
        }
    }

    @Override // defpackage.nr1
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(kh4 kh4Var, long j, mr1 mr1Var) {
        cu1 cu1Var;
        if (e(kh4Var, o)) {
            byte[] copyOf = Arrays.copyOf(kh4Var.a, kh4Var.c);
            int i = copyOf[9] & 255;
            ArrayList H = ea2.H(copyOf);
            if (((cu1) mr1Var.P) != null) {
                return true;
            }
            bs1 bs1Var = new bs1();
            bs1Var.j = "audio/opus";
            bs1Var.w = i;
            bs1Var.x = 48000;
            bs1Var.l = H;
            cu1Var = new cu1(bs1Var);
        } else if (e(kh4Var, p)) {
            tv2.B((cu1) mr1Var.P);
            if (this.n) {
                return true;
            }
            this.n = true;
            kh4Var.f(8);
            yt2 a = ul1.a(nv4.u((String[]) ul1.b(kh4Var, false, false).b));
            if (a == null) {
                return true;
            }
            cu1 cu1Var2 = (cu1) mr1Var.P;
            cu1Var2.getClass();
            bs1 bs1Var2 = new bs1(cu1Var2);
            yt2 yt2Var = ((cu1) mr1Var.P).i;
            if (yt2Var != null) {
                a = a.a(yt2Var.P);
            }
            bs1Var2.h = a;
            cu1Var = new cu1(bs1Var2);
        } else {
            tv2.B((cu1) mr1Var.P);
            return false;
        }
        mr1Var.P = cu1Var;
        return true;
    }
}