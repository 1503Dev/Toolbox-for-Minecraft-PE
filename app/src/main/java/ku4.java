package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* renamed from: ku4  reason: default package */
public abstract class ku4 extends nu4 implements Serializable {
    public final transient Map S;
    public transient int T;

    public ku4(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.S = map;
    }

    public final void a() {
        for (Collection collection : this.S.values()) {
            collection.clear();
        }
        this.S.clear();
        this.T = 0;
    }
}