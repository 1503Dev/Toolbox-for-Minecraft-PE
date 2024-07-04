package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: xx5  reason: default package */
public final class xx5 {
    public zw5 f;
    public y03 c = null;
    public boolean e = false;
    public String a = null;
    public eg3 d = null;
    public String b = null;

    public final void a(String str) {
        b(str, new HashMap());
    }

    public final void b(String str, HashMap hashMap) {
        zw2.e.execute(new bw5(0, this, str, hashMap));
    }

    public final void c(String str, String str2) {
        vz3.k(str);
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            b("onError", hashMap);
        }
    }

    public final void d(y03 y03Var, yr4 yr4Var) {
        String str;
        String str2;
        if (y03Var == null) {
            str = "adWebview missing";
            str2 = "onLMDShow";
        } else {
            this.c = y03Var;
            if (!this.e && !e(y03Var.getContext())) {
                str = "LMDOverlay not bound";
                str2 = "on_play_store_bind";
            } else {
                if (((Boolean) w82.d.c.a(x92.R8)).booleanValue()) {
                    this.b = yr4Var.g();
                }
                if (this.f == null) {
                    this.f = new zw5(0, this);
                }
                eg3 eg3Var = this.d;
                if (eg3Var != null) {
                    zw5 zw5Var = this.f;
                    xr4 xr4Var = (xr4) eg3Var.Q;
                    if (xr4Var.a == null) {
                        xr4.c.a("error: %s", "Play Store not found.");
                        return;
                    } else if (yr4Var.g() == null) {
                        xr4.c.a("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
                        zw5Var.f(new qr4(8160, null));
                        return;
                    } else {
                        aw0 aw0Var = new aw0();
                        ps4 ps4Var = xr4Var.a;
                        tr4 tr4Var = new tr4(xr4Var, aw0Var, yr4Var, zw5Var, aw0Var);
                        ps4Var.getClass();
                        ps4Var.a().post(new js4(ps4Var, aw0Var, aw0Var, tr4Var));
                        return;
                    }
                }
                return;
            }
        }
        c(str, str2);
    }

    public final synchronized boolean e(Context context) {
        if (!qs4.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.d = new eg3(7, new xr4(context));
        } catch (NullPointerException e) {
            vz3.k("Error connecting LMD Overlay service");
            jv5.A.g.f("LastMileDeliveryOverlay.bindLastMileDeliveryService", e);
        }
        if (this.d == null) {
            this.e = false;
            return false;
        }
        if (this.f == null) {
            this.f = new zw5(0, this);
        }
        this.e = true;
        return true;
    }

    public final rr4 f() {
        String str;
        String str2 = null;
        if (((Boolean) w82.d.c.a(x92.R8)).booleanValue() && !TextUtils.isEmpty(this.b)) {
            str = this.b;
        } else {
            String str3 = this.a;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                c("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        }
        return new rr4(str2, str);
    }
}