package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import java.util.HashMap;
import java.util.WeakHashMap;

public class SystemAlarmService extends d10 implements d.c {
    public static final String S = y20.e("SystemAlarmService");
    public d Q;
    public boolean R;

    public final void d() {
        d dVar = new d(this);
        this.Q = dVar;
        if (dVar.Y != null) {
            y20.c().b(d.Z, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            dVar.Y = this;
        }
    }

    public final void e() {
        this.R = true;
        y20.c().a(S, "All commands completed in dispatcher", new Throwable[0]);
        String str = z51.a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = z51.b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                y20.c().f(z51.a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // defpackage.d10, android.app.Service
    public final void onCreate() {
        super.onCreate();
        d();
        this.R = false;
    }

    @Override // defpackage.d10, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.R = true;
        this.Q.d();
    }

    @Override // defpackage.d10, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.R) {
            y20.c().d(S, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.Q.d();
            d();
            this.R = false;
        }
        if (intent != null) {
            this.Q.b(intent, i2);
            return 3;
        }
        return 3;
    }
}