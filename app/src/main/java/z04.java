package defpackage;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: z04  reason: default package */
public final class z04 extends TimerTask {
    public final /* synthetic */ AlertDialog P;
    public final /* synthetic */ Timer Q;
    public final /* synthetic */ qn5 R;

    public z04(AlertDialog alertDialog, Timer timer, qn5 qn5Var) {
        this.P = alertDialog;
        this.Q = timer;
        this.R = qn5Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.P.dismiss();
        this.Q.cancel();
        qn5 qn5Var = this.R;
        if (qn5Var != null) {
            qn5Var.c();
        }
    }
}