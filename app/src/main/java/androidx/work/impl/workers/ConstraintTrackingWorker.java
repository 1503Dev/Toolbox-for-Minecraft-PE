package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements p61 {
    public static final String Z = y20.e("ConstraintTrkngWrkr");
    public WorkerParameters U;
    public final Object V;
    public volatile boolean W;
    public yq0<ListenableWorker.a> X;
    public ListenableWorker Y;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            Object obj = constraintTrackingWorker.getInputData().a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                y20.c().b(ConstraintTrackingWorker.Z, "No worker to delegate to.", new Throwable[0]);
            } else {
                ListenableWorker a = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), str, constraintTrackingWorker.U);
                constraintTrackingWorker.Y = a;
                if (a == null) {
                    y20.c().a(ConstraintTrackingWorker.Z, "No worker to delegate to.", new Throwable[0]);
                } else {
                    l71 i = ((n71) a71.E1(constraintTrackingWorker.getApplicationContext()).h.n()).i(constraintTrackingWorker.getId().toString());
                    if (i != null) {
                        q61 q61Var = new q61(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
                        q61Var.b(Collections.singletonList(i));
                        if (q61Var.a(constraintTrackingWorker.getId().toString())) {
                            y20.c().a(ConstraintTrackingWorker.Z, String.format("Constraints met for delegate %s", str), new Throwable[0]);
                            try {
                                i20<ListenableWorker.a> startWork = constraintTrackingWorker.Y.startWork();
                                ((e0) startWork).c(new rf(constraintTrackingWorker, startWork), constraintTrackingWorker.getBackgroundExecutor());
                                return;
                            } catch (Throwable th) {
                                y20 c = y20.c();
                                String str2 = ConstraintTrackingWorker.Z;
                                c.a(str2, String.format("Delegated worker %s threw exception in startWork.", str), th);
                                synchronized (constraintTrackingWorker.V) {
                                    if (constraintTrackingWorker.W) {
                                        y20.c().a(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                                        constraintTrackingWorker.X.j(new ListenableWorker.a.b());
                                    } else {
                                        constraintTrackingWorker.a();
                                    }
                                    return;
                                }
                            }
                        }
                        y20.c().a(ConstraintTrackingWorker.Z, String.format("Constraints not met for delegate %s. Requesting retry.", str), new Throwable[0]);
                        constraintTrackingWorker.X.j(new ListenableWorker.a.b());
                        return;
                    }
                }
            }
            constraintTrackingWorker.a();
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.U = workerParameters;
        this.V = new Object();
        this.W = false;
        this.X = new yq0<>();
    }

    public final void a() {
        this.X.j(new ListenableWorker.a.C0012a());
    }

    @Override // defpackage.p61
    public final void c(ArrayList arrayList) {
        y20.c().a(Z, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.V) {
            this.W = true;
        }
    }

    @Override // defpackage.p61
    public final void e(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public final bw0 getTaskExecutor() {
        return a71.E1(getApplicationContext()).i;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.Y;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.Y;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.Y.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final i20<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.X;
    }
}