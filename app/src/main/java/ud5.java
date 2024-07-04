package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ud5  reason: default package */
public final class ud5 {
    public static volatile ud5 b;
    public static final ud5 c = new ud5(0);
    public final Map a;

    public ud5() {
        this.a = new HashMap();
    }

    public ud5(int i) {
        this.a = Collections.emptyMap();
    }

    public static ud5 a() {
        ud5 ud5Var = b;
        if (ud5Var != null) {
            return ud5Var;
        }
        synchronized (ud5.class) {
            ud5 ud5Var2 = b;
            if (ud5Var2 != null) {
                return ud5Var2;
            }
            ud5 b2 = ce5.b();
            b = b2;
            return b2;
        }
    }

    public final he5 b(nf5 nf5Var, int i) {
        return (he5) this.a.get(new td5(i, nf5Var));
    }
}