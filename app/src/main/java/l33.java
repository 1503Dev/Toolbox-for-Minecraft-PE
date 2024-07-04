package defpackage;

import java.util.UUID;

/* renamed from: l33  reason: default package */
public final class l33 implements lj5 {
    public final /* synthetic */ int a;

    public /* synthetic */ l33(int i) {
        this.a = i;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new o7();
            case 1:
                return new nu2();
            default:
                cu5 cu5Var = jv5.A.c;
                String uuid = UUID.randomUUID().toString();
                tv2.C(uuid);
                return uuid;
        }
    }
}