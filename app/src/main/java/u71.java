package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* renamed from: u71  reason: default package */
public abstract class u71 {
    public static final String a = y20.e("WorkerFactory");

    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        ListenableWorker listenableWorker = null;
        try {
            cls = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th) {
            y20.c().b(a, k6.b("Invalid class: ", str), th);
            cls = null;
        }
        if (cls != null) {
            try {
                listenableWorker = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                y20.c().b(a, k6.b("Could not instantiate ", str), th2);
            }
        }
        if (listenableWorker != null && listenableWorker.isUsed()) {
            throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
        }
        return listenableWorker;
    }
}