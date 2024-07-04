package defpackage;

/* renamed from: ho1  reason: default package */
public final class ho1 extends ew5 {
    public final transient Object[] R;
    public final transient int S;
    public final transient int T;

    public ho1(int i, int i2, Object[] objArr) {
        this.R = objArr;
        this.S = i;
        this.T = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        nu2.h(i, this.T);
        Object obj = this.R[i + i + this.S];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.T;
    }
}