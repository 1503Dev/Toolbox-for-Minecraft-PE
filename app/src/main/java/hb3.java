package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hb3  reason: default package */
public final class hb3 {
    public final sv3 a;
    public final li4 b;
    public final ol4 c;
    public final u53 d;
    public final n44 e;
    public final tg3 f;
    public hi4 g;
    public final ow3 h;
    public final tc3 i;
    public final Executor j;
    public final dw3 k;
    public final j14 l;
    public final bx3 m;
    public final hx3 n;

    public hb3(sv3 sv3Var, li4 li4Var, ol4 ol4Var, u53 u53Var, n44 n44Var, tg3 tg3Var, hi4 hi4Var, ow3 ow3Var, tc3 tc3Var, yw2 yw2Var, dw3 dw3Var, j14 j14Var, bx3 bx3Var, hx3 hx3Var) {
        this.a = sv3Var;
        this.b = li4Var;
        this.c = ol4Var;
        this.d = u53Var;
        this.e = n44Var;
        this.f = tg3Var;
        this.g = hi4Var;
        this.h = ow3Var;
        this.i = tc3Var;
        this.j = yw2Var;
        this.k = dw3Var;
        this.l = j14Var;
        this.m = bx3Var;
        this.n = hx3Var;
    }

    public final tz3 a(Throwable th) {
        return oj4.b(th, this.l);
    }

