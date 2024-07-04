package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import defpackage.ad1;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

@SuppressLint({"ObsoleteSdkInt"})
/* renamed from: he1  reason: default package */
public final class he1 {
    public boolean d;
    public final mc1 a = new mc1();
    public final mc1 b = new mc1();
    public String c = "";
    public String e = "";
    public ic1 f = new ic1();
    public String g = "";

    public static double d() {
        Context context = ga1.P;
        if (context == null) {
            return 0.0d;
        }
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return 0.0d;
            }
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 < 0) {
                return 0.0d;
            }
            double d = intExtra;
            double d2 = intExtra2;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    public static String e() {
        Context context = ga1.P;
        String str = "";
        if (context == null) {
            return "";
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkOperatorName();
        }
        if (str.length() == 0) {
            return "unknown";
        }
        return str;
    }

    public static float f() {
        Context context = ga1.P;
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static Rect g() {
        Rect rect = new Rect();
        Context context = ga1.P;
        if (context != null) {
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                return rect;
            } catch (RuntimeException unused) {
                return rect;
            }
        }
        return rect;
    }

    public static Rect h() {
        Rect rect;
        Point point;
        int i;
        Resources resources;
        String str;
        int i2;
        Rect rect2;
        Rect rect3 = new Rect();
        Context context = ga1.P;
        if (context != null) {
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null) {
                    char c = 1;
                    if (Build.VERSION.SDK_INT < 30) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        DisplayMetrics displayMetrics2 = new DisplayMetrics();
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getMetrics(displayMetrics);
                        defaultDisplay.getRealMetrics(displayMetrics2);
                        ThreadPoolExecutor threadPoolExecutor = eg1.a;
                        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                        if (identifier > 0) {
                            i = context.getResources().getDimensionPixelSize(identifier);
                        } else {
                            i = 0;
                        }
                        if (context.getResources().getConfiguration().orientation == 1) {
                            resources = context.getResources();
                            str = "navigation_bar_height";
                        } else {
                            resources = context.getResources();
                            str = "navigation_bar_height_landscape";
                        }
                        int identifier2 = resources.getIdentifier(str, "dimen", "android");
                        if (identifier2 > 0) {
                            i2 = context.getResources().getDimensionPixelSize(identifier2);
                        } else {
                            i2 = 0;
                        }
                        int i3 = displayMetrics2.heightPixels - displayMetrics.heightPixels;
                        if (i3 <= 0) {
                            rect2 = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels - i);
                        } else {
                            if (i2 > 0 && (i3 > i || i2 <= i)) {
                                rect = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics2.heightPixels - (i2 + i));
                            }
                            rect2 = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics2.heightPixels - i);
                        }
                        return rect2;
                    }
                    WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                    try {
                        Point point2 = new Point();
                        Point point3 = new Point();
                        context.getDisplay().getCurrentSizeRange(point2, point3);
                        if (currentWindowMetrics.getBounds().width() > currentWindowMetrics.getBounds().height()) {
                            c = 2;
                        }
                        if (c == 2) {
                            point = new Point(point3.x, point2.y);
                        } else {
                            point = new Point(point2.x, point3.y);
                        }
                        rect = new Rect(0, 0, point.x, point.y);
                    } catch (UnsupportedOperationException unused) {
                        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.statusBars());
                        rect = new Rect(0, 0, currentWindowMetrics.getBounds().width() - (insetsIgnoringVisibility.right + insetsIgnoringVisibility.left), currentWindowMetrics.getBounds().height() - (insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom));
                    }
                    return rect;
                }
                return rect3;
            } catch (RuntimeException unused2) {
                return rect3;
            }
        }
        return rect3;
    }

    public final void a(Context context, ad1.e.a aVar) {
        boolean z;
        Throwable th;
        if (context == null) {
            if (aVar != null) {
                th = new Throwable("Context cannot be null.");
                aVar.b(th);
            }
            this.a.b(true);
        }
        if (this.c.isEmpty()) {
            this.a.b(false);
        }
        try {
            eg1.a.execute(new de1(this, context, aVar));
            z = true;
        } catch (RejectedExecutionException unused) {
            z = false;
        }
        if (z) {
            return;
        }
        t1.b(0, 0, "Executing Query Advertising ID failed.", true);
        if (aVar != null) {
            th = new Throwable("Query Advertising ID failed on execute.");
            aVar.b(th);
        }
        this.a.b(true);
    }

    public final ic1 b() {
        String string;
        ic1 ic1Var = new ic1();
        String str = this.c;
        eb1.j(ic1Var, "advertiser_id", str);
        eb1.m(ic1Var, "limit_tracking", this.d);
        if (str == null || str.isEmpty()) {
            Context context = ga1.P;
            if (context == null) {
                string = "";
            } else {
                string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            }
            eb1.j(ic1Var, "android_id_sha1", eg1.m(string));
        }
        return ic1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)(1:93)|4|(2:6|(35:8|(1:10)(1:91)|11|(1:15)(1:90)|16|17|18|115|22|23|(1:25)|26|(6:28|(1:30)(1:37)|31|32|33|34)|38|(1:42)|43|(1:45)(1:86)|46|(2:48|(1:(1:51))(1:52))|53|(1:85)(1:57)|58|(1:66)|67|(1:69)|70|(1:72)|73|(1:75)|76|(1:78)|79|(1:81)|82|83))|92|(0)(0)|11|(6:13|15|16|17|18|115)|90|16|17|18|115) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0120, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0121, code lost:
        r7 = defpackage.e5.b("JSON error in ADCJSON putLong(): ");
        r7.append(r2.toString());
        r7.append(" with key: memory_used_mb");
        r7.append(" and value: " + r5);
        defpackage.t1.b(0, 0, r7.toString(), true);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0116 A[Catch: all -> 0x011d, TRY_ENTER, TryCatch #2 {JSONException -> 0x0120, blocks: (B:24:0x0113, B:25:0x0115, B:26:0x0116, B:27:0x011b), top: B:105:0x0113 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ic1 c() {
        int i;
        boolean z;
        String str;
        Context context;
        int i2;
        int dSTSavings;
        boolean z2;
        int i3;
        TelephonyManager telephonyManager;
        Application application;
        ActivityManager activityManager;
        ic1 ic1Var = new ic1();
        ad1 h = ga1.h();
        eb1.j(ic1Var, "carrier_name", e());
        eb1.j(ic1Var, "data_path", h.r().c);
        eb1.l(Build.VERSION.SDK_INT, ic1Var, "device_api");
        Rect g = g();
        eb1.l(g.width(), ic1Var, "screen_width");
        eb1.l(g.height(), ic1Var, "screen_height");
        Context context2 = ga1.P;
        boolean z3 = false;
        if (context2 != null) {
            i = context2.getResources().getConfiguration().densityDpi;
        } else {
            i = 0;
        }
        eb1.l(i, ic1Var, "display_dpi");
        Context context3 = ga1.P;
        if (context3 != null) {
            DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
            float f = displayMetrics.widthPixels / displayMetrics.xdpi;
            float f2 = displayMetrics.heightPixels / displayMetrics.ydpi;
            if (Math.sqrt((f2 * f2) + (f * f)) >= 6.0d) {
                z = true;
                if (!z) {
                    str = "tablet";
                } else {
                    str = "phone";
                }
                eb1.j(ic1Var, "device_type", str);
                eb1.j(ic1Var, "locale_language_code", Locale.getDefault().getLanguage());
                eb1.j(ic1Var, "ln", Locale.getDefault().getLanguage());
                eb1.j(ic1Var, "locale_country_code", Locale.getDefault().getCountry());
                eb1.j(ic1Var, "locale", Locale.getDefault().getCountry());
                eb1.j(ic1Var, "mac_address", "");
                String str2 = Build.MANUFACTURER;
                eb1.j(ic1Var, "manufacturer", str2);
                eb1.j(ic1Var, "device_brand", str2);
                eb1.j(ic1Var, "media_path", h.r().b);
                eb1.j(ic1Var, "temp_storage_path", h.r().d);
                context = ga1.P;
                if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
                    i2 = 0;
                } else {
                    i2 = activityManager.getMemoryClass();
                }
                eb1.l(i2, ic1Var, "memory_class");
                Runtime runtime = Runtime.getRuntime();
                long freeMemory = (runtime.totalMemory() - runtime.freeMemory()) / 1048576;
                synchronized (ic1Var.a) {
                    ic1Var.a.put("memory_used_mb", freeMemory);
                }
                String str3 = Build.MODEL;
                eb1.j(ic1Var, "model", str3);
                eb1.j(ic1Var, "device_model", str3);
                eb1.j(ic1Var, "sdk_type", "android_native");
                eb1.j(ic1Var, "sdk_version", "4.8.0");
                if (h.k == null) {
                    h.k = new rd1();
                }
                h.k.getClass();
                eb1.j(ic1Var, "network_type", rd1.b());
                eb1.j(ic1Var, "os_version", Build.VERSION.RELEASE);
                eb1.j(ic1Var, "os_name", "android");
                eb1.j(ic1Var, "platform", "android");
                eb1.j(ic1Var, "arch", System.getProperty("os.arch").toLowerCase(Locale.ENGLISH));
                eb1.j(ic1Var, "user_id", h.p().b.q("user_id"));
                eb1.j(ic1Var, "app_id", h.p().a);
                ThreadPoolExecutor threadPoolExecutor = eg1.a;
                Context context4 = ga1.P;
                String str4 = "";
                if (context4 != null) {
                    if (context4 instanceof Application) {
                        application = (Application) context4;
                    } else {
                        application = ((Activity) context4).getApplication();
                    }
                    PackageManager packageManager = application.getPackageManager();
                    try {
                        str4 = packageManager.getApplicationLabel(packageManager.getApplicationInfo(context4.getPackageName(), 0)).toString();
                    } catch (Exception unused) {
                        t1.b(0, 0, "Failed to retrieve application label.", true);
                    }
                }
                eb1.j(ic1Var, "app_bundle_name", str4);
                eb1.j(ic1Var, "app_bundle_version", eg1.p());
                eb1.g(ic1Var, "battery_level", d());
                Context context5 = ga1.P;
                String str5 = "";
                if (context5 != null && (telephonyManager = (TelephonyManager) context5.getSystemService("phone")) != null) {
                    str5 = telephonyManager.getSimCountryIso();
                }
                eb1.j(ic1Var, "cell_service_country_code", str5);
                eb1.j(ic1Var, "timezone_ietf", TimeZone.getDefault().getID());
                eb1.l(TimeZone.getDefault().getOffset(15L) / 60000, ic1Var, "timezone_gmt_m");
                TimeZone timeZone = TimeZone.getDefault();
                if (!timeZone.inDaylightTime(new Date())) {
                    dSTSavings = 0;
                } else {
                    dSTSavings = timeZone.getDSTSavings() / 60000;
                }
                eb1.l(dSTSavings, ic1Var, "timezone_dst_m");
                eb1.i(ic1Var, "launch_metadata", this.f);
                eb1.j(ic1Var, "controller_version", h.z);
                Context context6 = ga1.P;
                int i4 = 2;
                if (context6 != null) {
                    int i5 = context6.getResources().getConfiguration().orientation;
                    if (i5 != 1) {
                        if (i5 == 2) {
                            i4 = 1;
                        }
                    } else {
                        i4 = 0;
                    }
                }
                eb1.l(i4, ic1Var, "current_orientation");
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 23 && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                eb1.m(ic1Var, "cleartext_permitted", z2);
                eb1.g(ic1Var, "density", f());
                Context context7 = ga1.P;
                if (context7 != null && i6 >= 29 && (i3 = context7.getResources().getConfiguration().uiMode & 48) != 16 && i3 == 32) {
                    z3 = true;
                }
                eb1.m(ic1Var, "dark_mode", z3);
                jf1 r = ga1.h().r();
                ic1 b = r.b();
                String q = b.q("adc_alt_id");
                if (q.isEmpty()) {
                    q = UUID.randomUUID().toString();
                    eb1.j(b, "adc_alt_id", q);
                    eb1.q(b, r.a + "AppVersion");
                }
                eb1.j(ic1Var, "adc_alt_id", q);
                nr nrVar = new nr();
                if (eg1.r("com.android.vending")) {
                    nrVar.d("google");
                }
                if (eg1.r("com.amazon.venezia")) {
                    nrVar.d("amazon");
                }
                if (eg1.r("com.huawei.appmarket")) {
                    nrVar.d("huawei");
                }
                if (eg1.r("com.sec.android.app.samsungapps")) {
                    nrVar.d("samsung");
                }
                eb1.h(ic1Var, "available_stores", nrVar);
                return ic1Var;
            }
        }
        z = false;
        if (!z) {
        }
        eb1.j(ic1Var, "device_type", str);
        eb1.j(ic1Var, "locale_language_code", Locale.getDefault().getLanguage());
        eb1.j(ic1Var, "ln", Locale.getDefault().getLanguage());
        eb1.j(ic1Var, "locale_country_code", Locale.getDefault().getCountry());
        eb1.j(ic1Var, "locale", Locale.getDefault().getCountry());
        eb1.j(ic1Var, "mac_address", "");
        String str22 = Build.MANUFACTURER;
        eb1.j(ic1Var, "manufacturer", str22);
        eb1.j(ic1Var, "device_brand", str22);
        eb1.j(ic1Var, "media_path", h.r().b);
        eb1.j(ic1Var, "temp_storage_path", h.r().d);
        context = ga1.P;
        if (context == null) {
            i2 = activityManager.getMemoryClass();
            eb1.l(i2, ic1Var, "memory_class");
            Runtime runtime2 = Runtime.getRuntime();
            long freeMemory2 = (runtime2.totalMemory() - runtime2.freeMemory()) / 1048576;
            synchronized (ic1Var.a) {
            }
        }
        i2 = 0;
        eb1.l(i2, ic1Var, "memory_class");
        Runtime runtime22 = Runtime.getRuntime();
        long freeMemory22 = (runtime22.totalMemory() - runtime22.freeMemory()) / 1048576;
        synchronized (ic1Var.a) {
        }
    }
}