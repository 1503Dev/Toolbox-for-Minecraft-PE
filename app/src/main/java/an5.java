package defpackage;

import android.util.Pair;
import java.io.IOException;

/* renamed from: an5  reason: default package */
public final /* synthetic */ class an5 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ xu5 Q;
    public final /* synthetic */ lv5 R;
    public final /* synthetic */ IOException S;
    public final /* synthetic */ boolean T;
    public final /* synthetic */ Object U;
    public final /* synthetic */ Object V;

    public /* synthetic */ an5(Object obj, Object obj2, xu5 xu5Var, lv5 lv5Var, IOException iOException, boolean z, int i) {
        this.P = i;
        this.U = obj;
        this.V = obj2;
        this.Q = xu5Var;
        this.R = lv5Var;
        this.S = iOException;
        this.T = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                Pair pair = (Pair) this.V;
                xu5 xu5Var = this.Q;
                lv5 lv5Var = this.R;
                IOException iOException = this.S;
                boolean z = this.T;
                ((pp5) ((en5) this.U).Q.h).a(((Integer) pair.first).intValue(), (ov5) pair.second, xu5Var, lv5Var, iOException, z);
                return;
            default:
                ((tv5) this.V).a(0, ((sv5) this.U).a, this.Q, this.R, this.S, this.T);
                return;
        }
    }
}