package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: ch3  reason: default package */
public final class ch3 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ch3(int i, Object obj) {
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
            case 1:
                return null;
            default:
                String str = ((le4) this.b).a.W;
                tv2.C(str);
                return str;
        }
    }
}