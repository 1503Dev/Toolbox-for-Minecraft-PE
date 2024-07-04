package defpackage;

import android.util.Log;
import java.util.Iterator;

/* renamed from: sv2  reason: default package */
public class sv2 {
    public static final vw2 a = new vw2(new q05(0));

    public static String a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            int lineNumber = stackTrace[3].getLineNumber();
            return str + " @" + lineNumber;
        }
        return str;
    }

    public static void b(String str) {
        if (j(3)) {
            if (str != null && str.length() > 4000) {
                Iterator b = a.b(str);
                boolean z = true;
                while (b.hasNext()) {
                    String str2 = (String) b.next();
                    if (z) {
                        Log.d("Ads", str2);
                    } else {
                        Log.d("Ads-cont", str2);
                    }
                    z = false;
                }
                return;
            }
            Log.d("Ads", str);
        }
    }

    public static void c(String str, Throwable th) {
        if (j(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void d(String str) {
        if (j(6)) {
            if (str != null && str.length() > 4000) {
                Iterator b = a.b(str);
                boolean z = true;
                while (b.hasNext()) {
                    String str2 = (String) b.next();
                    if (z) {
                        Log.e("Ads", str2);
                    } else {
                        Log.e("Ads-cont", str2);
                    }
                    z = false;
                }
                return;
            }
            Log.e("Ads", str);
        }
    }

    public static void e(String str, Throwable th) {
        if (j(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void f(String str) {
        if (j(4)) {
            if (str != null && str.length() > 4000) {
                Iterator b = a.b(str);
                boolean z = true;
                while (b.hasNext()) {
                    String str2 = (String) b.next();
                    if (z) {
                        Log.i("Ads", str2);
                    } else {
                        Log.i("Ads-cont", str2);
                    }
                    z = false;
                }
                return;
            }
            Log.i("Ads", str);
        }
    }

    public static void g(String str) {
        if (j(5)) {
            if (str != null && str.length() > 4000) {
                Iterator b = a.b(str);
                boolean z = true;
                while (b.hasNext()) {
                    String str2 = (String) b.next();
                    if (z) {
                        Log.w("Ads", str2);
                    } else {
                        Log.w("Ads-cont", str2);
                    }
                    z = false;
                }
                return;
            }
            Log.w("Ads", str);
        }
    }

    public static void h(String str, Throwable th) {
        if (j(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void i(String str, Exception exc) {
        if (j(5)) {
            String a2 = a(str);
            if (exc != null) {
                h(a2, exc);
            } else {
                g(a2);
            }
        }
    }

    public static boolean j(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}