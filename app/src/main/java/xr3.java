package defpackage;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* renamed from: xr3  reason: default package */
public final class xr3 {
    public final ConcurrentHashMap a;
    public final hv2 b;

    public xr3(fs3 fs3Var, hv2 hv2Var, li4 li4Var, String str, String str2) {
        String str3;
        fs3Var.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(fs3Var.a);
        this.a = concurrentHashMap;
        this.b = hv2Var;
        l92 l92Var = x92.W5;
        w82 w82Var = w82.d;
        if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            return;
        }
        int d = xi4.d(li4Var);
        int i = d - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str3 = "r_both";
                    } else {
                        str3 = "r_adstring";
                    }
                } else {
                    str3 = "r_adinfo";
                }
            } else {
                str3 = "query_g";
            }
            concurrentHashMap.put("se", str3);
            concurrentHashMap.put("scar", "true");
            if (((Boolean) w82Var.c.a(x92.u6)).booleanValue()) {
                concurrentHashMap.put("ad_format", str2);
            }
            if (d == 2) {
                concurrentHashMap.put("rid", str);
            }
            String str4 = li4Var.d.e0;
            if (!TextUtils.isEmpty(str4)) {
                concurrentHashMap.put("ragent", str4);
            }
            String a = xi4.a(xi4.b(li4Var.d));
            if (!TextUtils.isEmpty(a)) {
                concurrentHashMap.put("rtype", a);
                return;
            }
            return;
        }
        concurrentHashMap.put("scar", "false");
    }
}