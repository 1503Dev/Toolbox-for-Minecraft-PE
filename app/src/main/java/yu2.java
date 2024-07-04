package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: yu2  reason: default package */
public final class yu2 {
    public final Object a = new Object();
    public final nl5 b;
    public final hv2 c;
    public boolean d;
    public Context e;
    public xv2 f;
    public String g;
    public ca2 h;
    public Boolean i;
    public final AtomicInteger j;
    public final wu2 k;
    public final Object l;
    public dz4 m;
    public final AtomicBoolean n;

    public yu2() {
        nl5 nl5Var = new nl5();
        this.b = nl5Var;
        this.c = new hv2(n62.f.c, nl5Var);
        this.d = false;
        this.h = null;
        this.i = null;
        this.j = new AtomicInteger(0);
        this.k = new wu2();
        this.l = new Object();
        this.n = new AtomicBoolean();
    }

    public final Resources a() {
        if (this.f.S) {
            return this.e.getResources();
        }
        try {
            if (((Boolean) w82.d.c.a(x92.v8)).booleanValue()) {
                return vv2.a(this.e).a.getResources();
            }
            vv2.a(this.e).a.getResources();
            return null;
        } catch (uv2 e) {
            sv2.h("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final nl5 b() {
        nl5 nl5Var;
        synchronized (this.a) {
            nl5Var = this.b;
        }
        return nl5Var;
    }

    public final dz4 c() {
        if (this.e != null) {
            if (!((Boolean) w82.d.c.a(x92.e2)).booleanValue()) {
                synchronized (this.l) {
                    dz4 dz4Var = this.m;
                    if (dz4Var != null) {
                        return dz4Var;
                    }
                    dz4 b = zw2.a.b(new tu2(0, this));
                    this.m = b;
                    return b;
                }
            }
        }
        return zw4.C(new ArrayList());
    }

    @TargetApi(23)
    public final void d(Context context, xv2 xv2Var) {
        ca2 ca2Var;
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.e = context.getApplicationContext();
                    this.f = xv2Var;
                    jv5.A.f.b(this.c);
                    this.b.G(this.e);
                    ip2.b(this.e, this.f);
                    if (!((Boolean) gb2.b.d()).booleanValue()) {
                        vz3.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        ca2Var = null;
                    } else {
                        ca2Var = new ca2();
                    }
                    this.h = ca2Var;
                    if (ca2Var != null) {
                        tv2.x(new uu2(this).b(), "AppState.registerCsiReporter");
                    }
                    if (qe0.a()) {
                        if (((Boolean) w82.d.c.a(x92.c7)).booleanValue()) {
                            xu2.a((ConnectivityManager) context.getSystemService("connectivity"), new vu2(this));
                        }
                    }
                    this.d = true;
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jv5.A.c.r(context, xv2Var.P);
    }

    public final void e(String str, Throwable th) {
        ip2.b(this.e, this.f).f(th, str, ((Double) wb2.g.d()).floatValue());
    }

    public final void f(String str, Throwable th) {
        ip2.b(this.e, this.f).d(str, th);
    }

    public final boolean g(Context context) {
        if (qe0.a()) {
            if (((Boolean) w82.d.c.a(x92.c7)).booleanValue()) {
                return this.n.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}