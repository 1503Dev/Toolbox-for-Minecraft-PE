package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.a;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: dg0  reason: default package */
public final class dg0 {
    public static final String a = y20.e("ProcessUtils");

    public static boolean a(Context context, a aVar) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            str = cg0.a();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, dg0.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                y20.c().a(a, "Unable to check ActivityThread for processName", th);
            }
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            }
            str = null;
        }
        aVar.getClass();
        if (!TextUtils.isEmpty(null)) {
            return TextUtils.equals(str, null);
        }
        return TextUtils.equals(str, context.getApplicationInfo().processName);
    }
}