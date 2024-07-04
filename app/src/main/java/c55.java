package defpackage;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: c55  reason: default package */
public final class c55 implements yz4 {
    public static final byte[] e = new byte[0];
    public final ra5 a;
    public final d55 b;
    public final z45 c;
    public final bm1 d;

    public c55(ra5 ra5Var, d55 d55Var, bm1 bm1Var, z45 z45Var) {
        this.a = ra5Var;
        this.b = d55Var;
        this.d = bm1Var;
        this.c = z45Var;
    }

    @Override // defpackage.yz4
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] D;
        if (bArr2 == null) {
            bArr3 = new byte[0];
        } else {
            bArr3 = bArr2;
        }
        ra5 ra5Var = this.a;
        d55 d55Var = this.b;
        bm1 bm1Var = this.d;
        z45 z45Var = this.c;
        na3 a = d55Var.a(ra5Var.C().g());
        switch (a.P) {
            case 3:
                bArr4 = (byte[]) a.R;
                break;
            default:
                byte[] bArr6 = ((sc5) a.Q).a;
                int length = bArr6.length;
                byte[] bArr7 = new byte[length];
                System.arraycopy(bArr6, 0, bArr7, 0, length);
                bArr4 = bArr7;
                break;
        }
        switch (a.P) {
            case 3:
                bArr5 = (byte[]) a.Q;
                break;
            default:
                byte[] bArr8 = ((sc5) a.R).a;
                int length2 = bArr8.length;
                byte[] bArr9 = new byte[length2];
                System.arraycopy(bArr8, 0, bArr9, 0, length2);
                bArr5 = bArr9;
                break;
        }
        byte[] C = mh.C(j55.n, d55Var.c(), bm1Var.a(), z45Var.c());
        byte[] bArr10 = j55.l;
        byte[] bArr11 = a55.d;
        byte[] bArr12 = j55.o;
        Charset charset = y65.a;
        byte[] C2 = mh.C(j55.a, bm1Var.c(mh.C(bArr12, C, "psk_id_hash".getBytes(charset), bArr11), bArr10), bm1Var.c(mh.C(bArr12, C, "info_hash".getBytes(charset), bArr3), bArr10));
        byte[] c = bm1Var.c(mh.C(bArr12, C, "secret".getBytes(charset), bArr11), bArr5);
        int a2 = z45Var.a();
        byte[] b = bm1Var.b(a2, c, j55.c("key", C2, C, a2));
        byte[] b2 = bm1Var.b(12, c, j55.c("base_nonce", C2, C, 12));
        BigInteger bigInteger = BigInteger.ONE;
        a55 a55Var = new a55(bArr4, b, b2, bigInteger.shiftLeft(96).subtract(bigInteger), z45Var);
        byte[] bArr13 = e;
        synchronized (a55Var) {
            BigInteger bigInteger2 = a55Var.c;
            if (bigInteger2.signum() != -1) {
                byte[] byteArray = bigInteger2.toByteArray();
                int length3 = byteArray.length;
                if (length3 != 12) {
                    if (length3 <= 13) {
                        if (length3 == 13) {
                            if (byteArray[0] == 0) {
                                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                            } else {
                                throw new GeneralSecurityException("integer too large");
                            }
                        } else {
                            byte[] bArr14 = new byte[12];
                            System.arraycopy(byteArray, 0, bArr14, 12 - length3, length3);
                            byteArray = bArr14;
                        }
                    } else {
                        throw new GeneralSecurityException("integer too large");
                    }
                }
                D = mh.D(b2, byteArray);
                if (a55Var.c.compareTo(a55Var.b) < 0) {
                    a55Var.c = a55Var.c.add(bigInteger);
                } else {
                    throw new GeneralSecurityException("message limit reached");
                }
            } else {
                throw new IllegalArgumentException("integer must be nonnegative");
            }
        }
        return mh.C(bArr4, a55Var.a.b(b, D, bArr, bArr13));
    }
}