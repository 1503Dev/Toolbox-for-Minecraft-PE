package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: jv2  reason: default package */
public final class jv2 {
    public static final ThreadPoolExecutor a = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new iv2("ClientDefault"));
    public static final ExecutorService b = Executors.newSingleThreadExecutor(new iv2("ClientSingle"));
}