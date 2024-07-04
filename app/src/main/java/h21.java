package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: h21  reason: default package */
public final class h21 {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }
}