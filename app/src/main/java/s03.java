package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: s03  reason: default package */
public final class s03 implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsResult P;

    public s03(JsResult jsResult) {
        this.P = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.P.confirm();
    }
}