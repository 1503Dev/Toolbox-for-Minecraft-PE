package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: zt5  reason: default package */
public final class zt5 implements yt5 {
    @Override // defpackage.yt5
    public final MediaCodecInfo B(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.yt5
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.yt5
    public final boolean b() {
        return false;
    }

    @Override // defpackage.yt5
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // defpackage.yt5
    public final boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }
}