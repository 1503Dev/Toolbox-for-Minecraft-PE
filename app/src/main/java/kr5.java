package defpackage;

import android.os.SystemClock;

/* renamed from: kr5  reason: default package */
public final class kr5 {
    public Exception a;
    public long b;

    public final void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = exc;
            this.b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.b) {
            Exception exc2 = this.a;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc2, exc);
                } catch (Exception unused) {
                }
            }
            Exception exc3 = this.a;
            this.a = null;
            throw exc3;
        }
    }
}