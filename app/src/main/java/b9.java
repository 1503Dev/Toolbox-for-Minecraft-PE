package defpackage;

import java.util.Enumeration;

/* renamed from: b9  reason: default package */
public final class b9 extends x {
    public b9(boolean z, int i, g gVar) {
        super(z, i, gVar);
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        Enumeration w;
        rVar.h(160, this.P);
        rVar.c(128);
        if (!this.Q) {
            g gVar = this.R;
            if (gVar instanceof p) {
                if (gVar instanceof v8) {
                    w = ((v8) gVar).y();
                } else {
                    w = new v8(((p) gVar).x()).y();
                }
            } else if (gVar instanceof u) {
                w = ((u) gVar).y();
            } else if (gVar instanceof w) {
                w = ((w) gVar).w();
            } else {
                StringBuilder b = e5.b("not implemented: ");
                b.append(this.R.getClass().getName());
                throw new i(b.toString());
            }
            while (w.hasMoreElements()) {
                rVar.g((g) w.nextElement());
            }
        } else {
            rVar.g(this.R);
        }
        rVar.c(0);
        rVar.c(0);
    }

    @Override // defpackage.t
    public final int r() {
        int r = this.R.h().r();
        if (this.Q) {
            return eu0.a(r) + eu0.b(this.P) + r;
        }
        return eu0.b(this.P) + (r - 1);
    }

    @Override // defpackage.t
    public final boolean t() {
        if (this.Q) {
            return true;
        }
        return this.R.h().u().t();
    }
}