package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: su4  reason: default package */
public final class su4 extends AbstractSet {
    public final /* synthetic */ xu4 P;

    public su4(xu4 xu4Var) {
        this.P = xu4Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.P.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Map a = this.P.a();
        if (a != null) {
            return a.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int d = this.P.d(entry.getKey());
            if (d != -1) {
                Object[] objArr = this.P.S;
                objArr.getClass();
                if (dt4.l(objArr[d], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        xu4 xu4Var = this.P;
        Map a = xu4Var.a();
        return a != null ? a.entrySet().iterator() : new qu4(xu4Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        xu4 xu4Var;
        Map a = this.P.a();
        if (a != null) {
            return a.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        xu4 xu4Var2 = this.P;
        if (xu4Var2.c()) {
            return false;
        }
        int i = (1 << (xu4Var2.T & 31)) - 1;
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = this.P.P;
        obj2.getClass();
        xu4 xu4Var3 = this.P;
        int[] iArr = xu4Var3.Q;
        iArr.getClass();
        Object[] objArr = xu4Var3.R;
        objArr.getClass();
        Object[] objArr2 = xu4Var3.S;
        objArr2.getClass();
        int b = yu4.b(key, value, i, obj2, iArr, objArr, objArr2);
        if (b == -1) {
            return false;
        }
        this.P.b(b, i);
        xu4Var.U--;
        this.P.T += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.P.size();
    }
}