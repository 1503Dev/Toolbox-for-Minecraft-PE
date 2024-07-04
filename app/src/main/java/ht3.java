package defpackage;

import android.os.SystemClock;
import javax.annotation.Nullable;

/* renamed from: ht3  reason: default package */
public final class ht3 implements wy4 {
    public final /* synthetic */ jt3 P;

    public ht3(jt3 jt3Var) {
        this.P = jt3Var;
    }

    @Override // defpackage.wy4
    public final void f(@Nullable Object obj) {
        String str = (String) obj;
        synchronized (this) {
            jt3 jt3Var = this.P;
            jt3Var.c = true;
            jv5.A.j.getClass();
            jt3Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - this.P.d), "", true);
            this.P.i.execute(new t14(3, this, str));
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        synchronized (this) {
            jt3 jt3Var = this.P;
            jt3Var.c = true;
            jv5.A.j.getClass();
            jt3Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - this.P.d), "Internal Error.", false);
            this.P.e.c(new Exception());
        }
    }
}