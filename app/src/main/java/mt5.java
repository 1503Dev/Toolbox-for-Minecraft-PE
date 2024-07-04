package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: mt5  reason: default package */
public interface mt5 {
    ByteBuffer A(int i);

    int a();

    void b(int i);

    void c(int i, boolean z);

    MediaFormat d();

    void e(int i, rj5 rj5Var, long j);

    void f(int i, int i2, long j, int i3);

    void g();

    void h(Bundle bundle);

    void i(Surface surface);

    int j(MediaCodec.BufferInfo bufferInfo);

    void k(long j, int i);

    void n();

    ByteBuffer v(int i);

    void w();
}