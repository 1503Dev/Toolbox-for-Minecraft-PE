package defpackage;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: kr2  reason: default package */
public final class kr2 {
    public HandlerThread a = null;
    public br4 b = null;
    public int c = 0;
    public final Object d = new Object();

    public final Looper a() {
        Looper looper;
        synchronized (this.d) {
            if (this.c != 0) {
                uf0.g(this.a, "Invalid state: handlerThread should already been initialized.");
            } else if (this.a == null) {
                vz3.k("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.a = handlerThread;
                handlerThread.start();
                this.b = new br4(this.a.getLooper());
                vz3.k("Looper thread started.");
            } else {
                vz3.k("Resuming the looper thread");
                this.d.notifyAll();
            }
            this.c++;
            looper = this.a.getLooper();
        }
        return looper;
    }
}