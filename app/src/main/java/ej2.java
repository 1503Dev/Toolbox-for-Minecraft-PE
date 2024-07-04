package defpackage;

import java.util.Map;

/* renamed from: ej2  reason: default package */
public final class ej2 implements mg2 {
    public final /* synthetic */ long P;
    public final /* synthetic */ qj2 Q;
    public final /* synthetic */ ui2 R;
    public final /* synthetic */ rj2 S;

    public ej2(rj2 rj2Var, long j, qj2 qj2Var, zi2 zi2Var) {
        this.S = rj2Var;
        this.P = j;
        this.Q = qj2Var;
        this.R = zi2Var;
    }

    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        sj2 sj2Var = (sj2) obj;
        jv5.A.j.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.P;
        vz3.k("onGmsg /jsLoaded. JsLoaded latency is " + currentTimeMillis + " ms.");
        synchronized (this.S.a) {
            try {
                if (this.Q.b() != -1 && this.Q.b() != 1) {
                    this.S.g = 0;
                    ui2 ui2Var = this.R;
                    ui2Var.g0("/log", lg2.c);
                    ui2Var.g0("/result", lg2.j);
                    qj2 qj2Var = this.Q;
                    ((bx2) qj2Var.P).a(this.R);
                    this.S.f = this.Q;
                    vz3.k("Successfully loaded JS Engine.");
                }
            } finally {
            }
        }
    }
}