package defpackage;

import android.os.RemoteException;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: t64  reason: default package */
public final class t64 implements r6, ff3, le3, qd3, ae3, vj1, nd3, ze3, yd3, oi3 {
    public final wl4 X;
    public final AtomicReference P = new AtomicReference();
    public final AtomicReference Q = new AtomicReference();
    public final AtomicReference R = new AtomicReference();
    public final AtomicReference S = new AtomicReference();
    public final AtomicReference T = new AtomicReference();
    public final AtomicBoolean U = new AtomicBoolean(true);
    public final AtomicBoolean V = new AtomicBoolean(false);
    public final AtomicBoolean W = new AtomicBoolean(false);
    public final ArrayBlockingQueue Y = new ArrayBlockingQueue(((Integer) w82.d.c.a(x92.u7)).intValue());

    public t64(wl4 wl4Var) {
        this.X = wl4Var;
    }

    @Override // defpackage.vj1
    public final void J() {
        Object obj;
        if (!((Boolean) w82.d.c.a(x92.t8)).booleanValue() && (obj = this.P.get()) != null) {
            try {
                ((gf2) obj).d();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }

    @Override // defpackage.nd3
    public final void K() {
        Object obj = this.P.get();
        if (obj != null) {
            try {
                ((gf2) obj).j();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.T.get();
        if (obj2 != null) {
            try {
                ((q33) obj2).e();
            } catch (RemoteException e3) {
                sv2.i("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.T.get();
        if (obj3 != null) {
            try {
                ((q33) obj3).b();
            } catch (RemoteException e5) {
                sv2.i("#007 Could not call remote method.", e5);
            } catch (NullPointerException e6) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e6);
            }
        }
    }

    public final void a(px2 px2Var) {
        this.Q.set(px2Var);
        this.V.set(true);
        b();
    }

    public final void b() {
        if (this.V.get() && this.W.get()) {
            Iterator it = this.Y.iterator();
            while (it.hasNext()) {
                s45.i(this.Q, new om1(3, (Pair) it.next()));
            }
            this.Y.clear();
            this.U.set(false);
        }
    }

    @Override // defpackage.ze3
    public final void d(au5 au5Var) {
        s45.i(this.R, new zw5(6, au5Var));
    }

    @Override // defpackage.ff3
    public final void f(hi4 hi4Var) {
        this.U.set(true);
        this.W.set(false);
    }

    @Override // defpackage.yd3
    public final void g0(tz3 tz3Var) {
        s45.i(this.T, new z63(3, tz3Var));
    }

    @Override // defpackage.r6
    public final synchronized void i(String str, String str2) {
        if (this.U.get()) {
            if (!this.Y.offer(new Pair(str, str2))) {
                sv2.b("The queue for app events is full, dropping the new event.");
                wl4 wl4Var = this.X;
                if (wl4Var != null) {
                    vl4 b = vl4.b("dae_action");
                    b.a("dae_name", str);
                    b.a("dae_data", str2);
                    wl4Var.a(b);
                    return;
                }
            }
            return;
        }
        Object obj = this.Q.get();
        if (obj != null) {
            try {
                try {
                    ((px2) obj).A2(str, str2);
                } catch (NullPointerException e) {
                    sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e);
                }
            } catch (RemoteException e2) {
                sv2.i("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // defpackage.nd3
    public final void j() {
        s45.i(this.P, new kg4() { // from class: s64
            @Override // defpackage.kg4, defpackage.v64
            /* renamed from: e */
            public final void mo5e(Object obj) {
                ((gf2) obj).i();
            }
        });
        s45.i(this.T, g9.T);
    }

    @Override // defpackage.le3
    public final synchronized void k() {
        Object obj = this.P.get();
        if (obj != null) {
            try {
                ((gf2) obj).g();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.S.get();
        if (obj2 != null) {
            try {
                ((xh2) obj2).d();
            } catch (RemoteException e3) {
                sv2.i("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        this.W.set(true);
        b();
    }

    @Override // defpackage.nd3
    public final void l(cr2 cr2Var, String str, String str2) {
    }

    @Override // defpackage.nd3
    public final void m() {
    }

    @Override // defpackage.ae3
    public final void n() {
        s45.i(this.P, new kg4() { // from class: r64
            @Override // defpackage.kg4, defpackage.v64
            /* renamed from: e */
            public final void mo5e(Object obj) {
                ((gf2) obj).h();
            }
        });
    }

    @Override // defpackage.nd3
    public final void o() {
        Object obj = this.P.get();
        if (obj != null) {
            try {
                ((gf2) obj).f();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }

    @Override // defpackage.qd3
    public final void p(tz3 tz3Var) {
        s45.i(this.P, new jz1(4, tz3Var));
        Object obj = this.P.get();
        if (obj != null) {
            try {
                ((gf2) obj).y(tz3Var.P);
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.S.get();
        if (obj2 != null) {
            try {
                ((xh2) obj2).C0(tz3Var);
            } catch (RemoteException e3) {
                sv2.i("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        this.U.set(false);
        this.Y.clear();
    }

    @Override // defpackage.nd3
    public final void q() {
    }

    @Override // defpackage.ff3
    public final void q0(rq2 rq2Var) {
    }

    @Override // defpackage.oi3
    public final void s() {
        Object obj = this.P.get();
        if (obj != null) {
            try {
                ((gf2) obj).l();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }

    @Override // defpackage.oi3
    public final void w() {
        Object obj;
        if (((Boolean) w82.d.c.a(x92.t8)).booleanValue() && (obj = this.P.get()) != null) {
            try {
                ((gf2) obj).d();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.T.get();
        if (obj2 != null) {
            try {
                ((q33) obj2).c();
            } catch (RemoteException e3) {
                sv2.i("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
    }
}