package defpackage;

import java.util.Enumeration;

/* renamed from: mi  reason: default package */
public final class mi extends u {
    public int Q;

    public mi() {
        this.Q = -1;
    }

    public mi(s82 s82Var) {
        super(s82Var);
        this.Q = -1;
    }

    public final int B() {
        if (this.Q < 0) {
            int i = 0;
            Enumeration y = y();
            while (y.hasMoreElements()) {
                i += ((g) y.nextElement()).h().u().r();
            }
            this.Q = i;
        }
        return this.Q;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        ki a = rVar.a();
        int B = B();
        rVar.c(48);
        rVar.f(B);
        Enumeration y = y();
        while (y.hasMoreElements()) {
            a.g((g) y.nextElement());
        }
    }

    @Override // defpackage.t
    public final int r() {
        int B = B();
        return eu0.a(B) + 1 + B;
    }
}