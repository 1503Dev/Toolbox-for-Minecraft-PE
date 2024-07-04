package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: cm4  reason: default package */
public final class cm4 {
    public final Context a;
    public final String b;
    public final String c;

    public cm4(Context context, xv2 xv2Var) {
        this.a = context;
        this.b = context.getPackageName();
        this.c = xv2Var.P;
    }

    public final void a(HashMap hashMap) {
        Object obj;
        hashMap.put("s", "gmob_sdk");
        hashMap.put("v", "3");
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_v", Build.VERSION.SDK);
        jv5 jv5Var = jv5.A;
        cu5 cu5Var = jv5Var.c;
        hashMap.put("device", cu5.A());
        hashMap.put("app", this.b);
        String str = "0";
        if (true != cu5.H(this.a)) {
            obj = "0";
        } else {
            obj = "1";
        }
        hashMap.put("is_lite_sdk", obj);
        p92 p92Var = x92.a;
        w82 w82Var = w82.d;
        ArrayList b = w82Var.a.b();
        if (((Boolean) w82Var.c.a(x92.Q5)).booleanValue()) {
            b.addAll(jv5Var.g.b().f().i);
        }
        hashMap.put("e", TextUtils.join(",", b));
        hashMap.put("sdkVersion", this.c);
        if (((Boolean) w82Var.c.a(x92.O8)).booleanValue()) {
            if (true == cu5.F(this.a)) {
                str = "1";
            }
            hashMap.put("is_bstar", str);
        }
    }
}