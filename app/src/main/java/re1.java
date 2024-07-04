package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: re1  reason: default package */
public final class re1 {
    public long b;
    public boolean e;
    public boolean h;
    public boolean i;
    public ff1 j;
    public long a = 1800000;
    public boolean c = true;
    public boolean d = true;
    public boolean f = false;
    public boolean g = false;

    /* renamed from: re1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ kd1 P;
        public final /* synthetic */ ad1 Q;

        public a(kd1 kd1Var, ad1 ad1Var) {
            this.P = kd1Var;
            this.Q = ad1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.P.c();
            this.Q.n().f();
        }
    }

    /* renamed from: re1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public final /* synthetic */ boolean P;

        public b(boolean z) {
            this.P = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            LinkedHashMap<Integer, jd1> linkedHashMap = ga1.h().o().a;
            synchronized (linkedHashMap) {
                for (jd1 jd1Var : linkedHashMap.values()) {
                    ic1 ic1Var = new ic1();
                    eb1.m(ic1Var, "from_window_focus", this.P);
                    re1 re1Var = re1.this;
                    if (re1Var.g && !re1Var.f) {
                        eb1.m(ic1Var, "app_in_foreground", false);
                        re1.this.g = false;
                    }
                    new rc1(jd1Var.getModuleId(), ic1Var, "SessionInfo.on_pause").b();
                }
            }
            ga1.k();
        }
    }

    /* renamed from: re1$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements Runnable {
        public final /* synthetic */ boolean P;

        public c(boolean z) {
            this.P = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ad1 h = ga1.h();
            LinkedHashMap<Integer, jd1> linkedHashMap = h.o().a;
            synchronized (linkedHashMap) {
                for (jd1 jd1Var : linkedHashMap.values()) {
                    ic1 ic1Var = new ic1();
                    eb1.m(ic1Var, "from_window_focus", this.P);
                    re1 re1Var = re1.this;
                    if (re1Var.g && re1Var.f) {
                        eb1.m(ic1Var, "app_in_foreground", true);
                        re1.this.g = false;
                    }
                    new rc1(jd1Var.getModuleId(), ic1Var, "SessionInfo.on_resume").b();
                }
            }
            h.n().f();
        }
    }

    public final void a(boolean z) {
        boolean z2;
        this.d = true;
        ff1 ff1Var = this.j;
        if (ff1Var.b == null) {
            try {
                ff1Var.b = ff1Var.a.schedule(new df1(ff1Var), ff1Var.d.a, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                StringBuilder b2 = e5.b("RejectedExecutionException when scheduling session stop ");
                b2.append(e.toString());
                t1.b(0, 0, b2.toString(), true);
            }
        }
        try {
            w1.a.execute(new b(z));
            z2 = true;
        } catch (RejectedExecutionException unused) {
            z2 = false;
        }
        if (!z2) {
            t1.b(0, 0, "RejectedExecutionException on session pause.", true);
        }
    }

    public final void b(boolean z) {
        boolean z2;
        this.d = false;
        ff1 ff1Var = this.j;
        ScheduledFuture<?> scheduledFuture = ff1Var.b;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            ff1Var.b.cancel(false);
            ff1Var.b = null;
        }
        try {
            w1.a.execute(new c(z));
            z2 = true;
        } catch (RejectedExecutionException unused) {
            z2 = false;
        }
        if (!z2) {
            t1.b(0, 0, "RejectedExecutionException on session resume.", true);
        }
    }

    public final void c(boolean z) {
        kd1 kd1Var;
        boolean z2;
        ad1 h = ga1.h();
        if (this.e) {
            return;
        }
        if (this.h) {
            h.B = false;
            this.h = false;
        }
        this.b = SystemClock.uptimeMillis();
        this.c = true;
        this.e = true;
        this.f = true;
        this.g = false;
        if (w1.a.isShutdown()) {
            w1.a = Executors.newSingleThreadExecutor();
        }
        if (z) {
            ic1 ic1Var = new ic1();
            eb1.j(ic1Var, "id", UUID.randomUUID().toString());
            new rc1(1, ic1Var, "SessionInfo.on_start").b();
            jd1 jd1Var = ga1.h().o().a.get(1);
            if (jd1Var instanceof kd1) {
                kd1Var = (kd1) jd1Var;
            } else {
                kd1Var = null;
            }
            if (kd1Var != null) {
                try {
                    w1.a.execute(new a(kd1Var, h));
                    z2 = true;
                } catch (RejectedExecutionException unused) {
                    z2 = false;
                }
                if (!z2) {
                    t1.b(0, 0, "RejectedExecutionException on controller update.", true);
                }
            }
        }
        h.o().g();
        if1.a().e.clear();
    }

    public final void d(boolean z) {
        if (z && this.d) {
            b(false);
        } else if (!z && !this.d) {
            a(false);
        }
        this.c = z;
    }
}