package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: xt4  reason: default package */
public class xt4 implements Iterator {
    public final Iterator P;
    @CheckForNull
    public Object Q;
    @CheckForNull
    public Collection R = null;
    public Iterator S = vv4.P;
    public final /* synthetic */ ku4 T;

    public xt4(ku4 ku4Var) {
        this.T = ku4Var;
        this.P = ku4Var.S.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.P.hasNext() || this.S.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.S.hasNext()) {
            Map.Entry entry = (Map.Entry) this.P.next();
            this.Q = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.R = collection;
            this.S = collection.iterator();
        }
        return this.S.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.S.remove();
        Collection collection = this.R;
        collection.getClass();
        if (collection.isEmpty()) {
            this.P.remove();
        }
        ku4 ku4Var = this.T;
        ku4Var.T--;
    }
}