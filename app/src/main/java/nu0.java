package defpackage;

import java.util.Enumeration;

/* renamed from: nu0  reason: default package */
public final class nu0 extends n {
    public u3 P;
    public zh Q;

    public nu0(u3 u3Var, n nVar) {
        this.Q = new zh(nVar);
        this.P = u3Var;
    }

    public nu0(u3 u3Var, byte[] bArr) {
        this.Q = new zh(bArr);
        this.P = u3Var;
    }

    public nu0(u uVar) {
        zh zhVar;
        if (uVar.size() == 2) {
            Enumeration y = uVar.y();
            this.P = u3.p(y.nextElement());
            Object nextElement = y.nextElement();
            if (nextElement == null || (nextElement instanceof zh)) {
                zhVar = (zh) nextElement;
            } else if (nextElement instanceof wi) {
                wi wiVar = (wi) nextElement;
                zhVar = new zh(wiVar.P, wiVar.Q);
            } else if (nextElement instanceof byte[]) {
                try {
                    zhVar = (zh) t.s((byte[]) nextElement);
                } catch (Exception e) {
                    StringBuilder b = e5.b("encoding error in getInstance: ");
                    b.append(e.toString());
                    throw new IllegalArgumentException(b.toString());
                }
            } else {
                StringBuilder b2 = e5.b("illegal object in getInstance: ");
                b2.append(nextElement.getClass().getName());
                throw new IllegalArgumentException(b2.toString());
            }
            this.Q = zhVar;
            return;
        }
        StringBuilder b3 = e5.b("Bad sequence size: ");
        b3.append(uVar.size());
        throw new IllegalArgumentException(b3.toString());
    }

    public static nu0 p(Object obj) {
        if (obj instanceof nu0) {
            return (nu0) obj;
        }
        if (obj != null) {
            return new nu0(u.w(obj));
        }
        return null;
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        s82 s82Var = new s82(12);
        s82Var.g(this.P);
        s82Var.g(this.Q);
        return new mi(s82Var);
    }

    public final t q() {
        zh zhVar = this.Q;
        if (zhVar.Q == 0) {
            return new k(j7.c(zhVar.P)).E();
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }
}