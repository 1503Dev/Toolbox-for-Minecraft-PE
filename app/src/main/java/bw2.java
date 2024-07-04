package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: bw2  reason: default package */
public final class bw2 implements Executor {
    public final wi4 P = new wi4(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
                return;
            } catch (Throwable th) {
                cu5 cu5Var = jv5.A.c;
                Context context = jv5.A.g.e;
                if (context != null) {
                    try {
                        if (((Boolean) wb2.b.d()).booleanValue()) {
                            wg.a(context, th);
                        }
                    } catch (IllegalStateException unused) {
                    }
                }
                throw th;
            }
        }
        this.P.post(runnable);
    }
}