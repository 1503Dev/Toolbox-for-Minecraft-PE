package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: c02  reason: default package */
public final class c02 implements Application.ActivityLifecycleCallbacks {
    public final Application P;
    public final WeakReference Q;
    public boolean R = false;

    public c02(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.Q = new WeakReference(activityLifecycleCallbacks);
        this.P = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.Q.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
            } else if (!this.R) {
                this.P.unregisterActivityLifecycleCallbacks(this);
                this.R = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.Q.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityDestroyed(activity);
            } else if (!this.R) {
                this.P.unregisterActivityLifecycleCallbacks(this);
                this.R = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.Q.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPaused(activity);
            } else if (!this.R) {
                this.P.unregisterActivityLifecycleCallbacks(this);
                this.R = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.Q.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityResumed(activity);
            } else if (!this.R) {
                this.P.unregisterActivityLifecycleCallbacks(this);
                this.R = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.Q.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
            } else if (!this.R) {
                this.P.unregisterActivityLifecycleCallbacks(this);
                this.R = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.Q.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityStarted(activity);
            } else if (!this.R) {
                this.P.unregisterActivityLifecycleCallbacks(this);
                this.R = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.Q.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityStopped(activity);
            } else if (!this.R) {
                this.P.unregisterActivityLifecycleCallbacks(this);
                this.R = true;
            }
        } catch (Exception unused) {
        }
    }
}