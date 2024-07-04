package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: o1  reason: default package */
public final class o1 {
    public static final Class<?> a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    /* renamed from: o1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ c P;
        public final /* synthetic */ Object Q;

        public a(c cVar, Object obj) {
            this.P = cVar;
            this.Q = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.P.P = this.Q;
        }
    }

    /* renamed from: o1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public final /* synthetic */ Application P;
        public final /* synthetic */ c Q;

        public b(Application application, c cVar) {
            this.P = application;
            this.Q = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.P.unregisterActivityLifecycleCallbacks(this.Q);
        }
    }

    /* renamed from: o1$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public Object P;
        public Activity Q;
        public final int R;
        public boolean S = false;
        public boolean T = false;
        public boolean U = false;

        public c(Activity activity) {
            this.Q = activity;
            this.R = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.Q == activity) {
                this.Q = null;
                this.T = true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
            r5.U = true;
            r5.P = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
            return;
         */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onActivityPaused(Activity activity) {
            if (this.T && !this.U && !this.S) {
                Object obj = this.P;
                int i = this.R;
                boolean z = false;
                try {
                    Object obj2 = o1.c.get(activity);
                    if (obj2 == obj && activity.hashCode() == i) {
                        o1.g.postAtFrontOfQueue(new p1(o1.b.get(activity), obj2));
                        z = true;
                    }
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.Q == activity) {
                this.S = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        Field field;
        Field field2;
        Method declaredMethod;
        Class<?> cls2;
        Method method;
        Class<?> cls3;
        int i;
        boolean z;
        Method method2 = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            field = Activity.class.getDeclaredField("mMainThread");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        b = field;
        try {
            field2 = Activity.class.getDeclaredField("mToken");
            field2.setAccessible(true);
        } catch (Throwable unused3) {
            field2 = null;
        }
        c = field2;
        Class<?> cls4 = a;
        if (cls4 != null) {
            try {
                declaredMethod = cls4.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
            d = declaredMethod;
            cls2 = a;
            if (cls2 != null) {
                try {
                    method = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                    method.setAccessible(true);
                } catch (Throwable unused5) {
                    method = null;
                }
                e = method;
                cls3 = a;
                i = Build.VERSION.SDK_INT;
                if (i == 26 && i != 27) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && cls3 != null) {
                    try {
                        Class<?> cls5 = Boolean.TYPE;
                        Method declaredMethod2 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
                        declaredMethod2.setAccessible(true);
                        method2 = declaredMethod2;
                    } catch (Throwable unused6) {
                    }
                }
                f = method2;
            }
            method = null;
            e = method;
            cls3 = a;
            i = Build.VERSION.SDK_INT;
            if (i == 26) {
            }
            z = true;
            if (z) {
                Class<?> cls52 = Boolean.TYPE;
                Method declaredMethod22 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls52, Configuration.class, Configuration.class, cls52, cls52);
                declaredMethod22.setAccessible(true);
                method2 = declaredMethod22;
            }
            f = method2;
        }
        declaredMethod = null;
        d = declaredMethod;
        cls2 = a;
        if (cls2 != null) {
        }
        method = null;
        e = method;
        cls3 = a;
        i = Build.VERSION.SDK_INT;
        if (i == 26) {
        }
        z = true;
        if (z) {
        }
        f = method2;
    }

    public static boolean a(Activity activity) {
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            activity.recreate();
            return true;
        }
        if ((i == 26 || i == 27) && f == null) {
            return false;
        }
        if (e == null && d == null) {
            return false;
        }
        try {
            Object obj2 = c.get(activity);
            if (obj2 == null || (obj = b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            c cVar = new c(activity);
            application.registerActivityLifecycleCallbacks(cVar);
            Handler handler = g;
            handler.post(new a(cVar, obj2));
            if (i == 26 || i == 27) {
                Method method = f;
                Boolean bool = Boolean.FALSE;
                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
            } else {
                activity.recreate();
            }
            handler.post(new b(application, cVar));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}