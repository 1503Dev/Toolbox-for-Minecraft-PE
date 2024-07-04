package defpackage;

import android.content.res.Resources;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* renamed from: rm */
public final /* synthetic */ class rm {
    public static /* bridge */ /* synthetic */ int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    public static /* bridge */ /* synthetic */ Resources b(Resources.Theme theme) {
        return theme.getResources();
    }
}