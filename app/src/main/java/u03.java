package defpackage;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: u03  reason: default package */
public final class u03 implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsPromptResult P;

    public u03(JsPromptResult jsPromptResult) {
        this.P = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.P.cancel();
    }
}