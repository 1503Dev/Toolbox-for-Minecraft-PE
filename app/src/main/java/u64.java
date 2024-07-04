package defpackage;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: u64  reason: default package */
public final class u64 implements ze3 {
    public final AtomicReference P = new AtomicReference();

    @Override // defpackage.ze3
    public final void d(au5 au5Var) {
        Object obj = this.P.get();
        if (obj != null) {
            try {
                ((yk3) obj).v1(au5Var);
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                sv2.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }
}