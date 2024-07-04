package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: yk4  reason: default package */
public final class yk4 implements lj5 {
    @Override // defpackage.uj5
    public final Object c() {
        ez4 gz4Var;
        ez4 ez4Var;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        if (unconfigurableExecutorService instanceof ez4) {
            ez4Var = (ez4) unconfigurableExecutorService;
        } else {
            if (unconfigurableExecutorService instanceof ScheduledExecutorService) {
                gz4Var = new jz4((ScheduledExecutorService) unconfigurableExecutorService);
            } else {
                gz4Var = new gz4(unconfigurableExecutorService);
            }
            ez4Var = gz4Var;
        }
        tv2.C(ez4Var);
        return ez4Var;
    }
}