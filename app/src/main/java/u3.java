package defpackage;

/* renamed from: u3  reason: default package */
public final class u3 extends n {
    public o P;
    public g Q;

    public u3(o oVar) {
        this.P = oVar;
    }

    public u3(o oVar, n nVar) {
        this.P = oVar;
        this.Q = nVar;
    }

    public u3(u uVar) {
        if (uVar.size() < 1 || uVar.size() > 2) {
            StringBuilder b = e5.b("Bad sequence size: ");
            b.append(uVar.size());
            throw new IllegalArgumentException(b.toString());
        }
        this.P = o.z(uVar.x(0));
        this.Q = uVar.size() == 2 ? uVar.x(1) : null;
    }

    public static u3 p(Object obj) {
        if (obj instanceof u3) {
            return (u3) obj;
        }
        if (obj != null) {
            return new u3(u.w(obj));
        }
        return null;
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        s82 s82Var = new s82(12);
        s82Var.g(this.P);
        g gVar = this.Q;
        if (gVar != null) {
            s82Var.g(gVar);
        }
        return new mi(s82Var);
    }
}