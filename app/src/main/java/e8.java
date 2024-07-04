package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;

/* renamed from: e8  reason: default package */
public final class e8 implements Key, PrivateKey {
    public final on P;

    public e8(bg0 bg0Var) {
        byte[] x = p.w(bg0Var.q()).x();
        int length = x.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i != length; i++) {
            int i2 = i * 2;
            sArr[i] = (short) (((x[i2 + 1] & 255) << 8) | (x[i2] & 255));
        }
        this.P = new on(sArr);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e8)) {
            return false;
        }
        short[] d = j7.d((short[]) this.P.U);
        short[] d2 = j7.d((short[]) ((e8) obj).P.U);
        if (d != d2) {
            if (d == null || d2 == null || d.length != d2.length) {
                return false;
            }
            for (int i = 0; i != d.length; i++) {
                if (d[i] != d2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            u3 u3Var = new u3(hd0.e);
            short[] d = j7.d((short[]) this.P.U);
            byte[] bArr = new byte[d.length * 2];
            for (int i = 0; i != d.length; i++) {
                short s = d[i];
                int i2 = i * 2;
                bArr[i2] = (byte) s;
                bArr[i2 + 1] = (byte) (s >>> 8);
            }
            return new bg0(u3Var, new ii(bArr)).n();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return j7.k(j7.d((short[]) this.P.U));
    }
}