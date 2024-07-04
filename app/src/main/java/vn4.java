package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import java.util.Collections;

/* renamed from: vn4  reason: default package */
public final class vn4 implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})
    public static final vn4 S = new vn4();
    public boolean P;
    public boolean Q;
    public co4 R;

    public final void a() {
        boolean z;
        String str;
        boolean z2 = this.Q;
        for (nn4 nn4Var : Collections.unmodifiableCollection(un4.c.a)) {
            go4 go4Var = nn4Var.d;
            if (go4Var.a.get() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (true != z2) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                yn4.a(go4Var.a(), "setState", str);
            }
        }
    }

    public final void b(boolean z) {
        if (this.Q != z) {
            this.Q = z;
            if (this.P) {
                a();
                if (this.R != null) {
                    if (!z) {
                        so4.g.getClass();
                        so4.b();
                        return;
                    }
                    so4.g.getClass();
                    Handler handler = so4.i;
                    if (handler != null) {
                        handler.removeCallbacks(so4.k);
                        so4.i = null;
                    }
                }
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
        b(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        boolean z;
        View view;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        boolean z2 = false;
        boolean z3 = true;
        for (nn4 nn4Var : Collections.unmodifiableCollection(un4.c.b)) {
            if (nn4Var.e && !nn4Var.f) {
                z = true;
            } else {
                z = false;
            }
            if (z && (view = (View) nn4Var.c.get()) != null && view.hasWindowFocus()) {
                z3 = false;
            }
        }
        if (i != 100 && z3) {
            z2 = true;
        }
        b(z2);
    }
}