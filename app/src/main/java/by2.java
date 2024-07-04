package defpackage;

import android.os.Looper;

/* renamed from: by2  reason: default package */
public final class by2 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}