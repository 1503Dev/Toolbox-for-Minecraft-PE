package org.spongycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;

public class SignatureSpi extends cj {

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements dj {
        public final BigInteger[] a(byte[] bArr) {
            u uVar = (u) t.s(bArr);
            if (uVar.size() == 2) {
                if (j7.a(bArr, uVar.o("DER"))) {
                    return new BigInteger[]{l.w(uVar.x(0)).x(), l.w(uVar.x(1)).x()};
                }
                throw new IOException("malformed signature");
            }
            throw new IOException("malformed signature");
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class ecDSAnone extends SignatureSpi {
        public ecDSAnone() {
            super(new vi2(), new a43(), new a());
        }
    }

    public SignatureSpi(tl tlVar, bj bjVar, dj djVar) {
        super(tlVar, bjVar, djVar);
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) {
        o7 b = h50.b(privateKey);
        this.digest.reset();
        SecureRandom secureRandom = ((java.security.SignatureSpi) this).appRandom;
        if (secureRandom == null) {
            ((a43) this.signer).b(true, b);
            return;
        }
        ((a43) this.signer).b(true, new td0(b, secureRandom));
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) {
        uc d;
        if (publicKey instanceof z7) {
            d = ((z7) publicKey).Q;
        } else {
            d = h50.d(publicKey);
        }
        this.digest.reset();
        ((a43) this.signer).b(false, d);
    }
}