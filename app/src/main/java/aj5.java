package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;

/* renamed from: aj5  reason: default package */
public final class aj5 {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec$CryptoInfo$Pattern b = new MediaCodec$CryptoInfo$Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void a(aj5 aj5Var, int i, int i2) {
        aj5Var.b.set(i, i2);
        aj5Var.a.setPattern(aj5Var.b);
    }
}