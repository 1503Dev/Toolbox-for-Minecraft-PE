package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import defpackage.u6;

/* renamed from: u6  reason: default package */
public abstract class u6 {

    /* renamed from: u6$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a extends z61 {
    }

    @Deprecated
    public static void b(final Context context, final String str, final d3 d3Var, final ku3 ku3Var) {
        if (context != null) {
            if (str != null) {
                uf0.b("#008 Must be called on the main UI thread.");
                x92.a(context);
                if (((Boolean) kb2.d.d()).booleanValue()) {
                    if (((Boolean) w82.d.c.a(x92.K8)).booleanValue()) {
                        jv2.b.execute(new Runnable() { // from class: pw2
                            public final /* synthetic */ int S = 1;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Context context2 = context;
                                String str2 = str;
                                d3 d3Var2 = d3Var;
                                int i = this.S;
                                u6.a aVar = ku3Var;
                                try {
                                    fx3 fx3Var = d3Var2.a;
                                    tk2 tk2Var = new tk2();
                                    try {
                                        zr5 c = zr5.c();
                                        t42 t42Var = n62.f.b;
                                        t42Var.getClass();
                                        pq2 pq2Var = (pq2) new eu1(t42Var, context2, c, str2, tk2Var).d(context2, false);
                                        if (pq2Var != null) {
                                            if (i != 3) {
                                                pq2Var.J2(new by5(i));
                                            }
                                            pq2Var.A3(new a42(aVar, str2));
                                            pq2Var.z1(zq5.a(context2, fx3Var));
                                        }
                                    } catch (RemoteException e) {
                                        sv2.i("#007 Could not call remote method.", e);
                                    }
                                } catch (IllegalStateException e2) {
                                    ip2.a(context2).d("AppOpenAd.load", e2);
                                }
                            }
                        });
                        return;
                    }
                }
                fx3 fx3Var = d3Var.a;
                tk2 tk2Var = new tk2();
                try {
                    zr5 c = zr5.c();
                    t42 t42Var = n62.f.b;
                    t42Var.getClass();
                    pq2 pq2Var = (pq2) new eu1(t42Var, context, c, str, tk2Var).d(context, false);
                    if (pq2Var != null) {
                        pq2Var.J2(new by5(1));
                        pq2Var.A3(new a42(ku3Var, str));
                        pq2Var.z1(zq5.a(context, fx3Var));
                        return;
                    }
                    return;
                } catch (RemoteException e) {
                    sv2.i("#007 Could not call remote method.", e);
                    return;
                }
            }
            throw new NullPointerException("adUnitId cannot be null.");
        }
        throw new NullPointerException("Context cannot be null.");
    }

    public abstract rl0 a();

    public abstract void c(Activity activity);
}