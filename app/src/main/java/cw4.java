package defpackage;

import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: cw4  reason: default package */
public class cw4 extends yw4 {
    public final Map P;

    public cw4(Map map) {
        map.getClass();
        this.P = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.P.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.P.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.P.size();
    }
}