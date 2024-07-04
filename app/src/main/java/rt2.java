package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: rt2  reason: default package */
public final class rt2 {
    public static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    public static String b(Context context, String str, boolean z) {
        l92 l92Var = x92.f0;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && !z) {
            return str;
        }
        jv5 jv5Var = jv5.A;
        if (jv5Var.w.j(context) && !TextUtils.isEmpty(str)) {
            String f = jv5Var.w.f(context);
            if (f == null) {
                return str;
            }
            String str2 = (String) w82Var.c.a(x92.Y);
            if (((Boolean) w82Var.c.a(x92.X)).booleanValue() && str.contains(str2)) {
                if (cu5.p(str, jv5Var.c.a, (String) w82Var.c.a(x92.V))) {
                    jv5Var.w.b(context, "_ac", f, null);
                    return c(context, str).replace(str2, f);
                }
                if (cu5.p(str, jv5Var.c.b, (String) w82Var.c.a(x92.W))) {
                    jv5Var.w.b(context, "_ai", f, null);
                    return c(context, str).replace(str2, f);
                }
            } else if (!str.contains("fbs_aeid")) {
                if (cu5.p(str, jv5Var.c.a, (String) w82Var.c.a(x92.V))) {
                    jv5Var.w.b(context, "_ac", f, null);
                    return a(c(context, str), "fbs_aeid", f).toString();
                }
                if (cu5.p(str, jv5Var.c.b, (String) w82Var.c.a(x92.W))) {
                    jv5Var.w.b(context, "_ai", f, null);
                    return a(c(context, str), "fbs_aeid", f).toString();
                }
            }
        }
        return str;
    }

    public static String c(Context context, String str) {
        jv5 jv5Var = jv5.A;
        String h = jv5Var.w.h(context);
        String g = jv5Var.w.g(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(h)) {
            str = a(str, "gmp_app_id", h).toString();
        }
        if (!str.contains("fbs_aiid") && !TextUtils.isEmpty(g)) {
            return a(str, "fbs_aiid", g).toString();
        }
        return str;
    }
}