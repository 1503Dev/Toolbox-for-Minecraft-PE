package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: wf2  reason: default package */
public final class wf2 implements mg2 {
    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        eg3 eg3Var;
        String str;
        y03 y03Var = (y03) obj;
        xx5 xx5Var = jv5.A.q;
        if (xx5Var.e && (eg3Var = xx5Var.d) != null) {
            String str2 = null;
            if (((Boolean) w82.d.c.a(x92.R8)).booleanValue() && !TextUtils.isEmpty(xx5Var.b)) {
                str = xx5Var.b;
            } else {
                String str3 = xx5Var.a;
                if (str3 != null) {
                    str2 = str3;
                    str = null;
                } else {
                    xx5Var.c("Missing session token and/or appId", "onLMDupdate");
                    str = null;
                }
            }
            kr4 kr4Var = new kr4(str2, str);
            zw5 zw5Var = xx5Var.f;
            xr4 xr4Var = (xr4) eg3Var.Q;
            if (xr4Var.a == null) {
                xr4.c.a("error: %s", "Play Store not found.");
                return;
            }
            aw0 aw0Var = new aw0();
            ps4 ps4Var = xr4Var.a;
            ur4 ur4Var = new ur4(xr4Var, aw0Var, kr4Var, zw5Var, aw0Var);
            ps4Var.getClass();
            ps4Var.a().post(new js4(ps4Var, aw0Var, aw0Var, ur4Var));
            return;
        }
        vz3.k("LastMileDelivery not connected");
    }
}