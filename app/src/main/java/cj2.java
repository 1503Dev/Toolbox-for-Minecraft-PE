package defpackage;

import android.webkit.WebView;
import java.util.ArrayList;

/* renamed from: cj2  reason: default package */
public final /* synthetic */ class cj2 implements Runnable {
    public final /* synthetic */ int P = 1;
    public final Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ cj2(rj2 rj2Var, qj2 qj2Var) {
        this.Q = rj2Var;
        this.R = qj2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                rj2 rj2Var = (rj2) this.Q;
                qj2 qj2Var = (qj2) this.R;
                rj2Var.getClass();
                jv5.A.j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                try {
                    zi2 zi2Var = new zi2(rj2Var.b, rj2Var.d);
                    zi2Var.P.R().W = new ee4(3, new dj2(currentTimeMillis, zi2Var, qj2Var, rj2Var, arrayList));
                    zi2Var.g0("/jsLoaded", new ej2(rj2Var, currentTimeMillis, qj2Var, zi2Var));
                    fk fkVar = new fk(1);
                    fj2 fj2Var = new fj2(rj2Var, zi2Var, fkVar);
                    fkVar.f(fj2Var);
                    zi2Var.g0("/requestReload", fj2Var);
                    if (rj2Var.c.endsWith(".js")) {
                        zi2.b(new hq1(3, zi2Var, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", rj2Var.c)));
                    } else if (rj2Var.c.startsWith("<html>")) {
                        zi2.b(new wi2(0, zi2Var, rj2Var.c));
                    } else {
                        zi2.b(new xi2(0, zi2Var, rj2Var.c));
                    }
                    cu5.i.postDelayed(new gj2(currentTimeMillis, zi2Var, qj2Var, rj2Var, arrayList), ((Integer) w82.d.c.a(x92.c)).intValue());
                    return;
                } catch (Throwable th) {
                    sv2.e("Error creating webview.", th);
                    jv5.A.g.f("SdkJavascriptFactory.loadJavascriptEngine", th);
                    qj2Var.c();
                    return;
                }
            case 1:
                ((WebView) this.Q).destroy();
                return;
            default:
                oq5 oq5Var = ((nq5) this.Q).b;
                int i = zn4.a;
                pp5 pp5Var = ((xl5) oq5Var).P.p;
                io5 G = pp5Var.G();
                pp5Var.D(G, 1029, new vi1(6, G, (Exception) this.R));
                return;
        }
    }

    public cj2(io4 io4Var) {
        this.R = io4Var;
        this.Q = io4Var.d;
    }

    public /* synthetic */ cj2(nq5 nq5Var, Exception exc) {
        this.Q = nq5Var;
        this.R = exc;
    }
}