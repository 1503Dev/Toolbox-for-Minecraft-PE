package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: jl3  reason: default package */
public final class jl3 extends ea3 {
    public static final nw4 G;
    public final Context A;
    public final ll3 B;
    public final u64 C;
    public final HashMap D;
    public final ArrayList E;
    public lz4 F;
    public final Executor i;
    public final nl3 j;
    public final ul3 k;
    public final cm3 l;
    public final tl3 m;
    public final wl3 n;
    public final hj5 o;
    public final hj5 p;
    public final hj5 q;
    public final hj5 r;
    public final hj5 s;
    public ym3 t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final it2 x;
    public final rz1 y;
    public final xv2 z;

    static {
        lv4 lv4Var = nv4.Q;
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        lw4.a(6, objArr);
        G = nv4.s(6, objArr);
    }

    public jl3(ba3 ba3Var, Executor executor, nl3 nl3Var, ul3 ul3Var, cm3 cm3Var, tl3 tl3Var, wl3 wl3Var, hj5 hj5Var, hj5 hj5Var2, hj5 hj5Var3, hj5 hj5Var4, hj5 hj5Var5, it2 it2Var, rz1 rz1Var, xv2 xv2Var, Context context, ll3 ll3Var, u64 u64Var) {
        super(ba3Var);
        this.i = executor;
        this.j = nl3Var;
        this.k = ul3Var;
        this.l = cm3Var;
        this.m = tl3Var;
        this.n = wl3Var;
        this.o = hj5Var;
        this.p = hj5Var2;
        this.q = hj5Var3;
        this.r = hj5Var4;
        this.s = hj5Var5;
        this.x = it2Var;
        this.y = rz1Var;
        this.z = xv2Var;
        this.A = context;
        this.B = ll3Var;
        this.C = u64Var;
        this.D = new HashMap();
        this.E = new ArrayList();
    }

