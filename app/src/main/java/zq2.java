package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zq2  reason: default package */
public final class zq2 extends fy4 {
    public final Object Q;
    public final Context R;
    public SharedPreferences S;
    public final ck2 T;

    public zq2(Context context, ck2 ck2Var) {
        super(1);
        this.Q = new Object();
        this.R = context.getApplicationContext();
        this.T = ck2Var;
    }

    public static JSONObject p(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", xv2.c().P);
            jSONObject.put("mf", mb2.a.d());
            jSONObject.put("cl", "525816637");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // defpackage.fy4
    public final dz4 g() {
        synchronized (this.Q) {
            if (this.S == null) {
                this.S = this.R.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        long j = this.S.getLong("js_last_update", 0L);
        jv5.A.j.getClass();
        if (System.currentTimeMillis() - j < ((Long) mb2.b.d()).longValue()) {
            return zw4.C(null);
        }
        return zw4.E(this.T.a(p(this.R)), new at4() { // from class: yq2
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                zq2 zq2Var = zq2.this;
                JSONObject jSONObject = (JSONObject) obj;
                Context context = zq2Var.R;
                p92 p92Var = x92.a;
                w82 w82Var = w82.d;
                s92 s92Var = w82Var.b;
                SharedPreferences.Editor edit = context.getSharedPreferences("google_ads_flags", 0).edit();
                r92 r92Var = w82Var.a;
                int i = db2.a;
                Iterator it = r92Var.a.iterator();
                while (it.hasNext()) {
                    q92 q92Var = (q92) it.next();
                    if (q92Var.a == 1) {
                        q92Var.d(edit, q92Var.a(jSONObject));
                    }
                }
                if (jSONObject != null) {
                    edit.putString("flag_configuration", jSONObject.toString());
                } else {
                    sv2.d("Flag Json is null.");
                }
                s92 s92Var2 = w82.d.b;
                edit.commit();
                SharedPreferences.Editor edit2 = zq2Var.S.edit();
                jv5.A.j.getClass();
                edit2.putLong("js_last_update", System.currentTimeMillis()).apply();
                return null;
            }
        }, zw2.f);
    }
}