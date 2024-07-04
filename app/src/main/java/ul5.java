package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* renamed from: ul5  reason: default package */
public final class ul5 {
    public static wp5 a(Context context, bm5 bm5Var, boolean z) {
        tp5 tp5Var;
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            tp5Var = null;
        } else {
            tp5Var = new tp5(context, mediaMetricsManager.createPlaybackSession());
        }
        if (tp5Var == null) {
            lb4.c("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new wp5(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            bm5Var.P(tp5Var);
        }
        return new wp5(tp5Var.R.getSessionId());
    }
}