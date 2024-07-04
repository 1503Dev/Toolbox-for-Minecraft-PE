package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: xp5  reason: default package */
public final class xp5 implements Callable {
    public final /* synthetic */ gu5 a;

    public xp5(gu5 gu5Var) {
        this.a = gu5Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        gu5 gu5Var = this.a;
        String str = gu5Var.P.P;
        Context context = gu5Var.S;
        int i = qz1.u0;
        pz1.t(context, false);
        return new rz1(new qz1(context, str, false));
    }
}