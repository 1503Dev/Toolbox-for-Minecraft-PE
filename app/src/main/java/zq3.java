package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbqi;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zq3  reason: default package */
public final class zq3 {
    public final kj4 a;
    public final yq3 b;

    public zq3(kj4 kj4Var, yq3 yq3Var) {
        this.a = kj4Var;
        this.b = yq3Var;
    }

    public final zm2 a(String str) {
        wk2 wk2Var = (wk2) ((AtomicReference) this.a.S).get();
        if (wk2Var != null) {
            zm2 H = wk2Var.H(str);
            yq3 yq3Var = this.b;
            synchronized (yq3Var) {
                if (!yq3Var.a.containsKey(str)) {
                    try {
                        yq3Var.a.put(str, new xq3(str, H.e(), H.h(), true));
                    } catch (Throwable unused) {
                    }
                }
            }
            return H;
        }
        sv2.g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final mj4 b(String str, JSONObject jSONObject) {
        zk2 z;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                z = new zl2(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                z = new zl2(new zzbqi());
            } else {
                wk2 wk2Var = (wk2) ((AtomicReference) this.a.S).get();
                if (wk2Var != null) {
                    if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        try {
                            String string = jSONObject.getString("class_name");
                            if (wk2Var.D(string)) {
                                z = wk2Var.z("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                            } else if (wk2Var.P(string)) {
                                z = wk2Var.z(string);
                            } else {
                                z = wk2Var.z("com.google.ads.mediation.customevent.CustomEventAdapter");
                            }
                        } catch (JSONException e) {
                            sv2.e("Invalid custom event.", e);
                        }
                    }
                    z = wk2Var.z(str);
                } else {
                    sv2.g("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
            }
            mj4 mj4Var = new mj4(z);
            this.b.b(str, mj4Var);
            return mj4Var;
        } catch (Throwable th) {
            if (((Boolean) w82.d.c.a(x92.S7)).booleanValue()) {
                this.b.b(str, null);
            }
            throw new ni4(th);
        }
    }
}