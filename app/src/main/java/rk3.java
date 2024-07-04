package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* renamed from: rk3  reason: default package */
public final class rk3 implements ul3 {
    public za3 A;
    public final Context a;
    public final wl3 b;
    public final JSONObject c;
    public final kp3 d;
    public final nl3 e;
    public final rz1 f;
    public final zd3 g;
    public final ld3 h;
    public final ni3 i;
    public final yh4 j;
    public final xv2 k;
    public final li4 l;
    public final j73 m;
    public final km3 n;
    public final kd o;
    public final ji3 p;
    public final gn4 q;
    public final qm4 r;
    public boolean t;
    public boolean s = false;
    public boolean u = false;
    public boolean v = false;
    public Point w = new Point();
    public Point x = new Point();
    public long y = 0;
    public long z = 0;

    public rk3(Context context, wl3 wl3Var, JSONObject jSONObject, kp3 kp3Var, nl3 nl3Var, rz1 rz1Var, zd3 zd3Var, ld3 ld3Var, ni3 ni3Var, yh4 yh4Var, xv2 xv2Var, li4 li4Var, j73 j73Var, km3 km3Var, kd kdVar, ji3 ji3Var, gn4 gn4Var, qm4 qm4Var) {
        this.a = context;
        this.b = wl3Var;
        this.c = jSONObject;
        this.d = kp3Var;
        this.e = nl3Var;
        this.f = rz1Var;
        this.g = zd3Var;
        this.h = ld3Var;
        this.i = ni3Var;
        this.j = yh4Var;
        this.k = xv2Var;
        this.l = li4Var;
        this.m = j73Var;
        this.n = km3Var;
        this.o = kdVar;
        this.p = ji3Var;
        this.q = gn4Var;
        this.r = qm4Var;
    }

