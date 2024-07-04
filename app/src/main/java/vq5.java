package defpackage;

import android.media.AudioTrack;

/* renamed from: vq5  reason: default package */
public final class vq5 {
    public final uq5 a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public vq5(AudioTrack audioTrack) {
        int i = zn4.a;
        this.a = new uq5(audioTrack);
        a(0);
    }

    public final void a(int i) {
        this.b = i;
        long j = 10000;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
        } else if (i == 1) {
            this.d = 10000L;
            return;
        } else {
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.d = j;
    }
}