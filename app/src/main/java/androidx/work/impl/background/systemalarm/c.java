package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import defpackage.r71;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c implements p61, mp, r71.b {
    public static final String Y = y20.e("DelayMetCommandHandler");
    public final Context P;
    public final int Q;
    public final String R;
    public final d S;
    public final q61 T;
    public PowerManager.WakeLock W;
    public boolean X = false;
    public int V = 0;
    public final Object U = new Object();

    public c(Context context, int i, String str, d dVar) {
        this.P = context;
        this.Q = i;
        this.S = dVar;
        this.R = str;
        this.T = new q61(context, dVar.Q, this);
    }

    @Override // defpackage.mp
    public final void a(String str, boolean z) {
        y20.c().a(Y, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        d();
        if (z) {
            Intent c = a.c(this.P, this.R);
            d dVar = this.S;
            dVar.e(new d.b(this.Q, c, dVar));
        }
        if (this.X) {
            Intent intent = new Intent(this.P, SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            d dVar2 = this.S;
            dVar2.e(new d.b(this.Q, intent, dVar2));
        }
    }

    @Override // defpackage.r71.b
    public final void b(String str) {
        y20.c().a(Y, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // defpackage.p61
    public final void c(ArrayList arrayList) {
        g();
    }

    public final void d() {
        synchronized (this.U) {
            this.T.c();
            this.S.R.b(this.R);
            PowerManager.WakeLock wakeLock = this.W;
            if (wakeLock != null && wakeLock.isHeld()) {
                y20.c().a(Y, String.format("Releasing wakelock %s for WorkSpec %s", this.W, this.R), new Throwable[0]);
                this.W.release();
            }
        }
    }

    @Override // defpackage.p61
    public final void e(List<String> list) {
        if (!list.contains(this.R)) {
            return;
        }
        synchronized (this.U) {
            if (this.V == 0) {
                this.V = 1;
                y20.c().a(Y, String.format("onAllConstraintsMet for %s", this.R), new Throwable[0]);
                if (this.S.S.f(this.R, null)) {
                    this.S.R.a(this.R, this);
                } else {
                    d();
                }
            } else {
                y20.c().a(Y, String.format("Already started work for %s", this.R), new Throwable[0]);
            }
        }
    }

    public final void f() {
        this.W = z51.a(this.P, String.format("%s (%s)", this.R, Integer.valueOf(this.Q)));
        y20 c = y20.c();
        String str = Y;
        c.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.W, this.R), new Throwable[0]);
        this.W.acquire();
        l71 i = ((n71) this.S.T.h.n()).i(this.R);
        if (i == null) {
            g();
            return;
        }
        boolean b = i.b();
        this.X = b;
        if (!b) {
            y20.c().a(str, String.format("No constraints for %s", this.R), new Throwable[0]);
            e(Collections.singletonList(this.R));
            return;
        }
        this.T.b(Collections.singletonList(i));
    }

    public final void g() {
        synchronized (this.U) {
            if (this.V < 2) {
                this.V = 2;
                y20 c = y20.c();
                String str = Y;
                c.a(str, String.format("Stopping work for WorkSpec %s", this.R), new Throwable[0]);
                Context context = this.P;
                String str2 = this.R;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                d dVar = this.S;
                dVar.e(new d.b(this.Q, intent, dVar));
                if (this.S.S.d(this.R)) {
                    y20.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.R), new Throwable[0]);
                    Intent c2 = a.c(this.P, this.R);
                    d dVar2 = this.S;
                    dVar2.e(new d.b(this.Q, c2, dVar2));
                } else {
                    y20.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.R), new Throwable[0]);
                }
            } else {
                y20.c().a(Y, String.format("Already stopped work for %s", this.R), new Throwable[0]);
            }
        }
    }
}