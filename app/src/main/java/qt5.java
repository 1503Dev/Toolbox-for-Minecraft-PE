package defpackage;

import android.media.metrics.LogSessionId;

/* renamed from: qt5  reason: default package */
public final class qt5 {
    public static void a(lt5 lt5Var, wp5 wp5Var) {
        vp5 vp5Var = wp5Var.a;
        vp5Var.getClass();
        LogSessionId logSessionId = vp5Var.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            lt5Var.b.setString("log-session-id", logSessionId.getStringId());
        }
    }
}