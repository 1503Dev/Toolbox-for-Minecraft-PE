package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;

/* renamed from: q0 */
public final /* synthetic */ class q0 {
    public static /* bridge */ /* synthetic */ void a(Context context, q22 q22Var, IntentFilter intentFilter) {
        context.registerReceiver(q22Var, intentFilter, 4);
    }

    public static /* bridge */ /* synthetic */ boolean c(PackageManager packageManager) {
        return packageManager.isInstantApp();
    }
}