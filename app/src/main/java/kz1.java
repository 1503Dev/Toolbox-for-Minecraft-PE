package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: kz1  reason: default package */
public final class kz1 implements nz1 {
    public static kz1 g0;
    public final Context P;
    public final gq4 Q;
    public final nq4 R;
    public final pq4 S;
    public final g02 T;
    public final dp4 U;
    public final Executor V;
    public final jz1 W;
    public final t02 Y;
    public final m02 Z;
    public final dk5 a0;
    public volatile boolean d0;
    public volatile boolean e0;
    public final int f0;
    public volatile long b0 = 0;
    public final Object c0 = new Object();
    public final CountDownLatch X = new CountDownLatch(1);

    public kz1(Context context, dp4 dp4Var, gq4 gq4Var, nq4 nq4Var, pq4 pq4Var, g02 g02Var, ExecutorService executorService, dt4 dt4Var, int i, t02 t02Var, m02 m02Var, dk5 dk5Var) {
        this.e0 = false;
        this.P = context;
        this.U = dp4Var;
        this.Q = gq4Var;
        this.R = nq4Var;
        this.S = pq4Var;
        this.T = g02Var;
        this.V = executorService;
        this.f0 = i;
        this.Y = t02Var;
        this.Z = m02Var;
        this.a0 = dk5Var;
        this.e0 = false;
        this.W = new jz1(dt4Var);
    }

