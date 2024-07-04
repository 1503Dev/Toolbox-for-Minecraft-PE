package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: im5  reason: default package */
public final class im5 implements Handler.Callback, mv5, vy5, hn5, rk5, kn5 {
    public tk5 A0;
    public final db3 C0;
    public final pk5 D0;
    public final mk5[] P;
    public final Set Q;
    public final mk5[] R;
    public final wy5 S;
    public final xy5 T;
    public final sm5 U;
    public final iz5 V;
    public final a54 W;
    public final HandlerThread X;
    public final Looper Y;
    public final lc3 Z;
    public final ya3 a0;
    public final long b0;
    public final sk5 c0;
    public final ArrayList d0;
    public final dx3 e0;
    public final xm5 f0;
    public final in5 g0;
    public final long h0;
    public ao5 i0;
    public jn5 j0;
    public gm5 k0;
    public boolean l0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public int v0;
    public hm5 w0;
    public long x0;
    public int y0;
    public boolean z0;
    public int q0 = 0;
    public boolean r0 = false;
    public boolean m0 = false;
    public long B0 = -9223372036854775807L;

    public im5(mk5[] mk5VarArr, wy5 wy5Var, xy5 xy5Var, sm5 sm5Var, iz5 iz5Var, ho5 ho5Var, ao5 ao5Var, pk5 pk5Var, long j, Looper looper, dx3 dx3Var, db3 db3Var, wp5 wp5Var) {
        this.C0 = db3Var;
        this.P = mk5VarArr;
        this.S = wy5Var;
        this.T = xy5Var;
        this.U = sm5Var;
        this.V = iz5Var;
        this.i0 = ao5Var;
        this.D0 = pk5Var;
        this.h0 = j;
        this.e0 = dx3Var;
        this.b0 = sm5Var.a();
        sm5Var.e();
        jn5 g = jn5.g(xy5Var);
        this.j0 = g;
        this.k0 = new gm5(g);
        int length = mk5VarArr.length;
        this.R = new mk5[2];
        for (int i = 0; i < 2; i++) {
            mk5 mk5Var = mk5VarArr[i];
            mk5Var.S = i;
            mk5Var.T = wp5Var;
            this.R[i] = mk5Var;
        }
        this.c0 = new sk5(this, dx3Var);
        this.d0 = new ArrayList();
        this.Q = Collections.newSetFromMap(new IdentityHashMap());
        this.Z = new lc3();
        this.a0 = new ya3();
        wy5Var.a = this;
        wy5Var.b = iz5Var;
        this.z0 = true;
        dl4 b = dx3Var.b(looper, null);
        this.f0 = new xm5(ho5Var, b);
        this.g0 = new in5(this, ho5Var, b, wp5Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.X = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.Y = looper2;
        this.W = dx3Var.b(looper2, this);
    }

    public static boolean A(mk5 mk5Var) {
        return mk5Var.U != 0;
    }

    public static Object E(lc3 lc3Var, ya3 ya3Var, int i, boolean z, Object obj, kd3 kd3Var, kd3 kd3Var2) {
        int a = kd3Var.a(obj);
        int b = kd3Var.b();
        int i2 = 0;
        int i3 = a;
        int i4 = -1;
        while (true) {
            if (i2 >= b || i4 != -1) {
                break;
            }
            i3 = kd3Var.i(i3, ya3Var, lc3Var, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = kd3Var2.a(kd3Var.f(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return kd3Var2.f(i4);
    }

    public static Pair I(kd3 kd3Var, hm5 hm5Var, int i, boolean z, lc3 lc3Var, ya3 ya3Var) {
        Pair l;
        int i2;
        long j;
        kd3 kd3Var2 = hm5Var.a;
        if (kd3Var.o()) {
            return null;
        }
        kd3 kd3Var3 = true == kd3Var2.o() ? kd3Var : kd3Var2;
        try {
            l = kd3Var3.l(lc3Var, ya3Var, hm5Var.b, hm5Var.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (kd3Var.equals(kd3Var3)) {
            return l;
        }
        if (kd3Var.a(l.first) == -1) {
            Object E = E(lc3Var, ya3Var, i, z, l.first, kd3Var3, kd3Var);
            if (E != null) {
                i2 = kd3Var.n(E, ya3Var).c;
                j = -9223372036854775807L;
            }
            return null;
        } else if (!kd3Var3.n(l.first, ya3Var).e || kd3Var3.e(ya3Var.c, lc3Var, 0L).l != kd3Var3.a(l.first)) {
            return l;
        } else {
            int i3 = kd3Var.n(l.first, ya3Var).c;
            j = hm5Var.c;
            i2 = i3;
        }
        return kd3Var.l(lc3Var, ya3Var, i2, j);
    }

    public final boolean B() {
        um5 um5Var = this.f0.h;
        long j = um5Var.f.e;
        if (!um5Var.d) {
            return false;
        }
        if (j != -9223372036854775807L && this.j0.r >= j && C()) {
            return false;
        }
        return true;
    }

    public final boolean C() {
        jn5 jn5Var = this.j0;
        return jn5Var.l && jn5Var.m == 0;
    }

    public final boolean D(kd3 kd3Var, ov5 ov5Var) {
        if (!ov5Var.a() && !kd3Var.o()) {
            kd3Var.e(kd3Var.n(ov5Var.a, this.a0).c, this.Z, 0L);
            if (this.Z.b()) {
                lc3 lc3Var = this.Z;
                if (lc3Var.g && lc3Var.d != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    public final long F(kd3 kd3Var, Object obj, long j) {
        kd3Var.e(kd3Var.n(obj, this.a0).c, this.Z, 0L);
        lc3 lc3Var = this.Z;
        if (lc3Var.d != -9223372036854775807L && lc3Var.b()) {
            lc3 lc3Var2 = this.Z;
            if (lc3Var2.g) {
                long j2 = lc3Var2.e;
                return zn4.q((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - this.Z.d) - j;
            }
        }
        return -9223372036854775807L;
    }

    public final long G(ov5 ov5Var, long j, boolean z, boolean z2) {
        xm5 xm5Var;
        v();
        this.o0 = false;
        if (z2 || this.j0.e == 3) {
            s(2);
        }
        um5 um5Var = this.f0.h;
        um5 um5Var2 = um5Var;
        while (um5Var2 != null && !ov5Var.equals(um5Var2.f.a)) {
            um5Var2 = um5Var2.l;
        }
        if (z || um5Var != um5Var2 || (um5Var2 != null && um5Var2.o + j < 0)) {
            mk5[] mk5VarArr = this.P;
            int length = mk5VarArr.length;
            for (int i = 0; i < 2; i++) {
                b(mk5VarArr[i]);
            }
            if (um5Var2 != null) {
                while (true) {
                    xm5Var = this.f0;
                    if (xm5Var.h == um5Var2) {
                        break;
                    }
                    xm5Var.c();
                }
                xm5Var.j(um5Var2);
                um5Var2.o = 1000000000000L;
                int length2 = this.P.length;
                d(new boolean[2]);
            }
        }
        xm5 xm5Var2 = this.f0;
        if (um5Var2 != null) {
            xm5Var2.j(um5Var2);
            if (!um5Var2.d) {
                um5Var2.f = um5Var2.f.b(j);
            } else if (um5Var2.e) {
                long g = um5Var2.a.g(j);
                um5Var2.a.h(g - this.b0);
                j = g;
            }
            n(j);
            j();
        } else {
            xm5Var2.i();
            n(j);
        }
        g(false);
        ((dl4) this.W).c(2);
        return j;
    }

    public final Pair H(kd3 kd3Var) {
        long j = 0;
        if (kd3Var.o()) {
            return Pair.create(jn5.s, 0L);
        }
        Pair l = kd3Var.l(this.Z, this.a0, kd3Var.g(this.r0), -9223372036854775807L);
        ov5 h = this.f0.h(kd3Var, l.first, 0L);
        long longValue = ((Long) l.second).longValue();
        if (h.a()) {
            kd3Var.n(h.a, this.a0);
            if (-1 == this.a0.a(-1)) {
                this.a0.f.getClass();
            }
        } else {
            j = longValue;
        }
        return Pair.create(h, Long.valueOf(j));
    }

    public final jn5 J(ov5 ov5Var, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        hx5 hx5Var;
        xy5 xy5Var;
        nw4 nw4Var;
        long max;
        hx5 hx5Var2;
        xy5 xy5Var2;
        nw4 nw4Var2;
        hx5 hx5Var3;
        xy5 xy5Var3;
        boolean z3 = false;
        if (!this.z0 && j == this.j0.r && ov5Var.equals(this.j0.b)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.z0 = z2;
        m();
        jn5 jn5Var = this.j0;
        hx5 hx5Var4 = jn5Var.h;
        xy5 xy5Var4 = jn5Var.i;
        List list = jn5Var.j;
        if (this.g0.j) {
            um5 um5Var = this.f0.h;
            if (um5Var == null) {
                hx5Var2 = hx5.d;
            } else {
                hx5Var2 = um5Var.m;
            }
            if (um5Var == null) {
                xy5Var2 = this.T;
            } else {
                xy5Var2 = um5Var.n;
            }
            qy5[] qy5VarArr = xy5Var2.c;
            kv4 kv4Var = new kv4();
            int length = qy5VarArr.length;
            int i2 = 0;
            boolean z4 = false;
            while (i2 < length) {
                qy5 qy5Var = qy5VarArr[i2];
                if (qy5Var != null) {
                    yt2 yt2Var = qy5Var.e(0).i;
                    if (yt2Var == null) {
                        hx5Var3 = hx5Var2;
                        xy5Var3 = xy5Var2;
                        kv4Var.p(new yt2(-9223372036854775807L, new et2[0]));
                    } else {
                        hx5Var3 = hx5Var2;
                        xy5Var3 = xy5Var2;
                        kv4Var.p(yt2Var);
                        z4 = true;
                    }
                } else {
                    hx5Var3 = hx5Var2;
                    xy5Var3 = xy5Var2;
                }
                i2++;
                hx5Var2 = hx5Var3;
                xy5Var2 = xy5Var3;
            }
            hx5 hx5Var5 = hx5Var2;
            xy5 xy5Var5 = xy5Var2;
            if (z4) {
                nw4Var2 = kv4Var.s();
            } else {
                lv4 lv4Var = nv4.Q;
                nw4Var2 = nw4.T;
            }
            if (um5Var != null) {
                vm5 vm5Var = um5Var.f;
                if (vm5Var.c != j2) {
                    um5Var.f = vm5Var.a(j2);
                }
            }
            nw4Var = nw4Var2;
            hx5Var = hx5Var5;
            xy5Var = xy5Var5;
        } else if (!ov5Var.equals(jn5Var.b)) {
            hx5 hx5Var6 = hx5.d;
            hx5Var = hx5Var6;
            xy5Var = this.T;
            nw4Var = nw4.T;
        } else {
            hx5Var = hx5Var4;
            xy5Var = xy5Var4;
            nw4Var = list;
        }
        if (z) {
            gm5 gm5Var = this.k0;
            if (gm5Var.d && gm5Var.e != 5) {
                if (i == 5) {
                    z3 = true;
                }
                tv2.G(z3);
            } else {
                gm5Var.a = true;
                gm5Var.d = true;
                gm5Var.e = i;
            }
        }
        jn5 jn5Var2 = this.j0;
        long j4 = jn5Var2.p;
        um5 um5Var2 = this.f0.j;
        if (um5Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j4 - (this.x0 - um5Var2.o));
        }
        return jn5Var2.b(ov5Var, j, j2, j3, max, hx5Var, xy5Var, nw4Var);
    }

    @Override // defpackage.mv5
    public final void a(nv5 nv5Var) {
        ((dl4) this.W).a(8, nv5Var).a();
    }

    public final void b(mk5 mk5Var) {
        boolean z;
        boolean z2;
        int i = mk5Var.U;
        boolean z3 = true;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        sk5 sk5Var = this.c0;
        if (mk5Var == sk5Var.R) {
            sk5Var.S = null;
            sk5Var.R = null;
            sk5Var.T = true;
        }
        if (i == 2) {
            if (i == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            tv2.I(z2);
            mk5Var.U = 1;
            mk5Var.w();
        }
        if (mk5Var.U != 1) {
            z3 = false;
        }
        tv2.I(z3);
        vi1 vi1Var = mk5Var.Q;
        vi1Var.R = null;
        vi1Var.Q = null;
        mk5Var.U = 0;
        mk5Var.V = null;
        mk5Var.W = null;
        mk5Var.Z = false;
        mk5Var.r();
        this.v0--;
    }

    /* JADX WARN: Code restructure failed: missing block: B:280:0x0461, code lost:
        if (B() != false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x04fb, code lost:
        if (r22.f(r26, r58.c0.d().a, r58.o0, r30) != false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
        if (r0.k < 100) goto L230;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x02eb A[EDGE_INSN: B:407:0x02eb->B:180:0x02eb ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        boolean z;
        boolean z2;
        long j;
        long j2;
        boolean z3;
        boolean z4;
        jn5 jn5Var;
        int i;
        long j3;
        ww5 ww5Var;
        boolean z5;
        qy5[] qy5VarArr;
        long j4;
        boolean z6;
        boolean z7;
        boolean z8;
        sm5 sm5Var;
        long max;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        um5 um5Var;
        boolean z14;
        um5 um5Var2;
        boolean z15;
        um5 um5Var3;
        um5 um5Var4;
        um5 c;
        boolean z16;
        boolean z17;
        int i2;
        mk5[] mk5VarArr;
        int i3;
        vm5 n;
        long j5;
        boolean z18;
        boolean z19;
        long uptimeMillis = SystemClock.uptimeMillis();
        ((dl4) this.W).a.removeMessages(2);
        if (!this.j0.a.o() && this.g0.j) {
            xm5 xm5Var = this.f0;
            long j6 = this.x0;
            um5 um5Var5 = xm5Var.j;
            if (um5Var5 != null) {
                if (um5Var5.l == null) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                tv2.I(z19);
                if (um5Var5.d) {
                    um5Var5.a.b(j6 - um5Var5.o);
                }
            }
            xm5 xm5Var2 = this.f0;
            um5 um5Var6 = xm5Var2.j;
            if (um5Var6 != null) {
                if (!um5Var6.f.h) {
                    if (um5Var6.d && (!um5Var6.e || um5Var6.a.d() == Long.MIN_VALUE)) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        if (xm5Var2.j.f.e != -9223372036854775807L) {
                        }
                    }
                }
                z13 = false;
                if (z13) {
                    xm5 xm5Var3 = this.f0;
                    long j7 = this.x0;
                    jn5 jn5Var2 = this.j0;
                    um5 um5Var7 = xm5Var3.j;
                    if (um5Var7 == null) {
                        n = xm5Var3.o(jn5Var2.a, jn5Var2.b, jn5Var2.c, jn5Var2.r);
                    } else {
                        n = xm5Var3.n(jn5Var2.a, um5Var7, j7);
                    }
                    if (n != null) {
                        xm5 xm5Var4 = this.f0;
                        mk5[] mk5VarArr2 = this.R;
                        wy5 wy5Var = this.S;
                        jz5 g = this.U.g();
                        in5 in5Var = this.g0;
                        xy5 xy5Var = this.T;
                        um5 um5Var8 = xm5Var4.j;
                        if (um5Var8 == null) {
                            j5 = 1000000000000L;
                        } else {
                            j5 = (um5Var8.o + um5Var8.f.e) - n.b;
                        }
                        um5 um5Var9 = new um5(mk5VarArr2, j5, wy5Var, g, in5Var, n, xy5Var);
                        um5 um5Var10 = xm5Var4.j;
                        if (um5Var10 != null) {
                            if (um5Var9 != um5Var10.l) {
                                um5Var10.i();
                                um5Var10.l = um5Var9;
                            }
                        } else {
                            xm5Var4.h = um5Var9;
                            xm5Var4.i = um5Var9;
                        }
                        xm5Var4.l = null;
                        xm5Var4.j = um5Var9;
                        xm5Var4.k++;
                        xm5Var4.s();
                        um5Var9.a.o(this, n.b);
                        if (this.f0.h == um5Var9) {
                            n(n.b);
                        }
                        g(false);
                        if (this.p0) {
                            this.p0 = z();
                            w();
                        } else {
                            j();
                        }
                        um5Var = this.f0.i;
                        if (um5Var != null) {
                            if (um5Var.l != null && !this.n0) {
                                if (um5Var.d) {
                                    int i4 = 0;
                                    while (true) {
                                        mk5[] mk5VarArr3 = this.P;
                                        int length = mk5VarArr3.length;
                                        if (i4 < 2) {
                                            mk5 mk5Var = mk5VarArr3[i4];
                                            ww5 ww5Var2 = um5Var.c[i4];
                                            if (mk5Var.V != ww5Var2) {
                                                break;
                                            }
                                            if (ww5Var2 != null && !mk5Var.g()) {
                                                um5Var.f.getClass();
                                                break;
                                            }
                                            i4++;
                                        } else {
                                            um5 um5Var11 = um5Var.l;
                                            if (um5Var11.d || this.x0 >= um5Var11.d()) {
                                                xy5 xy5Var2 = um5Var.n;
                                                xm5 xm5Var5 = this.f0;
                                                um5 um5Var12 = xm5Var5.i;
                                                if (um5Var12 != null && um5Var12.l != null) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                tv2.I(z14);
                                                xm5Var5.i = xm5Var5.i.l;
                                                xm5Var5.s();
                                                um5 um5Var13 = xm5Var5.i;
                                                xy5 xy5Var3 = um5Var13.n;
                                                kd3 kd3Var = this.j0.a;
                                                y(kd3Var, um5Var13.f.a, kd3Var, um5Var.f.a, -9223372036854775807L);
                                                if (um5Var13.d && um5Var13.a.i() != -9223372036854775807L) {
                                                    um5Var13.d();
                                                    mk5[] mk5VarArr4 = this.P;
                                                    int length2 = mk5VarArr4.length;
                                                    for (int i5 = 0; i5 < 2; i5++) {
                                                        mk5 mk5Var2 = mk5VarArr4[i5];
                                                        if (mk5Var2.V != null) {
                                                            mk5Var2.Z = true;
                                                            if (mk5Var2 instanceof jx5) {
                                                                jx5 jx5Var = (jx5) mk5Var2;
                                                                throw null;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int i6 = 0;
                                                    while (true) {
                                                        int length3 = this.P.length;
                                                        if (i6 >= 2) {
                                                            break;
                                                        }
                                                        boolean b = xy5Var2.b(i6);
                                                        boolean b2 = xy5Var3.b(i6);
                                                        if (b && !this.P[i6].Z) {
                                                            this.R[i6].getClass();
                                                            zn5 zn5Var = xy5Var2.b[i6];
                                                            zn5 zn5Var2 = xy5Var3.b[i6];
                                                            if (!b2 || !zn5Var2.equals(zn5Var)) {
                                                                mk5 mk5Var3 = this.P[i6];
                                                                um5Var13.d();
                                                                mk5Var3.Z = true;
                                                                if (mk5Var3 instanceof jx5) {
                                                                    jx5 jx5Var2 = (jx5) mk5Var3;
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                        i6++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (um5Var.f.h || this.n0) {
                                int i7 = 0;
                                while (true) {
                                    mk5[] mk5VarArr5 = this.P;
                                    int length4 = mk5VarArr5.length;
                                    if (i7 >= 2) {
                                        break;
                                    }
                                    mk5 mk5Var4 = mk5VarArr5[i7];
                                    ww5 ww5Var3 = um5Var.c[i7];
                                    if (ww5Var3 != null && mk5Var4.V == ww5Var3 && mk5Var4.g()) {
                                        long j8 = um5Var.f.e;
                                        if (j8 != -9223372036854775807L) {
                                            int i8 = (j8 > Long.MIN_VALUE ? 1 : (j8 == Long.MIN_VALUE ? 0 : -1));
                                        }
                                        mk5Var4.Z = true;
                                        if (mk5Var4 instanceof jx5) {
                                            jx5 jx5Var3 = (jx5) mk5Var4;
                                            throw null;
                                        }
                                    }
                                    i7++;
                                }
                            }
                            xm5 xm5Var6 = this.f0;
                            um5Var2 = xm5Var6.i;
                            if (um5Var2 != null && xm5Var6.h != um5Var2 && !um5Var2.g) {
                                xy5 xy5Var4 = um5Var2.n;
                                z17 = false;
                                i2 = 0;
                                while (true) {
                                    mk5VarArr = this.P;
                                    int length5 = mk5VarArr.length;
                                    if (i2 < 2) {
                                        break;
                                    }
                                    mk5 mk5Var5 = mk5VarArr[i2];
                                    if (A(mk5Var5)) {
                                        ww5 ww5Var4 = mk5Var5.V;
                                        ww5 ww5Var5 = um5Var2.c[i2];
                                        if (!xy5Var4.b(i2) || ww5Var4 != ww5Var5) {
                                            if (!mk5Var5.Z) {
                                                qy5 qy5Var = xy5Var4.c[i2];
                                                if (qy5Var != null) {
                                                    i3 = qy5Var.d();
                                                } else {
                                                    i3 = 0;
                                                }
                                                cu1[] cu1VarArr = new cu1[i3];
                                                for (int i9 = 0; i9 < i3; i9++) {
                                                    cu1VarArr[i9] = qy5Var.e(i9);
                                                }
                                                mk5Var5.y(cu1VarArr, um5Var2.c[i2], um5Var2.d(), um5Var2.o);
                                            } else if (mk5Var5.j()) {
                                                b(mk5Var5);
                                            } else {
                                                z17 = true;
                                            }
                                        }
                                    }
                                    i2++;
                                }
                                if (!z17) {
                                    int length6 = mk5VarArr.length;
                                    d(new boolean[2]);
                                }
                            }
                            z15 = false;
                            while (C() && !this.n0 && (um5Var3 = this.f0.h) != null && (um5Var4 = um5Var3.l) != null && this.x0 >= um5Var4.d() && um5Var4.g) {
                                if (z15) {
                                    k();
                                }
                                c = this.f0.c();
                                c.getClass();
                                if (this.j0.b.a.equals(c.f.a.a)) {
                                    ov5 ov5Var = this.j0.b;
                                    if (ov5Var.b == -1) {
                                        ov5 ov5Var2 = c.f.a;
                                        if (ov5Var2.b == -1 && ov5Var.e != ov5Var2.e) {
                                            z16 = true;
                                            vm5 vm5Var = c.f;
                                            ov5 ov5Var3 = vm5Var.a;
                                            long j9 = vm5Var.b;
                                            this.j0 = J(ov5Var3, j9, vm5Var.c, j9, !z16, 0);
                                            m();
                                            x();
                                            z15 = true;
                                        }
                                    }
                                }
                                z16 = false;
                                vm5 vm5Var2 = c.f;
                                ov5 ov5Var32 = vm5Var2.a;
                                long j92 = vm5Var2.b;
                                this.j0 = J(ov5Var32, j92, vm5Var2.c, j92, !z16, 0);
                                m();
                                x();
                                z15 = true;
                            }
                        }
                        xm5 xm5Var62 = this.f0;
                        um5Var2 = xm5Var62.i;
                        if (um5Var2 != null) {
                            xy5 xy5Var42 = um5Var2.n;
                            z17 = false;
                            i2 = 0;
                            while (true) {
                                mk5VarArr = this.P;
                                int length52 = mk5VarArr.length;
                                if (i2 < 2) {
                                }
                                i2++;
                            }
                            if (!z17) {
                            }
                        }
                        z15 = false;
                        while (C()) {
                            if (z15) {
                            }
                            c = this.f0.c();
                            c.getClass();
                            if (this.j0.b.a.equals(c.f.a.a)) {
                            }
                            z16 = false;
                            vm5 vm5Var22 = c.f;
                            ov5 ov5Var322 = vm5Var22.a;
                            long j922 = vm5Var22.b;
                            this.j0 = J(ov5Var322, j922, vm5Var22.c, j922, !z16, 0);
                            m();
                            x();
                            z15 = true;
                        }
                    }
                }
                if (this.p0) {
                }
                um5Var = this.f0.i;
                if (um5Var != null) {
                }
                xm5 xm5Var622 = this.f0;
                um5Var2 = xm5Var622.i;
                if (um5Var2 != null) {
                }
                z15 = false;
                while (C()) {
                }
            }
            z13 = true;
            if (z13) {
            }
            if (this.p0) {
            }
            um5Var = this.f0.i;
            if (um5Var != null) {
            }
            xm5 xm5Var6222 = this.f0;
            um5Var2 = xm5Var6222.i;
            if (um5Var2 != null) {
            }
            z15 = false;
            while (C()) {
            }
        }
        int i10 = this.j0.e;
        if (i10 != 1 && i10 != 4) {
            um5 um5Var14 = this.f0.h;
            if (um5Var14 == null) {
                p(uptimeMillis, 10L);
                return;
            }
            int i11 = zn4.a;
            Trace.beginSection("doSomeWork");
            x();
            if (um5Var14.d) {
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                um5Var14.a.h(this.j0.r - this.b0);
                z = true;
                int i12 = 0;
                z2 = true;
                while (true) {
                    mk5[] mk5VarArr6 = this.P;
                    int length7 = mk5VarArr6.length;
                    if (i12 >= 2) {
                        break;
                    }
                    mk5 mk5Var6 = mk5VarArr6[i12];
                    if (A(mk5Var6)) {
                        mk5Var6.i(this.x0, elapsedRealtime);
                        if (z2 && mk5Var6.j()) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (um5Var14.c[i12] != mk5Var6.V) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10 && mk5Var6.g()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z10 && !z11 && !mk5Var6.k() && !mk5Var6.j()) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z && z12) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z12) {
                            ww5 ww5Var6 = mk5Var6.V;
                            ww5Var6.getClass();
                            ww5Var6.i();
                        }
                        z2 = z9;
                    }
                    i12++;
                }
            } else {
                um5Var14.a.l();
                z = true;
                z2 = true;
            }
            long j10 = um5Var14.f.e;
            if (z2 && um5Var14.d) {
                j = -9223372036854775807L;
                if (j10 == -9223372036854775807L || j10 <= this.j0.r) {
                    if (this.n0) {
                        this.n0 = false;
                        r(this.j0.m, 5, false, false);
                    }
                    if (um5Var14.f.h) {
                        s(4);
                        v();
                        if (this.j0.e == 2) {
                            int i13 = 0;
                            while (true) {
                                mk5[] mk5VarArr7 = this.P;
                                int length8 = mk5VarArr7.length;
                                if (i13 >= 2) {
                                    break;
                                }
                                if (A(mk5VarArr7[i13]) && (ww5Var = this.P[i13].V) == um5Var14.c[i13]) {
                                    ww5Var.getClass();
                                    ww5Var.i();
                                }
                                i13++;
                            }
                            jn5 jn5Var3 = this.j0;
                            if (!jn5Var3.g && jn5Var3.q < 500000 && z()) {
                                int i14 = (this.B0 > (-9223372036854775807L) ? 1 : (this.B0 == (-9223372036854775807L) ? 0 : -1));
                                j2 = SystemClock.elapsedRealtime();
                                if (i14 != 0) {
                                    if (j2 - this.B0 >= 4000) {
                                        throw new IllegalStateException("Playback stuck buffering and not loading");
                                    }
                                    if (!C() && this.j0.e == 3) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (!this.u0 && this.t0 && z3) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    jn5Var = this.j0;
                                    if (jn5Var.o != z4) {
                                        this.j0 = new jn5(jn5Var.a, jn5Var.b, jn5Var.c, jn5Var.d, jn5Var.e, jn5Var.f, jn5Var.g, jn5Var.h, jn5Var.i, jn5Var.j, jn5Var.k, jn5Var.l, jn5Var.m, jn5Var.n, jn5Var.p, jn5Var.q, jn5Var.r, z4);
                                    }
                                    this.t0 = false;
                                    if (!z4 && (i = this.j0.e) != 4) {
                                        if (z3 && i != 2) {
                                            if (i == 3 && this.v0 != 0) {
                                                j3 = 1000;
                                            }
                                        } else {
                                            j3 = 10;
                                        }
                                        p(uptimeMillis, j3);
                                    }
                                    Trace.endSection();
                                }
                                this.B0 = j2;
                                if (!C()) {
                                }
                                z3 = false;
                                if (!this.u0) {
                                }
                                z4 = false;
                                jn5Var = this.j0;
                                if (jn5Var.o != z4) {
                                }
                                this.t0 = false;
                                if (!z4) {
                                    if (z3) {
                                    }
                                    j3 = 10;
                                    p(uptimeMillis, j3);
                                }
                                Trace.endSection();
                            }
                        }
                        j2 = -9223372036854775807L;
                        this.B0 = j2;
                        if (!C()) {
                        }
                        z3 = false;
                        if (!this.u0) {
                        }
                        z4 = false;
                        jn5Var = this.j0;
                        if (jn5Var.o != z4) {
                        }
                        this.t0 = false;
                        if (!z4) {
                        }
                        Trace.endSection();
                    }
                }
            } else {
                j = -9223372036854775807L;
            }
            jn5 jn5Var4 = this.j0;
            if (jn5Var4.e == 2) {
                if (this.v0 != 0) {
                    if (z) {
                        if (jn5Var4.g) {
                            if (D(jn5Var4.a, this.f0.h.f.a)) {
                                j4 = this.D0.h;
                            } else {
                                j4 = j;
                            }
                            um5 um5Var15 = this.f0.j;
                            if (um5Var15.d && (!um5Var15.e || um5Var15.a.d() == Long.MIN_VALUE)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6 && um5Var15.f.h) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (um5Var15.f.a.a() && !um5Var15.d) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (!z7 && !z8) {
                                sm5 sm5Var2 = this.U;
                                long j11 = this.j0.p;
                                um5 um5Var16 = this.f0.j;
                                if (um5Var16 == null) {
                                    z5 = z;
                                    sm5Var = sm5Var2;
                                    max = 0;
                                } else {
                                    z5 = z;
                                    sm5Var = sm5Var2;
                                    max = Math.max(0L, j11 - (this.x0 - um5Var16.o));
                                }
                            }
                        }
                        s(3);
                        this.A0 = null;
                        if (C()) {
                            t();
                        }
                    }
                }
                if (this.j0.e == 2) {
                }
                j2 = -9223372036854775807L;
                this.B0 = j2;
                if (!C()) {
                }
                z3 = false;
                if (!this.u0) {
                }
                z4 = false;
                jn5Var = this.j0;
                if (jn5Var.o != z4) {
                }
                this.t0 = false;
                if (!z4) {
                }
                Trace.endSection();
            }
            z5 = z;
            if (this.j0.e == 3 && (this.v0 != 0 ? !z5 : !B())) {
                this.o0 = C();
                s(2);
                if (this.o0) {
                    for (um5 um5Var17 = this.f0.h; um5Var17 != null; um5Var17 = um5Var17.l) {
                        for (qy5 qy5Var2 : um5Var17.n.c) {
                        }
                    }
                    pk5 pk5Var = this.D0;
                    long j12 = pk5Var.h;
                    if (j12 != -9223372036854775807L) {
                        long j13 = j12 + pk5Var.b;
                        pk5Var.h = j13;
                        long j14 = pk5Var.g;
                        if (j14 != -9223372036854775807L && j13 > j14) {
                            pk5Var.h = j14;
                        }
                        pk5Var.l = -9223372036854775807L;
                    }
                }
                v();
            }
            if (this.j0.e == 2) {
            }
            j2 = -9223372036854775807L;
            this.B0 = j2;
            if (!C()) {
            }
            z3 = false;
            if (!this.u0) {
            }
            z4 = false;
            jn5Var = this.j0;
            if (jn5Var.o != z4) {
            }
            this.t0 = false;
            if (!z4) {
            }
            Trace.endSection();
        }
    }

    public final void d(boolean[] zArr) {
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        tm5 tm5Var;
        um5 um5Var = this.f0.i;
        xy5 xy5Var = um5Var.n;
        int i4 = 0;
        while (true) {
            int length = this.P.length;
            i = 2;
            if (i4 >= 2) {
                break;
            }
            if (!xy5Var.b(i4) && this.Q.remove(this.P[i4])) {
                this.P[i4].e();
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            int length2 = this.P.length;
            if (i5 < i) {
                if (xy5Var.b(i5)) {
                    boolean z6 = zArr[i5];
                    mk5 mk5Var = this.P[i5];
                    if (!A(mk5Var)) {
                        xm5 xm5Var = this.f0;
                        um5 um5Var2 = xm5Var.i;
                        if (um5Var2 == xm5Var.h) {
                            z = true;
                        } else {
                            z = false;
                        }
                        xy5 xy5Var2 = um5Var2.n;
                        zn5 zn5Var = xy5Var2.b[i5];
                        qy5 qy5Var = xy5Var2.c[i5];
                        if (qy5Var != null) {
                            i3 = qy5Var.d();
                        } else {
                            i3 = 0;
                        }
                        cu1[] cu1VarArr = new cu1[i3];
                        for (int i6 = 0; i6 < i3; i6++) {
                            cu1VarArr[i6] = qy5Var.e(i6);
                        }
                        if (C() && this.j0.e == 3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z6 && z2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.v0++;
                        this.Q.add(mk5Var);
                        ww5 ww5Var = um5Var2.c[i5];
                        i2 = i5;
                        long j = this.x0;
                        long d = um5Var2.d();
                        long j2 = um5Var2.o;
                        if (mk5Var.U == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        tv2.I(z4);
                        mk5Var.R = zn5Var;
                        mk5Var.U = 1;
                        mk5Var.s(z3, z);
                        mk5Var.y(cu1VarArr, ww5Var, d, j2);
                        mk5Var.Z = false;
                        mk5Var.Y = j;
                        mk5Var.t(j, z3);
                        mk5Var.c(11, new cm5(this));
                        sk5 sk5Var = this.c0;
                        sk5Var.getClass();
                        tm5 p = mk5Var.p();
                        if (p != null && p != (tm5Var = sk5Var.S)) {
                            if (tm5Var == null) {
                                sk5Var.S = p;
                                sk5Var.R = mk5Var;
                                p.b(sk5Var.P.S);
                            } else {
                                throw new tk5(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                            }
                        }
                        if (z2) {
                            if (mk5Var.U == 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            tv2.I(z5);
                            mk5Var.U = 2;
                            mk5Var.v();
                        }
                        i5 = i2 + 1;
                        i = 2;
                    }
                }
                i2 = i5;
                i5 = i2 + 1;
                i = 2;
            } else {
                um5Var.g = true;
                return;
            }
        }
    }

    @Override // defpackage.mv5
    public final /* bridge */ /* synthetic */ void e(xw5 xw5Var) {
        ((dl4) this.W).a(9, (nv5) xw5Var).a();
    }

    public final void f(IOException iOException, int i) {
        tk5 tk5Var = new tk5(0, iOException, i);
        um5 um5Var = this.f0.h;
        if (um5Var != null) {
            tk5Var = tk5Var.a(um5Var.f.a);
        }
        lb4.b("ExoPlayerImplInternal", "Playback error", tk5Var);
        u(false, false);
        this.j0 = this.j0.d(tk5Var);
    }

    public final void g(boolean z) {
        ov5 ov5Var;
        long b;
        um5 um5Var = this.f0.j;
        if (um5Var == null) {
            ov5Var = this.j0.b;
        } else {
            ov5Var = um5Var.f.a;
        }
        boolean z2 = !this.j0.k.equals(ov5Var);
        if (z2) {
            this.j0 = this.j0.a(ov5Var);
        }
        jn5 jn5Var = this.j0;
        if (um5Var == null) {
            b = jn5Var.r;
        } else {
            b = um5Var.b();
        }
        jn5Var.p = b;
        jn5 jn5Var2 = this.j0;
        long j = jn5Var2.p;
        um5 um5Var2 = this.f0.j;
        long j2 = 0;
        if (um5Var2 != null) {
            j2 = Math.max(0L, j - (this.x0 - um5Var2.o));
        }
        jn5Var2.q = j2;
        if ((z2 || z) && um5Var != null && um5Var.d) {
            this.U.b(this.P, um5Var.n.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x039d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb  */
    /* JADX WARN: Type inference failed for: r23v18 */
    /* JADX WARN: Type inference failed for: r23v20 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(kd3 kd3Var, boolean z) {
        boolean z2;
        long j;
        ov5 ov5Var;
        int i;
        ov5 ov5Var2;
        long j2;
        int i2;
        long j3;
        long j4;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        boolean z5;
        long j5;
        boolean z6;
        boolean z7;
        long j6;
        boolean z8;
        boolean z9;
        long j7;
        long j8;
        ov5 h;
        boolean z10;
        ov5 ov5Var3;
        boolean z11;
        boolean z12;
        long j9;
        long j10;
        long longValue;
        int i7;
        boolean z13;
        boolean z14;
        long j11;
        boolean z15;
        Throwable th;
        boolean z16;
        Object obj;
        boolean z17;
        boolean z18;
        long j12;
        Object obj2;
        boolean z19;
        long j13;
        jn5 jn5Var = this.j0;
        hm5 hm5Var = this.w0;
        xm5 xm5Var = this.f0;
        int i8 = this.q0;
        boolean z20 = this.r0;
        lc3 lc3Var = this.Z;
        ya3 ya3Var = this.a0;
        if (kd3Var.o()) {
            ov5Var3 = jn5.s;
            z12 = false;
            j10 = 0;
            i = 4;
            z11 = false;
            j9 = -9223372036854775807L;
            z13 = 0;
            z9 = true;
        } else {
            ov5 ov5Var4 = jn5Var.b;
            Object obj3 = ov5Var4.a;
            kd3 kd3Var2 = jn5Var.a;
            if (!kd3Var2.o() && !kd3Var2.n(ov5Var4.a, ya3Var).e) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!jn5Var.b.a() && !z2) {
                j = jn5Var.r;
            } else {
                j = jn5Var.c;
            }
            long j14 = j;
            if (hm5Var != null) {
                ov5Var = ov5Var4;
                i = 4;
                Pair I = I(kd3Var, hm5Var, i8, z20, lc3Var, ya3Var);
                if (I == null) {
                    i6 = kd3Var.g(z20);
                    j5 = j14;
                    z6 = false;
                    z7 = false;
                    z5 = true;
                } else {
                    if (hm5Var.c == -9223372036854775807L) {
                        i7 = kd3Var.n(I.first, ya3Var).c;
                        longValue = j14;
                        z6 = false;
                    } else {
                        obj3 = I.first;
                        longValue = ((Long) I.second).longValue();
                        i7 = -1;
                        z6 = true;
                    }
                    if (jn5Var.e == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z5 = false;
                    long j15 = longValue;
                    i6 = i7;
                    j5 = j15;
                }
            } else {
                ov5Var = ov5Var4;
                i = 4;
                if (jn5Var.a.o()) {
                    i5 = kd3Var.g(z20);
                } else if (kd3Var.a(obj3) == -1) {
                    Object E = E(lc3Var, ya3Var, i8, z20, obj3, jn5Var.a, kd3Var);
                    if (E == null) {
                        i6 = kd3Var.g(z20);
                        z4 = true;
                    } else {
                        i6 = kd3Var.n(E, ya3Var).c;
                        z4 = false;
                    }
                    z5 = z4;
                    j5 = j14;
                    z6 = false;
                    z7 = false;
                } else if (j14 == -9223372036854775807L) {
                    i5 = kd3Var.n(obj3, ya3Var).c;
                } else if (z2) {
                    ov5Var2 = ov5Var;
                    jn5Var.a.n(ov5Var2.a, ya3Var);
                    if (jn5Var.a.e(ya3Var.c, lc3Var, 0L).l == jn5Var.a.a(ov5Var2.a)) {
                        j3 = 0;
                        Pair l = kd3Var.l(lc3Var, ya3Var, kd3Var.n(obj3, ya3Var).c, j14);
                        obj3 = l.first;
                        j4 = ((Long) l.second).longValue();
                    } else {
                        j3 = 0;
                        j4 = j14;
                    }
                    i3 = -1;
                    i4 = -1;
                    z3 = true;
                    j6 = j3;
                    z8 = false;
                    z9 = false;
                    j7 = j6;
                    if (i4 == i3) {
                        Pair l2 = kd3Var.l(lc3Var, ya3Var, i4, -9223372036854775807L);
                        obj3 = l2.first;
                        j8 = ((Long) l2.second).longValue();
                        j4 = -9223372036854775807L;
                    } else {
                        j8 = j4;
                    }
                    h = xm5Var.h(kd3Var, obj3, j8);
                    if (!ov5Var2.a.equals(obj3) && !ov5Var2.a() && !h.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ya3 n = kd3Var.n(obj3, ya3Var);
                    if (!z2 && j14 == j4 && ov5Var2.a.equals(h.a)) {
                        if (ov5Var2.a()) {
                            n.c(ov5Var2.b);
                        }
                        if (h.a()) {
                            n.c(-1);
                        }
                    }
                    if (true == z10) {
                        h = ov5Var2;
                    }
                    if (h.a()) {
                        if (h.equals(ov5Var2)) {
                            j8 = jn5Var.r;
                        } else {
                            kd3Var.n(h.a, ya3Var);
                            if (h.c == ya3Var.a(h.b)) {
                                ya3Var.f.getClass();
                            }
                            j8 = j7;
                        }
                    }
                    ov5Var3 = h;
                    z11 = z3;
                    z12 = z8;
                    j9 = j4;
                    j10 = j8;
                    z13 = j7;
                } else {
                    ov5Var2 = ov5Var;
                    j2 = 0;
                    i2 = -1;
                    i4 = i2;
                    j4 = j14;
                    i3 = -1;
                    z3 = false;
                    j6 = j2;
                    z8 = false;
                    z9 = false;
                    j7 = j6;
                    if (i4 == i3) {
                    }
                    h = xm5Var.h(kd3Var, obj3, j8);
                    if (!ov5Var2.a.equals(obj3)) {
                    }
                    z10 = false;
                    ya3 n2 = kd3Var.n(obj3, ya3Var);
                    if (!z2) {
                        if (ov5Var2.a()) {
                        }
                        if (h.a()) {
                        }
                    }
                    if (true == z10) {
                    }
                    if (h.a()) {
                    }
                    ov5Var3 = h;
                    z11 = z3;
                    z12 = z8;
                    j9 = j4;
                    j10 = j8;
                    z13 = j7;
                }
                i2 = i5;
                ov5Var2 = ov5Var;
                j2 = 0;
                i4 = i2;
                j4 = j14;
                i3 = -1;
                z3 = false;
                j6 = j2;
                z8 = false;
                z9 = false;
                j7 = j6;
                if (i4 == i3) {
                }
                h = xm5Var.h(kd3Var, obj3, j8);
                if (!ov5Var2.a.equals(obj3)) {
                }
                z10 = false;
                ya3 n22 = kd3Var.n(obj3, ya3Var);
                if (!z2) {
                }
                if (true == z10) {
                }
                if (h.a()) {
                }
                ov5Var3 = h;
                z11 = z3;
                z12 = z8;
                j9 = j4;
                j10 = j8;
                z13 = j7;
            }
            z3 = z6;
            z8 = z7;
            ov5Var2 = ov5Var;
            j7 = 0;
            i4 = i6;
            j4 = j5;
            z9 = z5;
            i3 = -1;
            if (i4 == i3) {
            }
            h = xm5Var.h(kd3Var, obj3, j8);
            if (!ov5Var2.a.equals(obj3)) {
            }
            z10 = false;
            ya3 n222 = kd3Var.n(obj3, ya3Var);
            if (!z2) {
            }
            if (true == z10) {
            }
            if (h.a()) {
            }
            ov5Var3 = h;
            z11 = z3;
            z12 = z8;
            j9 = j4;
            j10 = j8;
            z13 = j7;
        }
        if (this.j0.b.equals(ov5Var3) && j10 == this.j0.r) {
            z14 = false;
        } else {
            z14 = true;
        }
        int i9 = 3;
        if (z9) {
            try {
                if (this.j0.e != 1) {
                    s(i);
                }
                l(false, false, false, true);
            } catch (Throwable th2) {
                th = th2;
                z13 = z11;
                z15 = z13;
                j11 = -9223372036854775807L;
                jn5 jn5Var2 = this.j0;
                kd3 kd3Var3 = jn5Var2.a;
                ov5 ov5Var5 = jn5Var2.b;
                if (true == z15) {
                }
                z16 = true;
                y(kd3Var, ov5Var3, kd3Var3, ov5Var5, j11);
                if (!z14) {
                }
                jn5 jn5Var3 = this.j0;
                obj = jn5Var3.b.a;
                kd3 kd3Var4 = jn5Var3.a;
                if (z14) {
                }
                long j16 = this.j0.d;
                if (kd3Var.a(obj) == -1) {
                }
                this.j0 = J(ov5Var3, j10, j9, j16, z16, i9);
                m();
                o(kd3Var, this.j0.a);
                this.j0 = this.j0.f(kd3Var);
                if (!kd3Var.o()) {
                }
                g(false);
                throw th;
            }
        }
        try {
            if (!z14) {
                xm5 xm5Var2 = this.f0;
                long j17 = this.x0;
                um5 um5Var = xm5Var2.i;
                if (um5Var == null) {
                    j13 = z13 == true ? 1 : 0;
                    z17 = z11;
                } else {
                    z17 = z11;
                    long j18 = um5Var.o;
                    if (um5Var.d) {
                        int i10 = 0;
                        while (true) {
                            mk5[] mk5VarArr = this.P;
                            int length = mk5VarArr.length;
                            if (i10 >= 2) {
                                break;
                            }
                            if (A(mk5VarArr[i10])) {
                                mk5 mk5Var = this.P[i10];
                                if (mk5Var.V == um5Var.c[i10]) {
                                    long j19 = mk5Var.Y;
                                    if (j19 == Long.MIN_VALUE) {
                                        j13 = Long.MIN_VALUE;
                                        break;
                                    } else {
                                        j18 = Math.max(j19, j18);
                                        i10++;
                                    }
                                }
                            }
                            i10++;
                        }
                    }
                    j13 = j18;
                }
                if (!xm5Var2.k(kd3Var, j17, j13)) {
                    q(false);
                }
            } else {
                z17 = z11;
                if (!kd3Var.o()) {
                    try {
                        for (um5 um5Var2 = this.f0.h; um5Var2 != null; um5Var2 = um5Var2.l) {
                            if (um5Var2.f.a.equals(ov5Var3)) {
                                vm5 g = this.f0.g(kd3Var, um5Var2.f);
                                um5Var2.f = g;
                                nv5 nv5Var = um5Var2.a;
                                if (nv5Var instanceof qu5) {
                                    long j20 = g.d;
                                    j11 = -9223372036854775807L;
                                    if (j20 == -9223372036854775807L) {
                                        j20 = Long.MIN_VALUE;
                                    }
                                    try {
                                        ((qu5) nv5Var).T = j20;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z15 = z17;
                                        jn5 jn5Var22 = this.j0;
                                        kd3 kd3Var32 = jn5Var22.a;
                                        ov5 ov5Var52 = jn5Var22.b;
                                        if (true == z15) {
                                        }
                                        z16 = true;
                                        y(kd3Var, ov5Var3, kd3Var32, ov5Var52, j11);
                                        if (!z14) {
                                        }
                                        jn5 jn5Var32 = this.j0;
                                        obj = jn5Var32.b.a;
                                        kd3 kd3Var42 = jn5Var32.a;
                                        if (z14) {
                                        }
                                        long j162 = this.j0.d;
                                        if (kd3Var.a(obj) == -1) {
                                        }
                                        this.j0 = J(ov5Var3, j10, j9, j162, z16, i9);
                                        m();
                                        o(kd3Var, this.j0.a);
                                        this.j0 = this.j0.f(kd3Var);
                                        if (!kd3Var.o()) {
                                        }
                                        g(false);
                                        throw th;
                                    }
                                }
                            }
                        }
                        j11 = -9223372036854775807L;
                        xm5 xm5Var3 = this.f0;
                        if (xm5Var3.h != xm5Var3.i) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        j10 = G(ov5Var3, j10, z18, z12);
                        jn5 jn5Var4 = this.j0;
                        kd3 kd3Var5 = jn5Var4.a;
                        ov5 ov5Var6 = jn5Var4.b;
                        if (true == z17) {
                            j12 = j11;
                        } else {
                            j12 = j10;
                        }
                        y(kd3Var, ov5Var3, kd3Var5, ov5Var6, j12);
                        if (!z14 || j9 != this.j0.c) {
                            jn5 jn5Var5 = this.j0;
                            obj2 = jn5Var5.b.a;
                            kd3 kd3Var6 = jn5Var5.a;
                            if (!z14 && z && !kd3Var6.o() && !kd3Var6.n(obj2, this.a0).e) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            long j21 = this.j0.d;
                            if (kd3Var.a(obj2) == -1) {
                                i9 = 4;
                            }
                            this.j0 = J(ov5Var3, j10, j9, j21, z19, i9);
                        }
                        m();
                        o(kd3Var, this.j0.a);
                        this.j0 = this.j0.f(kd3Var);
                        if (!kd3Var.o()) {
                            this.w0 = null;
                        }
                        g(false);
                    } catch (Throwable th4) {
                        th = th4;
                        j11 = -9223372036854775807L;
                    }
                }
            }
            j11 = -9223372036854775807L;
            jn5 jn5Var42 = this.j0;
            kd3 kd3Var52 = jn5Var42.a;
            ov5 ov5Var62 = jn5Var42.b;
            if (true == z17) {
            }
            y(kd3Var, ov5Var3, kd3Var52, ov5Var62, j12);
            if (!z14) {
            }
            jn5 jn5Var52 = this.j0;
            obj2 = jn5Var52.b.a;
            kd3 kd3Var62 = jn5Var52.a;
            if (!z14) {
            }
            z19 = false;
            long j212 = this.j0.d;
            if (kd3Var.a(obj2) == -1) {
            }
            this.j0 = J(ov5Var3, j10, j9, j212, z19, i9);
            m();
            o(kd3Var, this.j0.a);
            this.j0 = this.j0.f(kd3Var);
            if (!kd3Var.o()) {
            }
            g(false);
        } catch (Throwable th5) {
            th = th5;
            z15 = z13;
            j11 = -9223372036854775807L;
            jn5 jn5Var222 = this.j0;
            kd3 kd3Var322 = jn5Var222.a;
            ov5 ov5Var522 = jn5Var222.b;
            if (true == z15) {
                j11 = j10;
            }
            z16 = true;
            y(kd3Var, ov5Var3, kd3Var322, ov5Var522, j11);
            if (!z14 || j9 != this.j0.c) {
                jn5 jn5Var322 = this.j0;
                obj = jn5Var322.b.a;
                kd3 kd3Var422 = jn5Var322.a;
                z16 = (z14 || !z || kd3Var422.o() || kd3Var422.n(obj, this.a0).e) ? false : false;
                long j1622 = this.j0.d;
                if (kd3Var.a(obj) == -1) {
                    i9 = 4;
                }
                this.j0 = J(ov5Var3, j10, j9, j1622, z16, i9);
            }
            m();
            o(kd3Var, this.j0.a);
            this.j0 = this.j0.f(kd3Var);
            if (!kd3Var.o()) {
                this.w0 = null;
            }
            g(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
        if (r24.f0.f() != r24.f0.e()) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0501 A[Catch: all -> 0x05b0, TryCatch #10 {all -> 0x05b0, blocks: (B:299:0x04f7, B:301:0x0501, B:303:0x0507, B:305:0x050d, B:306:0x0510, B:307:0x0516, B:309:0x0520, B:311:0x0528, B:315:0x0532, B:317:0x053c, B:319:0x054e, B:323:0x0558, B:330:0x056e, B:334:0x0578, B:338:0x0583), top: B:456:0x04f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0706 A[LOOP:0: B:445:0x06f8->B:447:0x0706, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x06c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r1v52, types: [in5] */
    /* JADX WARN: Type inference failed for: r2v37, types: [bf5, iz5] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        tk5 tk5Var;
        jy2 jy2Var;
        RuntimeException runtimeException;
        IOException iOException;
        hs5 hs5Var;
        bw4 bw4Var;
        tk5 tk5Var2;
        tk5 tk5Var3;
        jn5 d;
        um5 f;
        int i2;
        int i3;
        bw4 bw4Var2;
        int i4;
        a54 a54Var;
        boolean z6;
        long longValue;
        long j;
        ov5 h;
        boolean z7;
        boolean z8;
        Throwable th;
        long j2;
        boolean z9;
        boolean z10;
        long G;
        boolean z11;
        long j3;
        jn5 jn5Var;
        int i5;
        int i6;
        boolean z12;
        boolean z13;
        boolean z14;
        qy5[] qy5VarArr;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        a54 a54Var2;
        int i7;
        List list;
        yw5 yw5Var;
        kd3 g;
        List list2;
        yw5 yw5Var2;
        int i8;
        long j4;
        List list3;
        yw5 yw5Var3;
        boolean z19;
        boolean z20;
        try {
            try {
                try {
                    switch (message.what) {
                        case 0:
                            i = 1;
                            this.k0.a(1);
                            l(false, false, false, true);
                            this.U.c();
                            if (true != this.j0.a.o()) {
                                i4 = 2;
                            } else {
                                i4 = 4;
                            }
                            s(i4);
                            this.g0.b(this.V);
                            a54Var = this.W;
                            ((dl4) a54Var).c(2);
                            break;
                        case 1:
                            i = 1;
                            if (message.arg1 != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            r(message.arg2, 1, z6, true);
                            break;
                        case 2:
                            i = 1;
                            c();
                            break;
                        case 3:
                            i = 1;
                            hm5 hm5Var = (hm5) message.obj;
                            this.k0.a(1);
                            Pair I = I(this.j0.a, hm5Var, this.q0, this.r0, this.Z, this.a0);
                            long j5 = -9223372036854775807L;
                            try {
                                if (I == null) {
                                    Pair H = H(this.j0.a);
                                    h = (ov5) H.first;
                                    long longValue2 = ((Long) H.second).longValue();
                                    z7 = !this.j0.a.o();
                                    longValue = longValue2;
                                } else {
                                    Object obj = I.first;
                                    longValue = ((Long) I.second).longValue();
                                    if (hm5Var.c == -9223372036854775807L) {
                                        j = -9223372036854775807L;
                                    } else {
                                        j = longValue;
                                    }
                                    h = this.f0.h(this.j0.a, obj, longValue);
                                    if (h.a()) {
                                        this.j0.a.n(h.a, this.a0);
                                        if (this.a0.a(-1) == -1) {
                                            this.a0.f.getClass();
                                        }
                                        z8 = true;
                                        longValue = 0;
                                        if (!this.j0.a.o()) {
                                            this.w0 = hm5Var;
                                        } else if (I == null) {
                                            if (this.j0.e != 1) {
                                                s(4);
                                            }
                                            l(false, true, false, true);
                                        } else {
                                            try {
                                                if (h.equals(this.j0.b)) {
                                                    um5 e = this.f0.e();
                                                    if (e != null && e.d && longValue != 0) {
                                                        j3 = e.a.k(longValue, this.i0);
                                                    } else {
                                                        j3 = longValue;
                                                    }
                                                    long j6 = j3;
                                                    if (zn4.s(j3) == zn4.s(this.j0.r) && ((i5 = (jn5Var = this.j0).e) == 2 || i5 == 3)) {
                                                        longValue = jn5Var.r;
                                                        i6 = 2;
                                                        this.j0 = J(h, longValue, j, longValue, z8, i6);
                                                        break;
                                                    } else {
                                                        j2 = j6;
                                                    }
                                                } else {
                                                    j2 = longValue;
                                                }
                                                jn5 jn5Var2 = this.j0;
                                                kd3 kd3Var = jn5Var2.a;
                                                y(kd3Var, h, kd3Var, jn5Var2.b, j);
                                                longValue = G;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                longValue = G;
                                                boolean z21 = z8;
                                                Throwable th3 = th;
                                                this.j0 = J(h, longValue, j, longValue, z21, 2);
                                                throw th3;
                                            }
                                            if (this.j0.e == 4) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            xm5 xm5Var = this.f0;
                                            if (xm5Var.h != xm5Var.i) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            G = G(h, j2, z10, z9);
                                            if (longValue != G) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            z8 |= z11;
                                        }
                                        i6 = 2;
                                        this.j0 = J(h, longValue, j, longValue, z8, i6);
                                    } else {
                                        if (hm5Var.c == -9223372036854775807L) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        j5 = j;
                                    }
                                }
                                if (!this.j0.a.o()) {
                                }
                                i6 = 2;
                                this.j0 = J(h, longValue, j, longValue, z8, i6);
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            z8 = z7;
                            j = j5;
                            break;
                        case 4:
                            i = 1;
                            ((dl4) this.W).a.removeMessages(16);
                            this.c0.b((y13) message.obj);
                            y13 d2 = this.c0.d();
                            i(d2, d2.a, true, true);
                            break;
                        case 5:
                            i = 1;
                            this.i0 = (ao5) message.obj;
                            break;
                        case 6:
                            i = 1;
                            u(false, true);
                            break;
                        case 7:
                            l(true, false, true, false);
                            this.U.d();
                            s(1);
                            HandlerThread handlerThread = this.X;
                            if (handlerThread != null) {
                                handlerThread.quit();
                            }
                            synchronized (this) {
                                this.l0 = true;
                                notifyAll();
                            }
                            return true;
                        case 8:
                            i = 1;
                            i = 1;
                            i = 1;
                            nv5 nv5Var = (nv5) message.obj;
                            xm5 xm5Var2 = this.f0;
                            um5 um5Var = xm5Var2.j;
                            if (um5Var != null && um5Var.a == nv5Var) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                um5 d3 = xm5Var2.d();
                                d3.g(this.c0.d().a, this.j0.a);
                                this.U.b(this.P, d3.f().c);
                                if (d3 == this.f0.e()) {
                                    n(d3.f.b);
                                    int length = this.P.length;
                                    d(new boolean[2]);
                                    jn5 jn5Var3 = this.j0;
                                    ov5 ov5Var = jn5Var3.b;
                                    long j7 = d3.f.b;
                                    this.j0 = J(ov5Var, j7, jn5Var3.c, j7, false, 5);
                                }
                                j();
                                break;
                            }
                            break;
                        case 9:
                            i = 1;
                            i = 1;
                            i = 1;
                            i = 1;
                            nv5 nv5Var2 = (nv5) message.obj;
                            um5 um5Var2 = this.f0.j;
                            if (um5Var2 != null && um5Var2.a == nv5Var2) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                long j8 = this.x0;
                                if (um5Var2 != null) {
                                    if (um5Var2.l == null) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    tv2.I(z14);
                                    if (um5Var2.d) {
                                        um5Var2.a.b(j8 - um5Var2.o);
                                    }
                                }
                                j();
                                break;
                            }
                            break;
                        case 10:
                            float f2 = this.c0.d().a;
                            um5 e2 = this.f0.e();
                            um5 f3 = this.f0.f();
                            boolean z22 = true;
                            for (um5 um5Var3 = e2; um5Var3 != null && um5Var3.d; um5Var3 = um5Var3.e()) {
                                kd3 kd3Var2 = this.j0.a;
                                wy5 wy5Var = um5Var3.j;
                                mk5[] mk5VarArr = um5Var3.i;
                                hx5 hx5Var = um5Var3.m;
                                ov5 ov5Var2 = um5Var3.f.a;
                                xy5 d4 = wy5Var.d(mk5VarArr, hx5Var);
                                for (qy5 qy5Var : d4.c) {
                                }
                                xy5 f4 = um5Var3.f();
                                if (f4 != null && f4.c.length == d4.c.length) {
                                    for (int i9 = 0; i9 < d4.c.length; i9++) {
                                        if (d4.a(f4, i9)) {
                                        }
                                    }
                                    if (um5Var3 == f3) {
                                        z16 = false;
                                    } else {
                                        z16 = true;
                                    }
                                    z22 &= z16;
                                }
                                if (z22) {
                                    um5 e3 = this.f0.e();
                                    boolean j9 = this.f0.j(e3);
                                    int length2 = this.P.length;
                                    boolean[] zArr = new boolean[2];
                                    long a = e3.a(d4, this.j0.r, j9, zArr);
                                    jn5 jn5Var4 = this.j0;
                                    if (jn5Var4.e != 4 && a != jn5Var4.r) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    jn5 jn5Var5 = this.j0;
                                    this.j0 = J(jn5Var5.b, a, jn5Var5.c, jn5Var5.d, z15, 5);
                                    if (z15) {
                                        n(a);
                                    }
                                    int length3 = this.P.length;
                                    boolean[] zArr2 = new boolean[2];
                                    int i10 = 0;
                                    while (true) {
                                        mk5[] mk5VarArr2 = this.P;
                                        int length4 = mk5VarArr2.length;
                                        if (i10 < 2) {
                                            mk5 mk5Var = mk5VarArr2[i10];
                                            boolean A = A(mk5Var);
                                            zArr2[i10] = A;
                                            ww5 ww5Var = e3.c[i10];
                                            if (A) {
                                                if (ww5Var != mk5Var.q()) {
                                                    b(mk5Var);
                                                } else if (zArr[i10]) {
                                                    long j10 = this.x0;
                                                    try {
                                                        mk5Var.Z = false;
                                                        mk5Var.Y = j10;
                                                        mk5Var.t(j10, false);
                                                    } catch (bw4 e4) {
                                                        e = e4;
                                                        bw4Var = e;
                                                        z5 = true;
                                                        i2 = bw4Var.P;
                                                        bw4Var2 = bw4Var;
                                                        i = z5;
                                                        f(bw4Var2, i2);
                                                        k();
                                                        return i;
                                                    } catch (hs5 e5) {
                                                        e = e5;
                                                        hs5Var = e;
                                                        z4 = true;
                                                        i2 = hs5Var.P;
                                                        bw4Var2 = hs5Var;
                                                        i = z4;
                                                        f(bw4Var2, i2);
                                                        k();
                                                        return i;
                                                    } catch (RuntimeException e6) {
                                                        e = e6;
                                                        runtimeException = e;
                                                        z3 = true;
                                                        if (runtimeException instanceof IllegalStateException) {
                                                        }
                                                        i3 = 1004;
                                                        tk5 tk5Var4 = new tk5(2, runtimeException, i3);
                                                        lb4.b("ExoPlayerImplInternal", "Playback error", tk5Var4);
                                                        u(z3, false);
                                                        d = this.j0.d(tk5Var4);
                                                        i = z3;
                                                        this.j0 = d;
                                                        k();
                                                        return i;
                                                    } catch (jy2 e7) {
                                                        e = e7;
                                                        jy2Var = e;
                                                        z2 = true;
                                                        if (jy2Var.Q != z2) {
                                                        }
                                                        f(bw4Var2, i2);
                                                        k();
                                                        return i;
                                                    } catch (IOException e8) {
                                                        e = e8;
                                                        iOException = e;
                                                        z = true;
                                                        i2 = RecyclerView.MAX_SCROLL_DURATION;
                                                        bw4Var2 = iOException;
                                                        i = z;
                                                        f(bw4Var2, i2);
                                                        k();
                                                        return i;
                                                    } catch (tk5 e9) {
                                                        e = e9;
                                                        tk5Var = e;
                                                        i = 1;
                                                        if (tk5Var.R == i) {
                                                        }
                                                        if (!tk5Var.X) {
                                                        }
                                                        tk5Var2 = this.A0;
                                                        if (tk5Var2 != null) {
                                                        }
                                                        tk5Var3 = tk5Var;
                                                        lb4.b("ExoPlayerImplInternal", "Playback error", tk5Var3);
                                                        if (tk5Var3.R == i) {
                                                        }
                                                        u(i, false);
                                                        d = this.j0.d(tk5Var3);
                                                        i = i;
                                                        this.j0 = d;
                                                        k();
                                                        return i;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                            i10++;
                                        } else {
                                            d(zArr2);
                                        }
                                    }
                                } else {
                                    this.f0.j(um5Var3);
                                    if (um5Var3.d) {
                                        try {
                                            um5Var3.a(d4, Math.max(um5Var3.f.b, this.x0 - um5Var3.c()), false, new boolean[2]);
                                        } catch (bw4 e10) {
                                            e = e10;
                                            bw4Var = e;
                                            z5 = true;
                                            i2 = bw4Var.P;
                                            bw4Var2 = bw4Var;
                                            i = z5;
                                            f(bw4Var2, i2);
                                            k();
                                            return i;
                                        } catch (hs5 e11) {
                                            e = e11;
                                            hs5Var = e;
                                            z4 = true;
                                            i2 = hs5Var.P;
                                            bw4Var2 = hs5Var;
                                            i = z4;
                                            f(bw4Var2, i2);
                                            k();
                                            return i;
                                        } catch (RuntimeException e12) {
                                            e = e12;
                                            runtimeException = e;
                                            z3 = true;
                                            if (runtimeException instanceof IllegalStateException) {
                                            }
                                            i3 = 1004;
                                            tk5 tk5Var42 = new tk5(2, runtimeException, i3);
                                            lb4.b("ExoPlayerImplInternal", "Playback error", tk5Var42);
                                            u(z3, false);
                                            d = this.j0.d(tk5Var42);
                                            i = z3;
                                            this.j0 = d;
                                            k();
                                            return i;
                                        } catch (jy2 e13) {
                                            e = e13;
                                            jy2Var = e;
                                            z2 = true;
                                            if (jy2Var.Q != z2) {
                                            }
                                            f(bw4Var2, i2);
                                            k();
                                            return i;
                                        } catch (IOException e14) {
                                            e = e14;
                                            iOException = e;
                                            z = true;
                                            i2 = RecyclerView.MAX_SCROLL_DURATION;
                                            bw4Var2 = iOException;
                                            i = z;
                                            f(bw4Var2, i2);
                                            k();
                                            return i;
                                        } catch (tk5 e15) {
                                            e = e15;
                                            tk5Var = e;
                                            i = 1;
                                            if (tk5Var.R == i) {
                                            }
                                            if (!tk5Var.X) {
                                            }
                                            tk5Var2 = this.A0;
                                            if (tk5Var2 != null) {
                                            }
                                            tk5Var3 = tk5Var;
                                            lb4.b("ExoPlayerImplInternal", "Playback error", tk5Var3);
                                            if (tk5Var3.R == i) {
                                            }
                                            u(i, false);
                                            d = this.j0.d(tk5Var3);
                                            i = i;
                                            this.j0 = d;
                                            k();
                                            return i;
                                        }
                                    }
                                }
                                i = 1;
                                i = 1;
                                g(true);
                                if (this.j0.e != 4) {
                                    j();
                                    x();
                                    a54Var = this.W;
                                    ((dl4) a54Var).c(2);
                                }
                            }
                            i = 1;
                            break;
                        case 11:
                            int i11 = message.arg1;
                            this.q0 = i11;
                            if (!this.f0.l(this.j0.a, i11)) {
                                q(true);
                            }
                            g(false);
                            i = 1;
                            break;
                        case 12:
                            if (message.arg1 != 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            this.r0 = z17;
                            if (!this.f0.m(this.j0.a, z17)) {
                                q(true);
                            }
                            g(false);
                            i = 1;
                            break;
                        case 13:
                            if (message.arg1 != 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                            if (this.s0 != z18) {
                                this.s0 = z18;
                                if (!z18) {
                                    mk5[] mk5VarArr3 = this.P;
                                    int length5 = mk5VarArr3.length;
                                    for (int i12 = 0; i12 < 2; i12++) {
                                        mk5 mk5Var2 = mk5VarArr3[i12];
                                        if (!A(mk5Var2) && this.Q.remove(mk5Var2)) {
                                            mk5Var2.e();
                                        }
                                    }
                                }
                            }
                            if (atomicBoolean != null) {
                                synchronized (this) {
                                    atomicBoolean.set(true);
                                    notifyAll();
                                }
                            }
                            i = 1;
                            break;
                        case 14:
                            mn5 mn5Var = (mn5) message.obj;
                            if (mn5Var.a() == this.Y) {
                                try {
                                    synchronized (mn5Var) {
                                    }
                                    try {
                                        mn5Var.a.c(mn5Var.c, mn5Var.d);
                                        mn5Var.c(true);
                                        int i13 = this.j0.e;
                                        if (i13 == 3 || i13 == 2) {
                                            a54Var2 = this.W;
                                            ((dl4) a54Var2).c(2);
                                        }
                                    } catch (Throwable th5) {
                                        mn5Var.c(true);
                                        throw th5;
                                    }
                                } catch (bw4 e16) {
                                    e = e16;
                                    bw4Var = e;
                                    z5 = true;
                                    i2 = bw4Var.P;
                                    bw4Var2 = bw4Var;
                                    i = z5;
                                    f(bw4Var2, i2);
                                    k();
                                    return i;
                                } catch (hs5 e17) {
                                    e = e17;
                                    hs5Var = e;
                                    z4 = true;
                                    i2 = hs5Var.P;
                                    bw4Var2 = hs5Var;
                                    i = z4;
                                    f(bw4Var2, i2);
                                    k();
                                    return i;
                                } catch (RuntimeException e18) {
                                    e = e18;
                                    runtimeException = e;
                                    z3 = true;
                                    if (runtimeException instanceof IllegalStateException) {
                                    }
                                    i3 = 1004;
                                    tk5 tk5Var422 = new tk5(2, runtimeException, i3);
                                    lb4.b("ExoPlayerImplInternal", "Playback error", tk5Var422);
                                    u(z3, false);
                                    d = this.j0.d(tk5Var422);
                                    i = z3;
                                    this.j0 = d;
                                    k();
                                    return i;
                                } catch (jy2 e19) {
                                    e = e19;
                                    jy2Var = e;
                                    z2 = true;
                                    if (jy2Var.Q != z2) {
                                    }
                                    f(bw4Var2, i2);
                                    k();
                                    return i;
                                } catch (IOException e20) {
                                    e = e20;
                                    iOException = e;
                                    z = true;
                                    i2 = RecyclerView.MAX_SCROLL_DURATION;
                                    bw4Var2 = iOException;
                                    i = z;
                                    f(bw4Var2, i2);
                                    k();
                                    return i;
                                } catch (tk5 e21) {
                                    e = e21;
                                    tk5Var = e;
                                    i = 1;
                                    if (tk5Var.R == i) {
                                    }
                                    if (!tk5Var.X) {
                                    }
                                    tk5Var2 = this.A0;
                                    if (tk5Var2 != null) {
                                    }
                                    tk5Var3 = tk5Var;
                                    lb4.b("ExoPlayerImplInternal", "Playback error", tk5Var3);
                                    if (tk5Var3.R == i) {
                                    }
                                    u(i, false);
                                    d = this.j0.d(tk5Var3);
                                    i = i;
                                    this.j0 = d;
                                    k();
                                    return i;
                                }
                            } else {
                                ((dl4) this.W).a(15, mn5Var).a();
                            }
                            i = 1;
                            break;
                        case 15:
                            mn5 mn5Var2 = (mn5) message.obj;
                            Looper a2 = mn5Var2.a();
                            if (!a2.getThread().isAlive()) {
                                lb4.c("TAG", "Trying to send message on a dead thread.");
                                mn5Var2.c(false);
                            } else {
                                this.e0.b(a2, null).b(new nh1(2, this, mn5Var2));
                            }
                            i = 1;
                            break;
                        case 16:
                            y13 y13Var = (y13) message.obj;
                            try {
                                i(y13Var, y13Var.a, true, false);
                                i = 1;
                            } catch (bw4 e22) {
                                e = e22;
                                bw4Var = e;
                                z5 = true;
                                i2 = bw4Var.P;
                                bw4Var2 = bw4Var;
                                i = z5;
                                f(bw4Var2, i2);
                                k();
                                return i;
                            } catch (hs5 e23) {
                                e = e23;
                                hs5Var = e;
                                z4 = true;
                                i2 = hs5Var.P;
                                bw4Var2 = hs5Var;
                                i = z4;
                                f(bw4Var2, i2);
                                k();
                                return i;
                            } catch (RuntimeException e24) {
                                e = e24;
                                runtimeException = e;
                                z3 = true;
                                if (runtimeException instanceof IllegalStateException) {
                                }
                                i3 = 1004;
                                tk5 tk5Var4222 = new tk5(2, runtimeException, i3);
                                lb4.b("ExoPlayerImplInternal", "Playback error", tk5Var4222);
                                u(z3, false);
                                d = this.j0.d(tk5Var4222);
                                i = z3;
                                this.j0 = d;
                                k();
                                return i;
                            } catch (jy2 e25) {
                                e = e25;
                                jy2Var = e;
                                z2 = true;
                                if (jy2Var.Q != z2) {
                                }
                                f(bw4Var2, i2);
                                k();
                                return i;
                            } catch (IOException e26) {
                                e = e26;
                                iOException = e;
                                z = true;
                                i2 = RecyclerView.MAX_SCROLL_DURATION;
                                bw4Var2 = iOException;
                                i = z;
                                f(bw4Var2, i2);
                                k();
                                return i;
                            } catch (tk5 e27) {
                                e = e27;
                                tk5Var = e;
                                i = 1;
                                if (tk5Var.R == i) {
                                }
                                if (!tk5Var.X) {
                                }
                                tk5Var2 = this.A0;
                                if (tk5Var2 != null) {
                                }
                                tk5Var3 = tk5Var;
                                lb4.b("ExoPlayerImplInternal", "Playback error", tk5Var3);
                                if (tk5Var3.R == i) {
                                }
                                u(i, false);
                                d = this.j0.d(tk5Var3);
                                i = i;
                                this.j0 = d;
                                k();
                                return i;
                            }
                            break;
                        case 17:
                            dm5 dm5Var = (dm5) message.obj;
                            this.k0.a(1);
                            i7 = dm5Var.b;
                            if (i7 != -1) {
                                list2 = dm5Var.a;
                                yw5Var2 = dm5Var.d;
                                nn5 nn5Var = new nn5(list2, yw5Var2);
                                i8 = dm5Var.b;
                                j4 = dm5Var.c;
                                this.w0 = new hm5(nn5Var, i8, j4);
                            }
                            in5 in5Var = this.g0;
                            list = dm5Var.a;
                            yw5Var = dm5Var.d;
                            g = in5Var.g(list, yw5Var);
                            h(g, false);
                            i = 1;
                            break;
                        case 18:
                            dm5 dm5Var2 = (dm5) message.obj;
                            int i14 = message.arg1;
                            this.k0.a(1);
                            in5 in5Var2 = this.g0;
                            if (i14 == -1) {
                                try {
                                    i14 = in5Var2.b.size();
                                } catch (bw4 e28) {
                                    e = e28;
                                    bw4Var = e;
                                    z5 = true;
                                    i2 = bw4Var.P;
                                    bw4Var2 = bw4Var;
                                    i = z5;
                                    f(bw4Var2, i2);
                                    k();
                                    return i;
                                } catch (hs5 e29) {
                                    e = e29;
                                    hs5Var = e;
                                    z4 = true;
                                    i2 = hs5Var.P;
                                    bw4Var2 = hs5Var;
                                    i = z4;
                                    f(bw4Var2, i2);
                                    k();
                                    return i;
                                } catch (IOException e30) {
                                    e = e30;
                                    iOException = e;
                                    z = true;
                                    i2 = RecyclerView.MAX_SCROLL_DURATION;
                                    bw4Var2 = iOException;
                                    i = z;
                                    f(bw4Var2, i2);
                                    k();
                                    return i;
                                } catch (RuntimeException e31) {
                                    e = e31;
                                    runtimeException = e;
                                    z3 = true;
                                    if ((runtimeException instanceof IllegalStateException) && !(runtimeException instanceof IllegalArgumentException)) {
                                        i3 = 1000;
                                    } else {
                                        i3 = 1004;
                                    }
                                    tk5 tk5Var42222 = new tk5(2, runtimeException, i3);
                                    lb4.b("ExoPlayerImplInternal", "Playback error", tk5Var42222);
                                    u(z3, false);
                                    d = this.j0.d(tk5Var42222);
                                    i = z3;
                                    this.j0 = d;
                                    k();
                                    return i;
                                } catch (jy2 e32) {
                                    e = e32;
                                    jy2Var = e;
                                    z2 = true;
                                    if (jy2Var.Q != z2) {
                                        if (z2 != jy2Var.P) {
                                            i2 = 3003;
                                            bw4Var2 = jy2Var;
                                            i = z2;
                                        } else {
                                            i2 = 3001;
                                            bw4Var2 = jy2Var;
                                            i = z2;
                                        }
                                    } else {
                                        i2 = 1000;
                                        bw4Var2 = jy2Var;
                                        i = z2;
                                    }
                                    f(bw4Var2, i2);
                                    k();
                                    return i;
                                } catch (tk5 e33) {
                                    e = e33;
                                    tk5Var = e;
                                    i = 1;
                                    if (tk5Var.R == i && (f = this.f0.f()) != null) {
                                        tk5Var = tk5Var.a(f.f.a);
                                    }
                                    if (!tk5Var.X && this.A0 == null) {
                                        lb4.d("ExoPlayerImplInternal", "Recoverable renderer error", tk5Var);
                                        this.A0 = tk5Var;
                                        dl4 dl4Var = (dl4) this.W;
                                        mk4 a3 = dl4Var.a(25, tk5Var);
                                        Handler handler = dl4Var.a;
                                        Message message2 = a3.a;
                                        message2.getClass();
                                        handler.sendMessageAtFrontOfQueue(message2);
                                        a3.a = null;
                                        ArrayList arrayList = dl4.b;
                                        synchronized (arrayList) {
                                            if (arrayList.size() < 50) {
                                                arrayList.add(a3);
                                            }
                                        }
                                        k();
                                        return i;
                                    }
                                    tk5Var2 = this.A0;
                                    if (tk5Var2 != null) {
                                        try {
                                            Class[] clsArr = new Class[i];
                                            clsArr[0] = Throwable.class;
                                            Method declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", clsArr);
                                            Object[] objArr = new Object[i];
                                            objArr[0] = tk5Var;
                                            declaredMethod.invoke(tk5Var2, objArr);
                                        } catch (Exception unused) {
                                        }
                                        tk5Var = this.A0;
                                    }
                                    tk5Var3 = tk5Var;
                                    lb4.b("ExoPlayerImplInternal", "Playback error", tk5Var3);
                                    if (tk5Var3.R == i && this.f0.e() != this.f0.f()) {
                                        while (this.f0.e() != this.f0.f()) {
                                            this.f0.c();
                                        }
                                        um5 e34 = this.f0.e();
                                        e34.getClass();
                                        vm5 vm5Var = e34.f;
                                        ov5 ov5Var3 = vm5Var.a;
                                        long j11 = vm5Var.b;
                                        this.j0 = J(ov5Var3, j11, vm5Var.c, j11, true, 0);
                                    }
                                    u(i, false);
                                    d = this.j0.d(tk5Var3);
                                    i = i;
                                    this.j0 = d;
                                    k();
                                    return i;
                                }
                            }
                            list3 = dm5Var2.a;
                            yw5Var3 = dm5Var2.d;
                            g = in5Var2.d(i14, list3, yw5Var3);
                            h(g, false);
                            i = 1;
                            break;
                        case 19:
                            this.k0.a(1);
                            in5 in5Var3 = this.g0;
                            ((em5) message.obj).getClass();
                            g = in5Var3.e();
                            h(g, false);
                            i = 1;
                            break;
                        case 20:
                            this.k0.a(1);
                            g = this.g0.f(message.arg1, message.arg2, (yw5) message.obj);
                            h(g, false);
                            i = 1;
                            break;
                        case 21:
                            this.k0.a(1);
                            g = this.g0.h((yw5) message.obj);
                            h(g, false);
                            i = 1;
                            break;
                        case 22:
                            h(this.g0.a(), true);
                            i = 1;
                            break;
                        case 23:
                            if (message.arg1 != 0) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            this.m0 = z19;
                            m();
                            if (this.n0) {
                                break;
                            }
                            i = 1;
                            break;
                        case 24:
                            if (message.arg1 == 1) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            if (z20 != this.u0) {
                                this.u0 = z20;
                                if (!z20 && this.j0.o) {
                                    a54Var2 = this.W;
                                    ((dl4) a54Var2).c(2);
                                }
                            }
                            i = 1;
                            break;
                        case 25:
                            q(true);
                            i = 1;
                            break;
                        default:
                            return false;
                    }
                } catch (bw4 e35) {
                    e = e35;
                    bw4Var = e;
                    i2 = bw4Var.P;
                    bw4Var2 = bw4Var;
                    i = z5;
                    f(bw4Var2, i2);
                    k();
                    return i;
                } catch (hs5 e36) {
                    e = e36;
                    hs5Var = e;
                    i2 = hs5Var.P;
                    bw4Var2 = hs5Var;
                    i = z4;
                    f(bw4Var2, i2);
                    k();
                    return i;
                } catch (IOException e37) {
                    e = e37;
                    iOException = e;
                    i2 = RecyclerView.MAX_SCROLL_DURATION;
                    bw4Var2 = iOException;
                    i = z;
                    f(bw4Var2, i2);
                    k();
                    return i;
                } catch (RuntimeException e38) {
                    e = e38;
                    runtimeException = e;
                    if (runtimeException instanceof IllegalStateException) {
                    }
                    i3 = 1004;
                    tk5 tk5Var422222 = new tk5(2, runtimeException, i3);
                    lb4.b("ExoPlayerImplInternal", "Playback error", tk5Var422222);
                    u(z3, false);
                    d = this.j0.d(tk5Var422222);
                    i = z3;
                    this.j0 = d;
                    k();
                    return i;
                } catch (jy2 e39) {
                    e = e39;
                    jy2Var = e;
                    if (jy2Var.Q != z2) {
                    }
                    f(bw4Var2, i2);
                    k();
                    return i;
                } catch (tk5 e40) {
                    e = e40;
                    tk5Var = e;
                    if (tk5Var.R == i) {
                        tk5Var = tk5Var.a(f.f.a);
                    }
                    if (!tk5Var.X) {
                    }
                    tk5Var2 = this.A0;
                    if (tk5Var2 != null) {
                    }
                    tk5Var3 = tk5Var;
                    lb4.b("ExoPlayerImplInternal", "Playback error", tk5Var3);
                    if (tk5Var3.R == i) {
                        while (this.f0.e() != this.f0.f()) {
                        }
                        um5 e342 = this.f0.e();
                        e342.getClass();
                        vm5 vm5Var2 = e342.f;
                        ov5 ov5Var32 = vm5Var2.a;
                        long j112 = vm5Var2.b;
                        this.j0 = J(ov5Var32, j112, vm5Var2.c, j112, true, 0);
                    }
                    u(i, false);
                    d = this.j0.d(tk5Var3);
                    i = i;
                    this.j0 = d;
                    k();
                    return i;
                }
            } catch (bw4 e41) {
                e = e41;
            } catch (hs5 e42) {
                e = e42;
            } catch (RuntimeException e43) {
                e = e43;
            } catch (jy2 e44) {
                e = e44;
            } catch (IOException e45) {
                e = e45;
            } catch (tk5 e46) {
                e = e46;
            }
        } catch (bw4 e47) {
            e = e47;
            z5 = true;
        } catch (hs5 e48) {
            e = e48;
            z4 = true;
        } catch (RuntimeException e49) {
            e = e49;
            z3 = true;
        } catch (jy2 e50) {
            e = e50;
            z2 = true;
        } catch (IOException e51) {
            e = e51;
            z = true;
        } catch (tk5 e52) {
            e = e52;
            i = 1;
        }
        k();
        return i;
    }

    public final void i(y13 y13Var, float f, boolean z, boolean z2) {
        int i;
        im5 im5Var = this;
        if (z) {
            if (z2) {
                im5Var.k0.a(1);
            }
            jn5 jn5Var = im5Var.j0;
            im5Var = this;
            im5Var.j0 = new jn5(jn5Var.a, jn5Var.b, jn5Var.c, jn5Var.d, jn5Var.e, jn5Var.f, jn5Var.g, jn5Var.h, jn5Var.i, jn5Var.j, jn5Var.k, jn5Var.l, jn5Var.m, y13Var, jn5Var.p, jn5Var.q, jn5Var.r, jn5Var.o);
        }
        float f2 = y13Var.a;
        um5 um5Var = im5Var.f0.h;
        while (true) {
            i = 0;
            if (um5Var == null) {
                break;
            }
            qy5[] qy5VarArr = um5Var.n.c;
            int length = qy5VarArr.length;
            while (i < length) {
                qy5 qy5Var = qy5VarArr[i];
                i++;
            }
            um5Var = um5Var.l;
        }
        mk5[] mk5VarArr = im5Var.P;
        int length2 = mk5VarArr.length;
        while (i < 2) {
            mk5 mk5Var = mk5VarArr[i];
            if (mk5Var != null) {
                mk5Var.f(f, y13Var.a);
            }
            i++;
        }
    }

    public final void j() {
        long M;
        long max;
        boolean h;
        boolean z = false;
        if (!z()) {
            h = false;
        } else {
            um5 um5Var = this.f0.j;
            if (!um5Var.d) {
                M = 0;
            } else {
                M = um5Var.a.M();
            }
            um5 um5Var2 = this.f0.j;
            if (um5Var2 == null) {
                max = 0;
            } else {
                max = Math.max(0L, M - (this.x0 - um5Var2.o));
            }
            if (um5Var != this.f0.h) {
                long j = um5Var.f.b;
            }
            h = this.U.h(max, this.c0.d().a);
            if (!h && max < 500000 && this.b0 > 0) {
                this.f0.h.a.h(this.j0.r);
                h = this.U.h(max, this.c0.d().a);
            }
        }
        this.p0 = h;
        if (h) {
            um5 um5Var3 = this.f0.j;
            long j2 = this.x0;
            if (um5Var3.l == null) {
                z = true;
            }
            tv2.I(z);
            um5Var3.a.c(j2 - um5Var3.o);
        }
        w();
    }

    public final void k() {
        boolean z;
        gm5 gm5Var = this.k0;
        jn5 jn5Var = this.j0;
        boolean z2 = gm5Var.a;
        if (gm5Var.b != jn5Var) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = z2 | z;
        gm5Var.a = z3;
        gm5Var.b = jn5Var;
        if (z3) {
            bm5 bm5Var = (bm5) this.C0.Q;
            ((dl4) bm5Var.i).b(new yr1(2, bm5Var, gm5Var));
            this.k0 = new gm5(this.j0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        ov5 ov5Var;
        long j2;
        long j3;
        hx5 hx5Var;
        xy5 xy5Var;
        List list;
        boolean z5;
        ((dl4) this.W).a.removeMessages(2);
        tk5 tk5Var = null;
        this.A0 = null;
        this.o0 = false;
        sk5 sk5Var = this.c0;
        sk5Var.U = false;
        do5 do5Var = sk5Var.P;
        if (do5Var.P) {
            do5Var.c(do5Var.a());
            do5Var.P = false;
        }
        this.x0 = 1000000000000L;
        mk5[] mk5VarArr = this.P;
        int length = mk5VarArr.length;
        for (int i = 0; i < 2; i++) {
            try {
                b(mk5VarArr[i]);
            } catch (RuntimeException | tk5 e) {
                lb4.b("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            mk5[] mk5VarArr2 = this.P;
            int length2 = mk5VarArr2.length;
            for (int i2 = 0; i2 < 2; i2++) {
                mk5 mk5Var = mk5VarArr2[i2];
                if (this.Q.remove(mk5Var)) {
                    try {
                        mk5Var.e();
                    } catch (RuntimeException e2) {
                        lb4.b("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.v0 = 0;
        jn5 jn5Var = this.j0;
        ov5 ov5Var2 = jn5Var.b;
        long j4 = jn5Var.r;
        boolean z6 = true;
        if (!this.j0.b.a()) {
            jn5 jn5Var2 = this.j0;
            ya3 ya3Var = this.a0;
            ov5 ov5Var3 = jn5Var2.b;
            kd3 kd3Var = jn5Var2.a;
            if (!kd3Var.o() && !kd3Var.n(ov5Var3.a, ya3Var).e) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5) {
                j = this.j0.r;
                if (z2) {
                    this.w0 = null;
                    Pair H = H(this.j0.a);
                    ov5Var2 = (ov5) H.first;
                    j4 = ((Long) H.second).longValue();
                    if (!ov5Var2.equals(this.j0.b)) {
                        ov5Var = ov5Var2;
                        j2 = j4;
                        j3 = -9223372036854775807L;
                        this.f0.i();
                        this.p0 = false;
                        jn5 jn5Var3 = this.j0;
                        kd3 kd3Var2 = jn5Var3.a;
                        int i3 = jn5Var3.e;
                        if (!z4) {
                            tk5Var = jn5Var3.f;
                        }
                        tk5 tk5Var2 = tk5Var;
                        if (z6) {
                            hx5Var = hx5.d;
                        } else {
                            hx5Var = jn5Var3.h;
                        }
                        hx5 hx5Var2 = hx5Var;
                        if (z6) {
                            xy5Var = this.T;
                        } else {
                            xy5Var = jn5Var3.i;
                        }
                        xy5 xy5Var2 = xy5Var;
                        if (z6) {
                            lv4 lv4Var = nv4.Q;
                            list = nw4.T;
                        } else {
                            list = jn5Var3.j;
                        }
                        this.j0 = new jn5(kd3Var2, ov5Var, j3, j2, i3, tk5Var2, false, hx5Var2, xy5Var2, list, ov5Var, jn5Var3.l, jn5Var3.m, jn5Var3.n, j2, 0L, j2, false);
                        if (z3) {
                            in5 in5Var = this.g0;
                            for (fn5 fn5Var : in5Var.f.values()) {
                                try {
                                    fn5Var.a.f(fn5Var.b);
                                } catch (RuntimeException e3) {
                                    lb4.b("MediaSourceList", "Failed to release child source.", e3);
                                }
                                fn5Var.a.d(fn5Var.c);
                                fn5Var.a.a(fn5Var.c);
                            }
                            in5Var.f.clear();
                            in5Var.g.clear();
                            in5Var.j = false;
                            return;
                        }
                        return;
                    }
                    j = -9223372036854775807L;
                }
                ov5Var = ov5Var2;
                j2 = j4;
                j3 = j;
                z6 = false;
                this.f0.i();
                this.p0 = false;
                jn5 jn5Var32 = this.j0;
                kd3 kd3Var22 = jn5Var32.a;
                int i32 = jn5Var32.e;
                if (!z4) {
                }
                tk5 tk5Var22 = tk5Var;
                if (z6) {
                }
                hx5 hx5Var22 = hx5Var;
                if (z6) {
                }
                xy5 xy5Var22 = xy5Var;
                if (z6) {
                }
                this.j0 = new jn5(kd3Var22, ov5Var, j3, j2, i32, tk5Var22, false, hx5Var22, xy5Var22, list, ov5Var, jn5Var32.l, jn5Var32.m, jn5Var32.n, j2, 0L, j2, false);
                if (z3) {
                }
            }
        }
        j = this.j0.c;
        if (z2) {
        }
        ov5Var = ov5Var2;
        j2 = j4;
        j3 = j;
        z6 = false;
        this.f0.i();
        this.p0 = false;
        jn5 jn5Var322 = this.j0;
        kd3 kd3Var222 = jn5Var322.a;
        int i322 = jn5Var322.e;
        if (!z4) {
        }
        tk5 tk5Var222 = tk5Var;
        if (z6) {
        }
        hx5 hx5Var222 = hx5Var;
        if (z6) {
        }
        xy5 xy5Var222 = xy5Var;
        if (z6) {
        }
        this.j0 = new jn5(kd3Var222, ov5Var, j3, j2, i322, tk5Var222, false, hx5Var222, xy5Var222, list, ov5Var, jn5Var322.l, jn5Var322.m, jn5Var322.n, j2, 0L, j2, false);
        if (z3) {
        }
    }

    public final void m() {
        um5 um5Var = this.f0.h;
        boolean z = false;
        if (um5Var != null && um5Var.f.g && this.m0) {
            z = true;
        }
        this.n0 = z;
    }

    public final void n(long j) {
        long j2;
        qy5[] qy5VarArr;
        um5 um5Var = this.f0.h;
        if (um5Var == null) {
            j2 = 1000000000000L;
        } else {
            j2 = um5Var.o;
        }
        long j3 = j + j2;
        this.x0 = j3;
        this.c0.P.c(j3);
        mk5[] mk5VarArr = this.P;
        int length = mk5VarArr.length;
        for (int i = 0; i < 2; i++) {
            mk5 mk5Var = mk5VarArr[i];
            if (A(mk5Var)) {
                long j4 = this.x0;
                mk5Var.Z = false;
                mk5Var.Y = j4;
                mk5Var.t(j4, false);
            }
        }
        for (um5 um5Var2 = this.f0.h; um5Var2 != null; um5Var2 = um5Var2.l) {
            for (qy5 qy5Var : um5Var2.n.c) {
            }
        }
    }

    public final void o(kd3 kd3Var, kd3 kd3Var2) {
        if (kd3Var.o() && kd3Var2.o()) {
            return;
        }
        int size = this.d0.size() - 1;
        if (size < 0) {
            Collections.sort(this.d0);
            return;
        }
        ((fm5) this.d0.get(size)).getClass();
        int i = zn4.a;
        throw null;
    }

    public final void p(long j, long j2) {
        ((dl4) this.W).a.sendEmptyMessageAtTime(2, j + j2);
    }

    public final void q(boolean z) {
        ov5 ov5Var = this.f0.h.f.a;
        long G = G(ov5Var, this.j0.r, true, false);
        if (G != this.j0.r) {
            jn5 jn5Var = this.j0;
            this.j0 = J(ov5Var, G, jn5Var.c, jn5Var.d, z, 5);
        }
    }

    public final void r(int i, int i2, boolean z, boolean z2) {
        qy5[] qy5VarArr;
        this.k0.a(z2 ? 1 : 0);
        gm5 gm5Var = this.k0;
        gm5Var.a = true;
        gm5Var.f = true;
        gm5Var.g = i2;
        this.j0 = this.j0.c(i, z);
        this.o0 = false;
        for (um5 um5Var = this.f0.h; um5Var != null; um5Var = um5Var.l) {
            for (qy5 qy5Var : um5Var.n.c) {
            }
        }
        if (!C()) {
            v();
            x();
            return;
        }
        int i3 = this.j0.e;
        if (i3 == 3) {
            t();
            ((dl4) this.W).c(2);
        } else if (i3 == 2) {
            ((dl4) this.W).c(2);
        }
    }

    public final void s(int i) {
        jn5 jn5Var = this.j0;
        if (jn5Var.e != i) {
            if (i != 2) {
                this.B0 = -9223372036854775807L;
            }
            this.j0 = jn5Var.e(i);
        }
    }

    public final void t() {
        boolean z;
        this.o0 = false;
        sk5 sk5Var = this.c0;
        sk5Var.U = true;
        sk5Var.P.e();
        mk5[] mk5VarArr = this.P;
        int length = mk5VarArr.length;
        for (int i = 0; i < 2; i++) {
            mk5 mk5Var = mk5VarArr[i];
            if (A(mk5Var)) {
                if (mk5Var.U == 1) {
                    z = true;
                } else {
                    z = false;
                }
                tv2.I(z);
                mk5Var.U = 2;
                mk5Var.v();
            }
        }
    }

    public final void u(boolean z, boolean z2) {
        l(z || !this.s0, false, true, false);
        this.k0.a(z2 ? 1 : 0);
        this.U.i();
        s(1);
    }

    public final void v() {
        int i;
        boolean z;
        sk5 sk5Var = this.c0;
        sk5Var.U = false;
        do5 do5Var = sk5Var.P;
        if (do5Var.P) {
            do5Var.c(do5Var.a());
            do5Var.P = false;
        }
        mk5[] mk5VarArr = this.P;
        int length = mk5VarArr.length;
        for (int i2 = 0; i2 < 2; i2++) {
            mk5 mk5Var = mk5VarArr[i2];
            if (A(mk5Var) && (i = mk5Var.U) == 2) {
                if (i == 2) {
                    z = true;
                } else {
                    z = false;
                }
                tv2.I(z);
                mk5Var.U = 1;
                mk5Var.w();
            }
        }
    }

    public final void w() {
        boolean z;
        um5 um5Var = this.f0.j;
        if (!this.p0 && (um5Var == null || !um5Var.a.m())) {
            z = false;
        } else {
            z = true;
        }
        jn5 jn5Var = this.j0;
        if (z != jn5Var.g) {
            this.j0 = new jn5(jn5Var.a, jn5Var.b, jn5Var.c, jn5Var.d, jn5Var.e, jn5Var.f, z, jn5Var.h, jn5Var.i, jn5Var.j, jn5Var.k, jn5Var.l, jn5Var.m, jn5Var.n, jn5Var.p, jn5Var.q, jn5Var.r, jn5Var.o);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
        if (r5 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0135, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0136, code lost:
        if (r8 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0138, code lost:
        if (r0 < 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013a, code lost:
        if (r0 != 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013e, code lost:
        if (r3 >= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0140, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0142, code lost:
        if (r5 <= 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0144, code lost:
        r8 = (defpackage.fm5) r7.d0.get(r5 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0155, code lost:
        if (r5 >= r7.d0.size()) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0157, code lost:
        r0 = (defpackage.fm5) r7.d0.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015f, code lost:
        r7.y0 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0142 -> B:61:0x0135). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0144 -> B:62:0x0136). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x() {
        long j;
        char c;
        boolean z;
        long a;
        im5 im5Var;
        im5 im5Var2;
        long max;
        long max2;
        im5 im5Var3;
        float f;
        float f2;
        im5 im5Var4;
        long max3;
        um5 um5Var = this.f0.h;
        if (um5Var == null) {
            return;
        }
        if (um5Var.d) {
            j = um5Var.a.i();
        } else {
            j = -9223372036854775807L;
        }
        long j2 = 0;
        if (j != -9223372036854775807L) {
            n(j);
            if (j != this.j0.r) {
                jn5 jn5Var = this.j0;
                c = 0;
                this.j0 = J(jn5Var.b, j, jn5Var.c, j, true, 5);
            } else {
                c = 0;
            }
            im5Var = this;
            im5Var2 = im5Var;
        } else {
            c = 0;
            sk5 sk5Var = this.c0;
            if (um5Var != this.f0.i) {
                z = true;
            } else {
                z = false;
            }
            mk5 mk5Var = sk5Var.R;
            if (mk5Var != null && !mk5Var.j() && (sk5Var.R.k() || (!z && !sk5Var.R.g()))) {
                tm5 tm5Var = sk5Var.S;
                tm5Var.getClass();
                long a2 = tm5Var.a();
                if (sk5Var.T) {
                    if (a2 < sk5Var.P.a()) {
                        do5 do5Var = sk5Var.P;
                        if (do5Var.P) {
                            do5Var.c(do5Var.a());
                            do5Var.P = false;
                        }
                    } else {
                        sk5Var.T = false;
                        if (sk5Var.U) {
                            sk5Var.P.e();
                        }
                    }
                }
                sk5Var.P.c(a2);
                y13 d = tm5Var.d();
                if (!d.equals(sk5Var.P.S)) {
                    sk5Var.P.b(d);
                    ((dl4) ((im5) sk5Var.Q).W).a(16, d).a();
                }
            } else {
                sk5Var.T = true;
                if (sk5Var.U) {
                    sk5Var.P.e();
                }
            }
            if (sk5Var.T) {
                a = sk5Var.P.a();
            } else {
                tm5 tm5Var2 = sk5Var.S;
                tm5Var2.getClass();
                a = tm5Var2.a();
            }
            this.x0 = a;
            long j3 = a - um5Var.o;
            long j4 = this.j0.r;
            if (!this.d0.isEmpty() && !this.j0.b.a()) {
                if (this.z0) {
                    j4--;
                    this.z0 = false;
                }
                jn5 jn5Var2 = this.j0;
                int a3 = jn5Var2.a.a(jn5Var2.b.a);
                int min = Math.min(this.y0, this.d0.size());
                im5Var = this;
                im5Var2 = im5Var;
            } else {
                im5Var = this;
                im5Var2 = im5Var;
            }
            im5Var2.j0.r = j3;
        }
        im5Var2.j0.p = im5Var2.f0.j.b();
        jn5 jn5Var3 = im5Var2.j0;
        long j5 = im5Var.j0.p;
        um5 um5Var2 = im5Var.f0.j;
        if (um5Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j5 - (im5Var.x0 - um5Var2.o));
        }
        jn5Var3.q = max;
        jn5 jn5Var4 = im5Var2.j0;
        if (jn5Var4.l && jn5Var4.e == 3 && im5Var2.D(jn5Var4.a, jn5Var4.b)) {
            jn5 jn5Var5 = im5Var2.j0;
            if (jn5Var5.n.a == 1.0f) {
                pk5 pk5Var = im5Var2.D0;
                long F = im5Var2.F(jn5Var5.a, jn5Var5.b.a, jn5Var5.r);
                long j6 = im5Var.j0.p;
                um5 um5Var3 = im5Var.f0.j;
                if (um5Var3 == null) {
                    max2 = 0;
                } else {
                    max2 = Math.max(0L, j6 - (im5Var.x0 - um5Var3.o));
                }
                if (pk5Var.c != -9223372036854775807L) {
                    long j7 = F - max2;
                    long j8 = pk5Var.m;
                    if (j8 == -9223372036854775807L) {
                        pk5Var.m = j7;
                    } else {
                        float f3 = (float) j8;
                        long max4 = Math.max(j7, (((float) j7) * 9.999871E-4f) + (f3 * 0.999f));
                        pk5Var.m = max4;
                        j2 = (((float) Math.abs(j7 - max4)) * 9.999871E-4f) + (((float) pk5Var.n) * 0.999f);
                    }
                    pk5Var.n = j2;
                    if (pk5Var.l != -9223372036854775807L && SystemClock.elapsedRealtime() - pk5Var.l < 1000) {
                        f2 = pk5Var.k;
                        im5Var4 = im5Var2;
                        if (im5Var4.c0.d().a == f2) {
                            y13 y13Var = new y13(f2, im5Var4.j0.n.b);
                            ((dl4) im5Var4.W).a.removeMessages(16);
                            im5Var4.c0.b(y13Var);
                            im5Var4.i(im5Var4.j0.n, im5Var4.c0.d().a, false, false);
                            return;
                        }
                        return;
                    }
                    pk5Var.l = SystemClock.elapsedRealtime();
                    long j9 = (pk5Var.n * 3) + pk5Var.m;
                    if (pk5Var.h > j9) {
                        long q = zn4.q(1000L);
                        long[] jArr = new long[3];
                        jArr[c] = j9;
                        im5Var3 = im5Var2;
                        jArr[1] = pk5Var.e;
                        float f4 = (float) q;
                        jArr[2] = pk5Var.h - (((pk5Var.k - 1.0f) * f4) + ((pk5Var.i - 1.0f) * f4));
                        max3 = j9;
                        for (int i = 1; i < 3; i++) {
                            long j10 = jArr[i];
                            if (j10 > max3) {
                                max3 = j10;
                            }
                        }
                        pk5Var.h = max3;
                    } else {
                        im5Var3 = im5Var2;
                        max3 = Math.max(pk5Var.h, Math.min(F - (Math.max(0.0f, pk5Var.k - 1.0f) / 1.0E-7f), j9));
                        pk5Var.h = max3;
                        long j11 = pk5Var.g;
                        if (j11 != -9223372036854775807L && max3 > j11) {
                            pk5Var.h = j11;
                            max3 = j11;
                        }
                    }
                    long j12 = F - max3;
                    if (Math.abs(j12) < pk5Var.a) {
                        f = 1.0f;
                    } else {
                        f = Math.max(pk5Var.j, Math.min((((float) j12) * 1.0E-7f) + 1.0f, pk5Var.i));
                    }
                    pk5Var.k = f;
                } else {
                    im5Var3 = im5Var2;
                    f = 1.0f;
                }
                f2 = f;
                im5Var4 = im5Var3;
                if (im5Var4.c0.d().a == f2) {
                }
            }
        }
    }

    public final void y(kd3 kd3Var, ov5 ov5Var, kd3 kd3Var2, ov5 ov5Var2, long j) {
        Object obj;
        y13 y13Var;
        if (!D(kd3Var, ov5Var)) {
            if (ov5Var.a()) {
                y13Var = y13.d;
            } else {
                y13Var = this.j0.n;
            }
            if (!this.c0.d().equals(y13Var)) {
                ((dl4) this.W).a.removeMessages(16);
                this.c0.b(y13Var);
                i(this.j0.n, y13Var.a, false, false);
                return;
            }
            return;
        }
        kd3Var.e(kd3Var.n(ov5Var.a, this.a0).c, this.Z, 0L);
        pk5 pk5Var = this.D0;
        oc2 oc2Var = this.Z.i;
        int i = zn4.a;
        pk5Var.getClass();
        long j2 = oc2Var.a;
        long q = zn4.q(-9223372036854775807L);
        pk5Var.c = q;
        pk5Var.f = q;
        pk5Var.g = q;
        pk5Var.j = 0.97f;
        pk5Var.i = 1.03f;
        pk5Var.a();
        if (j != -9223372036854775807L) {
            pk5 pk5Var2 = this.D0;
            pk5Var2.d = F(kd3Var, ov5Var.a, j);
            pk5Var2.a();
            return;
        }
        Object obj2 = this.Z.a;
        if (!kd3Var2.o()) {
            obj = kd3Var2.e(kd3Var2.n(ov5Var2.a, this.a0).c, this.Z, 0L).a;
        } else {
            obj = null;
        }
        if (!zn4.b(obj, obj2)) {
            pk5 pk5Var3 = this.D0;
            pk5Var3.d = -9223372036854775807L;
            pk5Var3.a();
        }
    }

    public final boolean z() {
        long M;
        um5 um5Var = this.f0.j;
        if (um5Var == null) {
            return false;
        }
        if (!um5Var.d) {
            M = 0;
        } else {
            M = um5Var.a.M();
        }
        if (M == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }
}