package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class DiagnosticsWorker extends Worker {
    public static final String V = y20.e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(d71 d71Var, p71 p71Var, gv0 gv0Var, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 23) {
            str = "Job Id";
        } else {
            str = "Alarm Id";
        }
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", str));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l71 l71Var = (l71) it.next();
            fv0 a = ((hv0) gv0Var).a(l71Var.a);
            Integer num = null;
            if (a != null) {
                num = Integer.valueOf(a.b);
            }
            String str2 = l71Var.a;
            e71 e71Var = (e71) d71Var;
            e71Var.getClass();
            em0 a2 = em0.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                a2.y(1);
            } else {
                a2.E(1, str2);
            }
            e71Var.a.b();
            Cursor g = e71Var.a.g(a2);
            try {
                ArrayList arrayList2 = new ArrayList(g.getCount());
                while (g.moveToNext()) {
                    arrayList2.add(g.getString(0));
                }
                g.close();
                a2.F();
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", l71Var.a, l71Var.c, num, l71Var.b.name(), TextUtils.join(",", arrayList2), TextUtils.join(",", ((q71) p71Var).a(l71Var.a))));
            } catch (Throwable th) {
                g.close();
                a2.F();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        em0 em0Var;
        ArrayList arrayList;
        gv0 gv0Var;
        d71 d71Var;
        p71 p71Var;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        WorkDatabase workDatabase = a71.E1(getApplicationContext()).h;
        m71 n = workDatabase.n();
        d71 l = workDatabase.l();
        p71 o = workDatabase.o();
        gv0 k = workDatabase.k();
        n71 n71Var = (n71) n;
        n71Var.getClass();
        em0 a = em0.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        a.t(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L), 1);
        n71Var.a.b();
        Cursor g = n71Var.a.g(a);
        try {
            int i2 = ea2.i(g, "required_network_type");
            int i3 = ea2.i(g, "requires_charging");
            int i4 = ea2.i(g, "requires_device_idle");
            int i5 = ea2.i(g, "requires_battery_not_low");
            int i6 = ea2.i(g, "requires_storage_not_low");
            int i7 = ea2.i(g, "trigger_content_update_delay");
            int i8 = ea2.i(g, "trigger_max_content_delay");
            int i9 = ea2.i(g, "content_uri_triggers");
            int i10 = ea2.i(g, "id");
            int i11 = ea2.i(g, "state");
            int i12 = ea2.i(g, "worker_class_name");
            int i13 = ea2.i(g, "input_merger_class_name");
            int i14 = ea2.i(g, "input");
            int i15 = ea2.i(g, "output");
            em0Var = a;
            try {
                int i16 = ea2.i(g, "initial_delay");
                int i17 = ea2.i(g, "interval_duration");
                int i18 = ea2.i(g, "flex_duration");
                int i19 = ea2.i(g, "run_attempt_count");
                int i20 = ea2.i(g, "backoff_policy");
                int i21 = ea2.i(g, "backoff_delay_duration");
                int i22 = ea2.i(g, "period_start_time");
                int i23 = ea2.i(g, "minimum_retention_duration");
                int i24 = ea2.i(g, "schedule_requested_at");
                int i25 = ea2.i(g, "run_in_foreground");
                int i26 = ea2.i(g, "out_of_quota_policy");
                int i27 = i15;
                ArrayList arrayList2 = new ArrayList(g.getCount());
                while (true) {
                    arrayList = arrayList2;
                    if (!g.moveToNext()) {
                        break;
                    }
                    String string = g.getString(i10);
                    String string2 = g.getString(i12);
                    int i28 = i12;
                    sf sfVar = new sf();
                    int i29 = i2;
                    sfVar.a = s71.c(g.getInt(i2));
                    if (g.getInt(i3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sfVar.b = z;
                    if (g.getInt(i4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sfVar.c = z2;
                    if (g.getInt(i5) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sfVar.d = z3;
                    if (g.getInt(i6) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sfVar.e = z4;
                    int i30 = i3;
                    int i31 = i4;
                    sfVar.f = g.getLong(i7);
                    sfVar.g = g.getLong(i8);
                    sfVar.h = s71.a(g.getBlob(i9));
                    l71 l71Var = new l71(string, string2);
                    l71Var.b = s71.e(g.getInt(i11));
                    l71Var.d = g.getString(i13);
                    l71Var.e = b.a(g.getBlob(i14));
                    int i32 = i27;
                    l71Var.f = b.a(g.getBlob(i32));
                    i27 = i32;
                    int i33 = i13;
                    int i34 = i16;
                    l71Var.g = g.getLong(i34);
                    int i35 = i14;
                    int i36 = i17;
                    l71Var.h = g.getLong(i36);
                    int i37 = i11;
                    int i38 = i18;
                    l71Var.i = g.getLong(i38);
                    int i39 = i19;
                    l71Var.k = g.getInt(i39);
                    int i40 = i20;
                    l71Var.l = s71.b(g.getInt(i40));
                    i18 = i38;
                    int i41 = i21;
                    l71Var.m = g.getLong(i41);
                    int i42 = i22;
                    l71Var.n = g.getLong(i42);
                    i22 = i42;
                    int i43 = i23;
                    l71Var.o = g.getLong(i43);
                    int i44 = i24;
                    l71Var.p = g.getLong(i44);
                    int i45 = i25;
                    if (g.getInt(i45) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    l71Var.q = z5;
                    int i46 = i26;
                    l71Var.r = s71.d(g.getInt(i46));
                    l71Var.j = sfVar;
                    arrayList.add(l71Var);
                    i26 = i46;
                    i14 = i35;
                    i3 = i30;
                    i17 = i36;
                    i19 = i39;
                    i24 = i44;
                    i25 = i45;
                    i23 = i43;
                    i16 = i34;
                    i13 = i33;
                    i4 = i31;
                    i2 = i29;
                    arrayList2 = arrayList;
                    i12 = i28;
                    i21 = i41;
                    i11 = i37;
                    i20 = i40;
                }
                g.close();
                em0Var.F();
                ArrayList d = n71Var.d();
                ArrayList b = n71Var.b();
                if (!arrayList.isEmpty()) {
                    y20 c = y20.c();
                    String str = V;
                    i = 0;
                    c.d(str, "Recently completed work:\n\n", new Throwable[0]);
                    gv0Var = k;
                    d71Var = l;
                    p71Var = o;
                    y20.c().d(str, a(d71Var, p71Var, gv0Var, arrayList), new Throwable[0]);
                } else {
                    gv0Var = k;
                    d71Var = l;
                    p71Var = o;
                    i = 0;
                }
                if (!d.isEmpty()) {
                    y20 c2 = y20.c();
                    String str2 = V;
                    c2.d(str2, "Running work:\n\n", new Throwable[i]);
                    y20.c().d(str2, a(d71Var, p71Var, gv0Var, d), new Throwable[i]);
                }
                if (!b.isEmpty()) {
                    y20 c3 = y20.c();
                    String str3 = V;
                    c3.d(str3, "Enqueued work:\n\n", new Throwable[i]);
                    y20.c().d(str3, a(d71Var, p71Var, gv0Var, b), new Throwable[i]);
                }
                return new ListenableWorker.a.c();
            } catch (Throwable th) {
                th = th;
                g.close();
                em0Var.F();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            em0Var = a;
        }
    }
}