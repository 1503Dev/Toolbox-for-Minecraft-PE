package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: mz3  reason: default package */
public final class mz3 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ k9 b;

    public mz3(k9 k9Var, int i) {
        this.b = k9Var;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        aw cm1Var;
        int i;
        int i2;
        k9 k9Var = this.b;
        if (iBinder == null) {
            synchronized (k9Var.g) {
                i = k9Var.n;
            }
            if (i == 3) {
                k9Var.u = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            h82 h82Var = k9Var.f;
            h82Var.sendMessage(h82Var.obtainMessage(i2, k9Var.w.get(), 16));
            return;
        }
        synchronized (k9Var.h) {
            k9 k9Var2 = this.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof aw)) {
                cm1Var = (aw) queryLocalInterface;
            } else {
                cm1Var = new cm1(iBinder);
            }
            k9Var2.i = cm1Var;
        }
        k9 k9Var3 = this.b;
        int i3 = this.a;
        h82 h82Var2 = k9Var3.f;
        h82Var2.sendMessage(h82Var2.obtainMessage(7, i3, -1, new h25(k9Var3, 0)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k9 k9Var;
        synchronized (this.b.h) {
            k9Var = this.b;
            k9Var.i = null;
        }
        h82 h82Var = k9Var.f;
        h82Var.sendMessage(h82Var.obtainMessage(6, this.a, 1));
    }
}