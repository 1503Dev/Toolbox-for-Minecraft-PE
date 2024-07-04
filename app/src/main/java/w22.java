package defpackage;

import android.content.DialogInterface;
import android.net.Uri;

/* renamed from: w22  reason: default package */
public final class w22 implements DialogInterface.OnClickListener {
    public final /* synthetic */ q32 P;

    public w22(q32 q32Var) {
        this.P = q32Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        cu5 cu5Var = jv5.A.c;
        cu5.m(this.P.P, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}