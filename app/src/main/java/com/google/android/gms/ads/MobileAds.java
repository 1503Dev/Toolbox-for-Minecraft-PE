package com.google.android.gms.ads;

import android.os.RemoteException;

public class MobileAds {
    private static void setPlugin(String str) {
        boolean z;
        x64 b = x64.b();
        synchronized (b.e) {
            if (b.f != null) {
                z = true;
            } else {
                z = false;
            }
            uf0.h("MobileAds.initialize() must be called prior to setting the plugin.", z);
            try {
                b.f.O0(str);
            } catch (RemoteException e) {
                sv2.e("Unable to set plugin.", e);
            }
        }
    }
}