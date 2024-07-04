package defpackage;

import java.util.concurrent.Executor;

/* renamed from: x24  reason: default package */
public final class x24 extends or2 implements je3 {
    public pr2 P;
    public n54 Q;
    public xi3 R;

    @Override // defpackage.pr2
    public final synchronized void D2() {
        pr2 pr2Var = this.P;
        if (pr2Var != null) {
            ((g54) pr2Var).R.c();
        }
    }

    @Override // defpackage.pr2
    public final synchronized void H1(hw hwVar, qr2 qr2Var) {
        pr2 pr2Var = this.P;
        if (pr2Var != null) {
            ((g54) pr2Var).S.E(qr2Var);
        }
    }

    @Override // defpackage.pr2
    public final synchronized void J0(hw hwVar) {
        n54 n54Var = this.Q;
        if (n54Var != null) {
            synchronized (n54Var) {
                n54Var.c.a(null);
            }
        }
    }

    @Override // defpackage.pr2
    public final synchronized void L2(hw hwVar) {
        pr2 pr2Var = this.P;
        if (pr2Var != null) {
            ((g54) pr2Var).S.d();
        }
    }

    @Override // defpackage.pr2
    public final synchronized void O2() {
        xi3 xi3Var = this.R;
        if (xi3Var != null) {
            sv2.g("Fail to initialize adapter ".concat(String.valueOf(((f54) xi3Var).c.a)));
        }
    }

    @Override // defpackage.pr2
    public final synchronized void Y1(hw hwVar) {
        pr2 pr2Var = this.P;
        if (pr2Var != null) {
            ((g54) pr2Var).R.R0(dt4.S);
        }
    }

    @Override // defpackage.pr2
    public final synchronized void a0(hw hwVar) {
        pr2 pr2Var = this.P;
        if (pr2Var != null) {
            ((g54) pr2Var).P.c();
        }
    }

    @Override // defpackage.pr2
    public final synchronized void b0(hw hwVar, int i) {
        n54 n54Var = this.Q;
        if (n54Var != null) {
            n54Var.a(i);
        }
    }

    @Override // defpackage.je3
    public final synchronized void e4(n54 n54Var) {
        this.Q = n54Var;
    }

    @Override // defpackage.pr2
    public final synchronized void o3(hw hwVar) {
        pr2 pr2Var = this.P;
        if (pr2Var != null) {
            pr2Var.o3(hwVar);
        }
    }

    @Override // defpackage.pr2
    public final synchronized void y3(hw hwVar) {
        xi3 xi3Var = this.R;
        if (xi3Var != null) {
            Executor executor = ((f54) xi3Var).d.b;
            final hi4 hi4Var = ((f54) xi3Var).a;
            final yh4 yh4Var = ((f54) xi3Var).b;
            final h14 h14Var = ((f54) xi3Var).c;
            final f54 f54Var = (f54) xi3Var;
            executor.execute(new Runnable() { // from class: e54
                @Override // java.lang.Runnable
                public final void run() {
                    f54 f54Var2 = f54.this;
                    hi4 hi4Var2 = hi4Var;
                    yh4 yh4Var2 = yh4Var;
                    h14 h14Var2 = h14Var;
                    h54 h54Var = f54Var2.d;
                    h54.c(hi4Var2, yh4Var2, h14Var2);
                }
            });
        }
    }

    @Override // defpackage.pr2
    public final synchronized void zze(hw hwVar) {
        pr2 pr2Var = this.P;
        if (pr2Var != null) {
            ((g54) pr2Var).Q.J();
        }
    }
}