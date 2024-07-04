package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ot  reason: default package */
public class ot {
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final AtomicBoolean b = new AtomicBoolean();

    @TargetApi(21)
    public static boolean a(Context context) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if ("com.google.android.gms".equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException unused2) {
            return false;
        }
    }
}