package defpackage;

import java.io.IOException;

/* renamed from: x  reason: default package */
public abstract class x extends t implements ex {
    public int P;
    public boolean Q;
    public g R;

    public x(boolean z, int i, g gVar) {
        this.Q = true;
        this.R = null;
        if (gVar instanceof e81) {
            this.Q = true;
        } else {
            this.Q = z;
        }
        this.P = i;
        if (!this.Q) {
            boolean z2 = gVar.h() instanceof w;
        }
        this.R = gVar;
    }

    public static x w(g gVar) {
        if (gVar != null && !(gVar instanceof x)) {
            if (gVar instanceof byte[]) {
                try {
                    return w(t.s((byte[]) gVar));
                } catch (IOException e) {
                    StringBuilder b = e5.b("failed to construct tagged object from byte[]: ");
                    b.append(e.getMessage());
                    throw new IllegalArgumentException(b.toString());
                }
            }
            StringBuilder b2 = e5.b("unknown object in getInstance: ");
            b2.append(gVar.getClass().getName());
            throw new IllegalArgumentException(b2.toString());
        }
        return (x) gVar;
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        int i = this.P;
        g gVar = this.R;
        return gVar != null ? i ^ gVar.hashCode() : i;
    }

    @Override // defpackage.ex
    public final t m() {
        return this;
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (tVar instanceof x) {
            x xVar = (x) tVar;
            if (this.P == xVar.P && this.Q == xVar.Q) {
                g gVar = this.R;
                return gVar == null ? xVar.R == null : gVar.h().equals(xVar.R.h());
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        StringBuilder b = e5.b("[");
        b.append(this.P);
        b.append("]");
        b.append(this.R);
        return b.toString();
    }

    @Override // defpackage.t
    public final t u() {
        return new ri(this.Q, this.P, this.R);
    }

    @Override // defpackage.t
    public final t v() {
        return new aj(this.Q, this.P, this.R);
    }

    public final t x() {
        g gVar = this.R;
        if (gVar != null) {
            return gVar.h();
        }
        return null;
    }
}