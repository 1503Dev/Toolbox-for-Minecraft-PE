package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: oh3  reason: default package */
public final class oh3 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ oh3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                Set emptySet = Collections.emptySet();
                tv2.C(emptySet);
                return emptySet;
            default:
                y03 y03Var = ((hj3) this.b).b;
                if (y03Var != null) {
                    return y03Var.m0();
                }
                return null;
        }
    }
}