package defpackage;

import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* renamed from: jx4  reason: default package */
public abstract class jx4 extends ry4 implements Runnable {
    @CheckForNull
    public dz4 W;
    @CheckForNull
    public Class X;
    @CheckForNull
    public Object Y;

    public jx4(dz4 dz4Var, Class cls, Object obj) {
        dz4Var.getClass();
        this.W = dz4Var;
        this.X = cls;
        this.Y = obj;
    }

    @Override // defpackage.vx4
    @CheckForNull
    public final String f() {
        String str;
        dz4 dz4Var = this.W;
        Class cls = this.X;
        Object obj = this.Y;
        String f = super.f();
        if (dz4Var != null) {
            str = ij.c("inputFuture=[", dz4Var.toString(), "], ");
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            StringBuilder b = sd1.b(str, "exceptionType=[", cls.toString(), "], fallback=[", obj.toString());
            b.append("]");
            return b.toString();
        } else if (f != null) {
            return str.concat(f);
        } else {
            return null;
        }
    }

    @Override // defpackage.vx4
    public final void g() {
        m(this.W);
        this.W = null;
        this.X = null;
        this.Y = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2;
        Throwable e;
        Object obj;
        dz4 dz4Var = this.W;
        Class cls = this.X;
        Object obj2 = this.Y;
        boolean z3 = false;
        if (dz4Var == null) {
            z = true;
        } else {
            z = false;
        }
        if (cls == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z | z2;
        if (obj2 == null) {
            z3 = true;
        }
        if (!(z3 | z4) && !(this.P instanceof lx4)) {
            this.W = null;
            try {
                if (dz4Var instanceof tz4) {
                    e = ((tz4) dz4Var).c();
                } else {
                    e = null;
                }
            } catch (Error e2) {
                e = e2;
            } catch (RuntimeException e3) {
                e = e3;
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause == null) {
                    cause = new NullPointerException("Future type " + String.valueOf(dz4Var.getClass()) + " threw " + String.valueOf(e4.getClass()) + " without a cause");
                }
                e = cause;
            }
            if (e == null) {
                obj = zw4.H(dz4Var);
                if (e != null) {
                    h(obj);
                    return;
                } else if (cls.isInstance(e)) {
                    try {
                        Object s = s(obj2, e);
                        this.X = null;
                        this.Y = null;
                        t(s);
                        return;
                    } catch (Throwable th) {
                        try {
                            if (th instanceof InterruptedException) {
                                Thread.currentThread().interrupt();
                            }
                            i(th);
                            return;
                        } finally {
                            this.X = null;
                            this.Y = null;
                        }
                    }
                } else {
                    n(dz4Var);
                    return;
                }
            }
            obj = null;
            if (e != null) {
            }
        }
    }

    public abstract Object s(Object obj, Throwable th);

    public abstract void t(Object obj);
}