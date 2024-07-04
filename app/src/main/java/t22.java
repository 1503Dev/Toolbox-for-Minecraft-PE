package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: t22  reason: default package */
public final class t22 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final long d0 = ((Long) w82.d.c.a(x92.X0)).longValue();
    public final Context P;
    public Application Q;
    public final PowerManager R;
    public final KeyguardManager S;
    public q22 T;
    public WeakReference U;
    public final WeakReference V;
    public y22 W;
    public final bv2 X = new bv2(d0);
    public boolean Y = false;
    public int Z = -1;
    public final HashSet a0 = new HashSet();
    public final DisplayMetrics b0;
    public final Rect c0;

    public t22(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.P = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.R = (PowerManager) applicationContext.getSystemService("power");
        this.S = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.Q = application;
            this.W = new y22(application, this);
        }
        this.b0 = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.c0 = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.V;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.V = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        int i = rect.left;
        float f = this.b0.density;
        return new Rect((int) (i / f), (int) (rect.top / f), (int) (rect.right / f), (int) (rect.bottom / f));
    }

    public final void b(Activity activity, int i) {
        Window window;
        if (this.V == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = (View) this.V.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.Z = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x010b, code lost:
        if (r11 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011e, code lost:
        if (r11 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0120, code lost:
        r3 = true;
        r11 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0219 A[LOOP:1: B:118:0x0213->B:120:0x0219, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ab  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i) {
        WeakReference weakReference;
        View view;
        boolean z;
        boolean z2;
        ?? emptyList;
        int i2;
        int i3;
        l92 l92Var;
        w82 w82Var;
        boolean z3;
        boolean z4;
        Rect rect;
        Rect rect2;
        boolean z5;
        int i4;
        Iterator it;
        boolean z6;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (this.a0.isEmpty() || (weakReference = this.V) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        Rect rect5 = new Rect();
        Rect rect6 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            boolean globalVisibleRect = view2.getGlobalVisibleRect(rect4);
            boolean localVisibleRect = view2.getLocalVisibleRect(rect5);
            view2.getHitRect(rect6);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e) {
                sv2.e("Failure getting view location.", e);
            }
            int i10 = iArr[0];
            rect3.left = i10;
            rect3.top = iArr[1];
            rect3.right = view2.getWidth() + i10;
            rect3.bottom = view2.getHeight() + rect3.top;
            view = view2;
            z2 = globalVisibleRect;
            z = localVisibleRect;
        } else {
            view = null;
            z = false;
            z2 = false;
        }
        if (((Boolean) w82.d.c.a(x92.a1)).booleanValue() && view != null) {
            try {
                emptyList = new ArrayList();
                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                    View view3 = (View) parent;
                    Rect rect7 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect7)) {
                        emptyList.add(a(rect7));
                    }
                }
            } catch (Exception e2) {
                jv5.A.g.f("PositionWatcher.getParentScrollViewRects", e2);
            }
            List list = emptyList;
            if (view == null) {
                i2 = view.getWindowVisibility();
            } else {
                i2 = 8;
            }
            i3 = this.Z;
            if (i3 != -1) {
                i2 = i3;
            }
            jv5 jv5Var = jv5.A;
            cu5 cu5Var = jv5Var.c;
            long C = cu5.C(view);
            l92Var = x92.j8;
            w82Var = w82.d;
            if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                if (view2 != null && cu5.k(view, this.R, this.S) && z2 && z) {
                    if (C >= ((Integer) w82Var.c.a(x92.m8)).intValue()) {
                    }
                }
                z3 = false;
            } else {
                if (view2 != null) {
                    if (cu5.k(view, this.R, this.S)) {
                        if (z2) {
                            if (z) {
                            }
                        }
                    }
                }
                z3 = false;
            }
            if (!((Boolean) w82Var.c.a(x92.o8)).booleanValue()) {
                if (true != cu5.k(view, this.R, this.S)) {
                    i5 = 0;
                } else {
                    i5 = 64;
                }
                if (true != z2) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                if (true != z) {
                    i7 = 0;
                } else {
                    i7 = 16;
                }
                if (i2 == 0) {
                    i8 = 128;
                } else {
                    i8 = 0;
                }
                z4 = z;
                if (C >= ((Integer) w82Var.c.a(x92.m8)).intValue()) {
                    i9 = 32;
                } else {
                    i9 = 0;
                }
                cu5.d(view, i9 | i5 | i6 | i7 | i8 | z3);
            } else {
                z4 = z;
            }
            if (i != 1) {
                bv2 bv2Var = this.X;
                synchronized (bv2Var.c) {
                    jv5Var.j.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    rect = rect5;
                    rect2 = rect6;
                    if (bv2Var.b + bv2Var.a > elapsedRealtime) {
                        z6 = false;
                    } else {
                        bv2Var.b = elapsedRealtime;
                        z6 = true;
                    }
                }
                if (!z6 && z3 == this.Y) {
                    return;
                }
            } else {
                rect = rect5;
                rect2 = rect6;
            }
            if (z3 && !this.Y) {
                if (i == 1) {
                    return;
                }
            }
            jv5Var.j.getClass();
            SystemClock.elapsedRealtime();
            this.R.isScreenOn();
            if (view == null && view.isAttachedToWindow()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (view == null) {
                i4 = view.getWindowVisibility();
            } else {
                i4 = 8;
            }
            Rect a = a(this.c0);
            Rect a2 = a(rect3);
            Rect a3 = a(rect4);
            Rect a4 = a(rect);
            Rect a5 = a(rect2);
            float f = this.b0.density;
            r22 r22Var = new r22(z5, i4, a, a2, a3, z2, a4, z4, a5, z3, list);
            it = this.a0.iterator();
            while (it.hasNext()) {
                ((s22) it.next()).h0(r22Var);
            }
            this.Y = z3;
        }
        emptyList = Collections.emptyList();
        List list2 = emptyList;
        if (view == null) {
        }
        i3 = this.Z;
        if (i3 != -1) {
        }
        jv5 jv5Var2 = jv5.A;
        cu5 cu5Var2 = jv5Var2.c;
        long C2 = cu5.C(view);
        l92Var = x92.j8;
        w82Var = w82.d;
        if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
        }
        if (!((Boolean) w82Var.c.a(x92.o8)).booleanValue()) {
        }
        if (i != 1) {
        }
        if (z3) {
        }
        jv5Var2.j.getClass();
        SystemClock.elapsedRealtime();
        this.R.isScreenOn();
        if (view == null) {
        }
        z5 = false;
        if (view == null) {
        }
        Rect a6 = a(this.c0);
        Rect a22 = a(rect3);
        Rect a32 = a(rect4);
        Rect a42 = a(rect);
        Rect a52 = a(rect2);
        float f2 = this.b0.density;
        r22 r22Var2 = new r22(z5, i4, a6, a22, a32, z2, a42, z4, a52, z3, list2);
        it = this.a0.iterator();
        while (it.hasNext()) {
        }
        this.Y = z3;
    }

    public final void d() {
        cu5.i.post(new p22(0, this));
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.U = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.T == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            q22 q22Var = new q22(this);
            this.T = q22Var;
            x13 x13Var = jv5.A.x;
            Context context = this.P;
            synchronized (x13Var) {
                if (x13Var.d) {
                    x13Var.b.put(q22Var, intentFilter);
                } else {
                    x92.a(context);
                    if (((Boolean) w82.d.c.a(x92.B8)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
                        q0.a(context, q22Var, intentFilter);
                    } else {
                        context.registerReceiver(q22Var, intentFilter);
                    }
                }
            }
        }
        Application application = this.Q;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.W);
            } catch (Exception e) {
                sv2.e("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.U;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.U = null;
            }
        } catch (Exception e) {
            sv2.e("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            sv2.e("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        q22 q22Var = this.T;
        if (q22Var != null) {
            try {
                jv5.A.x.b(this.P, q22Var);
            } catch (IllegalStateException e3) {
                sv2.e("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                jv5.A.g.f("ActiveViewUnit.stopScreenStatusMonitoring", e4);
            }
            this.T = null;
        }
        Application application = this.Q;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.W);
            } catch (Exception e5) {
                sv2.e("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c(3);
        d();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c(2);
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.Z = -1;
        e(view);
        c(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.Z = -1;
        c(3);
        d();
        f(view);
    }
}