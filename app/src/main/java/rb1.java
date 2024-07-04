package defpackage;

import android.content.Context;

/* renamed from: rb1  reason: default package */
public final class rb1 implements Runnable {
    public final /* synthetic */ Context P;
    public final /* synthetic */ rc1 Q;
    public final /* synthetic */ a2 R;
    public final /* synthetic */ String S;
    public final /* synthetic */ pb1 T;

    public rb1(pb1 pb1Var, Context context, rc1 rc1Var, a2 a2Var, String str) {
        this.T = pb1Var;
        this.P = context;
        this.Q = rc1Var;
        this.R = a2Var;
        this.S = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z1 z1Var;
        try {
            z1Var = new z1(this.P, this.Q, this.R);
        } catch (RuntimeException e) {
            t1.b(0, 0, e.toString(), true);
            z1Var = null;
        }
        synchronized (this.T.g) {
            if (this.T.e.remove(this.S) == null) {
                return;
            }
            if (z1Var == null) {
                pb1 pb1Var = this.T;
                a2 a2Var = this.R;
                pb1Var.getClass();
                eg1.n(new tb1(a2Var));
                return;
            }
            this.T.f.put(this.S, z1Var);
            z1Var.setOmidManager(this.R.b);
            ka1 webView = z1Var.getWebView();
            if (z1Var.W != null && webView != null) {
                pb1 k = ga1.h().k();
                String str = webView.W;
                ob1 ob1Var = webView.d0;
                k.getClass();
                eg1.n(new wb1(k, str, webView, ob1Var));
            }
            a2 a2Var2 = this.R;
            a2Var2.b = null;
            a2Var2.a();
        }
    }
}