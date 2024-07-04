package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo$AudioCapabilities;
import android.media.MediaCodecInfo$VideoCapabilities;
import android.util.Log;
import android.util.Pair;

/* renamed from: pt5  reason: default package */
public final class pt5 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public pt5(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = mx2.f(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if ("Nexus 10".equals(r1) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pt5 b(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        if (codecCapabilities != null) {
            int i = zn4.a;
            if (codecCapabilities.isFeatureSupported("adaptive-playback")) {
                if (zn4.a <= 22) {
                    String str4 = zn4.d;
                    if (!"ODROID-XU3".equals(str4)) {
                    }
                    if (!"OMX.Exynos.AVC.Decoder".equals(str)) {
                    }
                }
                z5 = true;
                if (codecCapabilities != null && zn4.a >= 21) {
                    codecCapabilities.isFeatureSupported("tunneled-playback");
                }
                return new pt5(str, str2, str3, codecCapabilities, z, z5, !z4 || (codecCapabilities != null && zn4.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
            }
        }
        z5 = false;
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new pt5(str, str2, str3, codecCapabilities, z, z5, !z4 || (codecCapabilities != null && zn4.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public static Point f(MediaCodecInfo$VideoCapabilities mediaCodecInfo$VideoCapabilities, int i, int i2) {
        int widthAlignment = mediaCodecInfo$VideoCapabilities.getWidthAlignment();
        int heightAlignment = mediaCodecInfo$VideoCapabilities.getHeightAlignment();
        int i3 = zn4.a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public static boolean h(MediaCodecInfo$VideoCapabilities mediaCodecInfo$VideoCapabilities, int i, int i2, double d) {
        Point f = f(mediaCodecInfo$VideoCapabilities, i, i2);
        int i3 = f.x;
        int i4 = f.y;
        return (d == -1.0d || d < 1.0d) ? mediaCodecInfo$VideoCapabilities.isSizeSupported(i3, i4) : mediaCodecInfo$VideoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public final ok5 a(cu1 cu1Var, cu1 cu1Var2) {
        int i = true != zn4.b(cu1Var.k, cu1Var2.k) ? 8 : 0;
        if (this.h) {
            if (cu1Var.s != cu1Var2.s) {
                i |= 1024;
            }
            if (!this.e && (cu1Var.p != cu1Var2.p || cu1Var.q != cu1Var2.q)) {
                i |= 512;
            }
            if (!zn4.b(cu1Var.w, cu1Var2.w)) {
                i |= 2048;
            }
            String str = this.a;
            if (zn4.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !cu1Var.a(cu1Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new ok5(this.a, cu1Var, cu1Var2, true != cu1Var.a(cu1Var2) ? 2 : 3, 0);
            }
        } else {
            if (cu1Var.x != cu1Var2.x) {
                i |= 4096;
            }
            if (cu1Var.y != cu1Var2.y) {
                i |= 8192;
            }
            if (cu1Var.z != cu1Var2.z) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair b = lu5.b(cu1Var);
                Pair b2 = lu5.b(cu1Var2);
                if (b != null && b2 != null) {
                    int intValue = ((Integer) b.first).intValue();
                    int intValue2 = ((Integer) b2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new ok5(this.a, cu1Var, cu1Var2, 3, 0);
                    }
                }
            }
            if (!cu1Var.a(cu1Var2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new ok5(this.a, cu1Var, cu1Var2, 1, 0);
            }
        }
        return new ok5(this.a, cu1Var, cu1Var2, 0, i);
    }

    public final boolean c(cu1 cu1Var) {
        boolean z;
        String a;
        int i;
        String a2;
        int i2;
        boolean z2 = false;
        if (!this.b.equals(cu1Var.k) && !this.b.equals(lu5.c(cu1Var))) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !i(cu1Var, true)) {
            return false;
        }
        if (this.h) {
            int i3 = cu1Var.p;
            if (i3 <= 0 || (i2 = cu1Var.q) <= 0) {
                return true;
            }
            if (zn4.a >= 21) {
                return e(i3, i2, cu1Var.r);
            }
            if (i3 * i2 <= lu5.a()) {
                z2 = true;
            }
            if (!z2) {
                int i4 = cu1Var.p;
                int i5 = cu1Var.q;
                g("legacyFrameSize, " + i4 + "x" + i5);
            }
            return z2;
        }
        int i6 = zn4.a;
        if (i6 >= 21) {
            int i7 = cu1Var.y;
            if (i7 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null) {
                    a2 = "sampleRate.caps";
                } else {
                    MediaCodecInfo$AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        a2 = "sampleRate.aCaps";
                    } else if (!audioCapabilities.isSampleRateSupported(i7)) {
                        a2 = k6.a("sampleRate.support, ", i7);
                    }
                }
                g(a2);
                return false;
            }
            int i8 = cu1Var.x;
            if (i8 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
                if (codecCapabilities2 == null) {
                    a = "channelCount.caps";
                } else {
                    MediaCodecInfo$AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        a = "channelCount.aCaps";
                    } else {
                        String str = this.a;
                        String str2 = this.b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i6 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            if ("audio/ac3".equals(str2)) {
                                i = 6;
                            } else if ("audio/eac3".equals(str2)) {
                                i = 16;
                            } else {
                                i = 30;
                            }
                            lb4.c("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + "]");
                            maxInputChannelCount = i;
                        }
                        if (maxInputChannelCount < i8) {
                            a = k6.a("channelCount.support, ", i8);
                        }
                    }
                }
                g(a);
                return false;
            }
        }
        return true;
    }

    public final boolean d(cu1 cu1Var) {
        if (this.h) {
            return this.e;
        }
        Pair b = lu5.b(cu1Var);
        return b != null && ((Integer) b.first).intValue() == 42;
    }

    public final boolean e(int i, int i2, double d) {
        MediaCodecInfo$VideoCapabilities videoCapabilities;
        StringBuilder sb;
        String str;
        String sb2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            sb2 = "sizeAndRate.caps";
        } else {
            videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                sb2 = "sizeAndRate.vCaps";
            } else {
                if (zn4.a >= 29) {
                    int a = ot5.a(videoCapabilities, i, i2, d);
                    if (a == 2) {
                        return true;
                    }
                    if (a == 1) {
                        sb = new StringBuilder();
                        str = "sizeAndRate.cover, ";
                        sb.append(str);
                        sb.append(i);
                        sb.append("x");
                        sb.append(i2);
                        sb.append("@");
                        sb.append(d);
                        sb2 = sb.toString();
                    }
                }
                if (!h(videoCapabilities, i, i2, d)) {
                    if (i < i2 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.a) || !"mcv5a".equals(zn4.b)) && h(videoCapabilities, i2, i, d))) {
                        String str2 = "sizeAndRate.rotated, " + i + "x" + i2 + "@" + d;
                        String str3 = this.a;
                        String str4 = this.b;
                        String str5 = zn4.e;
                        StringBuilder b = sd1.b("AssumedSupport [", str2, "] [", str3, ", ");
                        b.append(str4);
                        b.append("] [");
                        b.append(str5);
                        b.append("]");
                        String sb3 = b.toString();
                        synchronized (lb4.a) {
                            Log.d("MediaCodecInfo", sb3);
                        }
                    } else {
                        sb = new StringBuilder();
                        str = "sizeAndRate.support, ";
                        sb.append(str);
                        sb.append(i);
                        sb.append("x");
                        sb.append(i2);
                        sb.append("@");
                        sb.append(d);
                        sb2 = sb.toString();
                    }
                }
                return true;
            }
        }
        g(sb2);
        return false;
    }

    public final void g(String str) {
        String str2 = this.a;
        String str3 = this.b;
        String str4 = zn4.e;
        StringBuilder b = sd1.b("NoSupport [", str, "] [", str2, ", ");
        b.append(str3);
        b.append("] [");
        b.append(str4);
        b.append("]");
        String sb = b.toString();
        synchronized (lb4.a) {
            Log.d("MediaCodecInfo", sb);
        }
    }

    public final boolean i(cu1 cu1Var, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        MediaCodecInfo$VideoCapabilities videoCapabilities;
        Pair b = lu5.b(cu1Var);
        if (b == null) {
            return true;
        }
        int intValue = ((Integer) b.first).intValue();
        int intValue2 = ((Integer) b.second).intValue();
        int i2 = 8;
        if ("video/dolby-vision".equals(cu1Var.k)) {
            if ("video/avc".equals(this.b)) {
                intValue2 = 0;
                intValue = 8;
            } else if ("video/hevc".equals(this.b)) {
                intValue2 = 0;
                intValue = 2;
            }
        }
        if (!this.h && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (zn4.a <= 23 && "video/x-vnd.on2.vp9".equals(this.b) && codecProfileLevelArr.length == 0) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
            if (codecCapabilities2 != null && (videoCapabilities = codecCapabilities2.getVideoCapabilities()) != null) {
                i = ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            } else {
                i = 0;
            }
            if (i >= 180000000) {
                i2 = 1024;
            } else if (i >= 120000000) {
                i2 = 512;
            } else if (i >= 60000000) {
                i2 = 256;
            } else if (i >= 30000000) {
                i2 = 128;
            } else if (i >= 18000000) {
                i2 = 64;
            } else if (i >= 12000000) {
                i2 = 32;
            } else if (i >= 7200000) {
                i2 = 16;
            } else if (i < 3600000) {
                if (i >= 1800000) {
                    i2 = 4;
                } else if (i >= 800000) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i2;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z)) {
                if ("video/hevc".equals(this.b) && intValue == 2) {
                    String str = zn4.b;
                    if (!"sailfish".equals(str) && !"marlin".equals(str)) {
                    }
                }
                return true;
            }
        }
        g("codec.profileLevel, " + cu1Var.h + ", " + this.c);
        return false;
    }

    public final String toString() {
        return this.a;
    }
}