package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.preference.PreferenceManager;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: eg1  reason: default package */
public final class eg1 {
    public static ThreadPoolExecutor a = z();
    public static Handler b;

    /* renamed from: eg1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a extends Runnable {
        boolean a();
    }

    /* renamed from: eg1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public long a;
        public long b;

        public b(long j) {
            this.b = System.currentTimeMillis();
            this.a = j;
            this.b = System.currentTimeMillis() + this.a;
        }

        public final long a() {
            long currentTimeMillis = this.b - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                return 0L;
            }
            return currentTimeMillis;
        }

        public final String toString() {
            double a = a();
            Double.isNaN(a);
            return String.valueOf(a / 1000.0d);
        }
    }

    public static double a(AudioManager audioManager) {
        String sb;
        if (audioManager == null) {
            sb = "getAudioVolume() called with a null AudioManager";
        } else {
            try {
                double streamVolume = audioManager.getStreamVolume(3);
                double streamMaxVolume = audioManager.getStreamMaxVolume(3);
                if (streamMaxVolume == 0.0d) {
                    return 0.0d;
                }
                Double.isNaN(streamVolume);
                Double.isNaN(streamMaxVolume);
                Double.isNaN(streamVolume);
                Double.isNaN(streamMaxVolume);
                return streamVolume / streamMaxVolume;
            } catch (Exception e) {
                StringBuilder b2 = e5.b("Exception occurred when accessing AudioManager: ");
                b2.append(e.toString());
                sb = b2.toString();
            }
        }
        t1.b(0, 0, sb, true);
        return 0.0d;
    }

    public static int b(ka1 ka1Var) {
        if (ka1Var == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        ka1Var.getLocationOnScreen(iArr);
        ga1.h().l().getClass();
        return (int) (iArr[0] / he1.f());
    }

    public static AudioManager c(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    public static String d(nr nrVar) {
        StringBuilder b2;
        String str;
        String str2 = "";
        for (int i = 0; i < nrVar.c(); i++) {
            if (i > 0) {
                str2 = k6.b(str2, ",");
            }
            switch (((JSONArray) nrVar.b).getInt(i)) {
                case 1:
                    b2 = e5.b(str2);
                    str = "MO";
                    break;
                case 2:
                    b2 = e5.b(str2);
                    str = "TU";
                    break;
                case 3:
                    b2 = e5.b(str2);
                    str = "WE";
                    break;
                case 4:
                    b2 = e5.b(str2);
                    str = "TH";
                    break;
                case 5:
                    b2 = e5.b(str2);
                    str = "FR";
                    break;
                case 6:
                    b2 = e5.b(str2);
                    str = "SA";
                    break;
                case 7:
                    b2 = e5.b(str2);
                    str = "SU";
                    break;
                default:
            }
            b2.append(str);
            str2 = b2.toString();
        }
        return str2;
    }

    public static void e(long j, Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (j <= 0) {
            n(runnable);
            return;
        }
        Handler t = t();
        if (t != null) {
            t.postDelayed(runnable, j);
        }
    }

    public static void f(String str) {
        Context context = ga1.P;
        if (context != null) {
            n(new dg1(context, str));
        }
    }

    public static void g(a aVar) {
        Handler t;
        if (aVar == null || (t = t()) == null) {
            return;
        }
        t.removeCallbacks(aVar);
        if (aVar.a()) {
            return;
        }
        if (t.getLooper() == Looper.myLooper()) {
            aVar.run();
        } else {
            t.post(aVar);
        }
    }

    public static boolean h(Context context, long j) {
        try {
            Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
            if (vibrator != null && vibrator.hasVibrator()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(j, -1));
                } else {
                    vibrator.vibrate(j);
                }
                return true;
            }
        } catch (Exception unused) {
            t1.b(0, 1, "Vibrate command failed.", false);
        }
        return false;
    }

    public static boolean i(Intent intent, boolean z) {
        boolean z2;
        try {
            Context context = ga1.P;
            if (context == null) {
                return false;
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            i2 i2Var = ga1.h().o;
            if (i2Var != null) {
                zd1 zd1Var = i2Var.d;
                if (zd1Var != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    zd1Var.h = true;
                }
            }
            if (z) {
                intent = Intent.createChooser(intent, "Handle this via...");
            }
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            t1.b(0, 1, e.toString(), true);
            return false;
        }
    }

    public static int j(ka1 ka1Var) {
        if (ka1Var == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        ka1Var.getLocationOnScreen(iArr);
        ga1.h().l().getClass();
        return (int) (iArr[1] / he1.f());
    }

    public static String k(nr nrVar) {
        String str = "";
        for (int i = 0; i < nrVar.c(); i++) {
            if (i > 0) {
                str = k6.b(str, ",");
            }
            StringBuilder b2 = e5.b(str);
            b2.append(((JSONArray) nrVar.b).getInt(i));
            str = b2.toString();
        }
        return str;
    }

    public static String l(Context context, String str) {
        try {
            return o(context).getString(str, null);
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Key " + str + " in SharedPreferences ");
            sb.append("does not have a String value.");
            t1.b(0, 1, sb.toString(), true);
            return null;
        }
    }

    public static String m(String str) {
        int i;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("iso-8859-1"), 0, str.length());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                int i2 = (b2 >>> 4) & 15;
                int i3 = 0;
                while (true) {
                    if (i2 >= 0 && i2 <= 9) {
                        i = i2 + 48;
                    } else {
                        i = (i2 - 10) + 97;
                    }
                    sb.append((char) i);
                    i2 = b2 & 15;
                    int i4 = i3 + 1;
                    if (i3 >= 1) {
                        break;
                    }
                    i3 = i4;
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean n(Runnable runnable) {
        Handler t;
        if (runnable == null || (t = t()) == null) {
            return false;
        }
        if (t.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return t.post(runnable);
    }

    public static SharedPreferences o(Context context) {
        try {
            Class.forName("androidx.preference.PreferenceManager");
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (ClassNotFoundException unused) {
            return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        }
    }

    public static String p() {
        Context context = ga1.P;
        if (context == null) {
            return "1.0";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            t1.b(0, 0, "Failed to retrieve package info.", true);
            return "1.0";
        }
    }

    public static void q(Runnable runnable) {
        Handler t;
        if (runnable == null || (t = t()) == null) {
            return;
        }
        t.removeCallbacks(runnable);
    }

    public static boolean r(String str) {
        Application application;
        Context context = ga1.P;
        if (context == null) {
            return false;
        }
        try {
            if (context instanceof Application) {
                application = (Application) context;
            } else {
                application = ((Activity) context).getApplication();
            }
            application.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int s(String str) {
        if (str.equals("portrait")) {
            return 0;
        }
        return !str.equals("landscape") ? -1 : 1;
    }

    public static Handler t() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return null;
        }
        if (b == null) {
            b = new Handler(mainLooper);
        }
        return b;
    }

    public static boolean u(String str) {
        if (str != null && str.length() <= 128) {
            return true;
        }
        t1.b(0, 1, "String must be non-null and the max length is 128 characters.", false);
        return false;
    }

    public static int v(String str) {
        try {
            return (int) Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            t1.b(0, 1, ij.c("Unable to parse '", str, "' as a color."), true);
            return -16777216;
        }
    }

    public static String w() {
        Context context = ga1.P;
        if ((context instanceof Activity) && context.getResources().getConfiguration().orientation == 1) {
            return "portrait";
        }
        return "landscape";
    }

    public static Date x(String str) {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ", locale);
        try {
            try {
                try {
                    return simpleDateFormat.parse(str);
                } catch (Exception unused) {
                    return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale).parse(str);
                }
            } catch (Exception unused2) {
                return null;
            }
        } catch (Exception unused3) {
            return new SimpleDateFormat("yyyy-MM-dd", locale).parse(str);
        }
    }

    public static boolean y() {
        Context context = ga1.P;
        if (context != null && Build.VERSION.SDK_INT >= 24 && (context instanceof Activity) && cg1.a((Activity) context)) {
            return true;
        }
        return false;
    }

    public static ThreadPoolExecutor z() {
        return new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }
}