package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bc5  reason: default package */
public final class bc5 implements yz4 {
    public static final byte[] f = new byte[0];
    public final z63 a;
    public final String b;
    public final byte[] c;
    public final ac5 d;
    public final int e;

    public bc5(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, w45 w45Var) {
        m55.b(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.a = new z63(5, eCPublicKey);
        this.c = bArr;
        this.b = str;
        this.e = i;
        this.d = w45Var;
    }

    @Override // defpackage.yz4
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        kt1 kt1Var;
        byte[] b;
        z63 z63Var = this.a;
        String str = this.b;
        byte[] bArr3 = this.c;
        int i = ((w45) this.d).b;
        int i2 = this.e;
        KeyPair a = cc5.a(((ECPublicKey) z63Var.Q).getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
        byte[] c = cc5.c((ECPrivateKey) a.getPrivate(), (ECPublicKey) z63Var.Q);
        byte[] g = cc5.g(eCPublicKey.getParams().getCurve(), i2, eCPublicKey.getW());
        int i3 = 1;
        byte[] C = mh.C(g, c);
        Mac mac = (Mac) gc5.c.a(str);
        if (i <= mac.getMacLength() * 255) {
            if (bArr3 != null && bArr3.length != 0) {
                mac.init(new SecretKeySpec(bArr3, str));
            } else {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            }
            byte[] bArr4 = new byte[i];
            mac.init(new SecretKeySpec(mac.doFinal(C), str));
            byte[] bArr5 = new byte[0];
            int i4 = 0;
            while (true) {
                mac.update(bArr5);
                mac.update(bArr2);
                mac.update((byte) i3);
                bArr5 = mac.doFinal();
                int length = bArr5.length;
                int i5 = i4 + length;
                if (i5 >= i) {
                    break;
                }
                System.arraycopy(bArr5, 0, bArr4, i4, length);
                i3++;
                i4 = i5;
            }
            System.arraycopy(bArr5, 0, bArr4, i4, i - i4);
            sc5 a2 = sc5.a(g);
            sc5 a3 = sc5.a(bArr4);
            ac5 ac5Var = this.d;
            byte[] bArr6 = a3.a;
            int length2 = bArr6.length;
            byte[] bArr7 = new byte[length2];
            System.arraycopy(bArr6, 0, bArr7, 0, length2);
            w45 w45Var = (w45) ac5Var;
            w45Var.getClass();
            if (length2 == w45Var.b) {
                if (w45Var.a.equals(z05.b)) {
                    b95 x = c95.x();
                    x.e(w45Var.c);
                    ed5 G = gd5.G(bArr7, 0, w45Var.b);
                    x.j();
                    ((c95) x.Q).zze = G;
                    kt1Var = new kt1((uz4) x05.d(w45Var.a, (c95) x.h(), uz4.class));
                } else if (w45Var.a.equals(z05.a)) {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr7, 0, w45Var.e);
                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr7, w45Var.e, w45Var.b);
                    p85 x2 = q85.x();
                    x2.e(w45Var.d.A());
                    ed5 ed5Var = gd5.Q;
                    ed5 G2 = gd5.G(copyOfRange, 0, copyOfRange.length);
                    x2.j();
                    ((q85) x2.Q).zzf = G2;
                    da5 x3 = ea5.x();
                    x3.e(w45Var.d.B());
                    ed5 G3 = gd5.G(copyOfRange2, 0, copyOfRange2.length);
                    x3.j();
                    ((ea5) x3.Q).zzf = G3;
                    k85 x4 = l85.x();
                    int w = w45Var.d.w();
                    x4.j();
                    ((l85) x4.Q).zzd = w;
                    x4.j();
                    ((l85) x4.Q).zze = (q85) x2.h();
                    x4.j();
                    l85.F((l85) x4.Q, (ea5) x3.h());
                    kt1Var = new kt1((uz4) x05.d(w45Var.a, (l85) x4.h(), uz4.class));
                } else if (w45Var.a.equals(h45.a)) {
                    k95 x5 = l95.x();
                    x5.e(w45Var.f);
                    ed5 G4 = gd5.G(bArr7, 0, w45Var.b);
                    x5.j();
                    ((l95) x5.Q).zze = G4;
                    kt1Var = new kt1((wz4) x05.d(w45Var.a, (l95) x5.h(), wz4.class));
                } else {
                    throw new GeneralSecurityException("unknown DEM key type");
                }
                byte[] bArr8 = f;
                uz4 uz4Var = (uz4) kt1Var.a;
                if (uz4Var != null) {
                    b = uz4Var.a(bArr, bArr8);
                } else {
                    b = ((wz4) kt1Var.b).b(bArr, bArr8);
                }
                byte[] bArr9 = a2.a;
                int length3 = bArr9.length;
                byte[] bArr10 = new byte[length3];
                System.arraycopy(bArr9, 0, bArr10, 0, length3);
                return ByteBuffer.allocate(length3 + b.length).put(bArr10).put(b).array();
            }
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        throw new GeneralSecurityException("size too large");
    }
}