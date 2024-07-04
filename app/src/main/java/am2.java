package defpackage;

import android.os.RemoteException;

/* renamed from: am2  reason: default package */
public final class am2 implements n50, p50, r50 {
    public final cl2 a;
    public bk1 b;
    public g70 c;

    public am2(cl2 cl2Var) {
        this.a = cl2Var;
    }

    public final void a() {
        uf0.b("#008 Must be called on the main UI thread.");
        sv2.b("Adapter called onAdFailedToLoad with error 0.");
        try {
            this.a.v(0);
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    public final void b(n2 n2Var) {
        uf0.b("#008 Must be called on the main UI thread.");
        int i = n2Var.a;
        String str = n2Var.b;
        String str2 = n2Var.c;
        sv2.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + i + ". ErrorMessage: " + str + ". ErrorDomain: " + str2);
        try {
            this.a.P2(n2Var.a());
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    public final void c(n2 n2Var) {
        uf0.b("#008 Must be called on the main UI thread.");
        int i = n2Var.a;
        String str = n2Var.b;
        String str2 = n2Var.c;
        sv2.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + i + ". ErrorMessage: " + str + ". ErrorDomain: " + str2);
        try {
            this.a.P2(n2Var.a());
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    public final void d(n2 n2Var) {
        uf0.b("#008 Must be called on the main UI thread.");
        int i = n2Var.a;
        String str = n2Var.b;
        String str2 = n2Var.c;
        sv2.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + i + ". ErrorMessage: " + str + ". ErrorDomain: " + str2);
        try {
            this.a.P2(n2Var.a());
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }
}