package defpackage;

import java.math.BigInteger;

/* renamed from: vs  reason: default package */
public final class vs extends z61 {
    public final hn f;
    public final us g;

    public vs(hn hnVar, us usVar) {
        if (hnVar != null && hnVar.d != null) {
            this.f = hnVar;
            this.g = usVar;
            return;
        }
        throw new IllegalArgumentException("Need curve with known group order");
    }

    @Override // defpackage.z61
    public final wn K0(wn wnVar, BigInteger bigInteger) {
        boolean z;
        wn[] wnVarArr;
        wn[] wnVarArr2;
        wn[] wnVarArr3;
        wn[] wnVarArr4;
        if (this.f.h(wnVar.a)) {
            BigInteger[] c = this.g.c(bigInteger.mod(wnVar.a.d));
            boolean z2 = false;
            BigInteger bigInteger2 = c[0];
            BigInteger bigInteger3 = c[1];
            nj2 a = this.g.a();
            this.g.b();
            if (bigInteger2.signum() < 0) {
                z = true;
            } else {
                z = false;
            }
            if (bigInteger3.signum() < 0) {
                z2 = true;
            }
            BigInteger abs = bigInteger2.abs();
            BigInteger abs2 = bigInteger3.abs();
            int max = Math.max(2, Math.min(16, z61.S(Math.max(abs.bitLength(), abs2.bitLength()))));
            wn y0 = z61.y0(wnVar, max, a);
            t51 R = z61.R(wnVar);
            t51 R2 = z61.R(y0);
            if (z) {
                wnVarArr = R.b;
            } else {
                wnVarArr = R.a;
            }
            wn[] wnVarArr5 = wnVarArr;
            if (z2) {
                wnVarArr2 = R2.b;
            } else {
                wnVarArr2 = R2.a;
            }
            wn[] wnVarArr6 = wnVarArr2;
            if (z) {
                wnVarArr3 = R.a;
            } else {
                wnVarArr3 = R.b;
            }
            wn[] wnVarArr7 = wnVarArr3;
            if (z2) {
                wnVarArr4 = R2.a;
            } else {
                wnVarArr4 = R2.b;
            }
            return fn.b(wnVarArr5, wnVarArr7, z61.P(max, abs), wnVarArr6, wnVarArr4, z61.P(max, abs2));
        }
        throw new IllegalStateException();
    }
}