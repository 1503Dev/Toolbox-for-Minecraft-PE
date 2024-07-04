package defpackage;

import android.os.Handler;

/* renamed from: po4  reason: default package */
public final class po4 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = so4.i;
        if (handler != null) {
            handler.post(so4.j);
            so4.i.postDelayed(so4.k, 200L);
        }
    }
}