package defpackage;

import android.media.MediaCodec$CodecException;

/* renamed from: rt5  reason: default package */
public final class rt5 extends Exception {
    public final String P;
    public final pt5 Q;
    public final String R;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rt5(int i, cu1 cu1Var, xt5 xt5Var) {
        this("Decoder init failed: [" + i + "], " + r0, xt5Var, cu1Var.k, null, k6.a("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_", Math.abs(i)));
        String valueOf = String.valueOf(cu1Var);
    }

    public rt5(String str, Throwable th, String str2, pt5 pt5Var, String str3) {
        super(str, th);
        this.P = str2;
        this.Q = pt5Var;
        this.R = str3;
    }

    public rt5(cu1 cu1Var, Exception exc, pt5 pt5Var) {
        this(ho.b("Decoder init failed: ", pt5Var.a, ", ", String.valueOf(cu1Var)), exc, cu1Var.k, pt5Var, (zn4.a < 21 || !(exc instanceof MediaCodec$CodecException)) ? null : ((MediaCodec$CodecException) exc).getDiagnosticInfo());
    }
}