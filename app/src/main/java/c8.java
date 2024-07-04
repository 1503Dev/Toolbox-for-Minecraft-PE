package defpackage;

import java.io.IOException;
import java.security.PrivateKey;

/* renamed from: c8  reason: default package */
public final class c8 implements uc, PrivateKey {
    public a50 P;

    public c8(a50 a50Var) {
        this.P = a50Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        a50 a50Var = this.P;
        int i = a50Var.U;
        a50 a50Var2 = c8Var.P;
        if (i != a50Var2.U || a50Var.V != a50Var2.V || !a50Var.W.equals(a50Var2.W) || !this.P.X.equals(c8Var.P.X) || !this.P.Y.equals(c8Var.P.Y) || !this.P.Z.equals(c8Var.P.Z) || !this.P.a0.equals(c8Var.P.a0)) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        a50 a50Var = this.P;
        try {
            return new bg0(new u3(hd0.b), new z40(a50Var.U, a50Var.V, a50Var.W, a50Var.X, a50Var.Z, a50Var.a0, a50Var.Y)).n();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        a50 a50Var = this.P;
        int hashCode = a50Var.X.hashCode();
        int hashCode2 = this.P.Z.hashCode();
        int hashCode3 = this.P.a0.hashCode();
        return this.P.Y.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (((((a50Var.V * 37) + a50Var.U) * 37) + a50Var.W.b) * 37)) * 37)) * 37)) * 37);
    }
}