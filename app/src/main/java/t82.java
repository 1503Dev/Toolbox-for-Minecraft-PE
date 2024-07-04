package defpackage;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: t82  reason: default package */
public final class t82 extends LinkedHashMap {
    public final /* synthetic */ cw2 P;

    public t82(cw2 cw2Var) {
        this.P = cw2Var;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.P) {
            int size = size();
            cw2 cw2Var = this.P;
            boolean z = false;
            if (size <= cw2Var.a) {
                return false;
            }
            cw2Var.f.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
            if (size() > this.P.a) {
                z = true;
            }
            return z;
        }
    }
}