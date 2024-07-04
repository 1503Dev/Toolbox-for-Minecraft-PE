package defpackage;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: aa  reason: default package */
public final class aa extends z9 {
    public volatile int P;
    public final String Q;
    public final Handler R;
    public volatile eq5 S;
    public Context T;
    public volatile pz3 U;
    public volatile az1 V;
    public boolean W;
    public int X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public ExecutorService j0;

    public aa(Context context, ug0 ug0Var, boolean z) {
        String o = o();
        this.P = 0;
        this.R = new Handler(Looper.getMainLooper());
        this.X = 0;
        this.Q = o;
        this.T = context.getApplicationContext();
        yq4 o2 = nr4.o();
        o2.d();
        nr4.q((nr4) o2.Q, o);
        String packageName = this.T.getPackageName();
        o2.d();
        nr4.r((nr4) o2.Q, packageName);
        nr4 nr4Var = (nr4) o2.a();
        new yf();
        if (ug0Var == null) {
            m82.e("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.S = new eq5(this.T, ug0Var);
        this.g0 = z;
        this.h0 = false;
        this.i0 = false;
    }

    @SuppressLint({"PrivateApi"})
    public static String o() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "5.2.1";
        }
    }

    public final boolean h() {
        return (this.P != 2 || this.U == null || this.V == null) ? false : true;
    }

    public final void j(ah0 ah0Var, tg0 tg0Var) {
        da daVar;
        String str = ah0Var.a;
        if (!h()) {
            daVar = qa2.i;
        } else if (TextUtils.isEmpty(str)) {
            m82.e("BillingClient", "Please provide a valid product type.");
            daVar = qa2.e;
        } else if (p(new ds1(this, str, tg0Var), 30000L, new fn1(0, tg0Var), m()) == null) {
            if (this.P != 0 && this.P != 3) {
                daVar = qa2.g;
            } else {
                daVar = qa2.i;
            }
        } else {
            return;
        }
        fu5 fu5Var = ew5.Q;
        tg0Var.c(daVar, fk1.T);
    }

    public final void l(ba baVar) {
        ServiceInfo serviceInfo;
        String str;
        if (h()) {
            m82.d("BillingClient", "Service connection is valid. No need to re-initialize.");
            ((ve0) baVar).b(qa2.h);
        } else if (this.P == 1) {
            m82.e("BillingClient", "Client is already in the process of connecting to billing service.");
            ((ve0) baVar).b(qa2.c);
        } else if (this.P == 3) {
            m82.e("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            ((ve0) baVar).b(qa2.i);
        } else {
            this.P = 1;
            eq5 eq5Var = this.S;
            eq5Var.getClass();
            IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
            intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
            mp5 mp5Var = (mp5) eq5Var.Q;
            Context context = (Context) eq5Var.P;
            if (!mp5Var.b) {
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver((mp5) mp5Var.c.Q, intentFilter, 2);
                } else {
                    context.registerReceiver((mp5) mp5Var.c.Q, intentFilter);
                }
                mp5Var.b = true;
            }
            m82.d("BillingClient", "Starting in-app billing setup.");
            this.V = new az1(this, baVar);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.T.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str2 = serviceInfo.packageName;
                String str3 = serviceInfo.name;
                if ("com.android.vending".equals(str2) && str3 != null) {
                    ComponentName componentName = new ComponentName(str2, str3);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.Q);
                    if (this.T.bindService(intent2, this.V, 1)) {
                        m82.d("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    str = "Connection to Billing service is blocked.";
                } else {
                    str = "The device doesn't have valid Play Store.";
                }
                m82.e("BillingClient", str);
            }
            this.P = 0;
            m82.d("BillingClient", "Billing service unavailable on device.");
            ((ve0) baVar).b(qa2.b);
        }
    }

    public final Handler m() {
        return Looper.myLooper() == null ? this.R : new Handler(Looper.myLooper());
    }

    public final void n(da daVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.R.post(new hq1(0, this, daVar));
    }

    public final Future p(Callable callable, long j, final Runnable runnable, Handler handler) {
        if (this.j0 == null) {
            this.j0 = Executors.newFixedThreadPool(m82.a, new ev1());
        }
        try {
            final Future submit = this.j0.submit(callable);
            double d = j;
            Runnable runnable2 = new Runnable() { // from class: jp1
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable3 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    m82.e("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                }
            };
            Double.isNaN(d);
            Double.isNaN(d);
            handler.postDelayed(runnable2, (long) (d * 0.95d));
            return submit;
        } catch (Exception e) {
            m82.f("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }
}