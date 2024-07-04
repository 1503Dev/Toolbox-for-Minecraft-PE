package defpackage;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: if4  reason: default package */
public final class if4 implements qd3, ve3, sg4, zp5, ze3, yd3, oi3 {
    public final tj4 P;
    public final AtomicReference Q = new AtomicReference();
    public final AtomicReference R = new AtomicReference();
    public final AtomicReference S = new AtomicReference();
    public final AtomicReference T = new AtomicReference();
    public final AtomicReference U = new AtomicReference();
    public final AtomicReference V = new AtomicReference();
    public if4 W = null;

    public if4(tj4 tj4Var) {
        this.P = tj4Var;
    }

    @Override // defpackage.zp5
    public final void A(final int i) {
        if4 if4Var = this.W;
        if (if4Var != null) {
            if4Var.A(i);
        } else {
            s45.i(this.U, new kg4() { // from class: ef4
                @Override // defpackage.kg4, defpackage.v64
                /* renamed from: e */
                public final void mo5e(Object obj) {
                    ((zp5) obj).A(i);
                }
            });
        }
    }

    @Override // defpackage.zp5
    public final void Z() {
    }

    public final void a() {
        if4 if4Var = this.W;
        if (if4Var != null) {
            if4Var.a();
            return;
        }
        wr1 wr1Var = this.P.a;
        if (wr1Var != null) {
            pk4 pk4Var = (pk4) wr1Var.Q;
            synchronized (pk4Var) {
                pk4Var.e = 1;
                pk4Var.a();
            }
        }
        Object obj = this.R.get();
        if (obj != null) {
            try {
                ((j42) obj).a();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.S.get();
        if (obj2 != null) {
            try {
                ((m42) obj2).d();
            } catch (RemoteException e3) {
                sv2.i("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
    }

    @Override // defpackage.zp5
    public final void b() {
        if4 if4Var = this.W;
        if (if4Var != null) {
            if4Var.b();
        } else {
            s45.i(this.U, new kg4() { // from class: gf4
                @Override // defpackage.kg4, defpackage.v64
                /* renamed from: e */
                public final void mo5e(Object obj) {
                    ((zp5) obj).b();
                }
            });
        }
    }

    @Override // defpackage.zp5
    public final void c() {
        if4 if4Var = this.W;
        if (if4Var != null) {
            if4Var.c();
            return;
        }
        Object obj = this.U.get();
        if (obj != null) {
            try {
                ((zp5) obj).c();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.S.get();
        if (obj2 != null) {
            try {
                ((m42) obj2).e();
            } catch (RemoteException e3) {
                sv2.i("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.S.get();
        if (obj3 != null) {
            try {
                ((m42) obj3).b();
            } catch (RemoteException e5) {
                sv2.i("#007 Could not call remote method.", e5);
            } catch (NullPointerException e6) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e6);
            }
        }
    }

    @Override // defpackage.ze3
    public final void d(au5 au5Var) {
        if4 if4Var = this.W;
        if (if4Var != null) {
            if4Var.d(au5Var);
        } else {
            s45.i(this.V, new nj2(5, au5Var));
        }
    }

    @Override // defpackage.zp5
    public final void d3() {
    }

    @Override // defpackage.sg4
    public final void e(sg4 sg4Var) {
        this.W = (if4) sg4Var;
    }

    public final void f(d83 d83Var) {
        if4 if4Var = this.W;
        if (if4Var != null) {
            if4Var.f(d83Var);
            return;
        }
        Object obj = this.Q.get();
        if (obj != null) {
            try {
                ((i42) obj).d4(d83Var);
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }

    @Override // defpackage.yd3
    public final void g0(tz3 tz3Var) {
        if4 if4Var = this.W;
        if (if4Var != null) {
            if4Var.g0(tz3Var);
        } else {
            s45.i(this.S, new cz1(2, tz3Var));
        }
    }

    @Override // defpackage.ve3
    public final void h() {
        if4 if4Var = this.W;
        if (if4Var != null) {
            if4Var.h();
        } else {
            s45.i(this.T, new kg4() { // from class: hf4
                @Override // defpackage.kg4, defpackage.v64
                /* renamed from: e */
                public final void mo5e(Object obj) {
                    ((ve3) obj).h();
                }
            });
        }
    }

    @Override // defpackage.zp5
    public final void n3() {
        if4 if4Var = this.W;
        if (if4Var != null) {
            if4Var.n3();
        } else {
            s45.i(this.U, new kg4() { // from class: ff4
                @Override // defpackage.kg4, defpackage.v64
                /* renamed from: e */
                public final void mo5e(Object obj) {
                    ((zp5) obj).n3();
                }
            });
        }
    }

    @Override // defpackage.qd3
    public final void p(tz3 tz3Var) {
        if4 if4Var = this.W;
        if (if4Var != null) {
            if4Var.p(tz3Var);
            return;
        }
        s45.i(this.Q, new ud3(1, tz3Var));
        s45.i(this.Q, new gb3(2, tz3Var));
    }

    @Override // defpackage.oi3
    public final void s() {
    }

    @Override // defpackage.oi3
    public final void w() {
        if4 if4Var = this.W;
        if (if4Var != null) {
            if4Var.w();
            return;
        }
        Object obj = this.S.get();
        if (obj != null) {
            try {
                ((m42) obj).c();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }
}