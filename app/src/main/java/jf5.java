package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: jf5  reason: default package */
public final class jf5 {
    public static final void a(Object obj, Object obj2) {
        if5 if5Var = (if5) obj;
        hf5 hf5Var = (hf5) obj2;
        if (if5Var.isEmpty()) {
            return;
        }
        Iterator it = if5Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static final boolean b(Object obj) {
        return !((if5) obj).P;
    }

    public static final if5 c(Object obj, Object obj2) {
        if5 if5Var = (if5) obj;
        if5 if5Var2 = (if5) obj2;
        if (!if5Var2.isEmpty()) {
            if (!if5Var.P) {
                if5Var = if5Var.b();
            }
            if5Var.e();
            if (!if5Var2.isEmpty()) {
                if5Var.putAll(if5Var2);
            }
        }
        return if5Var;
    }
}