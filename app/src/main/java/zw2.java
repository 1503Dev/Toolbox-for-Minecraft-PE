package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: zw2  reason: default package */
public final class zw2 {
    public static final yw2 a;
    public static final yw2 b;
    public static final yw2 c;
    public static final zv2 d;
    public static final yw2 e;
    public static final yw2 f;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = new yw2(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, timeUnit, new SynchronousQueue(), new aw2("Default")));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new aw2("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = new yw2(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new aw2("Activeview"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        c = new yw2(threadPoolExecutor2);
        d = new zv2(new aw2("Schedule"));
        e = new yw2(new bw2());
        f = new yw2(py4.P);
    }
}