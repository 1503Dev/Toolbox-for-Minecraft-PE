package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: dj4  reason: default package */
public final class dj4 implements dx3 {
    @Override // defpackage.dx3
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.dx3
    public final dl4 b(Looper looper, Handler.Callback callback) {
        return new dl4(new Handler(looper, callback));
    }
}