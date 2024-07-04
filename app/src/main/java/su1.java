package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: su1  reason: default package */
public final class su1 implements Executor {
    public final /* synthetic */ Handler P;

    public su1(Handler handler) {
        this.P = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.P.post(runnable);
    }
}