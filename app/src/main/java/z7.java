package defpackage;

import java.io.IOException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Collections;

/* renamed from: z7  reason: default package */
public final class z7 implements ECPublicKey, bo {
    public String P;
    public transient co Q;
    public transient ECParameterSpec R;
    public transient jg0 S;

    public z7(String str, co coVar, jg0 jg0Var) {
        this.P = str;
        this.Q = coVar;
        this.R = null;
        this.S = jg0Var;
    }

    public z7(String str, co coVar, un unVar, jg0 jg0Var) {
        ECParameterSpec f;
        in inVar = (in) coVar.U;
        this.P = str;
        if (unVar == null) {
            hn hnVar = inVar.g;
            j7.c(inVar.h);
            f = b(en.b(hnVar), inVar);
        } else {
            f = en.f(en.b(unVar.a), unVar);
        }
        this.R = f;
        this.Q = coVar;
        this.S = jg0Var;
    }

    public z7(String str, ECPublicKeySpec eCPublicKeySpec, jg0 jg0Var) {
        this.P = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.R = params;
        this.Q = new co(en.d(params, eCPublicKeySpec.getW()), en.i(jg0Var, eCPublicKeySpec.getParams()));
        this.S = jg0Var;
    }

    public z7(ECPublicKey eCPublicKey, jg0 jg0Var) {
        this.P = "EC";
        this.P = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.R = params;
        this.Q = new co(en.d(params, eCPublicKey.getW()), en.i(jg0Var, eCPublicKey.getParams()));
    }

    public static ECParameterSpec b(EllipticCurve ellipticCurve, in inVar) {
        wn wnVar = inVar.i;
        wnVar.b();
        return new ECParameterSpec(ellipticCurve, new ECPoint(wnVar.b.t(), inVar.i.e().t()), inVar.j, inVar.k.intValue());
    }

    @Override // defpackage.bo
    public final wn B() {
        wn wnVar = this.Q.V;
        if (this.R == null) {
            return wnVar.n().c();
        }
        return wnVar;
    }

    @Override // defpackage.ln
    public final un a() {
        ECParameterSpec eCParameterSpec = this.R;
        if (eCParameterSpec == null) {
            return null;
        }
        return en.e(eCParameterSpec);
    }

    public final un c() {
        ECParameterSpec eCParameterSpec = this.R;
        return eCParameterSpec != null ? en.e(eCParameterSpec) : ((va) this.S).a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj;
        if (!this.Q.V.d(z7Var.Q.V) || !c().equals(z7Var.c())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.P;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return new nu0(new u3(l81.f, nu2.b(this.R)), p.w(new i81(this.Q.V).P).x()).o("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.ECKey
    public final ECParameterSpec getParams() {
        return this.R;
    }

    @Override // java.security.interfaces.ECPublicKey
    public final ECPoint getW() {
        wn wnVar = this.Q.V;
        wnVar.b();
        return new ECPoint(wnVar.b.t(), wnVar.e().t());
    }

    public final int hashCode() {
        return this.Q.V.hashCode() ^ c().hashCode();
    }

    public final String toString() {
        wn wnVar = this.Q.V;
        un c = c();
        StringBuffer stringBuffer = new StringBuffer();
        String str = hu0.a;
        stringBuffer.append("EC");
        stringBuffer.append(" Public Key [");
        stringBuffer.append(h50.a(wnVar, c));
        stringBuffer.append("]");
        stringBuffer.append(str);
        stringBuffer.append("            X: ");
        wnVar.b();
        stringBuffer.append(wnVar.b.t().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("            Y: ");
        stringBuffer.append(wnVar.e().t().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public z7(String str, co coVar, ECParameterSpec eCParameterSpec, jg0 jg0Var) {
        in inVar = (in) coVar.U;
        this.P = str;
        this.Q = coVar;
        if (eCParameterSpec == null) {
            hn hnVar = inVar.g;
            j7.c(inVar.h);
            this.R = b(en.b(hnVar), inVar);
        } else {
            this.R = eCParameterSpec;
        }
        this.S = jg0Var;
    }

    public z7(String str, Cdo cdo, jg0 jg0Var) {
        this.P = str;
        un unVar = cdo.P;
        if (unVar != null) {
            EllipticCurve b = en.b(unVar.a);
            this.Q = new co(cdo.Q, h50.f(jg0Var, cdo.P));
            this.R = en.f(b, cdo.P);
        } else {
            va vaVar = (va) jg0Var;
            hn hnVar = vaVar.a().a;
            wn wnVar = cdo.Q;
            wnVar.b();
            this.Q = new co(hnVar.c(wnVar.b.t(), cdo.Q.e().t(), false), en.i(vaVar, null));
            this.R = null;
        }
        this.S = jg0Var;
    }

    public z7(String str, nu0 nu0Var, jg0 jg0Var) {
        wn wnVar;
        in inVar;
        in inVar2;
        byte b;
        this.P = str;
        this.S = jg0Var;
        e81 p = e81.p(nu0Var.P.Q);
        hn h = en.h(this.S, p);
        this.R = en.g(p, h);
        byte[] w = nu0Var.Q.w();
        p iiVar = new ii(w);
        if (w[0] == 4 && w[1] == w.length - 2 && (((b = w[2]) == 2 || b == 3) && (h.j() + 7) / 8 >= w.length - 3)) {
            try {
                iiVar = (p) t.s(w);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        i81 i81Var = new i81(h, iiVar);
        synchronized (i81Var) {
            if (i81Var.R == null) {
                i81Var.R = i81Var.Q.f(i81Var.P.P).n();
            }
            wnVar = i81Var.R;
        }
        jg0 jg0Var2 = this.S;
        t tVar = p.P;
        if (tVar instanceof o) {
            o z = o.z(tVar);
            g81 h2 = h50.h(z);
            h2 = h2 == null ? (g81) Collections.unmodifiableMap(((va) jg0Var2).c).get(z) : h2;
            inVar2 = new tn(h2.Q, h2.p(), h2.S, h2.T, h2.U);
        } else {
            if (tVar instanceof m) {
                un a = ((va) jg0Var2).a();
                inVar = new in(a.a, a.c, a.d, a.e, a.b);
            } else {
                g81 q = g81.q(tVar);
                inVar = new in(q.Q, q.p(), q.S, q.T, q.U);
            }
            inVar2 = inVar;
        }
        this.Q = new co(wnVar, inVar2);
    }
}