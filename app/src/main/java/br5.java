package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: br5  reason: default package */
public final class br5 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (rv2.b) {
            rv2.c = false;
            rv2.d = false;
            sv2.g("Ad debug logging enablement is out of date.");
        }
        vx.y(context);
    }
}