package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: y7  reason: default package */
public final class y7 implements ECPrivateKey, xn {
    public String P;
    public transient BigInteger Q;
    public transient ECParameterSpec R;
    public transient jg0 S;
    public transient zh T;

    public y7() {
        this.P = "EC";
        new Hashtable();
        new Vector();
    }

    public y7(String str, ECPrivateKeySpec eCPrivateKeySpec, jg0 jg0Var) {
        this.P = "EC";
        new Hashtable();
        new Vector();
        this.P = str;
        this.Q = eCPrivateKeySpec.getS();
        this.R = eCPrivateKeySpec.getParams();
        this.S = jg0Var;
    }

    public y7(String str, zn znVar, z7 z7Var, un unVar, jg0 jg0Var) {
        zh zhVar;
        this.P = "EC";
        new Hashtable();
        new Vector();
        in inVar = (in) znVar.U;
        this.P = str;
        this.Q = znVar.V;
        this.S = jg0Var;
        if (unVar == null) {
            hn hnVar = inVar.g;
            j7.c(inVar.h);
            EllipticCurve b = en.b(hnVar);
            wn wnVar = inVar.i;
            wnVar.b();
            this.R = new ECParameterSpec(b, new ECPoint(wnVar.b.t(), inVar.i.e().t()), inVar.j, inVar.k.intValue());
        } else {
            this.R = en.f(en.b(unVar.a), unVar);
        }
        try {
            try {
                zhVar = nu0.p(t.s(z7Var.getEncoded())).Q;
            } catch (IOException unused) {
                zhVar = null;
            }
            this.T = zhVar;
        } catch (Exception unused2) {
            this.T = null;
        }
    }

    public y7(ECPrivateKey eCPrivateKey, jg0 jg0Var) {
        this.P = "EC";
        new Hashtable();
        new Vector();
        this.Q = eCPrivateKey.getS();
        this.P = eCPrivateKey.getAlgorithm();
        this.R = eCPrivateKey.getParams();
        this.S = jg0Var;
    }

    @Override // defpackage.ln
    public final un a() {
        ECParameterSpec eCParameterSpec = this.R;
        if (eCParameterSpec == null) {
            return null;
        }
        return en.e(eCParameterSpec);
    }

    public final un b() {
        ECParameterSpec eCParameterSpec = this.R;
        return eCParameterSpec != null ? en.e(eCParameterSpec) : ((va) this.S).a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        if (!this.Q.equals(y7Var.Q) || !b().equals(y7Var.b())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.P;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    @Override // java.security.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] getEncoded() {
        BigInteger order;
        un a;
        int bitLength;
        zh zhVar;
        yn ynVar;
        e81 b = nu2.b(this.R);
        ECParameterSpec eCParameterSpec = this.R;
        try {
            if (eCParameterSpec == null) {
                jg0 jg0Var = this.S;
                BigInteger bigInteger = this.Q;
                a = ((va) jg0Var).a();
                if (a == null) {
                    bitLength = bigInteger.bitLength();
                    zhVar = this.T;
                    if (zhVar != null) {
                        ynVar = new yn(bitLength, this.Q, zhVar, b);
                    } else {
                        ynVar = new yn(bitLength, this.Q, null, b);
                    }
                    return new bg0(new u3(l81.f, b), ynVar).o("DER");
                }
                order = a.d;
            } else {
                jg0 jg0Var2 = this.S;
                order = eCParameterSpec.getOrder();
                BigInteger bigInteger2 = this.Q;
                if (order == null) {
                    a = ((va) jg0Var2).a();
                    if (a == null) {
                        bitLength = bigInteger2.bitLength();
                        zhVar = this.T;
                        if (zhVar != null) {
                        }
                        return new bg0(new u3(l81.f, b), ynVar).o("DER");
                    }
                    order = a.d;
                }
            }
            return new bg0(new u3(l81.f, b), ynVar).o("DER");
        } catch (IOException unused) {
            return null;
        }
        bitLength = order.bitLength();
        zhVar = this.T;
        if (zhVar != null) {
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.ECKey
    public final ECParameterSpec getParams() {
        return this.R;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public final BigInteger getS() {
        return this.Q;
    }

    public final int hashCode() {
        return this.Q.hashCode() ^ b().hashCode();
    }

    public final String toString() {
        BigInteger bigInteger = this.Q;
        un b = b();
        StringBuffer stringBuffer = new StringBuffer();
        String str = hu0.a;
        wn n = b.c.l(bigInteger).n();
        stringBuffer.append("EC");
        stringBuffer.append(" Private Key [");
        stringBuffer.append(h50.a(n, b));
        stringBuffer.append("]");
        stringBuffer.append(str);
        stringBuffer.append("            X: ");
        n.b();
        stringBuffer.append(n.b.t().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("            Y: ");
        stringBuffer.append(n.e().t().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    @Override // defpackage.xn
    public final BigInteger x() {
        return this.Q;
    }

    public y7(String str, zn znVar, z7 z7Var, ECParameterSpec eCParameterSpec, jg0 jg0Var) {
        zh zhVar;
        this.P = "EC";
        new Hashtable();
        new Vector();
        in inVar = (in) znVar.U;
        this.P = str;
        this.Q = znVar.V;
        this.S = jg0Var;
        if (eCParameterSpec == null) {
            hn hnVar = inVar.g;
            j7.c(inVar.h);
            EllipticCurve b = en.b(hnVar);
            wn wnVar = inVar.i;
            wnVar.b();
            this.R = new ECParameterSpec(b, new ECPoint(wnVar.b.t(), inVar.i.e().t()), inVar.j, inVar.k.intValue());
        } else {
            this.R = eCParameterSpec;
        }
        try {
            zhVar = nu0.p(t.s(z7Var.getEncoded())).Q;
        } catch (IOException unused) {
            zhVar = null;
        }
        this.T = zhVar;
    }

    public y7(String str, zn znVar, jg0 jg0Var) {
        this.P = "EC";
        new Hashtable();
        new Vector();
        this.P = str;
        this.Q = znVar.V;
        this.R = null;
        this.S = jg0Var;
    }

    public y7(String str, ao aoVar, jg0 jg0Var) {
        this.P = "EC";
        new Hashtable();
        new Vector();
        this.P = str;
        this.Q = aoVar.Q;
        un unVar = aoVar.P;
        this.R = unVar != null ? en.f(en.b(unVar.a), aoVar.P) : null;
        this.S = jg0Var;
    }

    public y7(String str, bg0 bg0Var, jg0 jg0Var) {
        this.P = "EC";
        new Hashtable();
        new Vector();
        this.P = str;
        this.S = jg0Var;
        e81 p = e81.p(bg0Var.Q.Q);
        this.R = en.g(p, en.h(this.S, p));
        t q = bg0Var.q();
        if (q instanceof l) {
            this.Q = l.w(q).x();
            return;
        }
        t tVar = null;
        yn ynVar = q instanceof yn ? (yn) q : q != null ? new yn(u.w(q)) : null;
        this.Q = new BigInteger(1, ((p) ynVar.P.x(1)).x());
        Enumeration y = ynVar.P.y();
        while (true) {
            if (!y.hasMoreElements()) {
                break;
            }
            g gVar = (g) y.nextElement();
            if (gVar instanceof x) {
                x xVar = (x) gVar;
                if (xVar.P == 1) {
                    tVar = xVar.x();
                    tVar.getClass();
                    break;
                }
            }
        }
        this.T = (zh) tVar;
    }
}