package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: kl4  reason: default package */
public abstract class kl4 {
    public static final zy4 d = zw4.C(null);
    public final ez4 a;
    public final ScheduledExecutorService b;
    public final ll4 c;

    public kl4(yw2 yw2Var, ScheduledExecutorService scheduledExecutorService, ll4 ll4Var) {
        this.a = yw2Var;
        this.b = scheduledExecutorService;
        this.c = ll4Var;
    }

    public final gl4 a(ml4 ml4Var, dz4... dz4VarArr) {
        return new gl4(this, ml4Var, Arrays.asList(dz4VarArr));
    }

    public final jl4 b(dz4 dz4Var, ml4 ml4Var) {
        return new jl4(this, ml4Var, dz4Var, Collections.singletonList(dz4Var), dz4Var);
    }
}