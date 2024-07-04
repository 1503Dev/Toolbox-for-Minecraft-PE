package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: m24  reason: default package */
public final class m24 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ h34 P;

    public m24(h34 h34Var) {
        this.P = h34Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.P.b(new jw3(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.P.b(new r14(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.P.b(new ty3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.P.b(new yx3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        dv2 dv2Var = new dv2();
        this.P.b(new t04(this, activity, dv2Var));
        Bundle A = dv2Var.A(50L);
        if (A != null) {
            bundle.putAll(A);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.P.b(new ex3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.P.b(new a04(this, activity));
    }
}