package defpackage;

/* renamed from: fk1  reason: default package */
public final class fk1 extends ew5 {
    public static final fk1 T = new fk1(0, new Object[0]);
    public final transient Object[] R;
    public final transient int S;

    public fk1(int i, Object[] objArr) {
        this.R = objArr;
        this.S = i;
    }

    @Override // defpackage.ew5, defpackage.ft5
    public final int g(Object[] objArr) {
        System.arraycopy(this.R, 0, objArr, 0, this.S);
        return this.S;
    }

    @Override // java.util.List
    public final Object get(int i) {
        nu2.h(i, this.S);
        Object obj = this.R[i];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.ft5
    public final int h() {
        return this.S;
    }

    @Override // defpackage.ft5
    public final int m() {
        return 0;
    }

    @Override // defpackage.ft5
    public final Object[] n() {
        return this.R;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.S;
    }
}