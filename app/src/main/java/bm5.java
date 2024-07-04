package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: bm5  reason: default package */
public final class bm5 extends ro5 {
    public static final /* synthetic */ int X = 0;
    public boolean A;
    public int B;
    public ao5 C;
    public q43 D;
    public nq2 E;
    public AudioTrack F;
    public Object G;
    public Surface H;
    public int I;
    public ai4 J;
    public int K;
    public pm5 L;
    public float M;
    public boolean N;
    public boolean O;
    public boolean P;
    public cz5 Q;
    public nq2 R;
    public jn5 S;
    public int T;
    public long U;
    public final db3 V;
    public yw5 W;
    public final xy5 b;
    public final q43 c;
    public final sy3 d = new sy3();
    public final Context e;
    public final o73 f;
    public final mk5[] g;
    public final wy5 h;
    public final a54 i;
    public final im5 j;
    public final i94 k;
    public final CopyOnWriteArraySet l;
    public final ya3 m;
    public final ArrayList n;
    public final boolean o;
    public final pp5 p;
    public final Looper q;
    public final lz5 r;
    public final dj4 s;
    public final xl5 t;
    public final yl5 u;
    public final lk5 v;
    public final go5 w;
    public final long x;
    public int y;
    public int z;

    static {
        gm2.a("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public bm5(gl5 gl5Var, o73 o73Var) {
        wp5 a;
        try {
            String str = "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.0.0-rc02] [" + zn4.e + "]";
            synchronized (lb4.a) {
                Log.i("ExoPlayerImpl", str);
            }
            this.e = gl5Var.a.getApplicationContext();
            this.p = new pp5(gl5Var.b);
            this.L = gl5Var.i;
            this.I = gl5Var.j;
            this.N = false;
            this.x = gl5Var.n;
            xl5 xl5Var = new xl5(this);
            this.t = xl5Var;
            this.u = new yl5();
            Handler handler = new Handler(gl5Var.h);
            this.g = gl5Var.c.P.g(handler, xl5Var, xl5Var);
            this.h = (wy5) gl5Var.e.a();
            new ak1(gl5Var.d.P);
            HashMap hashMap = new HashMap();
            new HashSet();
            HashMap hashMap2 = new HashMap();
            hashMap.clear();
            hashMap2.clear();
            this.r = lz5.a(gl5Var.g.P);
            this.o = gl5Var.k;
            this.C = gl5Var.l;
            Looper looper = gl5Var.h;
            this.q = looper;
            dj4 dj4Var = gl5Var.b;
            this.s = dj4Var;
            this.f = o73Var;
            this.k = new i94(looper, dj4Var, new ij2(5, this));
            this.l = new CopyOnWriteArraySet();
            this.n = new ArrayList();
            this.W = new yw5();
            this.b = new xy5(new zn5[2], new qy5[2], vk3.b, null);
            this.m = new ya3();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i = 0; i < 21; i++) {
                int i2 = iArr[i];
                tv2.I(!false);
                sparseBooleanArray.append(i2, true);
            }
            this.h.c();
            tv2.I(!false);
            sparseBooleanArray.append(29, true);
            tv2.I(!false);
            hp1 hp1Var = new hp1(sparseBooleanArray);
            this.c = new q43(hp1Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i3 = 0; i3 < hp1Var.a.size(); i3++) {
                int a2 = hp1Var.a(i3);
                tv2.I(!false);
                sparseBooleanArray2.append(a2, true);
            }
            tv2.I(!false);
            sparseBooleanArray2.append(4, true);
            tv2.I(!false);
            sparseBooleanArray2.append(10, true);
            tv2.I(!false);
            this.D = new q43(new hp1(sparseBooleanArray2));
            this.i = this.s.b(this.q, null);
            db3 db3Var = new db3(6, this);
            this.V = db3Var;
            this.S = jn5.g(this.b);
            this.p.A(this.f, this.q);
            int i4 = zn4.a;
            if (i4 < 31) {
                a = new wp5();
            } else {
                a = ul5.a(this.e, this, gl5Var.o);
            }
            this.j = new im5(this.g, this.h, this.b, (sm5) gl5Var.f.a(), this.r, this.p, this.C, gl5Var.q, gl5Var.m, this.q, this.s, db3Var, a);
            this.M = 1.0f;
            nq2 nq2Var = nq2.y;
            this.E = nq2Var;
            this.R = nq2Var;
            int i5 = -1;
            this.T = -1;
            if (i4 >= 21) {
                AudioManager audioManager = (AudioManager) this.e.getSystemService("audio");
                if (audioManager != null) {
                    i5 = audioManager.generateAudioSessionId();
                }
            } else {
                AudioTrack audioTrack = this.F;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.F.release();
                    this.F = null;
                }
                if (this.F == null) {
                    this.F = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                i5 = this.F.getAudioSessionId();
            }
            this.K = i5;
            int i6 = nv3.a;
            this.O = true;
            pp5 pp5Var = this.p;
            i94 i94Var = this.k;
            pp5Var.getClass();
            synchronized (i94Var.g) {
                if (!i94Var.h) {
                    i94Var.d.add(new l84(pp5Var));
                }
            }
            lz5 lz5Var = this.r;
            Handler handler2 = new Handler(this.q);
            pp5 pp5Var2 = this.p;
            lz5Var.getClass();
            pp5Var2.getClass();
            hz5 hz5Var = lz5Var.Q;
            hz5Var.a(pp5Var2);
            hz5Var.a.add(new gz5(handler2, pp5Var2));
            this.l.add(this.t);
            gl5Var.a.getApplicationContext();
            new hk5(handler);
            this.v = new lk5(gl5Var.a, handler, this.t);
            zn4.b(null, null);
            go5 go5Var = new go5(gl5Var.a, handler, this.t);
            this.w = go5Var;
            this.L.getClass();
            go5Var.a();
            PowerManager powerManager = (PowerManager) gl5Var.a.getApplicationContext().getSystemService("power");
            WifiManager wifiManager = (WifiManager) gl5Var.a.getApplicationContext().getSystemService("wifi");
            this.Q = u(go5Var);
            wo3 wo3Var = wo3.e;
            this.J = ai4.c;
            this.h.b(this.L);
            y(1, 10, Integer.valueOf(this.K));
            y(2, 10, Integer.valueOf(this.K));
            y(1, 3, this.L);
            y(2, 4, Integer.valueOf(this.I));
            y(2, 5, 0);
            y(1, 9, Boolean.valueOf(this.N));
            y(2, 7, this.u);
            y(6, 8, this.u);
        } finally {
            this.d.b();
        }
    }

