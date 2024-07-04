package defpackage;

import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: c06  reason: default package */
public abstract class c06 extends ft5 implements Set {
    @CheckForNull
    public transient ew5 Q;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public ew5 o() {
        ew5 ew5Var = this.Q;
        if (ew5Var == null) {
            ew5 p = p();
            this.Q = p;
            return p;
        }
        return ew5Var;
    }

    public ew5 p() {
        Object[] array = toArray();
        fu5 fu5Var = ew5.Q;
        int length = array.length;
        return length == 0 ? fk1.T : new fk1(length, array);
    }
}