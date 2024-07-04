package defpackage;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.telephony.TelephonyManager;

@TargetApi(26)
/* renamed from: ax5  reason: default package */
public class ax5 extends cw5 {
    @Override // defpackage.ck1
    public final void f(Context context) {
        NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    @Override // defpackage.ck1
    public final boolean g(Context context) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // defpackage.ck1
    public final int h(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        cu5 cu5Var = jv5.A.c;
        if (cu5.E(context, "android.permission.ACCESS_NETWORK_STATE")) {
            isDataEnabled = telephonyManager.isDataEnabled();
            if (isDataEnabled) {
                return 2;
            }
        }
        return 1;
    }
}