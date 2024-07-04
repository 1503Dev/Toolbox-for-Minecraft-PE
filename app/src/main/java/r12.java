package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: r12  reason: default package */
public final class r12 extends c22 {
    public List h;
    public final Context i;

    public r12(l02 l02Var, gx1 gx1Var, int i, Context context) {
        super(l02Var, "Jdw9xFuo4OHuL+Waf9VEkBs6M7XtRhuX3PknFoicWEjQXQ4CENXY5MXEEK1WPoR/", "NFKyR+VbXbtroBTvca7ACsz/BEp9N5Lv9/EMVuAgXOo=", gx1Var, i, 31);
        this.h = null;
        this.i = context;
    }

    @Override // defpackage.c22
    public final void b() {
        gx1 gx1Var = this.d;
        gx1Var.j();
        ey1.N0((ey1) gx1Var.Q, -1L);
        gx1 gx1Var2 = this.d;
        gx1Var2.j();
        ey1.O0((ey1) gx1Var2.Q, -1L);
        Context context = this.i;
        if (context == null) {
            context = this.a.a;
        }
        if (this.h == null) {
            this.h = (List) this.e.invoke(null, context);
        }
        List list = this.h;
        if (list != null && list.size() == 2) {
            synchronized (this.d) {
                gx1 gx1Var3 = this.d;
                long longValue = ((Long) this.h.get(0)).longValue();
                gx1Var3.j();
                ey1.N0((ey1) gx1Var3.Q, longValue);
                gx1 gx1Var4 = this.d;
                long longValue2 = ((Long) this.h.get(1)).longValue();
                gx1Var4.j();
                ey1.O0((ey1) gx1Var4.Q, longValue2);
            }
        }
    }
}