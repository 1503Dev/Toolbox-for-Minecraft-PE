package defpackage;

import android.view.View;
import java.util.Calendar;

/* renamed from: h91  reason: default package */
public final class h91 implements View.OnClickListener {
    public final /* synthetic */ int P;
    public final /* synthetic */ i91 Q;

    public h91(i91 i91Var, int i) {
        this.Q = i91Var;
        this.P = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.P;
        int i2 = this.Q.c.L0.R;
        Calendar b = zf.b(null);
        b.set(1, i);
        b.set(2, i2);
        this.Q.c.L(new p60(b));
        this.Q.c.M(1);
    }
}