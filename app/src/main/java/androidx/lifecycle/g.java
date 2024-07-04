package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.c;

public final class g extends Fragment {

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            lf.a(activity, new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            g.a(activity, c.b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            g.a(activity, c.b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            g.a(activity, c.b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            g.a(activity, c.b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            g.a(activity, c.b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            g.a(activity, c.b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Activity activity, c.b bVar) {
        if (activity instanceof c10) {
            ((c10) activity).c().d(bVar);
        } else if (activity instanceof b10) {
            e k = ((b10) activity).k();
            if (k instanceof e) {
                k.d(bVar);
            }
        }
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new g(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(c.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), bVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(c.b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        b(c.b.ON_DESTROY);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        b(c.b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        b(c.b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        b(c.b.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        b(c.b.ON_STOP);
    }
}