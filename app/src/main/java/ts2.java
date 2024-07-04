package defpackage;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ts2  reason: default package */
public final /* synthetic */ class ts2 implements ky4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ts2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ky4
    public final dz4 e(Object obj) {
        li5 li5Var;
        by4 E;
        switch (this.a) {
            case 0:
                vs2 vs2Var = (vs2) this.b;
                Map map = (Map) obj;
                vs2Var.getClass();
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (optJSONArray != null) {
                                synchronized (vs2Var.h) {
                                    int length = optJSONArray.length();
                                    synchronized (vs2Var.h) {
                                        li5Var = (li5) vs2Var.b.get(str);
                                    }
                                    if (li5Var == null) {
                                        eg4.n("Cannot find the corresponding resource object for " + str);
                                    } else {
                                        boolean z = false;
                                        for (int i = 0; i < length; i++) {
                                            String string = optJSONArray.getJSONObject(i).getString("threat_type");
                                            li5Var.j();
                                            mi5.E((mi5) li5Var.Q, string);
                                        }
                                        boolean z2 = vs2Var.f;
                                        if (length > 0) {
                                            z = true;
                                        }
                                        vs2Var.f = z | z2;
                                    }
                                }
                            }
                        }
                    } catch (JSONException e) {
                        if (((Boolean) vb2.a.d()).booleanValue()) {
                            sv2.c("Failed to get SafeBrowsing metadata", e);
                        }
                        return new yy4(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (vs2Var.f) {
                    synchronized (vs2Var.h) {
                        ph5 ph5Var = vs2Var.a;
                        ph5Var.j();
                        ri5.M((ri5) ph5Var.Q, 10);
                    }
                }
                boolean z3 = vs2Var.f;
                if ((z3 && vs2Var.g.V) || ((vs2Var.k && vs2Var.g.U) || (!z3 && vs2Var.g.S))) {
                    synchronized (vs2Var.h) {
                        for (li5 li5Var2 : vs2Var.b.values()) {
                            ph5 ph5Var2 = vs2Var.a;
                            ph5Var2.j();
                            ri5.F((ri5) ph5Var2.Q, (mi5) li5Var2.h());
                        }
                        ph5 ph5Var3 = vs2Var.a;
                        ArrayList arrayList = vs2Var.c;
                        ph5Var3.j();
                        ri5.K((ri5) ph5Var3.Q, arrayList);
                        ph5 ph5Var4 = vs2Var.a;
                        ArrayList arrayList2 = vs2Var.d;
                        ph5Var4.j();
                        ri5.L((ri5) ph5Var4.Q, arrayList2);
                        if (((Boolean) vb2.a.d()).booleanValue()) {
                            String z4 = ((ri5) vs2Var.a.Q).z();
                            String y = ((ri5) vs2Var.a.Q).y();
                            StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + z4 + "\n  clickUrl: " + y + "\n  resources: \n");
                            for (mi5 mi5Var : Collections.unmodifiableList(((ri5) vs2Var.a.Q).A())) {
                                sb.append("    [");
                                sb.append(mi5Var.w());
                                sb.append("] ");
                                sb.append(mi5Var.z());
                            }
                            eg4.n(sb.toString());
                        }
                        byte[] D = ((ri5) vs2Var.a.h()).D();
                        String str2 = vs2Var.g.Q;
                        new dl2(vs2Var.e);
                        ri2 a = dl2.a(1, str2, null, D);
                        if (((Boolean) vb2.a.d()).booleanValue()) {
                            a.b(new Runnable() { // from class: rs2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    eg4.n("Pinged SB successfully.");
                                }
                            }, zw2.a);
                        }
                        E = zw4.E(a, new at4() { // from class: ss2
                            @Override // defpackage.at4
                            public final Object apply(Object obj2) {
                                String str3 = (String) obj2;
                                List list = vs2.l;
                                return null;
                            }
                        }, zw2.f);
                    }
                    return E;
                }
                return zw4.C(null);
            case 1:
                ow3 ow3Var = (ow3) this.b;
                ow3Var.getClass();
                return zw4.F(sy4.r(zw4.C((JSONObject) obj)), jv5.A.p.a(ow3Var.e, ow3Var.f, ow3Var.d).a("AFMA_getAdDictionary", yj2.b, q05.S), ow3Var.a);
            case 2:
                dz4 dz4Var = (dz4) this.b;
                if (((y03) obj) != null) {
                    return dz4Var;
                }
                throw new l44(1, "Retrieve Web View from image ad response failed.");
            case 3:
                return zw4.C(new hi4(new s41(((hx3) this.b).d), fn2.a(new InputStreamReader((InputStream) obj))));
            default:
                return zw4.C(((bl4) this.b).e(obj));
        }
    }
}