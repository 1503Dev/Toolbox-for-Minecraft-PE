package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: rr5  reason: default package */
public final class rr5 implements tq5 {
    public static final Object V = new Object();
    public static ExecutorService W;
    public static int X;
    public int A;
    public boolean B;
    public boolean C;
    public long D;
    public float E;
    public ByteBuffer F;
    public int G;
    public ByteBuffer H;
    public byte[] I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public vn5 P;
    public gr5 Q;
    public long R;
    public boolean S;
    public boolean T;
    public final vc2 U;
    public final gq5 a;
    public final yq5 b;
    public final gs5 c;
    public final nw4 d;
    public final nw4 e;
    public final sy3 f;
    public final xq5 g;
    public final ArrayDeque h;
    public or5 i;
    public final kr5 j;
    public final kr5 k;
    public wp5 l;
    public tr5 m;
    public ir5 n;
    public ir5 o;
    public qp3 p;
    public AudioTrack q;
    public pm5 r;
    public jr5 s;
    public jr5 t;
    public y13 u;
    public boolean v;
    public long w;
    public long x;
    public long y;
    public long z;

    public rr5(fe3 fe3Var) {
        this.a = (gq5) fe3Var.P;
        this.U = (vc2) fe3Var.R;
        int i = zn4.a;
        sy3 sy3Var = new sy3();
        this.f = sy3Var;
        sy3Var.b();
        this.g = new xq5(new lr5(this));
        yq5 yq5Var = new yq5();
        this.b = yq5Var;
        gs5 gs5Var = new gs5();
        this.c = gs5Var;
        fu3 fu3Var = new fu3();
        lv4 lv4Var = nv4.Q;
        Object[] objArr = {fu3Var, yq5Var, gs5Var};
        lw4.a(3, objArr);
        this.d = nv4.s(3, objArr);
        this.e = nv4.v(new xr5());
        this.E = 1.0f;
        this.r = pm5.b;
        this.O = 0;
        this.P = new vn5();
        y13 y13Var = y13.d;
        this.t = new jr5(y13Var, 0L, 0L);
        this.u = y13Var;
        this.v = false;
        this.h = new ArrayDeque();
        this.j = new kr5();
        this.k = new kr5();
    }

    public static boolean k(AudioTrack audioTrack) {
        return zn4.a >= 29 && qr5.a(audioTrack);
    }

    public final long a() {
        ir5 ir5Var = this.o;
        return ir5Var.c == 0 ? this.w / ir5Var.b : this.x;
    }

    public final long b() {
        ir5 ir5Var = this.o;
        return ir5Var.c == 0 ? this.y / ir5Var.d : this.z;
    }