    @Deprecated
    public static synchronized kz1 a(String str, Context context, ExecutorService executorService, boolean z, boolean z2) {
        kz1 kz1Var;
        vz1 vz1Var;
        t02 t02Var;
        m02 m02Var;
        dk5 dk5Var;
        synchronized (kz1.class) {
            if (g0 == null) {
                byte b = (byte) (((byte) 1) | 2);
                if (str != null) {
                    byte b2 = (byte) (b | 1);
                    if (b2 == 3) {
                        fp4 fp4Var = new fp4(str, z, true);
                        dp4 a = dp4.a(context, executorService, z2);
                        l92 l92Var = x92.H2;
                        w82 w82Var = w82.d;
                        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                            vz1Var = new vz1((ConnectivityManager) context.getSystemService("connectivity"));
                        } else {
                            vz1Var = null;
                        }
                        if (((Boolean) w82Var.c.a(x92.I2)).booleanValue()) {
                            t02Var = new t02(context, executorService, t02.e);
                        } else {
                            t02Var = null;
                        }
                        if (((Boolean) w82Var.c.a(x92.b2)).booleanValue()) {
                            m02Var = new m02();
                        } else {
                            m02Var = null;
                        }
                        if (((Boolean) w82Var.c.a(x92.c2)).booleanValue()) {
                            dk5Var = new dk5();
                        } else {
                            dk5Var = null;
                        }
                        op4 a2 = op4.a(context, executorService, a, fp4Var);
                        f02 f02Var = new f02(context);
                        g02 g02Var = new g02(fp4Var, a2, new q02(context, f02Var), f02Var, vz1Var, t02Var, m02Var, dk5Var);
                        int u = eb1.u(context, a);
                        dt4 dt4Var = new dt4();
                        kz1 kz1Var2 = new kz1(context, a, new gq4(context, u), new nq4(context, u, new om1(1, a), ((Boolean) w82Var.c.a(x92.L1)).booleanValue()), new pq4(context, g02Var, a, dt4Var), g02Var, executorService, dt4Var, u, t02Var, m02Var, dk5Var);
                        g0 = kz1Var2;
                        kz1Var2.k();
                        g0.l();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if ((b2 & 1) == 0) {
                            sb.append(" shouldGetAdvertisingId");
                        }
                        if ((b2 & 2) == 0) {
                            sb.append(" isGooglePlayServicesAvailable");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                } else {
                    throw new NullPointerException("Null clientVersion");
                }
            }
            kz1Var = g0;
        }
        return kz1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r3.y().F().equals(r4.F()) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(kz1 kz1Var) {
        String str;
        lq4 x;
        byte[] bArr;
        dp4 dp4Var;
        int i;
        long currentTimeMillis;
        int length;
        f22 x2;
        boolean a;
        long currentTimeMillis2 = System.currentTimeMillis();
        fq4 m = kz1Var.m();
        String str2 = null;
        if (m != null) {
            str2 = m.a.G();
            str = m.a.F();
        } else {
            str = null;
        }
        try {
            try {
                x = ea2.x(kz1Var.P, kz1Var.f0, str2, str, kz1Var.U);
                bArr = x.Q;
            } catch (te5 e) {
                kz1Var.U.c(4002, System.currentTimeMillis() - currentTimeMillis2, e);
            }
            if (bArr != null && (length = bArr.length) != 0) {
                try {
                    x2 = f22.x(gd5.G(bArr, 0, length), ud5.c);
                } catch (NullPointerException unused) {
                    dp4Var = kz1Var.U;
                    i = 2030;
                    currentTimeMillis = System.currentTimeMillis();
                }
                if (!x2.y().G().isEmpty() && !x2.y().F().isEmpty() && x2.z().g().length != 0) {
                    fq4 m2 = kz1Var.m();
                    if (m2 != null) {
                        h22 h22Var = m2.a;
                        if (x2.y().G().equals(h22Var.G())) {
                        }
                    }
                    jz1 jz1Var = kz1Var.W;
                    int i2 = x.R;
                    if (((Boolean) w82.d.c.a(x92.J1)).booleanValue()) {
                        if (i2 == 3) {
                            a = kz1Var.R.a(x2);
                        } else {
                            if (i2 == 4) {
                                a = kz1Var.R.b(x2, jz1Var);
                            }
                            dp4Var = kz1Var.U;
                            i = 4009;
                            currentTimeMillis = System.currentTimeMillis();
                        }
                    } else {
                        a = kz1Var.Q.a(x2, jz1Var);
                    }
                    if (a) {
                        fq4 m3 = kz1Var.m();
                        if (m3 != null) {
                            if (kz1Var.S.a(m3)) {
                                kz1Var.e0 = true;
                            }
                            kz1Var.b0 = System.currentTimeMillis() / 1000;
                        }
                        kz1Var.X.countDown();
                    }
                    dp4Var = kz1Var.U;
                    i = 4009;
                    currentTimeMillis = System.currentTimeMillis();
                }
                dp4Var = kz1Var.U;
                i = 5010;
                currentTimeMillis = System.currentTimeMillis();
            } else {
                dp4Var = kz1Var.U;
                i = 5009;
                currentTimeMillis = System.currentTimeMillis();
            }
            dp4Var.d(currentTimeMillis - currentTimeMillis2, i);
            kz1Var.X.countDown();
        } catch (Throwable th) {
            kz1Var.X.countDown();
            throw th;
        }
    }

    @Override // defpackage.nz1
    public final void b(MotionEvent motionEvent) {
        vj2 vj2Var;
        pq4 pq4Var = this.S;
        synchronized (pq4Var.f) {
            vj2Var = pq4Var.e;
        }
        if (vj2Var != null) {
            try {
                vj2Var.c(motionEvent);
            } catch (oq4 e) {
                this.U.c(e.P, -1L, e);
            }
        }
    }

    @Override // defpackage.nz1
    public final void c(View view) {
        this.T.c.b(view);
    }

    @Override // defpackage.nz1
    public final void d(StackTraceElement[] stackTraceElementArr) {
        dk5 dk5Var = this.a0;
        if (dk5Var != null) {
            dk5Var.Q = new ArrayList(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // defpackage.nz1
    public final String e(Context context, View view, Activity activity) {
        vj2 vj2Var;
        String h;
        t02 t02Var = this.Y;
        if (t02Var != null && t02Var.d) {
            t02Var.b = System.currentTimeMillis();
        }
        if (((Boolean) w82.d.c.a(x92.b2)).booleanValue()) {
            this.Z.a(context, view);
        }
        l();
        pq4 pq4Var = this.S;
        synchronized (pq4Var.f) {
            vj2Var = pq4Var.e;
        }
        if (vj2Var != null) {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (vj2Var) {
                g02 g02Var = (g02) vj2Var.c;
                HashMap b = g02Var.b();
                dk5 dk5Var = g02Var.h;
                if (dk5Var != null) {
                    dk5Var.Q = Collections.emptyList();
                    b.put("vst", (List) dk5Var.Q);
                }
                b.put("f", "v");
                b.put("ctx", context);
                b.put("aid", null);
                b.put("view", view);
                b.put("act", activity);
                h = vj2.h(vj2Var.i(b));
            }
            this.U.e(5002, System.currentTimeMillis() - currentTimeMillis, null, h, null);
            return h;
        }
        return "";
    }

    @Override // defpackage.nz1
    public final String f(Context context) {
        vj2 vj2Var;
        String h;
        t02 t02Var = this.Y;
        if (t02Var != null && t02Var.d) {
            t02Var.b = System.currentTimeMillis();
        }
        if (((Boolean) w82.d.c.a(x92.b2)).booleanValue()) {
            m02 m02Var = this.Z;
            m02Var.b = m02Var.a;
            m02Var.a = SystemClock.uptimeMillis();
        }
        l();
        pq4 pq4Var = this.S;
        synchronized (pq4Var.f) {
            vj2Var = pq4Var.e;
        }
        if (vj2Var != null) {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (vj2Var) {
                HashMap a = ((g02) vj2Var.c).a();
                a.put("f", "q");
                a.put("ctx", context);
                a.put("aid", null);
                h = vj2.h(vj2Var.i(a));
            }
            this.U.e(5001, System.currentTimeMillis() - currentTimeMillis, null, h, null);
            return h;
        }
        return "";
    }

    @Override // defpackage.nz1
    public final void g(int i, int i2, int i3) {
    }

    @Override // defpackage.nz1
    public final String h(Context context, String str, View view) {
        return i(context, str, view, null);
    }

    @Override // defpackage.nz1
    public final String i(Context context, String str, View view, Activity activity) {
        vj2 vj2Var;
        String h;
        t02 t02Var = this.Y;
        if (t02Var != null && t02Var.d) {
            t02Var.b = System.currentTimeMillis();
        }
        if (((Boolean) w82.d.c.a(x92.b2)).booleanValue()) {
            m02 m02Var = this.Z;
            m02Var.h = m02Var.g;
            m02Var.g = SystemClock.uptimeMillis();
        }
        l();
        pq4 pq4Var = this.S;
        synchronized (pq4Var.f) {
            vj2Var = pq4Var.e;
        }
        if (vj2Var != null) {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (vj2Var) {
                g02 g02Var = (g02) vj2Var.c;
                HashMap b = g02Var.b();
                q02 q02Var = g02Var.c;
                if (q02Var.a0 <= -2 && q02Var.a() == null) {
                    q02Var.a0 = -3L;
                }
                b.put("lts", Long.valueOf(q02Var.a0));
                b.put("f", "c");
                b.put("ctx", context);
                b.put("cs", str);
                b.put("aid", null);
                b.put("view", view);
                b.put("act", activity);
                h = vj2.h(vj2Var.i(b));
            }
            this.U.e(5000, System.currentTimeMillis() - currentTimeMillis, null, h, null);
            return h;
        }
        return "";
    }

    public final synchronized void k() {
        long currentTimeMillis = System.currentTimeMillis();
        fq4 m = m();
        if (m == null) {
            this.U.d(System.currentTimeMillis() - currentTimeMillis, 4013);
        } else if (this.S.a(m)) {
            this.e0 = true;
            this.X.countDown();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
        if (r1 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        fq4 fq4Var;
        boolean z;
        if (!this.d0) {
            synchronized (this.c0) {
                if (!this.d0) {
                    if ((System.currentTimeMillis() / 1000) - this.b0 < 3600) {
                        return;
                    }
                    pq4 pq4Var = this.S;
                    synchronized (pq4Var.f) {
                        vj2 vj2Var = pq4Var.e;
                        if (vj2Var != null) {
                            fq4Var = (fq4) vj2Var.b;
                        } else {
                            fq4Var = null;
                        }
                    }
                    boolean z2 = false;
                    if (fq4Var != null) {
                        if (fq4Var.a.x() - (System.currentTimeMillis() / 1000) < 3600) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    int i = this.f0 - 1;
                    if (i == 2 || i == 4 || i == 5 || i == 6) {
                        z2 = true;
                    }
                    if (z2) {
                        this.V.execute(new dd4(1, this));
                    }
                }
            }
        }
    }

    public final fq4 m() {
        boolean z;
        int i = this.f0 - 1;
        if (i != 2 && i != 4 && i != 5 && i != 6) {
            z = false;
        } else {
            z = true;
        }
        fq4 fq4Var = null;
        if (!z) {
            return null;
        }
        if (((Boolean) w82.d.c.a(x92.J1)).booleanValue()) {
            nq4 nq4Var = this.R;
            nq4Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (nq4.f) {
                h22 g = nq4Var.g(1);
                if (g == null) {
                    nq4Var.f(currentTimeMillis, 4022);
                } else {
                    File c = nq4Var.c(g.G());
                    File file = new File(c, "pcam.jar");
                    if (!file.exists()) {
                        file = new File(c, "pcam");
                    }
                    File file2 = new File(c, "pcbc");
                    File file3 = new File(c, "pcopt");
                    nq4Var.f(currentTimeMillis, 5016);
                    fq4Var = new fq4(g, file, file2, file3);
                }
            }
            return fq4Var;
        }
        gq4 gq4Var = this.Q;
        h22 b = gq4Var.b(1);
        if (b == null) {
            return null;
        }
        String G = b.G();
        File q = zw4.q(G, "pcam.jar", gq4Var.c());
        if (!q.exists()) {
            q = zw4.q(G, "pcam", gq4Var.c());
        }
        return new fq4(b, q, zw4.q(G, "pcbc", gq4Var.c()), zw4.q(G, "pcopt", gq4Var.c()));
    }
}