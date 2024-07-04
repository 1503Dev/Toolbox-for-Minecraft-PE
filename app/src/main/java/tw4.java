package defpackage;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* renamed from: tw4  reason: default package */
public final class tw4 extends sv4 {
    public static final Object[] X;
    public static final tw4 Y;
    public final transient Object[] S;
    public final transient int T;
    public final transient Object[] U;
    public final transient int V;
    public final transient int W;

    static {
        Object[] objArr = new Object[0];
        X = objArr;
        Y = new tw4(objArr, 0, objArr, 0, 0);
    }

    public tw4(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.S = objArr;
        this.T = i;
        this.U = objArr2;
        this.V = i2;
        this.W = i3;
    }

    @Override // defpackage.iv4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.U;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int h = gv4.h(obj);
        while (true) {
            int i = h & this.V;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            h = i + 1;
        }
    }

    @Override // defpackage.iv4
    public final int g(int i, Object[] objArr) {
        System.arraycopy(this.S, 0, objArr, i, this.W);
        return i + this.W;
    }

    @Override // defpackage.iv4
    public final int h() {
        return this.W;
    }

    @Override // defpackage.sv4, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.T;
    }

    @Override // defpackage.sv4, defpackage.iv4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return n().listIterator(0);
    }

    @Override // defpackage.iv4
    public final int m() {
        return 0;
    }

    @Override // defpackage.iv4
    public final cx4 o() {
        return n().listIterator(0);
    }

    @Override // defpackage.iv4
    public final Object[] q() {
        return this.S;
    }

    @Override // defpackage.sv4
    public final nv4 s() {
        return nv4.s(this.W, this.S);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.W;
    }
}