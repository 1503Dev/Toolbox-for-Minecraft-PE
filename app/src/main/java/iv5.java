package defpackage;

import java.util.concurrent.Executor;

/* renamed from: iv5  reason: default package */
public final class iv5 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}