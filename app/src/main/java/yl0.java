package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: yl0  reason: default package */
public abstract class yl0 {
    public static void b(final Context context, final String str, final d3 d3Var, final ou3 ou3Var) {
        if (context != null) {
            if (str != null) {
                uf0.b("#008 Must be called on the main UI thread.");
                x92.a(context);
                if (((Boolean) kb2.k.d()).booleanValue()) {
                    if (((Boolean) w82.d.c.a(x92.K8)).booleanValue()) {
                        jv2.b.execute(new Runnable() { // from class: jj1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Context context2 = context;
                                String str2 = str;
                                d3 d3Var2 = d3Var;
                                ou3 ou3Var2 = ou3Var;
                                try {
                                    qs2 qs2Var = new qs2(context2, str2);
                                    fx3 fx3Var = d3Var2.a;
                                    try {
                                        wr2 wr2Var = qs2Var.a;
                                        if (wr2Var != null) {
                                            wr2Var.U0(zq5.a(qs2Var.b, fx3Var), new ps2(ou3Var2, qs2Var));
                                        }
                                    } catch (RemoteException e) {
                                        sv2.i("#007 Could not call remote method.", e);
                                    }
                                } catch (IllegalStateException e2) {
                                    ip2.a(context2).d("RewardedInterstitialAd.load", e2);
                                }
                            }
                        });
                        return;
                    }
                }
                qs2 qs2Var = new qs2(context, str);
                fx3 fx3Var = d3Var.a;
                try {
                    wr2 wr2Var = qs2Var.a;
                    if (wr2Var != null) {
                        wr2Var.U0(zq5.a(qs2Var.b, fx3Var), new ps2(ou3Var, qs2Var));
                        return;
                    }
                    return;
                } catch (RemoteException e) {
                    sv2.i("#007 Could not call remote method.", e);
                    return;
                }
            }
            throw new NullPointerException("AdUnitId cannot be null.");
        }
        throw new NullPointerException("Context cannot be null.");
    }

    public abstract rl0 a();

    public abstract void c(Activity activity);
}