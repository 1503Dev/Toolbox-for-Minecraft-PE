package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.c;
import defpackage.a41;
import defpackage.f1;
import defpackage.j00;
import defpackage.j11;
import defpackage.k61;
import defpackage.qu0;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: f5  reason: default package */
public final class f5 extends c5 implements f.a, LayoutInflater.Factory2 {
    public static final e7 N0 = new e7();
    public static final boolean O0;
    public static final int[] P0;
    public static boolean Q0;
    public static final boolean R0;
    public int A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public h E0;
    public f F0;
    public boolean G0;
    public int H0;
    public boolean J0;
    public Rect K0;
    public Rect L0;
    public AppCompatViewInflater M0;
    public final Object R;
    public final Context S;
    public Window T;
    public e U;
    public final y4 V;
    public k61 W;
    public tu0 X;
    public CharSequence Y;
    public xj Z;
    public c a0;
    public k b0;
    public f1 c0;
    public ActionBarContextView d0;
    public PopupWindow e0;
    public j5 f0;
    public boolean i0;
    public ViewGroup j0;
    public TextView k0;
    public View l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public j[] u0;
    public j v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public w41 g0 = null;
    public boolean h0 = true;
    public final b I0 = new b();

    /* renamed from: f5$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ Thread.UncaughtExceptionHandler a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            String message;
            boolean z = false;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z = true;
            }
            if (z) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.a.uncaughtException(thread, notFoundException);
                return;
            }
            this.a.uncaughtException(thread, th);
        }
    }

    /* renamed from: f5$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f5 f5Var = f5.this;
            if ((f5Var.H0 & 1) != 0) {
                f5Var.C(0);
            }
            f5 f5Var2 = f5.this;
            if ((f5Var2.H0 & 4096) != 0) {
                f5Var2.C(108);
            }
            f5 f5Var3 = f5.this;
            f5Var3.G0 = false;
            f5Var3.H0 = 0;
        }
    }

    /* renamed from: f5$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class c implements k.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.k.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z) {
            f5.this.z(fVar);
        }

        @Override // androidx.appcompat.view.menu.k.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            Window.Callback H = f5.this.H();
            if (H != null) {
                H.onMenuOpened(108, fVar);
                return true;
            }
            return true;
        }
    }

    /* renamed from: f5$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements f1.a {
        public f1.a a;

        /* renamed from: f5$d$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a extends vx {
            public a() {
            }

            @Override // defpackage.y41
            public final void a() {
                f5.this.d0.setVisibility(8);
                f5 f5Var = f5.this;
                PopupWindow popupWindow = f5Var.e0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (f5Var.d0.getParent() instanceof View) {
                    a41.m((View) f5.this.d0.getParent());
                }
                f5.this.d0.removeAllViews();
                f5.this.g0.d(null);
                f5.this.g0 = null;
            }
        }

        public d(qu0.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.f1.a
        public final boolean a(f1 f1Var, MenuItem menuItem) {
            return this.a.a(f1Var, menuItem);
        }

        @Override // defpackage.f1.a
        public final void b(f1 f1Var) {
            this.a.b(f1Var);
            f5 f5Var = f5.this;
            if (f5Var.e0 != null) {
                f5Var.T.getDecorView().removeCallbacks(f5.this.f0);
            }
            f5 f5Var2 = f5.this;
            if (f5Var2.d0 != null) {
                w41 w41Var = f5Var2.g0;
                if (w41Var != null) {
                    w41Var.b();
                }
                f5 f5Var3 = f5.this;
                w41 a2 = a41.a(f5Var3.d0);
                a2.a(0.0f);
                f5Var3.g0 = a2;
                f5.this.g0.d(new a());
            }
            y4 y4Var = f5.this.V;
            if (y4Var != null) {
                y4Var.f();
            }
            f5.this.c0 = null;
        }

        @Override // defpackage.f1.a
        public final boolean c(f1 f1Var, androidx.appcompat.view.menu.f fVar) {
            return this.a.c(f1Var, fVar);
        }

        @Override // defpackage.f1.a
        public final boolean d(f1 f1Var, androidx.appcompat.view.menu.f fVar) {
            return this.a.d(f1Var, fVar);
        }
    }

    /* renamed from: f5$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f extends g {
        public final PowerManager c;

        public f(Context context) {
            super();
            this.c = (PowerManager) context.getSystemService("power");
        }

        @Override // defpackage.f5.g
        public final IntentFilter b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // defpackage.f5.g
        public final int c() {
            return (Build.VERSION.SDK_INT < 21 || !l5.e(this.c)) ? 1 : 2;
        }

        @Override // defpackage.f5.g
        public final void d() {
            f5.this.w(true);
        }
    }

    /* renamed from: f5$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public abstract class g {
        public a a;

        /* renamed from: f5$g$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                g.this.d();
            }
        }

        public g() {
        }

        public final void a() {
            a aVar = this.a;
            if (aVar != null) {
                try {
                    f5.this.S.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b = b();
            if (b == null || b.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            f5.this.S.registerReceiver(this.a, b);
        }
    }

    /* renamed from: f5$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class h extends g {
        public final j11 c;

        public h(j11 j11Var) {
            super();
            this.c = j11Var;
        }

        @Override // defpackage.f5.g
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x010e A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
        @Override // defpackage.f5.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int c() {
            boolean z;
            boolean z2;
            Location location;
            long j;
            long j2;
            Location location2;
            j11 j11Var = this.c;
            j11.a aVar = j11Var.c;
            boolean z3 = false;
            if (aVar.b > System.currentTimeMillis()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Location location3 = null;
                if (p5.d(j11Var.a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    try {
                    } catch (Exception e) {
                        Log.d("TwilightManager", "Failed to get last known location", e);
                    }
                    if (j11Var.b.isProviderEnabled("network")) {
                        location2 = j11Var.b.getLastKnownLocation("network");
                        location = location2;
                    }
                    location2 = null;
                    location = location2;
                } else {
                    location = null;
                }
                if (p5.d(j11Var.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (j11Var.b.isProviderEnabled("gps")) {
                            location3 = j11Var.b.getLastKnownLocation("gps");
                        }
                    } catch (Exception e2) {
                        Log.d("TwilightManager", "Failed to get last known location", e2);
                    }
                }
                if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                    location = location3;
                }
                if (location != null) {
                    j11.a aVar2 = j11Var.c;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (i11.d == null) {
                        i11.d = new i11();
                    }
                    i11 i11Var = i11.d;
                    i11Var.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                    i11Var.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                    if (i11Var.c == 1) {
                        z3 = true;
                    }
                    long j3 = i11Var.b;
                    long j4 = i11Var.a;
                    i11Var.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                    long j5 = i11Var.b;
                    if (j3 != -1 && j4 != -1) {
                        if (currentTimeMillis > j4) {
                            j2 = j5 + 0;
                        } else if (currentTimeMillis > j3) {
                            j2 = j4 + 0;
                        } else {
                            j2 = j3 + 0;
                        }
                        j = j2 + 60000;
                    } else {
                        j = 43200000 + currentTimeMillis;
                    }
                    aVar2.a = z3;
                    aVar2.b = j;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    z2 = (i < 6 || i >= 22) ? true : true;
                    if (z2) {
                        return 1;
                    }
                    return 2;
                }
            }
            z2 = aVar.a;
            if (z2) {
            }
        }

        @Override // defpackage.f5.g
        public final void d() {
            f5.this.w(true);
        }
    }

    /* renamed from: f5$i */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class i extends ContentFrameLayout {
        public i(kg kgVar) {
            super(kgVar, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f5.this.B(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z;
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x >= -5 && y >= -5 && x <= getWidth() + 5 && y <= getHeight() + 5) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    f5 f5Var = f5.this;
                    f5Var.A(f5Var.G(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(z5.b(getContext(), i));
        }
    }

    /* renamed from: f5$j */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class j {
        public int a;
        public int b;
        public int c;
        public int d;
        public i e;
        public View f;
        public View g;
        public androidx.appcompat.view.menu.f h;
        public androidx.appcompat.view.menu.d i;
        public kg j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n = false;
        public boolean o;
        public Bundle p;

        public j(int i) {
            this.a = i;
        }
    }

    /* renamed from: f5$k */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class k implements k.a {
        public k() {
        }

        @Override // androidx.appcompat.view.menu.k.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z) {
            boolean z2;
            int i;
            j jVar;
            androidx.appcompat.view.menu.f k = fVar.k();
            int i2 = 0;
            if (k != fVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            f5 f5Var = f5.this;
            if (z2) {
                fVar = k;
            }
            j[] jVarArr = f5Var.u0;
            if (jVarArr != null) {
                i = jVarArr.length;
            } else {
                i = 0;
            }
            while (true) {
                if (i2 < i) {
                    jVar = jVarArr[i2];
                    if (jVar != null && jVar.h == fVar) {
                        break;
                    }
                    i2++;
                } else {
                    jVar = null;
                    break;
                }
            }
            if (jVar != null) {
                f5 f5Var2 = f5.this;
                if (z2) {
                    f5Var2.y(jVar.a, jVar, k);
                    f5.this.A(jVar, true);
                    return;
                }
                f5Var2.A(jVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.k.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            Window.Callback H;
            if (fVar == null) {
                f5 f5Var = f5.this;
                if (!f5Var.o0 || (H = f5Var.H()) == null || f5.this.z0) {
                    return true;
                }
                H.onMenuOpened(108, fVar);
                return true;
            }
            return true;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i2 < 21;
        O0 = z2;
        P0 = new int[]{16842836};
        if (i2 >= 21 && i2 <= 25) {
            z = true;
        }
        R0 = z;
        if (!z2 || Q0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        Q0 = true;
    }

    public f5(Context context, Window window, y4 y4Var, Object obj) {
        AppCompatActivity appCompatActivity;
        this.A0 = -100;
        this.S = context;
        this.V = y4Var;
        this.R = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof AppCompatActivity) {
                    appCompatActivity = (AppCompatActivity) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            appCompatActivity = null;
            if (appCompatActivity != null) {
                this.A0 = ((f5) appCompatActivity.p()).A0;
            }
        }
        if (this.A0 == -100) {
            e7 e7Var = N0;
            Integer num = (Integer) e7Var.getOrDefault(this.R.getClass(), null);
            if (num != null) {
                this.A0 = num.intValue();
                e7Var.remove(this.R.getClass());
            }
        }
        if (window != null) {
            x(window);
        }
        n5.d();
    }

    public final void A(j jVar, boolean z) {
        i iVar;
        xj xjVar;
        if (z && jVar.a == 0 && (xjVar = this.Z) != null && xjVar.a()) {
            z(jVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.S.getSystemService("window");
        if (windowManager != null && jVar.m && (iVar = jVar.e) != null) {
            windowManager.removeView(iVar);
            if (z) {
                y(jVar.a, jVar, null);
            }
        }
        jVar.k = false;
        jVar.l = false;
        jVar.m = false;
        jVar.f = null;
        jVar.n = true;
        if (this.v0 == jVar) {
            this.v0 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x011e, code lost:
        if (r7 != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj = this.R;
        boolean z6 = true;
        if (((obj instanceof j00.a) || (obj instanceof m5)) && (decorView = this.T.getDecorView()) != null && j00.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.U.P.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    j G = G(0);
                    if (G.m) {
                        return true;
                    }
                    L(G, keyEvent);
                    return true;
                }
            } else {
                if ((keyEvent.getFlags() & 128) == 0) {
                    z6 = false;
                }
                this.w0 = z6;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.c0 != null) {
                    return true;
                }
                j G2 = G(0);
                xj xjVar = this.Z;
                if (xjVar != null && xjVar.g() && !ViewConfiguration.get(this.S).hasPermanentMenuKey()) {
                    if (!this.Z.a()) {
                        if (!this.z0 && L(G2, keyEvent)) {
                            z4 = this.Z.f();
                        }
                        z4 = false;
                    } else {
                        z4 = this.Z.e();
                    }
                } else {
                    boolean z7 = G2.m;
                    if (!z7 && !G2.l) {
                        if (G2.k) {
                            if (G2.o) {
                                G2.k = false;
                                z5 = L(G2, keyEvent);
                            } else {
                                z5 = true;
                            }
                            if (z5) {
                                J(G2, keyEvent);
                                z4 = true;
                            }
                        }
                        z4 = false;
                    } else {
                        A(G2, true);
                        z4 = z7;
                    }
                }
                if (!z4) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) this.S.getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else {
            boolean z8 = this.w0;
            this.w0 = false;
            j G3 = G(0);
            if (G3.m) {
                if (z8) {
                    return true;
                }
                A(G3, true);
                return true;
            }
            f1 f1Var = this.c0;
            if (f1Var != null) {
                f1Var.c();
            } else {
                I();
                k61 k61Var = this.W;
                if (k61Var != null) {
                    yj yjVar = k61Var.e;
                    if (yjVar != null && yjVar.m()) {
                        k61Var.e.collapseActionView();
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                z2 = false;
                if (!z2) {
                    return true;
                }
            }
            z2 = true;
            if (!z2) {
            }
        }
        return false;
    }

    public final void C(int i2) {
        j G = G(i2);
        if (G.h != null) {
            Bundle bundle = new Bundle();
            G.h.t(bundle);
            if (bundle.size() > 0) {
                G.p = bundle;
            }
            G.h.w();
            G.h.clear();
        }
        G.o = true;
        G.n = true;
        if ((i2 == 108 || i2 == 0) && this.Z != null) {
            j G2 = G(0);
            G2.k = false;
            L(G2, null);
        }
    }

    public final void D() {
        int i2;
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.i0) {
            TypedArray obtainStyledAttributes = this.S.obtainStyledAttributes(lj0.AppCompatTheme);
            int i3 = lj0.AppCompatTheme_windowActionBar;
            if (obtainStyledAttributes.hasValue(i3)) {
                if (obtainStyledAttributes.getBoolean(lj0.AppCompatTheme_windowNoTitle, false)) {
                    q(1);
                } else if (obtainStyledAttributes.getBoolean(i3, false)) {
                    q(108);
                }
                if (obtainStyledAttributes.getBoolean(lj0.AppCompatTheme_windowActionBarOverlay, false)) {
                    q(109);
                }
                if (obtainStyledAttributes.getBoolean(lj0.AppCompatTheme_windowActionModeOverlay, false)) {
                    q(10);
                }
                this.r0 = obtainStyledAttributes.getBoolean(lj0.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                E();
                this.T.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.S);
                if (!this.s0) {
                    if (this.r0) {
                        viewGroup = (ViewGroup) from.inflate(ni0.abc_dialog_title_material, (ViewGroup) null);
                        this.p0 = false;
                        this.o0 = false;
                    } else if (this.o0) {
                        TypedValue typedValue = new TypedValue();
                        this.S.getTheme().resolveAttribute(ih0.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new kg(this.S, typedValue.resourceId);
                        } else {
                            context = this.S;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(ni0.abc_screen_toolbar, (ViewGroup) null);
                        xj xjVar = (xj) viewGroup.findViewById(hi0.decor_content_parent);
                        this.Z = xjVar;
                        xjVar.setWindowCallback(H());
                        if (this.p0) {
                            this.Z.k(109);
                        }
                        if (this.m0) {
                            this.Z.k(2);
                        }
                        if (this.n0) {
                            this.Z.k(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    if (this.q0) {
                        i2 = ni0.abc_screen_simple_overlay_action_mode;
                    } else {
                        i2 = ni0.abc_screen_simple;
                    }
                    viewGroup = (ViewGroup) from.inflate(i2, (ViewGroup) null);
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 21) {
                        g5 g5Var = new g5(this);
                        WeakHashMap<View, String> weakHashMap = a41.a;
                        if (i4 >= 21) {
                            a41.a.c(viewGroup, g5Var);
                        }
                    } else {
                        ((androidx.appcompat.widget.b) viewGroup).setOnFitSystemWindowsListener(new h5(this));
                    }
                }
                if (viewGroup != null) {
                    if (this.Z == null) {
                        this.k0 = (TextView) viewGroup.findViewById(hi0.title);
                    }
                    Method method = c51.a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(hi0.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.T.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.T.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new i5(this));
                    this.j0 = viewGroup;
                    Object obj = this.R;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.Y;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        xj xjVar2 = this.Z;
                        if (xjVar2 != null) {
                            xjVar2.setWindowTitle(charSequence);
                        } else {
                            k61 k61Var = this.W;
                            if (k61Var != null) {
                                k61Var.e.setWindowTitle(charSequence);
                            } else {
                                TextView textView = this.k0;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.j0.findViewById(16908290);
                    View decorView = this.T.getDecorView();
                    contentFrameLayout2.V.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, String> weakHashMap2 = a41.a;
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.S.obtainStyledAttributes(lj0.AppCompatTheme);
                    obtainStyledAttributes2.getValue(lj0.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(lj0.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    int i5 = lj0.AppCompatTheme_windowFixedWidthMajor;
                    if (obtainStyledAttributes2.hasValue(i5)) {
                        obtainStyledAttributes2.getValue(i5, contentFrameLayout2.getFixedWidthMajor());
                    }
                    int i6 = lj0.AppCompatTheme_windowFixedWidthMinor;
                    if (obtainStyledAttributes2.hasValue(i6)) {
                        obtainStyledAttributes2.getValue(i6, contentFrameLayout2.getFixedWidthMinor());
                    }
                    int i7 = lj0.AppCompatTheme_windowFixedHeightMajor;
                    if (obtainStyledAttributes2.hasValue(i7)) {
                        obtainStyledAttributes2.getValue(i7, contentFrameLayout2.getFixedHeightMajor());
                    }
                    int i8 = lj0.AppCompatTheme_windowFixedHeightMinor;
                    if (obtainStyledAttributes2.hasValue(i8)) {
                        obtainStyledAttributes2.getValue(i8, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.i0 = true;
                    j G = G(0);
                    if (!this.z0 && G.h == null) {
                        this.H0 |= 4096;
                        if (!this.G0) {
                            this.T.getDecorView().postOnAnimation(this.I0);
                            this.G0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                StringBuilder b2 = e5.b("AppCompat does not support the current theme features: { windowActionBar: ");
                b2.append(this.o0);
                b2.append(", windowActionBarOverlay: ");
                b2.append(this.p0);
                b2.append(", android:windowIsFloating: ");
                b2.append(this.r0);
                b2.append(", windowActionModeOverlay: ");
                b2.append(this.q0);
                b2.append(", windowNoTitle: ");
                b2.append(this.s0);
                b2.append(" }");
                throw new IllegalArgumentException(b2.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void E() {
        if (this.T == null) {
            Object obj = this.R;
            if (obj instanceof Activity) {
                x(((Activity) obj).getWindow());
            }
        }
        if (this.T == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final g F() {
        if (this.E0 == null) {
            Context context = this.S;
            if (j11.d == null) {
                Context applicationContext = context.getApplicationContext();
                j11.d = new j11(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.E0 = new h(j11.d);
        }
        return this.E0;
    }

    public final j G(int i2) {
        j[] jVarArr = this.u0;
        if (jVarArr == null || jVarArr.length <= i2) {
            j[] jVarArr2 = new j[i2 + 1];
            if (jVarArr != null) {
                System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
            }
            this.u0 = jVarArr2;
            jVarArr = jVarArr2;
        }
        j jVar = jVarArr[i2];
        if (jVar == null) {
            j jVar2 = new j(i2);
            jVarArr[i2] = jVar2;
            return jVar2;
        }
        return jVar;
    }

    public final Window.Callback H() {
        return this.T.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        k61 k61Var;
        k61 k61Var2;
        D();
        if (!this.o0 || this.W != null) {
            return;
        }
        Object obj = this.R;
        if (!(obj instanceof Activity)) {
            if (obj instanceof Dialog) {
                k61Var = new k61((Dialog) this.R);
            }
            k61Var2 = this.W;
            if (k61Var2 == null) {
                k61Var2.e(this.J0);
                return;
            }
            return;
        }
        k61Var = new k61((Activity) this.R, this.p0);
        this.W = k61Var;
        k61Var2 = this.W;
        if (k61Var2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0151, code lost:
        if (r14 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0175, code lost:
        if (r14.V.getCount() > 0) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(j jVar, KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        Context context;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        boolean z3;
        if (!jVar.m && !this.z0) {
            if (jVar.a == 0) {
                if ((this.S.getResources().getConfiguration().screenLayout & 15) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    return;
                }
            }
            Window.Callback H = H();
            if (H != null && !H.onMenuOpened(jVar.a, jVar.h)) {
                A(jVar, true);
                return;
            }
            WindowManager windowManager = (WindowManager) this.S.getSystemService("window");
            if (windowManager == null || !L(jVar, keyEvent)) {
                return;
            }
            i iVar = jVar.e;
            if (iVar != null && !jVar.n) {
                View view = jVar.g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                    jVar.l = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
                    layoutParams2.gravity = jVar.c;
                    layoutParams2.windowAnimations = jVar.d;
                    windowManager.addView(jVar.e, layoutParams2);
                    jVar.m = true;
                }
            } else {
                if (iVar == null) {
                    I();
                    k61 k61Var = this.W;
                    if (k61Var != null) {
                        context = k61Var.c();
                    } else {
                        context = null;
                    }
                    if (context == null) {
                        context = this.S;
                    }
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme newTheme = context.getResources().newTheme();
                    newTheme.setTo(context.getTheme());
                    newTheme.resolveAttribute(ih0.actionBarPopupTheme, typedValue, true);
                    int i3 = typedValue.resourceId;
                    if (i3 != 0) {
                        newTheme.applyStyle(i3, true);
                    }
                    newTheme.resolveAttribute(ih0.panelMenuListTheme, typedValue, true);
                    int i4 = typedValue.resourceId;
                    if (i4 == 0) {
                        i4 = bj0.Theme_AppCompat_CompactMenu;
                    }
                    newTheme.applyStyle(i4, true);
                    kg kgVar = new kg(context, 0);
                    kgVar.getTheme().setTo(newTheme);
                    jVar.j = kgVar;
                    TypedArray obtainStyledAttributes = kgVar.obtainStyledAttributes(lj0.AppCompatTheme);
                    jVar.b = obtainStyledAttributes.getResourceId(lj0.AppCompatTheme_panelBackground, 0);
                    jVar.d = obtainStyledAttributes.getResourceId(lj0.AppCompatTheme_android_windowAnimationStyle, 0);
                    obtainStyledAttributes.recycle();
                    jVar.e = new i(jVar.j);
                    jVar.c = 81;
                } else if (jVar.n && iVar.getChildCount() > 0) {
                    jVar.e.removeAllViews();
                }
                View view2 = jVar.g;
                if (view2 != null) {
                    jVar.f = view2;
                } else {
                    if (jVar.h != null) {
                        if (this.b0 == null) {
                            this.b0 = new k();
                        }
                        k kVar = this.b0;
                        if (jVar.i == null) {
                            androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(jVar.j, ni0.abc_list_menu_item_layout);
                            jVar.i = dVar;
                            dVar.U = kVar;
                            androidx.appcompat.view.menu.f fVar = jVar.h;
                            fVar.b(dVar, fVar.a);
                        }
                        androidx.appcompat.view.menu.d dVar2 = jVar.i;
                        i iVar2 = jVar.e;
                        if (dVar2.S == null) {
                            dVar2.S = (ExpandedMenuView) dVar2.Q.inflate(ni0.abc_expanded_menu_layout, (ViewGroup) iVar2, false);
                            if (dVar2.V == null) {
                                dVar2.V = new d.a();
                            }
                            dVar2.S.setAdapter((ListAdapter) dVar2.V);
                            dVar2.S.setOnItemClickListener(dVar2);
                        }
                        ExpandedMenuView expandedMenuView = dVar2.S;
                        jVar.f = expandedMenuView;
                    }
                    z = false;
                    if (!z) {
                        if (jVar.f != null) {
                            if (jVar.g == null) {
                                androidx.appcompat.view.menu.d dVar3 = jVar.i;
                                if (dVar3.V == null) {
                                    dVar3.V = new d.a();
                                }
                            }
                            z2 = true;
                            if (!z2) {
                                ViewGroup.LayoutParams layoutParams3 = jVar.f.getLayoutParams();
                                if (layoutParams3 == null) {
                                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                                }
                                jVar.e.setBackgroundResource(jVar.b);
                                ViewParent parent = jVar.f.getParent();
                                if (parent instanceof ViewGroup) {
                                    ((ViewGroup) parent).removeView(jVar.f);
                                }
                                jVar.e.addView(jVar.f, layoutParams3);
                                if (!jVar.f.hasFocus()) {
                                    jVar.f.requestFocus();
                                }
                            } else {
                                return;
                            }
                        }
                        z2 = false;
                        if (!z2) {
                        }
                    } else {
                        return;
                    }
                }
                z = true;
                if (!z) {
                }
            }
            i2 = -2;
            jVar.l = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
            layoutParams22.gravity = jVar.c;
            layoutParams22.windowAnimations = jVar.d;
            windowManager.addView(jVar.e, layoutParams22);
            jVar.m = true;
        }
    }

    public final boolean K(j jVar, int i2, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((jVar.k || L(jVar, keyEvent)) && (fVar = jVar.h) != null) {
            return fVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    public final boolean L(j jVar, KeyEvent keyEvent) {
        boolean z;
        xj xjVar;
        xj xjVar2;
        Resources.Theme theme;
        int i2;
        boolean z2;
        xj xjVar3;
        xj xjVar4;
        if (this.z0) {
            return false;
        }
        if (jVar.k) {
            return true;
        }
        j jVar2 = this.v0;
        if (jVar2 != null && jVar2 != jVar) {
            A(jVar2, false);
        }
        Window.Callback H = H();
        if (H != null) {
            jVar.g = H.onCreatePanelView(jVar.a);
        }
        int i3 = jVar.a;
        if (i3 != 0 && i3 != 108) {
            z = false;
        } else {
            z = true;
        }
        if (z && (xjVar4 = this.Z) != null) {
            xjVar4.c();
        }
        if (jVar.g == null) {
            androidx.appcompat.view.menu.f fVar = jVar.h;
            if (fVar == null || jVar.o) {
                if (fVar == null) {
                    Context context = this.S;
                    int i4 = jVar.a;
                    if ((i4 == 0 || i4 == 108) && this.Z != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(ih0.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(ih0.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(ih0.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            kg kgVar = new kg(context, 0);
                            kgVar.getTheme().setTo(theme);
                            context = kgVar;
                        }
                    }
                    androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
                    fVar2.e = this;
                    androidx.appcompat.view.menu.f fVar3 = jVar.h;
                    if (fVar2 != fVar3) {
                        if (fVar3 != null) {
                            fVar3.r(jVar.i);
                        }
                        jVar.h = fVar2;
                        androidx.appcompat.view.menu.d dVar = jVar.i;
                        if (dVar != null) {
                            fVar2.b(dVar, fVar2.a);
                        }
                    }
                    if (jVar.h == null) {
                        return false;
                    }
                }
                if (z && (xjVar2 = this.Z) != null) {
                    if (this.a0 == null) {
                        this.a0 = new c();
                    }
                    xjVar2.b(jVar.h, this.a0);
                }
                jVar.h.w();
                if (!H.onCreatePanelMenu(jVar.a, jVar.h)) {
                    androidx.appcompat.view.menu.f fVar4 = jVar.h;
                    if (fVar4 != null) {
                        if (fVar4 != null) {
                            fVar4.r(jVar.i);
                        }
                        jVar.h = null;
                    }
                    if (z && (xjVar = this.Z) != null) {
                        xjVar.b(null, this.a0);
                    }
                    return false;
                }
                jVar.o = false;
            }
            jVar.h.w();
            Bundle bundle = jVar.p;
            if (bundle != null) {
                jVar.h.s(bundle);
                jVar.p = null;
            }
            if (!H.onPreparePanel(0, jVar.g, jVar.h)) {
                if (z && (xjVar3 = this.Z) != null) {
                    xjVar3.b(null, this.a0);
                }
                jVar.h.v();
                return false;
            }
            if (keyEvent != null) {
                i2 = keyEvent.getDeviceId();
            } else {
                i2 = -1;
            }
            if (KeyCharacterMap.load(i2).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar.h.setQwertyMode(z2);
            jVar.h.v();
        }
        jVar.k = true;
        jVar.l = false;
        this.v0 = jVar;
        return true;
    }

    public final void M() {
        if (this.i0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int N(int i2) {
        boolean z;
        int i3;
        boolean z2;
        ActionBarContextView actionBarContextView = this.d0;
        int i4 = 0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d0.getLayoutParams();
            boolean z3 = true;
            if (this.d0.isShown()) {
                if (this.K0 == null) {
                    this.K0 = new Rect();
                    this.L0 = new Rect();
                }
                Rect rect = this.K0;
                Rect rect2 = this.L0;
                rect.set(0, i2, 0, 0);
                ViewGroup viewGroup = this.j0;
                Method method = c51.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e2) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                    }
                }
                if (rect2.top == 0) {
                    i3 = i2;
                } else {
                    i3 = 0;
                }
                if (marginLayoutParams.topMargin != i3) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.l0;
                    if (view == null) {
                        View view2 = new View(this.S);
                        this.l0 = view2;
                        view2.setBackgroundColor(this.S.getResources().getColor(nh0.abc_input_method_navigation_guard));
                        this.j0.addView(this.l0, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.l0.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.l0 == null) {
                    z3 = false;
                }
                if (!this.q0 && z3) {
                    i2 = 0;
                }
                boolean z4 = z3;
                z3 = z2;
                z = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.d0.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view3 = this.l0;
        if (view3 != null) {
            if (!z) {
                i4 = 8;
            }
            view3.setVisibility(i4);
        }
        return i2;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        int i2;
        j jVar;
        Window.Callback H = H();
        if (H != null && !this.z0) {
            androidx.appcompat.view.menu.f k2 = fVar.k();
            j[] jVarArr = this.u0;
            if (jVarArr != null) {
                i2 = jVarArr.length;
            } else {
                i2 = 0;
            }
            int i3 = 0;
            while (true) {
                if (i3 < i2) {
                    jVar = jVarArr[i3];
                    if (jVar != null && jVar.h == k2) {
                        break;
                    }
                    i3++;
                } else {
                    jVar = null;
                    break;
                }
            }
            if (jVar != null) {
                return H.onMenuItemSelected(jVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        xj xjVar = this.Z;
        if (xjVar == null || !xjVar.g() || (ViewConfiguration.get(this.S).hasPermanentMenuKey() && !this.Z.d())) {
            j G = G(0);
            G.n = true;
            A(G, false);
            J(G, null);
            return;
        }
        Window.Callback H = H();
        if (this.Z.a()) {
            this.Z.e();
            if (this.z0) {
                return;
            }
            H.onPanelClosed(108, G(0).h);
        } else if (H == null || this.z0) {
        } else {
            if (this.G0 && (1 & this.H0) != 0) {
                this.T.getDecorView().removeCallbacks(this.I0);
                this.I0.run();
            }
            j G2 = G(0);
            androidx.appcompat.view.menu.f fVar2 = G2.h;
            if (fVar2 == null || G2.o || !H.onPreparePanel(0, G2.g, fVar2)) {
                return;
            }
            H.onMenuOpened(108, G2.h);
            this.Z.f();
        }
    }

    @Override // defpackage.c5
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        ((ViewGroup) this.j0.findViewById(16908290)).addView(view, layoutParams);
        this.U.P.onContentChanged();
    }

    @Override // defpackage.c5
    public final void d() {
        w(false);
        this.x0 = true;
    }

    @Override // defpackage.c5
    public final <T extends View> T e(int i2) {
        D();
        return (T) this.T.findViewById(i2);
    }

    @Override // defpackage.c5
    public final MenuInflater f() {
        if (this.X == null) {
            I();
            k61 k61Var = this.W;
            this.X = new tu0(k61Var != null ? k61Var.c() : this.S);
        }
        return this.X;
    }

    @Override // defpackage.c5
    public final void g() {
        LayoutInflater from = LayoutInflater.from(this.S);
        if (from.getFactory() == null) {
            from.setFactory2(this);
            if (Build.VERSION.SDK_INT < 21) {
                LayoutInflater.Factory factory = from.getFactory();
                if (factory instanceof LayoutInflater.Factory2) {
                    u00.a(from, (LayoutInflater.Factory2) factory);
                } else {
                    u00.a(from, this);
                }
            }
        } else if (!(from.getFactory2() instanceof f5)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.c5
    public final void h() {
        I();
        this.H0 |= 1;
        if (!this.G0) {
            View decorView = this.T.getDecorView();
            b bVar = this.I0;
            WeakHashMap<View, String> weakHashMap = a41.a;
            decorView.postOnAnimation(bVar);
            this.G0 = true;
        }
    }

    @Override // defpackage.c5
    public final void i() {
        if (this.o0 && this.i0) {
            I();
            k61 k61Var = this.W;
            if (k61Var != null) {
                k61Var.f(k61Var.a.getResources().getBoolean(kh0.abc_action_bar_embed_tabs));
            }
        }
        n5 a2 = n5.a();
        Context context = this.S;
        synchronized (a2) {
            gl0 gl0Var = a2.a;
            synchronized (gl0Var) {
                d30<WeakReference<Drawable.ConstantState>> d30Var = gl0Var.d.get(context);
                if (d30Var != null) {
                    d30Var.b();
                }
            }
        }
        w(false);
    }

    @Override // defpackage.c5
    public final void j() {
        this.x0 = true;
        w(false);
        E();
        Object obj = this.R;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = j70.b(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                k61 k61Var = this.W;
                if (k61Var == null) {
                    this.J0 = true;
                } else {
                    k61Var.e(true);
                }
            }
        }
    }

    @Override // defpackage.c5
    public final void k() {
        synchronized (c5.Q) {
            c5.p(this);
        }
        if (this.G0) {
            this.T.getDecorView().removeCallbacks(this.I0);
        }
        this.y0 = false;
        this.z0 = true;
        h hVar = this.E0;
        if (hVar != null) {
            hVar.a();
        }
        f fVar = this.F0;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // defpackage.c5
    public final void l() {
        I();
        k61 k61Var = this.W;
        if (k61Var != null) {
            k61Var.u = true;
        }
    }

    @Override // defpackage.c5
    public final void m() {
        if (this.A0 != -100) {
            N0.put(this.R.getClass(), Integer.valueOf(this.A0));
        }
    }

    @Override // defpackage.c5
    public final void n() {
        this.y0 = true;
        w(true);
        synchronized (c5.Q) {
            c5.p(this);
            c5.P.add(new WeakReference<>(this));
        }
    }

    @Override // defpackage.c5
    public final void o() {
        this.y0 = false;
        synchronized (c5.Q) {
            c5.p(this);
        }
        I();
        k61 k61Var = this.W;
        if (k61Var != null) {
            k61Var.u = false;
            x41 x41Var = k61Var.t;
            if (x41Var != null) {
                x41Var.a();
            }
        }
        if (this.R instanceof Dialog) {
            h hVar = this.E0;
            if (hVar != null) {
                hVar.a();
            }
            f fVar = this.F0;
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L24;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        AppCompatViewInflater appCompatViewInflater;
        boolean z2 = false;
        if (this.M0 == null) {
            String string = this.S.obtainStyledAttributes(lj0.AppCompatTheme).getString(lj0.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.M0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.M0 = appCompatViewInflater;
        }
        if (!O0) {
            z = false;
        } else if (!(attributeSet instanceof XmlPullParser)) {
            ViewParent viewParent = (ViewParent) view;
            if (viewParent != null) {
                View decorView = this.T.getDecorView();
                while (viewParent != null) {
                    if (viewParent == decorView || !(viewParent instanceof View)) {
                        break;
                    }
                    WeakHashMap<View, String> weakHashMap = a41.a;
                    if (((View) viewParent).isAttachedToWindow()) {
                        break;
                    }
                    viewParent = viewParent.getParent();
                }
                z2 = true;
            }
            z = z2;
        }
        AppCompatViewInflater appCompatViewInflater2 = this.M0;
        boolean z3 = O0;
        int i2 = h31.a;
        return appCompatViewInflater2.createView(view, str, context, attributeSet, z, z3, true, false);
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // defpackage.c5
    public final boolean q(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.s0 && i2 == 108) {
            return false;
        }
        if (this.o0 && i2 == 1) {
            this.o0 = false;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 5) {
                    if (i2 != 10) {
                        if (i2 != 108) {
                            if (i2 != 109) {
                                return this.T.requestFeature(i2);
                            }
                            M();
                            this.p0 = true;
                            return true;
                        }
                        M();
                        this.o0 = true;
                        return true;
                    }
                    M();
                    this.q0 = true;
                    return true;
                }
                M();
                this.n0 = true;
                return true;
            }
            M();
            this.m0 = true;
            return true;
        }
        M();
        this.s0 = true;
        return true;
    }

    @Override // defpackage.c5
    public final void r(int i2) {
        D();
        ViewGroup viewGroup = (ViewGroup) this.j0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.S).inflate(i2, viewGroup);
        this.U.P.onContentChanged();
    }

    @Override // defpackage.c5
    public final void s(View view) {
        D();
        ViewGroup viewGroup = (ViewGroup) this.j0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.U.P.onContentChanged();
    }

    @Override // defpackage.c5
    public final void t(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        ViewGroup viewGroup = (ViewGroup) this.j0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.U.P.onContentChanged();
    }

    @Override // defpackage.c5
    public final void u(int i2) {
        this.B0 = i2;
    }

    @Override // defpackage.c5
    public final void v(CharSequence charSequence) {
        this.Y = charSequence;
        xj xjVar = this.Z;
        if (xjVar != null) {
            xjVar.setWindowTitle(charSequence);
            return;
        }
        k61 k61Var = this.W;
        if (k61Var != null) {
            k61Var.e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.k0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:5|(1:7)|8|(2:(2:(1:(1:(3:15|(1:17)|18)(2:20|21)))(2:22|(1:26))|19)|27)|28|(1:(1:31)(1:199))(1:200)|32|(2:36|(12:38|39|(11:180|181|182|183|43|(2:50|(4:52|(2:(1:55)(1:57)|56)|59|56))|(1:174)(5:62|(2:65|(4:67|(3:94|95|96)|69|(3:71|72|(5:74|(3:85|86|87)|76|(2:80|81)|(1:79))))(2:100|(5:102|(3:113|114|115)|104|(2:108|109)|(1:107))(2:119|(4:121|(3:133|134|135)|123|(4:125|126|127|(1:129))))))|139|(2:141|(1:143))|(2:145|(2:147|(2:149|(1:151))(1:154))))|(2:157|(1:159))|(1:161)(2:171|(1:173))|(3:163|(1:165)|166)(2:168|(1:170))|167)|42|43|(3:48|50|(0))|(0)|174|(0)|(0)(0)|(0)(0)|167)(4:187|188|(1:195)(1:192)|193))|198|39|(0)|176|178|180|181|182|183|43|(0)|(0)|174|(0)|(0)(0)|(0)(0)|167) */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0257, code lost:
        if (r1 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x025c, code lost:
        if (r14.y0 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x025e, code lost:
        r15.onConfigurationChanged(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dd, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00de, code lost:
        android.util.Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0127, code lost:
        if (defpackage.o1.a(r10) == false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        Object obj;
        Object obj2;
        boolean z4;
        g F;
        boolean z5 = false;
        if (this.z0) {
            return false;
        }
        int i3 = this.A0;
        if (i3 == -100) {
            i3 = -100;
        }
        int i4 = -1;
        boolean z6 = true;
        if (i3 != -100) {
            if (i3 != -1) {
                if (i3 != 0) {
                    if (i3 != 1 && i3 != 2) {
                        if (i3 == 3) {
                            if (this.F0 == null) {
                                this.F0 = new f(this.S);
                            }
                            F = this.F0;
                        } else {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) d5.a(this.S, UiModeManager.class)).getNightMode() != 0) {
                    F = F();
                }
                i4 = F.c();
            }
            i4 = i3;
        }
        int i5 = this.S.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        if (i4 != 1) {
            if (i4 != 2) {
                i2 = i5;
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        if (!this.D0 && (this.R instanceof Activity)) {
            PackageManager packageManager = this.S.getPackageManager();
            if (packageManager == null) {
                z2 = false;
                if ((!R0 || i2 != i5) && !z2 && !this.x0 && (this.R instanceof ContextThemeWrapper)) {
                    Configuration configuration = new Configuration();
                    configuration.uiMode = (configuration.uiMode & (-49)) | i2;
                    ((ContextThemeWrapper) this.R).applyOverrideConfiguration(configuration);
                    z3 = true;
                    int i6 = this.S.getResources().getConfiguration().uiMode & 48;
                    if (!z3 && i6 != i2 && z && !z2 && this.x0) {
                        int i7 = Build.VERSION.SDK_INT;
                        obj2 = this.R;
                        if (obj2 instanceof Activity) {
                            Activity activity = (Activity) obj2;
                            int i8 = j1.b;
                            if (i7 < 28) {
                                if (i7 <= 23) {
                                    new Handler(activity.getMainLooper()).post(new i1(activity));
                                }
                                z3 = true;
                            }
                            activity.recreate();
                            z3 = true;
                        }
                    }
                    if (z3 && i6 != i2) {
                        Resources resources = this.S.getResources();
                        Configuration configuration2 = new Configuration(resources.getConfiguration());
                        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
                        Map map = null;
                        r3 = null;
                        r3 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        resources.updateConfiguration(configuration2, null);
                        int i9 = Build.VERSION.SDK_INT;
                        if (i9 < 26 && i9 < 28) {
                            if (i9 >= 24) {
                                if (!ll0.h) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        ll0.g = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e2) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
                                    }
                                    ll0.h = true;
                                }
                                Field field = ll0.g;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e3) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!ll0.b) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                ll0.a = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e4) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                                            }
                                            ll0.b = true;
                                        }
                                        Field field2 = ll0.a;
                                        if (field2 != null) {
                                            try {
                                                obj3 = field2.get(obj);
                                            } catch (IllegalAccessException e5) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                                            }
                                        }
                                        if (obj3 != null) {
                                            ll0.a(obj3);
                                        }
                                    }
                                }
                            } else if (i9 >= 23) {
                                if (!ll0.b) {
                                    try {
                                        Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                                        ll0.a = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException e6) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e6);
                                    }
                                    ll0.b = true;
                                }
                                Field field3 = ll0.a;
                                if (field3 != null) {
                                    try {
                                        obj4 = field3.get(resources);
                                    } catch (IllegalAccessException e7) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e7);
                                    }
                                }
                                if (obj4 != null) {
                                    ll0.a(obj4);
                                }
                            } else if (i9 >= 21) {
                                if (!ll0.b) {
                                    try {
                                        Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                                        ll0.a = declaredField4;
                                        declaredField4.setAccessible(true);
                                    } catch (NoSuchFieldException e8) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e8);
                                    }
                                    ll0.b = true;
                                }
                                Field field4 = ll0.a;
                                if (field4 != null) {
                                    try {
                                        map = (Map) field4.get(resources);
                                    } catch (IllegalAccessException e9) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e9);
                                    }
                                    if (map != null) {
                                        map.clear();
                                    }
                                }
                            }
                        }
                        int i10 = this.B0;
                        if (i10 != 0) {
                            this.S.setTheme(i10);
                            if (Build.VERSION.SDK_INT >= 23) {
                                this.S.getTheme().applyStyle(this.B0, true);
                            }
                        }
                        if (z2) {
                            Object obj5 = this.R;
                            if (obj5 instanceof Activity) {
                                Activity activity2 = (Activity) obj5;
                                if (activity2 instanceof b10) {
                                    if (((b10) activity2).k().b.compareTo(c.EnumC0007c.STARTED) >= 0) {
                                        z5 = true;
                                    }
                                }
                            }
                        }
                    } else {
                        z6 = z3;
                    }
                    if (z6) {
                        Object obj6 = this.R;
                        if (obj6 instanceof AppCompatActivity) {
                            ((AppCompatActivity) obj6).getClass();
                        }
                    }
                    if (i3 == 0) {
                        F().e();
                    } else {
                        h hVar = this.E0;
                        if (hVar != null) {
                            hVar.a();
                        }
                    }
                    if (i3 == 3) {
                        if (this.F0 == null) {
                            this.F0 = new f(this.S);
                        }
                        this.F0.e();
                    } else {
                        f fVar = this.F0;
                        if (fVar != null) {
                            fVar.a();
                        }
                    }
                    return z6;
                }
                z3 = false;
                int i62 = this.S.getResources().getConfiguration().uiMode & 48;
                if (!z3) {
                    int i72 = Build.VERSION.SDK_INT;
                    obj2 = this.R;
                    if (obj2 instanceof Activity) {
                    }
                }
                if (z3) {
                }
                z6 = z3;
                if (z6) {
                }
                if (i3 == 0) {
                }
                if (i3 == 3) {
                }
                return z6;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.S, this.R.getClass()), 0);
                if (activityInfo != null && (activityInfo.configChanges & 512) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.C0 = z4;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.C0 = false;
            }
        }
        this.D0 = true;
        z2 = this.C0;
        if (!R0) {
        }
        Configuration configuration3 = new Configuration();
        configuration3.uiMode = (configuration3.uiMode & (-49)) | i2;
        ((ContextThemeWrapper) this.R).applyOverrideConfiguration(configuration3);
        z3 = true;
        int i622 = this.S.getResources().getConfiguration().uiMode & 48;
        if (!z3) {
        }
        if (z3) {
        }
        z6 = z3;
        if (z6) {
        }
        if (i3 == 0) {
        }
        if (i3 == 3) {
        }
        return z6;
    }

    public final void x(Window window) {
        int resourceId;
        Drawable g2;
        if (this.T == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof e)) {
                e eVar = new e(callback);
                this.U = eVar;
                window.setCallback(eVar);
                Context context = this.S;
                Drawable drawable = null;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, P0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    n5 a2 = n5.a();
                    synchronized (a2) {
                        g2 = a2.a.g(context, resourceId, true);
                    }
                    drawable = g2;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.T = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void y(int i2, j jVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (jVar == null && i2 >= 0) {
                j[] jVarArr = this.u0;
                if (i2 < jVarArr.length) {
                    jVar = jVarArr[i2];
                }
            }
            if (jVar != null) {
                fVar = jVar.h;
            }
        }
        if ((jVar == null || jVar.m) && !this.z0) {
            this.U.P.onPanelClosed(i2, fVar);
        }
    }

    public final void z(androidx.appcompat.view.menu.f fVar) {
        if (this.t0) {
            return;
        }
        this.t0 = true;
        this.Z.l();
        Window.Callback H = H();
        if (H != null && !this.z0) {
            H.onPanelClosed(108, fVar);
        }
        this.t0 = false;
    }

    /* renamed from: f5$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e extends j61 {
        public e(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x0192, code lost:
            if (r1.isLaidOut() != false) goto L73;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final qu0 a(ActionMode.Callback callback) {
            y4 y4Var;
            Context context;
            Context context2;
            y4 y4Var2;
            qu0.a aVar = new qu0.a(f5.this.S, callback);
            f5 f5Var = f5.this;
            f1 f1Var = f5Var.c0;
            if (f1Var != null) {
                f1Var.c();
            }
            d dVar = new d(aVar);
            f5Var.I();
            k61 k61Var = f5Var.W;
            boolean z = true;
            if (k61Var != null) {
                k61.d dVar2 = k61Var.i;
                if (dVar2 != null) {
                    dVar2.c();
                }
                k61Var.c.setHideOnContentScrollEnabled(false);
                ActionBarContextView actionBarContextView = k61Var.f;
                actionBarContextView.removeAllViews();
                actionBarContextView.d0 = null;
                actionBarContextView.R = null;
                k61.d dVar3 = new k61.d(k61Var.f.getContext(), dVar);
                dVar3.S.w();
                try {
                    if (dVar3.T.d(dVar3, dVar3.S)) {
                        k61Var.i = dVar3;
                        dVar3.i();
                        k61Var.f.f(dVar3);
                        k61Var.a(true);
                        k61Var.f.sendAccessibilityEvent(32);
                    } else {
                        dVar3 = null;
                    }
                    f5Var.c0 = dVar3;
                    if (dVar3 != null && (y4Var2 = f5Var.V) != null) {
                        y4Var2.h();
                    }
                } finally {
                    dVar3.S.v();
                }
            }
            if (f5Var.c0 == null) {
                w41 w41Var = f5Var.g0;
                if (w41Var != null) {
                    w41Var.b();
                }
                f1 f1Var2 = f5Var.c0;
                if (f1Var2 != null) {
                    f1Var2.c();
                }
                y4 y4Var3 = f5Var.V;
                if (y4Var3 != null && !f5Var.z0) {
                    try {
                        y4Var3.j();
                    } catch (AbstractMethodError unused) {
                    }
                }
                if (f5Var.d0 == null) {
                    if (f5Var.r0) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = f5Var.S.getTheme();
                        theme.resolveAttribute(ih0.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = f5Var.S.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context2 = new kg(f5Var.S, 0);
                            context2.getTheme().setTo(newTheme);
                        } else {
                            context2 = f5Var.S;
                        }
                        f5Var.d0 = new ActionBarContextView(context2, null);
                        PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, ih0.actionModePopupWindowStyle);
                        f5Var.e0 = popupWindow;
                        of0.b(popupWindow, 2);
                        f5Var.e0.setContentView(f5Var.d0);
                        f5Var.e0.setWidth(-1);
                        context2.getTheme().resolveAttribute(ih0.actionBarSize, typedValue, true);
                        f5Var.d0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                        f5Var.e0.setHeight(-2);
                        f5Var.f0 = new j5(f5Var);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) f5Var.j0.findViewById(hi0.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            f5Var.I();
                            k61 k61Var2 = f5Var.W;
                            if (k61Var2 != null) {
                                context = k61Var2.c();
                            } else {
                                context = null;
                            }
                            if (context == null) {
                                context = f5Var.S;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            f5Var.d0 = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (f5Var.d0 != null) {
                    w41 w41Var2 = f5Var.g0;
                    if (w41Var2 != null) {
                        w41Var2.b();
                    }
                    ActionBarContextView actionBarContextView2 = f5Var.d0;
                    actionBarContextView2.removeAllViews();
                    actionBarContextView2.d0 = null;
                    actionBarContextView2.R = null;
                    qt0 qt0Var = new qt0(f5Var.d0.getContext(), f5Var.d0, dVar);
                    if (dVar.d(qt0Var, qt0Var.W)) {
                        qt0Var.i();
                        f5Var.d0.f(qt0Var);
                        f5Var.c0 = qt0Var;
                        if (f5Var.i0 && (r1 = f5Var.j0) != null) {
                            WeakHashMap<View, String> weakHashMap = a41.a;
                        }
                        z = false;
                        ActionBarContextView actionBarContextView3 = f5Var.d0;
                        if (z) {
                            actionBarContextView3.setAlpha(0.0f);
                            w41 a = a41.a(f5Var.d0);
                            a.a(1.0f);
                            f5Var.g0 = a;
                            a.d(new k5(f5Var));
                        } else {
                            actionBarContextView3.setAlpha(1.0f);
                            f5Var.d0.setVisibility(0);
                            f5Var.d0.sendAccessibilityEvent(32);
                            if (f5Var.d0.getParent() instanceof View) {
                                a41.m((View) f5Var.d0.getParent());
                            }
                        }
                        if (f5Var.e0 != null) {
                            f5Var.T.getDecorView().post(f5Var.f0);
                        }
                    } else {
                        f5Var.c0 = null;
                    }
                }
                if (f5Var.c0 != null && (y4Var = f5Var.V) != null) {
                    y4Var.h();
                }
                f5Var.c0 = f5Var.c0;
            }
            f1 f1Var3 = f5Var.c0;
            if (f1Var3 == null) {
                return null;
            }
            return aVar.e(f1Var3);
        }

        @Override // defpackage.j61, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f5.this.B(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
            if (r3 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
            if (r7 != false) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x006d A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        @Override // defpackage.j61, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            boolean z;
            boolean z2;
            androidx.appcompat.view.menu.f fVar;
            boolean z3;
            if (super.dispatchKeyShortcutEvent(keyEvent)) {
                return true;
            }
            f5 f5Var = f5.this;
            int keyCode = keyEvent.getKeyCode();
            f5Var.I();
            k61 k61Var = f5Var.W;
            if (k61Var != null) {
                k61.d dVar = k61Var.i;
                if (dVar != null && (fVar = dVar.S) != null) {
                    if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    fVar.setQwertyMode(z3);
                    z2 = fVar.performShortcut(keyCode, keyEvent, 0);
                } else {
                    z2 = false;
                }
            }
            j jVar = f5Var.v0;
            if (jVar != null && f5Var.K(jVar, keyEvent.getKeyCode(), keyEvent)) {
                j jVar2 = f5Var.v0;
                if (jVar2 != null) {
                    jVar2.l = true;
                }
            } else {
                if (f5Var.v0 == null) {
                    j G = f5Var.G(0);
                    f5Var.L(G, keyEvent);
                    boolean K = f5Var.K(G, keyEvent.getKeyCode(), keyEvent);
                    G.k = false;
                }
                z = false;
                if (!z) {
                    return true;
                }
                return false;
            }
            z = true;
            if (!z) {
            }
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
        }

        @Override // defpackage.j61, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // defpackage.j61, android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            f5 f5Var = f5.this;
            if (i == 108) {
                f5Var.I();
                k61 k61Var = f5Var.W;
                if (k61Var != null) {
                    k61Var.b(true);
                }
            } else {
                f5Var.getClass();
            }
            return true;
        }

        @Override // defpackage.j61, android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            f5 f5Var = f5.this;
            if (i == 108) {
                f5Var.I();
                k61 k61Var = f5Var.W;
                if (k61Var != null) {
                    k61Var.b(false);
                }
            } else if (i == 0) {
                j G = f5Var.G(i);
                if (G.m) {
                    f5Var.A(G, false);
                }
            } else {
                f5Var.getClass();
            }
        }

        @Override // defpackage.j61, android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar;
            if (menu instanceof androidx.appcompat.view.menu.f) {
                fVar = (androidx.appcompat.view.menu.f) menu;
            } else {
                fVar = null;
            }
            if (i == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.x = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (fVar != null) {
                fVar.x = false;
            }
            return onPreparePanel;
        }

        @Override // defpackage.j61, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.f fVar = f5.this.G(0).h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // defpackage.j61, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return f5.this.h0 ? a(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // defpackage.j61, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (f5.this.h0 && i == 0) ? a(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }
}