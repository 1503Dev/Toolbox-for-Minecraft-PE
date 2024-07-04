package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ws5  reason: default package */
public final class ws5 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public us5 c;
    public final AtomicReference d;
    public final sy3 e;
    public boolean f;

    public ws5(MediaCodec mediaCodec, HandlerThread handlerThread) {
        sy3 sy3Var = new sy3();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = sy3Var;
        this.d = new AtomicReference();
    }

    public final void a() {
        if (this.f) {
            try {
                us5 us5Var = this.c;
                us5Var.getClass();
                us5Var.removeCallbacksAndMessages(null);
                sy3 sy3Var = this.e;
                synchronized (sy3Var) {
                    sy3Var.a = false;
                }
                us5 us5Var2 = this.c;
                us5Var2.getClass();
                us5Var2.obtainMessage(2).sendToTarget();
                sy3 sy3Var2 = this.e;
                synchronized (sy3Var2) {
                    while (!sy3Var2.a) {
                        sy3Var2.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void b() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void c(int i, rj5 rj5Var, long j) {
        vs5 vs5Var;
        int length;
        int length2;
        int length3;
        int length4;
        b();
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                vs5Var = new vs5();
            } else {
                vs5Var = (vs5) arrayDeque.removeFirst();
            }
        }
        vs5Var.a = i;
        vs5Var.b = 0;
        vs5Var.d = j;
        vs5Var.e = 0;
        MediaCodec.CryptoInfo cryptoInfo = vs5Var.c;
        cryptoInfo.numSubSamples = rj5Var.f;
        int[] iArr = rj5Var.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= (length4 = iArr.length)) {
                System.arraycopy(iArr, 0, iArr2, 0, length4);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = rj5Var.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= (length3 = iArr3.length)) {
                System.arraycopy(iArr3, 0, iArr4, 0, length3);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = rj5Var.b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 != null && bArr2.length >= (length2 = bArr.length)) {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            } else {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = rj5Var.a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 != null && bArr4.length >= (length = bArr3.length)) {
                System.arraycopy(bArr3, 0, bArr4, 0, length);
            } else {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = rj5Var.c;
        if (zn4.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec$CryptoInfo$Pattern(rj5Var.g, rj5Var.h));
        }
        this.c.obtainMessage(1, vs5Var).sendToTarget();
    }
}