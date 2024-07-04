package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;

/* renamed from: ba2  reason: default package */
public final class ba2 {
    public final String a = (String) gb2.a.d();
    public final LinkedHashMap b;
    public final Context c;
    public final String d;

    public ba2(Context context, String str) {
        String packageName;
        Object obj;
        this.c = context;
        this.d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        jv5 jv5Var = jv5.A;
        cu5 cu5Var = jv5Var.c;
        linkedHashMap.put("device", cu5.A());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        if (true != cu5.H(context)) {
            obj = "0";
        } else {
            obj = "1";
        }
        linkedHashMap.put("is_lite_sdk", obj);
        s82 s82Var = jv5Var.n;
        s82Var.getClass();
        dz4 b = zw2.a.b(new wq2(s82Var, context));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((vq2) b.get()).j));
            linkedHashMap.put("network_fine", Integer.toString(((vq2) b.get()).k));
        } catch (Exception e) {
            jv5.A.g.f("CsiConfiguration.CsiConfiguration", e);
        }
        if (((Boolean) w82.d.c.a(x92.O8)).booleanValue()) {
            LinkedHashMap linkedHashMap2 = this.b;
            cu5 cu5Var2 = jv5.A.c;
            linkedHashMap2.put("is_bstar", true == cu5.F(context) ? "1" : "0");
        }
    }
}