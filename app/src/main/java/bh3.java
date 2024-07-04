package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: bh3  reason: default package */
public final class bh3 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ bh3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                Set emptySet = Collections.emptySet();
                tv2.C(emptySet);
                return emptySet;
            case 1:
                return new tl3(((pa3) ((uj5) this.b)).a());
            default:
                return null;
        }
    }
}