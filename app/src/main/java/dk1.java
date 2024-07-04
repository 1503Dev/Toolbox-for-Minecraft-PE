package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: dk1  reason: default package */
public final class dk1 extends fu2 {
    public static final ArrayList s0 = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final ArrayList t0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final ArrayList u0 = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final ArrayList v0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public final q23 Q;
    public Context R;
    public final rz1 S;
    public final nj4 T;
    public final ez4 V;
    public final ScheduledExecutorService W;
    public ep2 X;
    public final cw2 b0;
    public final fs3 c0;
    public final gn4 d0;
    public final boolean e0;
    public final boolean f0;
    public final boolean g0;
    public final boolean h0;
    public final String i0;
    public final String j0;
    public final xv2 l0;
    public String m0;
    public final String n0;
    public final ArrayList o0;
    public final ArrayList p0;
    public final ArrayList q0;
    public final ArrayList r0;
    public xr3 U = null;
    public Point Y = new Point();
    public Point Z = new Point();
    public final Set a0 = Collections.newSetFromMap(new WeakHashMap());
    public final AtomicInteger k0 = new AtomicInteger(0);

    public dk1(q23 q23Var, Context context, rz1 rz1Var, nj4 nj4Var, yw2 yw2Var, ScheduledExecutorService scheduledExecutorService, fs3 fs3Var, gn4 gn4Var, xv2 xv2Var) {
        ArrayList arrayList;
        this.Q = q23Var;
        this.R = context;
        this.S = rz1Var;
        this.T = nj4Var;
        this.V = yw2Var;
        this.W = scheduledExecutorService;
        this.b0 = q23Var.k();
        this.c0 = fs3Var;
        this.d0 = gn4Var;
        this.l0 = xv2Var;
        l92 l92Var = x92.h6;
        w82 w82Var = w82.d;
        this.e0 = ((Boolean) w82Var.c.a(l92Var)).booleanValue();
        this.f0 = ((Boolean) w82Var.c.a(x92.g6)).booleanValue();
        this.g0 = ((Boolean) w82Var.c.a(x92.i6)).booleanValue();
        this.h0 = ((Boolean) w82Var.c.a(x92.k6)).booleanValue();
        this.i0 = (String) w82Var.c.a(x92.j6);
        this.j0 = (String) w82Var.c.a(x92.l6);
        this.n0 = (String) w82Var.c.a(x92.m6);
        if (((Boolean) w82Var.c.a(x92.n6)).booleanValue()) {
            this.o0 = A4((String) w82Var.c.a(x92.o6));
            this.p0 = A4((String) w82Var.c.a(x92.p6));
            this.q0 = A4((String) w82Var.c.a(x92.q6));
            arrayList = A4((String) w82Var.c.a(x92.r6));
        } else {
            this.o0 = s0;
            this.p0 = t0;
            this.q0 = u0;
            arrayList = v0;
        }
        this.r0 = arrayList;
    }

