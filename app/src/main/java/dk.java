package defpackage;

import android.os.SystemClock;

/* renamed from: dk  reason: default package */
public final class dk implements kd {
    public static final dk a = new dk();

    @Override // defpackage.kd
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.kd
    public final long b() {
        return SystemClock.elapsedRealtime();
    }
}