package defpackage;

import android.graphics.Bitmap;
import defpackage.q7;

/* renamed from: p7  reason: default package */
public final class p7 implements Runnable {
    public final /* synthetic */ Bitmap P;
    public final /* synthetic */ q7.a.C0046a Q;

    public p7(q7.a.C0046a c0046a, Bitmap bitmap) {
        this.Q = c0046a;
        this.P = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q7.c cVar = q7.a.this.P.a.get();
        if (cVar != null) {
            cVar.a(this.P);
        }
    }
}