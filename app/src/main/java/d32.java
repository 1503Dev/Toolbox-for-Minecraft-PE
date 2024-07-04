package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: d32  reason: default package */
public final class d32 implements Application.ActivityLifecycleCallbacks {
    public Activity P;
    public Application Q;
    public c32 W;
    public long Y;
    public final Object R = new Object();
    public boolean S = true;
    public boolean T = false;
    public final ArrayList U = new ArrayList();
    public final ArrayList V = new ArrayList();
    public boolean X = false;

    public final void a(Activity activity) {
        synchronized (this.R) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.P = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.R) {
            Activity activity2 = this.P;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.P = null;
                }
                Iterator it = this.V.iterator();
                while (it.hasNext()) {
                    try {
                        if (((t32) it.next()).a()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        jv5.A.g.f("AppActivityTracker.ActivityListener.onActivityDestroyed", e);
                        sv2.e("", e);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.R) {
            Iterator it = this.V.iterator();
            while (it.hasNext()) {
                try {
                    ((t32) it.next()).c();
                } catch (Exception e) {
                    jv5.A.g.f("AppActivityTracker.ActivityListener.onActivityPaused", e);
                    sv2.e("", e);
                }
            }
        }
        this.T = true;
        c32 c32Var = this.W;
        if (c32Var != null) {
            cu5.i.removeCallbacks(c32Var);
        }
        wi4 wi4Var = cu5.i;
        c32 c32Var2 = new c32(0, this);
        this.W = c32Var2;
        wi4Var.postDelayed(c32Var2, this.Y);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.T = false;
        boolean z = !this.S;
        this.S = true;
        c32 c32Var = this.W;
        if (c32Var != null) {
            cu5.i.removeCallbacks(c32Var);
        }
        synchronized (this.R) {
            Iterator it = this.V.iterator();
            while (it.hasNext()) {
                try {
                    ((t32) it.next()).d();
                } catch (Exception e) {
                    jv5.A.g.f("AppActivityTracker.ActivityListener.onActivityResumed", e);
                    sv2.e("", e);
                }
            }
            if (z) {
                Iterator it2 = this.U.iterator();
                while (it2.hasNext()) {
                    try {
                        ((e32) it2.next()).d(true);
                    } catch (Exception e2) {
                        sv2.e("", e2);
                    }
                }
            } else {
                sv2.b("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}