package defpackage;

import java.util.HashSet;
import java.util.Locale;

/* renamed from: cr1  reason: default package */
public final class cr1 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ cr1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                go1 go1Var = (go1) this.b;
                go1Var.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(go1Var.a.toLowerCase(Locale.ROOT));
                return hashSet;
            default:
                return ((zg3) this.b).i;
        }
    }
}