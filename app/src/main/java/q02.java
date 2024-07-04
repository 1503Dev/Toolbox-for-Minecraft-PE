package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: q02  reason: default package */
public final class q02 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final Handler b0 = new Handler(Looper.getMainLooper());
    public final Context P;
    public Application Q;
    public final PowerManager R;
    public final KeyguardManager S;
    public at5 T;
    public final f02 U;
    public WeakReference V;
    public WeakReference W;
    public c02 X;
    public byte Y = -1;
    public int Z = -1;
    public long a0 = -3;

    public q02(Context context, f02 f02Var) {
        Context applicationContext = context.getApplicationContext();
        this.P = applicationContext;
        this.U = f02Var;
        this.R = (PowerManager) applicationContext.getSystemService("power");
        this.S = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.Q = application;
            this.X = new c02(application, this);
        }
        b(null);
    }

    public final View a() {
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void b(View view) {
        long j;
        View a = a();
        if (a != null) {
            a.removeOnAttachStateChangeListener(this);
            f(a);
        }
        this.W = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.a0 = j;
    }

    public final void c(Activity activity, int i) {
        Window window;
        if (this.W == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View a = a();
        if (a == null || peekDecorView == null || a.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.Z = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007d, code lost:
        if ((r8.flags & 524288) != 0) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        int i;
        long j;
        WindowManager.LayoutParams layoutParams;
        Activity activity;
        if (this.W == null) {
            return;
        }
        View a = a();
        if (a == null) {
            this.a0 = -3L;
            this.Y = (byte) -1;
            return;
        }
        int i2 = 0;
        if (a.getVisibility() != 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (!a.isShown()) {
            i |= 2;
        }
        PowerManager powerManager = this.R;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i |= 4;
        }
        if (!this.U.a) {
            KeyguardManager keyguardManager = this.S;
            if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode()) {
                char[] cArr = o02.a;
                View rootView = a.getRootView();
                if (rootView == null) {
                    rootView = a;
                }
                Context context = rootView.getContext();
                while (true) {
                    layoutParams = null;
                    if (!(context instanceof ContextWrapper) || i2 >= 10) {
                        break;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                        i2++;
                    }
                }
                if (activity != null) {
                    Window window = activity.getWindow();
                    if (window != null) {
                        layoutParams = window.getAttributes();
                    }
                    if (layoutParams != null) {
                    }
                }
            }
            i |= 8;
        }
        if (!a.getGlobalVisibleRect(new Rect())) {
            i |= 16;
        }
        if (!a.getLocalVisibleRect(new Rect())) {
            i |= 32;
        }
        int windowVisibility = a.getWindowVisibility();
        int i3 = this.Z;
        if (i3 != -1) {
            windowVisibility = i3;
        }
        if (windowVisibility != 0) {
            i |= 64;
        }
        if (this.Y != i) {
            this.Y = (byte) i;
            if (i == 0) {
                j = SystemClock.elapsedRealtime();
            } else {
                j = (-3) - i;
            }
            this.a0 = j;
        }
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.V = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.T == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            at5 at5Var = new at5(this);
            this.T = at5Var;
            this.P.registerReceiver(at5Var, intentFilter);
        }
        Application application = this.Q;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.X);
            } catch (Exception unused) {
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.V;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.V = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        at5 at5Var = this.T;
        if (at5Var != null) {
            try {
                this.P.unregisterReceiver(at5Var);
            } catch (Exception unused3) {
            }
            this.T = null;
        }
        Application application = this.Q;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.X);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        c(activity, 0);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity, 4);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity, 0);
        d();
        b0.post(new fn1(1, this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity, 0);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        d();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.Z = -1;
        e(view);
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.Z = -1;
        d();
        b0.post(new fn1(1, this));
        f(view);
    }
}