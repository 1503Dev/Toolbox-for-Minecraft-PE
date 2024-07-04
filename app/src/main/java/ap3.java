package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: ap3  reason: default package */
public final class ap3 extends rd2 {
    public final Context P;
    public final nl3 Q;
    public cm3 R;
    public jl3 S;

    public ap3(Context context, nl3 nl3Var, cm3 cm3Var, jl3 jl3Var) {
        this.P = context;
        this.Q = nl3Var;
        this.R = cm3Var;
        this.S = jl3Var;
    }

    @Override // defpackage.sd2
    public final hw f() {
        return new va0(this.P);
    }

    @Override // defpackage.sd2
    public final String g() {
        return this.Q.m();
    }

    @Override // defpackage.sd2
    public final boolean m0(hw hwVar) {
        cm3 cm3Var;
        Object c0 = va0.c0(hwVar);
        if (!(c0 instanceof ViewGroup) || (cm3Var = this.R) == null || !cm3Var.c((ViewGroup) c0, true)) {
            return false;
        }
        this.Q.j().F(new wq1(this));
        return true;
    }
}