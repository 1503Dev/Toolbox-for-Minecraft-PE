package defpackage;

import java.util.Enumeration;

/* renamed from: z8  reason: default package */
public final class z8 extends w {
    public z8() {
    }

    public z8(s82 s82Var) {
        super(s82Var);
    }

    public z8(t tVar) {
        super(tVar);
    }

    public z8(g[] gVarArr) {
        super(gVarArr);
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        rVar.c(49);
        rVar.c(128);
        Enumeration w = w();
        while (w.hasMoreElements()) {
            rVar.g((g) w.nextElement());
        }
        rVar.c(0);
        rVar.c(0);
    }

    @Override // defpackage.t
    public final int r() {
        Enumeration w = w();
        int i = 0;
        while (w.hasMoreElements()) {
            i += ((g) w.nextElement()).h().r();
        }
        return i + 2 + 2;
    }
}