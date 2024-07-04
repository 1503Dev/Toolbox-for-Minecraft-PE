package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: q22  reason: default package */
public final class q22 extends BroadcastReceiver {
    public final /* synthetic */ t22 a;

    public q22(t22 t22Var) {
        this.a = t22Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.c(3);
    }
}