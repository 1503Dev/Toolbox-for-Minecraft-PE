package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* renamed from: nr5  reason: default package */
public final class nr5 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ or5 a;

    public nr5(or5 or5Var) {
        this.a = or5Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        rr5 rr5Var;
        tr5 tr5Var;
        on5 on5Var;
        if (audioTrack.equals(this.a.c.q) && (tr5Var = (rr5Var = this.a.c).m) != null && rr5Var.M && (on5Var = tr5Var.a.v1) != null) {
            on5Var.c();
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        rr5 rr5Var;
        tr5 tr5Var;
        on5 on5Var;
        if (audioTrack.equals(this.a.c.q) && (tr5Var = (rr5Var = this.a.c).m) != null && rr5Var.M && (on5Var = tr5Var.a.v1) != null) {
            on5Var.c();
        }
    }
}