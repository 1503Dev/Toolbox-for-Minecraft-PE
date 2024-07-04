package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: ut4  reason: default package */
public final class ut4 extends zv4 {
    public final /* synthetic */ wt4 P;

    public ut4(wt4 wt4Var) {
        this.P = wt4Var;
    }

    @Override // defpackage.zv4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Set entrySet = this.P.R.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new vt4(this.P);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Object obj2;
        if (contains(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            ku4 ku4Var = this.P.S;
            try {
                obj2 = ku4Var.S.remove(entry.getKey());
            } catch (ClassCastException | NullPointerException unused) {
                obj2 = null;
            }
            Collection collection = (Collection) obj2;
            if (collection != null) {
                int size = collection.size();
                collection.clear();
                ku4Var.T -= size;
                return true;
            }
            return true;
        }
        return false;
    }
}