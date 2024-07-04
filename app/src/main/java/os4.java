package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: os4  reason: default package */
public final class os4 implements ServiceConnection {
    public final /* synthetic */ ps4 a;

    public /* synthetic */ os4(ps4 ps4Var) {
        this.a = ps4Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.a().post(new ms4(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.a().post(new ns4(this));
    }
}