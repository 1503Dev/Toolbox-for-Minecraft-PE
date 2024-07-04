package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: p34  reason: default package */
public final class p34 implements k34 {
    public final nk3 a;
    public final ez4 b;
    public final pn3 c;
    public final nj4 d;
    public final tp3 e;

    public p34(nk3 nk3Var, yw2 yw2Var, pn3 pn3Var, nj4 nj4Var, tp3 tp3Var) {
        this.a = nk3Var;
        this.b = yw2Var;
        this.c = pn3Var;
        this.d = nj4Var;
        this.e = tp3Var;
    }

    @Override // defpackage.e14
    public final boolean a(hi4 hi4Var, yh4 yh4Var) {
        ei4 ei4Var = yh4Var.s;
        return (ei4Var == null || ei4Var.c == null) ? false : true;
    }

    @Override // defpackage.e14
    public final dz4 b(final hi4 hi4Var, final yh4 yh4Var) {
        return zw4.F(zw4.F(this.d.a(), new dk2(2, this, yh4Var), this.b), new ky4() { // from class: n34
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                p34 p34Var = p34.this;
                hi4 hi4Var2 = hi4Var;
                yh4 yh4Var2 = yh4Var;
                JSONArray jSONArray = (JSONArray) obj;
                p34Var.getClass();
                if (jSONArray.length() == 0) {
                    return new yy4(new vu3(3));
                }
                if (((li4) hi4Var2.a.P).k > 1) {
                    int length = jSONArray.length();
                    p34Var.d.b(Math.min(length, ((li4) hi4Var2.a.P).k));
                    ArrayList arrayList = new ArrayList(((li4) hi4Var2.a.P).k);
                    for (int i = 0; i < ((li4) hi4Var2.a.P).k; i++) {
                        if (i < length) {
                            arrayList.add(p34Var.c(hi4Var2, yh4Var2, jSONArray.getJSONObject(i)));
                        } else {
                            arrayList.add(new yy4(new vu3(3)));
                        }
                    }
                    return zw4.C(arrayList);
                }
                return zw4.E(p34Var.c(hi4Var2, yh4Var2, jSONArray.getJSONObject(0)), new at4() { // from class: o34
                    @Override // defpackage.at4
                    public final Object apply(Object obj2) {
                        return Collections.singletonList(zw4.C((jl3) obj2));
                    }
                }, p34Var.b);
            }
        }, this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oy4 c(final hi4 hi4Var, final yh4 yh4Var, final JSONObject jSONObject) {
        String str;
        w82 w82Var;
        w82 w82Var2;
        String str2;
        dz4 dz4Var;
        dz4 dz4Var2;
        JSONObject optJSONObject;
        dz4 B;
        JSONObject k;
        JSONObject optJSONObject2;
        dz4 dz4Var3;
        dz4 c;
        JSONArray optJSONArray;
        dz4 E;
        JSONArray jSONArray;
        int i;
        eo3 eo3Var;
        Object obj;
        final String optString;
        dz4 C;
        JSONObject optJSONObject3;
        final String optString2;
        w82 w82Var3;
        boolean z;
        ay4 F;
        final zr5 zr5Var;
        dz4 a = this.d.a();
        pn3 pn3Var = this.c;
        final dz4 b = pn3Var.a.b(new Callable() { // from class: nn3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str3;
                String str4;
                hi4 hi4Var2 = hi4.this;
                yh4 yh4Var2 = yh4Var;
                JSONObject jSONObject2 = jSONObject;
                nl3 nl3Var = new nl3();
                int optInt = jSONObject2.optInt("template_id", -1);
                synchronized (nl3Var) {
                    nl3Var.a = optInt;
                }
                String optString3 = jSONObject2.optString("custom_template_id");
                synchronized (nl3Var) {
                    nl3Var.t = optString3;
                }
                JSONObject optJSONObject4 = jSONObject2.optJSONObject("omid_settings");
                if (optJSONObject4 != null) {
                    str3 = optJSONObject4.optString("omid_partner_name");
                } else {
                    str3 = null;
                }
                synchronized (nl3Var) {
                    nl3Var.x = str3;
                }
                li4 li4Var = (li4) hi4Var2.a.P;
                if (li4Var.g.contains(Integer.toString(nl3Var.e()))) {
                    if (nl3Var.e() == 3) {
                        if (nl3Var.m() != null) {
                            if (!li4Var.h.contains(nl3Var.m())) {
                                throw new l44(1, "Unexpected custom template id in the response.");
                            }
                        } else {
                            throw new l44(1, "No custom template id for custom template ad response.");
                        }
                    }
                    double optDouble = jSONObject2.optDouble("rating", -1.0d);
                    synchronized (nl3Var) {
                        nl3Var.q = optDouble;
                    }
                    String optString4 = jSONObject2.optString("headline", null);
                    if (yh4Var2.M) {
                        jv5 jv5Var = jv5.A;
                        cu5 cu5Var = jv5Var.c;
                        Resources a2 = jv5Var.g.a();
                        if (a2 != null) {
                            str4 = a2.getString(ri0.s7);
                        } else {
                            str4 = "Test Ad";
                        }
                        optString4 = ij.c(str4, " : ", optString4);
                    }
                    nl3Var.b("headline", optString4);
                    nl3Var.b("body", jSONObject2.optString("body", null));
                    nl3Var.b("call_to_action", jSONObject2.optString("call_to_action", null));
                    nl3Var.b("store", jSONObject2.optString("store", null));
                    nl3Var.b("price", jSONObject2.optString("price", null));
                    nl3Var.b("advertiser", jSONObject2.optString("advertiser", null));
                    return nl3Var;
                }
                throw new l44(1, k6.a("Invalid template ID: ", nl3Var.e()));
            }
        });
        yn3 yn3Var = pn3Var.b;
        yn3Var.getClass();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("images");
        nc2 nc2Var = yn3Var.h;
        final dz4 b2 = yn3Var.b(optJSONArray2, nc2Var.Q, nc2Var.S);
        final yn3 yn3Var2 = pn3Var.b;
        final ci4 ci4Var = (ci4) hi4Var.b.Q;
        yn3Var2.getClass();
        l92 l92Var = x92.i8;
        w82 w82Var4 = w82.d;
        if (((Boolean) w82Var4.c.a(l92Var)).booleanValue()) {
            JSONArray optJSONArray3 = jSONObject.optJSONArray("images");
            if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                JSONObject optJSONObject4 = optJSONArray3.optJSONObject(0);
                if (optJSONObject4 != null) {
                    final String optString3 = optJSONObject4.optString("base_url");
                    final String optString4 = optJSONObject4.optString("html");
                    str = "html";
                    int optInt = optJSONObject4.optInt("width", 0);
                    w82Var = w82Var4;
                    int optInt2 = optJSONObject4.optInt("height", 0);
                    if (optInt == 0) {
                        if (optInt2 != 0) {
                            optInt = 0;
                        } else {
                            zr5Var = zr5.d();
                            if (!TextUtils.isEmpty(optString4)) {
                                dz4Var = a;
                                str2 = str;
                                w82Var2 = w82Var;
                                ay4 F2 = zw4.F(zw4.C(null), new ky4() { // from class: tn3
                                    @Override // defpackage.ky4
                                    public final dz4 e(Object obj2) {
                                        yn3 yn3Var3 = yn3.this;
                                        zr5 zr5Var2 = zr5Var;
                                        yh4 yh4Var2 = yh4Var;
                                        ci4 ci4Var2 = ci4Var;
                                        String str3 = optString3;
                                        String str4 = optString4;
                                        l13 a2 = yn3Var3.j.a(zr5Var2, yh4Var2, ci4Var2);
                                        ax2 ax2Var = new ax2(a2);
                                        np3 np3Var = yn3Var3.l.a;
                                        a2.R().a(np3Var, np3Var, np3Var, np3Var, np3Var, false, null, new o82(yn3Var3.a, null), null, null, yn3Var3.p, yn3Var3.o, yn3Var3.m, yn3Var3.n, null, np3Var, null, null);
                                        if (((Boolean) w82.d.c.a(x92.b3)).booleanValue()) {
                                            a2.D0("/getNativeAdViewSignals", lg2.n);
                                        }
                                        a2.D0("/getNativeClickMeta", lg2.o);
                                        a2.R().V = new ij2(2, ax2Var);
                                        a2.X(str3, str4);
                                        return ax2Var;
                                    }
                                }, zw2.e);
                                dz4Var2 = zw4.F(F2, new ts2(2, F2), zw2.f);
                            }
                            str2 = str;
                            w82Var2 = w82Var;
                            dz4Var = a;
                            dz4Var2 = zw4.C(null);
                        }
                    }
                    zr5Var = new zr5(yn3Var2.a, new h3(optInt, optInt2));
                    if (!TextUtils.isEmpty(optString4)) {
                    }
                    str2 = str;
                    w82Var2 = w82Var;
                    dz4Var = a;
                    dz4Var2 = zw4.C(null);
                }
            } else {
                dz4Var = a;
                str2 = "html";
                w82Var2 = w82Var4;
                dz4Var2 = zw4.C(null);
            }
            yn3 yn3Var3 = pn3Var.b;
            yn3Var3.getClass();
            final dz4 a2 = yn3Var3.a(jSONObject.optJSONObject("secondary_image"), yn3Var3.h.Q);
            yn3 yn3Var4 = pn3Var.b;
            yn3Var4.getClass();
            final dz4 a3 = yn3Var4.a(jSONObject.optJSONObject("app_icon"), yn3Var4.h.Q);
            yn3 yn3Var5 = pn3Var.b;
            yn3Var5.getClass();
            optJSONObject = jSONObject.optJSONObject("attribution");
            if (optJSONObject != null) {
                B = zw4.C(null);
            } else {
                JSONArray optJSONArray4 = optJSONObject.optJSONArray("images");
                JSONObject optJSONObject5 = optJSONObject.optJSONObject("image");
                if (optJSONArray4 == null && optJSONObject5 != null) {
                    optJSONArray4 = new JSONArray();
                    optJSONArray4.put(optJSONObject5);
                }
                by4 E2 = zw4.E(yn3Var5.b(optJSONArray4, false, true), new sn3(0, yn3Var5, optJSONObject), yn3Var5.g);
                if (optJSONObject.optBoolean("require")) {
                    B = zw4.F(E2, new cb3(1, E2), zw2.f);
                } else {
                    B = zw4.B(E2, Exception.class, new vn3(), zw2.f);
                }
            }
            dz4 dz4Var4 = B;
            yn3 yn3Var6 = pn3Var.b;
            ci4 ci4Var2 = (ci4) hi4Var.b.Q;
            yn3Var6.getClass();
            String[] strArr = {"html_containers", "instream"};
            k = mq2.k(jSONObject, strArr);
            if (k != null) {
                optJSONObject2 = null;
            } else {
                optJSONObject2 = k.optJSONObject(strArr[1]);
            }
            if (optJSONObject2 != null) {
                final JSONObject optJSONObject6 = jSONObject.optJSONObject("video");
                if (optJSONObject6 == null) {
                    dz4Var3 = dz4Var4;
                } else {
                    String optString5 = optJSONObject6.optString("vast_xml");
                    dz4Var3 = dz4Var4;
                    if (((Boolean) w82Var2.c.a(x92.h8)).booleanValue() && optJSONObject6.has(str2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (TextUtils.isEmpty(optString5)) {
                        if (!z) {
                            sv2.g("Required field 'vast_xml' or 'html' is missing");
                        }
                    } else if (!z) {
                        final po3 po3Var = yn3Var6.i;
                        po3Var.getClass();
                        F = zw4.F(zw4.F(zw4.C(null), new qv3(1, po3Var), po3Var.b), new ky4() { // from class: io3
                            @Override // defpackage.ky4
                            public final dz4 e(Object obj2) {
                                k23 k23Var;
                                final po3 po3Var2 = po3.this;
                                JSONObject jSONObject2 = optJSONObject6;
                                final y03 y03Var = (y03) obj2;
                                po3Var2.getClass();
                                final ax2 ax2Var = new ax2(y03Var);
                                if (po3Var2.a.b != null) {
                                    k23Var = new k23(5, 0, 0);
                                } else {
                                    k23Var = new k23(4, 0, 0);
                                }
                                y03Var.A0(k23Var);
                                y03Var.R().V = new h23() { // from class: ho3
                                    @Override // defpackage.h23
                                    public final void d(boolean z2) {
                                        po3 po3Var3 = po3.this;
                                        y03 y03Var2 = y03Var;
                                        ax2 ax2Var2 = ax2Var;
                                        if (po3Var3.a.a != null && y03Var2.q() != null) {
                                            y03Var2.q().v4(po3Var3.a.a);
                                        }
                                        ax2Var2.d();
                                    }
                                };
                                y03Var.M0("google.afma.nativeAds.renderVideo", jSONObject2);
                                return ax2Var;
                            }
                        }, po3Var.b);
                        c = zw4.B(zw4.G(F, ((Integer) w82Var3.c.a(x92.c3)).intValue(), TimeUnit.SECONDS, yn3Var6.k), Exception.class, new vn3(), zw2.f);
                    }
                    F = yn3Var6.c(optJSONObject6, yh4Var, ci4Var2);
                    c = zw4.B(zw4.G(F, ((Integer) w82Var3.c.a(x92.c3)).intValue(), TimeUnit.SECONDS, yn3Var6.k), Exception.class, new vn3(), zw2.f);
                }
                c = zw4.C(null);
            } else {
                dz4Var3 = dz4Var4;
                c = yn3Var6.c(optJSONObject2, yh4Var, ci4Var2);
            }
            final dz4 dz4Var5 = c;
            fo3 fo3Var = pn3Var.c;
            fo3Var.getClass();
            optJSONArray = jSONObject.optJSONArray("custom_assets");
            if (optJSONArray != null) {
                E = zw4.C(Collections.emptyList());
            } else {
                ArrayList arrayList = new ArrayList();
                int length = optJSONArray.length();
                int i2 = 0;
                while (i2 < length) {
                    JSONObject optJSONObject7 = optJSONArray.optJSONObject(i2);
                    if (optJSONObject7 == null || (optString = optJSONObject7.optString("name")) == null) {
                        jSONArray = optJSONArray;
                        i = length;
                    } else {
                        jSONArray = optJSONArray;
                        String optString6 = optJSONObject7.optString("type");
                        i = length;
                        if ("string".equals(optString6)) {
                            eo3Var = new eo3(optString, optJSONObject7.optString("string_value"));
                            obj = zw4.C(eo3Var);
                            arrayList.add(obj);
                            i2++;
                            optJSONArray = jSONArray;
                            length = i;
                        } else if ("image".equals(optString6)) {
                            yn3 yn3Var7 = fo3Var.b;
                            yn3Var7.getClass();
                            obj = zw4.E(yn3Var7.a(optJSONObject7.optJSONObject("image_value"), yn3Var7.h.Q), new at4() { // from class: co3
                                @Override // defpackage.at4
                                public final Object apply(Object obj2) {
                                    return new eo3(optString, (lc2) obj2);
                                }
                            }, fo3Var.a);
                            arrayList.add(obj);
                            i2++;
                            optJSONArray = jSONArray;
                            length = i;
                        }
                    }
                    eo3Var = null;
                    obj = zw4.C(eo3Var);
                    arrayList.add(obj);
                    i2++;
                    optJSONArray = jSONArray;
                    length = i;
                }
                E = zw4.E(new ly4(nv4.t(arrayList)), new at4() { // from class: do3
                    @Override // defpackage.at4
                    public final Object apply(Object obj2) {
                        ArrayList arrayList2 = new ArrayList();
                        for (eo3 eo3Var2 : (List) obj2) {
                            if (eo3Var2 != null) {
                                arrayList2.add(eo3Var2);
                            }
                        }
                        return arrayList2;
                    }
                }, fo3Var.a);
            }
            final yn3 yn3Var8 = pn3Var.b;
            if (jSONObject.optBoolean("enable_omid") && (optJSONObject3 = jSONObject.optJSONObject("omid_settings")) != null) {
                optString2 = optJSONObject3.optString("omid_html");
                if (!TextUtils.isEmpty(optString2)) {
                    C = zw4.F(zw4.C(null), new ky4() { // from class: rn3
                        @Override // defpackage.ky4
                        public final dz4 e(Object obj2) {
                            String str3;
                            yn3 yn3Var9 = yn3.this;
                            String str4 = optString2;
                            yn3Var9.getClass();
                            k13 k13Var = jv5.A.d;
                            l13 a4 = k13.a(yn3Var9.a, new k23(0, 0, 0), "native-omid", false, false, yn3Var9.c, null, yn3Var9.d, null, yn3Var9.e, yn3Var9.f, null, null);
                            ax2 ax2Var = new ax2(a4);
                            a4.R().V = new jz1(2, ax2Var);
                            if (((Boolean) w82.d.c.a(x92.k4)).booleanValue()) {
                                str4 = Base64.encodeToString(str4.getBytes(), 1);
                                str3 = "base64";
                            } else {
                                str3 = "UTF-8";
                            }
                            a4.loadData(str4, "text/html", str3);
                            return ax2Var;
                        }
                    }, zw2.e);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(b);
                    arrayList2.add(b2);
                    arrayList2.add(dz4Var2);
                    arrayList2.add(a2);
                    arrayList2.add(a3);
                    final dz4 dz4Var6 = dz4Var3;
                    arrayList2.add(dz4Var6);
                    arrayList2.add(dz4Var5);
                    arrayList2.add(E);
                    if (!((Boolean) w82.d.c.a(x92.n4)).booleanValue()) {
                        arrayList2.add(C);
                    }
                    final dz4 dz4Var7 = dz4Var2;
                    final dz4 dz4Var8 = C;
                    final dz4 dz4Var9 = E;
                    final oy4 oy4Var = new oy4(nv4.t(arrayList2), false, pn3Var.a, new Callable() { // from class: on3
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            List list;
                            JSONObject optJSONObject8;
                            JSONArray optJSONArray5;
                            dz4 dz4Var10 = dz4.this;
                            dz4 dz4Var11 = b2;
                            dz4 dz4Var12 = a3;
                            dz4 dz4Var13 = a2;
                            dz4 dz4Var14 = dz4Var6;
                            JSONObject jSONObject2 = jSONObject;
                            dz4 dz4Var15 = dz4Var5;
                            dz4 dz4Var16 = dz4Var7;
                            dz4 dz4Var17 = dz4Var8;
                            dz4 dz4Var18 = dz4Var9;
                            nl3 nl3Var = (nl3) dz4Var10.get();
                            List list2 = (List) dz4Var11.get();
                            synchronized (nl3Var) {
                                nl3Var.e = list2;
                            }
                            ad2 ad2Var = (ad2) dz4Var12.get();
                            synchronized (nl3Var) {
                                nl3Var.r = ad2Var;
                            }
                            ad2 ad2Var2 = (ad2) dz4Var13.get();
                            synchronized (nl3Var) {
                                nl3Var.s = ad2Var2;
                            }
                            uc2 uc2Var = (uc2) dz4Var14.get();
                            synchronized (nl3Var) {
                                nl3Var.c = uc2Var;
                            }
                            JSONObject optJSONObject9 = jSONObject2.optJSONObject("mute");
                            if (optJSONObject9 != null && (optJSONArray5 = optJSONObject9.optJSONArray("reasons")) != null && optJSONArray5.length() > 0) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i3 = 0; i3 < optJSONArray5.length(); i3++) {
                                    n84 e = yn3.e(optJSONArray5.optJSONObject(i3));
                                    if (e != null) {
                                        arrayList3.add(e);
                                    }
                                }
                                list = nv4.t(arrayList3);
                            } else {
                                lv4 lv4Var = nv4.Q;
                                list = nw4.T;
                            }
                            synchronized (nl3Var) {
                                nl3Var.f = list;
                            }
                            JSONObject optJSONObject10 = jSONObject2.optJSONObject("mute");
                            n84 n84Var = null;
                            if (optJSONObject10 != null && (optJSONObject8 = optJSONObject10.optJSONObject("default_reason")) != null) {
                                n84Var = yn3.e(optJSONObject8);
                            }
                            synchronized (nl3Var) {
                                nl3Var.g = n84Var;
                            }
                            y03 y03Var = (y03) dz4Var15.get();
                            if (y03Var != null) {
                                synchronized (nl3Var) {
                                    nl3Var.i = y03Var;
                                }
                                View x = y03Var.x();
                                synchronized (nl3Var) {
                                    nl3Var.m = x;
                                }
                                q13 q = y03Var.q();
                                synchronized (nl3Var) {
                                    nl3Var.b = q;
                                }
                            }
                            y03 y03Var2 = (y03) dz4Var16.get();
                            if (y03Var2 != null) {
                                synchronized (nl3Var) {
                                    nl3Var.j = y03Var2;
                                }
                                View x2 = y03Var2.x();
                                synchronized (nl3Var) {
                                    nl3Var.o = x2;
                                }
                            }
                            if (((Boolean) w82.d.c.a(x92.n4)).booleanValue()) {
                                synchronized (nl3Var) {
                                    nl3Var.n = dz4Var17;
                                }
                            } else {
                                y03 y03Var3 = (y03) dz4Var17.get();
                                if (y03Var3 != null) {
                                    synchronized (nl3Var) {
                                        nl3Var.k = y03Var3;
                                    }
                                }
                            }
                            for (eo3 eo3Var2 : (List) dz4Var18.get()) {
                                if (eo3Var2.a != 1) {
                                    String str3 = eo3Var2.b;
                                    lc2 lc2Var = eo3Var2.d;
                                    synchronized (nl3Var) {
                                        if (lc2Var == null) {
                                            nl3Var.u.remove(str3);
                                        } else {
                                            nl3Var.u.put(str3, lc2Var);
                                        }
                                    }
                                } else {
                                    nl3Var.b(eo3Var2.b, eo3Var2.c);
                                }
                            }
                            return nl3Var;
                        }
                    });
                    nw4 u = nv4.u(new dz4[]{dz4Var, oy4Var});
                    final dz4 dz4Var10 = dz4Var;
                    return new oy4(u, true, this.b, new Callable() { // from class: l34
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            p34 p34Var = p34.this;
                            dz4 dz4Var11 = oy4Var;
                            dz4 dz4Var12 = dz4Var10;
                            hi4 hi4Var2 = hi4Var;
                            yh4 yh4Var2 = yh4Var;
                            JSONObject jSONObject2 = jSONObject;
                            p34Var.getClass();
                            nl3 nl3Var = (nl3) dz4Var11.get();
                            kp3 kp3Var = (kp3) dz4Var12.get();
                            l43 c2 = p34Var.a.c(new ts1(hi4Var2, yh4Var2, null), new z63(1, nl3Var), new av2(1, jSONObject2, kp3Var));
                            dp3 s = c2.s();
                            if (s.P != null) {
                                s.Q.c("/nativeAdCustomClick", s);
                            }
                            hp3 t = c2.t();
                            t.getClass();
                            ep3 ep3Var = kp3Var.a;
                            ld3 ld3Var = t.a;
                            pe3 pe3Var = t.c;
                            xe3 xe3Var = t.d;
                            vf3 vf3Var = t.e;
                            final he3 he3Var = t.b;
                            he3Var.getClass();
                            b16 b16Var = new b16() { // from class: gp3
                                @Override // defpackage.b16
                                public final void h() {
                                    he3.this.c();
                                }
                            };
                            synchronized (ep3Var) {
                                ep3Var.P = ld3Var;
                                ep3Var.Q = pe3Var;
                                ep3Var.R = xe3Var;
                                ep3Var.S = vf3Var;
                                ep3Var.T = b16Var;
                            }
                            yh4 yh4Var3 = t.f;
                            ci4 ci4Var3 = t.g;
                            synchronized (kp3Var) {
                                by4 by4Var = kp3Var.l;
                                if (by4Var != null) {
                                    zw4.J(by4Var, new sk1(yh4Var3, ci4Var3), kp3Var.f);
                                }
                            }
                            final oo3 r = c2.r();
                            final y03 j = nl3Var.j();
                            if (j == null) {
                                r.getClass();
                            } else {
                                r.c.S0(j.x());
                                r.c.Q0(new s22() { // from class: ko3
                                    @Override // defpackage.s22
                                    public final void h0(r22 r22Var) {
                                        g13 R = y03.this.R();
                                        Rect rect = r22Var.d;
                                        int i3 = rect.left;
                                        int i4 = rect.top;
                                        xn2 xn2Var = R.g0;
                                        if (xn2Var != null) {
                                            xn2Var.g(i3, i4);
                                        }
                                        tn2 tn2Var = R.i0;
                                        if (tn2Var != null) {
                                            synchronized (tn2Var.Z) {
                                                tn2Var.T = i3;
                                                tn2Var.U = i4;
                                            }
                                        }
                                    }
                                }, r.a);
                                r.c.Q0(new s22() { // from class: lo3
                                    @Override // defpackage.s22
                                    public final void h0(r22 r22Var) {
                                        y03 y03Var = y03.this;
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("isVisible", true != r22Var.j ? "0" : "1");
                                        y03Var.a("onAdVisibilityChanged", hashMap);
                                    }
                                }, r.a);
                                r.c.Q0(r.b, r.a);
                                r.b.P = j;
                                j.D0("/trackActiveViewUnit", new mg2() { // from class: mo3
                                    @Override // defpackage.mg2
                                    public final void b(Object obj2, Map map) {
                                        y03 y03Var = (y03) obj2;
                                        t73 t73Var = oo3.this.b;
                                        t73Var.T = true;
                                        t73Var.a();
                                    }
                                });
                                j.D0("/untrackActiveViewUnit", new mg2() { // from class: no3
                                    @Override // defpackage.mg2
                                    public final void b(Object obj2, Map map) {
                                        y03 y03Var = (y03) obj2;
                                        oo3.this.b.T = false;
                                    }
                                });
                            }
                            pp3 u2 = c2.u();
                            tp3 tp3Var = p34Var.e;
                            u2.getClass();
                            np3 np3Var = tp3Var.a;
                            ld3 ld3Var2 = u2.a;
                            pe3 pe3Var2 = u2.c;
                            xe3 xe3Var2 = u2.d;
                            vf3 vf3Var2 = u2.e;
                            final he3 he3Var2 = u2.b;
                            he3Var2.getClass();
                            b16 b16Var2 = new b16() { // from class: op3
                                @Override // defpackage.b16
                                public final void h() {
                                    he3.this.c();
                                }
                            };
                            ni3 ni3Var = u2.f;
                            synchronized (np3Var) {
                                synchronized (np3Var) {
                                    np3Var.P = ld3Var2;
                                    np3Var.Q = pe3Var2;
                                    np3Var.R = xe3Var2;
                                    np3Var.S = vf3Var2;
                                    np3Var.T = b16Var2;
                                }
                                return c2.q();
                            }
                            np3Var.U = ni3Var;
                            return c2.q();
                        }
                    });
                }
            }
            C = zw4.C(null);
            ArrayList arrayList22 = new ArrayList();
            arrayList22.add(b);
            arrayList22.add(b2);
            arrayList22.add(dz4Var2);
            arrayList22.add(a2);
            arrayList22.add(a3);
            final dz4 dz4Var62 = dz4Var3;
            arrayList22.add(dz4Var62);
            arrayList22.add(dz4Var5);
            arrayList22.add(E);
            if (!((Boolean) w82.d.c.a(x92.n4)).booleanValue()) {
            }
            final dz4 dz4Var72 = dz4Var2;
            final dz4 dz4Var82 = C;
            final dz4 dz4Var92 = E;
            final oy4 oy4Var2 = new oy4(nv4.t(arrayList22), false, pn3Var.a, new Callable() { // from class: on3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    List list;
                    JSONObject optJSONObject8;
                    JSONArray optJSONArray5;
                    dz4 dz4Var102 = dz4.this;
                    dz4 dz4Var11 = b2;
                    dz4 dz4Var12 = a3;
                    dz4 dz4Var13 = a2;
                    dz4 dz4Var14 = dz4Var62;
                    JSONObject jSONObject2 = jSONObject;
                    dz4 dz4Var15 = dz4Var5;
                    dz4 dz4Var16 = dz4Var72;
                    dz4 dz4Var17 = dz4Var82;
                    dz4 dz4Var18 = dz4Var92;
                    nl3 nl3Var = (nl3) dz4Var102.get();
                    List list2 = (List) dz4Var11.get();
                    synchronized (nl3Var) {
                        nl3Var.e = list2;
                    }
                    ad2 ad2Var = (ad2) dz4Var12.get();
                    synchronized (nl3Var) {
                        nl3Var.r = ad2Var;
                    }
                    ad2 ad2Var2 = (ad2) dz4Var13.get();
                    synchronized (nl3Var) {
                        nl3Var.s = ad2Var2;
                    }
                    uc2 uc2Var = (uc2) dz4Var14.get();
                    synchronized (nl3Var) {
                        nl3Var.c = uc2Var;
                    }
                    JSONObject optJSONObject9 = jSONObject2.optJSONObject("mute");
                    if (optJSONObject9 != null && (optJSONArray5 = optJSONObject9.optJSONArray("reasons")) != null && optJSONArray5.length() > 0) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i3 = 0; i3 < optJSONArray5.length(); i3++) {
                            n84 e = yn3.e(optJSONArray5.optJSONObject(i3));
                            if (e != null) {
                                arrayList3.add(e);
                            }
                        }
                        list = nv4.t(arrayList3);
                    } else {
                        lv4 lv4Var = nv4.Q;
                        list = nw4.T;
                    }
                    synchronized (nl3Var) {
                        nl3Var.f = list;
                    }
                    JSONObject optJSONObject10 = jSONObject2.optJSONObject("mute");
                    n84 n84Var = null;
                    if (optJSONObject10 != null && (optJSONObject8 = optJSONObject10.optJSONObject("default_reason")) != null) {
                        n84Var = yn3.e(optJSONObject8);
                    }
                    synchronized (nl3Var) {
                        nl3Var.g = n84Var;
                    }
                    y03 y03Var = (y03) dz4Var15.get();
                    if (y03Var != null) {
                        synchronized (nl3Var) {
                            nl3Var.i = y03Var;
                        }
                        View x = y03Var.x();
                        synchronized (nl3Var) {
                            nl3Var.m = x;
                        }
                        q13 q = y03Var.q();
                        synchronized (nl3Var) {
                            nl3Var.b = q;
                        }
                    }
                    y03 y03Var2 = (y03) dz4Var16.get();
                    if (y03Var2 != null) {
                        synchronized (nl3Var) {
                            nl3Var.j = y03Var2;
                        }
                        View x2 = y03Var2.x();
                        synchronized (nl3Var) {
                            nl3Var.o = x2;
                        }
                    }
                    if (((Boolean) w82.d.c.a(x92.n4)).booleanValue()) {
                        synchronized (nl3Var) {
                            nl3Var.n = dz4Var17;
                        }
                    } else {
                        y03 y03Var3 = (y03) dz4Var17.get();
                        if (y03Var3 != null) {
                            synchronized (nl3Var) {
                                nl3Var.k = y03Var3;
                            }
                        }
                    }
                    for (eo3 eo3Var2 : (List) dz4Var18.get()) {
                        if (eo3Var2.a != 1) {
                            String str3 = eo3Var2.b;
                            lc2 lc2Var = eo3Var2.d;
                            synchronized (nl3Var) {
                                if (lc2Var == null) {
                                    nl3Var.u.remove(str3);
                                } else {
                                    nl3Var.u.put(str3, lc2Var);
                                }
                            }
                        } else {
                            nl3Var.b(eo3Var2.b, eo3Var2.c);
                        }
                    }
                    return nl3Var;
                }
            });
            nw4 u2 = nv4.u(new dz4[]{dz4Var, oy4Var2});
            final dz4 dz4Var102 = dz4Var;
            return new oy4(u2, true, this.b, new Callable() { // from class: l34
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    p34 p34Var = p34.this;
                    dz4 dz4Var11 = oy4Var2;
                    dz4 dz4Var12 = dz4Var102;
                    hi4 hi4Var2 = hi4Var;
                    yh4 yh4Var2 = yh4Var;
                    JSONObject jSONObject2 = jSONObject;
                    p34Var.getClass();
                    nl3 nl3Var = (nl3) dz4Var11.get();
                    kp3 kp3Var = (kp3) dz4Var12.get();
                    l43 c2 = p34Var.a.c(new ts1(hi4Var2, yh4Var2, null), new z63(1, nl3Var), new av2(1, jSONObject2, kp3Var));
                    dp3 s = c2.s();
                    if (s.P != null) {
                        s.Q.c("/nativeAdCustomClick", s);
                    }
                    hp3 t = c2.t();
                    t.getClass();
                    ep3 ep3Var = kp3Var.a;
                    ld3 ld3Var = t.a;
                    pe3 pe3Var = t.c;
                    xe3 xe3Var = t.d;
                    vf3 vf3Var = t.e;
                    final he3 he3Var = t.b;
                    he3Var.getClass();
                    b16 b16Var = new b16() { // from class: gp3
                        @Override // defpackage.b16
                        public final void h() {
                            he3.this.c();
                        }
                    };
                    synchronized (ep3Var) {
                        ep3Var.P = ld3Var;
                        ep3Var.Q = pe3Var;
                        ep3Var.R = xe3Var;
                        ep3Var.S = vf3Var;
                        ep3Var.T = b16Var;
                    }
                    yh4 yh4Var3 = t.f;
                    ci4 ci4Var3 = t.g;
                    synchronized (kp3Var) {
                        by4 by4Var = kp3Var.l;
                        if (by4Var != null) {
                            zw4.J(by4Var, new sk1(yh4Var3, ci4Var3), kp3Var.f);
                        }
                    }
                    final oo3 r = c2.r();
                    final y03 j = nl3Var.j();
                    if (j == null) {
                        r.getClass();
                    } else {
                        r.c.S0(j.x());
                        r.c.Q0(new s22() { // from class: ko3
                            @Override // defpackage.s22
                            public final void h0(r22 r22Var) {
                                g13 R = y03.this.R();
                                Rect rect = r22Var.d;
                                int i3 = rect.left;
                                int i4 = rect.top;
                                xn2 xn2Var = R.g0;
                                if (xn2Var != null) {
                                    xn2Var.g(i3, i4);
                                }
                                tn2 tn2Var = R.i0;
                                if (tn2Var != null) {
                                    synchronized (tn2Var.Z) {
                                        tn2Var.T = i3;
                                        tn2Var.U = i4;
                                    }
                                }
                            }
                        }, r.a);
                        r.c.Q0(new s22() { // from class: lo3
                            @Override // defpackage.s22
                            public final void h0(r22 r22Var) {
                                y03 y03Var = y03.this;
                                HashMap hashMap = new HashMap();
                                hashMap.put("isVisible", true != r22Var.j ? "0" : "1");
                                y03Var.a("onAdVisibilityChanged", hashMap);
                            }
                        }, r.a);
                        r.c.Q0(r.b, r.a);
                        r.b.P = j;
                        j.D0("/trackActiveViewUnit", new mg2() { // from class: mo3
                            @Override // defpackage.mg2
                            public final void b(Object obj2, Map map) {
                                y03 y03Var = (y03) obj2;
                                t73 t73Var = oo3.this.b;
                                t73Var.T = true;
                                t73Var.a();
                            }
                        });
                        j.D0("/untrackActiveViewUnit", new mg2() { // from class: no3
                            @Override // defpackage.mg2
                            public final void b(Object obj2, Map map) {
                                y03 y03Var = (y03) obj2;
                                oo3.this.b.T = false;
                            }
                        });
                    }
                    pp3 u22 = c2.u();
                    tp3 tp3Var = p34Var.e;
                    u22.getClass();
                    np3 np3Var = tp3Var.a;
                    ld3 ld3Var2 = u22.a;
                    pe3 pe3Var2 = u22.c;
                    xe3 xe3Var2 = u22.d;
                    vf3 vf3Var2 = u22.e;
                    final he3 he3Var2 = u22.b;
                    he3Var2.getClass();
                    b16 b16Var2 = new b16() { // from class: op3
                        @Override // defpackage.b16
                        public final void h() {
                            he3.this.c();
                        }
                    };
                    ni3 ni3Var = u22.f;
                    synchronized (np3Var) {
                        synchronized (np3Var) {
                            np3Var.P = ld3Var2;
                            np3Var.Q = pe3Var2;
                            np3Var.R = xe3Var2;
                            np3Var.S = vf3Var2;
                            np3Var.T = b16Var2;
                        }
                        return c2.q();
                    }
                    np3Var.U = ni3Var;
                    return c2.q();
                }
            });
        }
        str = "html";
        w82Var = w82Var4;
        str2 = str;
        w82Var2 = w82Var;
        dz4Var = a;
        dz4Var2 = zw4.C(null);
        yn3 yn3Var32 = pn3Var.b;
        yn3Var32.getClass();
        final dz4 a22 = yn3Var32.a(jSONObject.optJSONObject("secondary_image"), yn3Var32.h.Q);
        yn3 yn3Var42 = pn3Var.b;
        yn3Var42.getClass();
        final dz4 a32 = yn3Var42.a(jSONObject.optJSONObject("app_icon"), yn3Var42.h.Q);
        yn3 yn3Var52 = pn3Var.b;
        yn3Var52.getClass();
        optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject != null) {
        }
        dz4 dz4Var42 = B;
        yn3 yn3Var62 = pn3Var.b;
        ci4 ci4Var22 = (ci4) hi4Var.b.Q;
        yn3Var62.getClass();
        String[] strArr2 = {"html_containers", "instream"};
        k = mq2.k(jSONObject, strArr2);
        if (k != null) {
        }
        if (optJSONObject2 != null) {
        }
        final dz4 dz4Var52 = c;
        fo3 fo3Var2 = pn3Var.c;
        fo3Var2.getClass();
        optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray != null) {
        }
        final yn3 yn3Var82 = pn3Var.b;
        if (jSONObject.optBoolean("enable_omid")) {
            optString2 = optJSONObject3.optString("omid_html");
            if (!TextUtils.isEmpty(optString2)) {
            }
        }
        C = zw4.C(null);
        ArrayList arrayList222 = new ArrayList();
        arrayList222.add(b);
        arrayList222.add(b2);
        arrayList222.add(dz4Var2);
        arrayList222.add(a22);
        arrayList222.add(a32);
        final dz4 dz4Var622 = dz4Var3;
        arrayList222.add(dz4Var622);
        arrayList222.add(dz4Var52);
        arrayList222.add(E);
        if (!((Boolean) w82.d.c.a(x92.n4)).booleanValue()) {
        }
        final dz4 dz4Var722 = dz4Var2;
        final dz4 dz4Var822 = C;
        final dz4 dz4Var922 = E;
        final oy4 oy4Var22 = new oy4(nv4.t(arrayList222), false, pn3Var.a, new Callable() { // from class: on3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list;
                JSONObject optJSONObject8;
                JSONArray optJSONArray5;
                dz4 dz4Var1022 = dz4.this;
                dz4 dz4Var11 = b2;
                dz4 dz4Var12 = a32;
                dz4 dz4Var13 = a22;
                dz4 dz4Var14 = dz4Var622;
                JSONObject jSONObject2 = jSONObject;
                dz4 dz4Var15 = dz4Var52;
                dz4 dz4Var16 = dz4Var722;
                dz4 dz4Var17 = dz4Var822;
                dz4 dz4Var18 = dz4Var922;
                nl3 nl3Var = (nl3) dz4Var1022.get();
                List list2 = (List) dz4Var11.get();
                synchronized (nl3Var) {
                    nl3Var.e = list2;
                }
                ad2 ad2Var = (ad2) dz4Var12.get();
                synchronized (nl3Var) {
                    nl3Var.r = ad2Var;
                }
                ad2 ad2Var2 = (ad2) dz4Var13.get();
                synchronized (nl3Var) {
                    nl3Var.s = ad2Var2;
                }
                uc2 uc2Var = (uc2) dz4Var14.get();
                synchronized (nl3Var) {
                    nl3Var.c = uc2Var;
                }
                JSONObject optJSONObject9 = jSONObject2.optJSONObject("mute");
                if (optJSONObject9 != null && (optJSONArray5 = optJSONObject9.optJSONArray("reasons")) != null && optJSONArray5.length() > 0) {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i3 = 0; i3 < optJSONArray5.length(); i3++) {
                        n84 e = yn3.e(optJSONArray5.optJSONObject(i3));
                        if (e != null) {
                            arrayList3.add(e);
                        }
                    }
                    list = nv4.t(arrayList3);
                } else {
                    lv4 lv4Var = nv4.Q;
                    list = nw4.T;
                }
                synchronized (nl3Var) {
                    nl3Var.f = list;
                }
                JSONObject optJSONObject10 = jSONObject2.optJSONObject("mute");
                n84 n84Var = null;
                if (optJSONObject10 != null && (optJSONObject8 = optJSONObject10.optJSONObject("default_reason")) != null) {
                    n84Var = yn3.e(optJSONObject8);
                }
                synchronized (nl3Var) {
                    nl3Var.g = n84Var;
                }
                y03 y03Var = (y03) dz4Var15.get();
                if (y03Var != null) {
                    synchronized (nl3Var) {
                        nl3Var.i = y03Var;
                    }
                    View x = y03Var.x();
                    synchronized (nl3Var) {
                        nl3Var.m = x;
                    }
                    q13 q = y03Var.q();
                    synchronized (nl3Var) {
                        nl3Var.b = q;
                    }
                }
                y03 y03Var2 = (y03) dz4Var16.get();
                if (y03Var2 != null) {
                    synchronized (nl3Var) {
                        nl3Var.j = y03Var2;
                    }
                    View x2 = y03Var2.x();
                    synchronized (nl3Var) {
                        nl3Var.o = x2;
                    }
                }
                if (((Boolean) w82.d.c.a(x92.n4)).booleanValue()) {
                    synchronized (nl3Var) {
                        nl3Var.n = dz4Var17;
                    }
                } else {
                    y03 y03Var3 = (y03) dz4Var17.get();
                    if (y03Var3 != null) {
                        synchronized (nl3Var) {
                            nl3Var.k = y03Var3;
                        }
                    }
                }
                for (eo3 eo3Var2 : (List) dz4Var18.get()) {
                    if (eo3Var2.a != 1) {
                        String str3 = eo3Var2.b;
                        lc2 lc2Var = eo3Var2.d;
                        synchronized (nl3Var) {
                            if (lc2Var == null) {
                                nl3Var.u.remove(str3);
                            } else {
                                nl3Var.u.put(str3, lc2Var);
                            }
                        }
                    } else {
                        nl3Var.b(eo3Var2.b, eo3Var2.c);
                    }
                }
                return nl3Var;
            }
        });
        nw4 u22 = nv4.u(new dz4[]{dz4Var, oy4Var22});
        final dz4 dz4Var1022 = dz4Var;
        return new oy4(u22, true, this.b, new Callable() { // from class: l34
            @Override // java.util.concurrent.Callable
            public final Object call() {
                p34 p34Var = p34.this;
                dz4 dz4Var11 = oy4Var22;
                dz4 dz4Var12 = dz4Var1022;
                hi4 hi4Var2 = hi4Var;
                yh4 yh4Var2 = yh4Var;
                JSONObject jSONObject2 = jSONObject;
                p34Var.getClass();
                nl3 nl3Var = (nl3) dz4Var11.get();
                kp3 kp3Var = (kp3) dz4Var12.get();
                l43 c2 = p34Var.a.c(new ts1(hi4Var2, yh4Var2, null), new z63(1, nl3Var), new av2(1, jSONObject2, kp3Var));
                dp3 s = c2.s();
                if (s.P != null) {
                    s.Q.c("/nativeAdCustomClick", s);
                }
                hp3 t = c2.t();
                t.getClass();
                ep3 ep3Var = kp3Var.a;
                ld3 ld3Var = t.a;
                pe3 pe3Var = t.c;
                xe3 xe3Var = t.d;
                vf3 vf3Var = t.e;
                final he3 he3Var = t.b;
                he3Var.getClass();
                b16 b16Var = new b16() { // from class: gp3
                    @Override // defpackage.b16
                    public final void h() {
                        he3.this.c();
                    }
                };
                synchronized (ep3Var) {
                    ep3Var.P = ld3Var;
                    ep3Var.Q = pe3Var;
                    ep3Var.R = xe3Var;
                    ep3Var.S = vf3Var;
                    ep3Var.T = b16Var;
                }
                yh4 yh4Var3 = t.f;
                ci4 ci4Var3 = t.g;
                synchronized (kp3Var) {
                    by4 by4Var = kp3Var.l;
                    if (by4Var != null) {
                        zw4.J(by4Var, new sk1(yh4Var3, ci4Var3), kp3Var.f);
                    }
                }
                final oo3 r = c2.r();
                final y03 j = nl3Var.j();
                if (j == null) {
                    r.getClass();
                } else {
                    r.c.S0(j.x());
                    r.c.Q0(new s22() { // from class: ko3
                        @Override // defpackage.s22
                        public final void h0(r22 r22Var) {
                            g13 R = y03.this.R();
                            Rect rect = r22Var.d;
                            int i3 = rect.left;
                            int i4 = rect.top;
                            xn2 xn2Var = R.g0;
                            if (xn2Var != null) {
                                xn2Var.g(i3, i4);
                            }
                            tn2 tn2Var = R.i0;
                            if (tn2Var != null) {
                                synchronized (tn2Var.Z) {
                                    tn2Var.T = i3;
                                    tn2Var.U = i4;
                                }
                            }
                        }
                    }, r.a);
                    r.c.Q0(new s22() { // from class: lo3
                        @Override // defpackage.s22
                        public final void h0(r22 r22Var) {
                            y03 y03Var = y03.this;
                            HashMap hashMap = new HashMap();
                            hashMap.put("isVisible", true != r22Var.j ? "0" : "1");
                            y03Var.a("onAdVisibilityChanged", hashMap);
                        }
                    }, r.a);
                    r.c.Q0(r.b, r.a);
                    r.b.P = j;
                    j.D0("/trackActiveViewUnit", new mg2() { // from class: mo3
                        @Override // defpackage.mg2
                        public final void b(Object obj2, Map map) {
                            y03 y03Var = (y03) obj2;
                            t73 t73Var = oo3.this.b;
                            t73Var.T = true;
                            t73Var.a();
                        }
                    });
                    j.D0("/untrackActiveViewUnit", new mg2() { // from class: no3
                        @Override // defpackage.mg2
                        public final void b(Object obj2, Map map) {
                            y03 y03Var = (y03) obj2;
                            oo3.this.b.T = false;
                        }
                    });
                }
                pp3 u222 = c2.u();
                tp3 tp3Var = p34Var.e;
                u222.getClass();
                np3 np3Var = tp3Var.a;
                ld3 ld3Var2 = u222.a;
                pe3 pe3Var2 = u222.c;
                xe3 xe3Var2 = u222.d;
                vf3 vf3Var2 = u222.e;
                final he3 he3Var2 = u222.b;
                he3Var2.getClass();
                b16 b16Var2 = new b16() { // from class: op3
                    @Override // defpackage.b16
                    public final void h() {
                        he3.this.c();
                    }
                };
                ni3 ni3Var = u222.f;
                synchronized (np3Var) {
                    synchronized (np3Var) {
                        np3Var.P = ld3Var2;
                        np3Var.Q = pe3Var2;
                        np3Var.R = xe3Var2;
                        np3Var.S = vf3Var2;
                        np3Var.T = b16Var2;
                    }
                    return c2.q();
                }
                np3Var.U = ni3Var;
                return c2.q();
            }
        });
    }
}