package defpackage;

import defpackage.u81;
import java.io.IOException;
import java.security.PublicKey;

/* renamed from: m8  reason: default package */
public final class m8 implements PublicKey {
    public final o P;
    public final u81 Q;

    public m8(nu0 nu0Var) {
        q81 q81Var;
        g gVar = nu0Var.P.Q;
        a91 a91Var = null;
        if (gVar instanceof q81) {
            q81Var = (q81) gVar;
        } else if (gVar != null) {
            q81Var = new q81(u.w(gVar));
        } else {
            q81Var = null;
        }
        o oVar = q81Var.S.P;
        this.P = oVar;
        t q = nu0Var.q();
        if (q instanceof a91) {
            a91Var = (a91) q;
        } else if (q != null) {
            a91Var = new a91(u.w(q));
        }
        u81.a aVar = new u81.a(new r81(q81Var.Q, q81Var.R, p5.g(oVar)));
        aVar.c = vj.j(j7.c(a91Var.P));
        aVar.b = vj.j(j7.c(a91Var.Q));
        this.Q = new u81(aVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m8) {
            m8 m8Var = (m8) obj;
            return this.P.equals(m8Var.P) && j7.a(this.Q.o(), m8Var.Q.o());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            o oVar = hd0.g;
            r81 r81Var = this.Q.U;
            return new nu0(new u3(oVar, new q81(r81Var.b, r81Var.c, new u3(this.P))), new a91(vj.j(this.Q.W), vj.j(this.Q.V))).n();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (j7.h(this.Q.o()) * 37) + this.P.hashCode();
    }
}