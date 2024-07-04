package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: q53  reason: default package */
public final class q53 extends dv1 implements RandomAccess, s63 {
    public final List Q;

    static {
        new q53((Object) null);
    }

    public q53() {
        this(10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q53(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.Q = arrayList;
    }

    public q53(Object obj) {
        super(false);
        this.Q = Collections.emptyList();
    }

    public q53(ArrayList arrayList) {
        super(true);
        this.Q = arrayList;
    }

    @Override // defpackage.s63
    public final Object A(int i) {
        return this.Q.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        g();
        this.Q.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.dv1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        g();
        if (collection instanceof s63) {
            collection = ((s63) collection).f();
        }
        boolean addAll = this.Q.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // defpackage.dv1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // defpackage.s63
    public final s63 b() {
        if (this.P) {
            return new m84(this);
        }
        return this;
    }

    @Override // defpackage.dv1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        this.Q.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.b13
    public final /* bridge */ /* synthetic */ b13 e(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.Q);
            return new q53(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.s63
    public final List f() {
        return Collections.unmodifiableList(this.Q);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public final String get(int i) {
        String p;
        Object obj = this.Q.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof y82) {
            y82 y82Var = (y82) obj;
            Charset charset = z13.a;
            if (y82Var.m() == 0) {
                p = "";
            } else {
                p = y82Var.p(charset);
            }
            if (y82Var.r()) {
                this.Q.set(i, p);
            }
            return p;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, z13.a);
        ie4 ie4Var = nf4.a;
        int length = bArr.length;
        ie4Var.getClass();
        if (qd4.a(bArr, 0, length)) {
            this.Q.set(i, str);
        }
        return str;
    }

    @Override // defpackage.dv1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        g();
        Object remove = this.Q.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof y82) {
            y82 y82Var = (y82) remove;
            Charset charset = z13.a;
            if (y82Var.m() == 0) {
                return "";
            }
            return y82Var.p(charset);
        }
        return new String((byte[]) remove, z13.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        Object obj2 = this.Q.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof y82) {
            y82 y82Var = (y82) obj2;
            Charset charset = z13.a;
            if (y82Var.m() == 0) {
                return "";
            }
            return y82Var.p(charset);
        }
        return new String((byte[]) obj2, z13.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Q.size();
    }
}