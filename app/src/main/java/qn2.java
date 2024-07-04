package defpackage;

import android.content.DialogInterface;

/* renamed from: qn2  reason: default package */
public final class qn2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ rn2 P;

    public qn2(rn2 rn2Var) {
        this.P = rn2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.P.c("Operation denied by user.");
    }
}