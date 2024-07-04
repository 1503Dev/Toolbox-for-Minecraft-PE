package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: ru0  reason: default package */
public final class ru0 extends il {
    public Dialog Q0;
    public DialogInterface.OnCancelListener R0;
    public AlertDialog S0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.R0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}