    public static boolean G(jn5 jn5Var) {
        return jn5Var.e == 3 && jn5Var.l && jn5Var.m == 0;
    }

    public static long q(jn5 jn5Var) {
        lc3 lc3Var = new lc3();
        ya3 ya3Var = new ya3();
        jn5Var.a.n(jn5Var.b.a, ya3Var);
        long j = jn5Var.c;
        if (j == -9223372036854775807L) {
            jn5Var.a.e(ya3Var.c, lc3Var, 0L).getClass();
            return 0L;
        }
        return j;
    }

    public static cz5 u(go5 go5Var) {
        int i;
        go5Var.getClass();
        if (zn4.a >= 28) {
            i = m0.a(go5Var.d, go5Var.f);
        } else {
            i = 0;
        }
        return new cz5(i, go5Var.d.getStreamMaxVolume(go5Var.f));
    }

    public final void A(tk5 tk5Var) {
        boolean z;
        jn5 jn5Var = this.S;
        jn5 a = jn5Var.a(jn5Var.b);
        a.p = a.r;
        a.q = 0L;
        jn5 e = a.e(1);
        if (tk5Var != null) {
            e = e.d(tk5Var);
        }
        jn5 jn5Var2 = e;
        this.y++;
        dl4 dl4Var = (dl4) this.j.W;
        dl4Var.getClass();
        mk4 d = dl4.d();
        d.a = dl4Var.a.obtainMessage(6);
        d.a();
        if (jn5Var2.a.o() && !this.S.a.o()) {
            z = true;
        } else {
            z = false;
        }
        C(jn5Var2, 0, 1, false, z, 4, p(jn5Var2), -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void B(int i, int i2, boolean z) {
        ?? r3;
        int i3 = 0;
        if (z && i != -1) {
            r3 = 1;
        } else {
            r3 = 0;
        }
        if (r3 != 0 && i != 1) {
            i3 = 1;
        }
        jn5 jn5Var = this.S;
        if (jn5Var.l == r3 && jn5Var.m == i3) {
            return;
        }
        this.y++;
        jn5 c = jn5Var.c(i3, r3);
        dl4 dl4Var = (dl4) this.j.W;
        dl4Var.getClass();
        mk4 d = dl4.d();
        d.a = dl4Var.a.obtainMessage(1, r3, i3);
        d.a();
        C(c, 0, i2, false, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x02ca, code lost:
        if (r4 != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:218:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x051e A[LOOP:0: B:244:0x0516->B:246:0x051e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0531 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x053e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x054b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x055e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x056c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0587 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0595 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05e4 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(jn5 jn5Var, int i, int i2, boolean z, boolean z2, int i3, long j, int i4) {
        Pair pair;
        int i5;
        final el2 el2Var;
        int e;
        boolean z3;
        boolean z4;
        jn5 jn5Var2;
        boolean z5;
        kd3 k;
        boolean z6;
        kd3 k2;
        boolean z7;
        kd3 k3;
        q43 q43Var;
        boolean z8;
        kd3 k4;
        boolean z9;
        boolean z10;
        boolean o;
        hp1 hp1Var;
        int i6;
        boolean z11;
        q43 q43Var2;
        int i7;
        Object obj;
        el2 el2Var2;
        Object obj2;
        int i8;
        long j2;
        long j3;
        Object obj3;
        el2 el2Var3;
        Object obj4;
        int i9;
        jn5 jn5Var3 = this.S;
        this.S = jn5Var;
        boolean z12 = !jn5Var3.a.equals(jn5Var.a);
        kd3 kd3Var = jn5Var3.a;
        kd3 kd3Var2 = jn5Var.a;
        if (kd3Var2.o() && kd3Var.o()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (kd3Var2.o() != kd3Var.o()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (kd3Var.e(kd3Var.n(jn5Var3.b.a, this.m).c, this.a, 0L).a.equals(kd3Var2.e(kd3Var2.n(jn5Var.b.a, this.m).c, this.a, 0L).a)) {
            pair = (z2 && i3 == 0 && jn5Var3.b.d < jn5Var.b.d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z2 && i3 == 0) {
                i5 = 1;
            } else if (z2 && i3 == 1) {
                i5 = 2;
            } else if (!z12) {
                throw new IllegalStateException();
            } else {
                i5 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        nq2 nq2Var = this.E;
        if (booleanValue) {
            el2Var = !jn5Var.a.o() ? jn5Var.a.e(jn5Var.a.n(jn5Var.b.a, this.m).c, this.a, 0L).b : null;
            this.R = nq2.y;
        } else {
            el2Var = null;
        }
        if (booleanValue || !jn5Var3.j.equals(jn5Var.j)) {
            nq2 nq2Var2 = this.R;
            nq2Var2.getClass();
            vo2 vo2Var = new vo2(nq2Var2);
            List list = jn5Var.j;
            for (int i10 = 0; i10 < list.size(); i10++) {
                yt2 yt2Var = (yt2) list.get(i10);
                int i11 = 0;
                while (true) {
                    et2[] et2VarArr = yt2Var.P;
                    if (i11 < et2VarArr.length) {
                        et2VarArr[i11].w(vo2Var);
                        i11++;
                    }
                }
            }
            this.R = new nq2(vo2Var);
            kd3 k5 = k();
            if (k5.o()) {
                nq2Var = this.R;
            } else {
                el2 el2Var4 = k5.e(i(), this.a, 0L).b;
                nq2 nq2Var3 = this.R;
                nq2Var3.getClass();
                vo2 vo2Var2 = new vo2(nq2Var3);
                nq2 nq2Var4 = el2Var4.d;
                if (nq2Var4 != null) {
                    CharSequence charSequence = nq2Var4.a;
                    if (charSequence != null) {
                        vo2Var2.a = charSequence;
                    }
                    CharSequence charSequence2 = nq2Var4.b;
                    if (charSequence2 != null) {
                        vo2Var2.b = charSequence2;
                    }
                    CharSequence charSequence3 = nq2Var4.c;
                    if (charSequence3 != null) {
                        vo2Var2.c = charSequence3;
                    }
                    CharSequence charSequence4 = nq2Var4.d;
                    if (charSequence4 != null) {
                        vo2Var2.d = charSequence4;
                    }
                    CharSequence charSequence5 = nq2Var4.e;
                    if (charSequence5 != null) {
                        vo2Var2.e = charSequence5;
                    }
                    byte[] bArr = nq2Var4.f;
                    if (bArr != null) {
                        Integer num = nq2Var4.g;
                        vo2Var2.f = (byte[]) bArr.clone();
                        vo2Var2.g = num;
                    }
                    Integer num2 = nq2Var4.h;
                    if (num2 != null) {
                        vo2Var2.h = num2;
                    }
                    Integer num3 = nq2Var4.i;
                    if (num3 != null) {
                        vo2Var2.i = num3;
                    }
                    Integer num4 = nq2Var4.j;
                    if (num4 != null) {
                        vo2Var2.j = num4;
                    }
                    Boolean bool = nq2Var4.k;
                    if (bool != null) {
                        vo2Var2.k = bool;
                    }
                    Integer num5 = nq2Var4.l;
                    if (num5 != null) {
                        vo2Var2.l = num5;
                    }
                    Integer num6 = nq2Var4.m;
                    if (num6 != null) {
                        vo2Var2.l = num6;
                    }
                    Integer num7 = nq2Var4.n;
                    if (num7 != null) {
                        vo2Var2.m = num7;
                    }
                    Integer num8 = nq2Var4.o;
                    if (num8 != null) {
                        vo2Var2.n = num8;
                    }
                    Integer num9 = nq2Var4.p;
                    if (num9 != null) {
                        vo2Var2.o = num9;
                    }
                    Integer num10 = nq2Var4.q;
                    if (num10 != null) {
                        vo2Var2.p = num10;
                    }
                    Integer num11 = nq2Var4.r;
                    if (num11 != null) {
                        vo2Var2.q = num11;
                    }
                    CharSequence charSequence6 = nq2Var4.s;
                    if (charSequence6 != null) {
                        vo2Var2.r = charSequence6;
                    }
                    CharSequence charSequence7 = nq2Var4.t;
                    if (charSequence7 != null) {
                        vo2Var2.s = charSequence7;
                    }
                    CharSequence charSequence8 = nq2Var4.u;
                    if (charSequence8 != null) {
                        vo2Var2.t = charSequence8;
                    }
                    CharSequence charSequence9 = nq2Var4.v;
                    if (charSequence9 != null) {
                        vo2Var2.u = charSequence9;
                    }
                    CharSequence charSequence10 = nq2Var4.w;
                    if (charSequence10 != null) {
                        vo2Var2.v = charSequence10;
                    }
                    Integer num12 = nq2Var4.x;
                    if (num12 != null) {
                        vo2Var2.w = num12;
                    }
                }
                nq2Var = new nq2(vo2Var2);
            }
        }
        boolean z13 = !nq2Var.equals(this.E);
        this.E = nq2Var;
        boolean z14 = jn5Var3.l != jn5Var.l;
        boolean z15 = jn5Var3.e != jn5Var.e;
        if ((z15 || z14) && ((e = e()) == 2 || e == 3)) {
            D();
            boolean z16 = this.S.o;
            r();
            r();
        }
        boolean z17 = jn5Var3.g != jn5Var.g;
        if (z12) {
            this.k.b(0, new pp1(jn5Var, i));
        }
        if (z2) {
            ya3 ya3Var = new ya3();
            if (jn5Var3.a.o()) {
                z3 = z14;
                z4 = z17;
                i7 = i4;
                obj = null;
                el2Var2 = null;
                obj2 = null;
                i8 = -1;
            } else {
                Object obj5 = jn5Var3.b.a;
                jn5Var3.a.n(obj5, ya3Var);
                int i12 = ya3Var.c;
                int a = jn5Var3.a.a(obj5);
                z3 = z14;
                z4 = z17;
                obj2 = obj5;
                obj = jn5Var3.a.e(i12, this.a, 0L).a;
                el2Var2 = this.a.b;
                i7 = i12;
                i8 = a;
            }
            boolean a2 = jn5Var3.b.a();
            if (i3 != 0) {
                j2 = jn5Var3.r;
            } else if (a2) {
                ov5 ov5Var = jn5Var3.b;
                j2 = ya3Var.b(ov5Var.b, ov5Var.c);
                j3 = q(jn5Var3);
            } else {
                j2 = jn5Var3.b.e != -1 ? q(this.S) : ya3Var.d;
                j3 = j2;
            }
            int i13 = zn4.a;
            ov5 ov5Var2 = jn5Var3.b;
            q63 q63Var = new q63(obj, i7, el2Var2, obj2, i8, zn4.s(j2), zn4.s(j3), ov5Var2.b, ov5Var2.c);
            int i14 = i();
            if (this.S.a.o()) {
                obj3 = null;
                el2Var3 = null;
                obj4 = null;
                i9 = -1;
            } else {
                jn5 jn5Var4 = this.S;
                Object obj6 = jn5Var4.b.a;
                jn5Var4.a.n(obj6, this.m);
                i9 = this.S.a.a(obj6);
                obj3 = this.S.a.e(i14, this.a, 0L).a;
                el2Var3 = this.a.b;
                obj4 = obj6;
            }
            long s = zn4.s(j);
            long s2 = this.S.b.a() ? zn4.s(q(this.S)) : s;
            ov5 ov5Var3 = this.S.b;
            this.k.b(11, new kl5(i3, q63Var, new q63(obj3, i14, el2Var3, obj4, i9, s, s2, ov5Var3.b, ov5Var3.c)));
        } else {
            z3 = z14;
            z4 = z17;
        }
        if (booleanValue) {
            this.k.b(1, new v64() { // from class: ll5
                @Override // defpackage.v64
                /* renamed from: e */
                public final void mo5e(Object obj7) {
                    el2 el2Var5 = el2.this;
                    int i15 = intValue;
                    int i16 = bm5.X;
                    ((b53) obj7).i(el2Var5, i15);
                }
            });
        }
        if (jn5Var3.f != jn5Var.f) {
            this.k.b(10, new nt2(4, jn5Var));
            if (jn5Var.f != null) {
                this.k.b(10, new ez1(3, jn5Var));
            }
        }
        xy5 xy5Var = jn5Var3.i;
        xy5 xy5Var2 = jn5Var.i;
        if (xy5Var != xy5Var2) {
            this.h.e(xy5Var2.e);
            this.k.b(2, new z63(6, jn5Var));
        }
        if (z13) {
            this.k.b(14, new zw5(8, this.E));
        }
        if (z4) {
            this.k.b(3, new om1(5, jn5Var));
        }
        if (z15 || z3) {
            this.k.b(-1, new jz1(8, jn5Var));
        }
        if (z15) {
            this.k.b(4, new gr3(2, jn5Var));
        }
        if (z3) {
            this.k.b(5, new id4(i2, jn5Var));
        }
        if (jn5Var3.m != jn5Var.m) {
            this.k.b(6, new s82(10, jn5Var));
        }
        if (G(jn5Var3) != G(jn5Var)) {
            this.k.b(7, new d60(8, jn5Var));
        }
        if (!jn5Var3.n.equals(jn5Var.n)) {
            this.k.b(12, new e83(6, jn5Var));
        }
        if (z) {
            this.k.b(-1, new v64() { // from class: jl5
                @Override // defpackage.v64
                /* renamed from: e */
                public final void mo5e(Object obj7) {
                    ((b53) obj7).m();
                }
            });
        }
        q43 q43Var3 = this.D;
        o73 o73Var = this.f;
        q43 q43Var4 = this.c;
        int i15 = zn4.a;
        boolean F = o73Var.F();
        ro5 ro5Var = (ro5) o73Var;
        kd3 k6 = ro5Var.k();
        if (k6.o()) {
            jn5Var2 = jn5Var3;
        } else {
            jn5Var2 = jn5Var3;
            if (k6.e(ro5Var.i(), ro5Var.a, 0L).f) {
                z5 = true;
                k = ro5Var.k();
                if (!k.o()) {
                    int i16 = ro5Var.i();
                    ro5Var.f();
                    ro5Var.E();
                    if (k.k(i16) != -1) {
                        z6 = true;
                        k2 = ro5Var.k();
                        if (!k2.o()) {
                            int i17 = ro5Var.i();
                            ro5Var.f();
                            ro5Var.E();
                            if (k2.j(i17, 0, false) != -1) {
                                z7 = true;
                                k3 = ro5Var.k();
                                if (k3.o()) {
                                    q43Var = q43Var3;
                                    if (k3.e(ro5Var.i(), ro5Var.a, 0L).b()) {
                                        z8 = true;
                                        k4 = ro5Var.k();
                                        if (k4.o()) {
                                            z9 = z5;
                                        } else {
                                            z9 = z5;
                                            if (k4.e(ro5Var.i(), ro5Var.a, 0L).g) {
                                                z10 = true;
                                                o = o73Var.k().o();
                                                dn1 dn1Var = new dn1();
                                                hp1Var = q43Var4.a;
                                                for (i6 = 0; i6 < hp1Var.a.size(); i6++) {
                                                    dn1Var.a(hp1Var.a(i6));
                                                }
                                                z11 = !F;
                                                if (z11) {
                                                    dn1Var.a(4);
                                                }
                                                if ((z9 || F) ? false : true) {
                                                    dn1Var.a(5);
                                                }
                                                if ((z6 || F) ? false : true) {
                                                    dn1Var.a(6);
                                                }
                                                if (o && (z6 || !z8 || z9) && !F) {
                                                    dn1Var.a(7);
                                                }
                                                if ((z7 || F) ? false : true) {
                                                    dn1Var.a(8);
                                                }
                                                if (o && (z7 || (z8 && z10)) && !F) {
                                                    dn1Var.a(9);
                                                }
                                                if (z11) {
                                                    dn1Var.a(10);
                                                }
                                                if ((z9 || F) ? false : true) {
                                                    dn1Var.a(11);
                                                }
                                                if ((z9 || F) ? false : true) {
                                                    dn1Var.a(12);
                                                }
                                                q43Var2 = new q43(dn1Var.b());
                                                this.D = q43Var2;
                                                if (!q43Var2.equals(q43Var)) {
                                                    this.k.b(13, new wv1(6, this));
                                                }
                                                this.k.a();
                                                if (jn5Var2.o == jn5Var.o) {
                                                    Iterator it = this.l.iterator();
                                                    while (it.hasNext()) {
                                                        ((uk5) it.next()).a();
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        o = o73Var.k().o();
                                        dn1 dn1Var2 = new dn1();
                                        hp1Var = q43Var4.a;
                                        while (i6 < hp1Var.a.size()) {
                                        }
                                        z11 = !F;
                                        if (z11) {
                                        }
                                        if ((z9 || F) ? false : true) {
                                        }
                                        if ((z6 || F) ? false : true) {
                                        }
                                        if (o && (z6 || !z8 || z9) && !F) {
                                        }
                                        if ((z7 || F) ? false : true) {
                                        }
                                        if (o && (z7 || (z8 && z10)) && !F) {
                                        }
                                        if (z11) {
                                        }
                                        if ((z9 || F) ? false : true) {
                                        }
                                        if ((z9 || F) ? false : true) {
                                        }
                                        q43Var2 = new q43(dn1Var2.b());
                                        this.D = q43Var2;
                                        if (!q43Var2.equals(q43Var)) {
                                        }
                                        this.k.a();
                                        if (jn5Var2.o == jn5Var.o) {
                                        }
                                    }
                                } else {
                                    q43Var = q43Var3;
                                }
                                z8 = false;
                                k4 = ro5Var.k();
                                if (k4.o()) {
                                }
                                z10 = false;
                                o = o73Var.k().o();
                                dn1 dn1Var22 = new dn1();
                                hp1Var = q43Var4.a;
                                while (i6 < hp1Var.a.size()) {
                                }
                                z11 = !F;
                                if (z11) {
                                }
                                if ((z9 || F) ? false : true) {
                                }
                                if ((z6 || F) ? false : true) {
                                }
                                if (o && (z6 || !z8 || z9) && !F) {
                                }
                                if ((z7 || F) ? false : true) {
                                }
                                if (o && (z7 || (z8 && z10)) && !F) {
                                }
                                if (z11) {
                                }
                                if ((z9 || F) ? false : true) {
                                }
                                if ((z9 || F) ? false : true) {
                                }
                                q43Var2 = new q43(dn1Var22.b());
                                this.D = q43Var2;
                                if (!q43Var2.equals(q43Var)) {
                                }
                                this.k.a();
                                if (jn5Var2.o == jn5Var.o) {
                                }
                            }
                        }
                        z7 = false;
                        k3 = ro5Var.k();
                        if (k3.o()) {
                        }
                        z8 = false;
                        k4 = ro5Var.k();
                        if (k4.o()) {
                        }
                        z10 = false;
                        o = o73Var.k().o();
                        dn1 dn1Var222 = new dn1();
                        hp1Var = q43Var4.a;
                        while (i6 < hp1Var.a.size()) {
                        }
                        z11 = !F;
                        if (z11) {
                        }
                        if ((z9 || F) ? false : true) {
                        }
                        if ((z6 || F) ? false : true) {
                        }
                        if (o && (z6 || !z8 || z9) && !F) {
                        }
                        if ((z7 || F) ? false : true) {
                        }
                        if (o && (z7 || (z8 && z10)) && !F) {
                        }
                        if (z11) {
                        }
                        if ((z9 || F) ? false : true) {
                        }
                        if ((z9 || F) ? false : true) {
                        }
                        q43Var2 = new q43(dn1Var222.b());
                        this.D = q43Var2;
                        if (!q43Var2.equals(q43Var)) {
                        }
                        this.k.a();
                        if (jn5Var2.o == jn5Var.o) {
                        }
                    }
                }
                z6 = false;
                k2 = ro5Var.k();
                if (!k2.o()) {
                }
                z7 = false;
                k3 = ro5Var.k();
                if (k3.o()) {
                }
                z8 = false;
                k4 = ro5Var.k();
                if (k4.o()) {
                }
                z10 = false;
                o = o73Var.k().o();
                dn1 dn1Var2222 = new dn1();
                hp1Var = q43Var4.a;
                while (i6 < hp1Var.a.size()) {
                }
                z11 = !F;
                if (z11) {
                }
                if ((z9 || F) ? false : true) {
                }
                if ((z6 || F) ? false : true) {
                }
                if (o && (z6 || !z8 || z9) && !F) {
                }
                if ((z7 || F) ? false : true) {
                }
                if (o && (z7 || (z8 && z10)) && !F) {
                }
                if (z11) {
                }
                if ((z9 || F) ? false : true) {
                }
                if ((z9 || F) ? false : true) {
                }
                q43Var2 = new q43(dn1Var2222.b());
                this.D = q43Var2;
                if (!q43Var2.equals(q43Var)) {
                }
                this.k.a();
                if (jn5Var2.o == jn5Var.o) {
                }
            }
        }
        z5 = false;
        k = ro5Var.k();
        if (!k.o()) {
        }
        z6 = false;
        k2 = ro5Var.k();
        if (!k2.o()) {
        }
        z7 = false;
        k3 = ro5Var.k();
        if (k3.o()) {
        }
        z8 = false;
        k4 = ro5Var.k();
        if (k4.o()) {
        }
        z10 = false;
        o = o73Var.k().o();
        dn1 dn1Var22222 = new dn1();
        hp1Var = q43Var4.a;
        while (i6 < hp1Var.a.size()) {
        }
        z11 = !F;
        if (z11) {
        }
        if ((z9 || F) ? false : true) {
        }
        if ((z6 || F) ? false : true) {
        }
        if (o && (z6 || !z8 || z9) && !F) {
        }
        if ((z7 || F) ? false : true) {
        }
        if (o && (z7 || (z8 && z10)) && !F) {
        }
        if (z11) {
        }
        if ((z9 || F) ? false : true) {
        }
        if ((z9 || F) ? false : true) {
        }
        q43Var2 = new q43(dn1Var22222.b());
        this.D = q43Var2;
        if (!q43Var2.equals(q43Var)) {
        }
        this.k.a();
        if (jn5Var2.o == jn5Var.o) {
        }
    }

    public final void D() {
        this.d.a();
        if (Thread.currentThread() != this.q.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.q.getThread().getName());
            if (this.O) {
                throw new IllegalStateException(format);
            }
            lb4.d("ExoPlayerImpl", format, this.P ? null : new IllegalStateException());
            this.P = true;
        }
    }

    @Override // defpackage.o73
    public final void E() {
        D();
    }

    @Override // defpackage.o73
    public final boolean F() {
        D();
        return this.S.b.a();
    }

    public final long H() {
        D();
        if (F()) {
            jn5 jn5Var = this.S;
            if (jn5Var.k.equals(jn5Var.b)) {
                return zn4.s(this.S.p);
            }
            return I();
        }
        D();
        if (this.S.a.o()) {
            return this.U;
        }
        jn5 jn5Var2 = this.S;
        long j = 0;
        if (jn5Var2.k.d != jn5Var2.b.d) {
            return zn4.s(jn5Var2.a.e(i(), this.a, 0L).k);
        }
        long j2 = jn5Var2.p;
        if (this.S.k.a()) {
            jn5 jn5Var3 = this.S;
            ya3 n = jn5Var3.a.n(jn5Var3.k.a, this.m);
            n.f.a(this.S.k.b).getClass();
        } else {
            j = j2;
        }
        jn5 jn5Var4 = this.S;
        jn5Var4.a.n(jn5Var4.k.a, this.m);
        return zn4.s(j);
    }

    public final long I() {
        long b;
        D();
        if (F()) {
            jn5 jn5Var = this.S;
            ov5 ov5Var = jn5Var.b;
            jn5Var.a.n(ov5Var.a, this.m);
            b = this.m.b(ov5Var.b, ov5Var.c);
        } else {
            kd3 k = k();
            if (k.o()) {
                return -9223372036854775807L;
            }
            b = k.e(i(), this.a, 0L).k;
        }
        return zn4.s(b);
    }

    public final void J() {
        int i;
        int i2;
        D();
        boolean r = r();
        this.v.a();
        if (r) {
            i = 1;
        } else {
            i = -1;
        }
        int i3 = 2;
        if (r && i != 1) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        B(i, i2, r);
        jn5 jn5Var = this.S;
        if (jn5Var.e != 1) {
            return;
        }
        jn5 d = jn5Var.d(null);
        if (true == d.a.o()) {
            i3 = 4;
        }
        jn5 e = d.e(i3);
        this.y++;
        dl4 dl4Var = (dl4) this.j.W;
        dl4Var.getClass();
        mk4 d2 = dl4.d();
        d2.a = dl4Var.a.obtainMessage(0);
        d2.a();
        C(e, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void K() {
        String str;
        boolean z;
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = zn4.e;
        HashSet hashSet = gm2.a;
        synchronized (gm2.class) {
            str = gm2.b;
        }
        String d = qq.d(sd1.b("Release ", hexString, " [AndroidXMedia3/1.0.0-rc02] [", str2, "] ["), str, "]");
        synchronized (lb4.a) {
            Log.i("ExoPlayerImpl", d);
        }
        D();
        if (zn4.a < 21 && (audioTrack = this.F) != null) {
            audioTrack.release();
            this.F = null;
        }
        go5 go5Var = this.w;
        fo5 fo5Var = go5Var.e;
        if (fo5Var != null) {
            try {
                go5Var.a.unregisterReceiver(fo5Var);
            } catch (RuntimeException e) {
                lb4.d("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            go5Var.e = null;
        }
        lk5 lk5Var = this.v;
        lk5Var.c = null;
        lk5Var.a();
        im5 im5Var = this.j;
        synchronized (im5Var) {
            if (!im5Var.l0 && im5Var.Y.getThread().isAlive()) {
                ((dl4) im5Var.W).c(7);
                long j = im5Var.h0;
                synchronized (im5Var) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() + j;
                    boolean z2 = false;
                    while (!Boolean.valueOf(im5Var.l0).booleanValue() && j > 0) {
                        try {
                            im5Var.wait(j);
                        } catch (InterruptedException unused) {
                            z2 = true;
                        }
                        j = elapsedRealtime - SystemClock.elapsedRealtime();
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    z = im5Var.l0;
                }
            }
            z = true;
        }
        if (!z) {
            i94 i94Var = this.k;
            i94Var.b(10, new v64() { // from class: hl5
                @Override // defpackage.v64
                /* renamed from: e */
                public final void mo5e(Object obj) {
                    ((b53) obj).q(new tk5(2, new jm5(1), 1003));
                }
            });
            i94Var.a();
        }
        this.k.c();
        ((dl4) this.i).a.removeCallbacksAndMessages(null);
        this.r.Q.a(this.p);
        jn5 e2 = this.S.e(1);
        this.S = e2;
        jn5 a = e2.a(e2.b);
        this.S = a;
        a.p = a.r;
        this.S.q = 0L;
        pp5 pp5Var = this.p;
        a54 a54Var = pp5Var.W;
        tv2.B(a54Var);
        ((dl4) a54Var).b(new j02(6, pp5Var));
        this.h.a();
        Surface surface = this.H;
        if (surface != null) {
            surface.release();
            this.H = null;
        }
        int i = nv3.a;
    }

    public final void L(boolean z) {
        int i;
        D();
        lk5 lk5Var = this.v;
        e();
        lk5Var.a();
        int i2 = 1;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        if (z && i != 1) {
            i2 = 2;
        }
        B(i, i2, z);
    }

    public final void M(Surface surface) {
        D();
        z(surface);
        int i = surface == null ? 0 : -1;
        x(i, i);
    }

    public final void N() {
        D();
        D();
        lk5 lk5Var = this.v;
        r();
        lk5Var.a();
        A(null);
        nw4 nw4Var = nw4.T;
        long j = this.S.r;
        new nv3(nw4Var);
    }

    public final void O() {
        D();
        int length = this.g.length;
    }

    public final void P(jo5 jo5Var) {
        pp5 pp5Var = this.p;
        jo5Var.getClass();
        i94 i94Var = pp5Var.U;
        synchronized (i94Var.g) {
            if (!i94Var.h) {
                i94Var.d.add(new l84(jo5Var));
            }
        }
    }

    @Override // defpackage.ro5
    public final void a(int i, long j) {
        boolean z;
        D();
        int i2 = 1;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        tv2.G(z);
        pp5 pp5Var = this.p;
        if (!pp5Var.X) {
            io5 B = pp5Var.B();
            pp5Var.X = true;
            pp5Var.D(B, -1, new to5(0));
        }
        kd3 kd3Var = this.S.a;
        if (!kd3Var.o() && i >= kd3Var.c()) {
            return;
        }
        this.y++;
        if (F()) {
            lb4.c("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            gm5 gm5Var = new gm5(this.S);
            gm5Var.a(1);
            bm5 bm5Var = (bm5) this.V.Q;
            ((dl4) bm5Var.i).b(new yr1(2, bm5Var, gm5Var));
            return;
        }
        if (e() != 1) {
            i2 = 2;
        }
        int i3 = i();
        jn5 v = v(this.S.e(i2), kd3Var, s(kd3Var, i, j));
        ((dl4) this.j.W).a(3, new hm5(kd3Var, i, zn4.q(j))).a();
        C(v, 0, 1, true, true, 1, p(v), i3);
    }

    @Override // defpackage.o73
    public final int b() {
        D();
        if (this.S.a.o()) {
            return 0;
        }
        jn5 jn5Var = this.S;
        return jn5Var.a.a(jn5Var.b.a);
    }

    @Override // defpackage.o73
    public final int c() {
        D();
        if (F()) {
            return this.S.b.b;
        }
        return -1;
    }

    @Override // defpackage.o73
    public final int d() {
        D();
        if (F()) {
            return this.S.b.c;
        }
        return -1;
    }

    @Override // defpackage.o73
    public final int e() {
        D();
        return this.S.e;
    }

    @Override // defpackage.o73
    public final void f() {
        D();
    }

    public final void g(jo5 jo5Var) {
        D();
        i94 i94Var = this.p.U;
        i94Var.d();
        Iterator it = i94Var.d.iterator();
        while (it.hasNext()) {
            l84 l84Var = (l84) it.next();
            if (l84Var.a.equals(jo5Var)) {
                o74 o74Var = i94Var.c;
                l84Var.d = true;
                if (l84Var.c) {
                    l84Var.c = false;
                    o74Var.f(l84Var.a, l84Var.b.b());
                }
                i94Var.d.remove(l84Var);
            }
        }
    }

    @Override // defpackage.o73
    public final int h() {
        D();
        return this.S.m;
    }

    @Override // defpackage.o73
    public final int i() {
        D();
        int n = n();
        if (n == -1) {
            return 0;
        }
        return n;
    }

    @Override // defpackage.o73
    public final long j() {
        D();
        if (F()) {
            jn5 jn5Var = this.S;
            jn5Var.a.n(jn5Var.b.a, this.m);
            jn5 jn5Var2 = this.S;
            long j = jn5Var2.c;
            if (j == -9223372036854775807L) {
                jn5Var2.a.e(i(), this.a, 0L).getClass();
                return zn4.s(0L);
            }
            return zn4.s(j) + zn4.s(0L);
        }
        return l();
    }

    @Override // defpackage.o73
    public final kd3 k() {
        D();
        return this.S.a;
    }

    @Override // defpackage.o73
    public final long l() {
        D();
        return zn4.s(p(this.S));
    }

    public final void m(nu5 nu5Var) {
        boolean z;
        D();
        List singletonList = Collections.singletonList(nu5Var);
        D();
        D();
        n();
        l();
        this.y++;
        if (!this.n.isEmpty()) {
            int size = this.n.size();
            for (int i = size - 1; i >= 0; i--) {
                this.n.remove(i);
            }
            yw5 yw5Var = this.W;
            int[] iArr = new int[yw5Var.b.length - size];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int[] iArr2 = yw5Var.b;
                if (i2 >= iArr2.length) {
                    break;
                }
                int i4 = iArr2[i2];
                if (i4 >= 0 && i4 < size) {
                    i3++;
                } else {
                    int i5 = i2 - i3;
                    if (i4 >= 0) {
                        i4 -= size;
                    }
                    iArr[i5] = i4;
                }
                i2++;
            }
            this.W = new yw5(iArr, new Random(yw5Var.a.nextLong()));
        }
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < singletonList.size(); i6++) {
            gn5 gn5Var = new gn5((qv5) singletonList.get(i6), this.o);
            arrayList.add(gn5Var);
            this.n.add(i6, new zl5(gn5Var.b, gn5Var.a.o));
        }
        this.W = this.W.a(arrayList.size());
        nn5 nn5Var = new nn5(this.n, this.W);
        if (!nn5Var.o() && nn5Var.d < 0) {
            throw new vx1();
        }
        int g = nn5Var.g(false);
        jn5 v = v(this.S, nn5Var, s(nn5Var, g, -9223372036854775807L));
        int i7 = v.e;
        if (g != -1 && i7 != 1) {
            i7 = (nn5Var.o() || g >= nn5Var.d) ? 4 : 2;
        }
        jn5 e = v.e(i7);
        ((dl4) this.j.W).a(17, new dm5(arrayList, this.W, g, zn4.q(-9223372036854775807L))).a();
        if (!this.S.b.a.equals(e.b.a) && !this.S.a.o()) {
            z = true;
        } else {
            z = false;
        }
        C(e, 0, 1, false, z, 4, p(e), -1);
    }

    public final int n() {
        if (this.S.a.o()) {
            return this.T;
        }
        jn5 jn5Var = this.S;
        return jn5Var.a.n(jn5Var.b.a, this.m).c;
    }

    @Override // defpackage.o73
    public final long o() {
        D();
        return zn4.s(this.S.q);
    }

    public final long p(jn5 jn5Var) {
        if (jn5Var.a.o()) {
            return zn4.q(this.U);
        }
        if (jn5Var.b.a()) {
            return jn5Var.r;
        }
        kd3 kd3Var = jn5Var.a;
        ov5 ov5Var = jn5Var.b;
        long j = jn5Var.r;
        kd3Var.n(ov5Var.a, this.m);
        return j;
    }

    @Override // defpackage.o73
    public final boolean r() {
        D();
        return this.S.l;
    }

    public final Pair s(kd3 kd3Var, int i, long j) {
        if (kd3Var.o()) {
            this.T = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.U = j;
            return null;
        }
        if (i == -1 || i >= kd3Var.c()) {
            i = kd3Var.g(false);
            kd3Var.e(i, this.a, 0L).getClass();
            j = zn4.s(0L);
        }
        return kd3Var.l(this.a, this.m, i, zn4.q(j));
    }

    @Override // defpackage.o73
    public final vk3 t() {
        D();
        return this.S.i.d;
    }

    public final jn5 v(jn5 jn5Var, kd3 kd3Var, Pair pair) {
        boolean z;
        ov5 ov5Var;
        hx5 hx5Var;
        xy5 xy5Var;
        List list;
        jn5 b;
        long j;
        long j2;
        if (!kd3Var.o() && pair == null) {
            z = false;
        } else {
            z = true;
        }
        tv2.G(z);
        kd3 kd3Var2 = jn5Var.a;
        jn5 f = jn5Var.f(kd3Var);
        if (kd3Var.o()) {
            ov5 ov5Var2 = jn5.s;
            long q = zn4.q(this.U);
            jn5 a = f.b(ov5Var2, q, q, q, 0L, hx5.d, this.b, nw4.T).a(ov5Var2);
            a.p = a.r;
            return a;
        }
        Object obj = f.b.a;
        int i = zn4.a;
        boolean z2 = !obj.equals(pair.first);
        if (z2) {
            ov5Var = new ov5(pair.first);
        } else {
            ov5Var = f.b;
        }
        ov5 ov5Var3 = ov5Var;
        long longValue = ((Long) pair.second).longValue();
        long q2 = zn4.q(j());
        if (!kd3Var2.o()) {
            kd3Var2.n(obj, this.m);
        }
        if (!z2 && longValue >= q2) {
            if (longValue == q2) {
                int a2 = kd3Var.a(f.k.a);
                if (a2 == -1 || kd3Var.d(a2, this.m, false).c != kd3Var.n(ov5Var3.a, this.m).c) {
                    kd3Var.n(ov5Var3.a, this.m);
                    if (ov5Var3.a()) {
                        j2 = this.m.b(ov5Var3.b, ov5Var3.c);
                    } else {
                        j2 = this.m.d;
                    }
                    b = f.b(ov5Var3, f.r, f.r, f.d, j2 - f.r, f.h, f.i, f.j).a(ov5Var3);
                    j = j2;
                } else {
                    return f;
                }
            } else {
                tv2.I(!ov5Var3.a());
                long max = Math.max(0L, f.q - (longValue - q2));
                long j3 = f.p;
                if (f.k.equals(f.b)) {
                    j3 = longValue + max;
                }
                b = f.b(ov5Var3, longValue, longValue, longValue, max, f.h, f.i, f.j);
                j = j3;
            }
            b.p = j;
            return b;
        }
        tv2.I(!ov5Var3.a());
        if (z2) {
            hx5Var = hx5.d;
        } else {
            hx5Var = f.h;
        }
        hx5 hx5Var2 = hx5Var;
        if (z2) {
            xy5Var = this.b;
        } else {
            xy5Var = f.i;
        }
        xy5 xy5Var2 = xy5Var;
        if (z2) {
            lv4 lv4Var = nv4.Q;
            list = nw4.T;
        } else {
            list = f.j;
        }
        jn5 a3 = f.b(ov5Var3, longValue, longValue, longValue, 0L, hx5Var2, xy5Var2, list).a(ov5Var3);
        a3.p = longValue;
        return a3;
    }

    public final mn5 w(mk5 mk5Var) {
        n();
        im5 im5Var = this.j;
        kd3 kd3Var = this.S.a;
        return new mn5(im5Var, mk5Var, this.s, im5Var.Y);
    }

    public final void x(final int i, final int i2) {
        ai4 ai4Var = this.J;
        if (i == ai4Var.a && i2 == ai4Var.b) {
            return;
        }
        this.J = new ai4(i, i2);
        i94 i94Var = this.k;
        i94Var.b(24, new v64() { // from class: il5
            @Override // defpackage.v64
            /* renamed from: e */
            public final void mo5e(Object obj) {
                int i3 = i;
                int i4 = i2;
                int i5 = bm5.X;
                ((b53) obj).z(i3, i4);
            }
        });
        i94Var.a();
        y(2, 14, new ai4(i, i2));
    }

    public final void y(int i, int i2, Object obj) {
        mk5[] mk5VarArr = this.g;
        int length = mk5VarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            mk5 mk5Var = mk5VarArr[i3];
            if (mk5Var.P == i) {
                mn5 w = w(mk5Var);
                tv2.I(!w.f);
                w.c = i2;
                tv2.I(!w.f);
                w.d = obj;
                w.b();
            }
        }
    }

    public final void z(Object obj) {
        ArrayList arrayList = new ArrayList();
        mk5[] mk5VarArr = this.g;
        int length = mk5VarArr.length;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            mk5 mk5Var = mk5VarArr[i];
            if (mk5Var.P == 2) {
                mn5 w = w(mk5Var);
                tv2.I(!w.f);
                w.c = 1;
                tv2.I(true ^ w.f);
                w.d = obj;
                w.b();
                arrayList.add(w);
            }
        }
        Object obj2 = this.G;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((mn5) it.next()).d(this.x);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.G;
            Surface surface = this.H;
            if (obj3 == surface) {
                surface.release();
                this.H = null;
            }
        }
        this.G = obj;
        if (z) {
            A(new tk5(2, new jm5(3), 1003));
        }
    }
}