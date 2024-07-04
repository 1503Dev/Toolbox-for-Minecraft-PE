package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: cy3  reason: default package */
public final class cy3 extends zp2 {
    public final Context P;
    public final ez4 Q;
    public final z63 R;
    public final t53 S;
    public final ArrayDeque T;
    public final rm4 U;

    public cy3(Context context, yw2 yw2Var, o7 o7Var, q23 q23Var, z63 z63Var, ArrayDeque arrayDeque, rm4 rm4Var) {
        x92.a(context);
        this.P = context;
        this.Q = yw2Var;
        this.R = z63Var;
        this.S = q23Var;
        this.T = arrayDeque;
        this.U = rm4Var;
    }

    public static void A4(dz4 dz4Var, kq2 kq2Var) {
        zw4.J(zw4.F(dz4Var, new ky4() { // from class: wx3
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                zw2.a.execute(new bm3(2, (InputStream) obj, createPipe[1]));
                return zw4.C(parcelFileDescriptor);
            }
        }, zw2.a), new eg3(kq2Var, 6), zw2.f);
    }

    public static el4 y4(el4 el4Var, ol4 ol4Var, zj2 zj2Var, qm4 qm4Var, hm4 hm4Var) {
        ck2 a = zj2Var.a("AFMA_getAdDictionary", yj2.b, ea2.U);
        pm4.a(el4Var, hm4Var);
        el4 a2 = ol4Var.b(el4Var, ml4.BUILD_URL).d(a).a();
        if (((Boolean) fb2.c.d()).booleanValue()) {
            zw4.J(sy4.r(a2), new fx2(qm4Var, hm4Var), zw2.f);
        }
        return a2;
    }

    public static el4 z4(rq2 rq2Var, ol4 ol4Var, final r33 r33Var) {
        ky4 ky4Var = new ky4() { // from class: px3
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                r33 r33Var2 = r33.this;
                Context context = r33Var2.b.b.b;
                tv2.C(context);
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                tv2.C(r33Var2.a.a.S);
                eb4 eb4Var = new eb4(new ae4(yw2Var), 0L, (ScheduledExecutorService) r33Var2.b.k.c());
                tv2.C(r33Var2.b.b.b);
                eb4 eb4Var2 = new eb4(new ge4((ScheduledExecutorService) r33Var2.b.k.c()), ((Long) w82.d.c.a(x92.t3)).longValue(), (ScheduledExecutorService) r33Var2.b.k.c());
                pu2 pu2Var = new pu2();
                Context context2 = r33Var2.b.b.b;
                tv2.C(context2);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) r33Var2.b.k.c();
                le4 le4Var = r33Var2.a;
                int i = le4Var.b;
                rq2 rq2Var2 = le4Var.a;
                eb4 eb4Var3 = new eb4(new zc4(pu2Var, context2, scheduledExecutorService, yw2Var, i, rq2Var2.a0, rq2Var2.Z), 0L, (ScheduledExecutorService) r33Var2.b.k.c());
                eb4 eb4Var4 = new eb4(new xe4(yw2Var), 0L, (ScheduledExecutorService) r33Var2.b.k.c());
                tv2.C(r33Var2.b.b.b);
                tv2.C(r33Var2.a.a.S);
                kd4 kd4Var = new kd4(yw2Var);
                tv2.C(r33Var2.b.b.b);
                tv2.C(yw2Var);
                List list = r33Var2.a.a.T;
                tv2.C(list);
                int i2 = r33Var2.a.b;
                tv2.C(r33Var2.b.b.b);
                tv2.C(r33Var2.a.a.S);
                tv2.C(r33Var2.a.a.S);
                return new qc4(context, yw2Var, sv4.t(eb4Var, eb4Var2, eb4Var3, eb4Var4, kd4Var, new vd4(yw2Var), new ce4(yw2Var, list), r33Var2.a(), new td4((yu2) r33Var2.b.Y.c(), (ScheduledExecutorService) r33Var2.b.k.c(), yw2Var), (nc4) r33Var2.b.y0.c(), new od4((yu2) r33Var2.b.Y.c(), (ScheduledExecutorService) r33Var2.b.k.c(), yw2Var)), (qm4) r33Var2.c.c(), (zr3) r33Var2.b.R.c()).a(n62.f.a.f((Bundle) obj));
            }
        };
        return ol4Var.b(zw4.C(rq2Var.P), ml4.GMS_SIGNALS).d(ky4Var).c(v32.V).a();
    }

    @Override // defpackage.aq2
    public final void C2(rq2 rq2Var, kq2 kq2Var) {
        A4(v4(rq2Var, Binder.getCallingUid()), kq2Var);
    }

    @Override // defpackage.aq2
    public final void f3(rq2 rq2Var, kq2 kq2Var) {
        el4 u4 = u4(rq2Var, Binder.getCallingUid());
        A4(u4, kq2Var);
        if (((Boolean) mb2.c.d()).booleanValue()) {
            z63 z63Var = this.R;
            z63Var.getClass();
            u4.b(new qx3(0, z63Var), this.Q);
        }
    }

    @Override // defpackage.aq2
    public final void l4(String str, kq2 kq2Var) {
        A4(w4(str), kq2Var);
    }

    public final dz4 t4(final rq2 rq2Var, int i) {
        if (!((Boolean) ub2.a.d()).booleanValue()) {
            return new yy4(new Exception("Split request is disabled."));
        }
        bk4 bk4Var = rq2Var.X;
        if (bk4Var == null) {
            return new yy4(new Exception("Pool configuration missing from request."));
        }
        if (bk4Var.S != 0 && bk4Var.T != 0) {
            zj2 b = jv5.A.p.b(this.P, xv2.c(), this.U);
            q23 q23Var = (q23) this.S;
            q23Var.getClass();
            r33 m = q23Var.m(new le4(rq2Var, i));
            ol4 ol4Var = (ol4) m.r.c();
            final el4 z4 = z4(rq2Var, ol4Var, m);
            final hm4 t = eb1.t(this.P, 9);
            final el4 y4 = y4(z4, ol4Var, b, (qm4) m.c.c(), t);
            return ol4Var.a(ml4.GET_URL_AND_CACHE_KEY, z4, y4).a(new Callable() { // from class: tx3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    cy3 cy3Var = cy3.this;
                    dz4 dz4Var = y4;
                    dz4 dz4Var2 = z4;
                    rq2 rq2Var2 = rq2Var;
                    hm4 hm4Var = t;
                    cy3Var.getClass();
                    String str = ((tq2) dz4Var.get()).i;
                    String str2 = rq2Var2.W;
                    ay3 ay3Var = new ay3((tq2) dz4Var.get(), (JSONObject) dz4Var2.get(), str2, hm4Var);
                    synchronized (cy3Var) {
                        synchronized (cy3Var) {
                            int intValue = ((Long) ub2.c.d()).intValue();
                            while (cy3Var.T.size() >= intValue) {
                                cy3Var.T.removeFirst();
                            }
                        }
                        return new ByteArrayInputStream(str.getBytes(zs4.c));
                    }
                    cy3Var.T.addLast(ay3Var);
                    return new ByteArrayInputStream(str.getBytes(zs4.c));
                }
            }).a();
        }
        return new yy4(new Exception("Caching is disabled."));
    }

    public final el4 u4(rq2 rq2Var, int i) {
        String str;
        hm4 hm4Var;
        boolean z;
        gl4 a;
        Callable callable;
        ml4 ml4Var = ml4.PRE_PROCESS;
        ml4 ml4Var2 = ml4.HTTP;
        zj2 b = jv5.A.p.b(this.P, xv2.c(), this.U);
        q23 q23Var = (q23) this.S;
        q23Var.getClass();
        r33 m = q23Var.m(new le4(rq2Var, i));
        ck2 a2 = b.a("google.afma.response.normalize", by3.d, yj2.c);
        ay3 ay3Var = null;
        if (!((Boolean) ub2.a.d()).booleanValue()) {
            String str2 = rq2Var.Y;
            if (str2 != null && !str2.isEmpty()) {
                str = "Request contained a PoolKey but split request is disabled.";
                vz3.k(str);
            }
        } else {
            ay3Var = x4(rq2Var.W);
            if (ay3Var == null) {
                str = "Request contained a PoolKey but no matching parameters were found.";
                vz3.k(str);
            }
        }
        if (ay3Var == null) {
            hm4Var = eb1.t(this.P, 9);
        } else {
            hm4Var = ay3Var.d;
        }
        qm4 qm4Var = (qm4) m.c.c();
        qm4Var.e(rq2Var.P.getStringArrayList("ad_types"));
        oy3 oy3Var = new oy3(rq2Var.V, qm4Var, hm4Var);
        my3 my3Var = new my3(this.P, rq2Var.Q.P);
        ol4 ol4Var = (ol4) m.r.c();
        hm4 t = eb1.t(this.P, 11);
        if (ay3Var == null) {
            final el4 z4 = z4(rq2Var, ol4Var, m);
            final el4 y4 = y4(z4, ol4Var, b, qm4Var, hm4Var);
            hm4 t2 = eb1.t(this.P, 10);
            final el4 a3 = ol4Var.a(ml4Var2, y4, z4).a(new Callable() { // from class: rx3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new ny3((JSONObject) z4.get(), (tq2) y4.get());
                }
            }).c(oy3Var).c(new zw5(7, t2)).c(my3Var).a();
            pm4.c(a3, qm4Var, t2, false);
            pm4.a(a3, t);
            a = ol4Var.a(ml4Var, z4, y4, a3);
            callable = new Callable() { // from class: sx3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new by3((ly3) a3.get(), (JSONObject) z4.get(), (tq2) y4.get());
                }
            };
            z = false;
        } else {
            ny3 ny3Var = new ny3(ay3Var.b, ay3Var.a);
            hm4 t3 = eb1.t(this.P, 10);
            final el4 a4 = ol4Var.b(zw4.C(ny3Var), ml4Var2).c(oy3Var).c(new zw5(7, t3)).c(my3Var).a();
            z = false;
            pm4.c(a4, qm4Var, t3, false);
            final zy4 C = zw4.C(ay3Var);
            pm4.a(a4, t);
            a = ol4Var.a(ml4Var, a4, C);
            callable = new Callable() { // from class: vx3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dz4 dz4Var = a4;
                    dz4 dz4Var2 = C;
                    return new by3((ly3) dz4Var.get(), ((ay3) dz4Var2.get()).b, ((ay3) dz4Var2.get()).a);
                }
            };
        }
        el4 a5 = a.a(callable).d(a2).a();
        pm4.c(a5, qm4Var, t, z);
        return a5;
    }

    public final dz4 v4(rq2 rq2Var, int i) {
        zj2 b = jv5.A.p.b(this.P, xv2.c(), this.U);
        if (!((Boolean) zb2.a.d()).booleanValue()) {
            return new yy4(new Exception("Signal collection disabled."));
        }
        q23 q23Var = (q23) this.S;
        q23Var.getClass();
        r33 m = q23Var.m(new le4(rq2Var, i));
        Context context = m.b.b.b;
        tv2.C(context);
        Object c = m.b.y0.c();
        gd4 a = m.a();
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        List list = m.a.a.T;
        tv2.C(list);
        ce4 ce4Var = new ce4(yw2Var, list);
        hj5 a2 = kj5.a(m.d);
        hj5 a3 = kj5.a(m.e);
        hj5 a4 = kj5.a(m.f);
        hj5 a5 = kj5.a(m.g);
        kj5.a(m.h);
        hj5 a6 = kj5.a(m.i);
        hj5 a7 = kj5.a(m.j);
        kj5.a(m.k);
        hj5 a8 = kj5.a(m.l);
        tv2.C(yw2Var);
        qm4 qm4Var = (qm4) m.c.c();
        zr3 zr3Var = (zr3) m.b.R.c();
        HashSet hashSet = new HashSet();
        hashSet.add((yd4) c);
        hashSet.add(a);
        hashSet.add(ce4Var);
        l92 l92Var = x92.J4;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            hashSet.add((nc4) a2.c());
        }
        if (((Boolean) w82Var.c.a(x92.K4)).booleanValue()) {
            hashSet.add((nc4) a3.c());
        }
        if (((Boolean) w82Var.c.a(x92.L4)).booleanValue()) {
            hashSet.add((nc4) a4.c());
        }
        if (((Boolean) w82Var.c.a(x92.M4)).booleanValue()) {
            hashSet.add((nc4) a5.c());
        }
        if (((Boolean) w82Var.c.a(x92.O4)).booleanValue()) {
            hashSet.add((nc4) a6.c());
        }
        if (((Boolean) w82Var.c.a(x92.P4)).booleanValue()) {
            hashSet.add((nc4) a7.c());
        }
        if (((Boolean) w82Var.c.a(x92.l2)).booleanValue()) {
            hashSet.add((nc4) a8.c());
        }
        final qc4 qc4Var = new qc4(context, yw2Var, hashSet, qm4Var, zr3Var);
        ck2 a9 = b.a("google.afma.request.getSignals", yj2.b, yj2.c);
        hm4 t = eb1.t(this.P, 22);
        el4 a10 = ((ol4) m.r.c()).b(zw4.C(rq2Var.P), ml4.GET_SIGNALS).c(new zw5(7, t)).d(new ky4() { // from class: ux3
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                return qc4.this.a(n62.f.a.f((Bundle) obj));
            }
        }).b(ml4.JS_SIGNALS).d(a9).a();
        qm4 qm4Var2 = (qm4) m.c.c();
        qm4Var2.e(rq2Var.P.getStringArrayList("ad_types"));
        pm4.c(a10, qm4Var2, t, true);
        if (((Boolean) mb2.e.d()).booleanValue()) {
            z63 z63Var = this.R;
            z63Var.getClass();
            a10.b(new qx3(0, z63Var), this.Q);
        }
        return a10;
    }

    public final dz4 w4(String str) {
        if (!((Boolean) ub2.a.d()).booleanValue()) {
            return new yy4(new Exception("Split request is disabled."));
        }
        xx3 xx3Var = new xx3();
        if (x4(str) == null) {
            return new yy4(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zw4.C(xx3Var);
    }

    public final synchronized ay3 x4(String str) {
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            ay3 ay3Var = (ay3) it.next();
            if (ay3Var.c.equals(str)) {
                it.remove();
                return ay3Var;
            }
        }
        return null;
    }

    @Override // defpackage.aq2
    public final void z3(rq2 rq2Var, kq2 kq2Var) {
        A4(t4(rq2Var, Binder.getCallingUid()), kq2Var);
    }
}