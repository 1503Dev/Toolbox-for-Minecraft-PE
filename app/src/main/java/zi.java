package defpackage;

import java.util.Enumeration;

/* renamed from: zi  reason: default package */
public final class zi extends w {
    public int R;

    public zi() {
        this.R = -1;
    }

    public zi(s82 s82Var) {
        super(s82Var);
        this.R = -1;
    }

    public zi(t tVar) {
        super(tVar);
        this.R = -1;
    }

    public zi(g[] gVarArr) {
        super(gVarArr);
        this.R = -1;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        r b = rVar.b();
        int y = y();
        rVar.c(49);
        rVar.f(y);
        Enumeration w = w();
        while (w.hasMoreElements()) {
            b.g((g) w.nextElement());
        }
    }

    @Override // defpackage.t
    public final int r() {
        int y = y();
        return eu0.a(y) + 1 + y;
    }

    public final int y() {
        if (this.R < 0) {
            int i = 0;
            Enumeration w = w();
            while (w.hasMoreElements()) {
                i += ((g) w.nextElement()).h().v().r();
            }
            this.R = i;
        }
        return this.R;
    }
}