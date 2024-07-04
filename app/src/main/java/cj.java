package defpackage;

import defpackage.hn;
import java.math.BigInteger;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi;

/* renamed from: cj  reason: default package */
public abstract class cj extends SignatureSpi implements fd0 {
    public tl digest;
    public dj encoder;
    public bj signer;

    public cj(tl tlVar, bj bjVar, dj djVar) {
        this.digest = tlVar;
        this.signer = bjVar;
        this.encoder = djVar;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() {
        byte[] bArr = new byte[this.digest.c()];
        this.digest.d(bArr);
        try {
            BigInteger[] a = ((a43) this.signer).a(bArr);
            dj djVar = this.encoder;
            BigInteger bigInteger = a[0];
            BigInteger bigInteger2 = a[1];
            ((SignatureSpi.a) djVar).getClass();
            s82 s82Var = new s82(12);
            s82Var.g(new l(bigInteger));
            s82Var.g(new l(bigInteger2));
            return new mi(s82Var).o("DER");
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) {
        this.digest.f(b);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01b1  */
    @Override // java.security.SignatureSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean engineVerify(byte[] bArr) {
        wn a;
        boolean z;
        boolean z2;
        BigInteger bigInteger;
        jn i;
        int c = this.digest.c();
        byte[] bArr2 = new byte[c];
        this.digest.d(bArr2);
        try {
            BigInteger[] a2 = ((SignatureSpi.a) this.encoder).a(bArr);
            bj bjVar = this.signer;
            BigInteger bigInteger2 = a2[0];
            BigInteger bigInteger3 = a2[1];
            a43 a43Var = (a43) bjVar;
            in inVar = (in) ((on) a43Var.h).U;
            BigInteger bigInteger4 = inVar.j;
            int bitLength = bigInteger4.bitLength();
            int i2 = c * 8;
            BigInteger bigInteger5 = new BigInteger(1, bArr2);
            if (bitLength < i2) {
                bigInteger5 = bigInteger5.shiftRight(i2 - bitLength);
            }
            BigInteger bigInteger6 = gn.b;
            if (bigInteger2.compareTo(bigInteger6) >= 0 && bigInteger2.compareTo(bigInteger4) < 0 && bigInteger3.compareTo(bigInteger6) >= 0 && bigInteger3.compareTo(bigInteger4) < 0) {
                BigInteger modInverse = bigInteger3.modInverse(bigInteger4);
                BigInteger mod = bigInteger5.multiply(modInverse).mod(bigInteger4);
                BigInteger mod2 = bigInteger2.multiply(modInverse).mod(bigInteger4);
                wn wnVar = inVar.i;
                wn wnVar2 = ((co) ((on) a43Var.h)).V;
                hn hnVar = wnVar.a;
                if (hnVar.h(wnVar2.a)) {
                    wn m = hnVar.m(wnVar2);
                    if ((hnVar instanceof hn.a) && ((hn.a) hnVar).r()) {
                        a = wnVar.l(mod).a(m.l(mod2));
                    } else {
                        us usVar = hnVar.g;
                        if (usVar instanceof us) {
                            wn[] wnVarArr = {wnVar, m};
                            BigInteger[] bigIntegerArr = {mod, mod2};
                            BigInteger bigInteger7 = wnVarArr[0].a.d;
                            BigInteger[] bigIntegerArr2 = new BigInteger[4];
                            int i3 = 0;
                            for (int i4 = 0; i4 < 2; i4++) {
                                BigInteger[] c2 = usVar.c(bigIntegerArr[i4].mod(bigInteger7));
                                int i5 = i3 + 1;
                                bigIntegerArr2[i3] = c2[0];
                                i3 = i5 + 1;
                                bigIntegerArr2[i5] = c2[1];
                            }
                            nj2 a3 = usVar.a();
                            usVar.b();
                            boolean[] zArr = new boolean[4];
                            t51[] t51VarArr = new t51[4];
                            byte[][] bArr3 = new byte[4];
                            int i6 = 0;
                            for (int i7 = 2; i6 < i7; i7 = 2) {
                                int i8 = i6 << 1;
                                int i9 = i8 + 1;
                                BigInteger bigInteger8 = bigIntegerArr2[i8];
                                if (bigInteger8.signum() < 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                zArr[i8] = z;
                                BigInteger abs = bigInteger8.abs();
                                BigInteger bigInteger9 = bigIntegerArr2[i9];
                                if (bigInteger9.signum() < 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zArr[i9] = z2;
                                BigInteger abs2 = bigInteger9.abs();
                                int max = Math.max(2, Math.min(16, z61.S(Math.max(abs.bitLength(), abs2.bitLength()))));
                                wn wnVar3 = wnVarArr[i6];
                                wn y0 = z61.y0(wnVar3, max, a3);
                                t51VarArr[i8] = z61.R(wnVar3);
                                t51VarArr[i9] = z61.R(y0);
                                bArr3[i8] = z61.P(max, abs);
                                bArr3[i9] = z61.P(max, abs2);
                                i6++;
                            }
                            a = fn.c(zArr, t51VarArr, bArr3);
                        } else {
                            a = fn.a(wnVar, mod, m, mod2);
                        }
                    }
                    if (a.k()) {
                        if (!a.j()) {
                            hn hnVar2 = a.a;
                            if (hnVar2 != null && (bigInteger = hnVar2.e) != null && bigInteger.compareTo(gn.f) <= 0) {
                                int i10 = hnVar2.f;
                                if (i10 != 1) {
                                    if (i10 != 2 && i10 != 3 && i10 != 4) {
                                        if (i10 != 6 && i10 != 7) {
                                            i = null;
                                        }
                                    } else {
                                        i = a.i().o();
                                    }
                                    if (i != null && !i.i()) {
                                        jn jnVar = a.b;
                                        while (hnVar2.n(bigInteger2)) {
                                            if (hnVar2.i(bigInteger2).j(i).equals(jnVar)) {
                                                return true;
                                            }
                                            bigInteger2 = bigInteger2.add(bigInteger4);
                                        }
                                    }
                                }
                                i = a.i();
                                if (i != null) {
                                    jn jnVar2 = a.b;
                                    while (hnVar2.n(bigInteger2)) {
                                    }
                                }
                            }
                            wn n = a.n();
                            n.b();
                            return n.b.t().mod(bigInteger4).equals(bigInteger2);
                        }
                    } else {
                        throw new IllegalArgumentException("Invalid point");
                    }
                } else {
                    throw new IllegalArgumentException("Point must be on the same curve");
                }
            }
            return false;
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}