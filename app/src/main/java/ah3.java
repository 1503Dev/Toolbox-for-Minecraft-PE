package defpackage;

import java.util.Set;

/* renamed from: ah3  reason: default package */
public final class ah3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public /* synthetic */ ah3(Object obj, uj5 uj5Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                zg3 zg3Var = (zg3) this.c;
                Set c = ((sj5) this.b).c();
                if (zg3Var.p == null) {
                    zg3Var.p = new pd3(c);
                }
                pd3 pd3Var = zg3Var.p;
                tv2.C(pd3Var);
                return pd3Var;
            default:
                an3 an3Var = (an3) this.b.c();
                tv2.C(an3Var);
                return an3Var;
        }
    }
}