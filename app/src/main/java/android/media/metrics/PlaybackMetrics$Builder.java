package android.media.metrics;

import android.annotation.NonNull;

public final /* synthetic */ class PlaybackMetrics$Builder {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ PlaybackMetrics build();

    @NonNull
    public native /* synthetic */ PlaybackMetrics$Builder setAudioUnderrunCount(int i);

    @NonNull
    public native /* synthetic */ PlaybackMetrics$Builder setDrmType(int i);

    @NonNull
    public native /* synthetic */ PlaybackMetrics$Builder setMediaDurationMillis(long j);

    @NonNull
    public native /* synthetic */ PlaybackMetrics$Builder setNetworkBytesRead(long j);

    @NonNull
    public native /* synthetic */ PlaybackMetrics$Builder setNetworkTransferDurationMillis(long j);

    @NonNull
    public native /* synthetic */ PlaybackMetrics$Builder setPlaybackType(int i);

    @NonNull
    public native /* synthetic */ PlaybackMetrics$Builder setPlayerName(@NonNull String str);

    @NonNull
    public native /* synthetic */ PlaybackMetrics$Builder setPlayerVersion(@NonNull String str);

    @NonNull
    public native /* synthetic */ PlaybackMetrics$Builder setStreamSource(int i);

    @NonNull
    public native /* synthetic */ PlaybackMetrics$Builder setStreamType(int i);

    @NonNull
    public native /* synthetic */ PlaybackMetrics$Builder setVideoFramesDropped(int i);

    @NonNull
    public native /* synthetic */ PlaybackMetrics$Builder setVideoFramesPlayed(int i);
}