package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: i06  reason: default package */
public final class i06 {
    public final s06 a;
    public final j06 b;
    public Handler e;
    public CopyOnWriteArrayList f;
    public Pair g;
    public Pair h;
    public boolean k;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public int i = -1;
    public boolean j = true;
    public final wo3 l = wo3.e;
    public long m = -9223372036854775807L;

    public i06(s06 s06Var, j06 j06Var) {
        this.a = s06Var;
        this.b = j06Var;
    }

    public final void a() {
        tv2.B(null);
        throw null;
    }

    public final void b(long j, long j2) {
        boolean z;
        boolean z2;
        tv2.B(null);
        while (!this.c.isEmpty()) {
            if (this.b.U == 2) {
                z = true;
            } else {
                z = false;
            }
            Long l = (Long) this.c.peek();
            l.getClass();
            long longValue = l.longValue();
            j06 j06Var = this.b;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            double d = j06Var.o0;
            double d2 = longValue - j;
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            long j3 = (long) (d2 / d);
            if (z) {
                j3 -= elapsedRealtime - j2;
            }
            if (this.b.u0(j, j3)) {
                h(-1L);
                return;
            } else if (z && j != this.b.A1 && j3 <= 50000) {
                this.a.c(longValue);
                long a = this.a.a(System.nanoTime() + (j3 * 1000));
                if ((a - System.nanoTime()) / 1000 < -30000) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    a = -2;
                } else {
                    if (!this.d.isEmpty() && longValue > ((Long) ((Pair) this.d.peek()).first).longValue()) {
                        this.g = (Pair) this.d.remove();
                    }
                    j06 j06Var2 = this.b;
                    long j4 = j06Var2.f1.b;
                    cu1 cu1Var = (cu1) this.g.second;
                    if (this.m >= longValue) {
                        this.m = -9223372036854775807L;
                        j06Var2.s0(this.l);
                    }
                }
                h(a);
            } else {
                return;
            }
        }
    }

    public final void c() {
        throw null;
    }

    public final void d(cu1 cu1Var) {
        throw null;
    }

    public final void e(Surface surface, ai4 ai4Var) {
        Pair pair = this.h;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((ai4) this.h.second).equals(ai4Var)) {
            return;
        }
        this.h = Pair.create(surface, ai4Var);
        if (f()) {
            throw null;
        }
    }

    public final boolean f() {
        return false;
    }

    public final boolean g(cu1 cu1Var, long j, boolean z) {
        tv2.B(null);
        tv2.I(this.i != -1);
        tv2.I(!this.k);
        throw null;
    }

    public final void h(long j) {
        tv2.B(null);
        throw null;
    }
}