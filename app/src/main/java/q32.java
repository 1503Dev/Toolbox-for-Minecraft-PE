package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: q32  reason: default package */
public final class q32 implements Runnable {
    public final /* synthetic */ Context P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ boolean R;
    public final /* synthetic */ boolean S;

    public q32(Context context, String str, boolean z, boolean z2) {
        this.P = context;
        this.Q = str;
        this.R = z;
        this.S = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        cu5 cu5Var = jv5.A.c;
        AlertDialog.Builder e = cu5.e(this.P);
        e.setMessage(this.Q);
        if (this.R) {
            str = "Error";
        } else {
            str = "Info";
        }
        e.setTitle(str);
        if (this.S) {
            e.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            e.setPositiveButton("Learn More", new w22(this));
            e.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        e.create().show();
    }
}