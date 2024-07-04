package defpackage;

import android.media.AudioTrack;

/* renamed from: er5  reason: default package */
public final class er5 {
    public static void a(AudioTrack audioTrack, gr5 gr5Var) {
        audioTrack.setPreferredDevice(gr5Var == null ? null : gr5Var.a);
    }
}