package defpackage;

import defpackage.z81;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.PrivateKey;

/* renamed from: n8  reason: default package */
public final class n8 implements PrivateKey {
    public final z81 P;
    public final o Q;

    public n8(bg0 bg0Var) {
        o81 o81Var;
        g gVar = bg0Var.Q.Q;
        y81 y81Var = null;
        if (gVar instanceof o81) {
            o81Var = (o81) gVar;
        } else if (gVar != null) {
            o81Var = new o81(u.w(gVar));
        } else {
            o81Var = null;
        }
        o oVar = o81Var.R.P;
        this.Q = oVar;
        t q = bg0Var.q();
        if (q instanceof y81) {
            y81Var = (y81) q;
        } else if (q != null) {
            y81Var = new y81(u.w(q));
        }
        try {
            z81.a aVar = new z81.a(new x81(o81Var.Q, p5.g(oVar)));
            aVar.b = y81Var.P;
            aVar.c = vj.j(j7.c(y81Var.Q));
            aVar.d = vj.j(j7.c(y81Var.R));
            aVar.e = vj.j(j7.c(y81Var.S));
            aVar.f = vj.j(j7.c(y81Var.T));
            if (j7.c(y81Var.U) != null) {
                aVar.g = (p8) new ObjectInputStream(new ByteArrayInputStream(j7.c(y81Var.U))).readObject();
            }
            this.P = new z81(aVar);
        } catch (ClassNotFoundException e) {
            StringBuilder b = e5.b("ClassNotFoundException processing BDS state: ");
            b.append(e.getMessage());
            throw new IOException(b.toString());
        }
    }

    public final y81 a() {
        byte[] o = this.P.o();
        int a = this.P.U.a();
        int i = this.P.U.b;
        int h = (int) vj.h(o, 4);
        if (vj.u(h, i)) {
            byte[] o2 = vj.o(o, 4, a);
            int i2 = a + 4;
            byte[] o3 = vj.o(o, i2, a);
            int i3 = i2 + a;
            byte[] o4 = vj.o(o, i3, a);
            int i4 = i3 + a;
            byte[] o5 = vj.o(o, i4, a);
            int i5 = i4 + a;
            return new y81(h, o2, o3, o4, o5, vj.o(o, i5, o.length - i5));
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n8) {
            n8 n8Var = (n8) obj;
            return this.Q.equals(n8Var.Q) && j7.a(this.P.o(), n8Var.P.o());
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
            return new bg0(new u3(hd0.f, new o81(this.P.U.b, new u3(this.Q))), a()).n();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (j7.h(this.P.o()) * 37) + this.Q.hashCode();
    }
}