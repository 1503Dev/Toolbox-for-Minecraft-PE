package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: lb4  reason: default package */
public final class lb4 {
    public static final Object a = new Object();

    @Pure
    public static void a(String str, String str2) {
        synchronized (a) {
            Log.e(str, str2);
        }
    }

    @Pure
    public static void b(String str, String str2, Throwable th) {
        a(str, e(str2, th));
    }

    @Pure
    public static void c(String str, String str2) {
        synchronized (a) {
            Log.w(str, str2);
        }
    }

    @Pure
    public static void d(String str, String str2, Exception exc) {
        c(str, e(str2, exc));
    }

    @Pure
    public static String e(String str, Throwable th) {
        String replace;
        synchronized (a) {
            try {
                if (th == null) {
                    replace = null;
                } else {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 != null) {
                            if (th2 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                                break;
                            }
                            th2 = th2.getCause();
                        } else {
                            replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                    }
                }
            } finally {
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            return ho.b(str, "\n  ", replace.replace("\n", "\n  "), "\n");
        }
        return str;
    }
}