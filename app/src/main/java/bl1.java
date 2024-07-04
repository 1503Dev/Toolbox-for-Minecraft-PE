package defpackage;

import java.util.AbstractMap;

/* renamed from: bl1  reason: default package */
public final class bl1 extends ew5 {
    public final /* synthetic */ em1 R;

    public bl1(em1 em1Var) {
        this.R = em1Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        nu2.h(i, this.R.T);
        em1 em1Var = this.R;
        int i2 = i + i;
        Object obj = em1Var.S[i2];
        obj.getClass();
        Object obj2 = em1Var.S[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.R.T;
    }
}