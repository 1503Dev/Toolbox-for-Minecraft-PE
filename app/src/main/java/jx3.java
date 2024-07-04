package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: jx3  reason: default package */
public final class jx3 extends ox3 {
    public wp2 h;

    public jx3(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.e = context;
        this.f = jv5.A.r.a();
        this.g = scheduledExecutorService;
    }

    @Override // defpackage.k9.a
    public final synchronized void c0() {
        if (!this.c) {
            this.c = true;
            try {
                ((eq2) this.d.v()).G3(this.h, new nx3(this));
            } catch (RemoteException unused) {
                this.a.c(new gw3(1));
            } catch (Throwable th) {
                jv5.A.g.f("RemoteAdsServiceProxyClientTask.onConnected", th);
                this.a.c(th);
            }
        }
    }
}