    @Override // defpackage.ul3
    public final void I(String str) {
        z(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // defpackage.ul3
    public final boolean J() {
        return this.c.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // defpackage.ul3
    public final boolean Q() {
        if (a() != 0) {
            if (((Boolean) w82.d.c.a(x92.T8)).booleanValue()) {
                return this.l.i.Y;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.ul3
    public final int a() {
        if (this.l.i != null) {
            if (((Boolean) w82.d.c.a(x92.T8)).booleanValue()) {
                return this.l.i.X;
            }
            return 0;
        }
        return 0;
    }

    @Override // defpackage.ul3
    public final void b(Bundle bundle) {
        if (bundle == null) {
            sv2.b("Touch event data is null. No touch event is reported.");
        } else if (!x("touch_reporting")) {
            sv2.d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            int i = bundle.getInt("duration_ms");
            this.f.b.g((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i);
        }
    }

    @Override // defpackage.ul3
    public final JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject c = gt2.c(this.a, map, map2, view, scaleType);
        JSONObject f = gt2.f(this.a, view);
        JSONObject e = gt2.e(view);
        JSONObject d = gt2.d(this.a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", c);
            jSONObject.put("ad_view_signal", f);
            jSONObject.put("scroll_view_signal", e);
            jSONObject.put("lock_screen_signal", d);
            return jSONObject;
        } catch (JSONException e2) {
            sv2.e("Unable to create native ad view signals JSON.", e2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // defpackage.ul3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        boolean z2;
        JSONObject jSONObject;
        Point point;
        Point point2;
        JSONObject jSONObject2;
        if (this.c.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) w82.d.c.a(x92.T8)).booleanValue()) {
                z2 = true;
                if (!z2) {
                    if (!this.v) {
                        sv2.b("Custom click reporting failed. enableCustomClickGesture is not set.");
                        return;
                    } else if (!this.c.optBoolean("allow_custom_click_gesture", false)) {
                        sv2.b("Custom click reporting failed. Ad unit id not in the allow list.");
                        return;
                    }
                }
                JSONObject c = gt2.c(this.a, map, map2, view2, scaleType);
                JSONObject f = gt2.f(this.a, view2);
                JSONObject e = gt2.e(view2);
                JSONObject d = gt2.d(this.a, view2);
                String v = v(view, map);
                JSONObject b = gt2.b(v, this.a, this.x, this.w);
                if (z2) {
                    try {
                        jSONObject = this.c;
                        point = this.x;
                        point2 = this.w;
                        try {
                            jSONObject2 = new JSONObject();
                        } catch (Exception e2) {
                            e = e2;
                            jSONObject2 = null;
                        }
                    } catch (JSONException e3) {
                        sv2.e("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                        jv5.A.g.f("FirstPartyNativeAdCore.performCustomClickGesture", e3);
                    }
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject2.put("start_point", jSONObject3);
                        jSONObject2.put("end_point", jSONObject4);
                        jSONObject2.put("duration_ms", i);
                    } catch (Exception e4) {
                        e = e4;
                        sv2.e("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject.put("custom_click_gesture_signal", jSONObject2);
                        z(view2, f, c, e, d, v, b, null, z, true);
                    }
                    jSONObject.put("custom_click_gesture_signal", jSONObject2);
                }
                z(view2, f, c, e, d, v, b, null, z, true);
            }
        }
        z2 = false;
        if (!z2) {
        }
        JSONObject c2 = gt2.c(this.a, map, map2, view2, scaleType);
        JSONObject f2 = gt2.f(this.a, view2);
        JSONObject e5 = gt2.e(view2);
        JSONObject d2 = gt2.d(this.a, view2);
        String v2 = v(view, map);
        JSONObject b2 = gt2.b(v2, this.a, this.x, this.w);
        if (z2) {
        }
        z(view2, f2, c2, e5, d2, v2, b2, null, z, true);
    }

    @Override // defpackage.ul3
    public final void e(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        String e;
        JSONObject c = gt2.c(this.a, map, map2, view, scaleType);
        JSONObject f = gt2.f(this.a, view);
        JSONObject e2 = gt2.e(view);
        JSONObject d = gt2.d(this.a, view);
        if (((Boolean) w82.d.c.a(x92.O2)).booleanValue()) {
            try {
                e = this.f.b.e(this.a, view, null);
            } catch (Exception unused) {
                sv2.d("Exception getting data.");
            }
            y(f, c, e2, d, e, null, gt2.g(this.a, this.j));
        }
        e = null;
        y(f, c, e2, d, e, null, gt2.g(this.a, this.j));
    }

    @Override // defpackage.ul3
    public final void f() {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            return;
        }
        km3 km3Var = this.n;
        if (km3Var.R != null && km3Var.U != null) {
            km3Var.a();
            try {
                km3Var.R.b();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // defpackage.ul3
    public final void g() {
        kp3 kp3Var = this.d;
        synchronized (kp3Var) {
            by4 by4Var = kp3Var.l;
            if (by4Var != null) {
                zw4.J(by4Var, new zf(0), kp3Var.f);
                kp3Var.l = null;
            }
        }
    }

    @Override // defpackage.ul3
    public final void h() {
        try {
            za3 za3Var = this.A;
            if (za3Var != null) {
                za3Var.b();
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.ul3
    public final void i(za3 za3Var) {
        this.A = za3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [jm3, mg2] */
    @Override // defpackage.ul3
    public final void j(final re2 re2Var) {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            sv2.g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        final km3 km3Var = this.n;
        km3Var.R = re2Var;
        jm3 jm3Var = km3Var.S;
        if (jm3Var != null) {
            kp3 kp3Var = km3Var.P;
            synchronized (kp3Var) {
                by4 by4Var = kp3Var.l;
                if (by4Var != null) {
                    zw4.J(by4Var, new mr1("/unconfirmedClick", jm3Var), kp3Var.f);
                }
            }
        }
        ?? r1 = new mg2() { // from class: jm3
            @Override // defpackage.mg2
            public final void b(Object obj, Map map) {
                km3 km3Var2 = km3.this;
                re2 re2Var2 = re2Var;
                try {
                    km3Var2.U = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    sv2.d("Failed to call parse unconfirmedClickTimestamp.");
                }
                km3Var2.T = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (re2Var2 == null) {
                    sv2.b("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    re2Var2.S1(str);
                } catch (RemoteException e) {
                    sv2.i("#007 Could not call remote method.", e);
                }
            }
        };
        km3Var.S = r1;
        km3Var.P.c("/unconfirmedClick", r1);
    }

    @Override // defpackage.ul3
    public final void k(de3 de3Var) {
        n84 n84Var;
        n84 n84Var2;
        try {
            if (this.u) {
                return;
            }
            if (de3Var == null) {
                nl3 nl3Var = this.e;
                synchronized (nl3Var) {
                    n84Var = nl3Var.g;
                }
                if (n84Var != null) {
                    this.u = true;
                    gn4 gn4Var = this.q;
                    synchronized (nl3Var) {
                        n84Var2 = nl3Var.g;
                    }
                    gn4Var.a(n84Var2.Q, this.r);
                    h();
                    return;
                }
            }
            this.u = true;
            this.q.a(de3Var.e(), this.r);
            h();
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.ul3
    public final boolean l(Bundle bundle) {
        JSONObject f;
        if (!x("impression_reporting")) {
            sv2.d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        mv2 mv2Var = n62.f.a;
        mv2Var.getClass();
        if (bundle != null) {
            try {
                f = mv2Var.f(bundle);
            } catch (JSONException e) {
                sv2.e("Error converting Bundle to JSON", e);
            }
            return y(null, null, null, null, null, f, false);
        }
        f = null;
        return y(null, null, null, null, null, f, false);
    }

    @Override // defpackage.ul3
    public final void m() {
        uf0.b("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.c);
            tv2.x(this.d.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            sv2.e("", e);
        }
    }

    @Override // defpackage.ul3
    public final void n(View view) {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            sv2.g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        km3 km3Var = this.n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(km3Var);
        view.setClickable(true);
        km3Var.V = new WeakReference(view);
    }

    @Override // defpackage.ul3
    public final void o(MotionEvent motionEvent, View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        this.w = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        long a = this.o.a();
        this.z = a;
        if (motionEvent.getAction() == 0) {
            this.y = a;
            this.x = this.w;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.w;
        obtain.setLocation(point.x, point.y);
        this.f.b.b(obtain);
        obtain.recycle();
    }

    @Override // defpackage.ul3
    public final void p(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.w = new Point();
        this.x = new Point();
        if (!this.t) {
            this.p.S0(view);
            this.t = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        j73 j73Var = this.m;
        j73Var.getClass();
        j73Var.Y = new WeakReference(this);
        boolean h = gt2.h(this.k.R);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    if (h) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) entry2.getValue()).get();
                if (view3 != null) {
                    if (h) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // defpackage.ul3
    public final void q(View view) {
        this.w = new Point();
        this.x = new Point();
        if (view != null) {
            ji3 ji3Var = this.p;
            synchronized (ji3Var) {
                if (ji3Var.Q.containsKey(view)) {
                    ((t22) ji3Var.Q.get(view)).a0.remove(ji3Var);
                    ji3Var.Q.remove(view);
                }
            }
        }
        this.t = false;
    }

    @Override // defpackage.ul3
    public final void r() {
        this.v = true;
    }

    @Override // defpackage.ul3
    public final JSONObject s(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject c = c(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.v && this.c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (c != null) {
                jSONObject.put("nas", c);
            }
        } catch (JSONException e) {
            sv2.e("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    @Override // defpackage.ul3
    public final void t(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        View view3;
        JSONObject c = gt2.c(this.a, map, map2, view2, scaleType);
        JSONObject f = gt2.f(this.a, view2);
        JSONObject e = gt2.e(view2);
        JSONObject d = gt2.d(this.a, view2);
        String v = v(view, map);
        JSONObject b = gt2.b(v, this.a, this.x, this.w);
        if (true == ((Boolean) w82.d.c.a(x92.U2)).booleanValue()) {
            view3 = view2;
        } else {
            view3 = view;
        }
        z(view3, f, c, e, d, v, b, null, z, false);
    }

    @Override // defpackage.ul3
    public final void u(Bundle bundle) {
        String str;
        if (bundle == null) {
            sv2.b("Click data is null. No click is reported.");
        } else if (!x("click_reporting")) {
            sv2.d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            JSONObject jSONObject = null;
            if (bundle2 != null) {
                str = bundle2.getString("asset_id");
            } else {
                str = null;
            }
            mv2 mv2Var = n62.f.a;
            mv2Var.getClass();
            try {
                jSONObject = mv2Var.f(bundle);
            } catch (JSONException e) {
                sv2.e("Error converting Bundle to JSON", e);
            }
            z(null, null, null, null, null, str, null, jSONObject, false, false);
        }
    }

    public final String v(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int e = this.e.e();
        if (e != 1) {
            if (e != 2) {
                if (e != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    @Override // defpackage.ul3
    public final void w() {
        y(null, null, null, null, null, null, false);
    }

    public final boolean x(String str) {
        JSONObject optJSONObject = this.c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    public final boolean y(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        kp3 kp3Var;
        String str2;
        mg2 qk3Var;
        uf0.b("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) w82.d.c.a(x92.O2)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.a;
            JSONObject jSONObject7 = new JSONObject();
            cu5 cu5Var = jv5.A.c;
            DisplayMetrics B = cu5.B((WindowManager) context.getSystemService("window"));
            try {
                int i = B.widthPixels;
                n62 n62Var = n62.f;
                jSONObject7.put("width", n62Var.a.d(context, i));
                jSONObject7.put("height", n62Var.a.d(context, B.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) w82.d.c.a(x92.e7)).booleanValue()) {
                kp3Var = this.d;
                str2 = "/clickRecorded";
                qk3Var = new bf2(this);
            } else {
                kp3Var = this.d;
                str2 = "/logScionEvent";
                qk3Var = new qk3(this);
            }
            kp3Var.c(str2, qk3Var);
            this.d.c("/nativeImpression", new ah2(this));
            tv2.x(this.d.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (!this.s) {
                this.s = jv5.A.m.g(this.a, this.k.P, this.j.C.toString(), this.l.f);
                return true;
            }
            return true;
        } catch (JSONException e) {
            sv2.e("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:2|3|(1:5)(1:66)|6|(1:65)(1:10)|11|7c|15|(3:17|88|(21:22|23|(1:27)|28|(1:32)|(1:34)|35|(1:37)|38|39|40|(1:42)|43|44|(1:46)|47|(1:51)|52|(1:56)|57|58))|64|23|(2:25|27)|28|(2:30|32)|(0)|35|(0)|38|39|40|(0)|43|44|(0)|47|(2:49|51)|52|(2:54|56)|57|58) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0109, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010a, code lost:
        defpackage.sv2.e("Exception obtaining click signals", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc A[Catch: JSONException -> 0x0196, TryCatch #2 {JSONException -> 0x0196, blocks: (B:3:0x0007, B:7:0x0044, B:9:0x006e, B:13:0x0075, B:14:0x007c, B:16:0x007f, B:17:0x0080, B:19:0x0086, B:20:0x0088, B:22:0x008b, B:29:0x0094, B:31:0x009d, B:33:0x00a7, B:34:0x00ac, B:36:0x00bb, B:38:0x00c5, B:40:0x00cc, B:41:0x00d1, B:44:0x00e4, B:52:0x010f, B:54:0x0124, B:55:0x0129, B:57:0x0139, B:59:0x013f, B:60:0x0144, B:62:0x0154, B:64:0x015a, B:65:0x015f, B:51:0x010a, B:21:0x0089, B:15:0x007d, B:45:0x00e9, B:47:0x00f3, B:48:0x00f8), top: B:73:0x0007, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3 A[Catch: Exception -> 0x0109, TryCatch #3 {Exception -> 0x0109, blocks: (B:45:0x00e9, B:47:0x00f3, B:48:0x00f8), top: B:75:0x00e9, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124 A[Catch: JSONException -> 0x0196, TryCatch #2 {JSONException -> 0x0196, blocks: (B:3:0x0007, B:7:0x0044, B:9:0x006e, B:13:0x0075, B:14:0x007c, B:16:0x007f, B:17:0x0080, B:19:0x0086, B:20:0x0088, B:22:0x008b, B:29:0x0094, B:31:0x009d, B:33:0x00a7, B:34:0x00ac, B:36:0x00bb, B:38:0x00c5, B:40:0x00cc, B:41:0x00d1, B:44:0x00e4, B:52:0x010f, B:54:0x0124, B:55:0x0129, B:57:0x0139, B:59:0x013f, B:60:0x0144, B:62:0x0154, B:64:0x015a, B:65:0x015f, B:51:0x010a, B:21:0x0089, B:15:0x007d, B:45:0x00e9, B:47:0x00f3, B:48:0x00f8), top: B:73:0x0007, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        List list;
        boolean z3;
        l92 l92Var;
        w82 w82Var;
        JSONObject optJSONObject;
        n84 n84Var;
        uf0.b("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            String str2 = null;
            jSONObject7.put("has_custom_click_handler", ((ae2) this.b.g.getOrDefault(this.e.m(), null)) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.e.e());
            jSONObject8.put("view_aware_api_used", z);
            nc2 nc2Var = this.l.i;
            jSONObject8.put("custom_mute_requested", nc2Var != null && nc2Var.V);
            nl3 nl3Var = this.e;
            synchronized (nl3Var) {
                list = nl3Var.f;
            }
            if (!list.isEmpty()) {
                nl3 nl3Var2 = this.e;
                synchronized (nl3Var2) {
                    n84Var = nl3Var2.g;
                }
                if (n84Var != null) {
                    z3 = true;
                    jSONObject8.put("custom_mute_enabled", z3);
                    if (this.n.R != null && this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
                        jSONObject8.put("custom_one_point_five_click_eligible", true);
                    }
                    jSONObject8.put("timestamp", this.o.a());
                    if (this.v && this.c.optBoolean("allow_custom_click_gesture", false)) {
                        jSONObject8.put("custom_click_gesture_eligible", true);
                    }
                    if (z2) {
                        jSONObject8.put("is_custom_click_gesture", true);
                    }
                    jSONObject8.put("has_custom_click_handler", ((ae2) this.b.g.getOrDefault(this.e.m(), null)) != null);
                    optJSONObject = this.c.optJSONObject("tracking_urls_and_actions");
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    str2 = this.f.b.h(this.a, optJSONObject.optString("click_string"), view);
                    jSONObject8.put("click_signals", str2);
                    l92Var = x92.M3;
                    w82Var = w82.d;
                    if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                        jSONObject8.put("open_chrome_custom_tab", true);
                    }
                    if (((Boolean) w82Var.c.a(x92.i7)).booleanValue() && qe0.b()) {
                        jSONObject8.put("try_fallback_for_deep_link", true);
                    }
                    if (((Boolean) w82Var.c.a(x92.j7)).booleanValue() && qe0.b()) {
                        jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
                    }
                    jSONObject7.put("click", jSONObject8);
                    JSONObject jSONObject9 = new JSONObject();
                    long a = this.o.a();
                    jSONObject9.put("time_from_last_touch_down", a - this.y);
                    jSONObject9.put("time_from_last_touch", a - this.z);
                    jSONObject7.put("touch_signal", jSONObject9);
                    tv2.x(this.d.a("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
                }
            }
            z3 = false;
            jSONObject8.put("custom_mute_enabled", z3);
            if (this.n.R != null) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.o.a());
            if (this.v) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
            }
            jSONObject8.put("has_custom_click_handler", ((ae2) this.b.g.getOrDefault(this.e.m(), null)) != null);
            optJSONObject = this.c.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
            }
            str2 = this.f.b.h(this.a, optJSONObject.optString("click_string"), view);
            jSONObject8.put("click_signals", str2);
            l92Var = x92.M3;
            w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            }
            if (((Boolean) w82Var.c.a(x92.i7)).booleanValue()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) w82Var.c.a(x92.j7)).booleanValue()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject92 = new JSONObject();
            long a2 = this.o.a();
            jSONObject92.put("time_from_last_touch_down", a2 - this.y);
            jSONObject92.put("time_from_last_touch", a2 - this.z);
            jSONObject7.put("touch_signal", jSONObject92);
            tv2.x(this.d.a("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e) {
            sv2.e("Unable to create click JSON.", e);
        }
    }
}