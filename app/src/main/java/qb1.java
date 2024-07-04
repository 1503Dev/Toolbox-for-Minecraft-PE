package defpackage;

import android.app.AlertDialog;

/* renamed from: qb1  reason: default package */
public final class qb1 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        ad1 h = ga1.h();
        if (h.e == null) {
            h.e = new ie1();
        }
        ie1 ie1Var = h.e;
        AlertDialog alertDialog = ie1Var.b;
        if (alertDialog != null) {
            alertDialog.dismiss();
            ie1Var.b = null;
        }
    }
}