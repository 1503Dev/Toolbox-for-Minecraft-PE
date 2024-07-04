package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sf2  reason: default package */
public final class sf2 implements mg2 {
    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        y03 y03Var = (y03) obj;
        xx5 xx5Var = jv5.A.q;
        Context context = y03Var.getContext();
        synchronized (xx5Var) {
            xx5Var.c = y03Var;
            if (!xx5Var.e(context)) {
                xx5Var.c("Unable to bind", "on_play_store_bind");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("action", "fetch_completed");
                xx5Var.b("on_play_store_bind", hashMap);
            }
        }
    }
}