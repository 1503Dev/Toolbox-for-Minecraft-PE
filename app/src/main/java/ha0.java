package defpackage;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/* renamed from: ha0  reason: default package */
public final class ha0 {
    public final Context a;
    public final NotificationManager b;

    static {
        new HashSet();
    }

    public ha0(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() {
        boolean areNotificationsEnabled;
        if (Build.VERSION.SDK_INT >= 24) {
            areNotificationsEnabled = this.b.areNotificationsEnabled();
            return areNotificationsEnabled;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.a.getApplicationInfo();
        String packageName = this.a.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}