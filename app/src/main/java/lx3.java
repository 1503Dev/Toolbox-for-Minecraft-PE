package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: lx3  reason: default package */
public final class lx3 extends ox3 {
    public sp2 h;

    public lx3(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.e = context;
        this.f = jv5.A.r.a();
        this.g = scheduledExecutorService;
    }

    @Override // defpackage.ox3, defpackage.k9.a
    public final void A(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        sv2.b(format);
        this.a.c(new gw3(format));
    }

    @Override // defpackage.k9.a
    public final synchronized void c0() {
        if (!this.c) {
            this.c = true;
            try {
                ((eq2) this.d.v()).b4(this.h, new nx3(this));
            } catch (RemoteException unused) {
                this.a.c(new gw3(1));
            } catch (Throwable th) {
                jv5.A.g.f("RemoteAdsServiceSignalClientTask.onConnected", th);
                this.a.c(th);
            }
        }
    }
}