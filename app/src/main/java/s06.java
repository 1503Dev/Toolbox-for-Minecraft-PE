package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* renamed from: s06 */
public final class s06 {
    public final e06 a = new e06();
    public final p06 b;
    public final r06 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    /* JADX WARN: Removed duplicated region for block: B:33:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s06(Context context) {
        y54 y54Var;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = zn4.a;
            DisplayManager displayManager = (DisplayManager) applicationContext.getSystemService("display");
            if (displayManager != null) {
                y54Var = new q06(displayManager);
            } else {
                y54Var = null;
            }
            if (y54Var == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    y54Var = new y54(windowManager);
                }
            }
            this.b = y54Var;
            this.c = y54Var != null ? r06.T : null;
            this.k = -9223372036854775807L;
            this.l = -9223372036854775807L;
            this.f = -1.0f;
            this.i = 1.0f;
            this.j = 0;
        }
        y54Var = null;
        this.b = y54Var;
        this.c = y54Var != null ? r06.T : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static /* synthetic */ void b(s06 s06Var, Display display) {
        long j;
        if (display != null) {
            double refreshRate = display.getRefreshRate();
            Double.isNaN(refreshRate);
            long j2 = (long) (1.0E9d / refreshRate);
            s06Var.k = j2;
            j = (j2 * 80) / 100;
        } else {
            lb4.c("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
            s06Var.k = -9223372036854775807L;
        }
        s06Var.l = j;
    }

    public final long a(long j) {
        long j2;
        r06 r06Var;
        long j3;
        long j4;
        if (this.p != -1 && this.a.a.c()) {
            e06 e06Var = this.a;
            if (e06Var.a.c()) {
                wz5 wz5Var = e06Var.a;
                long j5 = wz5Var.e;
                if (j5 == 0) {
                    j4 = 0;
                } else {
                    j4 = wz5Var.f / j5;
                }
            } else {
                j4 = -9223372036854775807L;
            }
            j2 = this.q + (((float) ((this.m - this.p) * j4)) / this.i);
            if (Math.abs(j - j2) > 20000000) {
                this.m = 0L;
                this.p = -1L;
                this.n = -1L;
            }
            this.n = this.m;
            this.o = j2;
            r06Var = this.c;
            if (r06Var == null && this.k != -9223372036854775807L) {
                long j6 = r06Var.P;
                if (j6 == -9223372036854775807L) {
                    return j2;
                }
                long j7 = this.k;
                long j8 = (((j2 - j6) / j7) * j7) + j6;
                if (j2 <= j8) {
                    j3 = j8 - j7;
                } else {
                    j3 = j8;
                    j8 = j7 + j8;
                }
                long j9 = this.l;
                if (j8 - j2 >= j2 - j3) {
                    j8 = j3;
                }
                return j8 - j9;
            }
            return j2;
        }
        j2 = j;
        this.n = this.m;
        this.o = j2;
        r06Var = this.c;
        if (r06Var == null) {
        }
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0051, code lost:
        if (r1 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j) {
        boolean z;
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.q = this.o;
        }
        this.m++;
        e06 e06Var = this.a;
        long j3 = j * 1000;
        e06Var.a.a(j3);
        int i = 0;
        if (e06Var.a.c()) {
            e06Var.c = false;
        } else if (e06Var.d != -9223372036854775807L) {
            if (e06Var.c) {
                wz5 wz5Var = e06Var.b;
                long j4 = wz5Var.d;
                if (j4 == 0) {
                    z = false;
                } else {
                    z = wz5Var.g[(int) ((j4 - 1) % 15)];
                }
            }
            e06Var.b.b();
            e06Var.b.a(e06Var.d);
            e06Var.c = true;
            e06Var.b.a(j3);
        }
        if (e06Var.c && e06Var.b.c()) {
            wz5 wz5Var2 = e06Var.a;
            e06Var.a = e06Var.b;
            e06Var.b = wz5Var2;
            e06Var.c = false;
        }
        e06Var.d = j3;
        if (!e06Var.a.c()) {
            i = e06Var.e + 1;
        }
        e06Var.e = i;
        e();
    }

    public final void d() {
        Surface surface;
        if (zn4.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        o06.a(surface, 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x008e, code lost:
        if (java.lang.Math.abs(r0 - r10.g) >= r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0099, code lost:
        if (r10.a.e >= 30) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x009c, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x009d, code lost:
        if (r4 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00a0, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        float f;
        long j;
        if (zn4.a >= 30 && this.e != null) {
            if (this.a.a.c()) {
                e06 e06Var = this.a;
                if (e06Var.a.c()) {
                    wz5 wz5Var = e06Var.a;
                    long j2 = wz5Var.e;
                    long j3 = 0;
                    if (j2 != 0) {
                        j3 = wz5Var.f / j2;
                    }
                    double d = j3;
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    f = (float) (1.0E9d / d);
                } else {
                    f = -1.0f;
                }
            } else {
                f = this.f;
            }
            float f2 = this.g;
            if (f == f2) {
                return;
            }
            boolean z = true;
            if (f != -1.0f && f2 != -1.0f) {
                float f3 = 1.0f;
                if (this.a.a.c()) {
                    e06 e06Var2 = this.a;
                    if (e06Var2.a.c()) {
                        j = e06Var2.a.f;
                    } else {
                        j = -9223372036854775807L;
                    }
                    if (j >= 5000000000L) {
                        f3 = 0.02f;
                    }
                }
            } else if (f == -1.0f) {
            }
            this.g = f;
            f(false);
        }
    }

    public final void f(boolean z) {
        Surface surface;
        if (zn4.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = this.i * f2;
            }
        }
        if (z || this.h != f) {
            this.h = f;
            o06.a(surface, f);
        }
    }
}