    public static final ArrayList A4(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!ft4.a(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static qm4 B4(dz4 dz4Var, ku2 ku2Var) {
        String str;
        if (rm4.b() && ((Boolean) fb2.e.d()).booleanValue()) {
            try {
                qm4 a = ((zj5) zw4.H(dz4Var)).a();
                a.e(new ArrayList(Collections.singletonList(ku2Var.Q)));
                pn5 pn5Var = ku2Var.S;
                if (pn5Var == null) {
                    str = "";
                } else {
                    str = pn5Var.e0;
                }
                a.c(str);
                return a;
            } catch (ExecutionException e) {
                jv5.A.g.f("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e);
            }
        }
        return null;
    }

    public static void t4(final dk1 dk1Var, final String str, final String str2, final xr3 xr3Var) {
        l92 l92Var = x92.T5;
        w82 w82Var = w82.d;
        if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            return;
        }
        if (((Boolean) w82Var.c.a(x92.Z5)).booleanValue()) {
            zw2.a.execute(new Runnable() { // from class: zk5
                @Override // java.lang.Runnable
                public final void run() {
                    dk1 dk1Var2 = dk1.this;
                    dk1Var2.b0.a(str, str2, xr3Var);
                }
            });
        } else {
            dk1Var.b0.a(str, str2, xr3Var);
        }
    }

    public static boolean y4(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    public static final Uri z4(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    @Override // defpackage.gu2
    public final void u3(hw hwVar, final ku2 ku2Var, du2 du2Var) {
        dz4 C;
        dz4 b;
        Context context = (Context) va0.c0(hwVar);
        this.R = context;
        hm4 t = eb1.t(context, 22);
        t.f();
        if (((Boolean) w82.d.c.a(x92.F8)).booleanValue()) {
            yw2 yw2Var = zw2.a;
            C = yw2Var.b(new Callable() { // from class: aq5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dk1 dk1Var = dk1.this;
                    ku2 ku2Var2 = ku2Var;
                    return dk1Var.u4(dk1Var.R, ku2Var2.P, ku2Var2.Q, ku2Var2.R, ku2Var2.S);
                }
            });
            b = zw4.F(C, new ky4() { // from class: cr5
                @Override // defpackage.ky4
                public final dz4 e(Object obj) {
                    return ((zj5) obj).b();
                }
            }, yw2Var);
        } else {
            y43 u4 = u4(this.R, ku2Var.P, ku2Var.Q, ku2Var.R, ku2Var.S);
            C = zw4.C(u4);
            b = u4.b();
        }
        jv5.A.j.getClass();
        zw4.J(b, new zx5(this, C, ku2Var, du2Var, t, System.currentTimeMillis()), this.Q.a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final y43 u4(Context context, String str, String str2, zr5 zr5Var, pn5 pn5Var) {
        String str3;
        pn5 pn5Var2;
        zr5 zr5Var2;
        char c;
        ki4 ki4Var = new ki4();
        if ("REWARDED".equals(str2)) {
            ki4Var.o.a = 2;
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            ki4Var.o.a = 3;
        }
        dp2 l = this.Q.l();
        xc3 xc3Var = new xc3();
        xc3Var.a = context;
        if (str == null) {
            str3 = "adUnitId";
        } else {
            str3 = str;
        }
        ki4Var.c = str3;
        if (pn5Var == null) {
            pn5Var2 = new pn5(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null);
        } else {
            pn5Var2 = pn5Var;
        }
        ki4Var.a = pn5Var2;
        if (zr5Var == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1 && c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            zr5Var2 = new zr5();
                        } else {
                            zr5Var2 = zr5.c();
                        }
                    } else {
                        zr5Var2 = zr5.d();
                    }
                } else {
                    zr5Var2 = new zr5("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
                }
            } else {
                zr5Var2 = new zr5(context, h3.h);
            }
        } else {
            zr5Var2 = zr5Var;
        }
        ki4Var.b = zr5Var2;
        ki4Var.r = true;
        xc3Var.b = ki4Var.a();
        l.b = new yc3(xc3Var);
        bm1 bm1Var = new bm1();
        bm1Var.a = str2;
        l.c = new go1(bm1Var);
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        y43 b = l.b();
        this.U = (xr3) b.i.c();
        return b;
    }

    public final ix4 v4(final String str) {
        final kp3[] kp3VarArr = new kp3[1];
        ay4 F = zw4.F(this.T.a(), new ky4() { // from class: mm5
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                dk1 dk1Var = dk1.this;
                kp3[] kp3VarArr2 = kp3VarArr;
                String str2 = str;
                kp3 kp3Var = (kp3) obj;
                dk1Var.getClass();
                kp3VarArr2[0] = kp3Var;
                Context context = dk1Var.R;
                ep2 ep2Var = dk1Var.X;
                Map map = ep2Var.Q;
                JSONObject c = gt2.c(context, map, map, ep2Var.P, null);
                JSONObject f = gt2.f(dk1Var.R, dk1Var.X.P);
                JSONObject e = gt2.e(dk1Var.X.P);
                JSONObject d = gt2.d(dk1Var.R, dk1Var.X.P);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", c);
                jSONObject.put("ad_view_signal", f);
                jSONObject.put("scroll_view_signal", e);
                jSONObject.put("lock_screen_signal", d);
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", gt2.b(null, dk1Var.R, dk1Var.Z, dk1Var.Y));
                }
                return kp3Var.a(str2, jSONObject);
            }
        }, this.V);
        F.b(new sn5(0, this, kp3VarArr), this.V);
        return zw4.z(zw4.E((sy4) zw4.G(sy4.r(F), ((Integer) w82.d.c.a(x92.x6)).intValue(), TimeUnit.MILLISECONDS, this.W), new at4() { // from class: bx5
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                ArrayList arrayList = dk1.s0;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.V), Exception.class, new at4() { // from class: ol5
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                ArrayList arrayList = dk1.s0;
                sv2.e("", (Exception) obj);
                return null;
            }
        }, this.V);
    }