    public static boolean h(View view) {
        l92 l92Var = x92.l8;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            cu5 cu5Var = jv5.A.c;
            long C = cu5.C(view);
            if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
                if (C >= ((Integer) w82Var.c.a(x92.m8)).intValue()) {
                    return true;
                }
            }
            return false;
        } else if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            return true;
        } else {
            return false;
        }
    }

    @Override // defpackage.ea3
    public final void a() {
        this.i.execute(new gz1(3, this));
        if (this.j.e() != 7) {
            Executor executor = this.i;
            ul3 ul3Var = this.k;
            ul3Var.getClass();
            executor.execute(new b02(2, ul3Var));
        }
        super.a();
    }

    public final synchronized void b(View view, Map map, Map map2, boolean z) {
        if (this.v) {
            return;
        }
        if (((Boolean) w82.d.c.a(x92.s1)).booleanValue() && this.b.k0) {
            for (String str : this.D.keySet()) {
                if (!((Boolean) this.D.get(str)).booleanValue()) {
                    return;
                }
            }
        }
        if (!z) {
            if (((Boolean) w82.d.c.a(x92.h3)).booleanValue() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    View view2 = (View) ((WeakReference) entry.getValue()).get();
                    if (view2 != null && h(view2)) {
                        m(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        View j = j(map);
        if (j == null) {
            m(view, map, map2);
            return;
        }
        l92 l92Var = x92.i3;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            if (h(j)) {
                m(view, map, map2);
                return;
            }
            return;
        }
        if (((Boolean) w82Var.c.a(x92.j3)).booleanValue()) {
            Rect rect = new Rect();
            if (j.getGlobalVisibleRect(rect, null) && j.getHeight() == rect.height() && j.getWidth() == rect.width()) {
                m(view, map, map2);
                return;
            }
            return;
        }
        m(view, map, map2);
    }

    public final synchronized void c(View view, View view2, Map map, Map map2, boolean z) {
        cm3 cm3Var = this.l;
        ym3 ym3Var = this.t;
        if (ym3Var != null) {
            if (cm3Var.e != null && ym3Var.f() != null && cm3Var.c.f()) {
                try {
                    ym3Var.f().addView(cm3Var.e.a());
                } catch (j13 e) {
                    vz3.l("web view can not be obtained", e);
                }
            }
        } else {
            cm3Var.getClass();
        }
        this.k.t(view, view2, map, map2, z, k());
        if (this.w) {
            nl3 nl3Var = this.j;
            if (nl3Var.j() != null) {
                nl3Var.j().a("onSdkAdUserInteractionClick", new e7());
            }
        }
    }

    public final synchronized void d(final FrameLayout frameLayout, final int i) {
        if (!((Boolean) w82.d.c.a(x92.T8)).booleanValue()) {
            return;
        }
        ym3 ym3Var = this.t;
        if (ym3Var == null) {
            sv2.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            return;
        }
        final boolean z = ym3Var instanceof zl3;
        this.i.execute(new Runnable() { // from class: fl3
            @Override // java.lang.Runnable
            public final void run() {
                jl3 jl3Var = jl3.this;
                jl3Var.k.d(frameLayout, jl3Var.t.e(), jl3Var.t.n(), jl3Var.t.o(), z, jl3Var.k(), i);
            }
        });
    }

    public final void e(View view) {
        if (((Boolean) w82.d.c.a(x92.n4)).booleanValue()) {
            lz4 lz4Var = this.F;
            if (lz4Var == null) {
                return;
            }
            lz4Var.b(new tx1(2, this, view), this.i);
            return;
        }
        n(view, this.j.l());
    }

    public final synchronized void f(ym3 ym3Var) {
        if (((Boolean) w82.d.c.a(x92.q1)).booleanValue()) {
            cu5.i.post(new qh1(this, ym3Var, 4));
        } else {
            o(ym3Var);
        }
    }

    public final synchronized void g(ym3 ym3Var) {
        if (((Boolean) w82.d.c.a(x92.q1)).booleanValue()) {
            cu5.i.post(new gl3(0, this, ym3Var));
        } else {
            p(ym3Var);
        }
    }

    public final synchronized boolean i(Bundle bundle) {
        if (this.v) {
            return true;
        }
        boolean l = this.k.l(bundle);
        this.v = l;
        return l;
    }

    public final synchronized View j(Map map) {
        if (map == null) {
            return null;
        }
        nw4 nw4Var = G;
        int i = nw4Var.S;
        int i2 = 0;
        while (i2 < i) {
            WeakReference weakReference = (WeakReference) map.get((String) nw4Var.get(i2));
            i2++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    public final synchronized ImageView.ScaleType k() {
        if (!((Boolean) w82.d.c.a(x92.G6)).booleanValue()) {
            return null;
        }
        ym3 ym3Var = this.t;
        if (ym3Var == null) {
            sv2.b("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        hw j = ym3Var.j();
        if (j != null) {
            return (ImageView.ScaleType) va0.c0(j);
        }
        return cm3.k;
    }

    public final void l() {
        dz4 dz4Var;
        if (((Boolean) w82.d.c.a(x92.n4)).booleanValue()) {
            nl3 nl3Var = this.j;
            synchronized (nl3Var) {
                dz4Var = nl3Var.n;
            }
            if (dz4Var == null) {
                return;
            }
            this.F = new lz4();
            zw4.J(dz4Var, new vi1(this), this.i);
            return;
        }
        s("Google", true);
    }

    public final synchronized void m(View view, Map map, Map map2) {
        this.l.a(this.t);
        this.k.e(view, map, map2, k());
        this.v = true;
    }

    public final void n(View view, hw hwVar) {
        y03 i = this.j.i();
        if (this.m.c() && hwVar != null && i != null && view != null) {
            jv5.A.v.b(view, hwVar);
        }
    }

    public final synchronized void o(ym3 ym3Var) {
        Iterator<String> keys;
        View view;
        nz1 nz1Var;
        if (this.u) {
            return;
        }
        this.t = ym3Var;
        cm3 cm3Var = this.l;
        cm3Var.g.execute(new us2(2, cm3Var, ym3Var));
        this.k.p(ym3Var.e(), ym3Var.o(), ym3Var.k(), ym3Var, ym3Var);
        l92 l92Var = x92.Z1;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && (nz1Var = this.y.b) != null) {
            nz1Var.c(ym3Var.e());
        }
        if (((Boolean) w82Var.c.a(x92.s1)).booleanValue()) {
            yh4 yh4Var = this.b;
            if (yh4Var.k0 && (keys = yh4Var.j0.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    WeakReference weakReference = (WeakReference) this.t.n().get(next);
                    this.D.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                        t22 t22Var = new t22(this.A, view);
                        this.E.add(t22Var);
                        t22Var.a0.add(new il3(this, next));
                        t22Var.c(3);
                    }
                }
            }
        }
        if (ym3Var.g() != null) {
            t22 g = ym3Var.g();
            g.a0.add(this.x);
            g.c(3);
        }
    }

    public final void p(ym3 ym3Var) {
        ul3 ul3Var = this.k;
        View e = ym3Var.e();
        ym3Var.n();
        ul3Var.q(e);
        if (ym3Var.f() != null) {
            ym3Var.f().setClickable(false);
            ym3Var.f().removeAllViews();
        }
        if (ym3Var.g() != null) {
            t22 g = ym3Var.g();
            g.a0.remove(this.x);
        }
        this.t = null;
    }

    public final synchronized void q() {
        this.u = true;
        this.i.execute(new g53(1, this));
        ee3 ee3Var = this.c;
        ee3Var.getClass();
        ee3Var.R0(new cz1(1, null));
    }

    public final void r(FrameLayout frameLayout) {
        hw l = this.j.l();
        if (this.m.c() && l != null && frameLayout != null) {
            c14 c14Var = jv5.A.v;
            if (((Boolean) w82.d.c.a(x92.i4)).booleanValue() && mu2.Q.P) {
                Object c0 = va0.c0(l);
                if (c0 instanceof jn4) {
                    ((jn4) c0).a(frameLayout);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(String str, boolean z) {
        boolean z2;
        boolean z3;
        String str2;
        va0 va0Var;
        String valueOf;
        String str3;
        String concat;
        String str4;
        if (this.m.c() && !TextUtils.isEmpty(str)) {
            nl3 nl3Var = this.j;
            y03 i = nl3Var.i();
            y03 j = nl3Var.j();
            if (i == null && j == null) {
                sv2.g("Omid display and video webview are null. Skipping initialization.");
                return;
            }
            boolean z4 = false;
            if (i != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (j != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            l92 l92Var = x92.l4;
            w82 w82Var = w82.d;
            int i2 = 2;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                this.m.a();
                int j2 = this.m.a().j();
                int i3 = j2 - 1;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (j2 != 1) {
                            if (j2 != 2) {
                                str4 = "UNKNOWN";
                            } else {
                                str4 = "DISPLAY";
                            }
                        } else {
                            str4 = "VIDEO";
                        }
                        sv2.g("Unknown omid media type: " + str4 + ". Not initializing Omid.");
                        return;
                    } else if (i != null) {
                        z4 = true;
                        z3 = false;
                    } else {
                        sv2.g("Omid media type was display but there was no display webview.");
                        return;
                    }
                } else if (j != null) {
                    z3 = true;
                } else {
                    sv2.g("Omid media type was video but there was no video webview.");
                    return;
                }
            } else {
                z4 = z2;
            }
            if (z4) {
                str2 = null;
            } else {
                str2 = "javascript";
                i = j;
            }
            i.m0();
            jv5 jv5Var = jv5.A;
            if (!jv5Var.v.d(this.A)) {
                sv2.g("Failed to initialize omid in InternalNativeAd");
                return;
            }
            xv2 xv2Var = this.z;
            String str5 = xv2Var.Q + "." + xv2Var.R;
            int i4 = 3;
            if (z3) {
                i2 = 3;
                i4 = 2;
            } else if (this.j.e() == 3) {
                i4 = 4;
            }
            c14 c14Var = jv5Var.v;
            WebView m0 = i.m0();
            String str6 = this.b.l0;
            c14Var.getClass();
            if (((Boolean) w82Var.c.a(x92.i4)).booleanValue()) {
                in4 in4Var = mu2.Q;
                if (in4Var.P) {
                    if (!TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str5)) {
                            sh3 sh3Var = new sh3(str, str5);
                            rn4 g = c14.g("javascript");
                            rn4 g2 = c14.g(str2);
                            on4 e = c14.e(d14.a(i2));
                            rn4 rn4Var = rn4.NONE;
                            if (g == rn4Var) {
                                concat = "Omid js session error; Unable to parse impression owner: javascript";
                            } else {
                                if (e == null) {
                                    valueOf = d14.b(i2);
                                    str3 = "Omid js session error; Unable to parse creative type: ";
                                } else if (e == on4.VIDEO && g2 == rn4Var) {
                                    valueOf = String.valueOf(str2);
                                    str3 = "Omid js session error; Video events owner unknown for video creative: ";
                                } else {
                                    ln4 ln4Var = new ln4(sh3Var, m0, str6, mn4.JAVASCRIPT);
                                    kn4 a = kn4.a(e, c14.f(tr0.a(i4)), g, g2);
                                    if (in4Var.P) {
                                        va0Var = new va0(new nn4(a, ln4Var));
                                        if (va0Var != null) {
                                            sv2.g("Failed to create omid session in InternalNativeAd");
                                            return;
                                        }
                                        nl3 nl3Var2 = this.j;
                                        synchronized (nl3Var2) {
                                            nl3Var2.l = va0Var;
                                        }
                                        i.j0(va0Var);
                                        if (z3) {
                                            jv5Var.v.b(j.x(), va0Var);
                                            this.w = true;
                                        }
                                        if (z) {
                                            jv5Var.v.c(va0Var);
                                            i.a("onSdkLoaded", new e7());
                                            return;
                                        }
                                        return;
                                    }
                                    throw new IllegalStateException("Method called before OM SDK activation");
                                }
                                concat = str3.concat(valueOf);
                            }
                            sv2.g(concat);
                        } else {
                            throw new IllegalArgumentException("Version is null or empty");
                        }
                    } else {
                        throw new IllegalArgumentException("Name is null or empty");
                    }
                }
            }
            va0Var = null;
            if (va0Var != null) {
            }
        }
    }
}