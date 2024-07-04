package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* renamed from: z51  reason: default package */
public final class z51 {
    public static final String a = y20.e("WakeLocks");
    public static final WeakHashMap<PowerManager.WakeLock, String> b = new WeakHashMap<>();

    public static PowerManager.WakeLock a(Context context, String str) {
        String b2 = k6.b("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, b2);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, b2);
        }
        return newWakeLock;
    }
}