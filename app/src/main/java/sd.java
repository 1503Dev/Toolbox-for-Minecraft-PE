package defpackage;

import android.view.View;

/* renamed from: sd  reason: default package */
public final /* synthetic */ class sd implements View.OnClickListener {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ sd(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.P) {
            case 0:
                zd zdVar = (zd) this.Q;
                ((pd) ((fy0) zdVar.U).a).k.I((zdVar.V.i0.getColor() & 16777215) | (((int) (zdVar.V.e0.getValue() * 255.0f)) << 24));
                zdVar.dismiss();
                return;
            default:
                int i = hz.d;
                ((hz) this.Q).dismiss();
                return;
        }
    }
}