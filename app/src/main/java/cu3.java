package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cu3  reason: default package */
public final class cu3 implements tu3, rt3 {
    public final ju3 a;
    public final uu3 b;
    public final st3 c;
    public final xt3 d;
    public final qt3 e;
    public final qu3 f;
    public final String g;
    public JSONObject m;
    public boolean p;
    public int q;
    public boolean r;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();
    public final HashMap k = new HashMap();
    public String l = "{}";
    public long n = RecyclerView.FOREVER_NS;
    public yt3 o = yt3.NONE;
    public bu3 s = bu3.UNKNOWN;
    public final String h = "afma-sdk-a-v22.1.0";

    public cu3(ju3 ju3Var, uu3 uu3Var, st3 st3Var, Context context, xv2 xv2Var, xt3 xt3Var, qu3 qu3Var) {
        this.a = ju3Var;
        this.b = uu3Var;
        this.c = st3Var;
        this.e = new qt3(context);
        this.g = xv2Var.P;
        this.d = xt3Var;
        this.f = qu3Var;
        jv5.A.m.g = this;
    }

    public final synchronized bx2 a(String str) {
        bx2 bx2Var;
        bx2Var = new bx2();
        if (this.j.containsKey(str)) {
            bx2Var.a((ut3) this.j.get(str));
        } else {
            if (!this.k.containsKey(str)) {
                this.k.put(str, new ArrayList());
            }
            ((List) this.k.get(str)).add(bx2Var);
        }
        return bx2Var;
    }

    public final synchronized void b(String str, ut3 ut3Var) {
        l92 l92Var = x92.x7;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && f()) {
            if (this.q >= ((Integer) w82Var.c.a(x92.z7)).intValue()) {
                sv2.g("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.i.containsKey(str)) {
                this.i.put(str, new ArrayList());
            }
            this.q++;
            ((List) this.i.get(str)).add(ut3Var);
            if (!((Boolean) w82Var.c.a(x92.T7)).booleanValue()) {
                return;
            }
            String str2 = ut3Var.R;
            this.j.put(str2, ut3Var);
            if (this.k.containsKey(str2)) {
                List<bx2> list = (List) this.k.get(str2);
                for (bx2 bx2Var : list) {
                    bx2Var.a(ut3Var);
                }
                list.clear();
            }
        }
    }

