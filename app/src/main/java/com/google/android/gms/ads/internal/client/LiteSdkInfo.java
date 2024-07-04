package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

public class LiteSdkInfo extends r43 {
    public LiteSdkInfo(Context context) {
    }

    @Override // defpackage.e53
    public wk2 getAdapterCreator() {
        return new tk2();
    }

    @Override // defpackage.e53
    public da4 getLiteSdkVersion() {
        return new da4(ModuleDescriptor.MODULE_VERSION, 231004000, "22.1.0");
    }
}