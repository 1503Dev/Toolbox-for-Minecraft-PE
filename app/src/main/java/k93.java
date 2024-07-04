package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: k93  reason: default package */
public final class k93 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;

    public /* synthetic */ k93(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, uj5 uj5Var4, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
        this.e = uj5Var4;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Set emptySet;
        switch (this.a) {
            case 0:
                k24 k24Var = (k24) this.d;
                return new o54((ol4) this.b.c(), (ez4) this.c.c(), ((j54) this.e).c(), new j24((Context) k24Var.a.c(), (d93) k24Var.b.c()));
            case 1:
                String str = (String) this.b.c();
                Context a = ((t23) this.c).a();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                Map c = ((oj5) this.e).c();
                if (((Boolean) w82.d.c.a(x92.c4)).booleanValue()) {
                    j52 j52Var = new j52(new m52(a));
                    j52Var.a(new ov2(str));
                    emptySet = Collections.singleton(new ii3(new or3(j52Var, c), yw2Var));
                } else {
                    emptySet = Collections.emptySet();
                }
                tv2.C(emptySet);
                return emptySet;
            default:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                return new i84(yw2Var2, (zq3) this.c.c(), (jt3) this.d.c(), (k84) this.e.c());
        }
    }
}