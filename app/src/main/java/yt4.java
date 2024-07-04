package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: yt4  reason: default package */
public final class yt4 implements Iterator {
    @CheckForNull
    public Map.Entry P;
    public final /* synthetic */ Iterator Q;
    public final /* synthetic */ zt4 R;

    public yt4(zt4 zt4Var, Iterator it) {
        this.R = zt4Var;
        this.Q = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.Q.next();
        this.P = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.P != null) {
            z = true;
        } else {
            z = false;
        }
        gt4.g("no calls to next() since the last call to remove()", z);
        Collection collection = (Collection) this.P.getValue();
        this.Q.remove();
        this.R.Q.T -= collection.size();
        collection.clear();
        this.P = null;
    }
}