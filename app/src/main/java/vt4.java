package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: vt4  reason: default package */
public final class vt4 implements Iterator {
    public final Iterator P;
    @CheckForNull
    public Collection Q;
    public final /* synthetic */ wt4 R;

    public vt4(wt4 wt4Var) {
        this.R = wt4Var;
        this.P = wt4Var.R.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.P.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.P.next();
        this.Q = (Collection) entry.getValue();
        return this.R.a(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.Q != null) {
            z = true;
        } else {
            z = false;
        }
        gt4.g("no calls to next() since the last call to remove()", z);
        this.P.remove();
        this.R.S.T -= this.Q.size();
        this.Q.clear();
        this.Q = null;
    }
}