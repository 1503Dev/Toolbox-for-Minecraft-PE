package defpackage;

import android.net.ConnectivityManager;
import android.net.ConnectivityManager$NetworkCallback;

/* renamed from: hm */
public final /* synthetic */ class hm {
    public static /* bridge */ /* synthetic */ void b(ConnectivityManager connectivityManager, ConnectivityManager$NetworkCallback connectivityManager$NetworkCallback) {
        connectivityManager.unregisterNetworkCallback(connectivityManager$NetworkCallback);
    }
}