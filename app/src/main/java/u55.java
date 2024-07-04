package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: u55  reason: default package */
public abstract class u55 {
    public final Class a;
    public final Map b;
    public final Class c;

    @SafeVarargs
    public u55(Class cls, k65... k65VarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            k65 k65Var = k65VarArr[i];
            if (!hashMap.containsKey(k65Var.a)) {
                hashMap.put(k65Var.a, k65Var);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(k65Var.a.getCanonicalName())));
            }
        }
        this.c = k65VarArr[0].a;
        this.b = Collections.unmodifiableMap(hashMap);
    }

    public t55 a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract int b();

    public abstract nf5 c(gd5 gd5Var);

    public abstract String d();

    public abstract void e(nf5 nf5Var);

    public int f() {
        return 1;
    }

    public final Object g(nf5 nf5Var, Class cls) {
        k65 k65Var = (k65) this.b.get(cls);
        if (k65Var != null) {
            return k65Var.a(nf5Var);
        }
        throw new IllegalArgumentException(ij.c("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }
}