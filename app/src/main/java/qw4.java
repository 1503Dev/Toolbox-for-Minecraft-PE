package defpackage;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* renamed from: qw4  reason: default package */
public final class qw4 extends sv4 {
    public final transient qv4 S;
    public final transient nv4 T;

    public qw4(qv4 qv4Var, rw4 rw4Var) {
        this.S = qv4Var;
        this.T = rw4Var;
    }

    @Override // defpackage.iv4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.S.get(obj) != null;
    }

    @Override // defpackage.iv4
    public final int g(int i, Object[] objArr) {
        return this.T.g(i, objArr);
    }

    @Override // defpackage.sv4, defpackage.iv4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.T.listIterator(0);
    }

    @Override // defpackage.sv4, defpackage.iv4
    public final nv4 n() {
        return this.T;
    }

    @Override // defpackage.iv4
    public final cx4 o() {
        return this.T.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.S.size();
    }
}