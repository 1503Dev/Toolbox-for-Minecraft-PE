package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: bq5  reason: default package */
public final class bq5 implements ServiceConnection {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final ip5 e;
    public ComponentName f;
    public final /* synthetic */ ct5 g;

    public bq5(ct5 ct5Var, ip5 ip5Var) {
        this.g = ct5Var;
        this.e = ip5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, Executor executor) {
        Intent intent;
        boolean c;
        Bundle bundle;
        String str2;
        this.b = 3;
        ct5 ct5Var = this.g;
        mf mfVar = ct5Var.g;
        Context context = ct5Var.e;
        ip5 ip5Var = this.e;
        Intent intent2 = null;
        if (ip5Var.a != null) {
            if (ip5Var.d) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", ip5Var.a);
                try {
                    bundle = context.getContentResolver().call(ip5.e, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent2 = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent2 == null) {
                    String valueOf = String.valueOf(ip5Var.a);
                    if (valueOf.length() != 0) {
                        str2 = "Dynamic lookup for intent failed for action: ".concat(valueOf);
                    } else {
                        str2 = new String("Dynamic lookup for intent failed for action: ");
                    }
                    Log.w("ConnectionStatusConfig", str2);
                }
            }
            if (intent2 == null) {
                intent = new Intent(ip5Var.a).setPackage(ip5Var.b);
                c = mfVar.c(context, str, intent, this, this.e.c, executor);
                this.c = c;
                if (!c) {
                    this.g.f.sendMessageDelayed(this.g.f.obtainMessage(1, this.e), this.g.i);
                    return;
                }
                this.b = 2;
                try {
                    ct5 ct5Var2 = this.g;
                    ct5Var2.g.b(ct5Var2.e, this);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        } else {
            intent2 = new Intent().setComponent(null);
        }
        intent = intent2;
        c = mfVar.c(context, str, intent, this, this.e.c, executor);
        this.c = c;
        if (!c) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.d) {
            this.g.f.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.d) {
            this.g.f.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}