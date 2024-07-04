package defpackage;

import java.util.Enumeration;

/* renamed from: x8  reason: default package */
public final class x8 extends u {
    public x8() {
    }

    public x8(s82 s82Var) {
        super(s82Var);
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        rVar.c(48);
        rVar.c(128);
        Enumeration y = y();
        while (y.hasMoreElements()) {
            rVar.g((g) y.nextElement());
        }
        rVar.c(0);
        rVar.c(0);
    }

    @Override // defpackage.t
    public final int r() {
        Enumeration y = y();
        int i = 0;
        while (y.hasMoreElements()) {
            i += ((g) y.nextElement()).h().r();
        }
        return i + 2 + 2;
    }
}