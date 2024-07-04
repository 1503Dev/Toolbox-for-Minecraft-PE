package defpackage;

import java.util.Locale;

/* renamed from: fq1  reason: default package */
public final class fq1 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fq1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                String lowerCase = ((go1) this.b).a.toLowerCase(Locale.ROOT);
                tv2.C(lowerCase);
                return lowerCase;
            case 1:
                r23 r23Var = (r23) this.b;
                r23Var.getClass();
                String r = jv5.A.c.r(r23Var.b, r23Var.a.P);
                tv2.C(r);
                return r;
            case 2:
                return ((zg3) this.b).h;
            default:
                return null;
        }
    }
}