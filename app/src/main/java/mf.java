package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* renamed from: mf  reason: default package */
public final class mf {
    public static final Object b = new Object();
    @Nullable
    public static volatile mf c;
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> a = new ConcurrentHashMap<>();

    public static mf a() {
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    c = new mf();
                }
            }
        }
        mf mfVar = c;
        uf0.f(mfVar);
        return mfVar;
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        if ((!(serviceConnection instanceof bq5)) && this.a.containsKey(serviceConnection)) {
            try {
                try {
                    context.unbindService(this.a.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                }
                return;
            } finally {
                this.a.remove(serviceConnection);
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        boolean bindService;
        boolean bindService2;
        ComponentName component = intent.getComponent();
        boolean z = false;
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c81.a(context).a(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        boolean z2 = true;
        if (!(serviceConnection instanceof bq5)) {
            ServiceConnection putIfAbsent = this.a.putIfAbsent(serviceConnection, serviceConnection);
            if (putIfAbsent != null && serviceConnection != putIfAbsent) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                if (Build.VERSION.SDK_INT < 29) {
                    z2 = false;
                }
                if (z2 && executor != null) {
                    bindService2 = context.bindService(intent, i, executor, serviceConnection);
                } else {
                    bindService2 = context.bindService(intent, serviceConnection, i);
                }
                if (!bindService2) {
                    this.a.remove(serviceConnection, serviceConnection);
                    return false;
                }
                return bindService2;
            } catch (Throwable th) {
                this.a.remove(serviceConnection, serviceConnection);
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        if (z && executor != null) {
            bindService = context.bindService(intent, i, executor, serviceConnection);
            return bindService;
        }
        return context.bindService(intent, serviceConnection, i);
    }
}