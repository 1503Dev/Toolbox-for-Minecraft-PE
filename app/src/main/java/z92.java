package defpackage;

import java.util.ArrayDeque;

/* renamed from: z92  reason: default package */
public final class z92 implements lj5 {
    public final /* synthetic */ int a;

    public /* synthetic */ z92(int i) {
        this.a = i;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new y92();
            case 1:
                return new ArrayDeque();
            case 2:
                return new mu2();
            default:
                String valueOf = String.valueOf(n62.f.e.nextInt() & Integer.MAX_VALUE);
                tv2.C(valueOf);
                return valueOf;
        }
    }
}