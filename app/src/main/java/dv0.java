package defpackage;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: dv0  reason: default package */
public final class dv0 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Notification Q;
    public final /* synthetic */ SystemForegroundService R;

    public dv0(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.R = systemForegroundService;
        this.P = i;
        this.Q = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.R.T.notify(this.P, this.Q);
    }
}