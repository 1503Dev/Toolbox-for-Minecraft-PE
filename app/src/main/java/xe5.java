package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: xe5  reason: default package */
public final class xe5 extends wc5 implements RandomAccess, ye5 {
    public final List Q;

    static {
        new xe5((Object) null);
    }

    public xe5() {
        this(10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe5(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.Q = arrayList;
    }

    public xe5(Object obj) {
        super(false);
        this.Q = Collections.emptyList();
    }

    public xe5(ArrayList arrayList) {
        super(true);
        this.Q = arrayList;
    }

    @Override // defpackage.ye5
    public final Object A(int i) {
        return this.Q.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        g();
        this.Q.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.wc5, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        g();
        if (collection instanceof ye5) {
            collection = ((ye5) collection).f();
        }
        boolean addAll = this.Q.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // defpackage.wc5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // defpackage.ye5
    public final ye5 b() {
        if (this.P) {
            return new ug5(this);
        }
        return this;
    }

    @Override // defpackage.wc5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        this.Q.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.qe5
    public final /* bridge */ /* synthetic */ qe5 e(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.Q);
            return new xe5(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.ye5
    public final List f() {
        return Collections.unmodifiableList(this.Q);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public final String get(int i) {
        String w;
        Object obj = this.Q.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof gd5) {
            gd5 gd5Var = (gd5) obj;
            Charset charset = re5.a;
            if (gd5Var.o() == 0) {
                w = "";
            } else {
                w = gd5Var.w(charset);
            }
            if (gd5Var.C()) {
                this.Q.set(i, w);
            }
            return w;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, re5.a);
        boolean z = false;
        if (dh5.a.a(0, 0, bArr.length, bArr) == 0) {
            z = true;
        }
        if (z) {
            this.Q.set(i, str);
        }
        return str;
    }

    @Override // defpackage.ye5
    public final void k(gd5 gd5Var) {
        g();
        this.Q.add(gd5Var);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.wc5, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        g();
        Object remove = this.Q.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof gd5) {
            gd5 gd5Var = (gd5) remove;
            Charset charset = re5.a;
            if (gd5Var.o() == 0) {
                return "";
            }
            return gd5Var.w(charset);
        }
        return new String((byte[]) remove, re5.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        Object obj2 = this.Q.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof gd5) {
            gd5 gd5Var = (gd5) obj2;
            Charset charset = re5.a;
            if (gd5Var.o() == 0) {
                return "";
            }
            return gd5Var.w(charset);
        }
        return new String((byte[]) obj2, re5.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Q.size();
    }
}