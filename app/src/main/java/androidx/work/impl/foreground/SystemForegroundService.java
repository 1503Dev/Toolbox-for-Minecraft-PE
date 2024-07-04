package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.impl.foreground.a;
import java.util.Map;
import java.util.UUID;

public class SystemForegroundService extends d10 implements a.InterfaceC0016a {
    public static final String U = y20.e("SystemFgService");
    public Handler Q;
    public boolean R;
    public a S;
    public NotificationManager T;

    public final void d() {
        this.Q = new Handler(Looper.getMainLooper());
        this.T = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.S = aVar;
        if (aVar.Y != null) {
            y20.c().b(a.Z, "A callback already exists.", new Throwable[0]);
        } else {
            aVar.Y = this;
        }
    }

    @Override // defpackage.d10, android.app.Service
    public final void onCreate() {
        super.onCreate();
        d();
    }

    @Override // defpackage.d10, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.S;
        aVar.Y = null;
        synchronized (aVar.S) {
            aVar.X.c();
        }
        eg0 eg0Var = aVar.Q.k;
        synchronized (eg0Var.Z) {
            eg0Var.Y.remove(aVar);
        }
    }

    @Override // defpackage.d10, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        int i3 = 0;
        if (this.R) {
            y20.c().d(U, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            a aVar = this.S;
            aVar.Y = null;
            synchronized (aVar.S) {
                aVar.X.c();
            }
            eg0 eg0Var = aVar.Q.k;
            synchronized (eg0Var.Z) {
                eg0Var.Y.remove(aVar);
            }
            d();
            this.R = false;
        }
        if (intent != null) {
            a aVar2 = this.S;
            aVar2.getClass();
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                y20.c().d(a.Z, String.format("Started foreground service %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                ((b71) aVar2.R).a(new bv0(aVar2, aVar2.Q.h, stringExtra));
            } else if (!"ACTION_NOTIFY".equals(action)) {
                if ("ACTION_CANCEL_WORK".equals(action)) {
                    y20.c().d(a.Z, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                    String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                    if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2)) {
                        a71 a71Var = aVar2.Q;
                        UUID fromString = UUID.fromString(stringExtra2);
                        a71Var.getClass();
                        ((b71) a71Var.i).a(new xb(a71Var, fromString));
                    }
                } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                    y20.c().d(a.Z, "Stopping foreground service", new Throwable[0]);
                    a.InterfaceC0016a interfaceC0016a = aVar2.Y;
                    if (interfaceC0016a != null) {
                        SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0016a;
                        systemForegroundService.R = true;
                        y20.c().a(U, "All commands completed.", new Throwable[0]);
                        if (Build.VERSION.SDK_INT >= 26) {
                            systemForegroundService.stopForeground(true);
                        }
                        systemForegroundService.stopSelf();
                    }
                }
            }
            int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
            int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
            String stringExtra3 = intent.getStringExtra("KEY_WORKSPEC_ID");
            Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
            y20.c().a(a.Z, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra3, Integer.valueOf(intExtra2)), new Throwable[0]);
            if (notification != null && aVar2.Y != null) {
                aVar2.U.put(stringExtra3, new br(intExtra, intExtra2, notification));
                if (TextUtils.isEmpty(aVar2.T)) {
                    aVar2.T = stringExtra3;
                    SystemForegroundService systemForegroundService2 = (SystemForegroundService) aVar2.Y;
                    systemForegroundService2.Q.post(new cv0(systemForegroundService2, intExtra, notification, intExtra2));
                } else {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) aVar2.Y;
                    systemForegroundService3.Q.post(new dv0(systemForegroundService3, intExtra, notification));
                    if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                        for (Map.Entry entry : aVar2.U.entrySet()) {
                            i3 |= ((br) entry.getValue()).b;
                        }
                        br brVar = (br) aVar2.U.get(aVar2.T);
                        if (brVar != null) {
                            SystemForegroundService systemForegroundService4 = (SystemForegroundService) aVar2.Y;
                            systemForegroundService4.Q.post(new cv0(systemForegroundService4, brVar.a, brVar.c, i3));
                        }
                    }
                }
            }
        }
        return 3;
    }
}