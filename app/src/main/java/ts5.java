package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec$CodecException;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/* renamed from: ts5  reason: default package */
public final class ts5 implements mt5 {
    public final MediaCodec a;
    public final xs5 b;
    public final ws5 c;
    public boolean d;
    public int e = 0;

    public /* synthetic */ ts5(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.a = mediaCodec;
        this.b = new xs5(handlerThread);
        this.c = new ws5(mediaCodec, handlerThread2);
    }

    public static void l(ts5 ts5Var, MediaFormat mediaFormat, Surface surface) {
        boolean z;
        xs5 xs5Var = ts5Var.b;
        MediaCodec mediaCodec = ts5Var.a;
        if (xs5Var.c == null) {
            z = true;
        } else {
            z = false;
        }
        tv2.I(z);
        xs5Var.b.start();
        Handler handler = new Handler(xs5Var.b.getLooper());
        tw0.b(mediaCodec, xs5Var, handler);
        xs5Var.c = handler;
        int i = zn4.a;
        Trace.beginSection("configureCodec");
        ts5Var.a.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        ws5 ws5Var = ts5Var.c;
        if (!ws5Var.f) {
            ws5Var.b.start();
            ws5Var.c = new us5(ws5Var, ws5Var.b.getLooper());
            ws5Var.f = true;
        }
        Trace.beginSection("startCodec");
        ts5Var.a.start();
        Trace.endSection();
        ts5Var.e = 1;
    }

