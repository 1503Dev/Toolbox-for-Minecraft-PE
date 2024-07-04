package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: r71  reason: default package */
public final class r71 {
    public static final String e = y20.e("WorkTimer");
    public final ScheduledExecutorService a;
    public final HashMap b;
    public final HashMap c;
    public final Object d;

    /* renamed from: r71$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements ThreadFactory {
        public int a = 0;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder b = e5.b("WorkManager-WorkTimer-thread-");
            b.append(this.a);
            newThread.setName(b.toString());
            this.a++;
            return newThread;
        }
    }

    /* renamed from: r71$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        void b(String str);
    }

    /* renamed from: r71$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c implements Runnable {
        public final r71 P;
        public final String Q;

        public c(r71 r71Var, String str) {
            this.P = r71Var;
            this.Q = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.P.d) {
                if (((c) this.P.b.remove(this.Q)) != null) {
                    b bVar = (b) this.P.c.remove(this.Q);
                    if (bVar != null) {
                        bVar.b(this.Q);
                    }
                } else {
                    y20.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.Q), new Throwable[0]);
                }
            }
        }
    }

    public r71() {
        a aVar = new a();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public final void a(String str, b bVar) {
        synchronized (this.d) {
            y20.c().a(e, String.format("Starting timer for %s", str), new Throwable[0]);
            b(str);
            c cVar = new c(this, str);
            this.b.put(str, cVar);
            this.c.put(str, bVar);
            this.a.schedule(cVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.d) {
            if (((c) this.b.remove(str)) != null) {
                y20.c().a(e, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.c.remove(str);
            }
        }
    }
}