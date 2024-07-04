package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import defpackage.cg;
import defpackage.x71;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: eg0  reason: default package */
public final class eg0 implements mp, dr {
    public static final String a0 = y20.e("Processor");
    public Context Q;
    public androidx.work.a R;
    public bw0 S;
    public WorkDatabase T;
    public List<mn0> W;
    public HashMap V = new HashMap();
    public HashMap U = new HashMap();
    public HashSet X = new HashSet();
    public final ArrayList Y = new ArrayList();
    public PowerManager.WakeLock P = null;
    public final Object Z = new Object();

    /* renamed from: eg0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements Runnable {
        public mp P;
        public String Q;
        public i20<Boolean> R;

        public a(mp mpVar, String str, yq0 yq0Var) {
            this.P = mpVar;
            this.Q = str;
            this.R = yq0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                z = ((Boolean) ((e0) this.R).get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.P.a(this.Q, z);
        }
    }

    public eg0(Context context, androidx.work.a aVar, b71 b71Var, WorkDatabase workDatabase, List list) {
        this.Q = context;
        this.R = aVar;
        this.S = b71Var;
        this.T = workDatabase;
        this.W = list;
    }

    public static boolean c(String str, x71 x71Var) {
        boolean z;
        if (x71Var != null) {
            x71Var.h0 = true;
            x71Var.j();
            i20<ListenableWorker.a> i20Var = x71Var.g0;
            if (i20Var != null) {
                z = ((e0) i20Var).isDone();
                ((e0) x71Var.g0).cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = x71Var.U;
            if (listenableWorker != null && !z) {
                listenableWorker.stop();
            } else {
                y20.c().a(x71.i0, String.format("WorkSpec %s is already done. Not interrupting.", x71Var.T), new Throwable[0]);
            }
            y20.c().a(a0, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        y20.c().a(a0, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    @Override // defpackage.mp
    public final void a(String str, boolean z) {
        synchronized (this.Z) {
            this.V.remove(str);
            y20.c().a(a0, String.format("%s %s executed; reschedule = %s", eg0.class.getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            Iterator it = this.Y.iterator();
            while (it.hasNext()) {
                ((mp) it.next()).a(str, z);
            }
        }
    }

    public final void b(mp mpVar) {
        synchronized (this.Z) {
            this.Y.add(mpVar);
        }
    }

    public final boolean d(String str) {
        boolean z;
        synchronized (this.Z) {
            z = this.V.containsKey(str) || this.U.containsKey(str);
        }
        return z;
    }

    public final void e(String str, br brVar) {
        synchronized (this.Z) {
            y20.c().d(a0, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            x71 x71Var = (x71) this.V.remove(str);
            if (x71Var != null) {
                if (this.P == null) {
                    PowerManager.WakeLock a2 = z51.a(this.Q, "ProcessorForegroundLck");
                    this.P = a2;
                    a2.acquire();
                }
                this.U.put(str, x71Var);
                Intent d = androidx.work.impl.foreground.a.d(this.Q, str, brVar);
                Context context = this.Q;
                Object obj = cg.a;
                if (Build.VERSION.SDK_INT >= 26) {
                    cg.e.a(context, d);
                } else {
                    context.startService(d);
                }
            }
        }
    }

    public final boolean f(String str, WorkerParameters.a aVar) {
        synchronized (this.Z) {
            if (d(str)) {
                y20.c().a(a0, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            x71.a aVar2 = new x71.a(this.Q, this.R, this.S, this, this.T, str);
            aVar2.g = this.W;
            if (aVar != null) {
                aVar2.h = aVar;
            }
            x71 x71Var = new x71(aVar2);
            yq0<Boolean> yq0Var = x71Var.f0;
            yq0Var.c(new a(this, str, yq0Var), ((b71) this.S).c);
            this.V.put(str, x71Var);
            ((b71) this.S).a.execute(x71Var);
            y20.c().a(a0, String.format("%s: processing %s", eg0.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public final void g() {
        synchronized (this.Z) {
            if (!(!this.U.isEmpty())) {
                Context context = this.Q;
                String str = androidx.work.impl.foreground.a.Z;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                this.Q.startService(intent);
                PowerManager.WakeLock wakeLock = this.P;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.P = null;
                }
            }
        }
    }

    public final boolean h(String str) {
        boolean c;
        synchronized (this.Z) {
            y20.c().a(a0, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            c = c(str, (x71) this.U.remove(str));
        }
        return c;
    }

    public final boolean i(String str) {
        boolean c;
        synchronized (this.Z) {
            y20.c().a(a0, String.format("Processor stopping background work %s", str), new Throwable[0]);
            c = c(str, (x71) this.V.remove(str));
        }
        return c;
    }
}