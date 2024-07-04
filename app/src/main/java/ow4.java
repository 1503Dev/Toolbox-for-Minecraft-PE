package defpackage;

import java.util.AbstractMap;

/* renamed from: ow4  reason: default package */
public final class ow4 extends nv4 {
    public final /* synthetic */ pw4 R;

    public ow4(pw4 pw4Var) {
        this.R = pw4Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        gt4.a(i, this.R.U);
        pw4 pw4Var = this.R;
        int i2 = i + i;
        Object obj = pw4Var.T[i2];
        obj.getClass();
        Object obj2 = pw4Var.T[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.iv4
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.R.U;
    }
}