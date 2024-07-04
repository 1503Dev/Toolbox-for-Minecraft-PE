package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* renamed from: vz1  reason: default package */
public final class vz1 {
    public NetworkCapabilities a;

    public vz1(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new uz1(this));
        } catch (RuntimeException unused) {
            synchronized (vz1.class) {
                this.a = null;
            }
        }
    }

    public final long a() {
        synchronized (vz1.class) {
            NetworkCapabilities networkCapabilities = this.a;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.a.hasTransport(1)) {
                    return 1L;
                }
                if (this.a.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }
}