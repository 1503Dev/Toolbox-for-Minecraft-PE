package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;

public class SystemJobService extends JobService implements mp {
    public static final String R = y20.e("SystemJobService");
    public a71 P;
    public final HashMap Q = new HashMap();

    @Override // defpackage.mp
    public final void a(String str, boolean z) {
        JobParameters jobParameters;
        y20.c().a(R, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.Q) {
            jobParameters = (JobParameters) this.Q.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            a71 E1 = a71.E1(getApplicationContext());
            this.P = E1;
            E1.k.b(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                y20.c().f(R, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        a71 a71Var = this.P;
        if (a71Var != null) {
            eg0 eg0Var = a71Var.k;
            synchronized (eg0Var.Z) {
                eg0Var.Y.remove(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStartJob(JobParameters jobParameters) {
        String str;
        PersistableBundle extras;
        if (this.P == null) {
            y20.c().a(R, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        WorkerParameters.a aVar = null;
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
            str = extras.getString("EXTRA_WORK_SPEC_ID");
            if (!TextUtils.isEmpty(str)) {
                y20.c().b(R, "WorkSpec id not found!", new Throwable[0]);
                return false;
            }
            synchronized (this.Q) {
                if (this.Q.containsKey(str)) {
                    y20.c().a(R, String.format("Job is already being executed by SystemJobService: %s", str), new Throwable[0]);
                    return false;
                }
                y20.c().a(R, String.format("onStartJob for %s", str), new Throwable[0]);
                this.Q.put(str, jobParameters);
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    aVar = new WorkerParameters.a();
                    if (le0.b(jobParameters) != null) {
                        aVar.b = Arrays.asList(le0.b(jobParameters));
                    }
                    if (ov0.a(jobParameters) != null) {
                        aVar.a = Arrays.asList(ov0.a(jobParameters));
                    }
                    if (i >= 28) {
                        aVar.c = pv0.a(jobParameters);
                    }
                }
                this.P.I1(str, aVar);
                return true;
            }
        }
        str = null;
        if (!TextUtils.isEmpty(str)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStopJob(JobParameters jobParameters) {
        String str;
        boolean contains;
        PersistableBundle extras;
        if (this.P == null) {
            y20.c().a(R, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
            str = extras.getString("EXTRA_WORK_SPEC_ID");
            if (!TextUtils.isEmpty(str)) {
                y20.c().b(R, "WorkSpec id not found!", new Throwable[0]);
                return false;
            }
            y20.c().a(R, String.format("onStopJob for %s", str), new Throwable[0]);
            synchronized (this.Q) {
                this.Q.remove(str);
            }
            this.P.J1(str);
            eg0 eg0Var = this.P.k;
            synchronized (eg0Var.Z) {
                contains = eg0Var.X.contains(str);
            }
            return !contains;
        }
        str = null;
        if (!TextUtils.isEmpty(str)) {
        }
    }
}