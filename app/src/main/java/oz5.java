package defpackage;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
/* renamed from: oz5  reason: default package */
public final class oz5 extends Handler implements Runnable {
    public final iw5 P;
    public final long Q;
    public mz5 R;
    public IOException S;
    public int T;
    public Thread U;
    public boolean V;
    public volatile boolean W;
    public final /* synthetic */ rz5 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz5(rz5 rz5Var, Looper looper, iw5 iw5Var, mz5 mz5Var, long j) {
        super(looper);
        this.X = rz5Var;
        this.P = iw5Var;
        this.R = mz5Var;
        this.Q = j;
    }

    public final void b(boolean z) {
        this.W = z;
        this.S = null;
        if (hasMessages(0)) {
            this.V = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.V = true;
                this.P.g = true;
                Thread thread = this.U;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.X.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            mz5 mz5Var = this.R;
            mz5Var.getClass();
            ((mw5) mz5Var).a(this.P, elapsedRealtime, elapsedRealtime - this.Q, true);
            this.R = null;
        }
    }

    public final void c(long j) {
        boolean z;
        if (this.X.b == null) {
            z = true;
        } else {
            z = false;
        }
        tv2.I(z);
        rz5 rz5Var = this.X;
        rz5Var.b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
            return;
        }
        this.S = null;
        rz5Var.a.execute(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        long j;
        int i;
        nz5 nz5Var;
        ml1 ml1Var;
        int i2;
        if (this.W) {
            return;
        }
        int i3 = message.what;
        if (i3 == 0) {
            this.S = null;
            rz5 rz5Var = this.X;
            ExecutorService executorService = rz5Var.a;
            oz5 oz5Var = rz5Var.b;
            oz5Var.getClass();
            executorService.execute(oz5Var);
        } else if (i3 != 3) {
            this.X.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.Q;
            mz5 mz5Var = this.R;
            mz5Var.getClass();
            if (this.V) {
                ((mw5) mz5Var).a(this.P, elapsedRealtime, j2, false);
                return;
            }
            int i4 = message.what;
            if (i4 != 1) {
                if (i4 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.S = iOException;
                    int i5 = this.T + 1;
                    this.T = i5;
                    iw5 iw5Var = this.P;
                    mw5 mw5Var = (mw5) mz5Var;
                    fe5 fe5Var = iw5Var.b;
                    Uri uri = fe5Var.c;
                    xu5 xu5Var = new xu5(fe5Var.d);
                    int i6 = zn4.a;
                    if (!(iOException instanceof jy2) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof o85) && !(iOException instanceof qz5)) {
                        for (Throwable th = iOException; th != null; th = th.getCause()) {
                            if (!(th instanceof bw4) || ((bw4) th).P != 2008) {
                            }
                        }
                        j = Math.min((i5 - 1) * 1000, 5000);
                        boolean z = false;
                        if (j != -9223372036854775807L) {
                            nz5Var = rz5.e;
                        } else {
                            int r = mw5Var.r();
                            if (r > mw5Var.u0) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            if (!mw5Var.q0 && ((ml1Var = mw5Var.j0) == null || ml1Var.b() == -9223372036854775807L)) {
                                boolean z2 = mw5Var.g0;
                                if (z2 && !mw5Var.A()) {
                                    mw5Var.t0 = true;
                                    nz5Var = rz5.d;
                                } else {
                                    mw5Var.o0 = z2;
                                    mw5Var.r0 = 0L;
                                    mw5Var.u0 = 0;
                                    for (vw5 vw5Var : mw5Var.d0) {
                                        vw5Var.j(false);
                                    }
                                    iw5Var.f.a = 0L;
                                    iw5Var.i = 0L;
                                    iw5Var.h = true;
                                    iw5Var.l = false;
                                }
                            } else {
                                mw5Var.u0 = r;
                            }
                            nz5Var = new nz5(i, j);
                        }
                        int i7 = nz5Var.a;
                        z = (i7 != 0 || i7 == 1) ? true : true;
                        sv5 sv5Var = mw5Var.S;
                        long j3 = iw5Var.i;
                        long j4 = mw5Var.k0;
                        sv5Var.getClass();
                        sv5Var.d(xu5Var, new lv5(-1, null, sv5.f(j3), sv5.f(j4)), iOException, !z);
                        i2 = nz5Var.a;
                        if (i2 != 3) {
                            this.X.c = this.S;
                            return;
                        } else if (i2 != 2) {
                            if (i2 == 1) {
                                this.T = 1;
                            }
                            long j5 = nz5Var.b;
                            if (j5 == -9223372036854775807L) {
                                j5 = Math.min((this.T - 1) * 1000, 5000);
                            }
                            c(j5);
                            return;
                        } else {
                            return;
                        }
                    }
                    j = -9223372036854775807L;
                    boolean z3 = false;
                    if (j != -9223372036854775807L) {
                    }
                    int i72 = nz5Var.a;
                    if (i72 != 0) {
                    }
                    sv5 sv5Var2 = mw5Var.S;
                    long j32 = iw5Var.i;
                    long j42 = mw5Var.k0;
                    sv5Var2.getClass();
                    sv5Var2.d(xu5Var, new lv5(-1, null, sv5.f(j32), sv5.f(j42)), iOException, !z3);
                    i2 = nz5Var.a;
                    if (i2 != 3) {
                    }
                }
            } else {
                try {
                    ((mw5) mz5Var).e(this.P, elapsedRealtime, j2);
                } catch (RuntimeException e) {
                    lb4.b("LoadTask", "Unexpected exception handling load completed", e);
                    this.X.c = new qz5(e);
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object qz5Var;
        Message obtainMessage;
        boolean z;
        try {
            synchronized (this) {
                z = !this.V;
                this.U = Thread.currentThread();
            }
            if (z) {
                int i = zn4.a;
                Trace.beginSection("load:" + this.P.getClass().getSimpleName());
                try {
                    this.P.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.U = null;
                Thread.interrupted();
            }
            if (this.W) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.W) {
                return;
            }
            obtainMessage = obtainMessage(2, e);
            obtainMessage.sendToTarget();
        } catch (Error e2) {
            if (!this.W) {
                lb4.b("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(3, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (this.W) {
                return;
            }
            lb4.b("LoadTask", "Unexpected exception loading stream", e3);
            qz5Var = new qz5(e3);
            obtainMessage = obtainMessage(2, qz5Var);
            obtainMessage.sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.W) {
                return;
            }
            lb4.b("LoadTask", "OutOfMemory error loading stream", e4);
            qz5Var = new qz5(e4);
            obtainMessage = obtainMessage(2, qz5Var);
            obtainMessage.sendToTarget();
        }
    }
}