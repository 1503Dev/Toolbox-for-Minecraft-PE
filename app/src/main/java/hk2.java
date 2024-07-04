package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hk2  reason: default package */
public final class hk2 {
    public static volatile hk2 b;
    public static final hk2 c = new hk2(0);
    public final Map a;

    public hk2() {
        this.a = new HashMap();
    }

    public hk2(int i) {
        this.a = Collections.emptyMap();
    }

    public final ev2 a(fk3 fk3Var, int i) {
        return (ev2) this.a.get(new lj2(i, fk3Var));
    }
}