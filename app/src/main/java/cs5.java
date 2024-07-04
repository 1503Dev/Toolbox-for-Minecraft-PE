package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: cs5  reason: default package */
public final class cs5 implements Handler.Callback {
    public final /* synthetic */ ct5 P;

    public /* synthetic */ cs5(ct5 ct5Var) {
        this.P = ct5Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            synchronized (this.P.d) {
                ip5 ip5Var = (ip5) message.obj;
                bq5 bq5Var = this.P.d.get(ip5Var);
                if (bq5Var != null && bq5Var.b == 3) {
                    String valueOf = String.valueOf(ip5Var);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = bq5Var.f;
                    if (componentName == null) {
                        ip5Var.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = ip5Var.b;
                        uf0.f(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    bq5Var.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
        synchronized (this.P.d) {
            try {
                ip5 ip5Var2 = (ip5) message.obj;
                bq5 bq5Var2 = this.P.d.get(ip5Var2);
                if (bq5Var2 != null && bq5Var2.a.isEmpty()) {
                    if (bq5Var2.c) {
                        bq5Var2.g.f.removeMessages(1, bq5Var2.e);
                        ct5 ct5Var = bq5Var2.g;
                        ct5Var.g.b(ct5Var.e, bq5Var2);
                        bq5Var2.c = false;
                        bq5Var2.b = 2;
                    }
                    this.P.d.remove(ip5Var2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}