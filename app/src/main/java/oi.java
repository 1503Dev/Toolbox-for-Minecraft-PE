package defpackage;

import java.util.Enumeration;

/* renamed from: oi  reason: default package */
public final class oi extends w {
    public int R;

    public oi() {
        this.R = -1;
    }

    public oi(s82 s82Var) {
        super(s82Var);
        this.R = -1;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        ki a = rVar.a();
        int y = y();
        rVar.c(49);
        rVar.f(y);
        Enumeration w = w();
        while (w.hasMoreElements()) {
            a.g((g) w.nextElement());
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
                i += ((g) w.nextElement()).h().u().r();
            }
            this.R = i;
        }
        return this.R;
    }
}