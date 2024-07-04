package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: q03  reason: default package */
public final class q03 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ JsResult P;

    public q03(JsResult jsResult) {
        this.P = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.P.cancel();
    }
}