package defpackage;

import javax.annotation.CheckForNull;

/* renamed from: hv5  reason: default package */
public final class hv5 extends ew5 {
    public final transient int R;
    public final transient int S;
    public final /* synthetic */ ew5 T;

    public hv5(ew5 ew5Var, int i, int i2) {
        this.T = ew5Var;
        this.R = i;
        this.S = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        nu2.h(i, this.S);
        return this.T.get(i + this.R);
    }

    @Override // defpackage.ft5
    public final int h() {
        return this.T.m() + this.R + this.S;
    }

    @Override // defpackage.ft5
    public final int m() {
        return this.T.m() + this.R;
    }

    @Override // defpackage.ft5
    @CheckForNull
    public final Object[] n() {
        return this.T.n();
    }

    @Override // defpackage.ew5, java.util.List
    /* renamed from: o */
    public final ew5 subList(int i, int i2) {
        nu2.k(i, i2, this.S);
        ew5 ew5Var = this.T;
        int i3 = this.R;
        return ew5Var.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.S;
    }
}