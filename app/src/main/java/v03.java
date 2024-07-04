package defpackage;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: v03  reason: default package */
public final class v03 implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsPromptResult P;
    public final /* synthetic */ EditText Q;

    public v03(JsPromptResult jsPromptResult, EditText editText) {
        this.P = jsPromptResult;
        this.Q = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.P.confirm(this.Q.getText().toString());
    }
}