    public final el4 b(dz4 dz4Var) {
        jl4 d = this.c.b(dz4Var, ml4.RENDERER).c(new db3(0, this)).d(this.e);
        l92 l92Var = x92.x4;
        w82 w82Var = w82.d;
        if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            d = d.e(((Integer) w82Var.c.a(x92.y4)).intValue(), TimeUnit.SECONDS);
        }
        return d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final el4 c() {
        dz4 yy4Var;
        String str;
        String str2;
        Boolean bool;
        String str3;
        pn5 pn5Var = this.b.d;
        if (pn5Var.m0 == null && pn5Var.h0 == null) {
            return d(this.i.a());
        }
        ol4 ol4Var = this.c;
        ml4 ml4Var = ml4.PRELOADED_LOADER;
        sv3 sv3Var = this.a;
        String str4 = sv3Var.d.d.m0;
        if (!TextUtils.isEmpty(str4)) {
            l92 l92Var = x92.T5;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                String str5 = "";
                try {
                    str5 = new JSONObject(str4).optString("request_id", "");
                } catch (JSONException unused) {
                }
                l92 l92Var2 = x92.f6;
                if (((Boolean) w82Var.c.a(l92Var2)).booleanValue() && str5.isEmpty()) {
                    int lastIndexOf = str4.lastIndexOf("&request_id=");
                    if (lastIndexOf != -1) {
                        str5 = str4.substring(lastIndexOf + 12);
                    } else {
                        str5 = "";
                    }
                }
                if (TextUtils.isEmpty(str5)) {
                    yy4Var = new yy4(new l44(15, "Invalid ad string."));
                } else {
                    cw2 k = sv3Var.a.k();
                    xr3 xr3Var = sv3Var.h;
                    synchronized (k) {
                        Pair pair = (Pair) k.e.get(str5);
                        xr3Var.a.put("rid", str5);
                        str = null;
                        if (pair != null) {
                            str2 = (String) pair.second;
                            k.e.remove(str5);
                            xr3Var.a.put("mhit", "true");
                        } else {
                            xr3Var.a.put("mhit", "false");
                            str2 = null;
                        }
                    }
                    if (((Boolean) w82Var.c.a(l92Var2)).booleanValue()) {
                        xr3 xr3Var2 = sv3Var.h;
                        if (!TextUtils.isEmpty(str2)) {
                            if (new JSONObject(str2).optString("is_gbid").equals("true")) {
                                bool = Boolean.TRUE;
                                if (bool.booleanValue()) {
                                    int lastIndexOf2 = str4.lastIndexOf("&");
                                    if (lastIndexOf2 != -1) {
                                        str3 = str4.substring(0, lastIndexOf2);
                                    } else {
                                        str3 = null;
                                    }
                                    if (!TextUtils.isEmpty(str3)) {
                                        try {
                                            byte[] decode = Base64.decode(str3, 11);
                                            byte[] bytes = str5.getBytes("UTF-8");
                                            try {
                                                str = new JSONObject(str2).getString("arek");
                                            } catch (JSONException e) {
                                                vz3.k("Failed to get key from QueryJSONMap".concat(e.toString()));
                                                jv5.A.g.f("CryptoUtils.getKeyFromQueryJsonMap", e);
                                            }
                                            str4 = ij4.a(decode, bytes, str, xr3Var2);
                                        } catch (UnsupportedEncodingException e2) {
                                            vz3.k("Failed to decode the adResponse. ".concat(e2.toString()));
                                            jv5.A.g.f("PreloadedLoader.decryptAdResponseIfNecessary", e2);
                                        }
                                    }
                                }
                            }
                            bool = Boolean.FALSE;
                            if (bool.booleanValue()) {
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        yy4Var = sv3Var.a(str4, sv3Var.b(str2));
                    }
                }
                return hl4.a(yy4Var, ml4Var, ol4Var).a();
            }
        }
        sw2 sw2Var = sv3Var.d.d.h0;
        if (sw2Var != null) {
            if (((Boolean) w82.d.c.a(x92.R5)).booleanValue()) {
                String str6 = "";
                try {
                    str6 = new JSONObject(sw2Var.P).optString("request_id", "");
                } catch (JSONException unused2) {
                }
                String str7 = "";
                try {
                    str7 = new JSONObject(sw2Var.Q).optString("request_id", "");
                } catch (JSONException unused3) {
                }
                if (!TextUtils.isEmpty(str7) && str6.equals(str7)) {
                    cw2 k2 = sv3Var.a.k();
                    synchronized (k2) {
                        k2.e.remove(str6);
                    }
                    sv3Var.h.a.put("rid", str6);
                } else {
                    sv3Var.h.a.put("ridmm", "true");
                }
            }
            yy4Var = sv3Var.a(sw2Var.P, sv3Var.b(sw2Var.Q));
            return hl4.a(yy4Var, ml4Var, ol4Var).a();
        }
        yy4Var = new yy4(new l44(14, "Mismatch request IDs."));
        return hl4.a(yy4Var, ml4Var, ol4Var).a();
    }

    public final el4 d(final dz4 dz4Var) {
        jl4 d;
        ml4 ml4Var = ml4.SERVER_TRANSACTION;
        hi4 hi4Var = this.g;
        if (hi4Var != null) {
            d = hl4.a(zw4.C(hi4Var), ml4Var, this.c);
        } else {
            u42 u42Var = jv5.A.i;
            u42Var.getClass();
            l92 l92Var = x92.w3;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                synchronized (u42Var.c) {
                    u42Var.d();
                    ScheduledFuture scheduledFuture = u42Var.a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    u42Var.a = zw2.d.schedule(u42Var.b, ((Long) w82Var.c.a(x92.x3)).longValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) w82Var.c.a(x92.U8)).booleanValue() && !((Boolean) tb2.b.d()).booleanValue()) {
                final ay4 F = zw4.F(dz4Var, new xa3(0, this.m), this.j);
                final el4 a = this.c.b(F, ml4.BUILD_URL).d(new ts2(1, this.h)).a();
                d = this.c.a(ml4Var, dz4Var, F, a).a(new Callable() { // from class: ab3
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        hb3 hb3Var = hb3.this;
                        dz4 dz4Var2 = dz4Var;
                        dz4 dz4Var3 = F;
                        dz4 dz4Var4 = a;
                        final hx3 hx3Var = hb3Var.n;
                        final rq2 rq2Var = (rq2) dz4Var2.get();
                        JSONObject jSONObject = (JSONObject) dz4Var3.get();
                        tq2 tq2Var = (tq2) dz4Var4.get();
                        hx3Var.a.q0(rq2Var);
                        el4 a2 = hx3Var.c.b(zw4.E(hx3Var.c.b(zw4.C(new ny3(jSONObject, tq2Var)), ml4.PREPARE_HTTP_REQUEST).c(new oy3(rq2Var.V, hx3Var.g, eb1.t(hx3Var.h, 9))).a(), new at4() { // from class: gx3
                            @Override // defpackage.at4
                            public final Object apply(Object obj) {
                                hx3 hx3Var2 = hx3.this;
                                rq2 rq2Var2 = rq2Var;
                                ky3 ky3Var = (ky3) obj;
                                Context context = hx3Var2.h;
                                ky3Var.c.put("Content-Type", ky3Var.e);
                                ky3Var.c.put("User-Agent", jv5.A.c.r(context, rq2Var2.Q.P));
                                String str = ky3Var.a;
                                int i = ky3Var.b;
                                Map map = ky3Var.c;
                                Bundle bundle = new Bundle();
                                for (Map.Entry entry : map.entrySet()) {
                                    bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                }
                                return new wp2(str, i, bundle, ky3Var.d, ky3Var.f, rq2Var2.S, rq2Var2.W);
                            }
                        }, hx3Var.i), ml4.PROXY).d(new xa3(1, hx3Var.b)).a();
                        hx3Var.getClass();
                        ay4 F2 = zw4.F(hx3Var.c.b(a2, ml4.PRE_PROCESS).c(new f2(jSONObject, tq2Var)).d(jv5.A.p.a(hx3Var.h, hx3Var.e, hx3Var.f).a("google.afma.response.normalize", by3.d, yj2.c)).a(), new ts2(3, hx3Var), hx3Var.i);
                        zw4.J(F2, new db3(2, hx3Var), hx3Var.i);
                        return F2;
                    }
                }).d(new ky4() { // from class: bb3
                    @Override // defpackage.ky4
                    public final dz4 e(Object obj) {
                        return (dz4) obj;
                    }
                });
            } else {
                d = this.c.b(dz4Var, ml4Var).d(new cb3(0, this.k));
            }
        }
        return d.a();
    }
}