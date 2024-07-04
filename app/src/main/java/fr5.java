package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* renamed from: fr5  reason: default package */
public final class fr5 {
    public static void a(AudioTrack audioTrack, wp5 wp5Var) {
        vp5 vp5Var = wp5Var.a;
        vp5Var.getClass();
        LogSessionId logSessionId = vp5Var.a;
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(logSessionId);
        }
    }
}