package defpackage;

import android.os.RemoteException;
import java.util.Map;

/* renamed from: sn5  reason: default package */
public final /* synthetic */ class sn5 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ sn5(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        switch (this.P) {
            case 0:
                dk1 dk1Var = (dk1) this.Q;
                dk1Var.getClass();
                kp3 kp3Var = ((kp3[]) this.R)[0];
                if (kp3Var != null) {
                    nj4 nj4Var = dk1Var.T;
                    zy4 C = zw4.C(kp3Var);
                    synchronized (nj4Var) {
                        nj4Var.a.addFirst(C);
                    }
                    return;
                }
                return;
            case 1:
                ((q13) this.Q).P.a("pubVideoCmd", (Map) this.R);
                return;
            default:
                n93 n93Var = (n93) this.Q;
                Runnable runnable2 = (Runnable) this.R;
                n93Var.getClass();
                try {
                    if (!n93Var.i.n2(new va0(runnable2)) && (runnable = (Runnable) ((m93) runnable2).P.getAndSet(null)) != null) {
                        runnable.run();
                        return;
                    }
                    return;
                } catch (RemoteException unused) {
                    Runnable runnable3 = (Runnable) ((m93) runnable2).P.getAndSet(null);
                    if (runnable3 != null) {
                        runnable3.run();
                        return;
                    }
                    return;
                }
        }
    }
}