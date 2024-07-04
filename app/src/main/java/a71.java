package defpackage;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import defpackage.bm0;
import defpackage.wu0;
import defpackage.y20;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: a71  reason: default package */
public final class a71 extends z61 {
    public static a71 o;
    public static a71 p;
    public static final Object q;
    public Context f;
    public a g;
    public WorkDatabase h;
    public bw0 i;
    public List<mn0> j;
    public eg0 k;
    public yf0 l;
    public boolean m;
    public BroadcastReceiver.PendingResult n;

    static {
        y20.e("WorkManagerImpl");
        o = null;
        p = null;
        q = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e9, code lost:
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0170 A[Catch: InstantiationException -> 0x02b0, IllegalAccessException -> 0x02c7, ClassNotFoundException -> 0x02de, TryCatch #4 {ClassNotFoundException -> 0x02de, IllegalAccessException -> 0x02c7, InstantiationException -> 0x02b0, blocks: (B:40:0x0168, B:44:0x0184, B:43:0x0170), top: B:93:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a71(Context context, a aVar, b71 b71Var) {
        bm0.a aVar2;
        Executor executor;
        ActivityManager activityManager;
        int i;
        Class<T> cls;
        String name;
        String str;
        String str2;
        wu0 e;
        boolean z;
        mn0 mn0Var;
        char c;
        char c2;
        boolean isDeviceProtectedStorage;
        boolean z2 = context.getResources().getBoolean(jh0.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        vq0 vq0Var = b71Var.a;
        int i2 = WorkDatabase.k;
        if (z2) {
            aVar2 = new bm0.a(applicationContext, null);
            aVar2.h = true;
        } else {
            String str3 = u61.a;
            aVar2 = new bm0.a(applicationContext, "androidx.work.workdb");
            aVar2.g = new s61(applicationContext);
        }
        aVar2.e = vq0Var;
        t61 t61Var = new t61();
        if (aVar2.d == null) {
            aVar2.d = new ArrayList<>();
        }
        aVar2.d.add(t61Var);
        aVar2.a(androidx.work.impl.a.a);
        aVar2.a(new a.h(applicationContext, 2, 3));
        aVar2.a(androidx.work.impl.a.b);
        aVar2.a(androidx.work.impl.a.c);
        aVar2.a(new a.h(applicationContext, 5, 6));
        aVar2.a(androidx.work.impl.a.d);
        aVar2.a(androidx.work.impl.a.e);
        aVar2.a(androidx.work.impl.a.f);
        aVar2.a(new a.i(applicationContext));
        aVar2.a(new a.h(applicationContext, 10, 11));
        aVar2.a(androidx.work.impl.a.g);
        aVar2.i = false;
        aVar2.j = true;
        Context context2 = aVar2.c;
        if (context2 != null) {
            if (aVar2.a != null) {
                Executor executor2 = aVar2.e;
                try {
                    if (executor2 == null && aVar2.f == null) {
                        executor = a7.h;
                        aVar2.f = executor;
                    } else {
                        if (executor2 != null && aVar2.f == null) {
                            aVar2.f = executor2;
                        } else if (executor2 == null) {
                            executor = aVar2.f;
                        }
                        if (aVar2.g == null) {
                            aVar2.g = new gs();
                        }
                        String str4 = aVar2.b;
                        wu0.c cVar = aVar2.g;
                        bm0.c cVar2 = aVar2.k;
                        ArrayList<bm0.b> arrayList = aVar2.d;
                        boolean z3 = aVar2.h;
                        activityManager = (ActivityManager) context2.getSystemService("activity");
                        if (activityManager == null && !activityManager.isLowRamDevice()) {
                            i = 3;
                        } else {
                            i = 2;
                        }
                        Executor executor3 = aVar2.e;
                        pj pjVar = new pj(context2, str4, cVar, cVar2, arrayList, z3, i, executor3, aVar2.f, aVar2.i, aVar2.j);
                        cls = aVar2.a;
                        name = cls.getPackage().getName();
                        String canonicalName = cls.getCanonicalName();
                        canonicalName = name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1);
                        str = canonicalName.replace('.', '_') + "_Impl";
                        if (!name.isEmpty()) {
                            str2 = str;
                        } else {
                            str2 = name + "." + str;
                        }
                        bm0 bm0Var = (bm0) Class.forName(str2).newInstance();
                        e = bm0Var.e(pjVar);
                        bm0Var.c = e;
                        if (e instanceof gn0) {
                            ((gn0) e).P = pjVar;
                        }
                        if (i != 3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        e.setWriteAheadLoggingEnabled(z);
                        bm0Var.g = arrayList;
                        bm0Var.b = executor3;
                        new ArrayDeque();
                        bm0Var.e = z3;
                        bm0Var.f = z;
                        WorkDatabase workDatabase = (WorkDatabase) bm0Var;
                        Context applicationContext2 = context.getApplicationContext();
                        y20.a aVar3 = new y20.a(aVar.f);
                        synchronized (y20.class) {
                            y20.a = aVar3;
                        }
                        mn0[] mn0VarArr = new mn0[2];
                        String str5 = nn0.a;
                        if (Build.VERSION.SDK_INT >= 23) {
                            mn0Var = new nv0(applicationContext2, this);
                            kd0.a(applicationContext2, SystemJobService.class, true);
                            y20.c().a(nn0.a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
                            c = 1;
                            c2 = 0;
                        } else {
                            try {
                                mn0Var = (mn0) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(applicationContext2);
                                y20.c().a(nn0.a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
                            } catch (Throwable th) {
                                y20.c().a(nn0.a, "Unable to create GCM Scheduler", th);
                                mn0Var = null;
                            }
                            c = 1;
                            c2 = 0;
                            if (mn0Var == null) {
                                mn0Var = new av0(applicationContext2);
                                kd0.a(applicationContext2, SystemAlarmService.class, true);
                                y20.c().a(nn0.a, "Created SystemAlarmScheduler", new Throwable[0]);
                            }
                        }
                        mn0VarArr[c2] = mn0Var;
                        mn0VarArr[c] = new rt(applicationContext2, aVar, b71Var, this);
                        List<mn0> asList = Arrays.asList(mn0VarArr);
                        eg0 eg0Var = new eg0(context, aVar, b71Var, workDatabase, asList);
                        Context applicationContext3 = context.getApplicationContext();
                        this.f = applicationContext3;
                        this.g = aVar;
                        this.i = b71Var;
                        this.h = workDatabase;
                        this.j = asList;
                        this.k = eg0Var;
                        this.l = new yf0(workDatabase);
                        this.m = false;
                        if (Build.VERSION.SDK_INT >= 24) {
                            isDeviceProtectedStorage = applicationContext3.isDeviceProtectedStorage();
                            if (isDeviceProtectedStorage) {
                                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                            }
                        }
                        ((b71) this.i).a(new ForceStopRunnable(applicationContext3, this));
                        return;
                    }
                    if (!name.isEmpty()) {
                    }
                    bm0 bm0Var2 = (bm0) Class.forName(str2).newInstance();
                    e = bm0Var2.e(pjVar);
                    bm0Var2.c = e;
                    if (e instanceof gn0) {
                    }
                    if (i != 3) {
                    }
                    e.setWriteAheadLoggingEnabled(z);
                    bm0Var2.g = arrayList;
                    bm0Var2.b = executor3;
                    new ArrayDeque();
                    bm0Var2.e = z3;
                    bm0Var2.f = z;
                    WorkDatabase workDatabase2 = (WorkDatabase) bm0Var2;
                    Context applicationContext22 = context.getApplicationContext();
                    y20.a aVar32 = new y20.a(aVar.f);
                    synchronized (y20.class) {
                    }
                } catch (ClassNotFoundException unused) {
                    StringBuilder b = e5.b("cannot find implementation for ");
                    b.append(cls.getCanonicalName());
                    b.append(". ");
                    b.append(str);
                    b.append(" does not exist");
                    throw new RuntimeException(b.toString());
                } catch (IllegalAccessException unused2) {
                    StringBuilder b2 = e5.b("Cannot access the constructor");
                    b2.append(cls.getCanonicalName());
                    throw new RuntimeException(b2.toString());
                } catch (InstantiationException unused3) {
                    StringBuilder b3 = e5.b("Failed to create an instance of ");
                    b3.append(cls.getCanonicalName());
                    throw new RuntimeException(b3.toString());
                }
                aVar2.e = executor;
                if (aVar2.g == null) {
                }
                String str42 = aVar2.b;
                wu0.c cVar3 = aVar2.g;
                bm0.c cVar22 = aVar2.k;
                ArrayList<bm0.b> arrayList2 = aVar2.d;
                boolean z32 = aVar2.h;
                activityManager = (ActivityManager) context2.getSystemService("activity");
                if (activityManager == null) {
                }
                i = 2;
                Executor executor32 = aVar2.e;
                pj pjVar2 = new pj(context2, str42, cVar3, cVar22, arrayList2, z32, i, executor32, aVar2.f, aVar2.i, aVar2.j);
                cls = aVar2.a;
                name = cls.getPackage().getName();
                String canonicalName2 = cls.getCanonicalName();
                if (name.isEmpty()) {
                }
                str = canonicalName2.replace('.', '_') + "_Impl";
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        } else {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
    }

    public static a71 E1(Context context) {
        a71 a71Var;
        Object obj = q;
        synchronized (obj) {
            synchronized (obj) {
                a71Var = o;
                if (a71Var == null) {
                    a71Var = p;
                }
            }
            return a71Var;
        }
        if (a71Var == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof a.b) {
                F1(applicationContext, ((a.b) applicationContext).a());
                a71Var = E1(applicationContext);
            } else {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
        }
        return a71Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (defpackage.a71.p != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        defpackage.a71.p = new defpackage.a71(r4, r5, new defpackage.b71(r5.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        defpackage.a71.o = defpackage.a71.p;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void F1(Context context, androidx.work.a aVar) {
        synchronized (q) {
            a71 a71Var = o;
            if (a71Var != null && p != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
        }
    }

    public final vc0 D1(List list) {
        if (!list.isEmpty()) {
            r61 r61Var = new r61(this, list);
            if (!r61Var.m) {
                xo xoVar = new xo(r61Var);
                ((b71) this.i).a(xoVar);
                r61Var.n = xoVar.Q;
            } else {
                y20.c().f(r61.o, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", r61Var.j)), new Throwable[0]);
            }
            return r61Var.n;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public final void G1() {
        synchronized (q) {
            this.m = true;
            BroadcastReceiver.PendingResult pendingResult = this.n;
            if (pendingResult != null) {
                pendingResult.finish();
                this.n = null;
            }
        }
    }

    public final void H1() {
        if (Build.VERSION.SDK_INT >= 23) {
            nv0.a(this.f);
        }
        n71 n71Var = (n71) this.h.n();
        n71Var.a.b();
        is a = n71Var.i.a();
        n71Var.a.c();
        try {
            a.E();
            n71Var.a.h();
            n71Var.a.f();
            n71Var.i.c(a);
            nn0.a(this.g, this.h, this.j);
        } catch (Throwable th) {
            n71Var.a.f();
            n71Var.i.c(a);
            throw th;
        }
    }

    public final void I1(String str, WorkerParameters.a aVar) {
        ((b71) this.i).a(new rt0(this, str, aVar));
    }

    public final void J1(String str) {
        ((b71) this.i).a(new zt0(this, str, false));
    }
}