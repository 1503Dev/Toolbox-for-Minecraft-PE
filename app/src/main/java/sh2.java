package defpackage;

import android.os.DeadObjectException;
import defpackage.k9;

/* renamed from: sh2  reason: default package */
public final class sh2 implements k9.a {
    public final /* synthetic */ bx2 a;
    public final /* synthetic */ uh2 b;

    public sh2(uh2 uh2Var, bx2 bx2Var) {
        this.b = uh2Var;
        this.a = bx2Var;
    }

    @Override // defpackage.k9.a
    public final void A(int i) {
        this.a.c(new RuntimeException(k6.a("onConnectionSuspended: ", i)));
    }

    @Override // defpackage.k9.a
    public final void c0() {
        try {
            this.a.a((oh2) this.b.a.v());
        } catch (DeadObjectException e) {
            this.a.c(e);
        }
    }
}