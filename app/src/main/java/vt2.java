package defpackage;

import android.content.Context;

/* renamed from: vt2  reason: default package */
public final class vt2 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ vt2(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                dt2 dt2Var = (dt2) this.c;
                return new ut2((Context) this.b.c(), new ln1(2, (kd) dt2Var.a.c(), (bt2) dt2Var.b.c()));
            case 1:
                String str = (String) this.c.c();
                if (((Boolean) pb2.a.d()).booleanValue()) {
                    return new nk2(str);
                }
                return new wv2(str);
            default:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new ii3((hr3) this.b.c(), yw2Var);
        }
    }
}