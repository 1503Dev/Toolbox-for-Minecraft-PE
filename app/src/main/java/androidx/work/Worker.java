package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;

public abstract class Worker extends ListenableWorker {
    public yq0<ListenableWorker.a> U;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Worker.this.U.j(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.U.k(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final i20<ListenableWorker.a> startWork() {
        this.U = new yq0<>();
        getBackgroundExecutor().execute(new a());
        return this.U;
    }
}