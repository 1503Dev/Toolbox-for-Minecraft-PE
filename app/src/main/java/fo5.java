package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: fo5  reason: default package */
public final class fo5 extends BroadcastReceiver {
    public final /* synthetic */ go5 a;

    public /* synthetic */ fo5(go5 go5Var) {
        this.a = go5Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        go5 go5Var = this.a;
        go5Var.b.post(new xj1(4, go5Var));
    }
}