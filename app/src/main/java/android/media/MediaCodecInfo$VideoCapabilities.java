package android.media;

import android.annotation.Nullable;
import android.util.Range;
import java.util.List;

public final /* synthetic */ class MediaCodecInfo$VideoCapabilities {
    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ boolean areSizeAndRateSupported(int i, int i2, double d);

    public native /* synthetic */ Range getBitrateRange();

    public native /* synthetic */ int getHeightAlignment();

    public native /* synthetic */ Range getSupportedFrameRates();

    public native /* synthetic */ Range getSupportedHeights();

    @Nullable
    public native /* synthetic */ List<PerformancePoint> getSupportedPerformancePoints();

    public native /* synthetic */ Range getSupportedWidths();

    public native /* synthetic */ int getWidthAlignment();

    public native /* synthetic */ boolean isSizeSupported(int i, int i2);
}