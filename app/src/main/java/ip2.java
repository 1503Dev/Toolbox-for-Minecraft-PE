package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: ip2  reason: default package */
public final class ip2 implements jp2 {
    public static final Object U = new Object();
    public static jp2 V;
    public static jp2 W;
    public final Context Q;
    public final xv2 T;
    public final Object P = new Object();
    public final WeakHashMap R = new WeakHashMap();
    public final ExecutorService S = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public ip2(Context context, xv2 xv2Var) {
        this.Q = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.T = xv2Var;
    }

    public static jp2 a(Context context) {
        synchronized (U) {
            if (V == null) {
                if (((Boolean) wb2.e.d()).booleanValue()) {
                    if (!((Boolean) w82.d.c.a(x92.y6)).booleanValue()) {
                        V = new ip2(context, xv2.c());
                    }
                }
                V = new o7((Object) null);
            }
        }
        return V;
    }

    public static jp2 b(Context context, xv2 xv2Var) {
        synchronized (U) {
            if (W == null) {
                if (((Boolean) wb2.e.d()).booleanValue()) {
                    if (!((Boolean) w82.d.c.a(x92.y6)).booleanValue()) {
                        ip2 ip2Var = new ip2(context, xv2Var);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (ip2Var.P) {
                                ip2Var.R.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new hp2(ip2Var, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new gp2(ip2Var, Thread.getDefaultUncaughtExceptionHandler()));
                        W = ip2Var;
                    }
                }
                W = new o7((Object) null);
            }
        }
        return W;
    }

    public static String c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // defpackage.jp2
    public final void d(String str, Throwable th) {
        f(th, str, 1.0f);
    }

    public final void e(Throwable th) {
        StackTraceElement[] stackTrace;
        boolean startsWith;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    String className = stackTraceElement.getClassName();
                    br4 br4Var = mv2.b;
                    if (TextUtils.isEmpty(className)) {
                        startsWith = false;
                    } else {
                        startsWith = className.startsWith((String) wb2.d.d());
                    }
                    z |= startsWith;
                    z2 |= ip2.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z && !z2) {
                f(th, "", 1.0f);
            }
        }
    }

    @Override // defpackage.jp2
    public final void f(Throwable th, String str, float f) {
        Throwable th2;
        Throwable th3;
        boolean startsWith;
        String str2;
        int i;
        String str3;
        String str4;
        br4 br4Var = mv2.b;
        boolean z = false;
        if (((Boolean) wb2.f.d()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th4 = th; th4 != null; th4 = th4.getCause()) {
                linkedList.push(th4);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th5 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th5.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th5.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z2 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String className = stackTraceElement.getClassName();
                    if (TextUtils.isEmpty(className)) {
                        startsWith = false;
                    } else {
                        startsWith = className.startsWith((String) wb2.d.d());
                    }
                    if (startsWith) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        String className2 = stackTraceElement.getClassName();
                        if (TextUtils.isEmpty(className2) || (!className2.startsWith("android.") && !className2.startsWith("java."))) {
                            stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                        }
                        arrayList.add(stackTraceElement);
                    }
                }
                if (z2) {
                    if (th2 == null) {
                        th3 = new Throwable(th5.getMessage());
                    } else {
                        th3 = new Throwable(th5.getMessage(), th2);
                    }
                    th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    th2 = th3;
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String c = c(th);
        if (((Boolean) w82.d.c.a(x92.t7)).booleanValue()) {
            str2 = pt4.b(mv2.m(c(th), "SHA-256"));
        } else {
            str2 = "";
        }
        double d = f;
        int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        double random = Math.random();
        if (i2 > 0) {
            i = (int) (1.0f / f);
        } else {
            i = 1;
        }
        if (random < d) {
            ArrayList arrayList2 = new ArrayList();
            try {
                z = c81.a(this.Q).c();
            } catch (Throwable th6) {
                sv2.e("Error fetching instant app info", th6);
            }
            try {
                str3 = this.Q.getPackageName();
            } catch (Throwable unused) {
                sv2.g("Cannot obtain package name, proceeding.");
                str3 = "unknown";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str5 = Build.MANUFACTURER;
            String str6 = Build.MODEL;
            if (!str6.startsWith(str5)) {
                str6 = ij.c(str5, " ", str6);
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.T.P).appendQueryParameter("appid", str3).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", c).appendQueryParameter("eids", TextUtils.join(",", w82.d.a.a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "525816637").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(wb2.c.d()));
            jt jtVar = jt.b;
            Context context = this.Q;
            jtVar.getClass();
            Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("gmscv", String.valueOf(jt.a(context)));
            if (true != this.T.T) {
                str4 = "0";
            } else {
                str4 = "1";
            }
            Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("lite", str4);
            if (!TextUtils.isEmpty(str2)) {
                appendQueryParameter4.appendQueryParameter("hash", str2);
            }
            arrayList2.add(appendQueryParameter4.toString());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                this.S.execute(new oj2(1, new wv2(null), (String) it.next()));
            }
        }
    }
}