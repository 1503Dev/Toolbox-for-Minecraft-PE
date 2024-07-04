package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* renamed from: gu4  reason: default package */
public class gu4 extends AbstractCollection {
    public final Object P;
    public Collection Q;
    @CheckForNull
    public final gu4 R;
    @CheckForNull
    public final Collection S;
    public final /* synthetic */ ku4 T;

    public gu4(ku4 ku4Var, Object obj, @CheckForNull Collection collection, gu4 gu4Var) {
        this.T = ku4Var;
        this.P = obj;
        this.Q = collection;
        this.R = gu4Var;
        this.S = gu4Var == null ? null : gu4Var.Q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        c();
        boolean isEmpty = this.Q.isEmpty();
        boolean add = this.Q.add(obj);
        if (add) {
            this.T.T++;
            if (isEmpty) {
                g();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.Q.addAll(collection);
        if (addAll) {
            int size2 = this.Q.size();
            ku4 ku4Var = this.T;
            ku4Var.T = (size2 - size) + ku4Var.T;
            if (size == 0) {
                g();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        Collection collection;
        gu4 gu4Var = this.R;
        if (gu4Var != null) {
            gu4Var.c();
            if (this.R.Q != this.S) {
                throw new ConcurrentModificationException();
            }
        } else if (this.Q.isEmpty() && (collection = (Collection) this.T.S.get(this.P)) != null) {
            this.Q = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.Q.clear();
        this.T.T -= size;
        h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        c();
        return this.Q.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        c();
        return this.Q.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.Q.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        gu4 gu4Var = this.R;
        if (gu4Var != null) {
            gu4Var.g();
        } else {
            this.T.S.put(this.P, this.Q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        gu4 gu4Var = this.R;
        if (gu4Var != null) {
            gu4Var.h();
        } else if (this.Q.isEmpty()) {
            this.T.S.remove(this.P);
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        c();
        return this.Q.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c();
        return new fu4(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        c();
        boolean remove = this.Q.remove(obj);
        if (remove) {
            ku4 ku4Var = this.T;
            ku4Var.T--;
            h();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.Q.removeAll(collection);
        if (removeAll) {
            int size2 = this.Q.size();
            ku4 ku4Var = this.T;
            ku4Var.T = (size2 - size) + ku4Var.T;
            h();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.Q.retainAll(collection);
        if (retainAll) {
            int size2 = this.Q.size();
            ku4 ku4Var = this.T;
            ku4Var.T = (size2 - size) + ku4Var.T;
            h();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        c();
        return this.Q.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.Q.toString();
    }
}