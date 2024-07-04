package defpackage;

import android.view.View;

/* renamed from: nu  reason: default package */
public final /* synthetic */ class nu implements View.OnClickListener {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ nu(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.P) {
            case 0:
                ((ou) this.Q).dismiss();
                return;
            case 1:
                int i = hr0.U;
                ((hr0) this.Q).dismiss();
                return;
            default:
                int i2 = az0.g;
                ((az0) this.Q).dismiss();
                return;
        }
    }
}