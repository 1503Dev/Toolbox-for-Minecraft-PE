package defpackage;

import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* renamed from: lf4  reason: default package */
public final /* synthetic */ class lf4 {
    public static /* bridge */ /* synthetic */ void a(TelephonyManager telephonyManager, Executor executor, he4 he4Var) {
        telephonyManager.registerTelephonyCallback(executor, he4Var);
    }
}