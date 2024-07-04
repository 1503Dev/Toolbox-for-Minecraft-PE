package android.media.metrics;

import android.annotation.NonNull;

public final /* synthetic */ class PlaybackSession implements AutoCloseable {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ LogSessionId getSessionId();

    public native /* synthetic */ void reportNetworkEvent(@NonNull NetworkEvent networkEvent);

    public native /* synthetic */ void reportPlaybackErrorEvent(@NonNull PlaybackErrorEvent playbackErrorEvent);

    public native /* synthetic */ void reportPlaybackMetrics(@NonNull PlaybackMetrics playbackMetrics);

    public native /* synthetic */ void reportPlaybackStateEvent(@NonNull PlaybackStateEvent playbackStateEvent);

    public native /* synthetic */ void reportTrackChangeEvent(@NonNull TrackChangeEvent trackChangeEvent);
}