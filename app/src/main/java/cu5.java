package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import defpackage.cg;
import defpackage.ph;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: cu5  reason: default package */
public final class cu5 {
    public static final wi4 i = new wi4(Looper.getMainLooper());
    public String e;
    public final AtomicReference a = new AtomicReference(null);
    public final AtomicReference b = new AtomicReference(null);
    public boolean c = true;
    public final Object d = new Object();
    public boolean f = false;
    public boolean g = false;
    public final ExecutorService h = Executors.newSingleThreadExecutor();

    public static final String A() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return ij.c(str, " ", str2);
    }

    public static final DisplayMetrics B(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final long C(View view) {
        int i2;
        float f = Float.MAX_VALUE;
        ViewParent viewParent = view;
        do {
            if (!(viewParent instanceof View)) {
                break;
            }
            View view2 = viewParent;
            f = Math.min(f, view2.getAlpha());
            i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            viewParent = view2.getParent();
        } while (i2 > 0);
        return Math.round((f >= 0.0f ? f : 0.0f) * 100.0f);
    }

    public static final co2 D(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                sv2.d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            if (queryLocalInterface instanceof co2) {
                return (co2) queryLocalInterface;
            }
            return new fm2(iBinder);
        } catch (Exception e) {
            jv5.A.g.f("Failed to instantiate WorkManagerUtil", e);
            return null;
        }
    }

    public static final boolean E(Context context, String str) {
        Context a = br2.a(context);
        if (c81.a(a).a.getPackageManager().checkPermission(str, a.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean F(Context context) {
        try {
            if (sk.f == null) {
                sk.f = Boolean.valueOf(qe0.b() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return sk.f.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean G(String str) {
        if (!rv2.c()) {
            return false;
        }
        l92 l92Var = x92.e4;
        w82 w82Var = w82.d;
        if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            return false;
        }
        String str2 = (String) w82Var.c.a(x92.g4);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) w82.d.c.a(x92.f4);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean H(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            sv2.e("Error loading class.", th);
            jv5.A.g.f("AdUtil.isLiteSdk", th);
            return false;
        }
    }

    public static final boolean a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean b(Context context) {
        Bundle bundle;
        try {
            bundle = c81.a(context).a(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            vz3.l("Error getting metadata", e);
            bundle = null;
        }
        String string = bundle.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
        if (TextUtils.isEmpty(o(bundle)) && !TextUtils.isEmpty(string)) {
            return true;
        }
        return false;
    }

    public static final boolean c(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void d(View view, int i2) {
        String str;
        int i3;
        int i4;
        int i5;
        String str2;
        yh4 z;
        ci4 C;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof tq3) {
                view2 = ((tq3) view2).getChildAt(0);
            }
            if (!(view2 instanceof b25) && !(view2 instanceof f70)) {
                str = "UNKNOWN";
                i3 = 0;
            } else {
                str = "NATIVE";
                i3 = 1;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i5 = rect.width();
                i4 = rect.height();
            } else {
                i4 = 0;
                i5 = 0;
            }
            cu5 cu5Var = jv5.A.c;
            long C2 = C(view2);
            view2.getLocationOnScreen(iArr);
            int i6 = iArr[0];
            int i7 = iArr[1];
            String str3 = "none";
            if (!(view2 instanceof r13) || (C = ((r13) view2).C()) == null) {
                str2 = "none";
            } else {
                str2 = C.b;
                int hashCode = view2.hashCode();
                view2.setContentDescription(str2 + ":" + hashCode);
            }
            if ((view2 instanceof p03) && (z = ((p03) view2).z()) != null) {
                str = yh4.a(z.b);
                i3 = z.e;
                str3 = z.E;
            }
            sv2.f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i3), view2.getClass().getName(), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i5), Integer.valueOf(i4), Long.valueOf(C2), Integer.toString(i2, 2)));
        } catch (Exception e) {
            sv2.e("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder e(Context context) {
        return new AlertDialog.Builder(context, jv5.A.e.a());
    }

    public static final void f(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new xt2(context, str, (String) it.next()).b();
        }
    }

    public static final int g(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            sv2.g("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    public static final HashMap h(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final int[] i(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(16908290)) == null) ? new int[]{0, 0} : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] j(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (findViewById = window.findViewById(16908290)) == null) ? new int[]{0, 0} : new int[]{findViewById.getTop(), findViewById.getBottom()};
        n62 n62Var = n62.f;
        return new int[]{n62Var.a.d(activity, iArr[0]), n62Var.a.d(activity, iArr[1])};
    }

    public static final boolean k(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z;
        if (!jv5.A.c.c && keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode() && !w(view)) {
            z = false;
        } else {
            z = true;
        }
        long C = C(view);
        if (view.getVisibility() != 0 || !view.isShown()) {
            return false;
        }
        if ((powerManager != null && !powerManager.isScreenOn()) || !z) {
            return false;
        }
        l92 l92Var = x92.W0;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && !view.getLocalVisibleRect(new Rect()) && !view.getGlobalVisibleRect(new Rect())) {
            return false;
        }
        if (((Boolean) w82Var.c.a(x92.k8)).booleanValue()) {
            if (C < ((Integer) w82Var.c.a(x92.m8)).intValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final void l(Context context, Intent intent) {
        if (((Boolean) w82.d.c.a(x92.C8)).booleanValue()) {
            try {
                try {
                    context.startActivity(intent);
                    return;
                } catch (Throwable unused) {
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
            } catch (SecurityException e) {
                sv2.h("", e);
                jv5.A.g.f("AdUtil.startActivityWithUnknownContext", e);
                return;
            }
        }
        try {
            context.startActivity(intent);
        } catch (Throwable unused2) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final void m(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            x(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            sv2.b("Opening " + uri2 + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            sv2.e("No browser is found.", e);
        }
    }

    public static final int[] n(Activity activity) {
        int[] i2 = i(activity);
        n62 n62Var = n62.f;
        return new int[]{n62Var.a.d(activity, i2[0]), n62Var.a.d(activity, i2[1])};
    }

    public static String o(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    public static boolean p(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static int q(int i2) {
        if (i2 >= 5000) {
            return i2;
        }
        if (i2 > 0) {
            sv2.g("HTTP timeout too low: " + i2 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
            return 60000;
        }
        return 60000;
    }

    public static int v(Context context, Uri uri) {
        int i2;
        String g;
        if (context == null) {
            vz3.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            vz3.k("Chrome Custom Tabs can only work with Activity context.");
            i2 = 2;
        } else {
            i2 = 0;
        }
        l92 l92Var = x92.K3;
        w82 w82Var = w82.d;
        l92 l92Var2 = x92.L3;
        if (true == ((Boolean) w82Var.c.a(l92Var)).equals(w82Var.c.a(l92Var2))) {
            i2 = 9;
        }
        if (i2 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i2;
        }
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            ua2 ua2Var = new ua2();
            ua2Var.d = new gp5(ua2Var, context, uri);
            Activity activity = (Activity) context;
            if (ua2Var.b == null && (g = s45.g(activity)) != null) {
                vj5 vj5Var = new vj5(ua2Var);
                ua2Var.c = vj5Var;
                vj5Var.a = activity.getApplicationContext();
                Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(g)) {
                    intent2.setPackage(g);
                }
                activity.bindService(intent2, vj5Var, 33);
            }
        }
        if (((Boolean) w82Var.c.a(l92Var2)).booleanValue()) {
            ph a = new ph.a().a();
            a.a.setPackage(s45.g(context));
            a.a.setData(uri);
            Intent intent3 = a.a;
            Bundle bundle = a.b;
            Object obj = cg.a;
            cg.a.b(context, intent3, bundle);
            return 5;
        }
        return 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean w(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView != null) {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity != null) {
                    return false;
                }
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
            }
        }
        activity = null;
        if (activity != null) {
        }
    }

    public static final void x(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String y(Context context) {
        Bundle bundle;
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        try {
            bundle = c81.a(context).a(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            vz3.l("Error getting metadata", e);
            bundle = null;
        }
        return o(bundle);
    }

    public static final String z() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public final String r(final Context context, String str) {
        final Context context2;
        synchronized (this.d) {
            String str2 = this.e;
            if (str2 != null) {
                return str2;
            }
            if (str == null) {
                return z();
            }
            try {
                if (d03.b == null) {
                    d03.b = new d03();
                }
                d03 d03Var = d03.b;
                if (TextUtils.isEmpty(d03Var.a)) {
                    AtomicBoolean atomicBoolean = ot.a;
                    try {
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    } catch (PackageManager.NameNotFoundException unused) {
                        context2 = null;
                    }
                    d03Var.a = (String) lx2.a(context, new Callable() { // from class: ez2
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SharedPreferences sharedPreferences;
                            Context context3 = context2;
                            Context context4 = context;
                            boolean z = false;
                            if (context3 != null) {
                                vz3.k("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                vz3.k("Attempting to read user agent from local cache.");
                                sharedPreferences = context4.getSharedPreferences("admob_user_agent", 0);
                                z = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (TextUtils.isEmpty(string)) {
                                vz3.k("Reading user agent from WebSettings");
                                string = WebSettings.getDefaultUserAgent(context4);
                                if (z) {
                                    sharedPreferences.edit().putString("user_agent", string).apply();
                                    vz3.k("Persisting user agent.");
                                }
                            }
                            return string;
                        }
                    });
                }
                this.e = d03Var.a;
            } catch (Exception unused2) {
            }
            if (TextUtils.isEmpty(this.e)) {
                this.e = WebSettings.getDefaultUserAgent(context);
            }
            if (TextUtils.isEmpty(this.e)) {
                this.e = z();
            }
            this.e = this.e + " (Mobile; " + str;
            try {
                if (c81.a(context).c()) {
                    this.e = this.e + ";aia";
                }
            } catch (Exception e) {
                jv5.A.g.f("AdUtil.getUserAgent", e);
            }
            String str3 = this.e + ")";
            this.e = str3;
            return str3;
        }
    }

    public final void s(Context context, String str, HttpURLConnection httpURLConnection, int i2) {
        int q = q(i2);
        sv2.f("HTTP timeout: " + q + " milliseconds.");
        httpURLConnection.setConnectTimeout(q);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(q);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", r(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void t(Context context) {
        if (this.g) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        x92.a(context);
        if (((Boolean) w82.d.c.a(x92.B8)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            t50.b(context.getApplicationContext(), new br5(), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new br5(), intentFilter);
        }
        this.g = true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void u(Context context) {
        if (this.f) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        x92.a(context);
        if (((Boolean) w82.d.c.a(x92.B8)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            h30.a(context.getApplicationContext(), new at5(this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new at5(this), intentFilter);
        }
        this.f = true;
    }
}