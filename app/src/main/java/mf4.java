package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* renamed from: mf4  reason: default package */
public final class mf4 extends BroadcastReceiver {
    public final /* synthetic */ gg4 a;

    public /* synthetic */ mf4(gg4 gg4Var) {
        this.a = gg4Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 1;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                }
                                i = 5;
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            i = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i = 6;
                            break;
                        case 18:
                            i = 2;
                            break;
                        case 20:
                            if (zn4.a >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                    }
                }
            } catch (SecurityException unused) {
            }
            if (zn4.a >= 31 || i != 5) {
                gg4.b(this.a, i);
            }
            gg4 gg4Var = this.a;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                he4 he4Var = new he4(gg4Var);
                lf4.a(telephonyManager, kf4.a(context), he4Var);
                telephonyManager.unregisterTelephonyCallback(he4Var);
                return;
            } catch (RuntimeException unused2) {
                gg4.b(gg4Var, 5);
                return;
            }
        }
        i = 0;
        if (zn4.a >= 31) {
        }
        gg4.b(this.a, i);
    }
}