package defpackage;

import android.net.ConnectivityManager$NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: uz1  reason: default package */
public final class uz1 extends ConnectivityManager$NetworkCallback {
    public final /* synthetic */ vz1 a;

    public uz1(vz1 vz1Var) {
        this.a = vz1Var;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (vz1.class) {
            this.a.a = networkCapabilities;
        }
    }

    public final void onLost(Network network) {
        synchronized (vz1.class) {
            this.a.a = null;
        }
    }
}