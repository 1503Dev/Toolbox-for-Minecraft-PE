package defpackage;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: h8  reason: default package */
public final class h8 implements PrivateKey {
    public short[][] P;
    public short[] Q;
    public short[][] R;
    public short[] S;
    public t00[] T;
    public int[] U;

    public h8(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, t00[] t00VarArr) {
        this.P = sArr;
        this.Q = sArr2;
        this.R = sArr3;
        this.S = sArr4;
        this.U = iArr;
        this.T = t00VarArr;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (obj == null || !(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        if (ja.j(this.P, h8Var.P)) {
            z = true;
        } else {
            z = false;
        }
        if (z && ja.j(this.R, h8Var.R)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && ja.i(this.Q, h8Var.Q)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && ja.i(this.S, h8Var.S)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && Arrays.equals(this.U, h8Var.U)) {
            z5 = true;
        } else {
            z5 = false;
        }
        t00[] t00VarArr = this.T;
        if (t00VarArr.length != h8Var.T.length) {
            return false;
        }
        for (int length = t00VarArr.length - 1; length >= 0; length--) {
            z5 &= this.T[length].equals(h8Var.T[length]);
        }
        return z5;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return new bg0(new u3(hd0.a, gi.P), new nj0(this.P, this.Q, this.R, this.S, this.U, this.T)).n();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        int l = j7.l(this.P);
        int k = j7.k(this.Q);
        int l2 = j7.l(this.R);
        int i = j7.i(this.U) + ((j7.k(this.S) + ((l2 + ((k + ((l + (this.T.length * 37)) * 37)) * 37)) * 37)) * 37);
        for (int length = this.T.length - 1; length >= 0; length--) {
            i = (i * 37) + this.T[length].hashCode();
        }
        return i;
    }
}