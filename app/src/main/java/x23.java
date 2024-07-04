package defpackage;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo$VideoCapabilities;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: x23  reason: default package */
public final class x23 {
    public static List b;
    public static final HashMap a = new HashMap();
    public static final Object c = new Object();

    public static List a(String str) {
        ArrayList arrayList;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Object obj = c;
        synchronized (obj) {
            HashMap hashMap = a;
            if (hashMap.containsKey(str)) {
                return (List) hashMap.get(str);
            }
            try {
                synchronized (obj) {
                    if (b == null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else {
                            int codecCount = MediaCodecList.getCodecCount();
                            b = new ArrayList(codecCount);
                            for (int i = 0; i < codecCount; i++) {
                                b.add(MediaCodecList.getCodecInfoAt(i));
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : b) {
                        if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("codecName", mediaCodecInfo.getName());
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            ArrayList arrayList2 = new ArrayList();
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                            }
                            hashMap2.put("profileLevels", arrayList2);
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 21) {
                                MediaCodecInfo$VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                hashMap2.put("bitRatesBps", b(videoCapabilities.getBitrateRange()));
                                hashMap2.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                hashMap2.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                hashMap2.put("frameRates", b(videoCapabilities.getSupportedFrameRates()));
                                hashMap2.put("widths", b(videoCapabilities.getSupportedWidths()));
                                hashMap2.put("heights", b(videoCapabilities.getSupportedHeights()));
                            }
                            if (i2 >= 23) {
                                hashMap2.put("instancesLimit", Integer.valueOf(w23.a(capabilitiesForType)));
                            }
                            arrayList.add(hashMap2);
                        }
                    }
                    a.put(str, arrayList);
                }
                return arrayList;
            } catch (LinkageError | RuntimeException e) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap3);
                a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    @TargetApi(21)
    public static Integer[] b(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}