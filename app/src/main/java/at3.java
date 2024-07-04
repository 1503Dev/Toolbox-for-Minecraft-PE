package defpackage;

import android.content.Context;

/* renamed from: at3  reason: default package */
public final class at3 implements ps3 {
    public final long a;
    public final z64 b;

    public at3(long j, Context context, vs3 vs3Var, w33 w33Var, String str) {
        this.a = j;
        t43 U = w33Var.U();
        context.getClass();
        U.b = context;
        U.d = new zr5();
        str.getClass();
        U.c = str;
        z64 z64Var = (z64) U.a().d.c();
        this.b = z64Var;
        z64Var.S3(new zs3(this, vs3Var));
    }

    @Override // defpackage.ps3
    public final void a() {
        this.b.F();
    }

    @Override // defpackage.ps3
    public final void b(pn5 pn5Var) {
        this.b.z1(pn5Var);
    }

    @Override // defpackage.ps3
    public final void d() {
        this.b.t1(new va0(null));
    }
}