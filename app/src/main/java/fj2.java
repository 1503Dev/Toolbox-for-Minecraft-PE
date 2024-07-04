package defpackage;

import java.util.Map;

/* renamed from: fj2  reason: default package */
public final class fj2 implements mg2 {
    public final /* synthetic */ ui2 P;
    public final /* synthetic */ fk Q;
    public final /* synthetic */ rj2 R;

    public fj2(rj2 rj2Var, zi2 zi2Var, fk fkVar) {
        this.R = rj2Var;
        this.P = zi2Var;
        this.Q = fkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [mg2, java.lang.Object] */
    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        sj2 sj2Var = (sj2) obj;
        synchronized (this.R.a) {
            sv2.f("JS Engine is requesting an update");
            if (this.R.g == 0) {
                sv2.f("Starting reload.");
                rj2 rj2Var = this.R;
                rj2Var.g = 2;
                rj2Var.b();
            }
            this.P.n("/requestReload", this.Q.Q);
        }
    }
}