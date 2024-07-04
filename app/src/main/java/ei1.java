package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: ei1  reason: default package */
public final class ei1<ResultT> extends fh1 {
    public final zv0<Object, ResultT> b;
    public final aw0<ResultT> c;
    public final ga1 d;

    public ei1(int i, th1 th1Var, aw0 aw0Var, ga1 ga1Var) {
        super(i);
        this.c = aw0Var;
        this.b = th1Var;
        this.d = ga1Var;
        if (i == 2 && th1Var.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.li1
    public final void a(Status status) {
        boolean z;
        Exception m4Var;
        aw0<ResultT> aw0Var = this.c;
        this.d.getClass();
        if (status.S != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m4Var = new cl0(status);
        } else {
            m4Var = new m4(status);
        }
        aw0Var.a(m4Var);
    }

    @Override // defpackage.li1
    public final void b(RuntimeException runtimeException) {
        this.c.a(runtimeException);
    }

    @Override // defpackage.li1
    public final void c(zg1<?> zg1Var) {
        try {
            zv0<Object, ResultT> zv0Var = this.b;
            ((th1) zv0Var).d.a.g(zg1Var.Q, this.c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(li1.e(e2));
        } catch (RuntimeException e3) {
            this.c.a(e3);
        }
    }

    @Override // defpackage.li1
    public final void d(kg1 kg1Var, boolean z) {
        aw0<ResultT> aw0Var = this.c;
        kg1Var.b.put(aw0Var, Boolean.valueOf(z));
        aw0Var.a.b(new jg1(kg1Var, (aw0) aw0Var));
    }

    @Override // defpackage.fh1
    public final boolean f(zg1<?> zg1Var) {
        return this.b.b;
    }

    @Override // defpackage.fh1
    public final wp[] g(zg1<?> zg1Var) {
        return this.b.a;
    }
}