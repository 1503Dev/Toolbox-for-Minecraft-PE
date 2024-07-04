package defpackage;

import android.view.View;
import io.mrarm.mctoolbox.ui.FullscreenTextEditDialog;

/* renamed from: ms  reason: default package */
public final /* synthetic */ class ms implements View.OnClickListener {
    public final /* synthetic */ int P;
    public final /* synthetic */ m5 Q;

    public /* synthetic */ ms(m5 m5Var, int i) {
        this.P = i;
        this.Q = m5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.P) {
            case 0:
                FullscreenTextEditDialog fullscreenTextEditDialog = (FullscreenTextEditDialog) this.Q;
                if (fullscreenTextEditDialog.R.a()) {
                    fullscreenTextEditDialog.dismiss();
                    return;
                }
                return;
            default:
                int i = bf0.U;
                ((bf0) this.Q).cancel();
                return;
        }
    }
}