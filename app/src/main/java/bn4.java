package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bn4  reason: default package */
public final class bn4 {
    public final i44 a;
    public final String b;
    public final String c;
    public final String d;
    public final Context e;
    public final ii4 f;
    public final ji4 g;
    public final kd h;
    public final rz1 i;

    public bn4(i44 i44Var, xv2 xv2Var, String str, String str2, Context context, ii4 ii4Var, ji4 ji4Var, kd kdVar, rz1 rz1Var) {
        this.a = i44Var;
        this.b = xv2Var.P;
        this.c = str;
        this.d = str2;
        this.e = context;
        this.f = ii4Var;
        this.g = ji4Var;
        this.h = kdVar;
        this.i = rz1Var;
    }

    public static String c(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final ArrayList a(hi4 hi4Var, yh4 yh4Var, List list) {
        return b(hi4Var, yh4Var, false, "", "", list);
    }

    public final ArrayList b(hi4 hi4Var, yh4 yh4Var, boolean z, String str, String str2, List list) {
        String str3;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            if (true != z) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            String c = c(c(c((String) it.next(), "@gw_adlocid@", ((li4) hi4Var.a.P).f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.b);
            if (yh4Var != null) {
                c = rt2.b(this.e, c(c(c(c, "@gw_qdata@", yh4Var.y), "@gw_adnetid@", yh4Var.x), "@gw_allocid@", yh4Var.w), yh4Var.W);
            }
            String c2 = c(c(c(c, "@gw_adnetstatus@", TextUtils.join("_", this.a.d)), "@gw_seqnum@", this.c), "@gw_sessid@", this.d);
            boolean z3 = false;
            if (((Boolean) w82.d.c.a(x92.O2)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean z4 = !TextUtils.isEmpty(str2);
            if (!z3) {
                if (!z4) {
                    arrayList.add(c2);
                }
            } else {
                z2 = z4;
            }
            if (this.i.b(Uri.parse(c2))) {
                Uri.Builder buildUpon = Uri.parse(c2).buildUpon();
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                c2 = buildUpon.build().toString();
            }
            arrayList.add(c2);
        }
        return arrayList;
    }
}