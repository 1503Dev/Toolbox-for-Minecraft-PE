package defpackage;

import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: ev0  reason: default package */
public final class ev0 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ SystemForegroundService Q;

    public ev0(SystemForegroundService systemForegroundService, int i) {
        this.Q = systemForegroundService;
        this.P = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Q.T.cancel(this.P);
    }
}