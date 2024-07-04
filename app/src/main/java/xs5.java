package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec$Callback;
import android.media.MediaCodec$CodecException;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* renamed from: xs5  reason: default package */
public final class xs5 extends MediaCodec$Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec$CodecException j;
    public long k;
    public boolean l;
    public IllegalStateException m;
    public final Object a = new Object();
    public final kt5 d = new kt5();
    public final kt5 e = new kt5();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public xs5(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final void a() {
        if (!this.g.isEmpty()) {
            this.i = (MediaFormat) this.g.getLast();
        }
        kt5 kt5Var = this.d;
        kt5Var.a = 0;
        kt5Var.b = -1;
        kt5Var.c = 0;
        kt5 kt5Var2 = this.e;
        kt5Var2.a = 0;
        kt5Var2.b = -1;
        kt5Var2.c = 0;
        this.f.clear();
        this.g.clear();
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec$CodecException mediaCodec$CodecException) {
        synchronized (this.a) {
            this.j = mediaCodec$CodecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            this.d.a(i);
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            MediaFormat mediaFormat = this.i;
            if (mediaFormat != null) {
                this.e.a(-2);
                this.g.add(mediaFormat);
                this.i = null;
            }
            this.e.a(i);
            this.f.add(bufferInfo);
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.a(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}