package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

public final class d implements mp {
    public static final String Z = y20.e("SystemAlarmDispatcher");
    public final Context P;
    public final bw0 Q;
    public final r71 R;
    public final eg0 S;
    public final a71 T;
    public final androidx.work.impl.background.systemalarm.a U;
    public final Handler V;
    public final ArrayList W;
    public Intent X;
    public c Y;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar;
            RunnableC0015d runnableC0015d;
            synchronized (d.this.W) {
                d dVar2 = d.this;
                dVar2.X = (Intent) dVar2.W.get(0);
            }
            Intent intent = d.this.X;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.X.getIntExtra("KEY_START_ID", 0);
                y20 c = y20.c();
                String str = d.Z;
                c.a(str, String.format("Processing command %s, %s", d.this.X, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock a = z51.a(d.this.P, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    y20.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, a), new Throwable[0]);
                    a.acquire();
                    d dVar3 = d.this;
                    dVar3.U.d(intExtra, dVar3.X, dVar3);
                    y20.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, a), new Throwable[0]);
                    a.release();
                    dVar = d.this;
                    runnableC0015d = new RunnableC0015d(dVar);
                } catch (Throwable th) {
                    try {
                        y20 c2 = y20.c();
                        String str2 = d.Z;
                        c2.b(str2, "Unexpected error in onHandleIntent", th);
                        y20.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, a), new Throwable[0]);
                        a.release();
                        dVar = d.this;
                        runnableC0015d = new RunnableC0015d(dVar);
                    } catch (Throwable th2) {
                        y20.c().a(d.Z, String.format("Releasing operation wake lock (%s) %s", action, a), new Throwable[0]);
                        a.release();
                        d dVar4 = d.this;
                        dVar4.e(new RunnableC0015d(dVar4));
                        throw th2;
                    }
                }
                dVar.e(runnableC0015d);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b implements Runnable {
        public final d P;
        public final Intent Q;
        public final int R;

        public b(int i, Intent intent, d dVar) {
            this.P = dVar;
            this.Q = intent;
            this.R = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.P.b(this.Q, this.R);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface c {
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class RunnableC0015d implements Runnable {
        public final d P;

        public RunnableC0015d(d dVar) {
            this.P = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            d dVar = this.P;
            dVar.getClass();
            y20 c = y20.c();
            String str = d.Z;
            c.a(str, "Checking if commands are complete.", new Throwable[0]);
            dVar.c();
            synchronized (dVar.W) {
                boolean z2 = true;
                if (dVar.X != null) {
                    y20.c().a(str, String.format("Removing command %s", dVar.X), new Throwable[0]);
                    if (((Intent) dVar.W.remove(0)).equals(dVar.X)) {
                        dVar.X = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                vq0 vq0Var = ((b71) dVar.Q).a;
                androidx.work.impl.background.systemalarm.a aVar = dVar.U;
                synchronized (aVar.R) {
                    if (!aVar.Q.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z && dVar.W.isEmpty()) {
                    synchronized (vq0Var.R) {
                        if (vq0Var.P.isEmpty()) {
                            z2 = false;
                        }
                    }
                    if (!z2) {
                        y20.c().a(str, "No more commands & intents.", new Throwable[0]);
                        c cVar = dVar.Y;
                        if (cVar != null) {
                            ((SystemAlarmService) cVar).e();
                        }
                    }
                }
                if (!dVar.W.isEmpty()) {
                    dVar.f();
                }
            }
        }
    }

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.P = applicationContext;
        this.U = new androidx.work.impl.background.systemalarm.a(applicationContext);
        this.R = new r71();
        a71 E1 = a71.E1(context);
        this.T = E1;
        eg0 eg0Var = E1.k;
        this.S = eg0Var;
        this.Q = E1.i;
        eg0Var.b(this);
        this.W = new ArrayList();
        this.X = null;
        this.V = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.mp
    public final void a(String str, boolean z) {
        Context context = this.P;
        String str2 = androidx.work.impl.background.systemalarm.a.S;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        e(new b(0, intent, this));
    }

    public final void b(Intent intent, int i) {
        y20 c2 = y20.c();
        String str = Z;
        boolean z = false;
        c2.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            y20.c().f(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.W) {
                Iterator it = this.W.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.W) {
            boolean z2 = !this.W.isEmpty();
            this.W.add(intent);
            if (!z2) {
                f();
            }
        }
    }

    public final void c() {
        if (this.V.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void d() {
        y20.c().a(Z, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        eg0 eg0Var = this.S;
        synchronized (eg0Var.Z) {
            eg0Var.Y.remove(this);
        }
        r71 r71Var = this.R;
        if (!r71Var.a.isShutdown()) {
            r71Var.a.shutdownNow();
        }
        this.Y = null;
    }

    public final void e(Runnable runnable) {
        this.V.post(runnable);
    }

    public final void f() {
        c();
        PowerManager.WakeLock a2 = z51.a(this.P, "ProcessCommand");
        try {
            a2.acquire();
            ((b71) this.T.i).a(new a());
        } finally {
            a2.release();
        }
    }
}