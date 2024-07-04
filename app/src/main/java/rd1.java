package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: rd1  reason: default package */
public final class rd1 {
    public ScheduledExecutorService a;
    public ScheduledFuture<?> b;
    public String c;

    public static String b() {
        NetworkInfo activeNetworkInfo;
        Context context = ga1.P;
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
                if (connectivityManager == null) {
                    activeNetworkInfo = null;
                } else {
                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                }
                if (activeNetworkInfo != null) {
                    int type = activeNetworkInfo.getType();
                    if (type == 1) {
                        return "wifi";
                    }
                    if (type == 0 || type >= 2) {
                        return "cell";
                    }
                }
            } catch (SecurityException e) {
                StringBuilder c = yg.c("SecurityException - please ensure you added the ", "ACCESS_NETWORK_STATE permission: ");
                c.append(e.toString());
                t1.b(0, 0, c.toString(), false);
            } catch (Exception e2) {
                StringBuilder c2 = yg.c("Exception occurred when retrieving activeNetworkInfo in ", "ADCNetwork.getConnectivityStatus(): ");
                c2.append(e2.toString());
                t1.b(0, 0, c2.toString(), true);
            }
        }
        return "none";
    }

    public final void a() {
        String b = b();
        if (!b.equals(this.c)) {
            this.c = b;
            ic1 ic1Var = new ic1();
            eb1.j(ic1Var, "network_type", b);
            new rc1(1, ic1Var, "Network.on_status_change").b();
        }
    }
}