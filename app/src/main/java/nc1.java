package defpackage;

import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: nc1  reason: default package */
public final class nc1 {
    public static boolean f = false;
    public static int g = 3;
    public static int h = 1;
    public ic1 a = new ic1();
    public nr b = null;
    public ExecutorService c = null;
    public final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
    public me1 e;

    /* renamed from: nc1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements zc1 {
        public a() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            nc1.this.d(rc1Var.b.l("module"), 0, rc1Var.b.q("message"), true);
        }
    }

    /* renamed from: nc1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements zc1 {
        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            nc1.g = rc1Var.b.l("level");
        }
    }

    /* renamed from: nc1$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements zc1 {
        public c() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            nc1.this.d(rc1Var.b.l("module"), 3, rc1Var.b.q("message"), false);
        }
    }

    /* renamed from: nc1$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements zc1 {
        public d() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            nc1.this.d(rc1Var.b.l("module"), 3, rc1Var.b.q("message"), true);
        }
    }

    /* renamed from: nc1$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e implements zc1 {
        public e() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            nc1.this.d(rc1Var.b.l("module"), 2, rc1Var.b.q("message"), false);
        }
    }

    /* renamed from: nc1$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f implements zc1 {
        public f() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            nc1.this.d(rc1Var.b.l("module"), 2, rc1Var.b.q("message"), true);
        }
    }

    /* renamed from: nc1$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class g implements zc1 {
        public g() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            nc1.this.d(rc1Var.b.l("module"), 1, rc1Var.b.q("message"), false);
        }
    }

    /* renamed from: nc1$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class h implements zc1 {
        public h() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            nc1.this.d(rc1Var.b.l("module"), 1, rc1Var.b.q("message"), true);
        }
    }

    /* renamed from: nc1$i */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class i implements zc1 {
        public i() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            nc1.this.d(rc1Var.b.l("module"), 0, rc1Var.b.q("message"), false);
        }
    }

    public static boolean a(ic1 ic1Var, int i2) {
        int l = ic1Var.l("send_level");
        if (ic1Var.f()) {
            l = h;
        }
        if (l >= i2 && l != 4) {
            return true;
        }
        return false;
    }

    public static boolean b(ic1 ic1Var, int i2, boolean z) {
        int l = ic1Var.l("print_level");
        boolean j = ic1Var.j("log_private");
        if (ic1Var.f()) {
            l = g;
            j = f;
        }
        if ((z && !j) || l == 4 || l < i2) {
            return false;
        }
        return true;
    }

    public final boolean c(Runnable runnable) {
        try {
            ExecutorService executorService = this.c;
            if (executorService == null || executorService.isShutdown() || this.c.isTerminated()) {
                return false;
            }
            this.c.submit(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting log to executor service.");
            return false;
        }
    }

    public final void d(int i2, int i3, String str, boolean z) {
        if (!c(new oc1(this, i2, str, i3, z))) {
            synchronized (this.d) {
                this.d.add(new oc1(this, i2, str, i3, z));
            }
        }
    }

    public final void e() {
        ga1.f("Log.set_log_level", new b());
        ga1.f("Log.public.trace", new c());
        ga1.f("Log.private.trace", new d());
        ga1.f("Log.public.info", new e());
        ga1.f("Log.private.info", new f());
        ga1.f("Log.public.warning", new g());
        ga1.f("Log.private.warning", new h());
        ga1.f("Log.public.error", new i());
        ga1.f("Log.private.error", new a());
    }

    public final void f() {
        ExecutorService executorService = this.c;
        if (executorService == null || executorService.isShutdown() || this.c.isTerminated()) {
            this.c = Executors.newSingleThreadExecutor();
        }
        synchronized (this.d) {
            while (!this.d.isEmpty()) {
                c((Runnable) this.d.poll());
            }
        }
    }
}