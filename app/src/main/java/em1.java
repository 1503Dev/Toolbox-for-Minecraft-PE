package defpackage;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: em1  reason: default package */
public final class em1 extends c06 {
    public final transient dz5 R;
    public final transient Object[] S;
    public final transient int T;

    public em1(dz5 dz5Var, Object[] objArr, int i) {
        this.R = dz5Var;
        this.S = objArr;
        this.T = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.R.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ft5
    public final int g(Object[] objArr) {
        return o().g(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return o().listIterator(0);
    }

    @Override // defpackage.c06
    public final ew5 p() {
        return new bl1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.T;
    }
}