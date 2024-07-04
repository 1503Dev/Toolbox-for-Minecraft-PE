package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import defpackage.fe0;
import defpackage.tl0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends tl0> extends fe0<R> {
    public final Object a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList<fe0.a> c = new ArrayList<>();
    public R d;
    public boolean e;
    @KeepName
    private cj1 mResultGuardian;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a<R extends tl0> extends aj1 {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i);
                    Log.wtf("BasePendingResult", sb.toString(), new Exception());
                    return;
                }
                BasePendingResult basePendingResult = (BasePendingResult) message.obj;
                Status status = Status.U;
                synchronized (basePendingResult.a) {
                    if (!basePendingResult.b()) {
                        basePendingResult.c(basePendingResult.a());
                        basePendingResult.e = true;
                    }
                }
                return;
            }
            Pair pair = (Pair) message.obj;
            ul0 ul0Var = (ul0) pair.first;
            tl0 tl0Var = (tl0) pair.second;
            try {
                ul0Var.a();
            } catch (RuntimeException e) {
                BasePendingResult.e(tl0Var);
                throw e;
            }
        }
    }

    static {
        new bj1();
    }

    @Deprecated
    public BasePendingResult() {
        new AtomicReference();
        new a(Looper.getMainLooper());
        new WeakReference(null);
    }

    public static void e(tl0 tl0Var) {
        if (tl0Var instanceof qk0) {
            try {
                ((qk0) tl0Var).b();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(tl0Var)), e);
            }
        }
    }

    public abstract tl0 a();

    public final boolean b() {
        return this.b.getCount() == 0;
    }

    public final void c(R r) {
        synchronized (this.a) {
            if (this.e) {
                e(r);
                return;
            }
            b();
            uf0.h("Results have already been set", !b());
            uf0.h("Result has already been consumed", !false);
            d(r);
        }
    }

    public final void d(R r) {
        this.d = r;
        r.a();
        this.b.countDown();
        if (this.d instanceof qk0) {
            this.mResultGuardian = new cj1(this);
        }
        ArrayList<fe0.a> arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
        this.c.clear();
    }
}