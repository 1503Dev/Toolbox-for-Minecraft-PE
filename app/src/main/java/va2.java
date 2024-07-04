package defpackage;

import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: va2  reason: default package */
public final class va2 {
    public MotionEvent a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    public MotionEvent b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    public final ScheduledExecutorService c;

    public va2(ScheduledExecutorService scheduledExecutorService) {
        this.c = scheduledExecutorService;
    }

    public final sy4 a() {
        return (sy4) zw4.G(sy4.r(zw4.C(null)), ((Long) lb2.c.d()).longValue(), TimeUnit.MILLISECONDS, this.c);
    }
}