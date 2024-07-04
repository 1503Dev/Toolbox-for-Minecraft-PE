package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutorService;

/* renamed from: t02  reason: default package */
public final class t02 {
    public static final String[] e = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public long a = 0;
    public long b = 0;
    public long c = -1;
    public boolean d = false;

    public t02(Context context, ExecutorService executorService, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            s02.a((AppOpsManager) context.getSystemService("appops"), strArr, executorService, new r02(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }
}