package defpackage;

import java.io.IOException;

/* renamed from: vz2  reason: default package */
public final /* synthetic */ class vz2 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ vz2(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0130, code lost:
        if (r2 > 0) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        wz2 wz2Var;
        w82 w82Var;
        long longValue;
        long intValue;
        boolean booleanValue;
        boolean z;
        wz2 wz2Var2;
        w82 w82Var2;
        long j;
        long j2;
        boolean z2;
        long j3;
        long j4;
        long j5;
        long j6;
        vz2 vz2Var = this;
        switch (vz2Var.P) {
            case 0:
                wz2 wz2Var3 = (wz2) vz2Var.Q;
                String w = wz2.w(wz2Var3.T);
                String str = "error";
                try {
                    n92 n92Var = x92.r;
                    w82Var = w82.d;
                    longValue = ((Long) w82Var.c.a(n92Var)).longValue() * 1000;
                    intValue = ((Integer) w82Var.c.a(x92.q)).intValue();
                    booleanValue = ((Boolean) w82Var.c.a(x92.x1)).booleanValue();
                } catch (Exception e) {
                    e = e;
                    wz2Var = wz2Var3;
                }
                synchronized (wz2Var3) {
                    try {
                        jv5.A.j.getClass();
                        try {
                            if (System.currentTimeMillis() - wz2Var3.X <= longValue) {
                                ?? r2 = wz2Var3.U;
                                try {
                                    if (r2 == 0) {
                                        if (!wz2Var3.V) {
                                            co5 co5Var = wz2Var3.S.X;
                                            boolean z3 = true;
                                            if (co5Var != null) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (z) {
                                                long p = co5Var.p();
                                                if (p > 0) {
                                                    long n = wz2Var3.S.X.n();
                                                    if (n != wz2Var3.Y) {
                                                        if (n > 0) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        try {
                                                            String str2 = wz2Var3.T;
                                                            if (booleanValue) {
                                                                l03 l03Var = wz2Var3.S;
                                                                if (l03Var.j0 == null || !l03Var.j0.o) {
                                                                    z3 = false;
                                                                }
                                                                if (!z3) {
                                                                    j6 = l03Var.b0;
                                                                } else {
                                                                    j6 = 0;
                                                                }
                                                                j3 = j6;
                                                            } else {
                                                                j3 = -1;
                                                            }
                                                            if (booleanValue) {
                                                                j4 = wz2Var3.S.t();
                                                            } else {
                                                                j4 = -1;
                                                            }
                                                            if (booleanValue) {
                                                                j5 = wz2Var3.S.p();
                                                            } else {
                                                                j5 = -1;
                                                            }
                                                            j2 = intValue;
                                                            wz2Var2 = wz2Var3;
                                                            w82Var2 = w82Var;
                                                            wz2Var3.n(str2, w, n, p, z2, j3, j4, j5, yx2.P.get(), yx2.Q.get());
                                                            j = n;
                                                            wz2Var2.Y = j;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            vz2Var = wz2Var3;
                                                            wz2Var = vz2Var;
                                                            while (true) {
                                                                try {
                                                                    try {
                                                                        throw th;
                                                                    } catch (Exception e2) {
                                                                        e = e2;
                                                                        String str3 = str;
                                                                        sv2.g("Failed to preload url " + wz2Var.T + " Exception: " + e.getMessage());
                                                                        jv5.A.g.e("VideoStreamExoPlayerCache.preload", e);
                                                                        wz2Var.b();
                                                                        wz2Var.m(wz2Var.T, w, str3, wz2.x(str3, e));
                                                                        jv5.A.y.P.remove(wz2Var.W);
                                                                        return;
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        j = n;
                                                        j2 = intValue;
                                                        wz2Var2 = wz2Var3;
                                                        w82Var2 = w82Var;
                                                    }
                                                    if (j >= p) {
                                                        mv2.b.post(new mz2(wz2Var2, wz2Var2.T, w, p));
                                                    } else if (wz2Var2.S.b0 >= j2) {
                                                        break;
                                                    }
                                                } else {
                                                    wz2Var2 = wz2Var3;
                                                    w82Var2 = w82Var;
                                                }
                                                cu5.i.postDelayed(new vz2(0, wz2Var2), ((Long) w82Var2.c.a(x92.s)).longValue());
                                                return;
                                            }
                                            throw new IOException("ExoPlayer was released during preloading.");
                                        }
                                        wz2Var = wz2Var2;
                                        jv5.A.y.P.remove(wz2Var.W);
                                        return;
                                    }
                                    throw new IOException("Abort requested before buffering finished. ");
                                } catch (Throwable th3) {
                                    th = th3;
                                    wz2Var = vz2Var;
                                    str = r2;
                                    while (true) {
                                        throw th;
                                    }
                                }
                            }
                            throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                        } catch (Throwable th4) {
                            th = th4;
                            wz2Var = vz2Var;
                            while (true) {
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                wz2Var2 = wz2Var3;
                wz2Var = wz2Var2;
                jv5.A.y.P.remove(wz2Var.W);
                return;
            case 1:
                ((uv3) vz2Var.Q).a();
                return;
            default:
                ((j74) this.Q).d.c.p(oj4.d(6, null, null));
                return;
        }
    }
}