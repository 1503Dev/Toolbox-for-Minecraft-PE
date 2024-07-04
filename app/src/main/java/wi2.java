package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: wi2  reason: default package */
public final /* synthetic */ class wi2 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ wi2(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.P) {
            case 0:
                ((zi2) this.Q).P.loadData((String) this.R, "text/html", "UTF-8");
                return;
            case 1:
                h53 h53Var = (h53) this.Q;
                Runnable runnable = (Runnable) this.R;
                h53Var.getClass();
                uf0.b("Adapters must be initialized on the main thread.");
                HashMap hashMap = jv5.A.g.b().f().c;
                if (!hashMap.isEmpty()) {
                    if (runnable != null) {
                        try {
                            runnable.run();
                        } catch (Throwable th) {
                            sv2.h("Could not initialize rewarded ads.", th);
                            return;
                        }
                    }
                    if (((wk2) ((AtomicReference) h53Var.R.a.S).get()) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        HashMap hashMap2 = new HashMap();
                        for (sk2 sk2Var : hashMap.values()) {
                            for (rk2 rk2Var : sk2Var.a) {
                                String str = rk2Var.g;
                                for (String str2 : rk2Var.a) {
                                    if (!hashMap2.containsKey(str2)) {
                                        hashMap2.put(str2, new ArrayList());
                                    }
                                    if (str != null) {
                                        ((List) hashMap2.get(str2)).add(str);
                                    }
                                }
                            }
                        }
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : hashMap2.entrySet()) {
                            String str3 = (String) entry.getKey();
                            try {
                                h14 a = h53Var.S.a(str3, jSONObject);
                                if (a != null) {
                                    mj4 mj4Var = (mj4) a.b;
                                    if (!mj4Var.a() && mj4Var.a.O()) {
                                        mj4Var.a.E2(new va0(h53Var.P), (x24) a.c, (List) entry.getValue());
                                        sv2.b("Initialized rewarded video mediation adapter " + str3);
                                    }
                                }
                            } catch (ni4 e) {
                                sv2.h("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                d16 d16Var = ((c16) this.Q).b;
                int i = zn4.a;
                pp5 pp5Var = ((xl5) d16Var).P.p;
                io5 G = pp5Var.G();
                pp5Var.D(G, 1019, new uj1(G, (String) this.R, 3));
                return;
        }
    }
}