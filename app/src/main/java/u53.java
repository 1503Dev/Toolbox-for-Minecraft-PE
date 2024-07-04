package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: u53  reason: default package */
public final class u53 {
    public final Map a;
    public Map b;

    public /* synthetic */ u53() {
        this.a = new HashMap();
    }

    public /* synthetic */ u53(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final synchronized Map a() {
        if (this.b == null) {
            this.b = Collections.unmodifiableMap(new HashMap(this.a));
        }
        return this.b;
    }
}