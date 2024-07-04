package defpackage;

import android.view.View;
import io.mrarm.mctoolbox.ui.a;
import io.mrarm.mctoolbox.ui.d;

/* renamed from: ee  reason: default package */
public final /* synthetic */ class ee implements View.OnClickListener {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ ee(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.P) {
            case 0:
                ((ie) this.Q).dismiss();
                return;
            case 1:
                String[] strArr = a.U;
                ((a) this.Q).dismiss();
                return;
            default:
                ((d) this.Q).q.H(false);
                return;
        }
    }
}