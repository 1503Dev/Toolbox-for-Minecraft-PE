package defpackage;

import android.annotation.NonNull;
import android.media.MediaCodecInfo$VideoCapabilities;
import java.util.List;

/* renamed from: ot5  reason: default package */
public final class ot5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint] */
    public static int a(MediaCodecInfo$VideoCapabilities mediaCodecInfo$VideoCapabilities, int i, int i2, double d) {
        List<MediaCodecInfo$VideoCapabilities.PerformancePoint> supportedPerformancePoints = mediaCodecInfo$VideoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            String str = zn4.b;
            if (!str.equals("sabrina") && !str.equals("boreal")) {
                String str2 = zn4.d;
                if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                    ?? r7 = new Object(i, i2, (int) d) { // from class: android.media.MediaCodecInfo$VideoCapabilities.PerformancePoint
                        static {
                            throw new NoClassDefFoundError();
                        }

                        public native /* synthetic */ boolean covers(@NonNull PerformancePoint performancePoint);
                    };
                    for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                        if (supportedPerformancePoints.get(i3).covers(r7)) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}