package defpackage;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: t03  reason: default package */
public final class t03 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ JsPromptResult P;

    public t03(JsPromptResult jsPromptResult) {
        this.P = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.P.cancel();
    }
}