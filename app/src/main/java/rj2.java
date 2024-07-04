package defpackage;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: rj2  reason: default package */
public final class rj2 {
    public final Context b;
    public final String c;
    public final xv2 d;
    public final rm4 e;
    public qj2 f;
    public final Object a = new Object();
    public int g = 1;

    public rj2(Context context, xv2 xv2Var, String str, rm4 rm4Var) {
        this.c = str;
        this.b = context.getApplicationContext();
        this.d = xv2Var;
        this.e = rm4Var;
    }

    public final jj2 a() {
        synchronized (this.a) {
            synchronized (this.a) {
                qj2 qj2Var = this.f;
                if (qj2Var != null && this.g == 0) {
                    qj2Var.d(new u04(3, this), n9.S);
                }
            }
            qj2 qj2Var2 = this.f;
            if (qj2Var2 != null && qj2Var2.b() != -1) {
                int i = this.g;
                if (i == 0) {
                    return this.f.g();
                } else if (i != 1) {
                    return this.f.g();
                } else {
                    this.g = 2;
                    b();
                    return this.f.g();
                }
            }
            this.g = 2;
            qj2 b = b();
            this.f = b;
            return b.g();
        }
    }

    public final qj2 b() {
        hm4 t = eb1.t(this.b, 6);
        t.f();
        qj2 qj2Var = new qj2();
        zw2.e.execute(new cj2(this, qj2Var));
        qj2Var.d(new kj4(this, qj2Var, t), new hj2(this, qj2Var, t));
        return qj2Var;
    }
}