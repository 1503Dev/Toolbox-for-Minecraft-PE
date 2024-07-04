package defpackage;

import defpackage.hn;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: en  reason: default package */
public final class en {
    public static HashMap a = new HashMap();

    static {
        g81 g81Var;
        Enumeration elements = kh.K.elements();
        while (elements.hasMoreElements()) {
            String str = (String) elements.nextElement();
            o oVar = (o) d81.x.get(hu0.b(str));
            g81 g81Var2 = null;
            if (oVar != null) {
                g81Var = d81.b(oVar);
            } else {
                g81Var = null;
            }
            if (g81Var == null) {
                o oVar2 = (o) rm0.H.get(hu0.b(str));
                if (oVar2 == null) {
                    g81Var = null;
                } else {
                    g81Var = rm0.d(oVar2);
                }
            }
            if (g81Var == null) {
                o oVar3 = (o) y60.a.get(hu0.c(str));
                if (oVar3 != null) {
                    g81Var = rm0.d(oVar3);
                } else {
                    g81Var = null;
                }
            }
            if (g81Var == null) {
                o oVar4 = (o) ew0.o.get(hu0.b(str));
                if (oVar4 != null) {
                    g81Var = ew0.b(oVar4);
                } else {
                    g81Var = null;
                }
            }
            if (g81Var == null) {
                o oVar5 = (o) b.b.get(hu0.b(str));
                if (oVar5 == null) {
                    g81Var = null;
                } else {
                    g81Var = b.a(oVar5);
                }
            }
            if (g81Var == null) {
                o oVar6 = (o) ys.c.get(hu0.b(str));
                if (oVar6 != null) {
                    g81Var2 = ys.b(oVar6);
                }
                g81Var = g81Var2;
            }
            if (g81Var != null) {
                a.put(g81Var.Q, kh.d(str).Q);
            }
        }
        g81 d = kh.d("Curve25519");
        a.put(new hn.d(d.Q.a.c(), d.Q.b.t(), d.Q.c.t()), d.Q);
    }

