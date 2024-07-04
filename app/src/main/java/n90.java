package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager$NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* renamed from: n90  reason: default package */
public final class n90 extends qf<l90> {
    public static final String j = y20.e("NetworkStateTracker");
    public final ConnectivityManager g;
    public b h;
    public a i;

    /* renamed from: n90$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            y20.c().a(n90.j, "Network broadcast received", new Throwable[0]);
            n90 n90Var = n90.this;
            n90Var.b(n90Var.e());
        }
    }

    /* renamed from: n90$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends ConnectivityManager$NetworkCallback {
        public b() {
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            y20.c().a(n90.j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            n90 n90Var = n90.this;
            n90Var.b(n90Var.e());
        }

        public final void onLost(Network network) {
            y20.c().a(n90.j, "Network connection lost", new Throwable[0]);
            n90 n90Var = n90.this;
            n90Var.b(n90Var.e());
        }
    }

    public n90(Context context, bw0 bw0Var) {
        super(context, bw0Var);
        boolean z;
        this.g = (ConnectivityManager) this.b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.h = new b();
        } else {
            this.i = new a();
        }
    }

    @Override // defpackage.qf
    public final l90 a() {
        return e();
    }

    @Override // defpackage.qf
    public final void c() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                y20.c().a(j, "Registering network callback", new Throwable[0]);
                m90.a(this.g, this.h);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                y20.c().b(j, "Received exception while registering network callback", e);
                return;
            }
        }
        y20.c().a(j, "Registering broadcast receiver", new Throwable[0]);
        this.b.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // defpackage.qf
    public final void d() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                y20.c().a(j, "Unregistering network callback", new Throwable[0]);
                this.g.unregisterNetworkCallback(this.h);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                y20.c().b(j, "Received exception while unregistering network callback", e);
                return;
            }
        }
        y20.c().a(j, "Unregistering broadcast receiver", new Throwable[0]);
        this.b.unregisterReceiver(this.i);
    }

    public final l90 e() {
        boolean z;
        NetworkCapabilities networkCapabilities;
        boolean z2;
        NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        boolean z3 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = true;
        } else {
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                networkCapabilities = this.g.getNetworkCapabilities(im.b(this.g));
            } catch (SecurityException e) {
                y20.c().b(j, "Unable to validate active network", e);
            }
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    z2 = true;
                    boolean isActiveNetworkMetered = this.g.isActiveNetworkMetered();
                    if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                        z3 = true;
                    }
                    return new l90(z, z2, isActiveNetworkMetered, z3);
                }
            }
        }
        z2 = false;
        boolean isActiveNetworkMetered2 = this.g.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
            z3 = true;
        }
        return new l90(z, z2, isActiveNetworkMetered2, z3);
    }
}