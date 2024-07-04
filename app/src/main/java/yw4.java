package defpackage;

import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: yw4  reason: default package */
public abstract class yw4 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return zw4.y(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}