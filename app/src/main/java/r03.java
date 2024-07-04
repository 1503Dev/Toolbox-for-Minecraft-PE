package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: r03  reason: default package */
public final class r03 implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsResult P;

    public r03(JsResult jsResult) {
        this.P = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.P.cancel();
    }
}