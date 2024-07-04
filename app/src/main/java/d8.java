package defpackage;

import java.io.IOException;
import java.security.PublicKey;

/* renamed from: d8  reason: default package */
public final class d8 implements PublicKey {
    public c50 P;

    public d8(c50 c50Var) {
        this.P = c50Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d8)) {
            return false;
        }
        c50 c50Var = this.P;
        int i = c50Var.U;
        c50 c50Var2 = ((d8) obj).P;
        if (i != c50Var2.U || c50Var.V != c50Var2.V || !c50Var.W.equals(c50Var2.W)) {
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
        c50 c50Var = this.P;
        try {
            return new nu0(new u3(hd0.b), new b50(c50Var.U, c50Var.V, c50Var.W)).n();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        c50 c50Var = this.P;
        int i = c50Var.U;
        return c50Var.W.hashCode() + (((c50Var.V * 37) + i) * 37);
    }

    public final String toString() {
        StringBuilder c = yg.c("McEliecePublicKey:\n", " length of the code         : ");
        c.append(this.P.U);
        c.append("\n");
        StringBuilder c2 = yg.c(c.toString(), " error correction capability: ");
        c2.append(this.P.V);
        c2.append("\n");
        StringBuilder c3 = yg.c(c2.toString(), " generator matrix           : ");
        c3.append(this.P.W);
        return c3.toString();
    }
}