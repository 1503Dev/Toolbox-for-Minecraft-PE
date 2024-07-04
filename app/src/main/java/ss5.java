package defpackage;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;

/* renamed from: ss5  reason: default package */
public final class ss5 {
    public final qs5 a;
    public final rs5 b;

    public ss5(int i) {
        qs5 qs5Var = new qs5(i);
        rs5 rs5Var = new rs5(i);
        this.a = qs5Var;
        this.b = rs5Var;
    }

    public final ts5 a(lt5 lt5Var) {
        MediaCodec mediaCodec;
        ts5 ts5Var;
        String str = lt5Var.a.a;
        ts5 ts5Var2 = null;
        try {
            int i = zn4.a;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                ts5Var = new ts5(mediaCodec, new HandlerThread(ts5.m(this.a.P, "ExoPlayer:MediaCodecAsyncAdapter:")), new HandlerThread(ts5.m(this.b.P, "ExoPlayer:MediaCodecQueueingThread:")));
            } catch (Exception e) {
                e = e;
            }
            try {
                Trace.endSection();
                ts5.l(ts5Var, lt5Var.b, lt5Var.d);
                return ts5Var;
            } catch (Exception e2) {
                e = e2;
                ts5Var2 = ts5Var;
                if (ts5Var2 == null) {
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                } else {
                    ts5Var2.n();
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }
}