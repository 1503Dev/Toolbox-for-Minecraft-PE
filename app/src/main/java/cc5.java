package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* renamed from: cc5  reason: default package */
public final class cc5 {
    public static KeyPair a(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) gc5.e.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static void b(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            ECParameterSpec params = eCPublicKey.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            ECParameterSpec eCParameterSpec = m55.a;
            if (params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor()) {
                return;
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static byte[] c(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        b(eCPrivateKey, eCPublicKey);
        ECPoint w = eCPublicKey.getW();
        m55.b(w, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) gc5.f.a("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) gc5.d.a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(m55.a(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            BigInteger a = m55.a(curve);
            BigInteger mod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(a);
            if (a.signum() == 1) {
                BigInteger mod2 = mod.mod(a);
                BigInteger bigInteger2 = BigInteger.ZERO;
                if (!mod2.equals(bigInteger2)) {
                    if (a.testBit(0) && a.testBit(1)) {
                        bigInteger2 = mod2.modPow(a.add(BigInteger.ONE).shiftRight(2), a);
                    } else if (a.testBit(0) && !a.testBit(1)) {
                        bigInteger2 = BigInteger.ONE;
                        BigInteger shiftRight = a.subtract(bigInteger2).shiftRight(1);
                        int i = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(a);
                            if (mod3.equals(BigInteger.ZERO)) {
                                break;
                            }
                            BigInteger modPow = mod3.modPow(shiftRight, a);
                            BigInteger bigInteger3 = BigInteger.ONE;
                            if (modPow.add(bigInteger3).equals(a)) {
                                BigInteger shiftRight2 = a.add(bigInteger3).shiftRight(1);
                                BigInteger bigInteger4 = bigInteger2;
                                for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                    BigInteger multiply = bigInteger4.multiply(bigInteger3);
                                    bigInteger4 = bigInteger4.multiply(bigInteger4).add(bigInteger3.multiply(bigInteger3).mod(a).multiply(mod3)).mod(a);
                                    bigInteger3 = multiply.add(multiply).mod(a);
                                    if (shiftRight2.testBit(bitLength)) {
                                        BigInteger mod4 = bigInteger4.multiply(bigInteger2).add(bigInteger3.multiply(mod3)).mod(a);
                                        bigInteger3 = bigInteger2.multiply(bigInteger3).add(bigInteger4).mod(a);
                                        bigInteger4 = mod4;
                                    }
                                }
                                bigInteger2 = bigInteger4;
                            } else if (!modPow.equals(bigInteger3)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            } else {
                                bigInteger2 = bigInteger2.add(bigInteger3);
                                i++;
                                if (i == 128 && !a.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            }
                        }
                    } else {
                        bigInteger2 = null;
                    }
                    if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(a).compareTo(mod2) != 0) {
                        throw new GeneralSecurityException("Could not find a modular square root");
                    }
                }
                if (!bigInteger2.testBit(0)) {
                    a.subtract(bigInteger2).mod(a);
                }
                return generateSecret;
            }
            throw new InvalidAlgorithmParameterException("p must be positive");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static ECPrivateKey d(byte[] bArr, int i) {
        return (ECPrivateKey) ((KeyFactory) gc5.f.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), f(i)));
    }

    public static ECPublicKey e(ECParameterSpec eCParameterSpec, byte[] bArr) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        int bitLength = (m55.a(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        int length = bArr.length;
        if (length == bitLength + bitLength + 1) {
            if (bArr[0] == 4) {
                int i = bitLength + 1;
                ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, length)));
                m55.b(eCPoint, curve);
                return (ECPublicKey) ((KeyFactory) gc5.f.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
            }
            throw new GeneralSecurityException("invalid point format");
        }
        throw new GeneralSecurityException("invalid point size");
    }

    public static ECParameterSpec f(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? m55.c : m55.b : m55.a;
    }

    public static byte[] g(EllipticCurve ellipticCurve, int i, ECPoint eCPoint) {
        m55.b(eCPoint, ellipticCurve);
        int bitLength = (m55.a(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 2;
            if (i2 != 2) {
                int i3 = bitLength + 1;
                byte[] bArr = new byte[i3];
                byte[] o = eg4.o(eCPoint.getAffineX());
                int length = o.length;
                System.arraycopy(o, 0, bArr, i3 - length, length);
                if (true == eCPoint.getAffineY().testBit(0)) {
                    b = 3;
                }
                bArr[0] = b;
                return bArr;
            }
            int i4 = bitLength + bitLength;
            byte[] bArr2 = new byte[i4];
            byte[] o2 = eg4.o(eCPoint.getAffineX());
            int length2 = o2.length;
            if (length2 > bitLength) {
                o2 = Arrays.copyOfRange(o2, length2 - bitLength, length2);
            }
            byte[] o3 = eg4.o(eCPoint.getAffineY());
            int length3 = o3.length;
            if (length3 > bitLength) {
                o3 = Arrays.copyOfRange(o3, length3 - bitLength, length3);
            }
            int length4 = o3.length;
            System.arraycopy(o3, 0, bArr2, i4 - length4, length4);
            int length5 = o2.length;
            System.arraycopy(o2, 0, bArr2, bitLength - length5, length5);
            return bArr2;
        }
        int i5 = bitLength + bitLength + 1;
        byte[] bArr3 = new byte[i5];
        byte[] o4 = eg4.o(eCPoint.getAffineX());
        byte[] o5 = eg4.o(eCPoint.getAffineY());
        int length6 = o5.length;
        System.arraycopy(o5, 0, bArr3, i5 - length6, length6);
        int length7 = o4.length;
        System.arraycopy(o4, 0, bArr3, (bitLength + 1) - length7, length7);
        bArr3[0] = 4;
        return bArr3;
    }
}