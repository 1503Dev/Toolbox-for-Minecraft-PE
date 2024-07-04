package defpackage;

import android.util.Log;
import defpackage.l4;

/* renamed from: bh1  reason: default package */
public final class bh1 implements Runnable {
    public final /* synthetic */ gf P;
    public final /* synthetic */ ch1 Q;

    public bh1(ch1 ch1Var, gf gfVar) {
        this.Q = ch1Var;
        this.P = gfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        rv rvVar;
        ch1 ch1Var = this.Q;
        zg1 zg1Var = (zg1) ch1Var.f.Y.get(ch1Var.b);
        if (zg1Var == null) {
            return;
        }
        gf gfVar = this.P;
        if (gfVar.Q == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ch1 ch1Var2 = this.Q;
            ch1Var2.e = true;
            if (ch1Var2.a.l()) {
                ch1 ch1Var3 = this.Q;
                if (ch1Var3.e && (rvVar = ch1Var3.c) != null) {
                    ch1Var3.a.m(rvVar, ch1Var3.d);
                    return;
                }
                return;
            }
            try {
                l4.e eVar = this.Q.a;
                eVar.m(null, eVar.b());
                return;
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                this.Q.a.d("Failed to get service from broker.");
                gfVar = new gf(10);
            }
        }
        zg1Var.n(gfVar, null);
    }
}