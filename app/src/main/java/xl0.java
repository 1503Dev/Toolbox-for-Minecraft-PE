package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: xl0  reason: default package */
public abstract class xl0 {
    public static void b(final Context context, final String str, final d3 d3Var, final gy gyVar) {
        if (context != null) {
            if (str != null) {
                if (d3Var != null) {
                    uf0.b("#008 Must be called on the main UI thread.");
                    x92.a(context);
                    if (((Boolean) kb2.k.d()).booleanValue()) {
                        if (((Boolean) w82.d.c.a(x92.K8)).booleanValue()) {
                            jv2.b.execute(new Runnable() { // from class: dw2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Context context2 = context;
                                    String str2 = str;
                                    d3 d3Var2 = d3Var;
                                    gy gyVar2 = gyVar;
                                    try {
                                        fs2 fs2Var = new fs2(context2, str2);
                                        fx3 fx3Var = d3Var2.a;
                                        try {
                                            wr2 wr2Var = fs2Var.a;
                                            if (wr2Var != null) {
                                                wr2Var.h1(zq5.a(fs2Var.b, fx3Var), new gs2(gyVar2, fs2Var));
                                            }
                                        } catch (RemoteException e) {
                                            sv2.i("#007 Could not call remote method.", e);
                                        }
                                    } catch (IllegalStateException e2) {
                                        ip2.a(context2).d("RewardedAd.load", e2);
                                    }
                                }
                            });
                            return;
                        }
                    }
                    sv2.b("Loading on UI thread");
                    fs2 fs2Var = new fs2(context, str);
                    fx3 fx3Var = d3Var.a;
                    try {
                        wr2 wr2Var = fs2Var.a;
                        if (wr2Var != null) {
                            wr2Var.h1(zq5.a(fs2Var.b, fx3Var), new gs2(gyVar, fs2Var));
                            return;
                        }
                        return;
                    } catch (RemoteException e) {
                        sv2.i("#007 Could not call remote method.", e);
                        return;
                    }
                }
                throw new NullPointerException("AdRequest cannot be null.");
            }
            throw new NullPointerException("AdUnitId cannot be null.");
        }
        throw new NullPointerException("Context cannot be null.");
    }

    public abstract rl0 a();

    public abstract void c(y2 y2Var);

    public abstract void d(Activity activity, jc0 jc0Var);
}