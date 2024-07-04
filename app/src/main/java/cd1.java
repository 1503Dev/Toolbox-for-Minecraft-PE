package defpackage;

import android.content.Context;

/* renamed from: cd1  reason: default package */
public final class cd1 implements Runnable {
    public final /* synthetic */ Context P;
    public final /* synthetic */ rc1 Q;
    public final /* synthetic */ ad1 R;

    public cd1(ad1 ad1Var, Context context, rc1 rc1Var) {
        this.R = ad1Var;
        this.P = context;
        this.Q = rc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fb1 yc1Var;
        Context applicationContext = this.P.getApplicationContext();
        rc1 rc1Var = this.Q;
        int i = yc1.w0;
        tc1 o = ga1.h().o();
        int i2 = o.b;
        o.b = i2 + 1;
        if (hy.a(rc1Var.b.q("type"), "aurora")) {
            yc1Var = new gc1(applicationContext, i2, rc1Var);
        } else {
            yc1Var = new yc1(applicationContext, i2, rc1Var);
        }
        yc1Var.o();
        this.R.v.put(Integer.valueOf(yc1Var.getAdc3ModuleId()), yc1Var);
    }
}