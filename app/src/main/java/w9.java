package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: w9  reason: default package */
public final class w9 extends xa<Boolean> {
    public static final String i = y20.e("BatteryNotLowTracker");

    public w9(Context context, bw0 bw0Var) {
        super(context, bw0Var);
    }

    @Override // defpackage.qf
    public final Object a() {
        Intent registerReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            return Boolean.valueOf((registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f) ? true : true);
        }
        y20.c().b(i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // defpackage.xa
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // defpackage.xa
    public final void f(Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        y20.c().a(i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            bool = Boolean.TRUE;
        } else if (!action.equals("android.intent.action.BATTERY_LOW")) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        b(bool);
    }
}