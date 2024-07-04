package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: d63  reason: default package */
public final class d63 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ d63(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                return new c63((cu3) ((uj5) this.b).c());
            default:
                Set emptySet = Collections.emptySet();
                tv2.C(emptySet);
                return emptySet;
        }
    }
}