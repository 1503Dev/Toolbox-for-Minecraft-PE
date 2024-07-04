package defpackage;

/* renamed from: rw4  reason: default package */
public final class rw4 extends nv4 {
    public final transient Object[] R;
    public final transient int S;
    public final transient int T;

    public rw4(int i, int i2, Object[] objArr) {
        this.R = objArr;
        this.S = i;
        this.T = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gt4.a(i, this.T);
        Object obj = this.R[i + i + this.S];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.iv4
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.T;
    }
}