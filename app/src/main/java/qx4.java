package defpackage;

import javax.annotation.CheckForNull;

/* renamed from: qx4  reason: default package */
public final class qx4 extends kx4 {
    @Override // defpackage.kx4
    public final nx4 a(vx4 vx4Var, nx4 nx4Var) {
        nx4 nx4Var2;
        synchronized (vx4Var) {
            nx4Var2 = vx4Var.Q;
            if (nx4Var2 != nx4Var) {
                vx4Var.Q = nx4Var;
            }
        }
        return nx4Var2;
    }

    @Override // defpackage.kx4
    public final ux4 b(vx4 vx4Var) {
        ux4 ux4Var;
        ux4 ux4Var2 = ux4.c;
        synchronized (vx4Var) {
            ux4Var = vx4Var.R;
            if (ux4Var != ux4Var2) {
                vx4Var.R = ux4Var2;
            }
        }
        return ux4Var;
    }

    @Override // defpackage.kx4
    public final void c(ux4 ux4Var, @CheckForNull ux4 ux4Var2) {
        ux4Var.b = ux4Var2;
    }

    @Override // defpackage.kx4
    public final void d(ux4 ux4Var, Thread thread) {
        ux4Var.a = thread;
    }

    @Override // defpackage.kx4
    public final boolean e(vx4 vx4Var, @CheckForNull nx4 nx4Var, nx4 nx4Var2) {
        synchronized (vx4Var) {
            if (vx4Var.Q == nx4Var) {
                vx4Var.Q = nx4Var2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.kx4
    public final boolean f(vx4 vx4Var, @CheckForNull Object obj, Object obj2) {
        synchronized (vx4Var) {
            if (vx4Var.P == obj) {
                vx4Var.P = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.kx4
    public final boolean g(vx4 vx4Var, @CheckForNull ux4 ux4Var, @CheckForNull ux4 ux4Var2) {
        synchronized (vx4Var) {
            if (vx4Var.R == ux4Var) {
                vx4Var.R = ux4Var2;
                return true;
            }
            return false;
        }
    }
}