package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: yh1  reason: default package */
public abstract class yh1<T> extends fh1 {
    public final aw0<T> b;

    public yh1(aw0 aw0Var) {
        super(4);
        this.b = aw0Var;
    }

    @Override // defpackage.li1
    public final void a(Status status) {
        this.b.a(new m4(status));
    }

    @Override // defpackage.li1
    public final void b(RuntimeException runtimeException) {
        this.b.a(runtimeException);
    }

    @Override // defpackage.li1
    public final void c(zg1<?> zg1Var) {
        try {
            h(zg1Var);
        } catch (DeadObjectException e) {
            a(li1.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(li1.e(e2));
        } catch (RuntimeException e3) {
            this.b.a(e3);
        }
    }

    public abstract void h(zg1<?> zg1Var);
}