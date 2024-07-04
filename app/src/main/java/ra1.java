package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import java.util.Collections;

/* renamed from: ra1  reason: default package */
public final class ra1 implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})
    public static ra1 S = new ra1();
    public boolean P;
    public boolean Q;
    public a R;

    /* renamed from: ra1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    public final void a(boolean z) {
        if (this.Q != z) {
            this.Q = z;
            if (this.P) {
                b();
                if (this.R != null) {
                    if (!z) {
                        g11.h.getClass();
                        g11.a();
                        return;
                    }
                    g11.h.getClass();
                    Handler handler = g11.j;
                    if (handler != null) {
                        handler.removeCallbacks(g11.l);
                        g11.j = null;
                    }
                }
            }
        }
    }

    public final void b() {
        boolean z;
        String str;
        boolean z2 = !this.Q;
        for (z91 z91Var : Collections.unmodifiableCollection(aa1.c.a)) {
            g3 g3Var = z91Var.j;
            if (g3Var.a.get() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (z2) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                gw.d(g3Var.f(), "setState", str);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        boolean z;
        boolean z2;
        View view;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z3 = false;
        if (runningAppProcessInfo.importance != 100) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = true;
        for (z91 z91Var : Collections.unmodifiableCollection(aa1.c.b)) {
            if (z91Var.k && !z91Var.l) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (view = z91Var.i.get()) != null && view.hasWindowFocus()) {
                z4 = false;
            }
        }
        if (z && z4) {
            z3 = true;
        }
        a(z3);
    }
}