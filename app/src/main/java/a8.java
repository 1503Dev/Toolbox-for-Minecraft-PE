package defpackage;

import java.io.IOException;
import java.security.PrivateKey;

/* renamed from: a8  reason: default package */
public final class a8 implements PrivateKey {
    public u40 P;

    public a8(u40 u40Var) {
        this.P = u40Var;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a8)) {
            return false;
        }
        a8 a8Var = (a8) obj;
        u40 u40Var = this.P;
        int i = u40Var.V;
        u40 u40Var2 = a8Var.P;
        if (i != u40Var2.V || u40Var.W != u40Var2.W || !u40Var.X.equals(u40Var2.X) || !this.P.Y.equals(a8Var.P.Y) || !this.P.Z.equals(a8Var.P.Z) || !this.P.a0.equals(a8Var.P.a0)) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            u40 u40Var = this.P;
            return new bg0(new u3(hd0.c), new t40(u40Var.V, u40Var.W, u40Var.X, u40Var.Y, u40Var.Z, s45.c(u40Var.U))).n();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        u40 u40Var = this.P;
        int hashCode = u40Var.Y.hashCode();
        int hashCode2 = this.P.Z.hashCode();
        return this.P.a0.hashCode() + ((hashCode2 + ((hashCode + (((((u40Var.W * 37) + u40Var.V) * 37) + u40Var.X.b) * 37)) * 37)) * 37);
    }
}