package defpackage;

import android.media.MediaCodec$CodecException;

/* renamed from: nt5  reason: default package */
public class nt5 extends ek5 {
    public final String P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt5(IllegalStateException illegalStateException, pt5 pt5Var) {
        super("Decoder failed: ".concat(String.valueOf(pt5Var == null ? null : pt5Var.a)), illegalStateException);
        String str = null;
        if (zn4.a >= 21 && (illegalStateException instanceof MediaCodec$CodecException)) {
            str = ((MediaCodec$CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.P = str;
    }
}