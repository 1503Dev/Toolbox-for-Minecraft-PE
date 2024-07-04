package defpackage;

import java.util.Enumeration;

/* renamed from: yi  reason: default package */
public final class yi extends u {
    public int Q;

    public yi() {
        this.Q = -1;
    }

    public yi(s82 s82Var) {
        super(s82Var);
        this.Q = -1;
    }

    public final int B() {
        if (this.Q < 0) {
            int i = 0;
            Enumeration y = y();
            while (y.hasMoreElements()) {
                i += ((g) y.nextElement()).h().v().r();
            }
            this.Q = i;
        }
        return this.Q;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        r b = rVar.b();
        int B = B();
        rVar.c(48);
        rVar.f(B);
        Enumeration y = y();
        while (y.hasMoreElements()) {
            b.g((g) y.nextElement());
        }
    }

    @Override // defpackage.t
    public final int r() {
        int B = B();
        return eu0.a(B) + 1 + B;
    }
}