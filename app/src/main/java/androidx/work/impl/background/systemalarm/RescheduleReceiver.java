package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = y20.e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        y20.c().a(a, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                a71 E1 = a71.E1(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                E1.getClass();
                synchronized (a71.q) {
                    E1.n = goAsync;
                    if (E1.m) {
                        goAsync.finish();
                        E1.n = null;
                    }
                }
                return;
            } catch (IllegalStateException e) {
                y20.c().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
                return;
            }
        }
        String str = a.S;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_RESCHEDULE");
        context.startService(intent2);
    }
}