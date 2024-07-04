package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: u23  reason: default package */
public final class u23 implements lj5 {
    public final r23 a;

    public u23(r23 r23Var) {
        this.a = r23Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        WeakReference weakReference = this.a.c;
        tv2.C(weakReference);
        return weakReference;
    }
}