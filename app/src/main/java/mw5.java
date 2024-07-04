package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: mw5  reason: default package */
public final class mw5 implements nv5, nk1, mz5, pz5, uw5 {
    public static final Map y0;
    public static final cu1 z0;
    public final Uri P;
    public final fv4 Q;
    public final ns5 R;
    public final sv5 S;
    public final pw5 T;
    public final long U;
    public final aw5 W;
    public mv5 b0;
    public rn1 c0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public lw5 i0;
    public ml1 j0;
    public boolean l0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public boolean q0;
    public long r0;
    public boolean t0;
    public int u0;
    public boolean v0;
    public boolean w0;
    public final jz5 x0;
    public final rz5 V = new rz5();
    public final sy3 X = new sy3();
    public final c32 Y = new c32(3, this);
    public final gw5 Z = new Runnable() { // from class: gw5
        @Override // java.lang.Runnable
        public final void run() {
            mw5 mw5Var = mw5.this;
            if (!mw5Var.w0) {
                mv5 mv5Var = mw5Var.b0;
                mv5Var.getClass();
                mv5Var.e(mw5Var);
            }
        }
    };
    public final Handler a0 = zn4.u();
    public kw5[] e0 = new kw5[0];
    public vw5[] d0 = new vw5[0];
    public long s0 = -9223372036854775807L;
    public long k0 = -9223372036854775807L;
    public int m0 = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        y0 = Collections.unmodifiableMap(hashMap);
        bs1 bs1Var = new bs1();
        bs1Var.a = "icy";
        bs1Var.j = "application/x-icy";
        z0 = new cu1(bs1Var);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [gw5] */
    public mw5(Uri uri, fv4 fv4Var, ou5 ou5Var, ns5 ns5Var, js5 js5Var, sv5 sv5Var, pw5 pw5Var, jz5 jz5Var, int i) {
        this.P = uri;
        this.Q = fv4Var;
        this.R = ns5Var;
        this.S = sv5Var;
        this.T = pw5Var;
        this.x0 = jz5Var;
        this.U = i;
        this.W = ou5Var;
    }

