package defpackage;

import javax.annotation.CheckForNull;

/* renamed from: mv4  reason: default package */
public final class mv4 extends nv4 {
    public final transient int R;
    public final transient int S;
    public final /* synthetic */ nv4 T;

    public mv4(nv4 nv4Var, int i, int i2) {
        this.T = nv4Var;
        this.R = i;
        this.S = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gt4.a(i, this.S);
        return this.T.get(i + this.R);
    }

    @Override // defpackage.iv4
    public final int h() {
        return this.T.m() + this.R + this.S;
    }

    @Override // defpackage.iv4
    public final int m() {
        return this.T.m() + this.R;
    }

    @Override // defpackage.iv4
    public final boolean p() {
        return true;
    }

    @Override // defpackage.iv4
    @CheckForNull
    public final Object[] q() {
        return this.T.q();
    }

    @Override // defpackage.nv4, java.util.List
    /* renamed from: r */
    public final nv4 subList(int i, int i2) {
        gt4.f(i, i2, this.S);
        nv4 nv4Var = this.T;
        int i3 = this.R;
        return nv4Var.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.S;
    }
}