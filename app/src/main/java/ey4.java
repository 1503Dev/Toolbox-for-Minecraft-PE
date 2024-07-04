package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* renamed from: ey4  reason: default package */
public abstract class ey4 extends iy4 {
    public static final Logger d0 = Logger.getLogger(ey4.class.getName());
    @CheckForNull
    public iv4 a0;
    public final boolean b0;
    public final boolean c0;

    public ey4(nv4 nv4Var, boolean z, boolean z2) {
        super(nv4Var.size());
        this.a0 = nv4Var;
        this.b0 = z;
        this.c0 = z2;
    }

    @Override // defpackage.vx4
    @CheckForNull
    public final String f() {
        iv4 iv4Var = this.a0;
        return iv4Var != null ? "futures=".concat(iv4Var.toString()) : super.f();
    }

    @Override // defpackage.vx4
    public final void g() {
        boolean z;
        iv4 iv4Var = this.a0;
        boolean z2 = true;
        x(1);
        boolean z3 = this.P instanceof lx4;
        if (iv4Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (z3 & z) {
            Object obj = this.P;
            z2 = ((obj instanceof lx4) && ((lx4) obj).a) ? false : false;
            cx4 it = iv4Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(z2);
            }
        }
    }

    public final void r(@CheckForNull iv4 iv4Var) {
        boolean z;
        Throwable e;
        int e2 = iy4.Y.e(this);
        int i = 0;
        if (e2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        gt4.g("Less than 0 remaining futures", z);
        if (e2 == 0) {
            if (iv4Var != null) {
                cx4 it = iv4Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            u(i, zw4.H(future));
                        } catch (Error e3) {
                            e = e3;
                            s(e);
                            i++;
                        } catch (RuntimeException e4) {
                            e = e4;
                            s(e);
                            i++;
                        } catch (ExecutionException e5) {
                            e = e5.getCause();
                            s(e);
                            i++;
                        }
                    }
                    i++;
                }
            }
            this.W = null;
            v();
            x(2);
        }
    }

    public final void s(Throwable th) {
        String str;
        boolean z;
        String str2;
        th.getClass();
        if (this.b0 && !i(th)) {
            Set<Throwable> set = this.W;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                t(newSetFromMap);
                iy4.Y.m(this, newSetFromMap);
                set = this.W;
                set.getClass();
            }
            Throwable th2 = th;
            while (true) {
                if (th2 != null) {
                    if (!set.add(th2)) {
                        z = false;
                        break;
                    }
                    th2 = th2.getCause();
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                if (true != (th instanceof Error)) {
                    str2 = "Got more than one input Future failure. Logging failures after the first";
                } else {
                    str2 = "Input Future failed with Error";
                }
                d0.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str2, th);
                return;
            }
        }
        boolean z2 = th instanceof Error;
        if (z2) {
            if (true != z2) {
                str = "Got more than one input Future failure. Logging failures after the first";
            } else {
                str = "Input Future failed with Error";
            }
            d0.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th);
        }
    }

    public final void t(Set set) {
        set.getClass();
        if (!(this.P instanceof lx4)) {
            Throwable c = c();
            c.getClass();
            while (c != null && set.add(c)) {
                c = c.getCause();
            }
        }
    }

    public abstract void u(int i, Object obj);

    public abstract void v();

    public final void w() {
        py4 py4Var = py4.P;
        iv4 iv4Var = this.a0;
        iv4Var.getClass();
        if (iv4Var.isEmpty()) {
            v();
        } else if (!this.b0) {
            h74 h74Var = new h74(1, this, this.c0 ? this.a0 : null);
            cx4 it = this.a0.iterator();
            while (it.hasNext()) {
                ((dz4) it.next()).b(h74Var, py4Var);
            }
        } else {
            cx4 it2 = this.a0.iterator();
            final int i = 0;
            while (it2.hasNext()) {
                final dz4 dz4Var = (dz4) it2.next();
                dz4Var.b(new Runnable() { // from class: dy4
                    @Override // java.lang.Runnable
                    public final void run() {
                        Throwable e;
                        ey4 ey4Var = ey4.this;
                        dz4 dz4Var2 = dz4Var;
                        int i2 = i;
                        ey4Var.getClass();
                        try {
                            if (dz4Var2.isCancelled()) {
                                ey4Var.a0 = null;
                                ey4Var.cancel(false);
                            } else {
                                try {
                                    ey4Var.u(i2, zw4.H(dz4Var2));
                                } catch (Error e2) {
                                    e = e2;
                                    ey4Var.s(e);
                                } catch (RuntimeException e3) {
                                    e = e3;
                                    ey4Var.s(e);
                                } catch (ExecutionException e4) {
                                    e = e4.getCause();
                                    ey4Var.s(e);
                                }
                            }
                        } finally {
                            ey4Var.r(null);
                        }
                    }
                }, py4Var);
                i++;
            }
        }
    }

    public void x(int i) {
        this.a0 = null;
    }
}