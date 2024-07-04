package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: oa3  reason: default package */
public final class oa3 {
    public final Executor a;
    public final ScheduledExecutorService b;
    public final dz4 c;
    public volatile boolean d = true;

    public oa3(yw2 yw2Var, ScheduledExecutorService scheduledExecutorService, el4 el4Var) {
        this.a = yw2Var;
        this.b = scheduledExecutorService;
        this.c = el4Var;
    }
}