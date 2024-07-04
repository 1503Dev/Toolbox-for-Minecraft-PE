package com.mojang.minecraftpe;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager$NetworkCallback;
import android.net.Network;
import android.net.NetworkRequest$Builder;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NetworkMonitor {
    private int cableAvailable;
    private Context context;
    private int otherAvailable;
    private int wifiAvailable;
    private static int[] TRANSPORT_TYPE_CABLE = {3};
    private static int[] TRANSPORT_TYPE_WIFI = {1};
    private static int[] TRANSPORT_TYPE_OTHER = {0, 2};
    private List<ConnectivityManager$NetworkCallback> callbacks = new ArrayList();
    private Set<Network> knownNetworks = new HashSet();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public enum NetworkType {
        Cable,
        Wifi,
        Other
    }

    public NetworkMonitor(Context context) {
        this.context = context;
        if (Build.VERSION.SDK_INT >= 21) {
            registerCallbacks();
        } else {
            nativeUpdateNetworkStatus(false, true, false);
        }
    }

    private native void nativeUpdateNetworkStatus(boolean z, boolean z2, boolean z3);

    private void registerCallback(final NetworkType networkType, int[] iArr) {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
        ConnectivityManager$NetworkCallback connectivityManager$NetworkCallback = new ConnectivityManager$NetworkCallback() { // from class: com.mojang.minecraftpe.NetworkMonitor.1
            public void onAvailable(Network network) {
                if (NetworkMonitor.this.knownNetworks.contains(network)) {
                    return;
                }
                NetworkMonitor.this.knownNetworks.add(network);
                NetworkMonitor.this.setHasNetworkType(networkType, true);
            }

            public void onLost(Network network) {
                if (NetworkMonitor.this.knownNetworks.contains(network)) {
                    NetworkMonitor.this.setHasNetworkType(networkType, false);
                    NetworkMonitor.this.knownNetworks.remove(network);
                }
            }
        };
        this.callbacks.add(connectivityManager$NetworkCallback);
        for (int i : iArr) {
            NetworkRequest$Builder addCapability = new NetworkRequest$Builder().addCapability(12);
            if (Build.VERSION.SDK_INT >= 23) {
                addCapability.addCapability(16);
            }
            addCapability.addTransportType(i);
            connectivityManager.registerNetworkCallback(addCapability.build(), connectivityManager$NetworkCallback);
        }
    }

    private void registerCallbacks() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
        registerCallback(NetworkType.Cable, TRANSPORT_TYPE_CABLE);
        registerCallback(NetworkType.Wifi, TRANSPORT_TYPE_WIFI);
        registerCallback(NetworkType.Other, TRANSPORT_TYPE_OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasNetworkType(NetworkType networkType, boolean z) {
        if (networkType == NetworkType.Cable) {
            this.cableAvailable += z ? 1 : -1;
        }
        if (networkType == NetworkType.Wifi) {
            this.wifiAvailable += z ? 1 : -1;
        }
        if (networkType == NetworkType.Other) {
            this.otherAvailable += z ? 1 : -1;
        }
        nativeUpdateNetworkStatus(this.cableAvailable > 0, this.wifiAvailable > 0, this.otherAvailable > 0);
    }

    private void unregisterCallbacks() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
        for (ConnectivityManager$NetworkCallback connectivityManager$NetworkCallback : this.callbacks) {
            hm.b(connectivityManager, connectivityManager$NetworkCallback);
        }
    }

    public void finish() {
        if (Build.VERSION.SDK_INT >= 21) {
            unregisterCallbacks();
        }
    }
}