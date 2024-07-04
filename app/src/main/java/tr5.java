package defpackage;

import android.os.Handler;

/* renamed from: tr5  reason: default package */
public final class tr5 {
    public final /* synthetic */ ur5 a;

    public /* synthetic */ tr5(ur5 ur5Var) {
        this.a = ur5Var;
    }

    public final void a(Exception exc) {
        lb4.b("MediaCodecAudioRenderer", "Audio sink error", exc);
        nq5 nq5Var = this.a.m1;
        Handler handler = nq5Var.a;
        if (handler != null) {
            handler.post(new bm3(3, nq5Var, exc));
        }
    }
}