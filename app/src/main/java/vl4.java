package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: vl4  reason: default package */
public final class vl4 {
    public final HashMap a;
    public final zl4 b;

    public vl4() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        this.b = new zl4(jv5.A.j);
        hashMap.put("new_csi", "1");
    }

    public static vl4 b(String str) {
        vl4 vl4Var = new vl4();
        vl4Var.a.put("action", str);
        return vl4Var;
    }

    public final void a(String str, String str2) {
        this.a.put(str, str2);
    }

    public final void c(String str) {
        zl4 zl4Var = this.b;
        if (zl4Var.c.containsKey(str)) {
            long b = zl4Var.a.b() - ((Long) zl4Var.c.remove(str)).longValue();
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            zl4Var.a(str, sb.toString());
            return;
        }
        zl4Var.c.put(str, Long.valueOf(zl4Var.a.b()));
    }

    public final void d(String str, String str2) {
        zl4 zl4Var = this.b;
        if (zl4Var.c.containsKey(str)) {
            long b = zl4Var.a.b() - ((Long) zl4Var.c.remove(str)).longValue();
            zl4Var.a(str, str2 + b);
            return;
        }
        zl4Var.c.put(str, Long.valueOf(zl4Var.a.b()));
    }

    public final void e(ci4 ci4Var) {
        if (TextUtils.isEmpty(ci4Var.b)) {
            return;
        }
        this.a.put("gqi", ci4Var.b);
    }

    public final void f(hi4 hi4Var, hv2 hv2Var) {
        HashMap hashMap;
        String str;
        fn2 fn2Var = hi4Var.b;
        e((ci4) fn2Var.Q);
        if (!((List) fn2Var.P).isEmpty()) {
            String str2 = "ad_format";
            switch (((yh4) ((List) fn2Var.P).get(0)).b) {
                case 1:
                    hashMap = this.a;
                    str = "banner";
                    break;
                case 2:
                    hashMap = this.a;
                    str = "interstitial";
                    break;
                case 3:
                    hashMap = this.a;
                    str = "native_express";
                    break;
                case 4:
                    hashMap = this.a;
                    str = "native_advanced";
                    break;
                case 5:
                    hashMap = this.a;
                    str = "rewarded";
                    break;
                case 6:
                    this.a.put("ad_format", "app_open_ad");
                    if (hv2Var != null) {
                        hashMap = this.a;
                        if (true != hv2Var.g) {
                            str = "0";
                        } else {
                            str = "1";
                        }
                        str2 = "as";
                        break;
                    } else {
                        return;
                    }
                default:
                    hashMap = this.a;
                    str = "unknown";
                    break;
            }
            hashMap.put(str2, str);
        }
    }

    public final HashMap g() {
        HashMap hashMap = new HashMap(this.a);
        zl4 zl4Var = this.b;
        zl4Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : zl4Var.b.entrySet()) {
            int i = 0;
            if (((List) entry.getValue()).size() > 1) {
                for (String str : (List) entry.getValue()) {
                    i++;
                    arrayList.add(new yl4(((String) entry.getKey()) + "." + i, str));
                }
            } else {
                arrayList.add(new yl4((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            yl4 yl4Var = (yl4) it.next();
            hashMap.put(yl4Var.a, yl4Var.b);
        }
        return hashMap;
    }
}