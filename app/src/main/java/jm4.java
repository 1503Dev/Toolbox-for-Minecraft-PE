package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* renamed from: jm4  reason: default package */
public final class jm4 implements hm4 {
    public final Context a;
    public final int o;
    public long b = 0;
    public long c = -1;
    public boolean d = false;
    public int p = 2;
    public int q = 2;
    public int e = 0;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public boolean m = false;
    public boolean n = false;

    public jm4(Context context, int i) {
        this.a = context;
        this.o = i;
    }

    @Override // defpackage.hm4
    public final hm4 D(String str) {
        synchronized (this) {
            this.i = str;
        }
        return this;
    }

    @Override // defpackage.hm4
    public final hm4 H(String str) {
        synchronized (this) {
            if (((Boolean) w82.d.c.a(x92.t7)).booleanValue()) {
                this.l = str;
            }
        }
        return this;
    }

    @Override // defpackage.hm4
    public final hm4 P(String str) {
        synchronized (this) {
            this.h = str;
        }
        return this;
    }

    @Override // defpackage.hm4
    public final hm4 a(int i) {
        synchronized (this) {
            this.p = i;
        }
        return this;
    }

    @Override // defpackage.hm4
    public final hm4 b(Throwable th) {
        synchronized (this) {
            if (((Boolean) w82.d.c.a(x92.t7)).booleanValue()) {
                this.k = pt4.b(mv2.m(ip2.c(th), "SHA-256"));
                String c = ip2.c(th);
                vw2 a = vw2.a(new ts4('\n'));
                c.getClass();
                this.j = (String) a.b(c).next();
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        r2.g = r0.b0;
     */
    @Override // defpackage.hm4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hm4 c(fn2 fn2Var) {
        synchronized (this) {
            if (!TextUtils.isEmpty(((ci4) fn2Var.Q).b)) {
                this.f = ((ci4) fn2Var.Q).b;
            }
            Iterator it = ((List) fn2Var.P).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                yh4 yh4Var = (yh4) it.next();
                if (!TextUtils.isEmpty(yh4Var.b0)) {
                    break;
                }
            }
        }
        return this;
    }

    public final synchronized void d() {
        Configuration configuration;
        jv5 jv5Var = jv5.A;
        this.e = jv5Var.e.k(this.a);
        Resources resources = this.a.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.q = i;
        jv5Var.j.getClass();
        this.b = SystemClock.elapsedRealtime();
        this.n = true;
    }

    @Override // defpackage.hm4
    public final /* bridge */ /* synthetic */ hm4 f() {
        d();
        return this;
    }

    @Override // defpackage.hm4
    public final hm4 g() {
        synchronized (this) {
            jv5.A.j.getClass();
            this.c = SystemClock.elapsedRealtime();
        }
        return this;
    }

    @Override // defpackage.hm4
    public final synchronized boolean j() {
        return this.n;
    }

    @Override // defpackage.hm4
    public final hm4 k0(boolean z) {
        synchronized (this) {
            this.d = z;
        }
        return this;
    }

    @Override // defpackage.hm4
    public final boolean l() {
        return !TextUtils.isEmpty(this.h);
    }

    @Override // defpackage.hm4
    public final synchronized nm4 n() {
        if (this.m) {
            return null;
        }
        this.m = true;
        if (!this.n) {
            d();
        }
        if (this.c < 0) {
            synchronized (this) {
                jv5.A.j.getClass();
                this.c = SystemClock.elapsedRealtime();
            }
        }
        return new nm4(this);
    }

    @Override // defpackage.hm4
    public final hm4 p(tz3 tz3Var) {
        synchronized (this) {
            IBinder iBinder = tz3Var.T;
            if (iBinder != null) {
                gd3 gd3Var = (gd3) iBinder;
                String str = gd3Var.S;
                if (!TextUtils.isEmpty(str)) {
                    this.f = str;
                }
                String str2 = gd3Var.Q;
                if (!TextUtils.isEmpty(str2)) {
                    this.g = str2;
                }
            }
        }
        return this;
    }
}