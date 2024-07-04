package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: ct5  reason: default package */
public final class ct5 extends ft {
    @GuardedBy("connectionStatus")
    public final HashMap<ip5, bq5> d = new HashMap<>();
    public final Context e;
    public volatile cl5 f;
    public final mf g;
    public final long h;
    public final long i;

    public ct5(Context context, Looper looper) {
        cs5 cs5Var = new cs5(this);
        this.e = context.getApplicationContext();
        this.f = new cl5(looper, cs5Var);
        this.g = mf.a();
        this.h = 5000L;
        this.i = 300000L;
    }

    @Override // defpackage.ft
    public final boolean c(ip5 ip5Var, mz3 mz3Var, String str, Executor executor) {
        boolean z;
        synchronized (this.d) {
            try {
                bq5 bq5Var = this.d.get(ip5Var);
                if (bq5Var == null) {
                    bq5Var = new bq5(this, ip5Var);
                    bq5Var.a.put(mz3Var, mz3Var);
                    bq5Var.a(str, executor);
                    this.d.put(ip5Var, bq5Var);
                } else {
                    this.f.removeMessages(0, ip5Var);
                    if (!bq5Var.a.containsKey(mz3Var)) {
                        bq5Var.a.put(mz3Var, mz3Var);
                        int i = bq5Var.b;
                        if (i != 1) {
                            if (i == 2) {
                                bq5Var.a(str, executor);
                            }
                        } else {
                            mz3Var.onServiceConnected(bq5Var.f, bq5Var.d);
                        }
                    } else {
                        String ip5Var2 = ip5Var.toString();
                        StringBuilder sb = new StringBuilder(ip5Var2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(ip5Var2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                z = bq5Var.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}