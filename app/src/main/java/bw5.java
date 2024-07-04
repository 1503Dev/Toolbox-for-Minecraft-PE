package defpackage;

import android.util.Pair;
import java.util.Map;

/* renamed from: bw5  reason: default package */
public final /* synthetic */ class bw5 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object S;

    public /* synthetic */ bw5(int i, Object obj, Object obj2, Object obj3) {
        this.P = i;
        this.R = obj;
        this.Q = obj2;
        this.S = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                String str = (String) this.Q;
                Map map = (Map) this.S;
                y03 y03Var = ((xx5) this.R).c;
                if (y03Var != null) {
                    y03Var.a(str, map);
                    return;
                }
                return;
            case 1:
                rx2 rx2Var = ((qx2) this.S).h0;
                if (rx2Var != null) {
                    ((vx2) rx2Var).c("error", "what", (String) this.Q, "extra", (String) this.R);
                    return;
                }
                return;
            default:
                Pair pair = (Pair) this.Q;
                ((pp5) ((en5) this.R).Q.h).k(((Integer) pair.first).intValue(), (ov5) pair.second, (lv5) this.S);
                return;
        }
    }

    public bw5(qx2 qx2Var, String str, String str2) {
        this.P = 1;
        this.S = qx2Var;
        this.Q = str;
        this.R = str2;
    }
}