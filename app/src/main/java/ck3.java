package defpackage;

import android.content.Context;
import android.webkit.WebView;

/* renamed from: ck3  reason: default package */
public final class ck3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;
    public final uj5 f;

    public /* synthetic */ ck3(lj5 lj5Var, uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, uj5 uj5Var4, int i) {
        this.a = i;
        this.b = lj5Var;
        this.c = uj5Var;
        this.d = uj5Var2;
        this.e = uj5Var3;
        this.f = uj5Var4;
    }

    @Override // defpackage.uj5
    public final Object c() {
        int i;
        WebView m0;
        switch (this.a) {
            case 0:
                oj3 oj3Var = (oj3) this.b;
                it2 it2Var = new it2(((t23) oj3Var.a).a(), ((ed3) oj3Var.b).a().f);
                Context a = ((t23) this.c).a();
                qt2 qt2Var = (qt2) this.d.c();
                y03 y03Var = ((ij3) this.e).a.b;
                if (y03Var == null) {
                    m0 = null;
                } else {
                    m0 = y03Var.m0();
                }
                return new bk3(it2Var, a, qt2Var, m0, (s52) this.f.c());
            default:
                Context a2 = ((t23) this.b).a();
                String packageName = ((t23) ((fv3) this.c).a).a().getPackageName();
                tv2.C(packageName);
                xv2 a3 = ((f33) this.d).a();
                s52 s52Var = (s52) this.e.c();
                String str = (String) this.f.c();
                j52 j52Var = new j52(new m52(a2));
                y72 w = z72.w();
                int i2 = a3.Q;
                w.j();
                z72.y((z72) w.Q, i2);
                int i3 = a3.R;
                w.j();
                z72.z((z72) w.Q, i3);
                if (true != a3.S) {
                    i = 2;
                } else {
                    i = 0;
                }
                w.j();
                z72.A((z72) w.Q, i);
                j52Var.a(new er3(s52Var, packageName, (z72) w.h(), str));
                return j52Var;
        }
    }
}