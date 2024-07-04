package defpackage;

import android.util.Pair;

/* renamed from: cn5  reason: default package */
public final /* synthetic */ class cn5 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ xu5 Q;
    public final /* synthetic */ lv5 R;
    public final /* synthetic */ Object S;
    public final /* synthetic */ Object T;

    public /* synthetic */ cn5(Object obj, Object obj2, xu5 xu5Var, lv5 lv5Var, int i) {
        this.P = i;
        this.S = obj;
        this.T = obj2;
        this.Q = xu5Var;
        this.R = lv5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                Pair pair = (Pair) this.T;
                xu5 xu5Var = this.Q;
                lv5 lv5Var = this.R;
                ((pp5) ((en5) this.S).Q.h).p(((Integer) pair.first).intValue(), (ov5) pair.second, xu5Var, lv5Var);
                return;
            default:
                ((tv5) this.T).j(0, ((sv5) this.S).a, this.Q, this.R);
                return;
        }
    }
}