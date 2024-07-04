package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.HashMap;
import java.util.Hashtable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: h50  reason: default package */
public class h50 implements wg3, o55 {
    public static final int[] P = {-21389, -2, -1, -1, -1};
    public static final int[] Q = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};
    public static final int[] R = {-457489321, -42779, -2, -1, -1, 42777, 2};
    public static final /* synthetic */ h50 S = new h50();
    public static final tj3 T = new tj3(0);
    public static final iz3 U = new iz3();
    public static final /* synthetic */ h50 V = new h50();

    public static String a(wn wnVar, un unVar) {
        hn hnVar = unVar.a;
        wn wnVar2 = unVar.c;
        byte[] g = wnVar.g();
        int i = 0;
        if (hnVar != null) {
            byte[] e = hnVar.b.e();
            byte[] e2 = hnVar.c.e();
            byte[] g2 = wnVar2.g();
            int length = g.length + e.length + e2.length + g2.length;
            byte[] bArr = new byte[length];
            System.arraycopy(g, 0, bArr, 0, g.length);
            System.arraycopy(e, 0, bArr, g.length, e.length);
            System.arraycopy(e2, 0, bArr, g.length + e.length, e2.length);
            System.arraycopy(g2, 0, bArr, g.length + e.length + e2.length, g2.length);
            ym0 ym0Var = new ym0();
            ym0Var.update(bArr, 0, length);
            int i2 = ym0Var.e0;
            byte[] bArr2 = new byte[i2];
            ym0Var.d(bArr2);
            StringBuffer stringBuffer = new StringBuffer();
            while (i != i2) {
                if (i > 0) {
                    stringBuffer.append(":");
                }
                char[] cArr = gw.R;
                stringBuffer.append(cArr[(bArr2[i] >>> 4) & 15]);
                stringBuffer.append(cArr[bArr2[i] & 15]);
                i++;
            }
            return stringBuffer.toString();
        }
        ym0 ym0Var2 = new ym0();
        ym0Var2.update(g, 0, g.length);
        int i3 = ym0Var2.e0;
        byte[] bArr3 = new byte[i3];
        ym0Var2.d(bArr3);
        StringBuffer stringBuffer2 = new StringBuffer();
        while (i != i3) {
            if (i > 0) {
                stringBuffer2.append(":");
            }
            char[] cArr2 = gw.R;
            stringBuffer2.append(cArr2[(bArr3[i] >>> 4) & 15]);
            stringBuffer2.append(cArr2[bArr3[i] & 15]);
            i++;
        }
        return stringBuffer2.toString();
    }

    public static o7 b(PrivateKey privateKey) {
        n7 n7Var;
        PrivateKey b;
        if (privateKey instanceof xn) {
            xn xnVar = (xn) privateKey;
            un a = xnVar.a();
            if (a == null) {
                a = ua.P.a();
            }
            return new zn(xnVar.x(), new in(a.a, a.c, a.d, a.e, a.b));
        } else if (privateKey instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
            un e = en.e(eCPrivateKey.getParams());
            return new zn(eCPrivateKey.getS(), new in(e.a, e.c, e.d, e.e, e.b));
        } else {
            try {
                byte[] encoded = privateKey.getEncoded();
                if (encoded != null) {
                    bg0 p = bg0.p(encoded);
                    va vaVar = ua.P;
                    o oVar = p.Q.P;
                    HashMap hashMap = ua.Q;
                    synchronized (hashMap) {
                        n7Var = (n7) hashMap.get(oVar);
                    }
                    if (n7Var == null) {
                        b = null;
                    } else {
                        b = n7Var.b(p);
                    }
                    if (b instanceof ECPrivateKey) {
                        return b(b);
                    }
                    throw new InvalidKeyException("can't identify EC private key.");
                }
                throw new InvalidKeyException("no encoding for EC private key");
            } catch (Exception e2) {
                StringBuilder b2 = e5.b("cannot identify EC private key: ");
                b2.append(e2.toString());
                throw new InvalidKeyException(b2.toString());
            }
        }
    }

    public static o7 d(PublicKey publicKey) {
        n7 n7Var;
        PublicKey a;
        if (publicKey instanceof bo) {
            bo boVar = (bo) publicKey;
            un a2 = boVar.a();
            return new co(boVar.B(), new in(a2.a, a2.c, a2.d, a2.e, a2.b));
        } else if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            un e = en.e(eCPublicKey.getParams());
            return new co(en.d(eCPublicKey.getParams(), eCPublicKey.getW()), new in(e.a, e.c, e.d, e.e, e.b));
        } else {
            try {
                byte[] encoded = publicKey.getEncoded();
                if (encoded != null) {
                    nu0 p = nu0.p(encoded);
                    va vaVar = ua.P;
                    o oVar = p.P.P;
                    HashMap hashMap = ua.Q;
                    synchronized (hashMap) {
                        n7Var = (n7) hashMap.get(oVar);
                    }
                    if (n7Var == null) {
                        a = null;
                    } else {
                        a = n7Var.a(p);
                    }
                    if (a instanceof ECPublicKey) {
                        return d(a);
                    }
                    throw new InvalidKeyException("cannot identify EC public key.");
                }
                throw new InvalidKeyException("no encoding for EC public key");
            } catch (Exception e2) {
                StringBuilder b = e5.b("cannot identify EC public key: ");
                b.append(e2.toString());
                throw new InvalidKeyException(b.toString());
            }
        }
    }

    public static in f(jg0 jg0Var, un unVar) {
        if (!(unVar instanceof rn)) {
            if (unVar == null) {
                un a = ((va) jg0Var).a();
                return new in(a.a, a.c, a.d, a.e, a.b);
            }
            return new in(unVar.a, unVar.c, unVar.d, unVar.e, unVar.b);
        }
        ((rn) unVar).getClass();
        i(null);
        throw null;
    }

    public static g81 g(String str) {
        g81 g81Var;
        g81 d = kh.d(str);
        if (d == null) {
            o oVar = (o) d81.x.get(hu0.b(str));
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
                if (oVar6 == null) {
                    return null;
                }
                return ys.b(oVar6);
            }
            return g81Var;
        }
        return d;
    }

    public static g81 h(o oVar) {
        g81 b;
        h81 h81Var = (h81) kh.I.get(oVar);
        if (h81Var == null) {
            b = null;
        } else {
            b = h81Var.b();
        }
        if (b == null) {
            g81 b2 = d81.b(oVar);
            if (b2 == null) {
                b2 = rm0.d(oVar);
            }
            if (b2 == null) {
                Hashtable hashtable = y60.a;
                b2 = rm0.d(oVar);
            }
            if (b2 == null) {
                b2 = ew0.b(oVar);
            }
            if (b2 == null) {
                b2 = b.a(oVar);
            }
            if (b2 == null) {
                return ys.b(oVar);
            }
            return b2;
        }
        return b;
    }

    public static o i(String str) {
        if (str.indexOf(32) > 0) {
            str = str.substring(str.indexOf(32) + 1);
        }
        try {
            return (str.charAt(0) < '0' || str.charAt(0) > '2') ? j(str) : new o(str);
        } catch (IllegalArgumentException unused) {
            return j(str);
        }
    }

    public static o j(String str) {
        o oVar = (o) d81.x.get(hu0.b(str));
        if (oVar == null) {
            o oVar2 = (o) rm0.H.get(hu0.b(str));
            if (oVar2 == null) {
                oVar2 = (o) y60.a.get(hu0.c(str));
            }
            if (oVar2 == null) {
                oVar2 = (o) ew0.o.get(hu0.b(str));
            }
            if (oVar2 == null) {
                oVar2 = (o) kn.a.get(str);
            }
            if (oVar2 == null) {
                oVar2 = (o) b.b.get(hu0.b(str));
            }
            if (oVar2 == null) {
                return (o) ys.c.get(hu0.b(str));
            }
            return oVar2;
        }
        return oVar;
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        z61.A0(iArr, iArr2, iArr4);
        m(iArr4, iArr3);
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((z61.F0(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && z61.T(10, iArr3, Q))) && z61.n(7, R, iArr3) != 0) {
            z61.b0(10, 7, iArr3);
        }
    }

    public static void m(int[] iArr, int[] iArr2) {
        int c0;
        long j = 21389 & 4294967295L;
        long j2 = iArr[5] & 4294967295L;
        long j3 = (j * j2) + (iArr[0] & 4294967295L) + 0;
        int i = (int) j3;
        iArr2[0] = i;
        long j4 = iArr[6] & 4294967295L;
        long j5 = (j * j4) + j2 + (iArr[1] & 4294967295L) + (j3 >>> 32);
        int i2 = (int) j5;
        iArr2[1] = i2;
        long j6 = iArr[7] & 4294967295L;
        long j7 = (j * j6) + j4 + (iArr[2] & 4294967295L) + (j5 >>> 32);
        int i3 = (int) j7;
        iArr2[2] = i3;
        long j8 = iArr[8] & 4294967295L;
        long j9 = (j * j8) + j6 + (iArr[3] & 4294967295L) + (j7 >>> 32);
        int i4 = (int) j9;
        iArr2[3] = i4;
        long j10 = iArr[9] & 4294967295L;
        long j11 = (j * j10) + j8 + (iArr[4] & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = (j11 >>> 32) + j10;
        long j13 = j12 & 4294967295L;
        long j14 = (j * j13) + (i & 4294967295L) + 0;
        iArr2[0] = (int) j14;
        long j15 = j12 >>> 32;
        long j16 = (j * j15) + j13 + (i2 & 4294967295L) + (j14 >>> 32);
        iArr2[1] = (int) j16;
        long j17 = j15 + (i3 & 4294967295L) + (j16 >>> 32);
        iArr2[2] = (int) j17;
        long j18 = (j17 >>> 32) + (4294967295L & i4);
        iArr2[3] = (int) j18;
        if ((j18 >>> 32) == 0) {
            c0 = 0;
        } else {
            c0 = z61.c0(5, 4, iArr2);
        }
        if (c0 != 0 || (iArr2[4] == -1 && z61.V(iArr2, P))) {
            z61.f(5, 21389, iArr2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
        if (r15 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(int[] iArr, int i) {
        if (i != 0) {
            long j = i & 4294967295L;
            int i2 = 0;
            long j2 = ((21389 & 4294967295L) * j) + (iArr[0] & 4294967295L) + 0;
            iArr[0] = (int) j2;
            long j3 = j + (iArr[1] & 4294967295L) + (j2 >>> 32);
            iArr[1] = (int) j3;
            long j4 = (j3 >>> 32) + (4294967295L & iArr[2]);
            iArr[2] = (int) j4;
            if ((j4 >>> 32) != 0) {
                i2 = z61.c0(5, 3, iArr);
            }
        }
        if (iArr[4] != -1 || !z61.V(iArr, P)) {
            return;
        }
        z61.f(5, 21389, iArr);
    }

    public static void o(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        z61.c1(iArr, iArr3);
        m(iArr3, iArr2);
    }

    public static void p(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        z61.c1(iArr, iArr3);
        while (true) {
            m(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            }
            z61.c1(iArr2, iArr3);
        }
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (z61.k1(iArr, iArr2, iArr3) != 0) {
            z61.p1(5, 21389, iArr3);
        }
    }

    @Override // defpackage.o55
    public ja c(r65 r65Var) {
        e75 e75Var;
        f65 f65Var = g75.a;
        if (((p65) r65Var).a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                f85 z = f85.z(((p65) r65Var).c, ud5.c);
                if (z.w() == 0) {
                    d75 d75Var = new d75();
                    d75Var.a(z.B().o());
                    d75Var.b(z.A().w());
                    int i = ((p65) r65Var).e;
                    int b = cm0.b(i);
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b == 4) {
                                    e75Var = e75.c;
                                } else {
                                    int a = e1.a(i);
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a);
                                }
                            } else {
                                e75Var = e75.e;
                            }
                        } else {
                            e75Var = e75.d;
                        }
                    } else {
                        e75Var = e75.b;
                    }
                    d75Var.c = e75Var;
                    f75 c = d75Var.c();
                    z65 z65Var = new z65();
                    z65Var.a = c;
                    z65Var.b = ee4.d(z.B().g());
                    z65Var.c = ((p65) r65Var).f;
                    return z65Var.a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (IllegalArgumentException | te5 unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((uf3) obj).i();
    }
}