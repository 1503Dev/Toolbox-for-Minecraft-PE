package defpackage;

import android.net.ConnectivityManager$NetworkCallback;
import android.net.Network;

/* renamed from: vu2  reason: default package */
public final class vu2 extends ConnectivityManager$NetworkCallback {
    public final /* synthetic */ yu2 a;

    public vu2(yu2 yu2Var) {
        this.a = yu2Var;
    }

    public final void onAvailable(Network network) {
        this.a.n.set(true);
    }

    public final void onLost(Network network) {
        this.a.n.set(false);
    }
}