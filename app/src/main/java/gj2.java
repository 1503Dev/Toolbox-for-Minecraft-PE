package defpackage;

import java.util.ArrayList;

/* renamed from: gj2  reason: default package */
public final class gj2 implements Runnable {
    public final /* synthetic */ qj2 P;
    public final /* synthetic */ ui2 Q;
    public final /* synthetic */ ArrayList R;
    public final /* synthetic */ long S;
    public final /* synthetic */ rj2 T;

    public gj2(long j, zi2 zi2Var, qj2 qj2Var, rj2 rj2Var, ArrayList arrayList) {
        this.T = rj2Var;
        this.P = qj2Var;
        this.Q = zi2Var;
        this.R = arrayList;
        this.S = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        synchronized (this.T.a) {
            if (this.P.b() != -1 && this.P.b() != 1) {
                this.P.c();
                zw2.e.execute(new xj1(1, this.Q));
                String valueOf = String.valueOf(w82.d.c.a(x92.c));
                int b = this.P.b();
                int i = this.T.g;
                if (this.R.isEmpty()) {
                    str = ". Still waiting for the engine to be loaded";
                } else {
                    str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(this.R.get(0));
                }
                jv5.A.j.getClass();
                vz3.k("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + b + ". Update status(fullLoadTimeout) is " + i + str + " ms. Total latency(fullLoadTimeout) is " + (System.currentTimeMillis() - this.S) + " ms at timeout. Rejecting.");
            }
        }
    }
}