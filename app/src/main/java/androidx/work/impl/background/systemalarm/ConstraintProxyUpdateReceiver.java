package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = y20.e("ConstrntProxyUpdtRecvr");

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ Intent P;
        public final /* synthetic */ Context Q;
        public final /* synthetic */ BroadcastReceiver.PendingResult R;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.P = intent;
            this.Q = context;
            this.R = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                boolean booleanExtra = this.P.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.P.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.P.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.P.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                y20.c().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                kd0.a(this.Q, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                kd0.a(this.Q, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                kd0.a(this.Q, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                kd0.a(this.Q, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.R.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            y20.c().a(a, String.format("Ignoring unknown action %s", str), new Throwable[0]);
            return;
        }
        ((b71) a71.E1(context).i).a(new a(intent, context, goAsync()));
    }
}