package defpackage;

import android.view.View;

/* renamed from: so  reason: default package */
public final /* synthetic */ class so implements View.OnClickListener {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ so(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.P) {
            case 0:
                ((uo) this.Q).dismiss();
                return;
            default:
                wr0 wr0Var = (wr0) this.Q;
                lj ljVar = wr0.c;
                wr0Var.getClass();
                new yr0(view.getContext(), wr0Var.a, wr0Var.b).show();
                return;
        }
    }
}