package defpackage;

import defpackage.b91;
import java.io.IOException;
import java.security.PublicKey;

/* renamed from: o8  reason: default package */
public final class o8 implements PublicKey {
    public final b91 P;
    public final o Q;

    public o8(nu0 nu0Var) {
        o81 o81Var;
        g gVar = nu0Var.P.Q;
        a91 a91Var = null;
        if (gVar instanceof o81) {
            o81Var = (o81) gVar;
        } else if (gVar != null) {
            o81Var = new o81(u.w(gVar));
        } else {
            o81Var = null;
        }
        o oVar = o81Var.R.P;
        this.Q = oVar;
        t q = nu0Var.q();
        if (q instanceof a91) {
            a91Var = (a91) q;
        } else if (q != null) {
            a91Var = new a91(u.w(q));
        }
        b91.a aVar = new b91.a(new x81(o81Var.Q, p5.g(oVar)));
        aVar.c = vj.j(j7.c(a91Var.P));
        aVar.b = vj.j(j7.c(a91Var.Q));
        this.P = new b91(aVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o8) {
            o8 o8Var = (o8) obj;
            return this.Q.equals(o8Var.Q) && j7.a(this.P.o(), o8Var.P.o());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return new nu0(new u3(hd0.f, new o81(this.P.U.b, new u3(this.Q))), new a91(vj.j(this.P.W), vj.j(this.P.V))).n();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (j7.h(this.P.o()) * 37) + this.Q.hashCode();
    }
}