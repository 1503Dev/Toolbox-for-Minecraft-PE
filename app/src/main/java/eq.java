package defpackage;

import java.math.BigInteger;

/* renamed from: eq  reason: default package */
public final class eq extends z61 {
    @Override // defpackage.z61
    public final wn K0(wn wnVar, BigInteger bigInteger) {
        int bitLength;
        int i;
        fq fqVar;
        int bitLength2;
        hn hnVar = wnVar.a;
        BigInteger bigInteger2 = hnVar.d;
        int i2 = 1;
        if (bigInteger2 == null) {
            bitLength = hnVar.j() + 1;
        } else {
            bitLength = bigInteger2.bitLength();
        }
        if (bigInteger.bitLength() <= bitLength) {
            if (bitLength > 257) {
                i = 6;
            } else {
                i = 5;
            }
            hn hnVar2 = wnVar.a;
            int i3 = 1 << i;
            qf0 l = hnVar2.l(wnVar, "bc_fixed_point");
            if (l != null && (l instanceof fq)) {
                fqVar = (fq) l;
            } else {
                fqVar = new fq();
            }
            wn[] wnVarArr = fqVar.b;
            if (wnVarArr == null || wnVarArr.length < i3) {
                BigInteger bigInteger3 = hnVar2.d;
                if (bigInteger3 == null) {
                    bitLength2 = hnVar2.j() + 1;
                } else {
                    bitLength2 = bigInteger3.bitLength();
                }
                int i4 = ((bitLength2 + i) - 1) / i;
                int i5 = i + 1;
                wn[] wnVarArr2 = new wn[i5];
                wnVarArr2[0] = wnVar;
                for (int i6 = 1; i6 < i; i6++) {
                    wnVarArr2[i6] = wnVarArr2[i6 - 1].v(i4);
                }
                wnVarArr2[i] = wnVarArr2[0].t(wnVarArr2[1]);
                jn jnVar = null;
                hnVar2.o(wnVarArr2, 0, i5, null);
                wn[] wnVarArr3 = new wn[i3];
                wnVarArr3[0] = wnVarArr2[0];
                int i7 = i - 1;
                while (i7 >= 0) {
                    wn wnVar2 = wnVarArr2[i7];
                    int i8 = i2 << i7;
                    for (int i9 = i8; i9 < i3; i9 += i8 << 1) {
                        wnVarArr3[i9] = wnVarArr3[i9 - i8].a(wnVar2);
                    }
                    i7--;
                    i2 = 1;
                    jnVar = null;
                }
                hnVar2.o(wnVarArr3, 0, i3, jnVar);
                fqVar.a = wnVarArr2[i];
                fqVar.b = wnVarArr3;
                fqVar.c = i;
                hnVar2.p(wnVar, "bc_fixed_point", fqVar);
            }
            wn[] wnVarArr4 = fqVar.b;
            int i10 = fqVar.c;
            int i11 = ((bitLength + i10) - 1) / i10;
            wn k = hnVar.k();
            int i12 = (i10 * i11) - 1;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = 0;
                for (int i15 = i12 - i13; i15 >= 0; i15 -= i11) {
                    i14 <<= 1;
                    if (bigInteger.testBit(i15)) {
                        i14 |= 1;
                    }
                }
                k = k.x(wnVarArr4[i14]);
            }
            return k.a(fqVar.a);
        }
        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
    }
}