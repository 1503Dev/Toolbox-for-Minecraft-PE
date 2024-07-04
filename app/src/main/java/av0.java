package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.a;

/* renamed from: av0  reason: default package */
public final class av0 implements mn0 {
    public static final String Q = y20.e("SystemAlarmScheduler");
    public final Context P;

    public av0(Context context) {
        this.P = context.getApplicationContext();
    }

    @Override // defpackage.mn0
    public final void b(String str) {
        Context context = this.P;
        String str2 = a.S;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        this.P.startService(intent);
    }

    @Override // defpackage.mn0
    public final void d(l71... l71VarArr) {
        for (l71 l71Var : l71VarArr) {
            y20.c().a(Q, String.format("Scheduling work with workSpecId %s", l71Var.a), new Throwable[0]);
            this.P.startService(a.c(this.P, l71Var.a));
        }
    }

    @Override // defpackage.mn0
    public final boolean f() {
        return true;
    }
}