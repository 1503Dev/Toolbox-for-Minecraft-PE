package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* renamed from: an3  reason: default package */
public final class an3 implements ul3 {
    public final pl2 a;
    public final zd3 b;
    public final ld3 c;
    public final ni3 d;
    public final Context e;
    public final yh4 f;
    public final xv2 g;
    public final li4 h;
    public boolean i = false;
    public boolean j = false;
    public boolean k = true;
    public final ll2 l;
    public final ml2 m;

    public an3(ll2 ll2Var, ml2 ml2Var, pl2 pl2Var, zd3 zd3Var, ld3 ld3Var, ni3 ni3Var, Context context, yh4 yh4Var, xv2 xv2Var, li4 li4Var) {
        this.l = ll2Var;
        this.m = ml2Var;
        this.a = pl2Var;
        this.b = zd3Var;
        this.c = ld3Var;
        this.d = ni3Var;
        this.e = context;
        this.f = yh4Var;
        this.g = xv2Var;
        this.h = li4Var;
    }

    public static final HashMap x(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // defpackage.ul3
    public final void I(String str) {
    }

    @Override // defpackage.ul3
    public final boolean J() {
        return this.f.L;
    }

    @Override // defpackage.ul3
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.ul3
    public final int a() {
        return 0;
    }

    @Override // defpackage.ul3
    public final void b(Bundle bundle) {
    }

    @Override // defpackage.ul3
    public final JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // defpackage.ul3
    public final void d(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        String str;
        if (!this.j) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else if (this.f.L) {
            v(view2);
            return;
        } else {
            str = "Custom click reporting for 3p ads failed. Ad unit id not in allow list.";
        }
        sv2.g(str);
    }

    @Override // defpackage.ul3
    public final void e(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        boolean z;
        try {
            if (!this.i) {
                this.i = jv5.A.m.g(this.e, this.g.P, this.f.C.toString(), this.h.f);
            }
            if (!this.k) {
                return;
            }
            pl2 pl2Var = this.a;
            if (pl2Var != null && !pl2Var.J()) {
                this.a.F();
                this.b.a();
                return;
            }
            ll2 ll2Var = this.l;
            boolean z2 = true;
            if (ll2Var != null) {
                Parcel Z = ll2Var.Z(ll2Var.A(), 13);
                ClassLoader classLoader = k22.a;
                if (Z.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                Z.recycle();
                if (!z) {
                    ll2 ll2Var2 = this.l;
                    ll2Var2.c0(ll2Var2.A(), 10);
                    this.b.a();
                    return;
                }
            }
            ml2 ml2Var = this.m;
            if (ml2Var != null) {
                Parcel Z2 = ml2Var.Z(ml2Var.A(), 11);
                ClassLoader classLoader2 = k22.a;
                if (Z2.readInt() == 0) {
                    z2 = false;
                }
                Z2.recycle();
                if (!z2) {
                    ml2 ml2Var2 = this.m;
                    ml2Var2.c0(ml2Var2.A(), 8);
                    this.b.a();
                }
            }
        } catch (RemoteException e) {
            sv2.h("Failed to call recordImpression", e);
        }
    }

    @Override // defpackage.ul3
    public final void f() {
    }

    @Override // defpackage.ul3
    public final void g() {
    }

    @Override // defpackage.ul3
    public final void h() {
        throw null;
    }

    @Override // defpackage.ul3
    public final void i(za3 za3Var) {
        sv2.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // defpackage.ul3
    public final void j(re2 re2Var) {
    }

    @Override // defpackage.ul3
    public final void k(de3 de3Var) {
        sv2.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // defpackage.ul3
    public final boolean l(Bundle bundle) {
        return false;
    }

    @Override // defpackage.ul3
    public final void m() {
    }

    @Override // defpackage.ul3
    public final void n(View view) {
    }

    @Override // defpackage.ul3
    public final void o(MotionEvent motionEvent, View view) {
    }

    @Override // defpackage.ul3
    public final void p(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Map map3;
        Map map4;
        Object obj;
        hw k;
        try {
            va0 va0Var = new va0(view);
            JSONObject jSONObject = this.f.j0;
            boolean z = true;
            if (((Boolean) w82.d.c.a(x92.h1)).booleanValue() && jSONObject.length() != 0) {
                if (map == null) {
                    map3 = new HashMap();
                } else {
                    map3 = map;
                }
                if (map2 == null) {
                    map4 = new HashMap();
                } else {
                    map4 = map2;
                }
                HashMap hashMap = new HashMap();
                hashMap.putAll(map3);
                hashMap.putAll(map4);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) w82.d.c.a(x92.i1)).booleanValue() && next.equals("3010")) {
                                pl2 pl2Var = this.a;
                                Object obj2 = null;
                                if (pl2Var != null) {
                                    try {
                                        k = pl2Var.k();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    ll2 ll2Var = this.l;
                                    if (ll2Var != null) {
                                        k = ll2Var.d3();
                                    } else {
                                        ml2 ml2Var = this.m;
                                        if (ml2Var != null) {
                                            k = ml2Var.d3();
                                        } else {
                                            k = null;
                                        }
                                    }
                                }
                                if (k != null) {
                                    obj2 = va0.c0(k);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                mq2.b(optJSONArray, arrayList);
                                cu5 cu5Var = jv5.A.c;
                                ClassLoader classLoader = this.e.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.k = z;
            HashMap x = x(map);
            HashMap x2 = x(map2);
            pl2 pl2Var2 = this.a;
            if (pl2Var2 != null) {
                pl2Var2.Q0(va0Var, new va0(x), new va0(x2));
                return;
            }
            ll2 ll2Var2 = this.l;
            if (ll2Var2 != null) {
                va0 va0Var2 = new va0(x);
                va0 va0Var3 = new va0(x2);
                Parcel A = ll2Var2.A();
                k22.e(A, va0Var);
                k22.e(A, va0Var2);
                k22.e(A, va0Var3);
                ll2Var2.c0(A, 22);
                ll2 ll2Var3 = this.l;
                Parcel A2 = ll2Var3.A();
                k22.e(A2, va0Var);
                ll2Var3.c0(A2, 12);
                return;
            }
            ml2 ml2Var2 = this.m;
            if (ml2Var2 != null) {
                va0 va0Var4 = new va0(x);
                va0 va0Var5 = new va0(x2);
                Parcel A3 = ml2Var2.A();
                k22.e(A3, va0Var);
                k22.e(A3, va0Var4);
                k22.e(A3, va0Var5);
                ml2Var2.c0(A3, 22);
                ml2 ml2Var3 = this.m;
                Parcel A4 = ml2Var3.A();
                k22.e(A4, va0Var);
                ml2Var3.c0(A4, 10);
            }
        } catch (RemoteException e) {
            sv2.h("Failed to call trackView", e);
        }
    }

    @Override // defpackage.ul3
    public final void q(View view) {
        try {
            va0 va0Var = new va0(view);
            pl2 pl2Var = this.a;
            if (pl2Var != null) {
                pl2Var.L0(va0Var);
                return;
            }
            ll2 ll2Var = this.l;
            if (ll2Var != null) {
                Parcel A = ll2Var.A();
                k22.e(A, va0Var);
                ll2Var.c0(A, 16);
                return;
            }
            ml2 ml2Var = this.m;
            if (ml2Var != null) {
                Parcel A2 = ml2Var.A();
                k22.e(A2, va0Var);
                ml2Var.c0(A2, 14);
            }
        } catch (RemoteException e) {
            sv2.h("Failed to call untrackView", e);
        }
    }

    @Override // defpackage.ul3
    public final void r() {
        this.j = true;
    }

    @Override // defpackage.ul3
    public final JSONObject s(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // defpackage.ul3
    public final void t(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.j && this.f.L) {
            return;
        }
        v(view);
    }

    @Override // defpackage.ul3
    public final void u(Bundle bundle) {
    }

    public final void v(View view) {
        boolean z;
        try {
            pl2 pl2Var = this.a;
            if (pl2Var != null && !pl2Var.Q()) {
                this.a.q3(new va0(view));
                this.c.J();
                if (((Boolean) w82.d.c.a(x92.t8)).booleanValue()) {
                    this.d.w();
                    return;
                }
                return;
            }
            ll2 ll2Var = this.l;
            boolean z2 = false;
            if (ll2Var != null) {
                Parcel Z = ll2Var.Z(ll2Var.A(), 14);
                ClassLoader classLoader = k22.a;
                if (Z.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                Z.recycle();
                if (!z) {
                    ll2 ll2Var2 = this.l;
                    va0 va0Var = new va0(view);
                    Parcel A = ll2Var2.A();
                    k22.e(A, va0Var);
                    ll2Var2.c0(A, 11);
                    this.c.J();
                    if (((Boolean) w82.d.c.a(x92.t8)).booleanValue()) {
                        this.d.w();
                        return;
                    }
                    return;
                }
            }
            ml2 ml2Var = this.m;
            if (ml2Var != null) {
                Parcel Z2 = ml2Var.Z(ml2Var.A(), 12);
                ClassLoader classLoader2 = k22.a;
                if (Z2.readInt() != 0) {
                    z2 = true;
                }
                Z2.recycle();
                if (!z2) {
                    ml2 ml2Var2 = this.m;
                    va0 va0Var2 = new va0(view);
                    Parcel A2 = ml2Var2.A();
                    k22.e(A2, va0Var2);
                    ml2Var2.c0(A2, 9);
                    this.c.J();
                    if (((Boolean) w82.d.c.a(x92.t8)).booleanValue()) {
                        this.d.w();
                    }
                }
            }
        } catch (RemoteException e) {
            sv2.h("Failed to call handleClick", e);
        }
    }

    @Override // defpackage.ul3
    public final void w() {
    }
}