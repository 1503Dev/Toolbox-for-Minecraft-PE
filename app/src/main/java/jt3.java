package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: jt3  reason: default package */
public final class jt3 {
    public final long d;
    public final Context f;
    public final WeakReference g;
    public final zq3 h;
    public final Executor i;
    public final Executor j;
    public final ScheduledExecutorService k;
    public final is3 l;
    public final xv2 m;
    public final th3 o;
    public final rm4 p;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public final bx2 e = new bx2();
    public final ConcurrentHashMap n = new ConcurrentHashMap();
    public boolean q = true;

    public jt3(Executor executor, Context context, WeakReference weakReference, yw2 yw2Var, zq3 zq3Var, ScheduledExecutorService scheduledExecutorService, is3 is3Var, xv2 xv2Var, th3 th3Var, rm4 rm4Var) {
        this.h = zq3Var;
        this.f = context;
        this.g = weakReference;
        this.i = yw2Var;
        this.k = scheduledExecutorService;
        this.j = executor;
        this.l = is3Var;
        this.m = xv2Var;
        this.o = th3Var;
        this.p = rm4Var;
        jv5.A.j.getClass();
        this.d = SystemClock.elapsedRealtime();
        d("com.google.android.gms.ads.MobileAds", 0, "", false);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.n.keySet()) {
            vh2 vh2Var = (vh2) this.n.get(str);
            arrayList.add(new vh2(str, vh2Var.R, vh2Var.S, vh2Var.Q));
        }
        return arrayList;
    }

    public final void b() {
        if (!((Boolean) tb2.a.d()).booleanValue()) {
            int i = this.m.R;
            m92 m92Var = x92.u1;
            w82 w82Var = w82.d;
            if (i >= ((Integer) w82Var.c.a(m92Var)).intValue() && this.q) {
                if (this.a) {
                    return;
                }
                synchronized (this) {
                    if (this.a) {
                        return;
                    }
                    this.l.d();
                    this.o.e();
                    this.e.b(new g53(2, this), this.i);
                    this.a = true;
                    dz4 c = c();
                    this.k.schedule(new k52(3, this), ((Long) w82Var.c.a(x92.w1)).longValue(), TimeUnit.SECONDS);
                    zw4.J(c, new ht3(this), this.i);
                    return;
                }
            }
        }
        if (!this.a) {
            d("com.google.android.gms.ads.MobileAds", 0, "", true);
            this.e.a(Boolean.FALSE);
            this.a = true;
            this.b = true;
        }
    }

    public final synchronized dz4 c() {
        jv5 jv5Var = jv5.A;
        String str = jv5Var.g.b().f().e;
        if (!TextUtils.isEmpty(str)) {
            return zw4.C(str);
        }
        bx2 bx2Var = new bx2();
        nl5 b = jv5Var.g.b();
        b.c.add(new ow2(1, this, bx2Var));
        return bx2Var;
    }

    public final void d(String str, int i, String str2, boolean z) {
        this.n.put(str, new vh2(str, i, str2, z));
    }
}