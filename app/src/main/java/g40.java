package defpackage;

import android.view.View;
import com.google.android.material.datepicker.b;
import com.google.android.material.datepicker.f;
import java.util.Calendar;

/* renamed from: g40  reason: default package */
public final class g40 implements View.OnClickListener {
    public final /* synthetic */ f P;
    public final /* synthetic */ b Q;

    public g40(b bVar, f fVar) {
        this.Q = bVar;
        this.P = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int T0 = this.Q.J().T0() + 1;
        if (T0 < this.Q.P0.getAdapter().d()) {
            b bVar = this.Q;
            Calendar a = zf.a(this.P.c.P.P);
            a.add(2, T0);
            bVar.L(new p60(a));
        }
    }
}