package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class OfflineNotificationPoster extends Worker {
    public final io2 V;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        t42 t42Var = n62.f.b;
        tk2 tk2Var = new tk2();
        t42Var.getClass();
        this.V = (io2) new eq1(context, tk2Var).d(context, false);
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        String str;
        Object obj = getInputData().a.get("uri");
        String str2 = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = getInputData().a.get("gws_query_id");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        }
        try {
            this.V.q4(new va0(getApplicationContext()), str, str2);
            return new ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return new ListenableWorker.a.C0012a();
        }
    }
}