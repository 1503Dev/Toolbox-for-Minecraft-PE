package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: ff1  reason: default package */
public final class ff1 {
    public final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();
    public ScheduledFuture<?> b;
    public ScheduledFuture<?> c;
    public final re1 d;

    public ff1(re1 re1Var) {
        this.d = re1Var;
    }
}