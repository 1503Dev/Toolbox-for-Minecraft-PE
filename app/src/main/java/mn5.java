package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* renamed from: mn5  reason: default package */
public final class mn5 {
    public final ln5 a;
    public final kn5 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;
    public boolean g;
    public boolean h;

    public mn5(im5 im5Var, mk5 mk5Var, dx3 dx3Var, Looper looper) {
        this.b = im5Var;
        this.a = mk5Var;
        this.e = looper;
    }

    public final Looper a() {
        return this.e;
    }

    public final void b() {
        tv2.I(!this.f);
        this.f = true;
        im5 im5Var = (im5) this.b;
        synchronized (im5Var) {
            if (!im5Var.l0 && im5Var.Y.getThread().isAlive()) {
                ((dl4) im5Var.W).a(14, this).a();
            }
            lb4.c("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            c(false);
        }
    }

    public final synchronized void c(boolean z) {
        this.g = z | this.g;
        this.h = true;
        notifyAll();
    }

    public final synchronized void d(long j) {
        tv2.I(this.f);
        tv2.I(this.e.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.h) {
            if (j <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j);
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
    }
}