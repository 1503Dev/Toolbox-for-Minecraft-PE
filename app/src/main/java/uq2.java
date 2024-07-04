package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

/* renamed from: uq2  reason: default package */
public final class uq2 {
    public int a;
    public int b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public float k;
    public int l;
    public int m;
    public final String n;

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)(1:34)|4|(1:6)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:23|24)(1:22)))|9|10|11|12|(0)|16|(1:18)(3:20|23|24)) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c A[Catch: Exception -> 0x00b3, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b3, blocks: (B:20:0x008e, B:22:0x009c), top: B:36:0x008e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uq2(Context context) {
        ActivityInfo activityInfo;
        PackageInfo b;
        String str;
        Resources resources;
        DisplayMetrics displayMetrics;
        PackageInfo b2;
        PackageManager packageManager = context.getPackageManager();
        x92.a(context);
        c(context);
        e(context);
        d(context);
        Locale locale = Locale.getDefault();
        this.c = b(packageManager, "geo:0,0?q=donuts") != null;
        this.d = b(packageManager, "http://www.google.com") != null;
        this.e = locale.getCountry();
        cu5 cu5Var = jv5.A.c;
        mv2 mv2Var = n62.f.a;
        this.f = mv2.i();
        this.g = sk.a(context);
        this.h = sk.d(context);
        this.i = locale.getLanguage();
        ResolveInfo b3 = b(packageManager, "market://details?id=com.google.android.gms.ads");
        String str2 = null;
        if (b3 != null && (activityInfo = b3.activityInfo) != null) {
            try {
                b = c81.a(context).b(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (b != null) {
                str = b.versionCode + "." + activityInfo.packageName;
                this.j = str;
                b2 = c81.a(context).b("com.android.vending", 128);
                if (b2 != null) {
                    str2 = b2.versionCode + "." + b2.packageName;
                }
                this.n = str2;
                resources = context.getResources();
                if (resources == null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    this.k = displayMetrics.density;
                    this.l = displayMetrics.widthPixels;
                    this.m = displayMetrics.heightPixels;
                }
                return;
            }
        }
        str = null;
        this.j = str;
        b2 = c81.a(context).b("com.android.vending", 128);
        if (b2 != null) {
        }
        this.n = str2;
        resources = context.getResources();
        if (resources == null) {
            return;
        }
        this.k = displayMetrics.density;
        this.l = displayMetrics.widthPixels;
        this.m = displayMetrics.heightPixels;
    }

    public uq2(Context context, vq2 vq2Var) {
        x92.a(context);
        c(context);
        e(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        ua2.a(context);
        this.c = vq2Var.a;
        this.d = vq2Var.b;
        this.e = vq2Var.c;
        this.f = vq2Var.d;
        this.g = vq2Var.e;
        this.h = vq2Var.f;
        this.i = vq2Var.g;
        this.j = vq2Var.h;
        this.n = vq2Var.i;
        this.k = vq2Var.l;
        this.l = vq2Var.m;
        this.m = vq2Var.n;
    }

    public static ResolveInfo b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            jv5.A.g.f("DeviceInfo.getResolveInfo", th);
            return null;
        }
    }

    public final vq2 a() {
        return new vq2(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.n, this.a, this.b, this.k, this.l, this.m);
    }

    public final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                jv5.A.g.f("DeviceInfo.gatherAudioInfo", th);
            }
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void d(Context context) {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (((Boolean) w82.d.c.a(x92.B8)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            registerReceiver = context.registerReceiver(null, intentFilter, 4);
        } else {
            registerReceiver = context.registerReceiver(null, intentFilter);
        }
        if (registerReceiver != null) {
            registerReceiver.getIntExtra("status", -1);
            registerReceiver.getIntExtra("level", -1);
            registerReceiver.getIntExtra("scale", -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        telephonyManager.getNetworkOperator();
        if (qe0.b()) {
            if (((Boolean) w82.d.c.a(x92.f7)).booleanValue()) {
                networkType = 0;
                this.b = networkType;
                telephonyManager.getPhoneType();
                this.a = -2;
                cu5 cu5Var = jv5.A.c;
                if (!cu5.E(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        this.a = activeNetworkInfo.getType();
                        activeNetworkInfo.getDetailedState().ordinal();
                    } else {
                        this.a = -1;
                    }
                    connectivityManager.isActiveNetworkMetered();
                    return;
                }
                return;
            }
        }
        networkType = telephonyManager.getNetworkType();
        this.b = networkType;
        telephonyManager.getPhoneType();
        this.a = -2;
        cu5 cu5Var2 = jv5.A.c;
        if (!cu5.E(context, "android.permission.ACCESS_NETWORK_STATE")) {
        }
    }
}