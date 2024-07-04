package defpackage;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: cv0  reason: default package */
public final class cv0 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Notification Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ SystemForegroundService S;

    public cv0(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.S = systemForegroundService;
        this.P = i;
        this.Q = notification;
        this.R = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.S.startForeground(this.P, this.Q, this.R);
        } else {
            this.S.startForeground(this.P, this.Q);
        }
    }
}