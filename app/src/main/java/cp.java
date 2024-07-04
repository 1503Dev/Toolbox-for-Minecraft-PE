package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: cp  reason: default package */
public final class cp extends DialogFragment {
    public Dialog P;
    public DialogInterface.OnCancelListener Q;
    public AlertDialog R;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.Q;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.P;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.R == null) {
                Activity activity = getActivity();
                uf0.f(activity);
                this.R = new AlertDialog.Builder(activity).create();
            }
            return this.R;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}