package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: ng3  reason: default package */
public final class ng3 {
    public static final void a(Object obj, Object obj2) {
        lf3 lf3Var = (lf3) obj;
        hf3 hf3Var = (hf3) obj2;
        if (lf3Var.isEmpty()) {
            return;
        }
        Iterator it = lf3Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static final lf3 b(Object obj, Object obj2) {
        lf3 lf3Var = (lf3) obj;
        lf3 lf3Var2 = (lf3) obj2;
        if (!lf3Var2.isEmpty()) {
            if (!lf3Var.P) {
                lf3Var = lf3Var.b();
            }
            lf3Var.e();
            if (!lf3Var2.isEmpty()) {
                lf3Var.putAll(lf3Var2);
            }
        }
        return lf3Var;
    }
}