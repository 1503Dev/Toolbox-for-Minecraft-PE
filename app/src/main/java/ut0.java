package defpackage;

import android.content.Context;
import io.mrarm.mctoolbox.bridge.b;

/* renamed from: ut0  reason: default package */
public final class ut0 {
    public final ka0 a;

    public ut0(Context context, pw pwVar, b bVar, iy0 iy0Var, tc0 tc0Var) {
        this.a = new ka0(context, pwVar, new tt0(bVar, tc0Var, iy0Var));
    }

    public final void a(boolean z) {
        ka0 ka0Var = this.a;
        ka0Var.f = z;
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = ka0Var.g;
            if (currentTimeMillis >= j) {
                ka0Var.b();
                return;
            } else {
                ka0Var.a(j - currentTimeMillis);
                return;
            }
        }
        ka0Var.b.removeCallbacks(ka0Var.e);
    }
}