package defpackage;

import java.util.Enumeration;

/* renamed from: bg0  reason: default package */
public final class bg0 extends n {
    public p P;
    public u3 Q;
    public w R;

    public bg0(u uVar) {
        w z8Var;
        Enumeration y = uVar.y();
        if (((l) y.nextElement()).x().intValue() != 0) {
            throw new IllegalArgumentException("wrong version for private key info");
        }
        this.Q = u3.p(y.nextElement());
        this.P = p.w(y.nextElement());
        if (y.hasMoreElements()) {
            x xVar = (x) y.nextElement();
            if (xVar.Q) {
                z8Var = xVar instanceof b9 ? new z8(xVar.x()) : new zi(xVar.x());
            } else if (xVar.x() instanceof w) {
                z8Var = (w) xVar.x();
            } else if (!(xVar.x() instanceof u)) {
                StringBuilder b = e5.b("unknown object in getInstance: ");
                b.append(xVar.getClass().getName());
                throw new IllegalArgumentException(b.toString());
            } else {
                u uVar2 = (u) xVar.x();
                z8Var = xVar instanceof b9 ? new z8(uVar2.z()) : new zi(uVar2.z());
            }
            this.R = z8Var;
        }
    }

    public static bg0 p(Object obj) {
        if (obj instanceof bg0) {
            return (bg0) obj;
        }
        if (obj != null) {
            return new bg0(u.w(obj));
        }
        return null;
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        s82 s82Var = new s82(12);
        s82Var.g(new l(0L));
        s82Var.g(this.Q);
        s82Var.g(this.P);
        w wVar = this.R;
        if (wVar != null) {
            s82Var.g(new ri(false, 0, wVar));
        }
        return new mi(s82Var);
    }

    public final t q() {
        return t.s(this.P.x());
    }

    public bg0(u3 u3Var, n nVar) {
        this.P = new ii(nVar.h().o("DER"));
        this.Q = u3Var;
        this.R = null;
    }
}