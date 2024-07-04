package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mh4  reason: default package */
public final class mh4 implements sb0, le3, qd3, nd3, yd3, ze3, sg4, oi3 {
    public final tj4 P;
    public final AtomicReference Q = new AtomicReference();
    public final AtomicReference R = new AtomicReference();
    public final AtomicReference S = new AtomicReference();
    public final AtomicReference T = new AtomicReference();
    public final AtomicReference U = new AtomicReference();
    public final AtomicReference V = new AtomicReference();
    public final AtomicReference W = new AtomicReference();

    public mh4(tj4 tj4Var) {
        this.P = tj4Var;
    }

    @Override // defpackage.nd3
    public final void K() {
        Object obj = this.S.get();
        if (obj != null) {
            try {
                ((zr2) obj).j();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.T.get();
        if (obj2 != null) {
            try {
                ((gr2) obj2).j();
            } catch (RemoteException e3) {
                sv2.i("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.S.get();
        if (obj3 != null) {
            try {
                ((zr2) obj3).e();
            } catch (RemoteException e5) {
                sv2.i("#007 Could not call remote method.", e5);
            } catch (NullPointerException e6) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e6);
            }
        }
    }

    @Override // defpackage.sb0
    public final void a() {
        s45.i(this.Q, new kg4() { // from class: jh4
            @Override // defpackage.kg4, defpackage.v64
            /* renamed from: e */
            public final void mo5e(Object obj) {
                ((sb0) obj).a();
            }
        });
    }

    @Override // defpackage.ze3
    public final void d(au5 au5Var) {
        s45.i(this.W, new wr1(4, au5Var));
    }

    @Override // defpackage.sg4
    public final void e(sg4 sg4Var) {
        throw null;
    }

    @Override // defpackage.yd3
    public final void g0(tz3 tz3Var) {
        s45.i(this.S, new ee4(8, tz3Var));
        s45.i(this.S, new vi2(1, tz3Var));
    }

    @Override // defpackage.nd3
    public final void j() {
        wr1 wr1Var = this.P.a;
        if (wr1Var != null) {
            pk4 pk4Var = (pk4) wr1Var.Q;
            synchronized (pk4Var) {
                pk4Var.e = 1;
                pk4Var.a();
            }
        }
        Object obj = this.S.get();
        if (obj != null) {
            try {
                ((zr2) obj).h();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.T.get();
        if (obj2 != null) {
            try {
                ((gr2) obj2).e();
            } catch (RemoteException e3) {
                sv2.i("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
    }

    @Override // defpackage.le3
    public final void k() {
        Object obj = this.R.get();
        if (obj != null) {
            try {
                ((ds2) obj).h();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.T.get();
        if (obj2 != null) {
            try {
                ((gr2) obj2).g();
            } catch (RemoteException e3) {
                sv2.i("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
    }

    @Override // defpackage.nd3
    public final void l(cr2 cr2Var, String str, String str2) {
        s45.i(this.S, new s82(7, cr2Var));
        Object obj = this.U.get();
        if (obj != null) {
            try {
                es2 es2Var = (es2) obj;
                ns2 ns2Var = new ns2(((ar2) cr2Var).P, ((ar2) cr2Var).Q);
                Parcel A = es2Var.A();
                k22.e(A, ns2Var);
                A.writeString(str);
                A.writeString(str2);
                es2Var.c0(A, 2);
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.T.get();
        if (obj2 != null) {
            try {
                ((gr2) obj2).E1(cr2Var);
            } catch (RemoteException e3) {
                sv2.i("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.V.get();
        if (obj3 != null) {
            try {
                dr2 dr2Var = (dr2) obj3;
                Parcel A2 = dr2Var.A();
                k22.e(A2, cr2Var);
                A2.writeString(str);
                A2.writeString(str2);
                dr2Var.c0(A2, 2);
            } catch (RemoteException e5) {
                sv2.i("#007 Could not call remote method.", e5);
            } catch (NullPointerException e6) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e6);
            }
        }
    }

    @Override // defpackage.nd3
    public final void m() {
        Object obj = this.T.get();
        if (obj != null) {
            try {
                ((gr2) obj).n();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }

    @Override // defpackage.nd3
    public final void o() {
        Object obj = this.T.get();
        if (obj != null) {
            try {
                ((gr2) obj).f();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }

    @Override // defpackage.qd3
    public final void p(tz3 tz3Var) {
        int i = tz3Var.P;
        Object obj = this.R.get();
        if (obj != null) {
            try {
                ((ds2) obj).p(tz3Var);
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.R.get();
        if (obj2 != null) {
            try {
                ((ds2) obj2).y(i);
            } catch (RemoteException e3) {
                sv2.i("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.T.get();
        if (obj3 != null) {
            try {
                ((gr2) obj3).v(i);
            } catch (RemoteException e5) {
                sv2.i("#007 Could not call remote method.", e5);
            } catch (NullPointerException e6) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e6);
            }
        }
    }

    @Override // defpackage.nd3
    public final void q() {
        Object obj = this.T.get();
        if (obj != null) {
            try {
                ((gr2) obj).l();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }

    @Override // defpackage.oi3
    public final void s() {
    }

    @Override // defpackage.oi3
    public final void w() {
        s45.i(this.S, zw4.T);
    }
}