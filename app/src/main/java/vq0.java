package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: vq0  reason: default package */
public final class vq0 implements Executor {
    public final Executor Q;
    public volatile Runnable S;
    public final ArrayDeque<a> P = new ArrayDeque<>();
    public final Object R = new Object();

    /* renamed from: vq0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements Runnable {
        public final vq0 P;
        public final Runnable Q;

        public a(vq0 vq0Var, Runnable runnable) {
            this.P = vq0Var;
            this.Q = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.Q.run();
            } finally {
                this.P.a();
            }
        }
    }

    public vq0(ExecutorService executorService) {
        this.Q = executorService;
    }

    public final void a() {
        synchronized (this.R) {
            a poll = this.P.poll();
            this.S = poll;
            if (poll != null) {
                this.Q.execute(this.S);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.R) {
            this.P.add(new a(this, runnable));
            if (this.S == null) {
                a();
            }
        }
    }
}