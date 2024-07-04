package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: pk2  reason: default package */
public final /* synthetic */ class pk2 implements Runnable {
    public final /* synthetic */ Context P;
    public final /* synthetic */ String Q;

    public /* synthetic */ pk2(Context context, String str) {
        this.P = context;
        this.Q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p23 n23Var;
        Context context = this.P;
        String str = this.Q;
        x92.a(context);
        Bundle bundle = new Bundle();
        l92 l92Var = x92.b0;
        w82 w82Var = w82.d;
        bundle.putBoolean("measurementEnabled", ((Boolean) w82Var.c.a(l92Var)).booleanValue());
        if (((Boolean) w82Var.c.a(x92.i0)).booleanValue()) {
            bundle.putString("ad_storage", "denied");
            bundle.putString("analytics_storage", "denied");
        }
        uf0.f(context);
        if (h34.i == null) {
            synchronized (h34.class) {
                if (h34.i == null) {
                    h34.i = new h34(context, str, bundle);
                }
            }
        }
        t6 t6Var = h34.i.d;
        try {
            try {
                IBinder b = vv2.a(context).b("com.google.android.gms.ads.measurement.DynamiteMeasurementManager");
                int i = o23.P;
                if (b == null) {
                    n23Var = null;
                } else {
                    IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
                    if (queryLocalInterface instanceof p23) {
                        n23Var = (p23) queryLocalInterface;
                    } else {
                        n23Var = new n23(b);
                    }
                }
                n23Var.x3(new va0(context), new ok2(t6Var));
            } catch (Exception e) {
                throw new uv2(e);
            }
        } catch (RemoteException e2) {
            e = e2;
            sv2.i("#007 Could not call remote method.", e);
        } catch (NullPointerException e3) {
            e = e3;
            sv2.i("#007 Could not call remote method.", e);
        } catch (uv2 e4) {
            e = e4;
            sv2.i("#007 Could not call remote method.", e);
        }
    }
}