package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: mu5  reason: default package */
public final class mu5 implements mt5 {
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    public /* synthetic */ mu5(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (zn4.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // defpackage.mt5
    public final ByteBuffer A(int i) {
        ByteBuffer inputBuffer;
        if (zn4.a >= 21) {
            inputBuffer = this.a.getInputBuffer(i);
            return inputBuffer;
        }
        return this.b[i];
    }

    @Override // defpackage.mt5
    public final int a() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.mt5
    public final void b(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.mt5
    public final void c(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // defpackage.mt5
    public final MediaFormat d() {
        return this.a.getOutputFormat();
    }

    @Override // defpackage.mt5
    public final void e(int i, rj5 rj5Var, long j) {
        this.a.queueSecureInputBuffer(i, 0, rj5Var.i, j, 0);
    }

    @Override // defpackage.mt5
    public final void f(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.mt5
    public final void g() {
        this.a.flush();
    }

    @Override // defpackage.mt5
    public final void h(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.mt5
    public final void i(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.mt5
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                if (zn4.a < 21) {
                    this.c = this.a.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // defpackage.mt5
    public final void k(long j, int i) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.mt5
    public final void n() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    @Override // defpackage.mt5
    public final ByteBuffer v(int i) {
        ByteBuffer outputBuffer;
        if (zn4.a >= 21) {
            outputBuffer = this.a.getOutputBuffer(i);
            return outputBuffer;
        }
        return this.c[i];
    }

    @Override // defpackage.mt5
    public final void w() {
    }
}