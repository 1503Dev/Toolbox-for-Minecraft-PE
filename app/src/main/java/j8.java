package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;

/* renamed from: j8  reason: default package */
public final class j8 implements PrivateKey, Key {
    public final o P;
    public final en0 Q;

    public j8(bg0 bg0Var) {
        dn0 dn0Var;
        g gVar = bg0Var.Q.Q;
        if (gVar instanceof dn0) {
            dn0Var = (dn0) gVar;
        } else if (gVar != null) {
            dn0Var = new dn0(u.w(gVar));
        } else {
            dn0Var = null;
        }
        this.P = dn0Var.Q.P;
        this.Q = new en0(p.w(bg0Var.q()).x());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj;
        if (this.P.equals(j8Var.P) && j7.a(j7.c(this.Q.U), j7.c(j8Var.Q.U))) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return new bg0(new u3(hd0.d, new dn0(new u3(this.P))), new ii(j7.c(this.Q.U))).n();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (j7.h(j7.c(this.Q.U)) * 37) + this.P.hashCode();
    }
}