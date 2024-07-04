package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;

/* renamed from: k8  reason: default package */
public final class k8 implements PublicKey, Key {
    public final o P;
    public final fn0 Q;

    public k8(nu0 nu0Var) {
        dn0 dn0Var;
        g gVar = nu0Var.P.Q;
        if (gVar instanceof dn0) {
            dn0Var = (dn0) gVar;
        } else if (gVar != null) {
            dn0Var = new dn0(u.w(gVar));
        } else {
            dn0Var = null;
        }
        this.P = dn0Var.Q.P;
        this.Q = new fn0(nu0Var.Q.w());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k8)) {
            return false;
        }
        k8 k8Var = (k8) obj;
        if (this.P.equals(k8Var.P) && j7.a(j7.c(this.Q.U), j7.c(k8Var.Q.U))) {
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
            return new nu0(new u3(hd0.d, new dn0(new u3(this.P))), j7.c(this.Q.U)).n();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (j7.h(j7.c(this.Q.U)) * 37) + this.P.hashCode();
    }
}