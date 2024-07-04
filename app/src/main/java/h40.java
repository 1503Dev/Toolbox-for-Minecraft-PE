package defpackage;

import android.view.View;
import com.google.android.material.datepicker.b;
import com.google.android.material.datepicker.f;
import java.util.Calendar;

/* renamed from: h40  reason: default package */
public final class h40 implements View.OnClickListener {
    public final /* synthetic */ f P;
    public final /* synthetic */ b Q;

    public h40(b bVar, f fVar) {
        this.Q = bVar;
        this.P = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int U0 = this.Q.J().U0() - 1;
        if (U0 >= 0) {
            b bVar = this.Q;
            Calendar a = zf.a(this.P.c.P.P);
            a.add(2, U0);
            bVar.L(new p60(a));
        }
    }
}