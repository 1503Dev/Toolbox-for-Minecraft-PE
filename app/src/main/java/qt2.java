package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: qt2  reason: default package */
public final class qt2 {
    public final AtomicReference a = new AtomicReference(null);
    public final Object b = new Object();
    public String c = null;
    public String d = null;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(-1);
    public final AtomicReference g = new AtomicReference(null);
    public final AtomicReference h = new AtomicReference(null);
    public final ConcurrentHashMap i = new ConcurrentHashMap(9);
    public final AtomicReference j = new AtomicReference(null);
    public final ArrayBlockingQueue k = new ArrayBlockingQueue(20);
    public final Object l = new Object();

    public static final boolean k(Context context) {
        l92 l92Var = x92.b0;
        w82 w82Var = w82.d;
        if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) w82Var.c.a(x92.c0)).intValue()) {
            return false;
        }
        if (((Boolean) w82Var.c.a(x92.d0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    public final void a(Context context, String str, String str2) {
        if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            Method method = (Method) this.i.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.i.put(str2, method);
                } catch (Exception unused) {
                    c(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.g.get(), str);
                vz3.k("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                c(str2, false);
            }
        }
    }

    public final void b(Context context, String str, String str2, Bundle bundle) {
        if (j(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                sv2.e("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (k(context)) {
                d(new kt2(str, bundle2), "logEventInternal");
            } else if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
                Method method = (Method) this.i.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.i.put("logEventInternal", method);
                    } catch (Exception unused) {
                        c("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.g.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    c("logEventInternal", true);
                }
            }
        }
    }

    public final void c(String str, boolean z) {
        if (this.e.get()) {
            return;
        }
        sv2.g("Invoke Firebase method " + str + " error.");
        if (z) {
            sv2.g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.e.set(true);
        }
    }

    public final void d(pt2 pt2Var, String str) {
        synchronized (this.j) {
            FutureTask futureTask = new FutureTask(new tu1(1, this, pt2Var, str), null);
            if (this.j.get() != null) {
                futureTask.run();
            } else {
                this.k.offer(futureTask);
            }
        }
    }

    public final boolean e(Context context, String str, AtomicReference atomicReference, boolean z) {
        boolean z2;
        if (atomicReference.get() == null) {
            try {
                Object invoke = context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                while (true) {
                    if (atomicReference.compareAndSet(null, invoke)) {
                        z2 = true;
                    } else if (atomicReference.get() != null) {
                        z2 = false;
                    } else {
                        continue;
                    }
                    if (z2 || atomicReference.get() != null) {
                        break;
                    }
                }
            } catch (Exception unused) {
                c("getInstance", z);
                return false;
            }
        }
        return true;
    }

    public final String f(Context context) {
        Long valueOf;
        if (!j(context)) {
            return null;
        }
        if (k(context)) {
            synchronized (this.j) {
                if (((m23) this.j.get()) != null) {
                    try {
                        valueOf = Long.valueOf(((m23) this.j.get()).M());
                    } catch (Exception unused) {
                        c("getAdEventId", false);
                    }
                }
                valueOf = null;
            }
            if (valueOf == null) {
                return null;
            }
            return Long.toString(valueOf.longValue());
        }
        Object l = l(context, "generateEventId");
        if (l == null) {
            return null;
        }
        return l.toString();
    }

    public final String g(final Context context) {
        if (!j(context)) {
            return null;
        }
        long longValue = ((Long) w82.d.c.a(x92.Z)).longValue();
        if (k(context)) {
            try {
                if (longValue < 0) {
                    synchronized (this.j) {
                        if (((m23) this.j.get()) != null) {
                            try {
                                return ((m23) this.j.get()).e();
                            } catch (Exception unused) {
                                c("getAppInstanceId", false);
                            }
                        }
                        return null;
                    }
                }
                return (String) n().submit(new Callable() { // from class: lt2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        qt2 qt2Var = qt2.this;
                        synchronized (qt2Var.j) {
                            if (((m23) qt2Var.j.get()) != null) {
                                try {
                                    return ((m23) qt2Var.j.get()).e();
                                } catch (Exception unused2) {
                                    qt2Var.c("getAppInstanceId", false);
                                }
                            }
                            return null;
                        }
                    }
                }).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused2) {
                return "TIME_OUT";
            } catch (Exception unused3) {
                return null;
            }
        } else if (longValue < 0) {
            return (String) l(context, "getAppInstanceId");
        } else {
            try {
                return (String) n().submit(new Callable() { // from class: mt2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return (String) this.l(context, "getAppInstanceId");
                    }
                }).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused4) {
                return "TIME_OUT";
            } catch (Exception unused5) {
                return null;
            }
        }
    }

    public final String h(Context context) {
        if (!j(context)) {
            return null;
        }
        synchronized (this.b) {
            String str = this.c;
            if (str != null) {
                return str;
            }
            if (k(context)) {
                String str2 = this.c;
                synchronized (this.j) {
                    if (((m23) this.j.get()) != null) {
                        try {
                            str2 = ((m23) this.j.get()).g();
                        } catch (Exception unused) {
                            c("getGmpAppId", false);
                        }
                    }
                }
                this.c = str2;
            } else {
                this.c = (String) l(context, "getGmpAppId");
            }
            return this.c;
        }
    }

    public final void i(Context context, String str, String str2, String str3, int i) {
        if (j(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            b(context, "_ar", str, bundle);
            vz3.k("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    public final boolean j(Context context) {
        boolean z;
        boolean z2;
        l92 l92Var = x92.U;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && !this.e.get()) {
            if (((Boolean) w82Var.c.a(x92.e0)).booleanValue()) {
                return true;
            }
            if (this.f.get() == -1) {
                mv2 mv2Var = n62.f.a;
                jt jtVar = jt.b;
                if (jtVar.c(context, 12451000) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    int c = jtVar.c(context, 12451000);
                    if (c != 0 && c != 2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        sv2.g("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f.set(0);
                    }
                }
                this.f.set(1);
            }
            if (this.f.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final Object l(Context context, String str) {
        if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            try {
                return m(context, str).invoke(this.g.get(), new Object[0]);
            } catch (Exception unused) {
                c(str, true);
                return null;
            }
        }
        return null;
    }

    public final Method m(Context context, String str) {
        Method method = (Method) this.i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            c(str, false);
            return null;
        }
    }

    public final ExecutorService n() {
        boolean z;
        if (this.a.get() == null) {
            m92 m92Var = x92.a0;
            w82 w82Var = w82.d;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) w82Var.c.a(m92Var)).intValue(), ((Integer) w82Var.c.a(m92Var)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ot2());
            AtomicReference atomicReference = this.a;
            do {
                while (true) {
                    if (atomicReference.compareAndSet(null, threadPoolExecutor)) {
                        z = true;
                        break;
                    } else if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            } while (atomicReference.get() == null);
        }
        return (ExecutorService) this.a.get();
    }
}