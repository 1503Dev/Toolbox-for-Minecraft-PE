package defpackage;

import defpackage.t81;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.PrivateKey;

/* renamed from: l8  reason: default package */
public final class l8 implements PrivateKey {
    public final o P;
    public final t81 Q;

    public l8(bg0 bg0Var) {
        q81 q81Var;
        g gVar = bg0Var.Q.Q;
        y81 y81Var = null;
        if (gVar instanceof q81) {
            q81Var = (q81) gVar;
        } else if (gVar != null) {
            q81Var = new q81(u.w(gVar));
        } else {
            q81Var = null;
        }
        o oVar = q81Var.S.P;
        this.P = oVar;
        t q = bg0Var.q();
        if (q instanceof y81) {
            y81Var = (y81) q;
        } else if (q != null) {
            y81Var = new y81(u.w(q));
        }
        try {
            t81.a aVar = new t81.a(new r81(q81Var.Q, q81Var.R, p5.g(oVar)));
            aVar.b = y81Var.P;
            aVar.c = vj.j(j7.c(y81Var.Q));
            aVar.d = vj.j(j7.c(y81Var.R));
            aVar.e = vj.j(j7.c(y81Var.S));
            aVar.f = vj.j(j7.c(y81Var.T));
            if (j7.c(y81Var.U) != null) {
                aVar.g = (q8) new ObjectInputStream(new ByteArrayInputStream(j7.c(y81Var.U))).readObject();
            }
            this.Q = new t81(aVar);
        } catch (ClassNotFoundException e) {
            StringBuilder b = e5.b("ClassNotFoundException processing BDS state: ");
            b.append(e.getMessage());
            throw new IOException(b.toString());
        }
    }

    public final s81 a() {
        byte[] o = this.Q.o();
        int a = this.Q.U.a();
        int i = this.Q.U.b;
        int i2 = (i + 7) / 8;
        int h = (int) vj.h(o, i2);
        if (vj.u(h, i)) {
            int i3 = i2 + 0;
            byte[] o2 = vj.o(o, i3, a);
            int i4 = i3 + a;
            byte[] o3 = vj.o(o, i4, a);
            int i5 = i4 + a;
            byte[] o4 = vj.o(o, i5, a);
            int i6 = i5 + a;
            byte[] o5 = vj.o(o, i6, a);
            int i7 = i6 + a;
            return new s81(h, o2, o3, o4, o5, vj.o(o, i7, o.length - i7));
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l8) {
            l8 l8Var = (l8) obj;
            return this.P.equals(l8Var.P) && j7.a(this.Q.o(), l8Var.Q.o());
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
            return new bg0(new u3(oVar, new q81(r81Var.b, r81Var.c, new u3(this.P))), a()).n();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (j7.h(this.Q.o()) * 37) + this.P.hashCode();
    }
}