package defpackage;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: w71  reason: default package */
public final class w71 implements Runnable {
    public final /* synthetic */ yq0 P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ x71 R;

    public w71(x71 x71Var, yq0 yq0Var, String str) {
        this.R = x71Var;
        this.P = yq0Var;
        this.Q = str;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        try {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.P.get();
                if (aVar == null) {
                    y20.c().b(x71.i0, String.format("%s returned a null result. Treating it as a failure.", this.R.T.c), new Throwable[0]);
                } else {
                    y20.c().a(x71.i0, String.format("%s returned a %s result.", this.R.T.c, aVar), new Throwable[0]);
                    this.R.W = aVar;
                }
            } catch (InterruptedException e) {
                e = e;
                y20.c().b(x71.i0, String.format("%s failed because it threw an exception/error", this.Q), e);
            } catch (CancellationException e2) {
                y20.c().d(x71.i0, String.format("%s was cancelled", this.Q), e2);
            } catch (ExecutionException e3) {
                e = e3;
                y20.c().b(x71.i0, String.format("%s failed because it threw an exception/error", this.Q), e);
            }
        } finally {
            this.R.d();
        }
    }
}