    public final void w4(ArrayList arrayList, final hw hwVar, bp2 bp2Var, boolean z) {
        dz4 b;
        boolean z2;
        Map map;
        if (!((Boolean) w82.d.c.a(x92.w6)).booleanValue()) {
            sv2.g("The updating URL feature is not enabled.");
            try {
                bp2Var.D("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                sv2.e("", e);
                return;
            }
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (y4((Uri) it.next(), this.o0, this.p0)) {
                i++;
            }
        }
        if (i > 1) {
            sv2.g("Multiple google urls found: ".concat(String.valueOf(arrayList)));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (!y4(uri, this.o0, this.p0)) {
                sv2.g("Not a Google URL: ".concat(String.valueOf(uri)));
                b = zw4.C(uri);
            } else {
                b = this.V.b(new Callable() { // from class: bs5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dk1 dk1Var = dk1.this;
                        Uri uri2 = uri;
                        hw hwVar2 = hwVar;
                        dk1Var.getClass();
                        try {
                            uri2 = dk1Var.S.a(uri2, dk1Var.R, (View) va0.c0(hwVar2), null);
                        } catch (sz1 e2) {
                            sv2.h("", e2);
                        }
                        if (uri2.getQueryParameter("ms") != null) {
                            return uri2;
                        }
                        throw new Exception("Failed to append spam signals to click url.");
                    }
                });
                ep2 ep2Var = this.X;
                if (ep2Var != null && (map = ep2Var.Q) != null && !map.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    b = zw4.F(b, new ky4() { // from class: bt5
                        @Override // defpackage.ky4
                        public final dz4 e(Object obj) {
                            dk1 dk1Var = dk1.this;
                            final Uri uri2 = (Uri) obj;
                            return zw4.E(dk1Var.v4("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new at4() { // from class: oo5
                                @Override // defpackage.at4
                                public final Object apply(Object obj2) {
                                    Uri uri3 = uri2;
                                    String str = (String) obj2;
                                    return !TextUtils.isEmpty(str) ? dk1.z4(uri3, "nas", str) : uri3;
                                }
                            }, dk1Var.V);
                        }
                    }, this.V);
                } else {
                    sv2.f("Asset view map is empty.");
                }
            }
            arrayList2.add(b);
        }
        zw4.J(new ly4(nv4.t(arrayList2)), new zz5(this, bp2Var, z), this.Q.a());
    }

    public final void x4(final ArrayList arrayList, final hw hwVar, bp2 bp2Var, boolean z) {
        boolean z2;
        Map map;
        if (!((Boolean) w82.d.c.a(x92.w6)).booleanValue()) {
            try {
                bp2Var.D("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                sv2.e("", e);
                return;
            }
        }
        dz4 b = this.V.b(new Callable() { // from class: du5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                dk1 dk1Var = dk1.this;
                List<Uri> list = arrayList;
                hw hwVar2 = hwVar;
                nz1 nz1Var = dk1Var.S.b;
                if (nz1Var != null) {
                    str = nz1Var.e(dk1Var.R, (View) va0.c0(hwVar2), null);
                } else {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Uri uri : list) {
                        if (!dk1.y4(uri, dk1Var.q0, dk1Var.r0)) {
                            sv2.g("Not a Google URL: ".concat(String.valueOf(uri)));
                        } else {
                            uri = dk1.z4(uri, "ms", str);
                        }
                        arrayList2.add(uri);
                    }
                    if (!arrayList2.isEmpty()) {
                        return arrayList2;
                    }
                    throw new Exception("Empty impression URLs result.");
                }
                throw new Exception("Failed to get view signals.");
            }
        });
        ep2 ep2Var = this.X;
        if (ep2Var != null && (map = ep2Var.Q) != null && !map.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            b = zw4.F(b, new ky4() { // from class: ev5
                @Override // defpackage.ky4
                public final dz4 e(Object obj) {
                    final dk1 dk1Var = dk1.this;
                    final ArrayList arrayList2 = (ArrayList) obj;
                    return zw4.E(dk1Var.v4("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new at4() { // from class: hp5
                        @Override // defpackage.at4
                        public final Object apply(Object obj2) {
                            dk1 dk1Var2 = dk1.this;
                            List<Uri> list = arrayList2;
                            String str = (String) obj2;
                            dk1Var2.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            for (Uri uri : list) {
                                if (dk1.y4(uri, dk1Var2.q0, dk1Var2.r0) && !TextUtils.isEmpty(str)) {
                                    uri = dk1.z4(uri, "nas", str);
                                }
                                arrayList3.add(uri);
                            }
                            return arrayList3;
                        }
                    }, dk1Var.V);
                }
            }, this.V);
        } else {
            sv2.f("Asset view map is empty.");
        }
        zw4.J(b, new bz5(this, bp2Var, z), this.Q.a());
    }
}