package defpackage;

import android.content.Context;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* renamed from: ft  reason: default package */
public abstract class ft {
    public static final Object a = new Object();
    public static ct5 b;
    public static HandlerThread c;

    public static ct5 a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new ct5(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return b;
    }

    public final void b(String str, String str2, int i, mz3 mz3Var, boolean z) {
        ip5 ip5Var = new ip5(str, i, str2, z);
        ct5 ct5Var = (ct5) this;
        synchronized (ct5Var.d) {
            bq5 bq5Var = ct5Var.d.get(ip5Var);
            if (bq5Var != null) {
                if (bq5Var.a.containsKey(mz3Var)) {
                    bq5Var.a.remove(mz3Var);
                    if (bq5Var.a.isEmpty()) {
                        ct5Var.f.sendMessageDelayed(ct5Var.f.obtainMessage(0, ip5Var), ct5Var.h);
                    }
                } else {
                    String ip5Var2 = ip5Var.toString();
                    StringBuilder sb = new StringBuilder(ip5Var2.length() + 76);
                    sb.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb.append(ip5Var2);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                String ip5Var3 = ip5Var.toString();
                StringBuilder sb2 = new StringBuilder(ip5Var3.length() + 50);
                sb2.append("Nonexistent connection status for service config: ");
                sb2.append(ip5Var3);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public abstract boolean c(ip5 ip5Var, mz3 mz3Var, String str, Executor executor);
}