    public static String m(int i, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            str2 = "Audio";
        } else if (i == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override // defpackage.mt5
    public final ByteBuffer A(int i) {
        ByteBuffer inputBuffer;
        inputBuffer = this.a.getInputBuffer(i);
        return inputBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020 A[Catch: all -> 0x0055, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:25:0x0045, B:14:0x0020, B:16:0x0025, B:18:0x0029, B:24:0x0035, B:27:0x0047, B:28:0x004c, B:29:0x004d, B:30:0x004f, B:31:0x0050, B:32:0x0052), top: B:37:0x000a }] */
    @Override // defpackage.mt5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a() {
        boolean z;
        int i;
        this.c.b();
        xs5 xs5Var = this.b;
        synchronized (xs5Var.a) {
            boolean z2 = false;
            if (xs5Var.k <= 0 && !xs5Var.l) {
                z = false;
                i = -1;
                if (!z) {
                    IllegalStateException illegalStateException = xs5Var.m;
                    if (illegalStateException == null) {
                        MediaCodec$CodecException mediaCodec$CodecException = xs5Var.j;
                        if (mediaCodec$CodecException == null) {
                            kt5 kt5Var = xs5Var.d;
                            int i2 = kt5Var.c;
                            if (i2 == 0) {
                                z2 = true;
                            }
                            if (!z2) {
                                if (i2 != 0) {
                                    int[] iArr = kt5Var.d;
                                    int i3 = kt5Var.a;
                                    int i4 = iArr[i3];
                                    kt5Var.a = (i3 + 1) & kt5Var.e;
                                    kt5Var.c = i2 - 1;
                                    i = i4;
                                } else {
                                    throw new NoSuchElementException();
                                }
                            }
                        } else {
                            xs5Var.j = null;
                            throw mediaCodec$CodecException;
                        }
                    } else {
                        xs5Var.m = null;
                        throw illegalStateException;
                    }
                }
            }
            z = true;
            i = -1;
            if (!z) {
            }
        }
        return i;
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
        MediaFormat mediaFormat;
        xs5 xs5Var = this.b;
        synchronized (xs5Var.a) {
            mediaFormat = xs5Var.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.mt5
    public final void e(int i, rj5 rj5Var, long j) {
        this.c.c(i, rj5Var, j);
    }

    @Override // defpackage.mt5
    public final void f(int i, int i2, long j, int i3) {
        vs5 vs5Var;
        ws5 ws5Var = this.c;
        ws5Var.b();
        ArrayDeque arrayDeque = ws5.g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                vs5Var = new vs5();
            } else {
                vs5Var = (vs5) arrayDeque.removeFirst();
            }
        }
        vs5Var.a = i;
        vs5Var.b = i2;
        vs5Var.d = j;
        vs5Var.e = i3;
        us5 us5Var = ws5Var.c;
        int i4 = zn4.a;
        us5Var.obtainMessage(0, vs5Var).sendToTarget();
    }

    @Override // defpackage.mt5
    public final void g() {
        this.c.a();
        this.a.flush();
        xs5 xs5Var = this.b;
        synchronized (xs5Var.a) {
            xs5Var.k++;
            Handler handler = xs5Var.c;
            int i = zn4.a;
            handler.post(new qy2(6, xs5Var));
        }
        this.a.start();
    }

    @Override // defpackage.mt5
    public final void h(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.mt5
    public final void i(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020 A[Catch: all -> 0x007f, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:30:0x006f, B:14:0x0020, B:16:0x0025, B:18:0x0029, B:24:0x0035, B:26:0x0047, B:28:0x0063, B:32:0x0071, B:33:0x0076, B:34:0x0077, B:35:0x0079, B:36:0x007a, B:37:0x007c), top: B:42:0x000a }] */
    @Override // defpackage.mt5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        int i;
        this.c.b();
        xs5 xs5Var = this.b;
        synchronized (xs5Var.a) {
            boolean z2 = false;
            if (xs5Var.k <= 0 && !xs5Var.l) {
                z = false;
                i = -1;
                if (!z) {
                    IllegalStateException illegalStateException = xs5Var.m;
                    if (illegalStateException == null) {
                        MediaCodec$CodecException mediaCodec$CodecException = xs5Var.j;
                        if (mediaCodec$CodecException == null) {
                            kt5 kt5Var = xs5Var.e;
                            int i2 = kt5Var.c;
                            if (i2 == 0) {
                                z2 = true;
                            }
                            if (!z2) {
                                if (i2 != 0) {
                                    int[] iArr = kt5Var.d;
                                    int i3 = kt5Var.a;
                                    int i4 = iArr[i3];
                                    kt5Var.a = (i3 + 1) & kt5Var.e;
                                    kt5Var.c = i2 - 1;
                                    i = -2;
                                    if (i4 >= 0) {
                                        tv2.B(xs5Var.h);
                                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) xs5Var.f.remove();
                                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                                    } else if (i4 == -2) {
                                        xs5Var.h = (MediaFormat) xs5Var.g.remove();
                                    }
                                    i = i4;
                                } else {
                                    throw new NoSuchElementException();
                                }
                            }
                        } else {
                            xs5Var.j = null;
                            throw mediaCodec$CodecException;
                        }
                    } else {
                        xs5Var.m = null;
                        throw illegalStateException;
                    }
                }
            }
            z = true;
            i = -1;
            if (!z) {
            }
        }
        return i;
    }

    @Override // defpackage.mt5
    public final void k(long j, int i) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.mt5
    public final void n() {
        try {
            if (this.e == 1) {
                ws5 ws5Var = this.c;
                if (ws5Var.f) {
                    ws5Var.a();
                    ws5Var.b.quit();
                }
                ws5Var.f = false;
                xs5 xs5Var = this.b;
                synchronized (xs5Var.a) {
                    xs5Var.l = true;
                    xs5Var.b.quit();
                    xs5Var.a();
                }
            }
            this.e = 2;
            if (!this.d) {
                this.a.release();
                this.d = true;
            }
        } catch (Throwable th) {
            if (!this.d) {
                this.a.release();
                this.d = true;
            }
            throw th;
        }
    }

    @Override // defpackage.mt5
    public final ByteBuffer v(int i) {
        ByteBuffer outputBuffer;
        outputBuffer = this.a.getOutputBuffer(i);
        return outputBuffer;
    }

    @Override // defpackage.mt5
    public final void w() {
    }
}