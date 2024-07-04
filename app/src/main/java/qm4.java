package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: qm4  reason: default package */
public final class qm4 implements Runnable {
    public final rm4 Q;
    public String R;
    public String S;
    public fn2 T;
    public tz3 U;
    public ScheduledFuture V;
    public final ArrayList P = new ArrayList();
    public int W = 2;

    public qm4(rm4 rm4Var) {
        this.Q = rm4Var;
    }

    public final synchronized void b(hm4 hm4Var) {
        if (((Boolean) fb2.c.d()).booleanValue()) {
            ArrayList arrayList = this.P;
            hm4Var.g();
            arrayList.add(hm4Var);
            ScheduledFuture scheduledFuture = this.V;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.V = zw2.d.schedule(this, ((Integer) w82.d.c.a(x92.r7)).intValue(), TimeUnit.MILLISECONDS);
        }
    }

    public final synchronized void c(String str) {
        boolean matches;
        if (((Boolean) fb2.c.d()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                matches = false;
            } else {
                matches = Pattern.matches((String) w82.d.c.a(x92.s7), str);
            }
            if (matches) {
                this.R = str;
            }
        }
    }

    public final synchronized void d(tz3 tz3Var) {
        if (((Boolean) fb2.c.d()).booleanValue()) {
            this.U = tz3Var;
        }
    }

    public final synchronized void e(ArrayList arrayList) {
        if (((Boolean) fb2.c.d()).booleanValue()) {
            if (!arrayList.contains("banner") && !arrayList.contains("BANNER")) {
                if (!arrayList.contains("interstitial") && !arrayList.contains("INTERSTITIAL")) {
                    if (!arrayList.contains("native") && !arrayList.contains("NATIVE")) {
                        if (!arrayList.contains("rewarded") && !arrayList.contains("REWARDED")) {
                            if (arrayList.contains("app_open_ad")) {
                                this.W = 7;
                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                                this.W = 6;
                            }
                        }
                        this.W = 5;
                    }
                    this.W = 8;
                }
                this.W = 4;
            }
            this.W = 3;
        }
    }

    public final synchronized void f(String str) {
        if (((Boolean) fb2.c.d()).booleanValue()) {
            this.S = str;
        }
    }

    public final synchronized void g(fn2 fn2Var) {
        if (((Boolean) fb2.c.d()).booleanValue()) {
            this.T = fn2Var;
        }
    }

    public final synchronized void h() {
        if (((Boolean) fb2.c.d()).booleanValue()) {
            ScheduledFuture scheduledFuture = this.V;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            Iterator it = this.P.iterator();
            while (it.hasNext()) {
                hm4 hm4Var = (hm4) it.next();
                int i = this.W;
                if (i != 2) {
                    hm4Var.a(i);
                }
                if (!TextUtils.isEmpty(this.R)) {
                    hm4Var.D(this.R);
                }
                if (!TextUtils.isEmpty(this.S) && !hm4Var.l()) {
                    hm4Var.P(this.S);
                }
                fn2 fn2Var = this.T;
                if (fn2Var != null) {
                    hm4Var.c(fn2Var);
                } else {
                    tz3 tz3Var = this.U;
                    if (tz3Var != null) {
                        hm4Var.p(tz3Var);
                    }
                }
                this.Q.c(hm4Var.n());
            }
            this.P.clear();
        }
    }

    public final synchronized void i(int i) {
        if (((Boolean) fb2.c.d()).booleanValue()) {
            this.W = i;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}