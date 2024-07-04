package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: mr5  reason: default package */
public final /* synthetic */ class mr5 implements Executor {
    public final /* synthetic */ int P;
    public final Handler Q;

    public mr5() {
        this.P = 1;
        this.Q = new sj1(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.P) {
            case 0:
                this.Q.post(runnable);
                return;
            default:
                this.Q.post(runnable);
                return;
        }
    }

    public /* synthetic */ mr5(Handler handler) {
        this.P = 0;
        this.Q = handler;
    }
}