    public final boolean A() {
        return this.o0 || z();
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final long M() {
        return d();
    }

    public final void a(iw5 iw5Var, long j, long j2, boolean z) {
        fe5 fe5Var = iw5Var.b;
        Uri uri = fe5Var.c;
        xu5 xu5Var = new xu5(fe5Var.d);
        sv5 sv5Var = this.S;
        long j3 = iw5Var.i;
        long j4 = this.k0;
        sv5Var.getClass();
        sv5Var.b(xu5Var, new lv5(-1, null, sv5.f(j3), sv5.f(j4)));
        if (!z) {
            for (vw5 vw5Var : this.d0) {
                vw5Var.j(false);
            }
            if (this.p0 > 0) {
                mv5 mv5Var = this.b0;
                mv5Var.getClass();
                mv5Var.e(this);
            }
        }
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final void b(long j) {
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final boolean c(long j) {
        boolean z;
        boolean z2 = false;
        if (!this.v0) {
            if (this.V.c != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !this.t0 && (!this.g0 || this.p0 != 0)) {
                boolean b = this.X.b();
                if (this.V.b != null) {
                    z2 = true;
                }
                if (!z2) {
                    y();
                    return true;
                }
                return b;
            }
        }
        return false;
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final long d() {
        long j;
        boolean z;
        long j2;
        u();
        if (this.v0 || this.p0 == 0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.s0;
        }
        if (this.h0) {
            int length = this.d0.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                lw5 lw5Var = this.i0;
                if (lw5Var.b[i] && lw5Var.c[i]) {
                    vw5 vw5Var = this.d0[i];
                    synchronized (vw5Var) {
                        z = vw5Var.u;
                    }
                    if (z) {
                        continue;
                    } else {
                        vw5 vw5Var2 = this.d0[i];
                        synchronized (vw5Var2) {
                            j2 = vw5Var2.t;
                        }
                        j = Math.min(j, j2);
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == RecyclerView.FOREVER_NS) {
            j = s(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.r0;
        }
        return j;
    }

    public final void e(iw5 iw5Var, long j, long j2) {
        ml1 ml1Var;
        long j3;
        if (this.k0 == -9223372036854775807L && (ml1Var = this.j0) != null) {
            boolean f = ml1Var.f();
            long s = s(true);
            if (s == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = s + 10000;
            }
            this.k0 = j3;
            this.T.p(j3, f, this.l0);
        }
        fe5 fe5Var = iw5Var.b;
        Uri uri = fe5Var.c;
        xu5 xu5Var = new xu5(fe5Var.d);
        sv5 sv5Var = this.S;
        long j4 = iw5Var.i;
        long j5 = this.k0;
        sv5Var.getClass();
        sv5Var.c(xu5Var, new lv5(-1, null, sv5.f(j4), sv5.f(j5)));
        this.v0 = true;
        mv5 mv5Var = this.b0;
        mv5Var.getClass();
        mv5Var.e(this);
    }

    @Override // defpackage.nv5
    public final hx5 f() {
        u();
        return this.i0.a;
    }

    @Override // defpackage.nv5
    public final long g(long j) {
        u();
        boolean[] zArr = this.i0.b;
        boolean z = true;
        if (true != this.j0.f()) {
            j = 0;
        }
        this.o0 = false;
        this.r0 = j;
        if (z()) {
            this.s0 = j;
            return j;
        }
        if (this.m0 != 7) {
            int length = this.d0.length;
            for (int i = 0; i < length; i++) {
                if (this.d0[i].l(j, false) || (!zArr[i] && this.h0)) {
                }
            }
            return j;
        }
        this.t0 = false;
        this.s0 = j;
        this.v0 = false;
        rz5 rz5Var = this.V;
        if (rz5Var.b == null) {
            z = false;
        }
        if (z) {
            for (vw5 vw5Var : this.d0) {
                vw5Var.i();
            }
            oz5 oz5Var = this.V.b;
            tv2.B(oz5Var);
            oz5Var.b(false);
        } else {
            rz5Var.c = null;
            for (vw5 vw5Var2 : this.d0) {
                vw5Var2.j(false);
            }
        }
        return j;
    }

    @Override // defpackage.nv5
    public final void h(long j) {
        long j2;
        int i;
        int i2;
        u();
        if (z()) {
            return;
        }
        boolean[] zArr = this.i0.c;
        int length = this.d0.length;
        for (int i3 = 0; i3 < length; i3++) {
            vw5 vw5Var = this.d0[i3];
            boolean z = zArr[i3];
            rw5 rw5Var = vw5Var.a;
            synchronized (vw5Var) {
                int i4 = vw5Var.n;
                j2 = -1;
                if (i4 != 0) {
                    long[] jArr = vw5Var.l;
                    int i5 = vw5Var.p;
                    if (j >= jArr[i5]) {
                        if (z && (i2 = vw5Var.q) != i4) {
                            i = i2 + 1;
                        } else {
                            i = i4;
                        }
                        int m = vw5Var.m(i5, i, j, false);
                        if (m != -1) {
                            j2 = vw5Var.h(m);
                        }
                    }
                }
            }
            rw5Var.a(j2);
        }
    }

    @Override // defpackage.nv5
    public final long i() {
        if (this.o0) {
            if (this.v0 || r() > this.u0) {
                this.o0 = false;
                return this.r0;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.nk1
    public final void j() {
        this.f0 = true;
        this.a0.post(this.Y);
    }

    @Override // defpackage.nv5
    public final long k(long j, ao5 ao5Var) {
        u();
        if (this.j0.f()) {
            kl1 g = this.j0.g(j);
            long j2 = g.a.a;
            long j3 = g.b.a;
            long j4 = ao5Var.a;
            if (j4 == 0) {
                if (ao5Var.b == 0) {
                    return j;
                }
                j4 = 0;
            }
            int i = zn4.a;
            long j5 = j - j4;
            long j6 = ao5Var.b;
            long j7 = j + j6;
            long j8 = j ^ j7;
            long j9 = j6 ^ j7;
            if (((j4 ^ j) & (j ^ j5)) < 0) {
                j5 = Long.MIN_VALUE;
            }
            if ((j8 & j9) < 0) {
                j7 = RecyclerView.FOREVER_NS;
            }
            boolean z = false;
            boolean z2 = j5 <= j2 && j2 <= j7;
            if (j5 <= j3 && j3 <= j7) {
                z = true;
            }
            if (z2 && z) {
                if (Math.abs(j2 - j) > Math.abs(j3 - j)) {
                    return j3;
                }
            } else if (!z2) {
                return z ? j3 : j5;
            }
            return j2;
        }
        return 0L;
    }

    @Override // defpackage.nv5
    public final void l() {
        int i;
        IOException iOException;
        rz5 rz5Var = this.V;
        if (this.m0 == 7) {
            i = 6;
        } else {
            i = 3;
        }
        IOException iOException2 = rz5Var.c;
        if (iOException2 == null) {
            oz5 oz5Var = rz5Var.b;
            if (oz5Var != null && (iOException = oz5Var.S) != null && oz5Var.T > i) {
                throw iOException;
            }
            if (this.v0 && !this.g0) {
                throw jy2.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException2;
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final boolean m() {
        boolean z;
        boolean z2;
        if (this.V.b != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sy3 sy3Var = this.X;
            synchronized (sy3Var) {
                z2 = sy3Var.a;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nk1
    public final void n(final ml1 ml1Var) {
        this.a0.post(new Runnable() { // from class: hw5
            @Override // java.lang.Runnable
            public final void run() {
                ml1 ll1Var;
                mw5 mw5Var = mw5.this;
                ml1 ml1Var2 = ml1Var;
                if (mw5Var.c0 == null) {
                    ll1Var = ml1Var2;
                } else {
                    ll1Var = new ll1(-9223372036854775807L, 0L);
                }
                mw5Var.j0 = ll1Var;
                mw5Var.k0 = ml1Var2.b();
                boolean z = false;
                int i = 1;
                if (!mw5Var.q0 && ml1Var2.b() == -9223372036854775807L) {
                    z = true;
                }
                mw5Var.l0 = z;
                if (true == z) {
                    i = 7;
                }
                mw5Var.m0 = i;
                mw5Var.T.p(mw5Var.k0, ml1Var2.f(), mw5Var.l0);
                if (!mw5Var.g0) {
                    mw5Var.v();
                }
            }
        });
    }

    @Override // defpackage.nv5
    public final void o(mv5 mv5Var, long j) {
        this.b0 = mv5Var;
        this.X.b();
        y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r2 == 0) goto L83;
     */
    @Override // defpackage.nv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long p(qy5[] qy5VarArr, boolean[] zArr, ww5[] ww5VarArr, boolean[] zArr2, long j) {
        boolean z;
        boolean z2;
        qy5 qy5Var;
        boolean z3;
        boolean z4;
        u();
        lw5 lw5Var = this.i0;
        hx5 hx5Var = lw5Var.a;
        boolean[] zArr3 = lw5Var.c;
        int i = this.p0;
        for (int i2 = 0; i2 < qy5VarArr.length; i2++) {
            ww5 ww5Var = ww5VarArr[i2];
            if (ww5Var != null && (qy5VarArr[i2] == null || !zArr[i2])) {
                int i3 = ((jw5) ww5Var).a;
                tv2.I(zArr3[i3]);
                this.p0--;
                zArr3[i3] = false;
                ww5VarArr[i2] = null;
            }
        }
        if (!this.n0) {
            if (j == 0) {
                j = 0;
                z = false;
            }
            z = true;
        }
        for (int i4 = 0; i4 < qy5VarArr.length; i4++) {
            if (ww5VarArr[i4] == null && (qy5Var = qy5VarArr[i4]) != null) {
                if (qy5Var.d() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                tv2.I(z3);
                if (qy5Var.a() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                tv2.I(z4);
                int indexOf = hx5Var.b.indexOf(qy5Var.b());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                tv2.I(!zArr3[indexOf]);
                this.p0++;
                zArr3[indexOf] = true;
                ww5VarArr[i4] = new jw5(this, indexOf);
                zArr2[i4] = true;
                if (!z) {
                    vw5 vw5Var = this.d0[indexOf];
                    if (!vw5Var.l(j, true) && vw5Var.o + vw5Var.q != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        if (this.p0 == 0) {
            this.t0 = false;
            this.o0 = false;
            if (this.V.b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                for (vw5 vw5Var2 : this.d0) {
                    vw5Var2.i();
                }
                oz5 oz5Var = this.V.b;
                tv2.B(oz5Var);
                oz5Var.b(false);
            } else {
                for (vw5 vw5Var3 : this.d0) {
                    vw5Var3.j(false);
                }
            }
        } else if (z) {
            j = g(j);
            for (int i5 = 0; i5 < ww5VarArr.length; i5++) {
                if (ww5VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.n0 = true;
        return j;
    }

    @Override // defpackage.nk1
    public final pl1 q(int i, int i2) {
        return t(new kw5(i, false));
    }

    public final int r() {
        vw5[] vw5VarArr;
        int i = 0;
        for (vw5 vw5Var : this.d0) {
            i += vw5Var.o + vw5Var.n;
        }
        return i;
    }

    public final long s(boolean z) {
        long j;
        int i = 0;
        long j2 = Long.MIN_VALUE;
        while (true) {
            vw5[] vw5VarArr = this.d0;
            if (i < vw5VarArr.length) {
                if (!z) {
                    lw5 lw5Var = this.i0;
                    lw5Var.getClass();
                    if (!lw5Var.c[i]) {
                        continue;
                        i++;
                    }
                }
                vw5 vw5Var = vw5VarArr[i];
                synchronized (vw5Var) {
                    j = vw5Var.t;
                }
                j2 = Math.max(j2, j);
                i++;
            } else {
                return j2;
            }
        }
    }

    public final vw5 t(kw5 kw5Var) {
        int length = this.d0.length;
        for (int i = 0; i < length; i++) {
            if (kw5Var.equals(this.e0[i])) {
                return this.d0[i];
            }
        }
        vw5 vw5Var = new vw5(this.x0, this.R);
        vw5Var.e = this;
        int i2 = length + 1;
        kw5[] kw5VarArr = (kw5[]) Arrays.copyOf(this.e0, i2);
        kw5VarArr[length] = kw5Var;
        int i3 = zn4.a;
        this.e0 = kw5VarArr;
        vw5[] vw5VarArr = (vw5[]) Arrays.copyOf(this.d0, i2);
        vw5VarArr[length] = vw5Var;
        this.d0 = vw5VarArr;
        return vw5Var;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void u() {
        tv2.I(this.g0);
        this.i0.getClass();
        this.j0.getClass();
    }

    public final void v() {
        cu1 cu1Var;
        boolean z;
        int i;
        yt2 a;
        int i2;
        if (!this.w0 && !this.g0 && this.f0 && this.j0 != null) {
            vw5[] vw5VarArr = this.d0;
            int length = vw5VarArr.length;
            int i3 = 0;
            while (true) {
                cu1 cu1Var2 = null;
                if (i3 < length) {
                    vw5 vw5Var = vw5VarArr[i3];
                    synchronized (vw5Var) {
                        if (!vw5Var.w) {
                            cu1Var2 = vw5Var.x;
                        }
                    }
                    if (cu1Var2 == null) {
                        return;
                    }
                    i3++;
                } else {
                    sy3 sy3Var = this.X;
                    synchronized (sy3Var) {
                        sy3Var.a = false;
                    }
                    int length2 = this.d0.length;
                    qe3[] qe3VarArr = new qe3[length2];
                    boolean[] zArr = new boolean[length2];
                    for (int i4 = 0; i4 < length2; i4++) {
                        vw5 vw5Var2 = this.d0[i4];
                        synchronized (vw5Var2) {
                            if (vw5Var2.w) {
                                cu1Var = null;
                            } else {
                                cu1Var = vw5Var2.x;
                            }
                        }
                        cu1Var.getClass();
                        String str = cu1Var.k;
                        boolean e = mx2.e(str);
                        if (!e && !mx2.f(str)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        zArr[i4] = z;
                        this.h0 = z | this.h0;
                        rn1 rn1Var = this.c0;
                        if (rn1Var != null) {
                            if (e || this.e0[i4].b) {
                                yt2 yt2Var = cu1Var.i;
                                if (yt2Var == null) {
                                    a = new yt2(-9223372036854775807L, rn1Var);
                                } else {
                                    a = yt2Var.a(rn1Var);
                                }
                                bs1 bs1Var = new bs1(cu1Var);
                                bs1Var.h = a;
                                cu1Var = new cu1(bs1Var);
                            }
                            if (e && cu1Var.e == -1 && cu1Var.f == -1 && (i2 = rn1Var.P) != -1) {
                                bs1 bs1Var2 = new bs1(cu1Var);
                                bs1Var2.e = i2;
                                cu1Var = new cu1(bs1Var2);
                            }
                        }
                        ((ga1) this.R).getClass();
                        if (cu1Var.n != null) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        bs1 bs1Var3 = new bs1(cu1Var);
                        bs1Var3.C = i;
                        qe3VarArr[i4] = new qe3(Integer.toString(i4), new cu1(bs1Var3));
                    }
                    this.i0 = new lw5(new hx5(qe3VarArr), zArr);
                    this.g0 = true;
                    mv5 mv5Var = this.b0;
                    mv5Var.getClass();
                    mv5Var.a(this);
                    return;
                }
            }
        }
    }

    public final void w(int i) {
        u();
        lw5 lw5Var = this.i0;
        boolean[] zArr = lw5Var.d;
        if (!zArr[i]) {
            cu1 cu1Var = lw5Var.a.a(i).c[0];
            sv5 sv5Var = this.S;
            int a = mx2.a(cu1Var.k);
            long j = this.r0;
            sv5Var.getClass();
            sv5Var.a(new lv5(a, cu1Var, sv5.f(j), -9223372036854775807L));
            zArr[i] = true;
        }
    }

    public final void x(int i) {
        u();
        boolean[] zArr = this.i0.b;
        if (this.t0 && zArr[i] && !this.d0[i].k(false)) {
            this.s0 = 0L;
            this.t0 = false;
            this.o0 = true;
            this.r0 = 0L;
            this.u0 = 0;
            for (vw5 vw5Var : this.d0) {
                vw5Var.j(false);
            }
            mv5 mv5Var = this.b0;
            mv5Var.getClass();
            mv5Var.e(this);
        }
    }

    public final void y() {
        iw5 iw5Var = new iw5(this, this.P, this.Q, this.W, this, this.X);
        if (this.g0) {
            tv2.I(z());
            long j = this.k0;
            if (j != -9223372036854775807L && this.s0 > j) {
                this.v0 = true;
                this.s0 = -9223372036854775807L;
                return;
            }
            ml1 ml1Var = this.j0;
            ml1Var.getClass();
            long j2 = ml1Var.g(this.s0).a.b;
            long j3 = this.s0;
            iw5Var.f.a = j2;
            iw5Var.i = j3;
            iw5Var.h = true;
            iw5Var.l = false;
            for (vw5 vw5Var : this.d0) {
                vw5Var.r = this.s0;
            }
            this.s0 = -9223372036854775807L;
        }
        this.u0 = r();
        rz5 rz5Var = this.V;
        rz5Var.getClass();
        Looper myLooper = Looper.myLooper();
        tv2.B(myLooper);
        rz5Var.c = null;
        new oz5(rz5Var, myLooper, iw5Var, this, SystemClock.elapsedRealtime()).c(0L);
        kz4 kz4Var = iw5Var.j;
        sv5 sv5Var = this.S;
        Uri uri = kz4Var.a;
        xu5 xu5Var = new xu5(Collections.emptyMap());
        long j4 = iw5Var.i;
        long j5 = this.k0;
        sv5Var.getClass();
        sv5Var.e(xu5Var, new lv5(-1, null, sv5.f(j4), sv5.f(j5)));
    }

    public final boolean z() {
        return this.s0 != -9223372036854775807L;
    }
}