package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: sj4  reason: default package */
public final /* synthetic */ class sj4 implements Runnable {
    public final /* synthetic */ int P = 0;
    public final /* synthetic */ Object Q;

    public /* synthetic */ sj4(ds2 ds2Var) {
        this.Q = ds2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        String str;
        String str2;
        switch (this.P) {
            case 0:
                ds2 ds2Var = (ds2) this.Q;
                if (ds2Var != null) {
                    try {
                        ds2Var.y(1);
                        return;
                    } catch (RemoteException e) {
                        sv2.i("#007 Could not call remote method.", e);
                        return;
                    }
                }
                return;
            default:
                long j2 = ((wn5) this.Q).a.getSharedPreferences("app_set_id_storage", 0).getLong("app_set_id_last_used_time", -1L);
                if (j2 != -1) {
                    j = j2 + 33696000000L;
                } else {
                    j = -1;
                }
                if (j != -1 && System.currentTimeMillis() > j) {
                    Context context = ((wn5) this.Q).a;
                    if (!context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id").commit()) {
                        String valueOf = String.valueOf(context.getPackageName());
                        if (valueOf.length() != 0) {
                            str2 = "Failed to clear app set ID generated for App ".concat(valueOf);
                        } else {
                            str2 = new String("Failed to clear app set ID generated for App ");
                        }
                        Log.e("AppSet", str2);
                    }
                    if (!context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                        String valueOf2 = String.valueOf(context.getPackageName());
                        if (valueOf2.length() != 0) {
                            str = "Failed to clear app set ID last used time for App ".concat(valueOf2);
                        } else {
                            str = new String("Failed to clear app set ID last used time for App ");
                        }
                        Log.e("AppSet", str);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ sj4(wn5 wn5Var) {
        this.Q = wn5Var;
    }
}