package defpackage;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* renamed from: sn  reason: default package */
public final class sn extends ECParameterSpec {
    public String a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sn(String str, hn hnVar, wn wnVar, BigInteger bigInteger, BigInteger bigInteger2) {
        super(r2, new ECPoint(r9.b.t(), r9.e().t()), bigInteger, bigInteger2.intValue());
        int[] iArr;
        ECField eCFieldF2m;
        int[] iArr2;
        cq cqVar = hnVar.a;
        int i = 0;
        if (cqVar.b() == 1) {
            eCFieldF2m = new ECFieldFp(cqVar.c());
        } else {
            ss a = ((ff0) cqVar).a();
            int[] iArr3 = a.a;
            if (iArr3 == null) {
                iArr = null;
            } else {
                iArr = new int[iArr3.length];
                System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
            }
            int[] f = j7.f(iArr.length - 1, iArr);
            int length = f.length;
            int[] iArr4 = new int[length];
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                iArr4[length] = f[i];
                i++;
            }
            eCFieldF2m = new ECFieldF2m(a.a[iArr2.length - 1], iArr4);
        }
        EllipticCurve ellipticCurve = new EllipticCurve(eCFieldF2m, hnVar.b.t(), hnVar.c.t(), null);
        wn n = wnVar.n();
        n.b();
        this.a = str;
    }

    public sn(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.a = str;
    }
}