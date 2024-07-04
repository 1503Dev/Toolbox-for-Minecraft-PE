package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: sr3  reason: default package */
public final class sr3 implements ff3, le3, qd3 {
    public final xr3 P;
    public final fs3 Q;

    public sr3(xr3 xr3Var, fs3 fs3Var) {
        this.P = xr3Var;
        this.Q = fs3Var;
    }

    @Override // defpackage.ff3
    public final void f(hi4 hi4Var) {
        ConcurrentHashMap concurrentHashMap;
        String str;
        String str2;
        xr3 xr3Var = this.P;
        xr3Var.getClass();
        if (!((List) hi4Var.b.P).isEmpty()) {
            switch (((yh4) ((List) hi4Var.b.P).get(0)).b) {
                case 1:
                    concurrentHashMap = xr3Var.a;
                    str = "banner";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 2:
                    concurrentHashMap = xr3Var.a;
                    str = "interstitial";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 3:
                    concurrentHashMap = xr3Var.a;
                    str = "native_express";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 4:
                    concurrentHashMap = xr3Var.a;
                    str = "native_advanced";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 5:
                    concurrentHashMap = xr3Var.a;
                    str = "rewarded";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 6:
                    xr3Var.a.put("ad_format", "app_open_ad");
                    ConcurrentHashMap concurrentHashMap2 = xr3Var.a;
                    if (true != xr3Var.b.g) {
                        str2 = "0";
                    } else {
                        str2 = "1";
                    }
                    concurrentHashMap2.put("as", str2);
                    break;
                default:
                    concurrentHashMap = xr3Var.a;
                    str = "unknown";
                    concurrentHashMap.put("ad_format", str);
                    break;
            }
        }
        String str3 = ((ci4) hi4Var.b.Q).b;
        if (!TextUtils.isEmpty(str3)) {
            xr3Var.a.put("gqi", str3);
        }
    }

    @Override // defpackage.le3
    public final void k() {
        this.P.a.put("action", "loaded");
        this.Q.a(this.P.a, false);
    }

    @Override // defpackage.qd3
    public final void p(tz3 tz3Var) {
        this.P.a.put("action", "ftl");
        this.P.a.put("ftl", String.valueOf(tz3Var.P));
        this.P.a.put("ed", tz3Var.R);
        this.Q.a(this.P.a, false);
    }

    @Override // defpackage.ff3
    public final void q0(rq2 rq2Var) {
        xr3 xr3Var = this.P;
        Bundle bundle = rq2Var.P;
        xr3Var.getClass();
        if (bundle.containsKey("cnt")) {
            xr3Var.a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            xr3Var.a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}