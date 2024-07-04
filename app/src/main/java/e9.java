package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: e9  reason: default package */
public final class e9 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final e9 T = new e9();
    public final AtomicBoolean P = new AtomicBoolean();
    public final AtomicBoolean Q = new AtomicBoolean();
    @GuardedBy("sInstance")
    public final ArrayList<a> R = new ArrayList<>();
    @GuardedBy("sInstance")
    public boolean S = false;

    /* renamed from: e9$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void a(boolean z);
    }

    public final void a(boolean z) {
        synchronized (T) {
            Iterator<a> it = this.R.iterator();
            while (it.hasNext()) {
                it.next().a(z);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.P.compareAndSet(true, false);
        this.Q.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.P.compareAndSet(true, false);
        this.Q.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.P.compareAndSet(false, true)) {
            this.Q.set(true);
            a(true);
        }
    }
}