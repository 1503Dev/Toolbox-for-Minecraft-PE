package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: wz2  reason: default package */
public final class wz2 extends oz2 implements xx2 {
    public l03 S;
    public String T;
    public boolean U;
    public boolean V;
    public gz2 W;
    public long X;
    public long Y;

    public wz2(gy2 gy2Var, fy2 fy2Var) {
        super(gy2Var);
        l03 l03Var = new l03(gy2Var.getContext(), fy2Var, (gy2) this.R.get(), null);
        sv2.f("ExoPlayerAdapter initialized.");
        this.S = l03Var;
        l03Var.a0 = this;
    }

    public static final String w(String str) {
        return "cache:".concat(String.valueOf(mv2.m(str, "MD5")));
    }

    public static String x(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    @Override // defpackage.xx2
    public final void a(int i) {
    }

    @Override // defpackage.oz2, defpackage.qk0
    public final void b() {
        l03 l03Var = this.S;
        if (l03Var != null) {
            l03Var.a0 = null;
            co5 co5Var = l03Var.X;
            if (co5Var != null) {
                co5Var.g(l03Var);
                l03Var.X.s();
                l03Var.X = null;
                yx2.Q.decrementAndGet();
            }
        }
    }

    @Override // defpackage.xx2
    public final void c(int i, int i2) {
    }

    @Override // defpackage.xx2
    public final void e(final long j, final boolean z) {
        final gy2 gy2Var = (gy2) this.R.get();
        if (gy2Var != null) {
            zw2.e.execute(new Runnable() { // from class: uz2
                @Override // java.lang.Runnable
                public final void run() {
                    gy2.this.Z(j, z);
                }
            });
        }
    }

    @Override // defpackage.xx2
    public final void f(Exception exc) {
        sv2.h("Precache exception", exc);
        jv5.A.g.e("VideoStreamExoPlayerCache.onException", exc);
    }

    @Override // defpackage.xx2
    public final void j(String str, Exception exc) {
        sv2.h("Precache error", exc);
        jv5.A.g.e("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // defpackage.oz2
    public final void l() {
        synchronized (this) {
            this.U = true;
            notify();
            b();
        }
        String str = this.T;
        if (str != null) {
            m(this.T, w(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // defpackage.oz2
    public final void o(int i) {
        zz2 zz2Var = this.S.S;
        synchronized (zz2Var) {
            zz2Var.d = i * 1000;
        }
    }

    @Override // defpackage.oz2
    public final void p(int i) {
        zz2 zz2Var = this.S.S;
        synchronized (zz2Var) {
            zz2Var.e = i * 1000;
        }
    }

    @Override // defpackage.oz2
    public final void q(int i) {
        zz2 zz2Var = this.S.S;
        synchronized (zz2Var) {
            zz2Var.c = i * 1000;
        }
    }

    @Override // defpackage.xx2
    public final void r() {
        sv2.g("Precache onRenderedFirstFrame");
    }

    @Override // defpackage.oz2
    public final void s(int i) {
        zz2 zz2Var = this.S.S;
        synchronized (zz2Var) {
            zz2Var.b = i * 1000;
        }
    }

    @Override // defpackage.oz2
    public final boolean t(String str) {
        return u(str, new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0152, code lost:
        defpackage.mv2.b.post(new defpackage.mz2(r43, r44, r42, r25));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0165, code lost:
        r3 = r43;
     */
    /* JADX WARN: Type inference failed for: r4v10, types: [long] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.oz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(String str, String[] strArr) {
        String str2;
        wz2 wz2Var;
        boolean z;
        wz2 wz2Var2;
        String str3;
        String str4;
        wz2 wz2Var3;
        String str5;
        String str6;
        wz2 wz2Var4;
        boolean z2;
        long j;
        long j2;
        ?? r4;
        long j3;
        boolean z3;
        long j4;
        long j5;
        long j6;
        boolean z4;
        wz2 wz2Var5 = this;
        String str7 = str;
        wz2Var5.T = str7;
        String str8 = "error";
        String w = w(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                try {
                    uriArr[i] = Uri.parse(strArr[i]);
                } catch (Exception e) {
                    e = e;
                    str2 = w;
                    wz2Var = wz2Var5;
                    z = false;
                    str5 = str7;
                    wz2Var3 = wz2Var5;
                    str4 = "error";
                    str3 = str2;
                    wz2Var2 = wz2Var;
                    sv2.g("Failed to preload url " + str5 + " Exception: " + e.getMessage());
                    jv5.A.g.e("VideoStreamExoPlayerCache.preload", e);
                    wz2Var2.b();
                    wz2Var3.m(str5, str3, str4, x(str4, e));
                    return z;
                }
            }
            l03 l03Var = wz2Var5.S;
            try {
                l03Var.getClass();
                l03Var.q(uriArr, ByteBuffer.allocate(0), false);
                gy2 gy2Var = (gy2) wz2Var5.R.get();
                if (gy2Var != null) {
                    gy2Var.v(w, wz2Var5);
                }
                jv5.A.j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                n92 n92Var = x92.s;
                w82 w82Var = w82.d;
                long longValue = ((Long) w82Var.c.a(n92Var)).longValue();
                long longValue2 = ((Long) w82Var.c.a(x92.r)).longValue() * 1000;
                long intValue = ((Integer) w82Var.c.a(x92.q)).intValue();
                boolean booleanValue = ((Boolean) w82Var.c.a(x92.x1)).booleanValue();
                str5 = str7;
                wz2Var3 = wz2Var5;
                long j7 = -1;
                while (true) {
                    try {
                        synchronized (this) {
                            try {
                                if (System.currentTimeMillis() - currentTimeMillis <= longValue2) {
                                    if (!wz2Var3.U) {
                                        if (wz2Var3.V) {
                                            break;
                                        }
                                        co5 co5Var = wz2Var3.S.X;
                                        if (co5Var != null) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            long p = co5Var.p();
                                            if (p > 0) {
                                                long n = wz2Var3.S.X.n();
                                                if (n != j7) {
                                                    if (n > 0) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (booleanValue) {
                                                        l03 l03Var2 = wz2Var3.S;
                                                        if (l03Var2.j0 != null && l03Var2.j0.o) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        if (!z4) {
                                                            j4 = l03Var2.b0;
                                                        } else {
                                                            j4 = 0;
                                                        }
                                                    } else {
                                                        j4 = -1;
                                                    }
                                                    if (booleanValue) {
                                                        j5 = wz2Var3.S.t();
                                                    } else {
                                                        j5 = -1;
                                                    }
                                                    if (booleanValue) {
                                                        j6 = wz2Var3.S.p();
                                                    } else {
                                                        j6 = -1;
                                                    }
                                                    try {
                                                        j = intValue;
                                                        j2 = longValue2;
                                                        j3 = longValue;
                                                        z = false;
                                                        str6 = w;
                                                        try {
                                                            n(str, w, n, p, z3, j4, j5, j6, yx2.P.get(), yx2.Q.get());
                                                            j7 = n;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            wz2Var3 = this;
                                                            wz2Var2 = wz2Var3;
                                                            str5 = str;
                                                            str3 = str6;
                                                            while (true) {
                                                                try {
                                                                    try {
                                                                        break;
                                                                    } catch (Exception e2) {
                                                                        e = e2;
                                                                        str4 = str8;
                                                                        sv2.g("Failed to preload url " + str5 + " Exception: " + e.getMessage());
                                                                        jv5.A.g.e("VideoStreamExoPlayerCache.preload", e);
                                                                        wz2Var2.b();
                                                                        wz2Var3.m(str5, str3, str4, x(str4, e));
                                                                        return z;
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        str6 = w;
                                                        z = false;
                                                        wz2Var3 = this;
                                                        wz2Var2 = wz2Var3;
                                                        str5 = str;
                                                        str3 = str6;
                                                        while (true) {
                                                            break;
                                                            break;
                                                        }
                                                        throw th;
                                                    }
                                                } else {
                                                    j = intValue;
                                                    j2 = longValue2;
                                                    j3 = longValue;
                                                    str6 = w;
                                                    z = false;
                                                }
                                                if (n >= p) {
                                                    break;
                                                }
                                                wz2Var4 = this;
                                                try {
                                                    if (wz2Var4.S.b0 >= j && n > 0) {
                                                        break;
                                                    }
                                                    str5 = str;
                                                    wz2Var3 = wz2Var4;
                                                    r4 = j3;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    str5 = str;
                                                    wz2Var3 = wz2Var4;
                                                    wz2Var2 = wz2Var3;
                                                    str3 = str6;
                                                    while (true) {
                                                        break;
                                                        break;
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                j = intValue;
                                                j2 = longValue2;
                                                str6 = w;
                                                wz2Var4 = wz2Var5;
                                                z = false;
                                                r4 = longValue;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        wz2Var3.wait(r4);
                                                    } catch (InterruptedException unused) {
                                                        throw new IOException("Wait interrupted.");
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    wz2Var2 = wz2Var4;
                                                    str8 = r4;
                                                    str3 = str6;
                                                    while (true) {
                                                        break;
                                                        break;
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                wz2Var2 = wz2Var4;
                                                str3 = str6;
                                                while (true) {
                                                    break;
                                                    break;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            throw new IOException("ExoPlayer was released during preloading.");
                                        }
                                    } else {
                                        throw new IOException("Abort requested before buffering finished. ");
                                    }
                                } else {
                                    throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                str6 = w;
                                wz2Var4 = wz2Var5;
                                z = false;
                            }
                        }
                        wz2Var5 = wz2Var4;
                        longValue = r4;
                        intValue = j;
                        longValue2 = j2;
                        w = str6;
                    } catch (Exception e3) {
                        e = e3;
                        str2 = w;
                        wz2Var = wz2Var5;
                        z = false;
                        str7 = str5;
                        wz2Var5 = wz2Var3;
                        str5 = str7;
                        wz2Var3 = wz2Var5;
                        str4 = "error";
                        str3 = str2;
                        wz2Var2 = wz2Var;
                        sv2.g("Failed to preload url " + str5 + " Exception: " + e.getMessage());
                        jv5.A.g.e("VideoStreamExoPlayerCache.preload", e);
                        wz2Var2.b();
                        wz2Var3.m(str5, str3, str4, x(str4, e));
                        return z;
                    }
                }
                return true;
            } catch (Exception e4) {
                e = e4;
                str2 = w;
                wz2Var = wz2Var5;
                z = false;
                str7 = str;
                wz2Var5 = wz2Var;
            }
        } catch (Exception e5) {
            e = e5;
            str2 = w;
            wz2Var = wz2Var5;
            z = false;
            str7 = str;
        }
    }

    @Override // defpackage.oz2
    public final boolean v(String str, String[] strArr, gz2 gz2Var) {
        this.T = str;
        this.W = gz2Var;
        String w = w(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            l03 l03Var = this.S;
            l03Var.getClass();
            l03Var.q(uriArr, ByteBuffer.allocate(0), false);
            gy2 gy2Var = (gy2) this.R.get();
            if (gy2Var != null) {
                gy2Var.v(w, this);
            }
            jv5.A.j.getClass();
            this.X = System.currentTimeMillis();
            this.Y = -1L;
            cu5.i.postDelayed(new vz2(0, this), 0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            sv2.g("Failed to preload url " + str + " Exception: " + message);
            jv5.A.g.e("VideoStreamExoPlayerCache.preload", e);
            b();
            m(str, w, "error", x("error", e));
            return false;
        }
    }
}