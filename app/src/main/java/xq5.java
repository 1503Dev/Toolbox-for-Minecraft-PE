package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: xq5  reason: default package */
public final class xq5 {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;
    public final wq5 a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public vq5 f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public int w;
    public int x;
    public long y;
    public long z;

    public xq5(lr5 lr5Var) {
        this.a = lr5Var;
        int i = zn4.a;
        try {
            this.n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.c = audioTrack;
        this.d = i2;
        this.e = i3;
        this.f = new vq5(audioTrack);
        this.g = audioTrack.getSampleRate();
        boolean z2 = true;
        if (z && zn4.a < 23) {
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                }
            }
            this.h = z2;
            boolean c = zn4.c(i);
            this.q = c;
            this.i = !c ? c(i3 / i2) : -9223372036854775807L;
            this.t = 0L;
            this.u = 0L;
            this.v = 0L;
            this.p = false;
            this.y = -9223372036854775807L;
            this.z = -9223372036854775807L;
            this.r = 0L;
            this.o = 0L;
            this.j = 1.0f;
        }
        z2 = false;
        this.h = z2;
        boolean c2 = zn4.c(i);
        this.q = c2;
        this.i = !c2 ? c(i3 / i2) : -9223372036854775807L;
        this.t = 0L;
        this.u = 0L;
        this.v = 0L;
        this.p = false;
        this.y = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.r = 0L;
        this.o = 0L;
        this.j = 1.0f;
    }

    public final boolean b(long j) {
        if (j <= d()) {
            if (this.h) {
                AudioTrack audioTrack = this.c;
                audioTrack.getClass();
                return audioTrack.getPlayState() == 2 && d() == 0;
            }
            return false;
        }
        return true;
    }

    public final long c(long j) {
        return (j * 1000000) / this.g;
    }

    public final long d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.y;
        if (j != -9223372036854775807L) {
            return Math.min(this.B, ((zn4.o((elapsedRealtime * 1000) - j, this.j) * this.g) / 1000000) + this.A);
        }
        if (elapsedRealtime - this.s >= 5) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                long j2 = 0;
                if (this.h) {
                    if (playState == 2) {
                        if (playbackHeadPosition == 0) {
                            this.v = this.t;
                        }
                        playState = 2;
                    }
                    playbackHeadPosition += this.v;
                }
                if (zn4.a <= 29) {
                    if (playbackHeadPosition != 0) {
                        j2 = playbackHeadPosition;
                    } else if (this.t > 0 && playState == 3) {
                        if (this.z == -9223372036854775807L) {
                            this.z = elapsedRealtime;
                        }
                    }
                    this.z = -9223372036854775807L;
                    playbackHeadPosition = j2;
                }
                if (this.t > playbackHeadPosition) {
                    this.u++;
                }
                this.t = playbackHeadPosition;
            }
            this.s = elapsedRealtime;
        }
        return this.t + (this.u << 32);
    }
}