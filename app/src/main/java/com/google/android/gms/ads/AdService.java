package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;

public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            t42 t42Var = n62.f.b;
            tk2 tk2Var = new tk2();
            t42Var.getClass();
            ((io2) new eq1(this, tk2Var).d(this, false)).v0(intent);
        } catch (RemoteException e) {
            sv2.d("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}