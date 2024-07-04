package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: l03  reason: default package */
public final class l03 extends yx2 implements bf5, jo5 {
    public static final /* synthetic */ int l0 = 0;
    public final Context R;
    public final zz2 S;
    public final oy5 T;
    public final fy2 U;
    public final WeakReference V;
    public final ow5 W;
    public co5 X;
    public ByteBuffer Y;
    public boolean Z;
    public xx2 a0;
    public int b0;
    public int c0;
    public long d0;
    public final String e0;
    public final int f0;
    public Integer h0;
    public final ArrayList i0;
    public volatile b03 j0;
    public final Object g0 = new Object();
    public final HashSet k0 = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0105, code lost:
        if (((java.lang.Boolean) r2.c.a(defpackage.x92.x1)).booleanValue() == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l03(Context context, fy2 fy2Var, gy2 gy2Var, Integer num) {
        et4 jt4Var;
        int i;
        iu4 iu4Var;
        iu4 iu4Var2;
        Object obj;
        this.R = context;
        this.U = fy2Var;
        this.h0 = num;
        this.V = new WeakReference(gy2Var);
        zz2 zz2Var = new zz2();
        this.S = zz2Var;
        oy5 oy5Var = new oy5(context);
        this.T = oy5Var;
        if (vz3.m()) {
            vz3.k("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        yx2.P.incrementAndGet();
        gl5 gl5Var = new gl5(context, new u04(4, this));
        final boolean z = true;
        tv2.I(!gl5Var.p);
        gl5Var.e = new d22(6, oy5Var);
        tv2.I(!gl5Var.p);
        gl5Var.f = new wr1(7, zz2Var);
        tv2.I(!gl5Var.p);
        gl5Var.p = true;
        co5 co5Var = new co5(gl5Var);
        this.X = co5Var;
        co5Var.z(this);
        this.b0 = 0;
        this.d0 = 0L;
        this.c0 = 0;
        this.i0 = new ArrayList();
        this.j0 = null;
        String U = gy2Var != null ? gy2Var.U() : null;
        if (U == null) {
            jt4Var = rs4.P;
        } else {
            jt4Var = new jt4(U);
        }
        this.e0 = (String) jt4Var.b();
        if (gy2Var != null) {
            i = gy2Var.e();
        } else {
            i = 0;
        }
        this.f0 = i;
        final String r = jv5.A.c.r(context, gy2Var.k().P);
        if (this.Z && this.Y.limit() > 0) {
            byte[] bArr = new byte[this.Y.limit()];
            this.Y.get(bArr);
            iu4Var2 = new eg3(5, bArr);
        } else {
            l92 l92Var = x92.F1;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            }
            if (fy2Var.i) {
                z = false;
            }
            if (fy2Var.l) {
                iu4Var = new iu4() { // from class: i03
                    @Override // defpackage.iu4
                    /* renamed from: a */
                    public final fv4 mo4a() {
                        l03 l03Var = l03.this;
                        String str = r;
                        boolean z2 = z;
                        l03Var.getClass();
                        fy2 fy2Var2 = l03Var.U;
                        int i2 = fy2Var2.d;
                        int i3 = fy2Var2.e;
                        long j = fy2Var2.m;
                        long j2 = fy2Var2.n;
                        if (true != z2) {
                            l03Var = null;
                        }
                        return new o03(str, l03Var, i2, i3, j, j2);
                    }
                };
            } else if (fy2Var.h > 0) {
                iu4Var = new iu4() { // from class: j03
                    @Override // defpackage.iu4
                    /* renamed from: a */
                    public final fv4 mo4a() {
                        l03 l03Var = l03.this;
                        String str = r;
                        boolean z2 = z;
                        l03Var.getClass();
                        fy2 fy2Var2 = l03Var.U;
                        yz2 yz2Var = new yz2(str, true != z2 ? null : l03Var, fy2Var2.d, fy2Var2.e, fy2Var2.h);
                        l03Var.k0.add(new WeakReference(yz2Var));
                        return yz2Var;
                    }
                };
            } else {
                iu4Var = new iu4() { // from class: k03
                    @Override // defpackage.iu4
                    /* renamed from: a */
                    public final fv4 mo4a() {
                        l03 l03Var;
                        l03 l03Var2 = l03.this;
                        String str = r;
                        boolean z2 = z;
                        l03Var2.getClass();
                        o15 o15Var = new o15();
                        o15Var.R = str;
                        if (true != z2) {
                            l03Var = null;
                        } else {
                            l03Var = l03Var2;
                        }
                        o15Var.Q = l03Var;
                        fy2 fy2Var2 = l03Var2.U;
                        o15Var.S = fy2Var2.d;
                        o15Var.T = fy2Var2.e;
                        o15Var.U = true;
                        return o15Var.mo4a();
                    }
                };
            }
            if (fy2Var.i) {
                iu4Var2 = new yn2(this, iu4Var);
            } else {
                iu4Var2 = iu4Var;
            }
            ByteBuffer byteBuffer = this.Y;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                byte[] bArr2 = new byte[this.Y.limit()];
                this.Y.get(bArr2);
                iu4Var2 = new jk3(iu4Var2, bArr2);
            }
        }
        if (((Boolean) w82.d.c.a(x92.l)).booleanValue()) {
            obj = lp5.P;
        } else {
            obj = yf.S;
        }
        this.W = new ow5(iu4Var2, new ij2(7, obj));
    }

    @Override // defpackage.jo5
    public final /* synthetic */ void a(io5 io5Var, lv5 lv5Var) {
    }

    @Override // defpackage.jo5
    public final void b(cu1 cu1Var) {
        gy2 gy2Var = (gy2) this.V.get();
        if (((Boolean) w82.d.c.a(x92.x1)).booleanValue() && gy2Var != null && cu1Var != null) {
            HashMap hashMap = new HashMap();
            String str = cu1Var.j;
            if (str != null) {
                hashMap.put("audioMime", str);
            }
            String str2 = cu1Var.k;
            if (str2 != null) {
                hashMap.put("audioSampleMime", str2);
            }
            String str3 = cu1Var.h;
            if (str3 != null) {
                hashMap.put("audioCodec", str3);
            }
            gy2Var.a("onMetadataEvent", hashMap);
        }
    }

    @Override // defpackage.jo5
    public final void c(wo3 wo3Var) {
        xx2 xx2Var = this.a0;
        if (xx2Var != null) {
            xx2Var.c(wo3Var.a, wo3Var.b);
        }
    }

    @Override // defpackage.bf5
    public final void d() {
    }

    @Override // defpackage.jo5
    public final /* synthetic */ void e(nk5 nk5Var) {
    }

    @Override // defpackage.jo5
    public final void f(IOException iOException) {
        xx2 xx2Var = this.a0;
        if (xx2Var != null) {
            if (this.U.j) {
                xx2Var.f(iOException);
            } else {
                xx2Var.j("onLoadError", iOException);
            }
        }
    }

    public final void finalize() {
        yx2.P.decrementAndGet();
        if (vz3.m()) {
            vz3.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // defpackage.bf5
    public final void g(kz4 kz4Var, boolean z, int i) {
        this.b0 += i;
    }

    @Override // defpackage.bf5
    public final void h(kz4 kz4Var, boolean z) {
    }

    @Override // defpackage.bf5
    public final void i(fv4 fv4Var, kz4 kz4Var, boolean z) {
        if (fv4Var instanceof nb5) {
            synchronized (this.g0) {
                this.i0.add((nb5) fv4Var);
            }
        } else if (fv4Var instanceof b03) {
            this.j0 = (b03) fv4Var;
            gy2 gy2Var = (gy2) this.V.get();
            if (((Boolean) w82.d.c.a(x92.x1)).booleanValue() && gy2Var != null && this.j0.n) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.j0.p));
                hashMap.put("gcacheDownloaded", String.valueOf(this.j0.q));
                cu5.i.post(new t14(2, gy2Var, hashMap));
            }
        }
    }

