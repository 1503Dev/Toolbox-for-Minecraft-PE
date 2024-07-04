package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* renamed from: sr5  reason: default package */
public final class sr5 {
    public static void a(tq5 tq5Var, Object obj) {
        gr5 gr5Var;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        rr5 rr5Var = (rr5) tq5Var;
        if (audioDeviceInfo == null) {
            gr5Var = null;
        } else {
            rr5Var.getClass();
            gr5Var = new gr5(audioDeviceInfo);
        }
        rr5Var.Q = gr5Var;
        AudioTrack audioTrack = rr5Var.q;
        if (audioTrack != null) {
            er5.a(audioTrack, gr5Var);
        }
    }
}