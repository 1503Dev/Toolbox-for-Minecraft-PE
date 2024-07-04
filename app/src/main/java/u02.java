package defpackage;

import android.app.Activity;
import android.view.View;

/* renamed from: u02  reason: default package */
public final class u02 extends c22 {
    public final Activity h;
    public final View i;

    public u02(l02 l02Var, gx1 gx1Var, int i, View view, Activity activity) {
        super(l02Var, "KT2Tv8TPKs8B/+lHkvvu6s01+PimOKMOvsBTxmvtb79k6T7ZyFNxwI/cZRLVhJ7V", "0IMe0hZjzvPOj0FU8vVpI60XmFXXOxBk0ZbCWvkG8dU=", gx1Var, i, 62);
        this.i = view;
        this.h = activity;
    }

    @Override // defpackage.c22
    public final void b() {
        if (this.i == null) {
            return;
        }
        boolean booleanValue = ((Boolean) w82.d.c.a(x92.Y1)).booleanValue();
        Object[] objArr = (Object[]) this.e.invoke(null, this.i, this.h, Boolean.valueOf(booleanValue));
        synchronized (this.d) {
            gx1 gx1Var = this.d;
            long longValue = ((Long) objArr[0]).longValue();
            gx1Var.j();
            ey1.U((ey1) gx1Var.Q, longValue);
            gx1 gx1Var2 = this.d;
            long longValue2 = ((Long) objArr[1]).longValue();
            gx1Var2.j();
            ey1.V((ey1) gx1Var2.Q, longValue2);
            if (booleanValue) {
                gx1 gx1Var3 = this.d;
                gx1Var3.j();
                ey1.W((ey1) gx1Var3.Q, (String) objArr[2]);
            }
        }
    }
}