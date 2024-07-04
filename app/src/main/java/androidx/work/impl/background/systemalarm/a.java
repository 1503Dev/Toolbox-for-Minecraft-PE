package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class a implements mp {
    public static final String S = y20.e("CommandHandler");
    public final Context P;
    public final HashMap Q = new HashMap();
    public final Object R = new Object();

    public a(Context context) {
        this.P = context;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // defpackage.mp
    public final void a(String str, boolean z) {
        synchronized (this.R) {
            mp mpVar = (mp) this.Q.remove(str);
            if (mpVar != null) {
                mpVar.a(str, z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, Intent intent, d dVar) {
        boolean z;
        boolean z2;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            y20.c().a(S, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            Context context = this.P;
            b bVar = new b(context, i, dVar);
            ArrayList e = ((n71) dVar.T.h.n()).e();
            String str = ConstraintProxy.a;
            Iterator it = e.iterator();
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            while (it.hasNext()) {
                sf sfVar = ((l71) it.next()).j;
                z3 |= sfVar.d;
                z4 |= sfVar.b;
                z5 |= sfVar.e;
                if (sfVar.a != o90.NOT_REQUIRED) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z6 |= z2;
                if (z3 && z4 && z5 && z6) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z4).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z5).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z6);
            context.sendBroadcast(intent2);
            bVar.d.b(e);
            ArrayList arrayList = new ArrayList(e.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = e.iterator();
            while (it2.hasNext()) {
                l71 l71Var = (l71) it2.next();
                String str3 = l71Var.a;
                if (currentTimeMillis >= l71Var.a() && (!l71Var.b() || bVar.d.a(str3))) {
                    arrayList.add(l71Var);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str4 = ((l71) it3.next()).a;
                Intent b = b(bVar.a, str4);
                y20.c().a(b.e, String.format("Creating a delay_met command for workSpec with id (%s)", str4), new Throwable[0]);
                d dVar2 = bVar.c;
                dVar2.e(new d.b(bVar.b, b, dVar2));
            }
            bVar.d.c();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            y20.c().a(S, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            dVar.T.H1();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras != null && !extras.isEmpty()) {
                for (int i2 = 0; i2 < 1; i2++) {
                    if (extras.get(strArr[i2]) != null) {
                    }
                }
                z = true;
                if (z) {
                    y20.c().b(S, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
                    return;
                } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                    String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
                    y20 c = y20.c();
                    String str5 = S;
                    c.a(str5, String.format("Handling schedule work for %s", string), new Throwable[0]);
                    WorkDatabase workDatabase = dVar.T.h;
                    workDatabase.c();
                    try {
                        l71 i3 = ((n71) workDatabase.n()).i(string);
                        if (i3 == null) {
                            y20 c2 = y20.c();
                            c2.f(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                        } else if (i3.b.b()) {
                            y20 c3 = y20.c();
                            c3.f(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                        } else {
                            long a = i3.a();
                            if (!i3.b()) {
                                y20.c().a(str5, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a)), new Throwable[0]);
                                p3.b(this.P, dVar.T, string, a);
                            } else {
                                y20.c().a(str5, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a)), new Throwable[0]);
                                p3.b(this.P, dVar.T, string, a);
                                Intent intent3 = new Intent(this.P, SystemAlarmService.class);
                                intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                                dVar.e(new d.b(i, intent3, dVar));
                            }
                            workDatabase.h();
                        }
                        return;
                    } finally {
                        workDatabase.f();
                    }
                } else if ("ACTION_DELAY_MET".equals(action)) {
                    Bundle extras2 = intent.getExtras();
                    synchronized (this.R) {
                        String string2 = extras2.getString("KEY_WORKSPEC_ID");
                        y20 c4 = y20.c();
                        String str6 = S;
                        c4.a(str6, String.format("Handing delay met for %s", string2), new Throwable[0]);
                        if (!this.Q.containsKey(string2)) {
                            c cVar = new c(this.P, i, string2, dVar);
                            this.Q.put(string2, cVar);
                            cVar.f();
                        } else {
                            y20.c().a(str6, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                        }
                    }
                    return;
                } else if ("ACTION_STOP_WORK".equals(action)) {
                    String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
                    y20.c().a(S, String.format("Handing stopWork work for %s", string3), new Throwable[0]);
                    dVar.T.J1(string3);
                    Context context2 = this.P;
                    a71 a71Var = dVar.T;
                    String str7 = p3.a;
                    hv0 hv0Var = (hv0) a71Var.h.k();
                    fv0 a2 = hv0Var.a(string3);
                    if (a2 != null) {
                        p3.a(a2.b, context2, string3);
                        y20.c().a(p3.a, String.format("Removing SystemIdInfo for workSpecId (%s)", string3), new Throwable[0]);
                        hv0Var.c(string3);
                    }
                    dVar.a(string3, false);
                    return;
                } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                    Bundle extras3 = intent.getExtras();
                    String string4 = extras3.getString("KEY_WORKSPEC_ID");
                    boolean z7 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                    y20.c().a(S, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
                    a(string4, z7);
                    return;
                } else {
                    y20.c().f(S, String.format("Ignoring intent %s", intent), new Throwable[0]);
                    return;
                }
            }
            z = false;
            if (z) {
            }
        }
    }
}