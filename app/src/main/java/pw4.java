package defpackage;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: pw4  reason: default package */
public final class pw4 extends sv4 {
    public final transient qv4 S;
    public final transient Object[] T;
    public final transient int U;

    public pw4(qv4 qv4Var, Object[] objArr, int i) {
        this.S = qv4Var;
        this.T = objArr;
        this.U = i;
    }

    @Override // defpackage.iv4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.S.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.iv4
    public final int g(int i, Object[] objArr) {
        return n().g(i, objArr);
    }

    @Override // defpackage.sv4, defpackage.iv4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return n().listIterator(0);
    }

    @Override // defpackage.iv4
    public final cx4 o() {
        return n().listIterator(0);
    }

    @Override // defpackage.sv4
    public final nv4 s() {
        return new ow4(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.U;
    }
}