package defpackage;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: i12  reason: default package */
public final class i12 extends c22 {
    public final Map h;
    public final View i;
    public final Context j;

    public i12(l02 l02Var, gx1 gx1Var, int i, HashMap hashMap, View view, Context context) {
        super(l02Var, "C2cxj1PqlGI/7sXzj/vQoDZCGl/mHCTxIbvQCRFAKNnzfg9WbUpjhk8QJWw60E8Q", "faUXYiGUMq7bQIeIkZZxqavg/5i6OivEyj0LKDXCfso=", gx1Var, i, 85);
        this.h = hashMap;
        this.i = view;
        this.j = context;
    }

    @Override // defpackage.c22
    public final void b() {
        long j;
        long[] jArr = new long[2];
        long j2 = Long.MIN_VALUE;
        if (this.h.containsKey(1)) {
            j = ((Long) this.h.get(1)).longValue();
        } else {
            j = Long.MIN_VALUE;
        }
        jArr[0] = j;
        if (this.h.containsKey(2)) {
            j2 = ((Long) this.h.get(2)).longValue();
        }
        jArr[1] = j2;
        Context context = this.j;
        if (context == null) {
            context = this.a.a;
        }
        long[] jArr2 = (long[]) this.e.invoke(null, jArr, context, this.i);
        long j3 = jArr2[0];
        this.h.put(1, Long.valueOf(jArr2[1]));
        long j4 = jArr2[2];
        this.h.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.d) {
            gx1 gx1Var = this.d;
            gx1Var.j();
            ey1.a0((ey1) gx1Var.Q, j3);
            gx1 gx1Var2 = this.d;
            gx1Var2.j();
            ey1.b0((ey1) gx1Var2.Q, j4);
        }
    }
}