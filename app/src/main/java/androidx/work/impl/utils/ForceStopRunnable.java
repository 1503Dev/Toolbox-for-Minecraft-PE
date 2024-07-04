package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import defpackage.y20;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ForceStopRunnable implements Runnable {
    public static final String S = y20.e("ForceStopRunnable");
    public static final long T = TimeUnit.DAYS.toMillis(3650);
    public final Context P;
    public final a71 Q;
    public int R = 0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String a = y20.e("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                y20 c = y20.c();
                String str = a;
                if (((y20.a) c).b <= 2) {
                    Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
                }
                ForceStopRunnable.d(context);
            }
        }
    }

    public ForceStopRunnable(Context context, a71 a71Var) {
        this.P = context.getApplicationContext();
        this.Q = a71Var;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void d(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (cb.a()) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + T;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        boolean z2;
        boolean z3;
        PendingIntent broadcast;
        if (Build.VERSION.SDK_INT >= 23) {
            z = nv0.h(this.P, this.Q);
        } else {
            z = false;
        }
        WorkDatabase workDatabase = this.Q.h;
        m71 n = workDatabase.n();
        g71 m = workDatabase.m();
        workDatabase.c();
        try {
            n71 n71Var = (n71) n;
            ArrayList d = n71Var.d();
            boolean z4 = true;
            boolean z5 = !d.isEmpty();
            if (z5) {
                Iterator it = d.iterator();
                while (it.hasNext()) {
                    l71 l71Var = (l71) it.next();
                    n71Var.p(y61.ENQUEUED, l71Var.a);
                    n71Var.l(l71Var.a, -1L);
                }
            }
            ((h71) m).b();
            workDatabase.h();
            if (!z5 && !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            Long a = ((xf0) this.Q.l.a.j()).a("reschedule_needed");
            if (a != null && a.longValue() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                y20.c().a(S, "Rescheduling Workers.", new Throwable[0]);
                this.Q.H1();
                yf0 yf0Var = this.Q.l;
                yf0Var.getClass();
                ((xf0) yf0Var.a.j()).b(new vf0("reschedule_needed", 0L));
                return;
            }
            int i = 536870912;
            try {
                if (cb.a()) {
                    i = 570425344;
                }
                Context context = this.P;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
            } catch (IllegalArgumentException | SecurityException e) {
                y20.c().f(S, "Ignoring exception", e);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.P.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                        if (historicalProcessExitReasons.get(i2).getReason() == 10) {
                            break;
                        }
                    }
                }
            } else if (broadcast == null) {
                d(this.P);
                if (!z4) {
                    y20.c().a(S, "Application was force-stopped, rescheduling.", new Throwable[0]);
                    this.Q.H1();
                    return;
                } else if (z2) {
                    y20.c().a(S, "Found unfinished work, scheduling it.", new Throwable[0]);
                    a71 a71Var = this.Q;
                    nn0.a(a71Var.g, a71Var.h, a71Var.j);
                    return;
                } else {
                    return;
                }
            }
            z4 = false;
            if (!z4) {
            }
        } finally {
            workDatabase.f();
        }
    }

    public final boolean c() {
        a aVar = this.Q.g;
        aVar.getClass();
        if (TextUtils.isEmpty(null)) {
            y20.c().a(S, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a = dg0.a(this.P, aVar);
        y20.c().a(S, String.format("Is default app process = %s", Boolean.valueOf(a)), new Throwable[0]);
        return a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!c()) {
                return;
            }
            while (true) {
                u61.a(this.P);
                y20.c().a(S, "Performing cleanup operations.", new Throwable[0]);
                try {
                    b();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i = this.R + 1;
                    this.R = i;
                    if (i < 3) {
                        y20.c().a(S, String.format("Retrying after %s", Long.valueOf(i * 300)), e);
                        try {
                            Thread.sleep(this.R * 300);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        y20.c().b(S, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        this.Q.g.getClass();
                        throw illegalStateException;
                    }
                }
            }
        } finally {
            this.Q.G1();
        }
    }
}