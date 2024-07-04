package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: he4  reason: default package */
public final class he4 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final gg4 a;

    public he4(gg4 gg4Var) {
        this.a = gg4Var;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        gg4.b(this.a, true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
    }
}