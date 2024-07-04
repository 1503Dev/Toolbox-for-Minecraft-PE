package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: dz4  reason: default package */
public interface dz4<V> extends Future<V> {
    void b(Runnable runnable, Executor executor);
}