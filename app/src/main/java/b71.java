package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: b71  reason: default package */
public final class b71 implements bw0 {
    public final vq0 a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final a c = new a();

    /* renamed from: b71$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            b71.this.b.post(runnable);
        }
    }

    public b71(ExecutorService executorService) {
        this.a = new vq0(executorService);
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}