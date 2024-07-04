package defpackage;

import android.content.pm.PackageInfo;

/* renamed from: v94  reason: default package */
public final class v94 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public /* synthetic */ v94(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new t94(yw2Var, (ar3) this.b.c(), ((ed3) this.c).a(), (String) this.d.c());
            default:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                return new ya4(yw2Var2, ((ed3) this.b).a(), (PackageInfo) this.c.c(), ((s23) this.d).c());
        }
    }
}