package defpackage;

import android.view.View;
import defpackage.vw;
import io.mrarm.mctoolbox.ui.AppBottomSheetDialog;

/* renamed from: ge  reason: default package */
public final /* synthetic */ class ge implements View.OnClickListener {
    public final /* synthetic */ int P;
    public final /* synthetic */ AppBottomSheetDialog Q;

    public /* synthetic */ ge(AppBottomSheetDialog appBottomSheetDialog, int i) {
        this.P = i;
        this.Q = appBottomSheetDialog;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [he] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.P) {
            case 0:
                final ie ieVar = (ie) this.Q;
                ieVar.getClass();
                new yw(ieVar.getContext(), new vw.a() { // from class: he
                    @Override // defpackage.vw.a
                    public final void a(int i) {
                        ie.this.U.V(i);
                    }
                }).show();
                return;
            default:
                int i = o70.X;
                ((o70) this.Q).dismiss();
                return;
        }
    }
}