    @Override // defpackage.jo5
    public final void j(e03 e03Var) {
        xx2 xx2Var = this.a0;
        if (xx2Var != null) {
            xx2Var.j("onPlayerError", e03Var);
        }
    }

    @Override // defpackage.jo5
    public final void k(cu1 cu1Var) {
        gy2 gy2Var = (gy2) this.V.get();
        if (((Boolean) w82.d.c.a(x92.x1)).booleanValue() && gy2Var != null && cu1Var != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(cu1Var.r));
            hashMap.put("bitRate", String.valueOf(cu1Var.g));
            int i = cu1Var.p;
            int i2 = cu1Var.q;
            hashMap.put("resolution", i + "x" + i2);
            String str = cu1Var.j;
            if (str != null) {
                hashMap.put("videoMime", str);
            }
            String str2 = cu1Var.k;
            if (str2 != null) {
                hashMap.put("videoSampleMime", str2);
            }
            String str3 = cu1Var.h;
            if (str3 != null) {
                hashMap.put("videoCodec", str3);
            }
            gy2Var.a("onMetadataEvent", hashMap);
        }
    }

    @Override // defpackage.jo5
    public final /* synthetic */ void l(io5 io5Var, int i, long j) {
    }

    @Override // defpackage.jo5
    public final /* synthetic */ void m(int i) {
    }

    @Override // defpackage.jo5
    public final /* synthetic */ void n(o73 o73Var, f2 f2Var) {
    }

    @Override // defpackage.jo5
    public final void o() {
        xx2 xx2Var = this.a0;
        if (xx2Var != null) {
            xx2Var.r();
        }
    }

    public final long p() {
        boolean z;
        if (this.j0 != null && this.j0.o) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            synchronized (this.g0) {
                while (!this.i0.isEmpty()) {
                    long j = this.d0;
                    Map b = ((nb5) this.i0.remove(0)).b();
                    long j2 = 0;
                    if (b != null) {
                        Iterator it = b.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && q05.m("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.d0 = j + j2;
                }
            }
            return this.d0;
        }
        b03 b03Var = this.j0;
        if (b03Var.m == null) {
            return -1L;
        }
        if (b03Var.t.get() == -1) {
            synchronized (b03Var) {
                if (b03Var.s == null) {
                    b03Var.s = zw2.a.b(new a03(0, b03Var));
                }
            }
            if (b03Var.s.isDone()) {
                try {
                    b03Var.t.compareAndSet(-1L, ((Long) b03Var.s.get()).longValue());
                } catch (InterruptedException | ExecutionException unused2) {
                    return -1L;
                }
            }
            return b03Var.t.get();
        }
        return b03Var.t.get();
    }

    public final void q(Uri[] uriArr, ByteBuffer byteBuffer, boolean z) {
        nu5 zv5Var;
        if (this.X != null) {
            this.Y = byteBuffer;
            this.Z = z;
            int length = uriArr.length;
            if (length == 1) {
                zv5Var = s(uriArr[0]);
            } else {
                qv5[] qv5VarArr = new qv5[length];
                for (int i = 0; i < uriArr.length; i++) {
                    qv5VarArr[i] = s(uriArr[i]);
                }
                zv5Var = new zv5(qv5VarArr);
            }
            this.X.m(zv5Var);
            this.X.q();
            yx2.Q.incrementAndGet();
        }
    }

    public final void r(boolean z) {
        dy5 dy5Var;
        boolean z2;
        if (this.X != null) {
            int i = 0;
            while (true) {
                this.X.y();
                if (i < 2) {
                    oy5 oy5Var = this.T;
                    synchronized (oy5Var.c) {
                        dy5Var = oy5Var.f;
                    }
                    dy5Var.getClass();
                    cy5 cy5Var = new cy5(dy5Var);
                    boolean z3 = !z;
                    if (cy5Var.r.get(i) != z3) {
                        if (z3) {
                            cy5Var.r.put(i, true);
                        } else {
                            cy5Var.r.delete(i);
                        }
                    }
                    dy5 dy5Var2 = new dy5(cy5Var);
                    synchronized (oy5Var.c) {
                        z2 = !oy5Var.f.equals(dy5Var2);
                        oy5Var.f = dy5Var2;
                    }
                    if (z2) {
                        if (dy5Var2.n && oy5Var.d == null) {
                            lb4.c("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                        }
                        vy5 vy5Var = oy5Var.a;
                        if (vy5Var != null) {
                            ((dl4) ((im5) vy5Var).W).c(10);
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final pw5 s(Uri uri) {
        gg2 gg2Var;
        sw4 sw4Var = sw4.V;
        lv4 lv4Var = nv4.Q;
        nw4 nw4Var = nw4.T;
        List emptyList = Collections.emptyList();
        nw4 nw4Var2 = nw4.T;
        si2 si2Var = si2.a;
        if (uri != null) {
            gg2Var = new gg2(uri, emptyList, nw4Var2);
        } else {
            gg2Var = null;
        }
        gg2 gg2Var2 = gg2Var;
        el2 el2Var = new el2("", new o52(0), gg2Var2, new oc2(), nq2.y, si2Var);
        ow5 ow5Var = this.W;
        ow5Var.b = this.U.f;
        gg2Var2.getClass();
        return new pw5(el2Var, ow5Var.a, ow5Var.c, ow5Var.d, ow5Var.b);
    }

    public final long t() {
        boolean z;
        if (this.j0 != null && this.j0.o) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !this.j0.p) {
            return 0L;
        }
        return Math.min(this.b0, this.j0.r);
    }

    @Override // defpackage.jo5
    public final void u0(int i) {
        this.c0 += i;
    }

    @Override // defpackage.jo5
    public final void w(int i) {
        xx2 xx2Var = this.a0;
        if (xx2Var != null) {
            xx2Var.a(i);
        }
    }
}