package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: hu5  reason: default package */
public final class hu5 implements yt5 {
    public final int a;
    public MediaCodecInfo[] b;

    public hu5(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.a = i;
    }

    @Override // defpackage.yt5
    public final MediaCodecInfo B(int i) {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b[i];
    }

    @Override // defpackage.yt5
    public final int a() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b.length;
    }

    @Override // defpackage.yt5
    public final boolean b() {
        return true;
    }

    @Override // defpackage.yt5
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // defpackage.yt5
    public final boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        boolean isFeatureRequired;
        isFeatureRequired = codecCapabilities.isFeatureRequired(str);
        return isFeatureRequired;
    }
}