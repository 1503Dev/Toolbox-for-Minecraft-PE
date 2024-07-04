package defpackage;

import defpackage.k9;

/* renamed from: q42  reason: default package */
public final class q42 implements k9.b {
    public final /* synthetic */ u42 a;

    public q42(u42 u42Var) {
        this.a = u42Var;
    }

    @Override // defpackage.k9.b
    public final void Z(gf gfVar) {
        synchronized (this.a.c) {
            try {
                u42 u42Var = this.a;
                u42Var.f = null;
                if (u42Var.d != null) {
                    u42Var.d = null;
                }
                u42Var.c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}