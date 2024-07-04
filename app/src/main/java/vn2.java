package defpackage;

import android.content.DialogInterface;

/* renamed from: vn2  reason: default package */
public final class vn2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ wn2 P;

    public vn2(wn2 wn2Var) {
        this.P = wn2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.P.c("User canceled the download.");
    }
}