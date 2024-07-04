package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: zt4  reason: default package */
public class zt4 extends cw4 {
    public final /* synthetic */ ku4 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt4(ku4 ku4Var, Map map) {
        super(map);
        this.Q = ku4Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            yt4 yt4Var = (yt4) it;
            if (!yt4Var.hasNext()) {
                return;
            }
            yt4Var.next();
            yt4Var.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.P.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.P.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.P.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new yt4(this, this.P.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.P.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.Q.T -= size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}