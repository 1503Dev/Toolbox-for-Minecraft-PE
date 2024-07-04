package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: iy3  reason: default package */
public final class iy3 extends dq2 {
    public final Context P;
    public final x93 Q;
    public final s33 R;
    public final z63 S;
    public final ez4 T;

    public iy3(Context context, x93 x93Var, s33 s33Var, z63 z63Var, yw2 yw2Var, o7 o7Var) {
        this.P = context;
        this.Q = x93Var;
        this.R = s33Var;
        this.S = z63Var;
        this.T = yw2Var;
    }

    @Override // defpackage.eq2
    public final void G3(wp2 wp2Var, hq2 hq2Var) {
        zw4.J(zw4.F(sy4.r(t4(wp2Var, Binder.getCallingUid())), new ey3(), zw2.a), new u04(hq2Var), zw2.f);
    }

    @Override // defpackage.eq2
    public final void b4(sp2 sp2Var, hq2 hq2Var) {
        int callingUid = Binder.getCallingUid();
        x93 x93Var = this.Q;
        id4 id4Var = new id4(callingUid, sp2Var);
        x93Var.Q = id4Var;
        t33 t33Var = new t33((w33) x93Var.P, id4Var);
        el4 a = ((ol4) t33Var.i.c()).b(zy4.Q, ml4.GMS_SIGNALS).d(new mw3(1, t33Var)).c(uf0.R).d(new ky4() { // from class: gy3
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                return zw4.C(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).a();
        zw4.J(zw4.F(sy4.r(a), new ey3(), zw2.a), new u04(hq2Var), zw2.f);
        if (((Boolean) mb2.d.d()).booleanValue()) {
            z63 z63Var = this.S;
            z63Var.getClass();
            a.b(new k52(4, z63Var), this.T);
        }
    }

    public final ay4 t4(wp2 wp2Var, int i) {
        dz4 C;
        ml4 ml4Var = ml4.HTTP;
        String str = wp2Var.P;
        int i2 = wp2Var.Q;
        Bundle bundle = wp2Var.R;
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                String string = bundle.getString(str2);
                if (string != null) {
                    hashMap.put(str2, string);
                }
            }
        }
        byte[] bArr = wp2Var.S;
        boolean z = wp2Var.T;
        ky3 ky3Var = new ky3(str, i2, hashMap, bArr, "", z);
        s33 s33Var = this.R;
        ee4 ee4Var = new ee4(0, wp2Var);
        s33Var.Q = ee4Var;
        w33 w33Var = (w33) s33Var.P;
        p63 p63Var = new p63(4, ee4Var);
        uj5 b = kj5.b(eb1.Q);
        uj5 b2 = kj5.b(zw4.S);
        uj5 b3 = kj5.b(p5.Q);
        uj5 b4 = kj5.b(n9.U);
        int i3 = oj5.b;
        nj5 nj5Var = new nj5(4);
        nj5Var.a(ml4.GMS_SIGNALS, b);
        nj5Var.a(ml4.BUILD_URL, b2);
        nj5Var.a(ml4Var, b3);
        nj5Var.a(ml4.PRE_PROCESS, b4);
        oj5 d = nj5Var.d();
        t23 t23Var = w33Var.g;
        zk4 zk4Var = lp5.R;
        uj5 b5 = kj5.b(new k93(p63Var, t23Var, zk4Var, d, 1));
        int i4 = sj5.c;
        List G = ea2.G(0);
        List G2 = ea2.G(1);
        G2.add(b5);
        uj5 b6 = kj5.b(new ct2(zk4Var, w33Var.k, new ql4(new sj5(G, G2)), 2));
        uj5 b7 = kj5.b(new ih3(1, w33Var.A));
        if (z) {
            String str3 = wp2Var.P;
            String str4 = (String) ub2.b.d();
            if (!TextUtils.isEmpty(str4)) {
                String host = Uri.parse(str3).getHost();
                if (!TextUtils.isEmpty(host)) {
                    vw2 a = vw2.a(new ts4(';'));
                    str4.getClass();
                    Iterator b8 = a.b(str4);
                    while (b8.hasNext()) {
                        if (host.endsWith((String) b8.next())) {
                            Context context = w33Var.b.b;
                            tv2.C(context);
                            yw2 yw2Var = zw2.a;
                            tv2.C(yw2Var);
                            tv2.C(((wp2) ee4Var.Q).U);
                            zr3 zr3Var = (zr3) w33Var.R.c();
                            HashSet hashSet = new HashSet();
                            hashSet.add(new eb4(new ae4(yw2Var), 0L, (ScheduledExecutorService) w33Var.k.c()));
                            C = zw4.E(new qc4(context, yw2Var, hashSet, (qm4) b7.c(), zr3Var).a(new JSONObject()), new hy3(0, ky3Var), this.T);
                            break;
                        }
                    }
                }
            }
        }
        C = zw4.C(ky3Var);
        return zw4.F(((ol4) b6.c()).b(C, ml4Var).c(new my3(this.P, "")).a(), new ky4() { // from class: fy3
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                ly3 ly3Var = (ly3) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", ly3Var.a);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str5 : ly3Var.b.keySet()) {
                        if (str5 != null) {
                            JSONArray jSONArray = new JSONArray();
                            for (String str6 : (List) ly3Var.b.get(str5)) {
                                if (str6 != null) {
                                    jSONArray.put(str6);
                                }
                            }
                            jSONObject2.put(str5, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = ly3Var.c;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", ly3Var.d);
                    return zw4.C(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e) {
                    sv2.g("Error converting response to JSONObject: ".concat(String.valueOf(e.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.T);
    }
}