package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: pc3  reason: default package */
public final class pc3 implements le3, be3 {
    public final yh4 P;

    public pc3(yh4 yh4Var) {
        this.P = yh4Var;
    }

    @Override // defpackage.be3
    public final void a(Context context) {
    }

    @Override // defpackage.be3
    public final void d(Context context) {
    }

    @Override // defpackage.be3
    public final void e(Context context) {
    }

    @Override // defpackage.le3
    public final void k() {
        to2 to2Var = this.P.d0;
        if (to2Var == null || !to2Var.a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.P.d0.b.isEmpty()) {
            return;
        }
        arrayList.add(this.P.d0.b);
    }
}