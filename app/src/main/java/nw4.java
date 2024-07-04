package defpackage;

/* renamed from: nw4  reason: default package */
public final class nw4 extends nv4 {
    public static final nw4 T = new nw4(0, new Object[0]);
    public final transient Object[] R;
    public final transient int S;

    public nw4(int i, Object[] objArr) {
        this.R = objArr;
        this.S = i;
    }

    @Override // defpackage.nv4, defpackage.iv4
    public final int g(int i, Object[] objArr) {
        System.arraycopy(this.R, 0, objArr, i, this.S);
        return i + this.S;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gt4.a(i, this.S);
        Object obj = this.R[i];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.iv4
    public final int h() {
        return this.S;
    }

    @Override // defpackage.iv4
    public final int m() {
        return 0;
    }

    @Override // defpackage.iv4
    public final boolean p() {
        return false;
    }

    @Override // defpackage.iv4
    public final Object[] q() {
        return this.R;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.S;
    }
}