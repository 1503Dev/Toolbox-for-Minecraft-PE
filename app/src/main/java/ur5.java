package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: ur5  reason: default package */
public final class ur5 extends tt5 implements tm5 {
    public final Context l1;
    public final nq5 m1;
    public final tq5 n1;
    public int o1;
    public boolean p1;
    public cu1 q1;
    public long r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public on5 v1;

    public ur5(Context context, Handler handler, xl5 xl5Var, rr5 rr5Var) {
        super(1, 44100.0f);
        this.l1 = context.getApplicationContext();
        this.n1 = rr5Var;
        this.m1 = new nq5(handler, xl5Var);
        rr5Var.m = new tr5(this);
    }

    public static nv4 j0(cu1 cu1Var, tq5 tq5Var) {
        boolean z;
        pt5 pt5Var;
        String str = cu1Var.k;
        if (str == null) {
            lv4 lv4Var = nv4.Q;
            return nw4.T;
        }
        if (((rr5) tq5Var).l(cu1Var) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            List d = lu5.d("audio/raw", false, false);
            if (d.isEmpty()) {
                pt5Var = null;
            } else {
                pt5Var = (pt5) d.get(0);
            }
            if (pt5Var != null) {
                return nv4.v(pt5Var);
            }
        }
        List d2 = lu5.d(str, false, false);
        String c = lu5.c(cu1Var);
        if (c == null) {
            return nv4.t(d2);
        }
        List d3 = lu5.d(c, false, false);
        kv4 kv4Var = new kv4();
        kv4Var.q(d2);
        kv4Var.q(d3);
        return kv4Var.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0117, code lost:
        if ((r4 - r6.c) <= 500000) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0244 A[Catch: Exception -> 0x025d, TRY_LEAVE, TryCatch #0 {Exception -> 0x025d, blocks: (B:83:0x0214, B:85:0x021a, B:87:0x0233, B:89:0x0244), top: B:154:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void k0() {
        long j;
        long j2;
        rr5 rr5Var;
        boolean z;
        vq5 vq5Var;
        boolean z2;
        long o;
        long j3;
        long j4;
        rr5 rr5Var2;
        jr5 jr5Var;
        long o2;
        long j5;
        final nq5 nq5Var;
        Handler handler;
        boolean z3;
        vq5 vq5Var2;
        String str;
        String str2;
        String str3;
        Method method;
        long max;
        int i;
        tq5 tq5Var = this.n1;
        boolean j6 = j();
        rr5 rr5Var3 = (rr5) tq5Var;
        if (rr5Var3.j() && !rr5Var3.C) {
            xq5 xq5Var = rr5Var3.g;
            AudioTrack audioTrack = xq5Var.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - xq5Var.m >= 30000) {
                    long c = xq5Var.c(xq5Var.d());
                    if (c != 0) {
                        xq5Var.b[xq5Var.w] = zn4.p(c, xq5Var.j) - nanoTime;
                        xq5Var.w = (xq5Var.w + 1) % 10;
                        int i2 = xq5Var.x;
                        if (i2 < 10) {
                            xq5Var.x = i2 + 1;
                        }
                        xq5Var.m = nanoTime;
                        xq5Var.l = 0L;
                        int i3 = 0;
                        while (true) {
                            int i4 = xq5Var.x;
                            if (i3 >= i4) {
                                break;
                            }
                            xq5Var.l = (xq5Var.b[i3] / i4) + xq5Var.l;
                            i3++;
                        }
                    }
                }
                if (!xq5Var.h) {
                    vq5 vq5Var3 = xq5Var.f;
                    vq5Var3.getClass();
                    uq5 uq5Var = vq5Var3.a;
                    if (nanoTime - vq5Var3.e >= vq5Var3.d) {
                        vq5Var3.e = nanoTime;
                        boolean timestamp = uq5Var.a.getTimestamp(uq5Var.b);
                        if (timestamp) {
                            long j7 = uq5Var.b.framePosition;
                            z3 = timestamp;
                            if (uq5Var.d > j7) {
                                uq5Var.c++;
                            }
                            uq5Var.d = j7;
                            uq5Var.e = j7 + (uq5Var.c << 32);
                        } else {
                            z3 = timestamp;
                        }
                        int i5 = vq5Var3.b;
                        if (i5 != 0) {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 == 3) {
                                        if (z3) {
                                            vq5Var3.a(0);
                                        }
                                    }
                                    if (!z3) {
                                        rr5Var = rr5Var3;
                                        z = j6;
                                        str2 = "DefaultAudioSink";
                                    } else {
                                        uq5 uq5Var2 = vq5Var3.a;
                                        long j8 = uq5Var2.b.nanoTime / 1000;
                                        long j9 = uq5Var2.e;
                                        long c2 = xq5Var.c(xq5Var.d());
                                        if (Math.abs(j8 - nanoTime) > 5000000) {
                                            lr5 lr5Var = (lr5) xq5Var.a;
                                            rr5Var = rr5Var3;
                                            long a = lr5Var.a.a();
                                            vq5Var2 = vq5Var3;
                                            str = "DefaultAudioSink";
                                            long b = lr5Var.a.b();
                                            StringBuilder sb = new StringBuilder();
                                            z = j6;
                                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                                            sb.append(j9);
                                            sb.append(", ");
                                            sb.append(j8);
                                            sb.append(", ");
                                            sb.append(nanoTime);
                                            sb.append(", ");
                                            sb.append(c2);
                                            sb.append(", ");
                                            sb.append(a);
                                            sb.append(", ");
                                            sb.append(b);
                                            str3 = sb.toString();
                                        } else {
                                            rr5Var = rr5Var3;
                                            z = j6;
                                            vq5Var2 = vq5Var3;
                                            str = "DefaultAudioSink";
                                            if (Math.abs(xq5Var.c(j9) - c2) > 5000000) {
                                                lr5 lr5Var2 = (lr5) xq5Var.a;
                                                str3 = "Spurious audio timestamp (frame position mismatch): " + j9 + ", " + j8 + ", " + nanoTime + ", " + c2 + ", " + lr5Var2.a.a() + ", " + lr5Var2.a.b();
                                            } else {
                                                str2 = str;
                                                if (vq5Var2.b == 4) {
                                                    vq5Var2.a(0);
                                                }
                                            }
                                        }
                                        str2 = str;
                                        lb4.c(str2, str3);
                                        vq5Var2.a(4);
                                    }
                                    if (xq5Var.q && (method = xq5Var.n) != null && nanoTime - xq5Var.r >= 500000) {
                                        try {
                                            AudioTrack audioTrack2 = xq5Var.c;
                                            audioTrack2.getClass();
                                            int i6 = zn4.a;
                                            long intValue = ((Integer) method.invoke(audioTrack2, new Object[0])).intValue();
                                            long j10 = xq5Var.i;
                                            Long.signum(intValue);
                                            long j11 = (intValue * 1000) - j10;
                                            xq5Var.o = j11;
                                            max = Math.max(j11, 0L);
                                            xq5Var.o = max;
                                            if (max > 5000000) {
                                                lb4.c(str2, "Ignoring impossibly large audio latency: " + max);
                                                xq5Var.o = 0L;
                                            }
                                        } catch (Exception unused) {
                                            xq5Var.n = null;
                                        }
                                        xq5Var.r = nanoTime;
                                    }
                                } else if (!z3) {
                                    i = 0;
                                    vq5Var3.a(i);
                                }
                                z3 = true;
                                if (!z3) {
                                }
                                if (xq5Var.q) {
                                    AudioTrack audioTrack22 = xq5Var.c;
                                    audioTrack22.getClass();
                                    int i62 = zn4.a;
                                    long intValue2 = ((Integer) method.invoke(audioTrack22, new Object[0])).intValue();
                                    long j102 = xq5Var.i;
                                    Long.signum(intValue2);
                                    long j112 = (intValue2 * 1000) - j102;
                                    xq5Var.o = j112;
                                    max = Math.max(j112, 0L);
                                    xq5Var.o = max;
                                    if (max > 5000000) {
                                    }
                                    xq5Var.r = nanoTime;
                                }
                            } else {
                                if (z3) {
                                    if (vq5Var3.a.e > vq5Var3.f) {
                                        vq5Var3.a(2);
                                        z3 = true;
                                    }
                                } else {
                                    vq5Var3.a(0);
                                }
                                if (!z3) {
                                }
                                if (xq5Var.q) {
                                }
                            }
                            long nanoTime2 = System.nanoTime() / 1000;
                            vq5Var = xq5Var.f;
                            vq5Var.getClass();
                            if (vq5Var.b != 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                j3 = zn4.o(nanoTime2 - (vq5Var.a.b.nanoTime / 1000), xq5Var.j) + xq5Var.c(vq5Var.a.e);
                            } else {
                                if (xq5Var.x == 0) {
                                    o = xq5Var.c(xq5Var.d());
                                } else {
                                    o = zn4.o(xq5Var.l + nanoTime2, xq5Var.j);
                                }
                                j3 = o;
                                if (!z) {
                                    j3 = Math.max(0L, j3 - xq5Var.o);
                                }
                            }
                            if (xq5Var.E != z2) {
                                xq5Var.G = xq5Var.D;
                                xq5Var.F = xq5Var.C;
                            }
                            j4 = nanoTime2 - xq5Var.G;
                            if (j4 < 1000000) {
                                long j12 = (j4 * 1000) / 1000000;
                                j3 = (((1000 - j12) * (zn4.o(j4, xq5Var.j) + xq5Var.F)) + (j3 * j12)) / 1000;
                            }
                            if (!xq5Var.k) {
                                long j13 = xq5Var.C;
                                if (j3 > j13) {
                                    xq5Var.k = true;
                                    int i7 = zn4.a;
                                    final long currentTimeMillis = System.currentTimeMillis() - zn4.s(zn4.p(zn4.s(j3 - j13), xq5Var.j));
                                    tr5 tr5Var = ((lr5) xq5Var.a).a.m;
                                    if (tr5Var != null && (handler = (nq5Var = tr5Var.a.m1).a) != null) {
                                        handler.post(new Runnable(currentTimeMillis) { // from class: iq5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                oq5 oq5Var = nq5.this.b;
                                                int i8 = zn4.a;
                                                pp5 pp5Var = ((xl5) oq5Var).P.p;
                                                io5 G = pp5Var.G();
                                                pp5Var.D(G, 1010, new wr1(G));
                                            }
                                        });
                                    }
                                }
                            }
                            xq5Var.D = nanoTime2;
                            xq5Var.C = j3;
                            xq5Var.E = z2;
                            rr5Var2 = rr5Var;
                            long min = Math.min(j3, (rr5Var2.b() * 1000000) / rr5Var2.o.e);
                            while (!rr5Var2.h.isEmpty() && min >= ((jr5) rr5Var2.h.getFirst()).c) {
                                rr5Var2.t = (jr5) rr5Var2.h.remove();
                            }
                            jr5Var = rr5Var2.t;
                            long j14 = min - jr5Var.c;
                            if (!jr5Var.a.equals(y13.d)) {
                                j5 = rr5Var2.t.b;
                            } else if (rr5Var2.h.isEmpty()) {
                                kt3 kt3Var = (kt3) rr5Var2.U.c;
                                long j15 = kt3Var.o;
                                if (j15 >= 1024) {
                                    long j16 = kt3Var.n;
                                    qs3 qs3Var = kt3Var.j;
                                    qs3Var.getClass();
                                    int i8 = qs3Var.k * qs3Var.b;
                                    long j17 = j16 - (i8 + i8);
                                    int i9 = kt3Var.h.a;
                                    int i10 = kt3Var.g.a;
                                    if (i9 != i10) {
                                        j17 *= i9;
                                        j15 *= i10;
                                    }
                                    j5 = zn4.r(j14, j17, j15);
                                } else {
                                    double d = kt3Var.c;
                                    double d2 = j14;
                                    Double.isNaN(d);
                                    Double.isNaN(d2);
                                    Double.isNaN(d);
                                    Double.isNaN(d2);
                                    Double.isNaN(d);
                                    Double.isNaN(d2);
                                    Double.isNaN(d);
                                    Double.isNaN(d2);
                                    Double.isNaN(d);
                                    Double.isNaN(d2);
                                    j5 = (long) (d * d2);
                                }
                                j14 = rr5Var2.t.b;
                            } else {
                                jr5 jr5Var2 = (jr5) rr5Var2.h.getFirst();
                                o2 = jr5Var2.b - zn4.o(jr5Var2.c - min, rr5Var2.t.a.a);
                                j2 = ((((wr5) rr5Var2.U.b).q * 1000000) / rr5Var2.o.e) + o2;
                                j = Long.MIN_VALUE;
                            }
                            o2 = j5 + j14;
                            j2 = ((((wr5) rr5Var2.U.b).q * 1000000) / rr5Var2.o.e) + o2;
                            j = Long.MIN_VALUE;
                        } else {
                            i = 3;
                            if (z3) {
                                uq5 uq5Var3 = vq5Var3.a;
                                if (uq5Var3.b.nanoTime / 1000 >= vq5Var3.c) {
                                    vq5Var3.f = uq5Var3.e;
                                    vq5Var3.a(1);
                                    z3 = true;
                                    if (!z3) {
                                    }
                                    if (xq5Var.q) {
                                    }
                                    long nanoTime22 = System.nanoTime() / 1000;
                                    vq5Var = xq5Var.f;
                                    vq5Var.getClass();
                                    if (vq5Var.b != 2) {
                                    }
                                    if (!z2) {
                                    }
                                    if (xq5Var.E != z2) {
                                    }
                                    j4 = nanoTime22 - xq5Var.G;
                                    if (j4 < 1000000) {
                                    }
                                    if (!xq5Var.k) {
                                    }
                                    xq5Var.D = nanoTime22;
                                    xq5Var.C = j3;
                                    xq5Var.E = z2;
                                    rr5Var2 = rr5Var;
                                    long min2 = Math.min(j3, (rr5Var2.b() * 1000000) / rr5Var2.o.e);
                                    while (!rr5Var2.h.isEmpty()) {
                                        rr5Var2.t = (jr5) rr5Var2.h.remove();
                                    }
                                    jr5Var = rr5Var2.t;
                                    long j142 = min2 - jr5Var.c;
                                    if (!jr5Var.a.equals(y13.d)) {
                                    }
                                    o2 = j5 + j142;
                                    j2 = ((((wr5) rr5Var2.U.b).q * 1000000) / rr5Var2.o.e) + o2;
                                    j = Long.MIN_VALUE;
                                }
                            }
                        }
                    }
                    z3 = false;
                    if (!z3) {
                    }
                    if (xq5Var.q) {
                    }
                    long nanoTime222 = System.nanoTime() / 1000;
                    vq5Var = xq5Var.f;
                    vq5Var.getClass();
                    if (vq5Var.b != 2) {
                    }
                    if (!z2) {
                    }
                    if (xq5Var.E != z2) {
                    }
                    j4 = nanoTime222 - xq5Var.G;
                    if (j4 < 1000000) {
                    }
                    if (!xq5Var.k) {
                    }
                    xq5Var.D = nanoTime222;
                    xq5Var.C = j3;
                    xq5Var.E = z2;
                    rr5Var2 = rr5Var;
                    long min22 = Math.min(j3, (rr5Var2.b() * 1000000) / rr5Var2.o.e);
                    while (!rr5Var2.h.isEmpty()) {
                    }
                    jr5Var = rr5Var2.t;
                    long j1422 = min22 - jr5Var.c;
                    if (!jr5Var.a.equals(y13.d)) {
                    }
                    o2 = j5 + j1422;
                    j2 = ((((wr5) rr5Var2.U.b).q * 1000000) / rr5Var2.o.e) + o2;
                    j = Long.MIN_VALUE;
                }
            }
            rr5Var = rr5Var3;
            z = j6;
            long nanoTime2222 = System.nanoTime() / 1000;
            vq5Var = xq5Var.f;
            vq5Var.getClass();
            if (vq5Var.b != 2) {
            }
            if (!z2) {
            }
            if (xq5Var.E != z2) {
            }
            j4 = nanoTime2222 - xq5Var.G;
            if (j4 < 1000000) {
            }
            if (!xq5Var.k) {
            }
            xq5Var.D = nanoTime2222;
            xq5Var.C = j3;
            xq5Var.E = z2;
            rr5Var2 = rr5Var;
            long min222 = Math.min(j3, (rr5Var2.b() * 1000000) / rr5Var2.o.e);
            while (!rr5Var2.h.isEmpty()) {
            }
            jr5Var = rr5Var2.t;
            long j14222 = min222 - jr5Var.c;
            if (!jr5Var.a.equals(y13.d)) {
            }
            o2 = j5 + j14222;
            j2 = ((((wr5) rr5Var2.U.b).q * 1000000) / rr5Var2.o.e) + o2;
            j = Long.MIN_VALUE;
        } else {
            j = Long.MIN_VALUE;
            j2 = Long.MIN_VALUE;
        }
        if (j2 != j) {
            if (!this.t1) {
                j2 = Math.max(this.r1, j2);
            }
            this.r1 = j2;
            this.t1 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        if (r1 == null) goto L26;
     */
    @Override // defpackage.tt5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A(ut5 ut5Var, cu1 cu1Var) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        boolean z5;
        pt5 pt5Var;
        int i4 = 128;
        if (!mx2.e(cu1Var.k)) {
            return 128;
        }
        if (zn4.a >= 21) {
            i = 32;
        } else {
            i = 0;
        }
        int i5 = cu1Var.D;
        if (i5 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (((rr5) this.n1).l(cu1Var) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (i5 != 0) {
                    List d = lu5.d("audio/raw", false, false);
                    if (d.isEmpty()) {
                        pt5Var = null;
                    } else {
                        pt5Var = (pt5) d.get(0);
                    }
                }
                return i | 140;
            }
        }
        if ("audio/raw".equals(cu1Var.k)) {
            if (((rr5) this.n1).l(cu1Var) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                return 129;
            }
        }
        tq5 tq5Var = this.n1;
        int i6 = cu1Var.x;
        int i7 = cu1Var.y;
        bs1 bs1Var = new bs1();
        bs1Var.j = "audio/raw";
        bs1Var.w = i6;
        bs1Var.x = i7;
        bs1Var.y = 2;
        if (((rr5) tq5Var).l(new cu1(bs1Var)) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return 129;
        }
        nv4 j0 = j0(cu1Var, this.n1);
        if (j0.isEmpty()) {
            return 129;
        }
        if (!z) {
            return 130;
        }
        pt5 pt5Var2 = (pt5) j0.get(0);
        boolean c = pt5Var2.c(cu1Var);
        if (!c) {
            for (int i8 = 1; i8 < j0.size(); i8++) {
                pt5 pt5Var3 = (pt5) j0.get(i8);
                if (pt5Var3.c(cu1Var)) {
                    pt5Var2 = pt5Var3;
                    z3 = false;
                    c = true;
                    break;
                }
            }
        }
        z3 = true;
        if (true != c) {
            i2 = 3;
        } else {
            i2 = 4;
        }
        int i9 = 8;
        if (c && pt5Var2.d(cu1Var)) {
            i9 = 16;
        }
        if (true != pt5Var2.g) {
            i3 = 0;
        } else {
            i3 = 64;
        }
        if (true != z3) {
            i4 = 0;
        }
        return i | i2 | i9 | i3 | i4;
    }

    @Override // defpackage.tt5
    public final ok5 B(pt5 pt5Var, cu1 cu1Var, cu1 cu1Var2) {
        int i;
        int i2;
        ok5 a = pt5Var.a(cu1Var, cu1Var2);
        int i3 = a.e;
        if (i0(pt5Var, cu1Var2) > this.o1) {
            i3 |= 64;
        }
        String str = pt5Var.a;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = a.d;
            i2 = 0;
        }
        return new ok5(str, cu1Var, cu1Var2, i, i2);
    }

    @Override // defpackage.tt5
    public final ok5 C(vi1 vi1Var) {
        final ok5 C = super.C(vi1Var);
        final nq5 nq5Var = this.m1;
        final cu1 cu1Var = (cu1) vi1Var.Q;
        Handler handler = nq5Var.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: lq5
                @Override // java.lang.Runnable
                public final void run() {
                    nq5 nq5Var2 = nq5.this;
                    final cu1 cu1Var2 = cu1Var;
                    final ok5 ok5Var = C;
                    nq5Var2.getClass();
                    int i = zn4.a;
                    xl5 xl5Var = (xl5) nq5Var2.b;
                    bm5 bm5Var = xl5Var.P;
                    int i2 = bm5.X;
                    bm5Var.getClass();
                    pp5 pp5Var = xl5Var.P.p;
                    final io5 G = pp5Var.G();
                    pp5Var.D(G, 1009, new v64(G, cu1Var2, ok5Var) { // from class: np5
                        public final /* synthetic */ cu1 P;

                        {
                            this.P = cu1Var2;
                        }

                        @Override // defpackage.v64
                        /* renamed from: e */
                        public final void mo5e(Object obj) {
                            ((jo5) obj).b(this.P);
                        }
                    });
                }
            });
        }
        return C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
        if ("AXON 7 mini".equals(r0) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    @Override // defpackage.tt5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lt5 F(pt5 pt5Var, cu1 cu1Var, float f) {
        boolean z;
        MediaFormat mediaFormat;
        cu1 cu1Var2;
        cu1[] cu1VarArr = this.W;
        cu1VarArr.getClass();
        int length = cu1VarArr.length;
        int i0 = i0(pt5Var, cu1Var);
        if (length != 1) {
            for (cu1 cu1Var3 : cu1VarArr) {
                if (pt5Var.a(cu1Var, cu1Var3).d != 0) {
                    i0 = Math.max(i0, i0(pt5Var, cu1Var3));
                }
            }
        }
        this.o1 = i0;
        String str = pt5Var.a;
        int i = zn4.a;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(zn4.c)) {
            String str2 = zn4.b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
                this.p1 = z;
                String str3 = pt5Var.c;
                int i2 = this.o1;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str3);
                mediaFormat.setInteger("channel-count", cu1Var.x);
                mediaFormat.setInteger("sample-rate", cu1Var.y);
                cd4.b(mediaFormat, cu1Var.m);
                cd4.a(mediaFormat, "max-input-size", i2);
                if (i >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f != -1.0f) {
                        if (i == 23) {
                            String str4 = zn4.d;
                            if (!"ZTE B2017G".equals(str4)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f);
                    }
                }
                if (i <= 28 && "audio/ac4".equals(cu1Var.k)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i >= 24) {
                    tq5 tq5Var = this.n1;
                    int i3 = cu1Var.x;
                    int i4 = cu1Var.y;
                    bs1 bs1Var = new bs1();
                    bs1Var.j = "audio/raw";
                    bs1Var.w = i3;
                    bs1Var.x = i4;
                    bs1Var.y = 4;
                    if (((rr5) tq5Var).l(new cu1(bs1Var)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                if (!"audio/raw".equals(pt5Var.b) && !"audio/raw".equals(cu1Var.k)) {
                    cu1Var2 = cu1Var;
                } else {
                    cu1Var2 = null;
                }
                this.q1 = cu1Var2;
                return new lt5(pt5Var, mediaFormat, cu1Var, null);
            }
        }
        z = false;
        this.p1 = z;
        String str32 = pt5Var.c;
        int i22 = this.o1;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        mediaFormat.setInteger("channel-count", cu1Var.x);
        mediaFormat.setInteger("sample-rate", cu1Var.y);
        cd4.b(mediaFormat, cu1Var.m);
        cd4.a(mediaFormat, "max-input-size", i22);
        if (i >= 23) {
        }
        if (i <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
        }
        if (i >= 32) {
        }
        if (!"audio/raw".equals(pt5Var.b)) {
        }
        cu1Var2 = null;
        this.q1 = cu1Var2;
        return new lt5(pt5Var, mediaFormat, cu1Var, null);
    }

    @Override // defpackage.tt5
    public final ArrayList G(ut5 ut5Var, cu1 cu1Var) {
        nv4 j0 = j0(cu1Var, this.n1);
        Pattern pattern = lu5.a;
        ArrayList arrayList = new ArrayList(j0);
        Collections.sort(arrayList, new vt5(new om1(6, cu1Var)));
        return arrayList;
    }

    @Override // defpackage.tt5
    public final void H(Exception exc) {
        lb4.b("MediaCodecAudioRenderer", "Audio codec error", exc);
        nq5 nq5Var = this.m1;
        Handler handler = nq5Var.a;
        if (handler != null) {
            handler.post(new cj2(nq5Var, exc));
        }
    }

    @Override // defpackage.tt5
    public final void I(final String str, final long j, final long j2) {
        final nq5 nq5Var = this.m1;
        Handler handler = nq5Var.a;
        if (handler != null) {
            handler.post(new Runnable(str, j, j2) { // from class: kq5
                public final /* synthetic */ String Q;

                @Override // java.lang.Runnable
                public final void run() {
                    nq5 nq5Var2 = nq5.this;
                    String str2 = this.Q;
                    oq5 oq5Var = nq5Var2.b;
                    int i = zn4.a;
                    pp5 pp5Var = ((xl5) oq5Var).P.p;
                    io5 G = pp5Var.G();
                    pp5Var.D(G, 1008, new fx2(G, str2));
                }
            });
        }
    }

    @Override // defpackage.tt5
    public final void J(String str) {
        nq5 nq5Var = this.m1;
        Handler handler = nq5Var.a;
        if (handler != null) {
            handler.post(new us2(4, nq5Var, str));
        }
    }

    @Override // defpackage.tt5
    public final void P(cu1 cu1Var, MediaFormat mediaFormat) {
        int i;
        int i2;
        cu1 cu1Var2 = this.q1;
        int[] iArr = null;
        if (cu1Var2 != null) {
            cu1Var = cu1Var2;
        } else if (this.q0 != null) {
            if ("audio/raw".equals(cu1Var.k)) {
                i = cu1Var.z;
            } else if (zn4.a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = zn4.m(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i = 2;
            }
            bs1 bs1Var = new bs1();
            bs1Var.j = "audio/raw";
            bs1Var.y = i;
            bs1Var.z = cu1Var.A;
            bs1Var.A = cu1Var.B;
            bs1Var.w = mediaFormat.getInteger("channel-count");
            bs1Var.x = mediaFormat.getInteger("sample-rate");
            cu1 cu1Var3 = new cu1(bs1Var);
            if (this.p1 && cu1Var3.x == 6 && (i2 = cu1Var.x) < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < cu1Var.x; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            }
            cu1Var = cu1Var3;
        }
        try {
            ((rr5) this.n1).m(cu1Var, iArr);
        } catch (pq5 e) {
            throw n(5001, e.P, e, false);
        }
    }

    @Override // defpackage.tt5
    public final void R() {
        ((rr5) this.n1).B = true;
    }

    @Override // defpackage.tt5
    public final void S(gk5 gk5Var) {
        if (this.s1 && !gk5Var.a(RecyclerView.UNDEFINED_DURATION)) {
            if (Math.abs(gk5Var.e - this.r1) > 500000) {
                this.r1 = gk5Var.e;
            }
            this.s1 = false;
        }
    }

    @Override // defpackage.tt5
    public final void T() {
        try {
            rr5 rr5Var = (rr5) this.n1;
            if (!rr5Var.K && rr5Var.j() && rr5Var.i()) {
                rr5Var.d();
                rr5Var.K = true;
            }
        } catch (sq5 e) {
            throw n(5002, e.R, e, e.Q);
        }
    }

    @Override // defpackage.tt5
    public final boolean U(long j, long j2, mt5 mt5Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, cu1 cu1Var) {
        byteBuffer.getClass();
        if (this.q1 != null && (i2 & 2) != 0) {
            mt5Var.getClass();
            mt5Var.c(i, false);
            return true;
        } else if (z) {
            if (mt5Var != null) {
                mt5Var.c(i, false);
            }
            this.e1.f += i3;
            ((rr5) this.n1).B = true;
            return true;
        } else {
            try {
                if (((rr5) this.n1).p(byteBuffer, j3, i3)) {
                    if (mt5Var != null) {
                        mt5Var.c(i, false);
                    }
                    this.e1.e += i3;
                    return true;
                }
                return false;
            } catch (qq5 e) {
                throw n(5001, e.R, e, e.Q);
            } catch (sq5 e2) {
                throw n(5002, cu1Var, e2, e2.Q);
            }
        }
    }

    @Override // defpackage.tt5
    public final boolean V(cu1 cu1Var) {
        return ((rr5) this.n1).l(cu1Var) != 0;
    }

    @Override // defpackage.tm5
    public final long a() {
        if (this.U == 2) {
            k0();
        }
        return this.r1;
    }

    @Override // defpackage.tm5
    public final void b(y13 y13Var) {
        rr5 rr5Var = (rr5) this.n1;
        rr5Var.getClass();
        rr5Var.u = new y13(Math.max(0.1f, Math.min(y13Var.a, 8.0f)), Math.max(0.1f, Math.min(y13Var.b, 8.0f)));
        jr5 jr5Var = new jr5(y13Var, -9223372036854775807L, -9223372036854775807L);
        if (rr5Var.j()) {
            rr5Var.s = jr5Var;
        } else {
            rr5Var.t = jr5Var;
        }
    }

    @Override // defpackage.mk5, defpackage.ln5
    public final void c(int i, Object obj) {
        boolean z;
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    switch (i) {
                        case 9:
                            rr5 rr5Var = (rr5) this.n1;
                            rr5Var.v = ((Boolean) obj).booleanValue();
                            jr5 jr5Var = new jr5(rr5Var.u, -9223372036854775807L, -9223372036854775807L);
                            if (rr5Var.j()) {
                                rr5Var.s = jr5Var;
                                return;
                            } else {
                                rr5Var.t = jr5Var;
                                return;
                            }
                        case 10:
                            tq5 tq5Var = this.n1;
                            int intValue = ((Integer) obj).intValue();
                            rr5 rr5Var2 = (rr5) tq5Var;
                            if (rr5Var2.O != intValue) {
                                rr5Var2.O = intValue;
                                if (intValue != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                rr5Var2.N = z;
                                rr5Var2.n();
                                return;
                            }
                            return;
                        case 11:
                            this.v1 = (on5) obj;
                            return;
                        case 12:
                            if (zn4.a >= 23) {
                                sr5.a(this.n1, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                vn5 vn5Var = (vn5) obj;
                rr5 rr5Var3 = (rr5) this.n1;
                if (!rr5Var3.P.equals(vn5Var)) {
                    vn5Var.getClass();
                    if (rr5Var3.q != null) {
                        rr5Var3.P.getClass();
                    }
                    rr5Var3.P = vn5Var;
                    return;
                }
                return;
            }
            pm5 pm5Var = (pm5) obj;
            rr5 rr5Var4 = (rr5) this.n1;
            if (!rr5Var4.r.equals(pm5Var)) {
                rr5Var4.r = pm5Var;
                rr5Var4.n();
                return;
            }
            return;
        }
        tq5 tq5Var2 = this.n1;
        float floatValue = ((Float) obj).floatValue();
        rr5 rr5Var5 = (rr5) tq5Var2;
        if (rr5Var5.E != floatValue) {
            rr5Var5.E = floatValue;
            rr5Var5.f();
        }
    }

    @Override // defpackage.tm5
    public final y13 d() {
        return ((rr5) this.n1).u;
    }

    @Override // defpackage.mk5
    public final String h() {
        return "MediaCodecAudioRenderer";
    }

    public final int i0(pt5 pt5Var, cu1 cu1Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(pt5Var.a) || (i = zn4.a) >= 24 || (i == 23 && zn4.d(this.l1))) {
            return cu1Var.l;
        }
        return -1;
    }

    @Override // defpackage.mk5
    public final boolean j() {
        boolean z;
        if (this.c1) {
            rr5 rr5Var = (rr5) this.n1;
            if (rr5Var.j() && (!rr5Var.K || rr5Var.q())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tt5, defpackage.mk5
    public final boolean k() {
        return ((rr5) this.n1).q() || super.k();
    }

    @Override // defpackage.mk5
    public final tm5 p() {
        return this;
    }

    @Override // defpackage.tt5, defpackage.mk5
    public final void r() {
        this.u1 = true;
        try {
            ((rr5) this.n1).n();
            try {
                super.r();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.r();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.mk5
    public final void s(boolean z, boolean z2) {
        nk5 nk5Var = new nk5();
        this.e1 = nk5Var;
        nq5 nq5Var = this.m1;
        Handler handler = nq5Var.a;
        if (handler != null) {
            handler.post(new g32(2, nq5Var, nk5Var));
        }
        this.R.getClass();
        tq5 tq5Var = this.n1;
        wp5 wp5Var = this.T;
        wp5Var.getClass();
        ((rr5) tq5Var).l = wp5Var;
    }

    @Override // defpackage.tt5, defpackage.mk5
    public final void t(long j, boolean z) {
        super.t(j, z);
        ((rr5) this.n1).n();
        this.r1 = j;
        this.s1 = true;
        this.t1 = true;
    }

    @Override // defpackage.mk5
    public final void u() {
        try {
            D();
            b0();
            this.j1 = null;
            if (this.u1) {
                this.u1 = false;
                ((rr5) this.n1).o();
            }
        } catch (Throwable th) {
            if (this.u1) {
                this.u1 = false;
                ((rr5) this.n1).o();
            }
            throw th;
        }
    }

    @Override // defpackage.mk5
    public final void v() {
        rr5 rr5Var = (rr5) this.n1;
        rr5Var.M = true;
        if (rr5Var.j()) {
            vq5 vq5Var = rr5Var.g.f;
            vq5Var.getClass();
            vq5Var.a(0);
            rr5Var.q.play();
        }
    }

    @Override // defpackage.mk5
    public final void w() {
        k0();
        rr5 rr5Var = (rr5) this.n1;
        boolean z = false;
        rr5Var.M = false;
        if (rr5Var.j()) {
            xq5 xq5Var = rr5Var.g;
            xq5Var.l = 0L;
            xq5Var.x = 0;
            xq5Var.w = 0;
            xq5Var.m = 0L;
            xq5Var.D = 0L;
            xq5Var.G = 0L;
            xq5Var.k = false;
            if (xq5Var.y == -9223372036854775807L) {
                vq5 vq5Var = xq5Var.f;
                vq5Var.getClass();
                vq5Var.a(0);
                z = true;
            }
            if (z) {
                rr5Var.q.pause();
            }
        }
    }

    @Override // defpackage.tt5
    public final float z(float f, cu1[] cu1VarArr) {
        int i = -1;
        for (cu1 cu1Var : cu1VarArr) {
            int i2 = cu1Var.y;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }
}