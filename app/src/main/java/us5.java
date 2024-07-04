package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: us5  reason: default package */
public final class us5 extends Handler {
    public final /* synthetic */ ws5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us5(ws5 ws5Var, Looper looper) {
        super(looper);
        this.a = ws5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091 A[ORIG_RETURN, RETURN] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        boolean z;
        boolean z2;
        ws5 ws5Var = this.a;
        int i = message.what;
        Object obj = null;
        try {
        } catch (RuntimeException e) {
            AtomicReference atomicReference = ws5Var.d;
            while (true) {
                if (atomicReference.compareAndSet(null, e)) {
                    z = true;
                } else if (atomicReference.get() != null) {
                    z = false;
                } else {
                    continue;
                }
                if (z || atomicReference.get() != null) {
                    break;
                }
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    AtomicReference atomicReference2 = ws5Var.d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (true) {
                        if (atomicReference2.compareAndSet(null, illegalStateException)) {
                            z2 = true;
                        } else if (atomicReference2.get() != null) {
                            z2 = false;
                        } else {
                            continue;
                        }
                        if (z2 || atomicReference2.get() != null) {
                            break;
                        }
                    }
                } else {
                    ws5Var.e.b();
                }
                if (obj == null) {
                    ArrayDeque arrayDeque = ws5.g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(obj);
                    }
                    return;
                }
                return;
            }
            vs5 vs5Var = (vs5) message.obj;
            int i2 = vs5Var.a;
            MediaCodec.CryptoInfo cryptoInfo = vs5Var.c;
            long j = vs5Var.d;
            int i3 = vs5Var.e;
            synchronized (ws5.h) {
                ws5Var.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
            }
            message = vs5Var;
        } else {
            vs5 vs5Var2 = (vs5) message.obj;
            ws5Var.a.queueInputBuffer(vs5Var2.a, 0, vs5Var2.b, vs5Var2.d, vs5Var2.e);
            message = vs5Var2;
        }
        obj = message;
        if (obj == null) {
        }
    }
}