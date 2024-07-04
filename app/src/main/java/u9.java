package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* renamed from: u9  reason: default package */
public final class u9 extends xa<Boolean> {
    public static final String i = y20.e("BatteryChrgTracker");

    public u9(Context context, bw0 bw0Var) {
        super(context, bw0Var);
    }

    @Override // defpackage.qf
    public final Object a() {
        int intExtra;
        Intent registerReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            y20.c().b(i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) != 0 : !((intExtra = registerReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xa
    public final IntentFilter e() {
        String str;
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            str = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r7.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L27;
     */
    @Override // defpackage.xa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Intent intent) {
        Boolean bool;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        char c = 0;
        y20.c().a(i, String.format("Received %s", action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                break;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            bool = Boolean.FALSE;
        } else if (c != 2 && c != 3) {
            return;
        } else {
            bool = Boolean.TRUE;
        }
        b(bool);
    }
}