    public final void c(long j) {
        boolean z;
        y13 y13Var;
        ir5 ir5Var = this.o;
        int i = ir5Var.c;
        boolean z2 = true;
        boolean z3 = false;
        if (i == 0) {
            int i2 = ir5Var.a.z;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            vc2 vc2Var = this.U;
            y13Var = this.u;
            kt3 kt3Var = (kt3) vc2Var.c;
            float f = y13Var.a;
            if (kt3Var.c != f) {
                kt3Var.c = f;
                kt3Var.i = true;
            }
            float f2 = y13Var.b;
            if (kt3Var.d != f2) {
                kt3Var.d = f2;
                kt3Var.i = true;
            }
        } else {
            y13Var = y13.d;
        }
        y13 y13Var2 = y13Var;
        this.u = y13Var2;
        if (i == 0) {
            int i3 = ir5Var.a.z;
        } else {
            z2 = false;
        }
        if (z2) {
            vc2 vc2Var2 = this.U;
            z3 = this.v;
            ((wr5) vc2Var2.b).j = z3;
        }
        this.v = z3;
        ArrayDeque arrayDeque = this.h;
        long max = Math.max(0L, j);
        ir5 ir5Var2 = this.o;
        arrayDeque.add(new jr5(y13Var2, max, (b() * 1000000) / ir5Var2.e));
        g();
        tr5 tr5Var = this.m;
        if (tr5Var != null) {
            final boolean z4 = this.v;
            final nq5 nq5Var = tr5Var.a.m1;
            Handler handler = nq5Var.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: jq5
                    @Override // java.lang.Runnable
                    public final void run() {
                        nq5 nq5Var2 = nq5.this;
                        boolean z5 = z4;
                        oq5 oq5Var = nq5Var2.b;
                        int i4 = zn4.a;
                        bm5 bm5Var = ((xl5) oq5Var).P;
                        if (bm5Var.N != z5) {
                            bm5Var.N = z5;
                            i94 i94Var = bm5Var.k;
                            i94Var.b(23, new in4(z5));
                            i94Var.a();
                        }
                    }
                });
            }
        }
    }

    public final void d() {
        if (!this.L) {
            this.L = true;
            xq5 xq5Var = this.g;
            long b = b();
            xq5Var.A = xq5Var.d();
            xq5Var.y = SystemClock.elapsedRealtime() * 1000;
            xq5Var.B = b;
            this.q.stop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        r2 = r1.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r2.hasRemaining() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        r2 = r1.p;
        r3 = r1.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r2.c() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (r2.d == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
        r2.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j) {
        ByteBuffer byteBuffer;
        if (this.p.c()) {
            while (!this.p.b()) {
                while (true) {
                    qp3 qp3Var = this.p;
                    if (!qp3Var.c()) {
                        byteBuffer = kr3.a;
                    } else {
                        ByteBuffer[] byteBufferArr = qp3Var.c;
                        ByteBuffer byteBuffer2 = byteBufferArr[byteBufferArr.length - 1];
                        if (!byteBuffer2.hasRemaining()) {
                            qp3Var.d(kr3.a);
                        }
                        byteBuffer = byteBuffer2;
                    }
                    if (!byteBuffer.hasRemaining()) {
                        break;
                    }
                    h(byteBuffer);
                    if (byteBuffer.hasRemaining()) {
                        return;
                    }
                }
            }
            return;
        }
        ByteBuffer byteBuffer3 = this.F;
        if (byteBuffer3 == null) {
            byteBuffer3 = kr3.a;
        }
        h(byteBuffer3);
    }

    public final void f() {
        if (j()) {
            if (zn4.a >= 21) {
                this.q.setVolume(this.E);
                return;
            }
            AudioTrack audioTrack = this.q;
            float f = this.E;
            audioTrack.setStereoVolume(f, f);
        }
    }

    public final void g() {
        qp3 qp3Var = this.o.i;
        this.p = qp3Var;
        qp3Var.b.clear();
        int i = 0;
        qp3Var.d = false;
        for (int i2 = 0; i2 < qp3Var.a.size(); i2++) {
            kr3 kr3Var = (kr3) qp3Var.a.get(i2);
            kr3Var.d();
            if (kr3Var.h()) {
                qp3Var.b.add(kr3Var);
            }
        }
        qp3Var.c = new ByteBuffer[qp3Var.b.size()];
        while (true) {
            ByteBuffer[] byteBufferArr = qp3Var.c;
            if (i <= byteBufferArr.length - 1) {
                byteBufferArr[i] = ((kr3) qp3Var.b.get(i)).c();
                i++;
            } else {
                return;
            }
        }
    }

    public final void h(ByteBuffer byteBuffer) {
        int a;
        tr5 tr5Var;
        on5 on5Var;
        boolean z;
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.H;
        boolean z2 = true;
        if (byteBuffer2 != null) {
            if (byteBuffer2 == byteBuffer) {
                z = true;
            } else {
                z = false;
            }
            tv2.G(z);
        } else {
            this.H = byteBuffer;
            if (zn4.a < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.I;
                if (bArr == null || bArr.length < remaining) {
                    this.I = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.I, 0, remaining);
                byteBuffer.position(position);
                this.J = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        int i = zn4.a;
        if (i < 21) {
            xq5 xq5Var = this.g;
            int d = xq5Var.e - ((int) (this.y - (xq5Var.d() * xq5Var.d)));
            if (d > 0) {
                a = this.q.write(this.I, this.J, Math.min(remaining2, d));
                if (a > 0) {
                    this.J += a;
                    byteBuffer.position(byteBuffer.position() + a);
                }
            } else {
                a = 0;
            }
        } else {
            a = rm.a(this.q, byteBuffer, remaining2);
        }
        this.R = SystemClock.elapsedRealtime();
        if (a < 0) {
            sq5 sq5Var = new sq5(a, this.o.a, (((i < 24 || a != -6) && a != -32) || this.z <= 0) ? false : false);
            tr5 tr5Var2 = this.m;
            if (tr5Var2 != null) {
                tr5Var2.a(sq5Var);
            }
            if (!sq5Var.Q) {
                this.k.a(sq5Var);
                return;
            }
            throw sq5Var;
        }
        this.k.a = null;
        if (k(this.q)) {
            if (this.z > 0) {
                this.T = false;
            }
            if (this.M && (tr5Var = this.m) != null && a < remaining2 && !this.T && (on5Var = tr5Var.a.v1) != null) {
                on5Var.a();
            }
        }
        int i2 = this.o.c;
        if (i2 == 0) {
            this.y += a;
        }
        if (a == remaining2) {
            if (i2 != 0) {
                if (byteBuffer != this.F) {
                    z2 = false;
                }
                tv2.I(z2);
                this.z = (this.A * this.G) + this.z;
            }
            this.H = null;
        }
    }

    public final boolean i() {
        ByteBuffer byteBuffer;
        if (!this.p.c()) {
            ByteBuffer byteBuffer2 = this.H;
            if (byteBuffer2 == null) {
                return true;
            }
            h(byteBuffer2);
            if (this.H == null) {
                return true;
            }
            return false;
        }
        qp3 qp3Var = this.p;
        if (qp3Var.c() && !qp3Var.d) {
            qp3Var.d = true;
            ((kr3) qp3Var.b.get(0)).i();
        }
        e(Long.MIN_VALUE);
        if (this.p.b() && ((byteBuffer = this.H) == null || !byteBuffer.hasRemaining())) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return this.q != null;
    }

    public final int l(cu1 cu1Var) {
        if (!"audio/raw".equals(cu1Var.k)) {
            if (!this.S) {
                int i = zn4.a;
            }
            return this.a.a(cu1Var) != null ? 2 : 0;
        }
        boolean c = zn4.c(cu1Var.z);
        int i2 = cu1Var.z;
        if (c) {
            return i2 != 2 ? 1 : 2;
        }
        lb4.c("DefaultAudioSink", "Invalid PCM encoding: " + i2);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x014b, code lost:
        if ((r2 & (r19 & 1)) != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014e, code lost:
        if (r20 > 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0151, code lost:
        if (r15 > 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0154, code lost:
        if (r15 < 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0157, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0158, code lost:
        if (r14 != false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(cu1 cu1Var, int[] iArr) {
        qp3 qp3Var;
        int intValue;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        qp3 qp3Var2;
        int max;
        int i9;
        int n;
        int i10;
        int[] iArr2;
        if ("audio/raw".equals(cu1Var.k)) {
            tv2.G(zn4.c(cu1Var.z));
            i2 = zn4.n(cu1Var.z, cu1Var.x);
            kv4 kv4Var = new kv4();
            kv4Var.q(this.d);
            kr3[] kr3VarArr = (kr3[]) this.U.a;
            lw4.a(2, kr3VarArr);
            kv4Var.r(kv4Var.R + 2);
            System.arraycopy(kr3VarArr, 0, kv4Var.Q, kv4Var.R, 2);
            kv4Var.R += 2;
            qp3 qp3Var3 = new qp3(kv4Var.s());
            if (qp3Var3.equals(this.p)) {
                qp3Var3 = this.p;
            }
            gs5 gs5Var = this.c;
            int i11 = cu1Var.A;
            int i12 = cu1Var.B;
            gs5Var.i = i11;
            gs5Var.j = i12;
            if (zn4.a < 21 && cu1Var.x == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i13 = 0; i13 < 6; i13++) {
                    iArr2[i13] = i13;
                }
            } else {
                iArr2 = iArr;
            }
            this.b.i = iArr2;
            try {
                kq3 a = qp3Var3.a(new kq3(cu1Var.y, cu1Var.x, cu1Var.z));
                int i14 = a.c;
                i4 = a.a;
                int i15 = a.b;
                intValue = zn4.j(i15);
                qp3Var = qp3Var3;
                i = i14;
                i3 = zn4.n(i14, i15);
                i5 = 0;
            } catch (br3 e) {
                throw new pq5(e, cu1Var);
            }
        } else {
            lv4 lv4Var = nv4.Q;
            qp3 qp3Var4 = new qp3(nw4.T);
            int i16 = cu1Var.y;
            int i17 = zn4.a;
            Pair a2 = this.a.a(cu1Var);
            if (a2 != null) {
                int intValue2 = ((Integer) a2.first).intValue();
                qp3Var = qp3Var4;
                intValue = ((Integer) a2.second).intValue();
                i = intValue2;
                i2 = -1;
                i3 = -1;
                i4 = i16;
                i5 = 2;
            } else {
                throw new pq5("Unable to configure passthrough for: ".concat(String.valueOf(cu1Var)), cu1Var);
            }
        }
        if (i != 0) {
            if (intValue != 0) {
                int minBufferSize = AudioTrack.getMinBufferSize(i4, intValue, i);
                boolean z2 = true;
                if (minBufferSize != -2) {
                    z = true;
                } else {
                    z = false;
                }
                tv2.I(z);
                if (i3 != -1) {
                    i6 = i3;
                } else {
                    i6 = 1;
                }
                int i18 = cu1Var.g;
                if (i5 != 0) {
                    if (i5 != 1) {
                        int i19 = 5;
                        if (i == 5) {
                            i = 5;
                            i9 = 500000;
                        } else {
                            i19 = i;
                            i9 = 250000;
                        }
                        if (i18 != -1) {
                            RoundingMode roundingMode = RoundingMode.CEILING;
                            roundingMode.getClass();
                            n = i18 / 8;
                            int i20 = i18 - (n * 8);
                            if (i20 != 0) {
                                int i21 = ((i18 ^ 8) >> 31) | 1;
                                switch (gx4.a[roundingMode.ordinal()]) {
                                    case 1:
                                        if (i20 != 0) {
                                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                        }
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        n += i21;
                                        break;
                                    case 5:
                                        break;
                                    case 6:
                                    case 7:
                                    case 8:
                                        int abs = Math.abs(i20);
                                        int abs2 = abs - (Math.abs(8) - abs);
                                        if (abs2 == 0) {
                                            if (roundingMode != RoundingMode.HALF_UP) {
                                                if (roundingMode == RoundingMode.HALF_EVEN) {
                                                    i10 = 1;
                                                } else {
                                                    i10 = 0;
                                                }
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        throw new AssertionError();
                                }
                            }
                        } else {
                            n = v32.n(i);
                        }
                        max = tv2.r((i9 * n) / 1000000);
                        i7 = i19;
                    } else {
                        i7 = i;
                        max = tv2.r((v32.n(i) * 50000000) / 1000000);
                    }
                    i8 = intValue;
                    qp3Var2 = qp3Var;
                } else {
                    long j = i4;
                    i7 = i;
                    long j2 = i6;
                    i8 = intValue;
                    qp3Var2 = qp3Var;
                    max = Math.max(tv2.r(((250000 * j) * j2) / 1000000), Math.min(minBufferSize * 4, tv2.r(((750000 * j) * j2) / 1000000)));
                }
                this.S = false;
                ir5 ir5Var = new ir5(cu1Var, i2, i5, i3, i4, i8, i7, (((Math.max(minBufferSize, max) + i6) - 1) / i6) * i6, qp3Var2);
                if (j()) {
                    this.n = ir5Var;
                    return;
                } else {
                    this.o = ir5Var;
                    return;
                }
            }
            throw new pq5("Invalid output channel config (mode=" + i5 + ") for: " + String.valueOf(cu1Var), cu1Var);
        }
        throw new pq5("Invalid output encoding (mode=" + i5 + ") for: " + String.valueOf(cu1Var), cu1Var);
    }

    public final void n() {
        boolean z;
        if (j()) {
            this.w = 0L;
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.T = false;
            this.A = 0;
            this.t = new jr5(this.u, 0L, 0L);
            this.D = 0L;
            this.s = null;
            this.h.clear();
            this.F = null;
            this.G = 0;
            this.H = null;
            this.L = false;
            this.K = false;
            this.c.o = 0L;
            g();
            AudioTrack audioTrack = this.g.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.q.pause();
            }
            if (k(this.q)) {
                or5 or5Var = this.i;
                or5Var.getClass();
                this.q.unregisterStreamEventCallback(or5Var.b);
                or5Var.a.removeCallbacksAndMessages(null);
            }
            if (zn4.a < 21 && !this.N) {
                this.O = 0;
            }
            ir5 ir5Var = this.n;
            if (ir5Var != null) {
                this.o = ir5Var;
                this.n = null;
            }
            xq5 xq5Var = this.g;
            xq5Var.l = 0L;
            xq5Var.x = 0;
            xq5Var.w = 0;
            xq5Var.m = 0L;
            xq5Var.D = 0L;
            xq5Var.G = 0L;
            xq5Var.k = false;
            xq5Var.c = null;
            xq5Var.f = null;
            AudioTrack audioTrack2 = this.q;
            sy3 sy3Var = this.f;
            synchronized (sy3Var) {
                sy3Var.a = false;
            }
            synchronized (V) {
                try {
                    if (W == null) {
                        W = Executors.newSingleThreadExecutor(new en4("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    X++;
                    W.execute(new ch4(1, audioTrack2, sy3Var));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.q = null;
        }
        this.k.a = null;
        this.j.a = null;
    }

    public final void o() {
        n();
        nw4 nw4Var = this.d;
        int i = nw4Var.S;
        for (int i2 = 0; i2 < i; i2++) {
            ((kr3) nw4Var.get(i2)).e();
        }
        nw4 nw4Var2 = this.e;
        int i3 = nw4Var2.S;
        for (int i4 = 0; i4 < i3; i4++) {
            ((kr3) nw4Var2.get(i4)).e();
        }
        qp3 qp3Var = this.p;
        if (qp3Var != null) {
            for (int i5 = 0; i5 < qp3Var.a.size(); i5++) {
                kr3 kr3Var = (kr3) qp3Var.a.get(i5);
                kr3Var.d();
                kr3Var.e();
            }
            qp3Var.c = new ByteBuffer[0];
            kq3 kq3Var = kq3.e;
            qp3Var.d = false;
        }
        this.M = false;
        this.S = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04a4 A[Catch: qq5 -> 0x04ab, TryCatch #6 {qq5 -> 0x04ab, blocks: (B:37:0x0089, B:38:0x008b, B:40:0x008e, B:60:0x00de, B:62:0x00e6, B:64:0x00ec, B:65:0x00f3, B:66:0x010e, B:68:0x0112, B:70:0x0116, B:71:0x011b, B:75:0x0131, B:79:0x014a, B:80:0x014f, B:55:0x00ac, B:57:0x00b5, B:246:0x0498, B:251:0x04a4, B:252:0x04a6, B:43:0x0092, B:48:0x00a1, B:52:0x00a9, B:51:0x00a6, B:45:0x0097, B:39:0x008c), top: B:273:0x0089, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(ByteBuffer byteBuffer, long j, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        AudioTrack a;
        boolean z4;
        wp5 wp5Var;
        ir5 ir5Var;
        boolean z5;
        boolean z6;
        boolean z7;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte b;
        ByteBuffer byteBuffer2 = this.F;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            z = false;
        } else {
            z = true;
        }
        tv2.G(z);
        if (this.n != null) {
            if (!i()) {
                return false;
            }
            ir5 ir5Var2 = this.n;
            ir5 ir5Var3 = this.o;
            if (ir5Var3.c == ir5Var2.c && ir5Var3.g == ir5Var2.g && ir5Var3.e == ir5Var2.e && ir5Var3.f == ir5Var2.f && ir5Var3.d == ir5Var2.d) {
                this.o = ir5Var2;
                this.n = null;
                if (k(this.q)) {
                    if (this.q.getPlayState() == 3) {
                        pr5.a(this.q);
                    }
                    AudioTrack audioTrack = this.q;
                    cu1 cu1Var = this.o.a;
                    audioTrack.setOffloadDelayPadding(cu1Var.A, cu1Var.B);
                    this.T = true;
                }
            } else {
                d();
                if (q()) {
                    return false;
                }
                n();
            }
            c(j);
        }
        if (!j()) {
            try {
                sy3 sy3Var = this.f;
                synchronized (sy3Var) {
                    z2 = sy3Var.a;
                }
                if (!z2) {
                    return false;
                }
                try {
                    ir5Var = this.o;
                    ir5Var.getClass();
                } catch (qq5 e) {
                    ir5 ir5Var4 = this.o;
                    if (ir5Var4.h > 1000000) {
                        ir5 ir5Var5 = new ir5(ir5Var4.a, ir5Var4.b, ir5Var4.c, ir5Var4.d, ir5Var4.e, ir5Var4.f, ir5Var4.g, 1000000, ir5Var4.i);
                        try {
                            try {
                                a = ir5Var5.a(this.r, this.O);
                                this.o = ir5Var5;
                            } catch (qq5 e2) {
                                tr5 tr5Var = this.m;
                                if (tr5Var != null) {
                                    tr5Var.a(e2);
                                }
                                throw e2;
                            }
                        } catch (qq5 e3) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e3);
                            } catch (Exception unused) {
                            }
                            if (this.o.c != 1) {
                            }
                            if (z3) {
                            }
                            throw e;
                        }
                    }
                    if (this.o.c != 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        this.S = true;
                    }
                    throw e;
                }
                try {
                    a = ir5Var.a(this.r, this.O);
                    this.q = a;
                    if (k(a)) {
                        AudioTrack audioTrack2 = this.q;
                        if (this.i == null) {
                            this.i = new or5(this);
                        }
                        or5 or5Var = this.i;
                        audioTrack2.registerStreamEventCallback(new mr5(or5Var.a), or5Var.b);
                        AudioTrack audioTrack3 = this.q;
                        cu1 cu1Var2 = this.o.a;
                        audioTrack3.setOffloadDelayPadding(cu1Var2.A, cu1Var2.B);
                    }
                    int i9 = zn4.a;
                    if (i9 >= 31 && (wp5Var = this.l) != null) {
                        fr5.a(this.q, wp5Var);
                    }
                    this.O = this.q.getAudioSessionId();
                    xq5 xq5Var = this.g;
                    AudioTrack audioTrack4 = this.q;
                    ir5 ir5Var6 = this.o;
                    if (ir5Var6.c == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    xq5Var.a(audioTrack4, z4, ir5Var6.g, ir5Var6.d, ir5Var6.h);
                    f();
                    this.P.getClass();
                    gr5 gr5Var = this.Q;
                    if (gr5Var != null && i9 >= 23) {
                        er5.a(this.q, gr5Var);
                    }
                    this.C = true;
                } catch (qq5 e4) {
                    tr5 tr5Var2 = this.m;
                    if (tr5Var2 != null) {
                        tr5Var2.a(e4);
                    }
                    throw e4;
                }
            } catch (qq5 e5) {
                if (!e5.Q) {
                    this.j.a(e5);
                    return false;
                }
                throw e5;
            }
        }
        this.j.a = null;
        if (this.C) {
            this.D = Math.max(0L, j);
            this.B = false;
            this.C = false;
            c(j);
            if (this.M) {
                this.M = true;
                if (j()) {
                    vq5 vq5Var = this.g.f;
                    vq5Var.getClass();
                    vq5Var.a(0);
                    this.q.play();
                }
            }
        }
        xq5 xq5Var2 = this.g;
        long b2 = b();
        AudioTrack audioTrack5 = xq5Var2.c;
        audioTrack5.getClass();
        int playState = audioTrack5.getPlayState();
        if (xq5Var2.h) {
            if (playState == 2) {
                xq5Var2.p = false;
            } else if (playState == 1) {
                if (xq5Var2.d() != 0) {
                    playState = 1;
                }
            }
            z5 = false;
            if (z5) {
                return false;
            }
            if (this.F == null) {
                if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                tv2.G(z7);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                ir5 ir5Var7 = this.o;
                if (ir5Var7.c != 0 && this.A == 0) {
                    int i10 = ir5Var7.g;
                    switch (i10) {
                        case 5:
                        case 6:
                        case 18:
                            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) == 3) {
                                    i3 = 3;
                                } else {
                                    i3 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
                                }
                                i2 = da2.W[i3] * 256;
                                break;
                            } else {
                                i2 = 1536;
                                break;
                            }
                        case 7:
                        case 8:
                            int position = byteBuffer.position();
                            byte b3 = byteBuffer.get(position);
                            if (b3 != -2) {
                                if (b3 != -1) {
                                    if (b3 != 31) {
                                        i4 = (byteBuffer.get(position + 4) & 1) << 6;
                                        i5 = byteBuffer.get(position + 5) & 252;
                                    } else {
                                        i4 = (byteBuffer.get(position + 5) & 7) << 4;
                                        i6 = position + 6;
                                    }
                                } else {
                                    i4 = (byteBuffer.get(position + 4) & 7) << 4;
                                    i6 = position + 7;
                                }
                                i5 = byteBuffer.get(i6) & 60;
                            } else {
                                i4 = (byteBuffer.get(position + 5) & 1) << 6;
                                i5 = byteBuffer.get(position + 4) & 252;
                            }
                            i2 = (((i5 >> 2) | i4) + 1) * 32;
                            break;
                        case 9:
                            int position2 = byteBuffer.position();
                            int i11 = zn4.a;
                            int i12 = byteBuffer.getInt(position2);
                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                i12 = Integer.reverseBytes(i12);
                            }
                            i2 = ga1.t(i12);
                            if (i2 == -1) {
                                throw new IllegalArgumentException();
                            }
                            break;
                        case 10:
                        case 16:
                            i2 = 1024;
                            break;
                        case 11:
                        case 12:
                            i2 = 2048;
                            break;
                        case 13:
                        case 19:
                        default:
                            throw new IllegalStateException(k6.a("Unexpected audio encoding: ", i10));
                        case 14:
                            int position3 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i13 = position3;
                            while (true) {
                                if (i13 <= limit) {
                                    int i14 = zn4.a;
                                    int i15 = byteBuffer.getInt(i13 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i15 = Integer.reverseBytes(i15);
                                    }
                                    if ((i15 & (-2)) == -126718022) {
                                        i7 = i13 - position3;
                                    } else {
                                        i13++;
                                    }
                                } else {
                                    i7 = -1;
                                }
                            }
                            if (i7 == -1) {
                                i2 = 0;
                                break;
                            } else {
                                int i16 = byteBuffer.get(byteBuffer.position() + i7 + 7) & 255;
                                int position4 = byteBuffer.position() + i7;
                                if (i16 == 187) {
                                    i8 = 9;
                                } else {
                                    i8 = 8;
                                }
                                i2 = (40 << ((byteBuffer.get(position4 + i8) >> 4) & 7)) * 16;
                                break;
                            }
                        case 15:
                            i2 = 512;
                            break;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position5 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position5);
                            i2 = vx.x(new eh4(bArr, 16)).c;
                            break;
                        case 20:
                            int i17 = byteBuffer.get(26) + 27;
                            byte b4 = byteBuffer.get(i17);
                            if (byteBuffer.limit() > 1) {
                                b = byteBuffer.get(i17 + 1);
                            } else {
                                b = 0;
                            }
                            i2 = (int) ((ea2.J(b4, b) * 48000) / 1000000);
                            break;
                    }
                    this.A = i2;
                    if (i2 == 0) {
                        return true;
                    }
                }
                if (this.s != null) {
                    if (!i()) {
                        return false;
                    }
                    c(j);
                    this.s = null;
                }
                long a2 = (((a() - this.c.o) * 1000000) / this.o.a.y) + this.D;
                if (!this.B && Math.abs(a2 - j) > 200000) {
                    tr5 tr5Var3 = this.m;
                    if (tr5Var3 != null) {
                        tr5Var3.a(new rq5(j, a2));
                    }
                    this.B = true;
                }
                if (this.B) {
                    if (!i()) {
                        return false;
                    }
                    long j2 = j - a2;
                    this.D += j2;
                    this.B = false;
                    c(j);
                    tr5 tr5Var4 = this.m;
                    if (tr5Var4 != null && j2 != 0) {
                        tr5Var4.a.t1 = true;
                    }
                }
                if (this.o.c == 0) {
                    this.w += byteBuffer.remaining();
                } else {
                    this.x = (this.A * i) + this.x;
                }
                this.F = byteBuffer;
                this.G = i;
            }
            e(j);
            if (!this.F.hasRemaining()) {
                this.F = null;
                this.G = 0;
                return true;
            }
            xq5 xq5Var3 = this.g;
            long b5 = b();
            if (xq5Var3.z != -9223372036854775807L && b5 > 0 && SystemClock.elapsedRealtime() - xq5Var3.z >= 200) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                lb4.c("DefaultAudioSink", "Resetting stalled audio track");
                n();
                return true;
            }
            return false;
        }
        boolean z8 = xq5Var2.p;
        boolean b6 = xq5Var2.b(b2);
        xq5Var2.p = b6;
        if (z8 && !b6 && playState != 1) {
            wq5 wq5Var = xq5Var2.a;
            final int i18 = xq5Var2.e;
            final long s = zn4.s(xq5Var2.i);
            lr5 lr5Var = (lr5) wq5Var;
            if (lr5Var.a.m != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                rr5 rr5Var = lr5Var.a;
                final long j3 = elapsedRealtime - rr5Var.R;
                final nq5 nq5Var = rr5Var.m.a.m1;
                Handler handler = nq5Var.a;
                if (handler != null) {
                    handler.post(new Runnable(i18, s, j3) { // from class: mq5
                        @Override // java.lang.Runnable
                        public final void run() {
                            oq5 oq5Var = nq5.this.b;
                            int i19 = zn4.a;
                            pp5 pp5Var = ((xl5) oq5Var).P.p;
                            io5 G = pp5Var.G();
                            pp5Var.D(G, 1011, new fb3(G));
                        }
                    });
                }
            }
        }
        z5 = true;
        if (z5) {
        }
    }

    public final boolean q() {
        return j() && this.g.b(b());
    }
}