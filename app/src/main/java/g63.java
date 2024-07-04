package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g63  reason: default package */
public final class g63 implements w53 {
    public final Context a;
    public final nl5 b = jv5.A.g.b();

    public g63(Context context) {
        this.a = context;
    }

    @Override // defpackage.w53
    public final void a(HashMap hashMap) {
        if (hashMap.isEmpty()) {
            return;
        }
        String str = (String) hashMap.get("gad_idless");
        if (str != null) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            hashMap.remove("gad_idless");
            if (parseBoolean) {
                try {
                    l92 l92Var = x92.n2;
                    w82 w82Var = w82.d;
                    if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                        fr4 f = fr4.f(this.a);
                        f.getClass();
                        synchronized (fr4.class) {
                            f.d(false);
                        }
                    }
                    if (((Boolean) w82Var.c.a(x92.w2)).booleanValue()) {
                        fr4 f2 = fr4.f(this.a);
                        f2.getClass();
                        synchronized (fr4.class) {
                            f2.d(true);
                        }
                    }
                    if (((Boolean) w82Var.c.a(x92.o2)).booleanValue()) {
                        gr4.f(this.a).g();
                        if (((Boolean) w82Var.c.a(x92.s2)).booleanValue()) {
                            gr4.f(this.a).f.b("paidv2_publisher_option");
                        }
                        if (((Boolean) w82Var.c.a(x92.t2)).booleanValue()) {
                            gr4.f(this.a).f.b("paidv2_user_option");
                        }
                    }
                } catch (IOException e) {
                    jv5.A.g.f("SetAppMeasurementConsentConfig.run", e);
                }
            }
            l92 l92Var2 = x92.m0;
            w82 w82Var2 = w82.d;
            if (((Boolean) w82Var2.c.a(l92Var2)).booleanValue()) {
                this.b.o(parseBoolean);
                if (((Boolean) w82Var2.c.a(x92.f5)).booleanValue() && parseBoolean) {
                    this.a.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : hashMap.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (((Boolean) w82.d.c.a(x92.i0)).booleanValue()) {
            qt2 qt2Var = jv5.A.w;
            qt2Var.getClass();
            qt2Var.d(new nt2(0, bundle), "setConsent");
        }
    }
}