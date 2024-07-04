package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: z75  reason: default package */
public final class z75 {
    public static final z75 b = new z75(Collections.unmodifiableMap(new HashMap()));
    public final Map a;

    public /* synthetic */ z75(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z75) {
            return this.a.equals(((z75) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}