    public final void c() {
        String str;
        boolean z;
        l92 l92Var = x92.x7;
        w82 w82Var = w82.d;
        if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            return;
        }
        if (((Boolean) w82Var.c.a(x92.M7)).booleanValue()) {
            nl5 b = jv5.A.g.b();
            b.B();
            synchronized (b.a) {
                z = b.A;
            }
            if (z) {
                h();
                return;
            }
        }
        nl5 b2 = jv5.A.g.b();
        b2.B();
        synchronized (b2.a) {
            str = b2.z;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (new JSONObject(str).optBoolean("isTestMode", false)) {
                h();
            }
        } catch (JSONException unused) {
        }
    }

    public final synchronized void d(og3 og3Var, bu3 bu3Var) {
        if (!f()) {
            try {
                og3Var.P3(oj4.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                sv2.g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (!((Boolean) w82.d.c.a(x92.x7)).booleanValue()) {
            try {
                og3Var.P3(oj4.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                sv2.g("Ad inspector had an internal error.");
                return;
            }
        }
        this.s = bu3Var;
        this.a.a(og3Var, new ch2(this), new bf2(1, this.f));
        return;
    }

    public final void e(boolean z) {
        if (!this.r && z) {
            h();
        }
        k(z, true);
    }

    public final synchronized boolean f() {
        boolean z;
        boolean z2;
        if (((Boolean) w82.d.c.a(x92.M7)).booleanValue()) {
            if (!this.p) {
                r42 r42Var = jv5.A.m;
                synchronized (r42Var.a) {
                    z2 = r42Var.e;
                }
                if (!z2) {
                    z = false;
                    return z;
                }
            }
            z = true;
            return z;
        }
        return this.p;
    }

    public final synchronized JSONObject g() {
        JSONObject jSONObject;
        boolean z;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.i.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (ut3 ut3Var : (List) entry.getValue()) {
                if (ut3Var.T != tt3.AD_REQUESTED) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    jSONArray.put(ut3Var.a());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    public final void h() {
        String str;
        this.r = true;
        xt3 xt3Var = this.d;
        jt3 jt3Var = xt3Var.a;
        jt3Var.e.b(new hq1(4, jt3Var, new vt3(xt3Var)), jt3Var.j);
        this.a.R = this;
        this.b.f = this;
        this.c.i = this;
        this.f.T = this;
        nl5 b = jv5.A.g.b();
        b.B();
        synchronized (b.a) {
            str = b.z;
        }
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    k(jSONObject.optBoolean("isTestMode", false), false);
                    j((yt3) Enum.valueOf(yt3.class, jSONObject.optString("gesture", "NONE")), false);
                    this.l = jSONObject.optString("networkExtras", "{}");
                    this.n = jSONObject.optLong("networkExtrasExpirationSecs", RecyclerView.FOREVER_NS);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final void i() {
        String jSONObject;
        jv5 jv5Var = jv5.A;
        nl5 b = jv5Var.g.b();
        synchronized (this) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("isTestMode", this.p);
                jSONObject2.put("gesture", this.o);
                long j = this.n;
                jv5Var.j.getClass();
                if (j > System.currentTimeMillis() / 1000) {
                    jSONObject2.put("networkExtras", this.l);
                    jSONObject2.put("networkExtrasExpirationSecs", this.n);
                }
            } catch (JSONException unused) {
            }
            jSONObject = jSONObject2.toString();
        }
        b.getClass();
        if (((Boolean) w82.d.c.a(x92.x7)).booleanValue()) {
            b.B();
            synchronized (b.a) {
                if (!b.z.equals(jSONObject)) {
                    b.z = jSONObject;
                    SharedPreferences.Editor editor = b.g;
                    if (editor != null) {
                        editor.putString("inspector_info", jSONObject);
                        b.g.apply();
                    }
                    b.D();
                }
            }
        }
    }

    public final synchronized void j(yt3 yt3Var, boolean z) {
        if (this.o == yt3Var) {
            return;
        }
        if (f()) {
            l();
        }
        this.o = yt3Var;
        if (f()) {
            m();
        }
        if (z) {
            i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003c A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:12:0x0023, B:20:0x002d, B:25:0x003c, B:21:0x0031, B:23:0x0037, B:13:0x0024, B:14:0x0026), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void k(boolean z, boolean z2) {
        boolean z3;
        if (this.p == z) {
            return;
        }
        this.p = z;
        if (z) {
            if (((Boolean) w82.d.c.a(x92.M7)).booleanValue()) {
                r42 r42Var = jv5.A.m;
                synchronized (r42Var.a) {
                    z3 = r42Var.e;
                }
                if (!z3) {
                }
            }
            m();
            if (!z2) {
                i();
                return;
            }
            return;
        }
        if (!f()) {
            l();
        }
        if (!z2) {
        }
    }

    public final synchronized void l() {
        SensorManager sensorManager;
        Sensor sensor;
        int ordinal = this.o.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            st3 st3Var = this.c;
            synchronized (st3Var) {
                if (st3Var.j && (sensorManager = st3Var.a) != null && (sensor = st3Var.b) != null) {
                    sensorManager.unregisterListener(st3Var, sensor);
                    st3Var.j = false;
                    vz3.k("Stopped listening for flick gestures.");
                }
            }
            return;
        }
        uu3 uu3Var = this.b;
        synchronized (uu3Var) {
            if (uu3Var.g) {
                SensorManager sensorManager2 = uu3Var.b;
                if (sensorManager2 != null) {
                    sensorManager2.unregisterListener(uu3Var, uu3Var.c);
                    vz3.k("Stopped listening for shake gestures.");
                }
                uu3Var.g = false;
            }
        }
    }

    public final synchronized void m() {
        int ordinal = this.o.ordinal();
        if (ordinal == 1) {
            this.b.a();
        } else if (ordinal != 2) {
        } else {
            this.c.a();
        }
    }
}