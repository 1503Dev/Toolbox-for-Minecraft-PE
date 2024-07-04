package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: s54  reason: default package */
public final class s54 implements ti4 {
    public final ld3 P;
    public final zd3 Q;
    public final qi3 R;
    public final ji3 S;
    public final j73 T;
    public final AtomicBoolean U = new AtomicBoolean(false);

    public s54(ld3 ld3Var, zd3 zd3Var, qi3 qi3Var, ji3 ji3Var, j73 j73Var) {
        this.P = ld3Var;
        this.Q = zd3Var;
        this.R = qi3Var;
        this.S = ji3Var;
        this.T = j73Var;
    }

    @Override // defpackage.ti4
    public final void c() {
        if (this.U.get()) {
            this.P.J();
        }
    }

    @Override // defpackage.ti4
    public final void d() {
        if (this.U.get()) {
            this.Q.a();
            qi3 qi3Var = this.R;
            synchronized (qi3Var) {
                qi3Var.R0(pi3.P);
            }
        }
    }

    @Override // defpackage.ti4
    public final synchronized void g(View view) {
        if (this.U.compareAndSet(false, true)) {
            this.T.n();
            this.S.S0(view);
        }
    }
}