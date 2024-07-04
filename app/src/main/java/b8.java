package defpackage;

import java.io.IOException;
import java.security.PublicKey;

/* renamed from: b8  reason: default package */
public final class b8 implements uc, PublicKey {
    public w40 P;

    public b8(w40 w40Var) {
        this.P = w40Var;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b8)) {
            return false;
        }
        w40 w40Var = this.P;
        int i = w40Var.V;
        w40 w40Var2 = ((b8) obj).P;
        if (i != w40Var2.V || w40Var.W != w40Var2.W || !w40Var.X.equals(w40Var2.X)) {
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
        w40 w40Var = this.P;
        try {
            return new nu0(new u3(hd0.c), new v40(w40Var.V, w40Var.W, w40Var.X, s45.c(w40Var.U))).n();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        w40 w40Var = this.P;
        int i = w40Var.V;
        return w40Var.X.hashCode() + (((w40Var.W * 37) + i) * 37);
    }

    public final String toString() {
        StringBuilder c = yg.c("McEliecePublicKey:\n", " length of the code         : ");
        c.append(this.P.V);
        c.append("\n");
        StringBuilder c2 = yg.c(c.toString(), " error correction capability: ");
        c2.append(this.P.W);
        c2.append("\n");
        StringBuilder c3 = yg.c(c2.toString(), " generator matrix           : ");
        c3.append(this.P.X.toString());
        return c3.toString();
    }
}