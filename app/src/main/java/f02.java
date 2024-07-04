package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: f02  reason: default package */
public final class f02 extends BroadcastReceiver {
    public boolean a = true;

    public f02(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            z = true;
        } else if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            return;
        } else {
            z = false;
        }
        this.a = z;
    }
}