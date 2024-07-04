package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.a;

/* renamed from: p3  reason: default package */
public final class p3 {
    public static final String a = y20.e("Alarms");

    public static void a(int i, Context context, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, a.b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        y20.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, a71 a71Var, String str, long j) {
        int i;
        WorkDatabase workDatabase = a71Var.h;
        hv0 hv0Var = (hv0) workDatabase.k();
        fv0 a2 = hv0Var.a(str);
        if (a2 != null) {
            a(a2.b, context, str);
            c(context, str, a2.b, j);
            return;
        }
        synchronized (zw.class) {
            workDatabase.c();
            Long a3 = ((xf0) workDatabase.j()).a("next_alarm_manager_id");
            int i2 = 0;
            if (a3 != null) {
                i = a3.intValue();
            } else {
                i = 0;
            }
            if (i != Integer.MAX_VALUE) {
                i2 = i + 1;
            }
            ((xf0) workDatabase.j()).b(new vf0("next_alarm_manager_id", i2));
            workDatabase.h();
            workDatabase.f();
        }
        hv0Var.b(new fv0(str, i));
        c(context, str, i, j);
    }

    public static void c(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, a.b(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}