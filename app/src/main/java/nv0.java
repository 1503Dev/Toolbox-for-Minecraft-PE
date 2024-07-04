package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: nv0  reason: default package */
public final class nv0 implements mn0 {
    public static final String T = y20.e("SystemJobScheduler");
    public final Context P;
    public final JobScheduler Q;
    public final a71 R;
    public final mv0 S;

    public nv0(Context context, a71 a71Var) {
        mv0 mv0Var = new mv0(context);
        this.P = context;
        this.R = a71Var;
        this.Q = (JobScheduler) context.getSystemService("jobscheduler");
        this.S = mv0Var;
    }

    public static void a(Context context) {
        ArrayList g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g = g(context, jobScheduler)) == null || g.isEmpty()) {
            return;
        }
        Iterator it = g.iterator();
        while (it.hasNext()) {
            c(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    public static void c(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            y20.c().b(T, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList e(Context context, JobScheduler jobScheduler, String str) {
        String string;
        ArrayList g = g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = g.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            PersistableBundle extras = jobInfo.getExtras();
            if (extras != null) {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    string = extras.getString("EXTRA_WORK_SPEC_ID");
                    if (!str.equals(string)) {
                        arrayList.add(Integer.valueOf(jobInfo.getId()));
                    }
                }
            }
            string = null;
            if (!str.equals(string)) {
            }
        }
        return arrayList;
    }

    public static ArrayList g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            y20.c().b(T, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0085 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean h(Context context, a71 a71Var) {
        int i;
        String string;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList g = g(context, jobScheduler);
        hv0 hv0Var = (hv0) a71Var.h.k();
        hv0Var.getClass();
        boolean z = false;
        em0 a = em0.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        hv0Var.a.b();
        Cursor g2 = hv0Var.a.g(a);
        try {
            ArrayList arrayList = new ArrayList(g2.getCount());
            while (g2.moveToNext()) {
                arrayList.add(g2.getString(0));
            }
            if (g != null) {
                i = g.size();
            } else {
                i = 0;
            }
            HashSet hashSet = new HashSet(i);
            if (g != null && !g.isEmpty()) {
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras != null) {
                        if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                            string = extras.getString("EXTRA_WORK_SPEC_ID");
                            if (TextUtils.isEmpty(string)) {
                                hashSet.add(string);
                            } else {
                                c(jobScheduler, jobInfo.getId());
                            }
                        }
                    }
                    string = null;
                    if (TextUtils.isEmpty(string)) {
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (!hashSet.contains((String) it2.next())) {
                    y20.c().a(T, "Reconciling jobs", new Throwable[0]);
                    z = true;
                    break;
                }
            }
            if (z) {
                WorkDatabase workDatabase = a71Var.h;
                workDatabase.c();
                try {
                    m71 n = workDatabase.n();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ((n71) n).l((String) it3.next(), -1L);
                    }
                    workDatabase.h();
                } finally {
                    workDatabase.f();
                }
            }
            return z;
        } finally {
            g2.close();
            a.F();
        }
    }

    @Override // defpackage.mn0
    public final void b(String str) {
        ArrayList e = e(this.P, this.Q, str);
        if (e != null && !e.isEmpty()) {
            Iterator it = e.iterator();
            while (it.hasNext()) {
                c(this.Q, ((Integer) it.next()).intValue());
            }
            ((hv0) this.R.h.k()).c(str);
        }
    }

    @Override // defpackage.mn0
    public final void d(l71... l71VarArr) {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList e;
        int i5;
        int i6;
        int i7;
        WorkDatabase workDatabase = this.R.h;
        int length = l71VarArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i9 < length) {
            l71 l71Var = l71VarArr[i9];
            workDatabase.c();
            try {
                l71 i10 = ((n71) workDatabase.n()).i(l71Var.a);
                if (i10 == null) {
                    y20 c = y20.c();
                    String str = T;
                    c.f(str, "Skipping scheduling " + l71Var.a + " because it's no longer in the DB", new Throwable[i8]);
                } else if (i10.b != y61.ENQUEUED) {
                    y20 c2 = y20.c();
                    String str2 = T;
                    c2.f(str2, "Skipping scheduling " + l71Var.a + " because it is no longer enqueued", new Throwable[i8]);
                } else {
                    fv0 a = ((hv0) workDatabase.k()).a(l71Var.a);
                    if (a != null) {
                        i4 = a.b;
                        i3 = i9;
                    } else {
                        this.R.g.getClass();
                        int i11 = this.R.g.g;
                        synchronized (zw.class) {
                            workDatabase.c();
                            Long a2 = ((xf0) workDatabase.j()).a("next_job_scheduler_id");
                            if (a2 != null) {
                                i = a2.intValue();
                            } else {
                                i = 0;
                            }
                            if (i == Integer.MAX_VALUE) {
                                i2 = 0;
                            } else {
                                i2 = i + 1;
                            }
                            i3 = i9;
                            ((xf0) workDatabase.j()).b(new vf0("next_job_scheduler_id", i2));
                            workDatabase.h();
                            workDatabase.f();
                            if (i >= 0 && i <= i11) {
                                i4 = i;
                            }
                            ((xf0) workDatabase.j()).b(new vf0("next_job_scheduler_id", 1));
                            i4 = 0;
                        }
                    }
                    if (a == null) {
                        ((hv0) this.R.h.k()).b(new fv0(l71Var.a, i4));
                    }
                    i(l71Var, i4);
                    if (Build.VERSION.SDK_INT == 23 && (e = e(this.P, this.Q, l71Var.a)) != null) {
                        int indexOf = e.indexOf(Integer.valueOf(i4));
                        if (indexOf >= 0) {
                            e.remove(indexOf);
                        }
                        if (!e.isEmpty()) {
                            i7 = ((Integer) e.get(0)).intValue();
                        } else {
                            this.R.g.getClass();
                            int i12 = this.R.g.g;
                            synchronized (zw.class) {
                                workDatabase.c();
                                Long a3 = ((xf0) workDatabase.j()).a("next_job_scheduler_id");
                                if (a3 != null) {
                                    i5 = a3.intValue();
                                } else {
                                    i5 = 0;
                                }
                                if (i5 == Integer.MAX_VALUE) {
                                    i6 = 0;
                                } else {
                                    i6 = i5 + 1;
                                }
                                ((xf0) workDatabase.j()).b(new vf0("next_job_scheduler_id", i6));
                                workDatabase.h();
                                workDatabase.f();
                                if (i5 >= 0 && i5 <= i12) {
                                    i7 = i5;
                                }
                                ((xf0) workDatabase.j()).b(new vf0("next_job_scheduler_id", 1));
                                i7 = 0;
                            }
                        }
                        i(l71Var, i7);
                        workDatabase.h();
                        workDatabase.f();
                        i9 = i3 + 1;
                        i8 = 0;
                    }
                    workDatabase.h();
                    workDatabase.f();
                    i9 = i3 + 1;
                    i8 = 0;
                }
                i3 = i9;
                workDatabase.h();
                workDatabase.f();
                i9 = i3 + 1;
                i8 = 0;
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }

    @Override // defpackage.mn0
    public final boolean f() {
        return true;
    }

    public final void i(l71 l71Var, int i) {
        int i2;
        int i3;
        JobInfo a = this.S.a(l71Var, i);
        y20 c = y20.c();
        String str = T;
        c.a(str, String.format("Scheduling work ID %s Job ID %s", l71Var.a, Integer.valueOf(i)), new Throwable[0]);
        try {
            if (this.Q.schedule(a) == 0) {
                y20.c().f(str, String.format("Unable to schedule work ID %s", l71Var.a), new Throwable[0]);
                if (l71Var.q && l71Var.r == 1) {
                    l71Var.q = false;
                    y20.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", l71Var.a), new Throwable[0]);
                    i(l71Var, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList g = g(this.P, this.Q);
            if (g != null) {
                i2 = g.size();
            } else {
                i2 = 0;
            }
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i2);
            objArr[1] = Integer.valueOf(((n71) this.R.h.n()).e().size());
            a aVar = this.R.g;
            if (Build.VERSION.SDK_INT == 23) {
                i3 = aVar.h / 2;
            } else {
                i3 = aVar.h;
            }
            objArr[2] = Integer.valueOf(i3);
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            y20.c().b(T, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            y20.c().b(T, String.format("Unable to schedule %s", l71Var), th);
        }
    }
}