package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: db3  reason: default package */
public final /* synthetic */ class db3 implements bl4, h23, wy4, e74, wg3, h75, v64 {
    public final /* synthetic */ int P;
    public final Object Q;

    public /* synthetic */ db3(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // defpackage.e74
    /* renamed from: a */
    public final void mo1a() {
        synchronized (((z64) this.Q)) {
            ((z64) this.Q).X = null;
        }
    }

    @Override // defpackage.h23
    public final void d(boolean z) {
        bx2 bx2Var = (bx2) this.Q;
        if (z) {
            bx2Var.a(null);
        } else {
            bx2Var.c(new Exception("Ad Web View failed to load."));
        }
    }

    @Override // defpackage.bl4
    public final Object e(Object obj) {
        hi4 hi4Var = (hi4) obj;
        u53 u53Var = ((hb3) this.Q).d;
        u53Var.getClass();
        for (gi4 gi4Var : (List) hi4Var.b.R) {
            if (u53Var.a.containsKey(gi4Var.a)) {
                ((x53) u53Var.a.get(gi4Var.a)).b(gi4Var.b);
            } else if (u53Var.b.containsKey(gi4Var.a)) {
                w53 w53Var = (w53) u53Var.b.get(gi4Var.a);
                JSONObject jSONObject = gi4Var.b;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                w53Var.a(hashMap);
            }
        }
        return hi4Var;
    }

    @Override // defpackage.wy4
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        switch (this.P) {
            case 2:
                ((hx3) this.Q).a.f((hi4) obj);
                return;
            default:
                dj3 dj3Var = (dj3) obj;
                synchronized (((z64) this.Q)) {
                    Object obj2 = this.Q;
                    ((z64) obj2).X = dj3Var;
                    ((z64) obj2).X.a();
                }
                return;
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
    }

    public /* synthetic */ db3(u05 u05Var) {
        this.P = 5;
        this.Q = u05Var;
    }

    public /* synthetic */ db3(io5 io5Var) {
        this.P = 7;
        this.Q = io5Var;
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        switch (this.P) {
            case 4:
                el4 el4Var = (el4) this.Q;
                ml4 ml4Var = (ml4) el4Var.P;
                ((pl4) obj).c(el4Var.Q);
                return;
            default:
                jo5 jo5Var = (jo5) obj;
                return;
        }
    }
}