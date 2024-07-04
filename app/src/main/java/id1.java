package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: id1  reason: default package */
public final class id1 implements Application.ActivityLifecycleCallbacks {
    public final HashSet P = new HashSet();
    public final /* synthetic */ ad1 Q;

    public id1(ad1 ad1Var) {
        this.Q = ad1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        re1 re1Var = this.Q.c;
        if (!re1Var.e) {
            re1Var.c(true);
        }
        ga1.P = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ga1.S = false;
        this.Q.c.d(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ScheduledExecutorService scheduledExecutorService;
        this.P.add(Integer.valueOf(activity.hashCode()));
        ga1.S = true;
        ga1.P = activity;
        me1 me1Var = this.Q.n().e;
        Context context = ga1.P;
        if (context != null && this.Q.c.c && (context instanceof ia1) && !((ia1) context).S) {
            return;
        }
        ga1.P = activity;
        rc1 rc1Var = this.Q.s;
        if (rc1Var != null) {
            if (!Objects.equals(rc1Var.b.q("m_origin"), "")) {
                rc1 rc1Var2 = this.Q.s;
                rc1Var2.a(rc1Var2.b).b();
            }
            this.Q.s = null;
        }
        ad1 ad1Var = this.Q;
        ad1Var.B = false;
        re1 re1Var = ad1Var.c;
        re1Var.i = false;
        if (ad1Var.E && !re1Var.e) {
            re1Var.c(true);
        }
        this.Q.c.d(true);
        ie1 ie1Var = this.Q.e;
        rc1 rc1Var3 = ie1Var.a;
        if (rc1Var3 != null) {
            ie1Var.a(rc1Var3);
            ie1Var.a = null;
        }
        if (me1Var == null || (scheduledExecutorService = me1Var.b) == null || scheduledExecutorService.isShutdown() || me1Var.b.isTerminated()) {
            w1.c(activity, ga1.h().r);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        re1 re1Var = this.Q.c;
        if (!re1Var.f) {
            re1Var.f = true;
            re1Var.g = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.P.remove(Integer.valueOf(activity.hashCode()));
        if (this.P.isEmpty()) {
            re1 re1Var = this.Q.c;
            if (re1Var.f) {
                re1Var.f = false;
                re1Var.g = true;
                re1Var.a(false);
            }
        }
    }
}