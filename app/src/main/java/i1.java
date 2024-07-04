package defpackage;

import android.app.Activity;

/* renamed from: i1  reason: default package */
public final class i1 implements Runnable {
    public final /* synthetic */ Activity P;

    public i1(Activity activity) {
        this.P = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.P.isFinishing() || o1.a(this.P)) {
            return;
        }
        this.P.recreate();
    }
}