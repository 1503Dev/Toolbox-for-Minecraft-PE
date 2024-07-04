package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class OfflinePingSender extends Worker {
    public final io2 V;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        t42 t42Var = n62.f.b;
        tk2 tk2Var = new tk2();
        t42Var.getClass();
        this.V = (io2) new eq1(context, tk2Var).d(context, false);
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        try {
            this.V.e();
            return new ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return new ListenableWorker.a.C0012a();
        }
    }
}