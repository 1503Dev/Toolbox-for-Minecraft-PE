package defpackage;

/* renamed from: qk5  reason: default package */
public final class qk5 implements sm5 {
    public final jz5 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public int g;
    public boolean h;

    public qk5() {
        jz5 jz5Var = new jz5();
        j(2500, "bufferForPlaybackMs", 0, "0");
        j(5000, "bufferForPlaybackAfterRebufferMs", 0, "0");
        j(50000, "minBufferMs", 2500, "bufferForPlaybackMs");
        j(50000, "minBufferMs", 5000, "bufferForPlaybackAfterRebufferMs");
        j(50000, "maxBufferMs", 50000, "minBufferMs");
        j(0, "backBufferDurationMs", 0, "0");
        this.a = jz5Var;
        long q = zn4.q(50000L);
        this.b = q;
        this.c = q;
        this.d = zn4.q(2500L);
        this.e = zn4.q(5000L);
        this.g = 13107200;
        this.f = zn4.q(0L);
    }

    public static void j(int i, String str, int i2, String str2) {
        boolean z;
        String c = ij.c(str, " cannot be less than ", str2);
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        tv2.H(c, z);
    }

    @Override // defpackage.sm5
    public final long a() {
        return this.f;
    }

    @Override // defpackage.sm5
    public final void b(mk5[] mk5VarArr, qy5[] qy5VarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = mk5VarArr.length;
            int i3 = 13107200;
            if (i < 2) {
                if (qy5VarArr[i] != null) {
                    if (mk5VarArr[i].P != 1) {
                        i3 = 131072000;
                    }
                    i2 += i3;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.g = max;
                this.a.a(max);
                return;
            }
        }
    }

    @Override // defpackage.sm5
    public final void c() {
        this.g = 13107200;
        this.h = false;
    }

    @Override // defpackage.sm5
    public final void d() {
        this.g = 13107200;
        this.h = false;
        jz5 jz5Var = this.a;
        synchronized (jz5Var) {
            jz5Var.a(0);
        }
    }

    @Override // defpackage.sm5
    public final void e() {
    }

    @Override // defpackage.sm5
    public final boolean f(long j, float f, boolean z, long j2) {
        long j3;
        int i;
        long p = zn4.p(j, f);
        if (z) {
            j3 = this.e;
        } else {
            j3 = this.d;
        }
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        if (j3 > 0 && p < j3) {
            jz5 jz5Var = this.a;
            synchronized (jz5Var) {
                i = jz5Var.b * 65536;
            }
            if (i < this.g) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.sm5
    public final jz5 g() {
        return this.a;
    }

    @Override // defpackage.sm5
    public final boolean h(long j, float f) {
        int i;
        jz5 jz5Var = this.a;
        synchronized (jz5Var) {
            i = jz5Var.b * 65536;
        }
        int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        int i3 = this.g;
        long j2 = this.b;
        if (i2 > 0) {
            j2 = Math.min(zn4.o(j2, f), this.c);
        }
        boolean z = false;
        if (j < Math.max(j2, 500000L)) {
            if (i < i3) {
                z = true;
            }
            this.h = z;
            if (!z && j < 500000) {
                lb4.c("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.c || i >= i3) {
            this.h = false;
        }
        return this.h;
    }

    @Override // defpackage.sm5
    public final void i() {
        this.g = 13107200;
        this.h = false;
        jz5 jz5Var = this.a;
        synchronized (jz5Var) {
            jz5Var.a(0);
        }
    }
}