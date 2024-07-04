package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: la  reason: default package */
public final class la implements ServiceConnection {
    public boolean a = false;
    public final LinkedBlockingQueue b = new LinkedBlockingQueue();

    public final IBinder a(TimeUnit timeUnit) {
        uf0.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.a = true;
        IBinder iBinder = (IBinder) this.b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}