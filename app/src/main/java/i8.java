package defpackage;

import java.security.PublicKey;

/* renamed from: i8  reason: default package */
public final class i8 implements PublicKey {
    public short[][] P;
    public short[][] Q;
    public short[] R;
    public int S;

    public i8(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.S = i;
        this.P = sArr;
        this.Q = sArr2;
        this.R = sArr3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        if (this.S != i8Var.S || !ja.j(this.P, i8Var.P)) {
            return false;
        }
        short[][] sArr = this.Q;
        short[][] sArr2 = new short[i8Var.Q.length];
        int i = 0;
        while (true) {
            short[][] sArr3 = i8Var.Q;
            if (i == sArr3.length) {
                break;
            }
            sArr2[i] = j7.d(sArr3[i]);
            i++;
        }
        if (!ja.j(sArr, sArr2) || !ja.i(this.R, j7.d(i8Var.R))) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return new nu0(new u3(hd0.a, gi.P), new pj0(this.S, this.P, this.Q, this.R)).o("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        int l = j7.l(this.P);
        int l2 = j7.l(this.Q);
        return j7.k(this.R) + ((l2 + ((l + (this.S * 37)) * 37)) * 37);
    }
}