    public static hn a(EllipticCurve ellipticCurve) {
        int i;
        ECField field = ellipticCurve.getField();
        BigInteger a2 = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            hn.d dVar = new hn.d(((ECFieldFp) field).getP(), a2, b);
            if (a.containsKey(dVar)) {
                return (hn) a.get(dVar);
            }
            return dVar;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] midTermsOfReductionPolynomial = eCFieldF2m.getMidTermsOfReductionPolynomial();
        int[] iArr = new int[3];
        if (midTermsOfReductionPolynomial.length == 1) {
            iArr[0] = midTermsOfReductionPolynomial[0];
        } else if (midTermsOfReductionPolynomial.length == 3) {
            int i2 = midTermsOfReductionPolynomial[0];
            int i3 = midTermsOfReductionPolynomial[1];
            if (i2 < i3 && i2 < (i = midTermsOfReductionPolynomial[2])) {
                iArr[0] = i2;
                if (i3 < i) {
                    iArr[1] = i3;
                    iArr[2] = i;
                } else {
                    iArr[1] = i;
                    iArr[2] = midTermsOfReductionPolynomial[1];
                }
            } else {
                int i4 = midTermsOfReductionPolynomial[2];
                if (i3 < i4) {
                    iArr[0] = i3;
                    int i5 = midTermsOfReductionPolynomial[0];
                    if (i5 < i4) {
                        iArr[1] = i5;
                        iArr[2] = i4;
                    } else {
                        iArr[1] = i4;
                        iArr[2] = i5;
                    }
                } else {
                    iArr[0] = i4;
                    int i6 = midTermsOfReductionPolynomial[0];
                    if (i6 < i3) {
                        iArr[1] = i6;
                        iArr[2] = midTermsOfReductionPolynomial[1];
                    } else {
                        iArr[1] = i3;
                        iArr[2] = i6;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
        }
        return new hn.c(m, iArr[0], iArr[1], iArr[2], a2, b);
    }

    public static EllipticCurve b(hn hnVar) {
        boolean z;
        int[] iArr;
        ECField eCFieldF2m;
        int[] iArr2;
        cq cqVar = hnVar.a;
        int i = 0;
        if (cqVar.b() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            eCFieldF2m = new ECFieldFp(cqVar.c());
        } else {
            ss a2 = ((ff0) cqVar).a();
            int[] iArr3 = a2.a;
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
            eCFieldF2m = new ECFieldF2m(a2.a[iArr2.length - 1], iArr4);
        }
        return new EllipticCurve(eCFieldF2m, hnVar.b.t(), hnVar.c.t(), null);
    }

    public static wn c(hn hnVar, ECPoint eCPoint) {
        return hnVar.c(eCPoint.getAffineX(), eCPoint.getAffineY(), false);
    }

    public static wn d(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return c(a(eCParameterSpec.getCurve()), eCPoint);
    }

    public static un e(ECParameterSpec eCParameterSpec) {
        hn a2 = a(eCParameterSpec.getCurve());
        return new un(a2, c(a2, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }

    public static ECParameterSpec f(EllipticCurve ellipticCurve, un unVar) {
        if (unVar instanceof rn) {
            ((rn) unVar).getClass();
            wn wnVar = unVar.c;
            wnVar.b();
            return new sn((String) null, ellipticCurve, new ECPoint(wnVar.b.t(), unVar.c.e().t()), unVar.d, unVar.e);
        }
        wn wnVar2 = unVar.c;
        wnVar2.b();
        return new ECParameterSpec(ellipticCurve, new ECPoint(wnVar2.b.t(), unVar.c.e().t()), unVar.d, unVar.e.intValue());
    }

    public static ECParameterSpec g(e81 e81Var, hn hnVar) {
        ECParameterSpec eCParameterSpec;
        String str;
        t tVar = e81Var.P;
        if (tVar instanceof o) {
            o oVar = (o) tVar;
            g81 h = h50.h(oVar);
            if (h == null) {
                Map unmodifiableMap = Collections.unmodifiableMap(ua.P.c);
                if (!unmodifiableMap.isEmpty()) {
                    h = (g81) unmodifiableMap.get(oVar);
                }
            }
            byte[] bArr = h.U;
            EllipticCurve b = b(hnVar);
            String str2 = (String) d81.z.get(oVar);
            if (str2 == null) {
                str2 = (String) rm0.J.get(oVar);
                if (str2 == null) {
                    str2 = (String) y60.b.get(oVar);
                }
                if (str2 == null) {
                    str2 = (String) ew0.q.get(oVar);
                }
                if (str2 == null) {
                    str2 = (String) kn.b.get(oVar);
                }
                if (str2 == null) {
                    str2 = (String) b.d.get(oVar);
                }
                if (str2 == null) {
                    str = (String) ys.e.get(oVar);
                    wn p = h.p();
                    p.b();
                    return new sn(str, b, new ECPoint(p.b.t(), h.p().e().t()), h.S, h.T);
                }
            }
            str = str2;
            wn p2 = h.p();
            p2.b();
            return new sn(str, b, new ECPoint(p2.b.t(), h.p().e().t()), h.S, h.T);
        } else if (tVar instanceof m) {
            return null;
        } else {
            g81 q = g81.q(tVar);
            byte[] bArr2 = q.U;
            EllipticCurve b2 = b(hnVar);
            if (q.T != null) {
                wn p3 = q.p();
                p3.b();
                eCParameterSpec = new ECParameterSpec(b2, new ECPoint(p3.b.t(), q.p().e().t()), q.S, q.T.intValue());
            } else {
                wn p4 = q.p();
                p4.b();
                eCParameterSpec = new ECParameterSpec(b2, new ECPoint(p4.b.t(), q.p().e().t()), q.S, 1);
            }
            return eCParameterSpec;
        }
    }

    public static hn h(jg0 jg0Var, e81 e81Var) {
        va vaVar = (va) jg0Var;
        Set unmodifiableSet = Collections.unmodifiableSet(vaVar.b);
        t tVar = e81Var.P;
        if (tVar instanceof o) {
            o z = o.z(tVar);
            if (!unmodifiableSet.isEmpty() && !unmodifiableSet.contains(z)) {
                throw new IllegalStateException("named curve not acceptable");
            }
            g81 h = h50.h(z);
            if (h == null) {
                h = (g81) Collections.unmodifiableMap(vaVar.c).get(z);
            }
            return h.Q;
        } else if (tVar instanceof m) {
            return vaVar.a().a;
        } else {
            if (unmodifiableSet.isEmpty()) {
                return g81.q(e81Var.P).Q;
            }
            throw new IllegalStateException("encoded parameters not acceptable");
        }
    }

    public static in i(jg0 jg0Var, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec == null) {
            un a2 = ((va) jg0Var).a();
            return new in(a2.a, a2.c, a2.d, a2.e, a2.b);
        }
        return h50.f(jg0Var, e(eCParameterSpec));
    }
}