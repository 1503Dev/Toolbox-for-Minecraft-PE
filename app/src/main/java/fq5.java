package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat$Builder;
import android.media.AudioTrack;

/* renamed from: fq5  reason: default package */
public final class fq5 {
    public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int a(int i, int i2) {
        boolean isDirectPlaybackSupported;
        for (int i3 = 8; i3 > 0; i3--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat$Builder().setEncoding(i).setSampleRate(i2).setChannelMask(zn4.j(i3)).build(), a);
            if (isDirectPlaybackSupported) {
                return i3;
            }
        }
        return 0;
    }

    public static int[] b() {
        boolean isDirectPlaybackSupported;
        kv4 kv4Var = new kv4();
        sw4 sw4Var = gq5.c;
        sv4 sv4Var = sw4Var.Q;
        if (sv4Var == null) {
            sv4Var = sw4Var.d();
            sw4Var.Q = sv4Var;
        }
        cx4 it = sv4Var.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat$Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), a);
            if (isDirectPlaybackSupported) {
                kv4Var.p(Integer.valueOf(intValue));
            }
        }
        kv4Var.p(2);
        Object[] array = kv4Var.s().toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}