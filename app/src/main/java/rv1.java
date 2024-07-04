package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: rv1  reason: default package */
public final class rv1 {
    public static final boolean a = Log.isLoggable("Volley", 2);
    public static final String b = rv1.class.getName();

    public static void a(String str, Object... objArr) {
        Log.d("Volley", d(str, objArr));
    }

    public static void b(String str, Object... objArr) {
        Log.e("Volley", d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        if (a) {
            Log.v("Volley", d(str, objArr));
        }
    }

    public static String d(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i < stackTrace.length) {
                if (!stackTrace[i].getClassName().equals(b)) {
                    String className = stackTrace[i].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    str2 = ij.c(substring.substring(substring.lastIndexOf(36) + 1), ".", stackTrace[i].getMethodName());
                    break;
                }
                i++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, format);
    }
}